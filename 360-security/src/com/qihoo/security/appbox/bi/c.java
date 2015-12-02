// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.bi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;

public class c extends SQLiteOpenHelper
{

    private static final String a = com/qihoo/security/appbox/bi/c.getSimpleName();
    private SQLiteDatabase b;

    public c(Context context)
    {
        super(context, "appboxbi.db", null, 1);
    }

    private boolean b()
    {
        if (b != null)
        {
            return true;
        }
        try
        {
            b = getWritableDatabase();
        }
        catch (Exception exception)
        {
            b = null;
            return false;
        }
        return true;
    }

    private void c()
    {
        if (!b())
        {
            return;
        } else
        {
            Object obj = new StringBuilder(512);
            ((StringBuilder) (obj)).append("delete from ");
            ((StringBuilder) (obj)).append("bilog");
            ((StringBuilder) (obj)).append(" where (select count(*) from ");
            ((StringBuilder) (obj)).append("bilog");
            ((StringBuilder) (obj)).append(") > ");
            ((StringBuilder) (obj)).append(999);
            ((StringBuilder) (obj)).append(" and ");
            ((StringBuilder) (obj)).append("_id");
            ((StringBuilder) (obj)).append(" in (select ");
            ((StringBuilder) (obj)).append("_id");
            ((StringBuilder) (obj)).append(" from ");
            ((StringBuilder) (obj)).append("bilog");
            ((StringBuilder) (obj)).append(" order by ");
            ((StringBuilder) (obj)).append("_id");
            ((StringBuilder) (obj)).append(" asc limit ");
            ((StringBuilder) (obj)).append(100);
            ((StringBuilder) (obj)).append(")");
            obj = ((StringBuilder) (obj)).toString();
            b.execSQL(((String) (obj)));
            return;
        }
    }

    int a(ContentValues contentvalues, String s, String as[])
    {
        if (!b())
        {
            return 0;
        } else
        {
            return b.update("bilog", contentvalues, s, as);
        }
    }

    int a(String s, String as[])
    {
        if (!b())
        {
            return 0;
        } else
        {
            return b.delete("bilog", s, as);
        }
    }

    long a(ContentValues contentvalues)
    {
        if (contentvalues == null || !b())
        {
            return 0L;
        } else
        {
            c();
            return b.insert("bilog", null, contentvalues);
        }
    }

    Cursor a(SQLiteQueryBuilder sqlitequerybuilder, String as[], String s, String as1[], String s1, String s2, String s3)
    {
        if (!b())
        {
            return null;
        } else
        {
            return sqlitequerybuilder.query(b, as, s, as1, s2, null, s1, s3);
        }
    }

    SQLiteDatabase a()
    {
        SQLiteDatabase sqlitedatabase = null;
        if (b())
        {
            sqlitedatabase = b;
        }
        return sqlitedatabase;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        StringBuilder stringbuilder = new StringBuilder(512);
        stringbuilder.append("CREATE TABLE IF NOT EXISTS ").append("bilog").append(" (").append("_id").append(" INTEGER PRIMARY KEY,").append("tp").append(" INTEGER NOT NULL DEFAULT ").append(0).append(",").append("pn").append(" TEXT,").append("ts").append(" BIGINT NOT NULL DEFAULT ").append(0L).append(",").append("rn").append(" INTEGER NOT NULL DEFAULT ").append(-1).append(",").append("r0").append(" TEXT,").append("r1").append(" INTEGER DEFAULT 0);");
        sqlitedatabase.execSQL(stringbuilder.toString());
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS bilog;");
    }

}
