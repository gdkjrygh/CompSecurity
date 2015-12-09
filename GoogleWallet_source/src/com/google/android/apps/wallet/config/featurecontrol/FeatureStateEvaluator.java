// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;


// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            FeatureState, FeatureSet

public class FeatureStateEvaluator
{

    private final FeatureSet featureSet;

    public FeatureStateEvaluator(FeatureSet featureset)
    {
        featureSet = featureset;
    }

    public final boolean isEnabled(FeatureState featurestate)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        static final class _cls1
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

        _cls1..SwitchMap.com.google.android.apps.wallet.config.featurecontrol.FeatureState[featurestate.ordinal()];
        JVM INSTR tableswitch 1 5: default 48
    //                   1 104
    //                   2 90
    //                   3 106
    //                   4 130
    //                   5 164;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        break MISSING_BLOCK_LABEL_104;
_L1:
        featurestate = String.valueOf(featurestate);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(featurestate).length() + 34)).append("No behavior for new feature state ").append(featurestate).toString());
_L3:
        flag = flag1;
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            flag = true;
        }
_L8:
        return flag;
_L4:
        if (featureSet == FeatureSet.FISHFOOD)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (featureSet != FeatureSet.DEVELOPMENT) goto _L8; else goto _L7
_L7:
        return true;
_L5:
        if (featureSet == FeatureSet.FISHFOOD || featureSet == FeatureSet.DEVELOPMENT)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (featureSet != FeatureSet.DOGFOOD) goto _L8; else goto _L9
_L9:
        return true;
_L6:
        return true;
    }
}
