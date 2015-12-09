// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;


// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            FeatureStateEvaluator, FeatureState

static final class 
{

    static final int $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureState[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureState = new int[FeatureState.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureState[FeatureState.OFF.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureState[FeatureState.DEV.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureState[FeatureState.FISHFOOD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureState[FeatureState.DOGFOOD.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureState[FeatureState.PRODUCTION.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
