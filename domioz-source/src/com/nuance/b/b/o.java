// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


final class o extends Enum
{

    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    private static final o e[];

    private o(String s, int i)
    {
        super(s, i);
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/nuance/b/b/o, s);
    }

    public static o[] values()
    {
        return (o[])e.clone();
    }

    static 
    {
        a = new o("STOPPED", 0);
        b = new o("LISTENING", 1);
        c = new o("PROCESSING", 2);
        d = new o("CANCELLING", 3);
        e = (new o[] {
            a, b, c, d
        });
    }
}
