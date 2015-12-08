// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

class o
{
    static final class a extends t.a
    {

        private String a;
        private String b;

        public static a a(Cursor cursor)
        {
            if (b(cursor))
            {
                a a1 = new a(cursor.getLong(0));
                int i = cursor.getColumnIndex("perm_value");
                if (i > -1)
                {
                    a1.b = cursor.getString(i);
                }
                i = cursor.getColumnIndex("perm_hash");
                if (i > -1)
                {
                    a1.a = cursor.getString(i);
                }
                return a1;
            } else
            {
                return null;
            }
        }

        public String a()
        {
            return a;
        }

        public String b()
        {
            return b;
        }

        public Object clone()
        {
            a a1 = new a(p());
            a1.a = a;
            a1.b = b;
            return a1;
        }

        public String toString()
        {
            return (new StringBuilder()).append("PermissionColumns.Permission{").append(b).append(", ").append(a).append("}").toString();
        }

        public a(long l)
        {
            super(l);
        }
    }


    o()
    {
    }

    static final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS permission_table (perm_id INTEGER PRIMARY KEY AUTOINCREMENT, perm_value TEXT, perm_hash TEXT NOT NULL DEFAULT 0);");
        sqlitedatabase.execSQL((new StringBuilder()).append(" INSERT OR REPLACE INTO permission_table (perm_value, perm_hash) VALUES ( '").append(a.c.a.name()).append(",").append(a.c.b.name()).append("', '0' );").toString());
    }
}
