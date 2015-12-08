// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;


public final class w extends Enum
{

    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;
    private static final w e[];

    private w(String s, int i)
    {
        super(s, i);
    }

    public static w valueOf(String s)
    {
        return (w)Enum.valueOf(com/nuance/b/e/w, s);
    }

    public static w[] values()
    {
        return (w[])e.clone();
    }

    static 
    {
        a = new w("STOPPED", 0);
        b = new w("STARTING", 1);
        c = new w("RUNNING", 2);
        d = new w("STOPPING", 3);
        e = (new w[] {
            a, b, c, d
        });
    }
}
