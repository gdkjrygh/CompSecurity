// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


public final class ah extends Enum
{

    public static final ah a;
    public static final ah b;
    public static final ah c;
    public static final ah d;
    private static final ah e[];

    private ah(String s, int i)
    {
        super(s, i);
    }

    public static ah valueOf(String s)
    {
        return (ah)Enum.valueOf(com/nuance/b/a/ah, s);
    }

    public static ah[] values()
    {
        return (ah[])e.clone();
    }

    static 
    {
        a = new ah("CANCEL", 0);
        b = new ah("HELP", 1);
        c = new ah("REPEAT", 2);
        d = new ah("RESET", 3);
        e = (new ah[] {
            a, b, c, d
        });
    }
}
