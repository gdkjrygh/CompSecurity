// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.android.apps.wallet.config.featurecontrol.FeatureSet;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            WobsOcrClientImpl

static final class Set
{

    static final int $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureSet[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureSet = new int[FeatureSet.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureSet[FeatureSet.DEVELOPMENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureSet[FeatureSet.FISHFOOD.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureSet[FeatureSet.DOGFOOD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$config$featurecontrol$FeatureSet[FeatureSet.PRODUCTION.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
