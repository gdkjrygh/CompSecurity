// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


final class aG extends Enum
{

    public static final aG a;
    public static final aG b;
    public static final aG c;
    public static final aG d;
    public static final aG e;
    public static final aG f;
    private static final aG g[];

    private aG(String s, int i)
    {
        super(s, i);
    }

    public static aG valueOf(String s)
    {
        return (aG)Enum.valueOf(com/yume/android/sdk/aG, s);
    }

    public static aG[] values()
    {
        aG aag[] = g;
        int i = aag.length;
        aG aag1[] = new aG[i];
        System.arraycopy(aag, 0, aag1, 0, i);
        return aag1;
    }

    static 
    {
        a = new aG("NONE", 0);
        b = new aG("CREATIVE_RETRY_INTERVAL", 1);
        c = new aG("CREATIVE_RETRY_COUNT", 2);
        d = new aG("FILLED_TRACKER", 3);
        e = new aG("UNFILLED_TRACKER", 4);
        f = new aG("PF_CALLBACK_INTERVAL", 5);
        g = (new aG[] {
            a, b, c, d, e, f
        });
    }
}
