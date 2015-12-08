// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

// Referenced classes of package com.aviary.android.feather.cds:
//            m

public static final class <init> extends <init>
{

    String a;
    String b;
    String c;
    int d;
    int e;
    int f;
    String g;
    e h;

    public static <init> a(Cursor cursor)
    {
        if (b(cursor))
        {
            <init> <init>1 = new <init>(cursor.getLong(cursor.getColumnIndex("pack_id")));
            int i = cursor.getColumnIndex("pack_identifier");
            if (i > -1)
            {
                <init>1.a = cursor.getString(i);
            }
            i = cursor.getColumnIndex("pack_versionKey");
            if (i > -1)
            {
                <init>1.c = cursor.getString(i);
            }
            i = cursor.getColumnIndex("pack_type");
            if (i > -1)
            {
                <init>1.b = cursor.getString(i);
            }
            i = cursor.getColumnIndex("pack_markedForDeletion");
            if (i > -1)
            {
                <init>1.f = cursor.getInt(i);
            }
            i = cursor.getColumnIndex("pack_visible");
            if (i > -1)
            {
                <init>1.e = cursor.getInt(i);
            }
            i = cursor.getColumnIndex("pack_displayOrder");
            if (i > -1)
            {
                <init>1.d = cursor.getInt(i);
            }
            i = cursor.getColumnIndex("pack_creationDate");
            if (i > -1)
            {
                <init>1.g = cursor.getString(i);
            }
            return <init>1;
        } else
        {
            return null;
        }
    }

    public String a()
    {
        return a;
    }

    public void a(a a1)
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
        c c1 = new <init>(s);
        c1.a = a;
        c1.b = b;
        c1.c = c;
        c1.d = d;
        c1.e = e;
        c1.g = g;
        c1.f = f;
        if (h != null)
        {
            c1.h = (h)h.clone();
        }
        return c1;
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
        if (obj != null && (obj instanceof d))
        {
            obj = (d)obj;
            if (s == ((s) (obj)).s)
            {
                return true;
            }
        }
        return false;
    }

    public s f()
    {
        return h;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PacksColumn.Pack{ id: ").append(s).append(", identifier: ").append(a).append(", packType: ").append(b).append(", versionKey: ").append(c).append(", markedForDeletion: ").append(f).append(", order: ").append(d).append(", visible: ").append(e).append(" }").toString();
    }

    (long l)
    {
        super(l);
    }
}
