// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class q
{
    public static final class a extends t.a
    {

        String a;
        String b;
        int c;
        r.a d;

        public static a a(Cursor cursor)
        {
            if (t.b.b(cursor))
            {
                a a1 = new a(cursor.getLong(cursor.getColumnIndex("subscription_id")));
                int i = cursor.getColumnIndex("subscription_identifier");
                if (i > -1)
                {
                    a1.a = cursor.getString(i);
                }
                i = cursor.getColumnIndex("subscription_version_key");
                if (i > -1)
                {
                    a1.b = cursor.getString(i);
                }
                i = cursor.getColumnIndex("subscription_visible");
                if (i > -1)
                {
                    a1.c = cursor.getInt(i);
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
            a a1 = new a(s);
            a1.a = a;
            a1.b = b;
            a1.c = c;
            if (d != null)
            {
                a1.d = (r.a)d.clone();
            }
            return a1;
        }

        public boolean equals(Object obj)
        {
            if (obj != null && (obj instanceof a))
            {
                obj = (a)obj;
                if (s == ((a) (obj)).s)
                {
                    return true;
                }
            }
            return false;
        }

        a(long l)
        {
            super(l);
        }
    }


    public q()
    {
    }

    static final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS subscription_table (subscription_id INTEGER PRIMARY KEY AUTOINCREMENT, subscription_version_key VARCHAR(255) NOT NULL, subscription_visible INTEGER NOT NULL DEFAULT 1, subscription_identifier VARCHAR(255) NOT NULL UNIQUE);");
    }
}
