// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;


final class N extends Enum
{

    public static final N a;
    public static final N b;
    public static final N c;
    private static final N d[];

    private N(String s, int i)
    {
        super(s, i);
    }

    public static N valueOf(String s)
    {
        return (N)Enum.valueOf(com/yume/android/player/N, s);
    }

    public static N[] values()
    {
        N an[] = d;
        int i = an.length;
        N an1[] = new N[i];
        System.arraycopy(an, 0, an1, 0, i);
        return an1;
    }

    static 
    {
        a = new N("NONE", 0);
        b = new N("IMAGE", 1);
        c = new N("VIDEO", 2);
        d = (new N[] {
            a, b, c
        });
    }
}
