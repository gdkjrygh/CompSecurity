// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

// Referenced classes of package com.aviary.android.feather.cds:
//            q

public static final class <init> extends <init>
{

    String a;
    String b;
    int c;
    s d;

    public static <init> a(Cursor cursor)
    {
        if (b(cursor))
        {
            <init> <init>1 = new <init>(cursor.getLong(cursor.getColumnIndex("subscription_id")));
            int i = cursor.getColumnIndex("subscription_identifier");
            if (i > -1)
            {
                <init>1.a = cursor.getString(i);
            }
            i = cursor.getColumnIndex("subscription_version_key");
            if (i > -1)
            {
                <init>1.b = cursor.getString(i);
            }
            i = cursor.getColumnIndex("subscription_visible");
            if (i > -1)
            {
                <init>1.c = cursor.getInt(i);
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

    public String b()
    {
        return b;
    }

    public Object clone()
    {
        b b1 = new <init>(s);
        b1.a = a;
        b1.b = b;
        b1.c = c;
        if (d != null)
        {
            b1.d = (d)d.clone();
        }
        return b1;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof clone))
        {
            obj = (clone)obj;
            if (s == ((s) (obj)).s)
            {
                return true;
            }
        }
        return false;
    }

    (long l)
    {
        super(l);
    }
}
