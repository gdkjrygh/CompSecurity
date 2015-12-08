// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.h;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    private static final c c[];

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/android/slyce/h/c, s);
    }

    public static c[] values()
    {
        return (c[])c.clone();
    }

    static 
    {
        a = new c("IMAGE", 0);
        b = new c("URL", 1);
        c = (new c[] {
            a, b
        });
    }
}
