// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage.provider;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SCQueryBuilder
{

    private static final Pattern LIMIT_PATTERN = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private static final String TAG = "SQLiteQueryBuilder";
    private boolean distinct;
    private android.database.sqlite.SQLiteDatabase.CursorFactory factory;
    private Map projectionMap;
    private boolean strict;
    private String tables;
    private StringBuilder whereClause;

    public SCQueryBuilder()
    {
        projectionMap = null;
        tables = "";
        whereClause = null;
        distinct = false;
        factory = null;
    }

    private static void appendClause(StringBuilder stringbuilder, String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(s);
            stringbuilder.append(s1);
        }
    }

    public static void appendColumns(StringBuilder stringbuilder, String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (s == null)
            {
                continue;
            }
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(s);
        }

        stringbuilder.append(' ');
    }

    public static String buildQueryString(boolean flag, String s, String as[], String s1, String s2, String s3, String s4, String s5)
    {
        if (TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3))
        {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        if (!TextUtils.isEmpty(s5) && !LIMIT_PATTERN.matcher(s5).matches())
        {
            throw new IllegalArgumentException((new StringBuilder("invalid LIMIT clauses:")).append(s5).toString());
        }
        StringBuilder stringbuilder = new StringBuilder(120);
        stringbuilder.append("SELECT ");
        if (flag)
        {
            stringbuilder.append("DISTINCT ");
        }
        if (as != null && as.length != 0)
        {
            appendColumns(stringbuilder, as);
        } else
        {
            stringbuilder.append("* ");
        }
        stringbuilder.append("FROM ").append(s);
        appendClause(stringbuilder, " WHERE ", s1);
        appendClause(stringbuilder, " GROUP BY ", s2);
        appendClause(stringbuilder, " HAVING ", s3);
        appendClause(stringbuilder, " ORDER BY ", s4);
        appendClause(stringbuilder, " LIMIT ", s5);
        return stringbuilder.toString();
    }

    private String[] computeProjection(String as[])
    {
        if (as == null || as.length <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = as;
        if (projectionMap != null)
        {
            obj = new String[as.length];
            int k = as.length;
            int i = 0;
            while (i < k) 
            {
                String s = as[i];
                String s1 = (String)projectionMap.get(s);
                if (s1 != null)
                {
                    obj[i] = s1;
                } else
                if (!strict && (s.contains(" AS ") || s.contains(" as ")))
                {
                    obj[i] = s;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder("Invalid column ")).append(as[i]).toString());
                }
                i++;
            }
        }
_L4:
        return ((String []) (obj));
_L2:
label0:
        {
            if (projectionMap == null)
            {
                break label0;
            }
            obj = projectionMap.entrySet();
            as = new String[((Set) (obj)).size()];
            Iterator iterator = ((Set) (obj)).iterator();
            int j = 0;
            do
            {
                obj = as;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (java.util.Map.Entry)iterator.next();
                if (!((String)((java.util.Map.Entry) (obj)).getKey()).equals("_count"))
                {
                    as[j] = (String)((java.util.Map.Entry) (obj)).getValue();
                    j++;
                }
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    private void validateSql(SQLiteDatabase sqlitedatabase, String s)
    {
    }

    public void appendWhere(CharSequence charsequence)
    {
        if (whereClause == null)
        {
            whereClause = new StringBuilder(charsequence.length() + 16);
        }
        if (whereClause.length() == 0)
        {
            whereClause.append('(');
        }
        whereClause.append(charsequence);
    }

    public String buildQuery(String as[], String s, String s1, String s2, String s3, String s4)
    {
        as = computeProjection(as);
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag;
        if (whereClause != null && whereClause.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder.append(whereClause.toString());
            stringbuilder.append(')');
        }
        if (s != null && s.length() > 0)
        {
            if (flag)
            {
                stringbuilder.append(" AND ");
            }
            stringbuilder.append('(');
            stringbuilder.append(s);
            stringbuilder.append(')');
        }
        return buildQueryString(distinct, tables, as, stringbuilder.toString(), s1, s2, s3, s4);
    }

    public String buildQuery(String as[], String s, String as1[], String s1, String s2, String s3, String s4)
    {
        return buildQuery(as, s, s1, s2, s3, s4);
    }

    public String getTables()
    {
        return tables;
    }

    public Cursor query(SQLiteDatabase sqlitedatabase, String as[], String s, String as1[], String s1, String s2, String s3)
    {
        return query(sqlitedatabase, as, s, as1, s1, s2, s3, null);
    }

    public Cursor query(SQLiteDatabase sqlitedatabase, String as[], String s, String as1[], String s1, String s2, String s3, 
            String s4)
    {
        if (tables == null)
        {
            return null;
        }
        if (strict && s != null && s.length() > 0)
        {
            validateSql(sqlitedatabase, buildQuery(as, (new StringBuilder("(")).append(s).append(")").toString(), s1, s2, s3, s4));
        }
        as = buildQuery(as, s, s1, s2, s3, s4);
        Log.isLoggable("SQLiteQueryBuilder", 3);
        return sqlitedatabase.rawQueryWithFactory(factory, as, as1, SQLiteDatabase.findEditTable(tables));
    }

    public void setTables(String s)
    {
        tables = s;
    }

}
