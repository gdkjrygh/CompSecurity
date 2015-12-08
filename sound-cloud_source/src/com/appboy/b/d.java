// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.b;

import bo.app.af;
import com.appboy.d.e;

public final class d extends Enum
    implements e
{

    public static final d a;
    public static final d b;
    private static final d c[];

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/appboy/b/d, s);
    }

    public static d[] values()
    {
        return (d[])c.clone();
    }

    public final String a()
    {
        switch (af.a[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "m";

        case 2: // '\002'
            return "f";
        }
    }

    public final Object forJsonPut()
    {
        return a();
    }

    static 
    {
        a = new d("MALE", 0);
        b = new d("FEMALE", 1);
        c = (new d[] {
            a, b
        });
    }
}
