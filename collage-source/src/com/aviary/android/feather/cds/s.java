// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;
import android.provider.BaseColumns;

public class s
    implements BaseColumns
{
    public static final class a
    {

        private final long a;
        private String b;
        private String c;
        private String d;
        private int e;
        private String f;
        private String g;
        private boolean h;

        public static a a(Cursor cursor)
        {
            boolean flag = true;
            if (t.b.b(cursor))
            {
                a a1 = new a(cursor.getLong(cursor.getColumnIndex("_id")));
                int i = cursor.getColumnIndex("displayName");
                if (i > -1)
                {
                    a1.c = cursor.getString(i);
                }
                i = cursor.getColumnIndex("identifier");
                if (i > -1)
                {
                    a1.b = cursor.getString(i);
                }
                i = cursor.getColumnIndex("type");
                if (i > -1)
                {
                    a1.e = cursor.getInt(i);
                }
                i = cursor.getColumnIndex("path");
                if (i > -1)
                {
                    a1.f = cursor.getString(i);
                }
                i = cursor.getColumnIndex("packagename");
                if (i > -1)
                {
                    a1.d = cursor.getString(i);
                }
                i = cursor.getColumnIndex("installDate");
                if (i > -1)
                {
                    a1.g = cursor.getString(i);
                }
                i = cursor.getColumnIndex("isFree");
                if (i > -1)
                {
                    if (cursor.getInt(i) != 1)
                    {
                        flag = false;
                    }
                    a1.h = flag;
                }
                return a1;
            } else
            {
                return null;
            }
        }

        public long a()
        {
            return a;
        }

        public String b()
        {
            return b;
        }

        public String c()
        {
            return f;
        }

        public String d()
        {
            return d;
        }

        a(long l)
        {
            a = l;
        }
    }


    public s()
    {
    }
}
