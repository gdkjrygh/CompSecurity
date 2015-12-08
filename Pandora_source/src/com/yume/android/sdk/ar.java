// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


final class ar extends Enum
{

    public static final ar a;
    public static final ar b;
    public static final ar c;
    private static final ar d[];

    private ar(String s, int i)
    {
        super(s, i);
    }

    public static ar valueOf(String s)
    {
        return (ar)Enum.valueOf(com/yume/android/sdk/ar, s);
    }

    public static ar[] values()
    {
        ar aar[] = d;
        int i = aar.length;
        ar aar1[] = new ar[i];
        System.arraycopy(aar, 0, aar1, 0, i);
        return aar1;
    }

    static 
    {
        a = new ar("NONE", 0);
        b = new ar("IMAGE", 1);
        c = new ar("VIDEO", 2);
        d = (new ar[] {
            a, b, c
        });
    }
}
