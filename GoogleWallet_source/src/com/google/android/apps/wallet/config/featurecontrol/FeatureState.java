// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;


public final class FeatureState extends Enum
{

    private static final FeatureState $VALUES[];
    public static final FeatureState DEV;
    public static final FeatureState DOGFOOD;
    public static final FeatureState FISHFOOD;
    public static final FeatureState OFF;
    public static final FeatureState PRODUCTION;

    private FeatureState(String s, int i)
    {
        super(s, i);
    }

    public static FeatureState valueOf(String s)
    {
        return (FeatureState)Enum.valueOf(com/google/android/apps/wallet/config/featurecontrol/FeatureState, s);
    }

    public static FeatureState[] values()
    {
        return (FeatureState[])$VALUES.clone();
    }

    static 
    {
        OFF = new FeatureState("OFF", 0);
        DEV = new FeatureState("DEV", 1);
        FISHFOOD = new FeatureState("FISHFOOD", 2);
        DOGFOOD = new FeatureState("DOGFOOD", 3);
        PRODUCTION = new FeatureState("PRODUCTION", 4);
        $VALUES = (new FeatureState[] {
            OFF, DEV, FISHFOOD, DOGFOOD, PRODUCTION
        });
    }
}
