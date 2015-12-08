// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeTransitionEffect extends Enum
{

    public static final YuMeTransitionEffect FLIP;
    public static final YuMeTransitionEffect NONE;
    private static final YuMeTransitionEffect a[];

    private YuMeTransitionEffect(String s, int i)
    {
        super(s, i);
    }

    public static YuMeTransitionEffect valueOf(String s)
    {
        return (YuMeTransitionEffect)Enum.valueOf(com/yume/android/sdk/YuMeTransitionEffect, s);
    }

    public static YuMeTransitionEffect[] values()
    {
        YuMeTransitionEffect ayumetransitioneffect[] = a;
        int i = ayumetransitioneffect.length;
        YuMeTransitionEffect ayumetransitioneffect1[] = new YuMeTransitionEffect[i];
        System.arraycopy(ayumetransitioneffect, 0, ayumetransitioneffect1, 0, i);
        return ayumetransitioneffect1;
    }

    static 
    {
        NONE = new YuMeTransitionEffect("NONE", 0);
        FLIP = new YuMeTransitionEffect("FLIP", 1);
        a = (new YuMeTransitionEffect[] {
            NONE, FLIP
        });
    }
}
