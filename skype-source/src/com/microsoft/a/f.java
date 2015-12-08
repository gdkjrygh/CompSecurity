// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a;


public final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    private static final f f[];

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/microsoft/a/f, s);
    }

    public static f[] values()
    {
        return (f[])f.clone();
    }

    static 
    {
        a = new f("TAGGED", 0);
        b = new f("CLONEABLE", 1);
        c = new f("CAN_SEEK", 2);
        d = new f("CAN_OMIT_FIELDS", 3);
        e = new f("PASS_THROUGH", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }
}
