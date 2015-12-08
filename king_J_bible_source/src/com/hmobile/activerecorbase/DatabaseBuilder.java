// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.activerecorbase;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.hmobile.activerecorbase:
//            CamelNotationHelper, ActiveRecordException, ActiveRecordBase, Database

public class DatabaseBuilder
{

    String _dbName;
    Map classes;

    public DatabaseBuilder(String s)
    {
        classes = new HashMap();
        _dbName = s;
    }

    private Class getClassBySqlName(String s)
    {
        s = CamelNotationHelper.toJavaClassName(s);
        return (Class)classes.get(s);
    }

    public void addClass(Class class1)
    {
        classes.put(class1.getSimpleName(), class1);
    }

    public String getDatabaseName()
    {
        return _dbName;
    }

    public String getSQLCreate(String s)
        throws ActiveRecordException
    {
        StringBuilder stringbuilder;
        stringbuilder = null;
        Class class1 = getClassBySqlName(s);
        ActiveRecordBase activerecordbase;
        try
        {
            activerecordbase = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ActiveRecordException(s.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ActiveRecordException(s.getLocalizedMessage());
        }
        if (class1 == null) goto _L2; else goto _L1
_L1:
        stringbuilder = (new StringBuilder("CREATE TABLE ")).append(s).append(" (_id integer primary key");
        s = activerecordbase.getColumnFieldsWithoutID().iterator();
_L6:
        if (s.hasNext()) goto _L4; else goto _L3
_L3:
        stringbuilder.append(")");
_L2:
        return stringbuilder.toString();
_L4:
        Object obj = (Field)s.next();
        String s1 = CamelNotationHelper.toSQLName(((Field) (obj)).getName());
        obj = Database.getSQLiteTypeString(((Field) (obj)).getType());
        stringbuilder.append(", ").append(s1).append(" ").append(((String) (obj)));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public String getSQLDrop(String s)
    {
        return (new StringBuilder("DROP TABLE IF EXISTS ")).append(s).toString();
    }

    public String[] getTables()
    {
        String as[] = new String[classes.size()];
        Class aclass[] = new Class[classes.size()];
        aclass = (Class[])classes.values().toArray(aclass);
        int i = 0;
        do
        {
            if (i >= aclass.length)
            {
                return as;
            }
            as[i] = CamelNotationHelper.toSQLName(aclass[i].getSimpleName());
            i++;
        } while (true);
    }
}
