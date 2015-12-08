// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tjeannin.provigen.helper;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tjeannin.provigen.model.Contract;
import com.tjeannin.provigen.model.ContractField;
import java.util.Iterator;
import java.util.List;

public class TableUpdater
{

    public TableUpdater()
    {
    }

    public static void addMissingColumns(SQLiteDatabase sqlitedatabase, Class class1)
    {
        class1 = new Contract(class1);
        Cursor cursor = sqlitedatabase.rawQuery((new StringBuilder()).append("PRAGMA table_info(").append(class1.getTable()).append(")").toString(), null);
        Iterator iterator = class1.getFields().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ContractField contractfield = (ContractField)iterator.next();
            if (!fieldExistAsColumn(contractfield.name, cursor))
            {
                sqlitedatabase.execSQL((new StringBuilder()).append("ALTER TABLE ").append(class1.getTable()).append(" ADD COLUMN ").append(contractfield.name).append(" ").append(contractfield.type).append(";").toString());
            }
        } while (true);
    }

    private static boolean fieldExistAsColumn(String s, Cursor cursor)
    {
        if (cursor.moveToFirst())
        {
            do
            {
                if (s.equals(cursor.getString(1)))
                {
                    return true;
                }
            } while (cursor.moveToNext());
        }
        return false;
    }
}
