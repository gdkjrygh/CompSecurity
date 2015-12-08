// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;


public final class FeatureSet extends Enum
{

    private static final FeatureSet $VALUES[];
    public static final FeatureSet DEVELOPMENT;
    public static final FeatureSet DOGFOOD;
    public static final FeatureSet FISHFOOD;
    public static final FeatureSet PRODUCTION;

    private FeatureSet(String s, int i)
    {
        super(s, i);
    }

    public static FeatureSet valueOf(String s)
    {
        return (FeatureSet)Enum.valueOf(com/google/android/apps/wallet/config/featurecontrol/FeatureSet, s);
    }

    public static FeatureSet[] values()
    {
        return (FeatureSet[])$VALUES.clone();
    }

    static 
    {
        DEVELOPMENT = new FeatureSet("DEVELOPMENT", 0);
        FISHFOOD = new FeatureSet("FISHFOOD", 1);
        DOGFOOD = new FeatureSet("DOGFOOD", 2);
        PRODUCTION = new FeatureSet("PRODUCTION", 3);
        $VALUES = (new FeatureSet[] {
            DEVELOPMENT, FISHFOOD, DOGFOOD, PRODUCTION
        });
    }
}
