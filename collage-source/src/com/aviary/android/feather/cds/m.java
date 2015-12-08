// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

public final class m
{
    public static final class a extends t.a
    {

        String a;
        String b;
        String c;
        int d;
        int e;
        int f;
        String g;
        n.a h;

        public static a a(Cursor cursor)
        {
            if (t.b.b(cursor))
            {
                a a1 = new a(cursor.getLong(cursor.getColumnIndex("pack_id")));
                int i = cursor.getColumnIndex("pack_identifier");
                if (i > -1)
                {
                    a1.a = cursor.getString(i);
                }
                i = cursor.getColumnIndex("pack_versionKey");
                if (i > -1)
                {
                    a1.c = cursor.getString(i);
                }
                i = cursor.getColumnIndex("pack_type");
                if (i > -1)
                {
                    a1.b = cursor.getString(i);
                }
                i = cursor.getColumnIndex("pack_markedForDeletion");
                if (i > -1)
                {
                    a1.f = cursor.getInt(i);
                }
                i = cursor.getColumnIndex("pack_visible");
                if (i > -1)
                {
                    a1.e = cursor.getInt(i);
                }
                i = cursor.getColumnIndex("pack_displayOrder");
                if (i > -1)
                {
                    a1.d = cursor.getInt(i);
                }
                i = cursor.getColumnIndex("pack_creationDate");
                if (i > -1)
                {
                    a1.g = cursor.getString(i);
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

        public void a(n.a a1)
        {
            h = a1;
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
            a1.d = d;
            a1.e = e;
            a1.g = g;
            a1.f = f;
            if (h != null)
            {
                a1.h = (n.a)h.clone();
            }
            return a1;
        }

        public int d()
        {
            return e;
        }

        public int e()
        {
            return d;
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

        public n.a f()
        {
            return h;
        }

        public String toString()
        {
            return (new StringBuilder()).append("PacksColumn.Pack{ id: ").append(s).append(", identifier: ").append(a).append(", packType: ").append(b).append(", versionKey: ").append(c).append(", markedForDeletion: ").append(f).append(", order: ").append(d).append(", visible: ").append(e).append(" }").toString();
        }

        a(long l)
        {
            super(l);
        }
    }


    public m()
    {
    }
}
