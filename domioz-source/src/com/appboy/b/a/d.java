// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.b.a;


public final class d extends Enum
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
        return (d)Enum.valueOf(com/appboy/b/a/d, s);
    }

    public static d[] values()
    {
        return (d[])c.clone();
    }

    static 
    {
        a = new d("TOP", 0);
        b = new d("BOTTOM", 1);
        c = (new d[] {
            a, b
        });
    }
}
