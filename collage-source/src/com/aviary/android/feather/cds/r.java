// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class r
{
    public static final class a extends t.a
    {

        final long a;
        String b;
        String c;
        String d;
        String e;
        String f;
        int g;
        int h;
        String i;

        public static a a(Cursor cursor)
        {
            if (t.b.b(cursor))
            {
                a a1 = new a(cursor.getLong(cursor.getColumnIndex("subscriptions_content_id")), cursor.getLong(cursor.getColumnIndex("subscriptions_subscription_id")));
                int j = cursor.getColumnIndex("subscriptions_content_display_name");
                if (j > -1)
                {
                    a1.b = cursor.getString(j);
                }
                j = cursor.getColumnIndex("subscriptions_content_display_description");
                if (j > -1)
                {
                    a1.c = cursor.getString(j);
                }
                j = cursor.getColumnIndex("subscriptions_content_duration_tier");
                if (j > -1)
                {
                    a1.g = cursor.getInt(j);
                }
                j = cursor.getColumnIndex("subscriptions_content_purchased");
                if (j > -1)
                {
                    a1.h = cursor.getInt(j);
                }
                j = cursor.getColumnIndex("subscriptions_content_unlock_type");
                if (j > -1)
                {
                    a1.i = cursor.getString(j);
                }
                return a1;
            } else
            {
                return null;
            }
        }

        public int a()
        {
            return h;
        }

        public String b()
        {
            return i;
        }

        public Object clone()
        {
            a a1 = new a(s, a);
            a1.b = b;
            a1.c = c;
            a1.d = d;
            a1.e = e;
            a1.f = f;
            a1.g = g;
            a1.h = h;
            a1.i = i;
            return a1;
        }

        a(long l, long l1)
        {
            super(l);
            a = l1;
        }
    }


    public r()
    {
    }

    static final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS subscriptions_content_table (subscriptions_content_id INTEGER PRIMARY KEY AUTOINCREMENT, subscriptions_subscription_id INTEGER NOT NULL, subscriptions_content_display_name VARCHAR(255) NOT NULL, subscriptions_content_display_description VARCHAR(255) NOT NULL, subscriptions_content_duration_tier INTEGER NOT NULL, subscriptions_content_purchased INTEGER NOT NULL DEFAULT 0, subscriptions_content_unlock_type VARCHAR(255) NOT NULL, FOREIGN KEY(subscriptions_subscription_id) REFERENCES subscription_table(subscription_id) ON DELETE CASCADE);");
    }
}
