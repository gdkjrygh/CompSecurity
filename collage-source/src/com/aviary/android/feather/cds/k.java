// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

class k
{
    public static final class a extends t.a
    {

        String a;
        String b;
        String c;

        public static a a(Cursor cursor)
        {
            if (t.a.b(cursor))
            {
                a a1 = new a(cursor.getLong(cursor.getColumnIndex("msg_id")));
                int i = cursor.getColumnIndex("msg_type");
                if (i > -1)
                {
                    a1.a = cursor.getString(i);
                }
                i = cursor.getColumnIndex("msg_versionKey");
                if (i > -1)
                {
                    a1.b = cursor.getString(i);
                }
                i = cursor.getColumnIndex("msg_identifier");
                if (i > -1)
                {
                    a1.c = cursor.getString(i);
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

        public String c()
        {
            return c;
        }

        public Object clone()
        {
            a a1 = new a(s);
            a1.a = a;
            a1.b = b;
            a1.c = c;
            return a1;
        }

        public a(long l)
        {
            super(l);
        }
    }


    k()
    {
    }
}
