// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm;

import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.orm:
//            SugarRecord

public class QueryBuilder
{

    public QueryBuilder()
    {
    }

    public static String getColumnType(Class class1)
    {
        if (class1.equals(java/lang/Boolean) || class1.equals(Boolean.TYPE) || class1.equals(java/util/Date) || class1.equals(java/util/Calendar) || class1.equals(java/sql/Date) || class1.equals(java/lang/Integer) || class1.equals(Integer.TYPE) || class1.equals(java/lang/Long) || class1.equals(Long.TYPE) || !class1.isPrimitive() && com/orm/SugarRecord.isAssignableFrom(class1))
        {
            return "INTEGER";
        }
        if (class1.getName().equals("[B"))
        {
            return "BLOB";
        }
        if (class1.equals(java/lang/Double) || class1.equals(Double.TYPE) || class1.equals(java/lang/Float) || class1.equals(Float.TYPE))
        {
            return "FLOAT";
        }
        if (class1.equals(java/lang/String) || class1.equals(Character.TYPE))
        {
            return "TEXT";
        } else
        {
            return "";
        }
    }
}
