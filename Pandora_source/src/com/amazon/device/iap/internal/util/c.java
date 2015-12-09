// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.util;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    private int d;

    private c(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static c[] a()
    {
        return (c[])e.clone();
    }

    static 
    {
        a = new c("LEGACY", 0, 0);
        b = new c("V1", 1, 1);
        c = new c("V2", 2, 2);
        e = (new c[] {
            a, b, c
        });
    }
}
