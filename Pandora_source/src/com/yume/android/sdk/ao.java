// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


final class ao extends Enum
{

    public static final ao a;
    public static final ao b;
    public static final ao c;
    public static final ao d;
    public static final ao e;
    public static final ao f;
    public static final ao g;
    public static final ao h;
    public static final ao i;
    public static final ao j;
    public static final ao k;
    public static final ao l;
    public static final ao m;
    public static final ao n;
    public static final ao o;
    private static final ao p[];

    private ao(String s, int i1)
    {
        super(s, i1);
    }

    public static ao valueOf(String s)
    {
        return (ao)Enum.valueOf(com/yume/android/sdk/ao, s);
    }

    public static ao[] values()
    {
        ao aao[] = p;
        int i1 = aao.length;
        ao aao1[] = new ao[i1];
        System.arraycopy(aao, 0, aao1, 0, i1);
        return aao1;
    }

    static 
    {
        a = new ao("NONE", 0);
        b = new ao("NAME", 1);
        c = new ao("TYPE", 2);
        d = new ao("REGION", 3);
        e = new ao("CREATIVE", 4);
        f = new ao("CLICK_ACTION", 5);
        g = new ao("CLICK_TAG", 6);
        h = new ao("CLICK_TARGET", 7);
        i = new ao("START_TIME", 8);
        j = new ao("DURATION", 9);
        k = new ao("X_DIMENSION", 10);
        l = new ao("Y_DIMENSION", 11);
        m = new ao("Z_INDEX", 12);
        n = new ao("HEIGHT", 13);
        o = new ao("WIDTH", 14);
        p = (new ao[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o
        });
    }
}
