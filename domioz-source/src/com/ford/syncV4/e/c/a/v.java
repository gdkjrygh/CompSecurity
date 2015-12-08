// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class v extends Enum
{

    public static final v a;
    public static final v b;
    public static final v c;
    private static final v d[];

    private v(String s, int i)
    {
        super(s, i);
    }

    public static v valueOf(String s)
    {
        return (v)Enum.valueOf(com/ford/syncV4/e/c/a/v, s);
    }

    public static v[] values()
    {
        return (v[])d.clone();
    }

    static 
    {
        a = new v("LEFT_ALIGNED", 0);
        b = new v("RIGHT_ALIGNED", 1);
        c = new v("CENTERED", 2);
        d = (new v[] {
            a, b, c
        });
    }
}
