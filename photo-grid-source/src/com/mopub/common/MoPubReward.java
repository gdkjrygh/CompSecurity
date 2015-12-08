// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;


public final class MoPubReward
{

    public static final int NO_REWARD_AMOUNT = -123;
    public static final String NO_REWARD_LABEL = "";
    private final boolean a;
    private final String b;
    private final int c;

    private MoPubReward(boolean flag, String s, int i)
    {
        a = flag;
        b = s;
        c = i;
    }

    public static MoPubReward failure()
    {
        return new MoPubReward(false, "", 0);
    }

    public static MoPubReward success(String s, int i)
    {
        return new MoPubReward(true, s, i);
    }

    public final int getAmount()
    {
        return c;
    }

    public final String getLabel()
    {
        return b;
    }

    public final boolean isSuccessful()
    {
        return a;
    }
}
