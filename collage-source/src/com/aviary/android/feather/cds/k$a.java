// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

// Referenced classes of package com.aviary.android.feather.cds:
//            k

public static final class <init> extends <init>
{

    String a;
    String b;
    String c;

    public static <init> a(Cursor cursor)
    {
        if (b(cursor))
        {
            <init> <init>1 = new <init>(cursor.getLong(cursor.getColumnIndex("msg_id")));
            int i = cursor.getColumnIndex("msg_type");
            if (i > -1)
            {
                <init>1.a = cursor.getString(i);
            }
            i = cursor.getColumnIndex("msg_versionKey");
            if (i > -1)
            {
                <init>1.b = cursor.getString(i);
            }
            i = cursor.getColumnIndex("msg_identifier");
            if (i > -1)
            {
                <init>1.c = cursor.getString(i);
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
        return c1;
    }

    public (long l)
    {
        super(l);
    }
}
