// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


public final class x extends Enum
{

    public static final x a;
    public static final x b;
    public static final x c;
    public static final x d;
    private static final x e[];

    private x(String s, int i)
    {
        super(s, i);
    }

    public static x valueOf(String s)
    {
        return (x)Enum.valueOf(com/nuance/b/a/x, s);
    }

    public static x[] values()
    {
        return (x[])e.clone();
    }

    static 
    {
        a = new x("EXPLICIT", 0);
        b = new x("IMPLICIT", 1);
        c = new x("OPTIONAL", 2);
        d = new x("NONE", 3);
        e = (new x[] {
            a, b, c, d
        });
    }
}
