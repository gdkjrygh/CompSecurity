// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


final class at extends Enum
{

    public static final at a;
    public static final at b;
    public static final at c;
    public static final at d;
    public static final at e;
    public static final at f;
    public static final at g;
    public static final at h;
    private static final at i[];

    private at(String s, int j)
    {
        super(s, j);
    }

    public static at valueOf(String s)
    {
        return (at)Enum.valueOf(com/yume/android/sdk/at, s);
    }

    public static at[] values()
    {
        at aat[] = i;
        int j = aat.length;
        at aat1[] = new at[j];
        System.arraycopy(aat, 0, aat1, 0, j);
        return aat1;
    }

    static 
    {
        a = new at("NONE", 0);
        b = new at("DURATION", 1);
        c = new at("CB_ACTIVE_TIME", 2);
        d = new at("USER_ACTION", 3);
        e = new at("CLICK_ACTION", 4);
        f = new at("URLS", 5);
        g = new at("SLATE_ELEMENTS", 6);
        h = new at("TRACKING", 7);
        i = (new at[] {
            a, b, c, d, e, f, g, h
        });
    }
}
