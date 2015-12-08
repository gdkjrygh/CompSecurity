// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


final class s extends Enum
{

    public static final s a;
    public static final s b;
    private static final s c[];

    private s(String s1, int i)
    {
        super(s1, i);
    }

    public static s valueOf(String s1)
    {
        return (s)Enum.valueOf(com/amazon/device/associates/s, s1);
    }

    public static s[] values()
    {
        return (s[])c.clone();
    }

    static 
    {
        a = new s("GET", 0);
        b = new s("POST", 1);
        c = (new s[] {
            a, b
        });
    }
}
