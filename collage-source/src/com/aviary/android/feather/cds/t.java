// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

final class t
{
    public static abstract class a
        implements Cloneable
    {

        protected final long s;

        public static final boolean b(Cursor cursor)
        {
            return cursor != null && !cursor.isAfterLast() && !cursor.isBeforeFirst();
        }

        public abstract Object clone();

        public final long p()
        {
            return s;
        }

        public a(long l)
        {
            s = l;
        }
    }

    public static class b extends a
    {

        private String a;
        private String b;

        public static b a(Cursor cursor)
        {
            if (b(cursor))
            {
                b b1 = new b(cursor.getLong(cursor.getColumnIndex("version_id")));
                int i = cursor.getColumnIndex("version_versionKey");
                if (i > -1)
                {
                    b1.a = cursor.getString(i);
                }
                i = cursor.getColumnIndex("version_assetsBaseURL");
                if (i > -1)
                {
                    b1.b = cursor.getString(i);
                }
                return b1;
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
            b b1 = new b(s);
            b1.b = b;
            b1.a = a;
            return b1;
        }

        public String toString()
        {
            return (new StringBuilder()).append("VersionColumns.Version{ id: ").append(s).append(", versionKey: ").append(a).append(", assetsBaseURL: ").append(b).append(" }").toString();
        }

        public b(long l)
        {
            super(l);
        }
    }


    t()
    {
    }
}
