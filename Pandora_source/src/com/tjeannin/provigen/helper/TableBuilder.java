// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tjeannin.provigen.helper;

import android.database.sqlite.SQLiteDatabase;
import com.tjeannin.provigen.model.Constraint;
import com.tjeannin.provigen.model.Contract;
import com.tjeannin.provigen.model.ContractField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TableBuilder
{

    private List constraints;
    private Contract contract;

    public TableBuilder(Class class1)
    {
        contract = new Contract(class1);
        constraints = new ArrayList();
    }

    public TableBuilder addConstraint(String s, String s1, String s2)
    {
        constraints.add(new Constraint(s, s1, s2));
        return this;
    }

    public void createTable(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(getSQL());
    }

    public String getSQL()
    {
        StringBuilder stringbuilder = new StringBuilder("CREATE TABLE ");
        stringbuilder.append(contract.getTable()).append(" ( ");
label0:
        for (Iterator iterator = contract.getFields().iterator(); iterator.hasNext(); stringbuilder.append(", "))
        {
            ContractField contractfield = (ContractField)iterator.next();
            stringbuilder.append(" ").append(contractfield.name).append(" ").append(contractfield.type);
            if (contractfield.name.equals(contract.getIdField()))
            {
                stringbuilder.append(" PRIMARY KEY AUTOINCREMENT ");
            }
            Iterator iterator1 = constraints.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    continue label0;
                }
                Constraint constraint = (Constraint)iterator1.next();
                if (constraint.targetColumn.equals(contractfield.name))
                {
                    stringbuilder.append(" ").append(constraint.type).append(" ON CONFLICT ").append(constraint.conflictClause);
                }
            } while (true);
        }

        stringbuilder.deleteCharAt(stringbuilder.length() - 2);
        stringbuilder.append(" ) ");
        return stringbuilder.toString();
    }
}
