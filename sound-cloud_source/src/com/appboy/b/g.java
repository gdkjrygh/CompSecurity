// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.b;

import bo.app.al;
import com.appboy.d.e;

public final class g extends Enum
    implements e
{

    public static final g a;
    public static final g b;
    public static final g c;
    private static final g d[];

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/appboy/b/g, s);
    }

    public static g[] values()
    {
        return (g[])d.clone();
    }

    public final Object forJsonPut()
    {
        switch (al.a[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "fb";

        case 2: // '\002'
            return "tw";

        case 3: // '\003'
            return "g";
        }
    }

    static 
    {
        a = new g("FACEBOOK", 0);
        b = new g("TWITTER", 1);
        c = new g("GOOGLE", 2);
        d = (new g[] {
            a, b, c
        });
    }
}
