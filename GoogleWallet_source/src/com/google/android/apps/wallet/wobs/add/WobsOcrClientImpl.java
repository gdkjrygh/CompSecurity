// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.android.apps.wallet.config.featurecontrol.FeatureSet;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import java.io.IOException;

public class WobsOcrClientImpl
    implements com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.api.WobsOcrClientAdapter.WalletOcrRecognize
{

    private final FeatureSet featureSet;
    private final RpcCaller rpcCaller;

    WobsOcrClientImpl(RpcCaller rpccaller, FeatureSet featureset)
    {
        rpcCaller = rpccaller;
        featureSet = featureset;
    }

    public final com.google.wallet.proto.api.NanoWalletOcr.WobsOcrResponse recognize(com.google.wallet.proto.api.NanoWalletOcr.WobsOcrRequest wobsocrrequest)
        throws IOException
    {
        if (wobsocrrequest.debugParameters == null)
        {
            wobsocrrequest.debugParameters = new com.google.wallet.proto.api.NanoWalletOcr.DebugParameters();
        }
        static final class _cls1
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

        _cls1..SwitchMap.com.google.android.apps.wallet.config.featurecontrol.FeatureSet[featureSet.ordinal()];
        JVM INSTR tableswitch 1 3: default 128
    //                   1 90
    //                   2 114
    //                   3 114;
           goto _L1 _L2 _L3 _L3
_L3:
        break MISSING_BLOCK_LABEL_114;
_L1:
        wobsocrrequest.debugParameters.featureLevel = Integer.valueOf(3);
_L4:
        return (com.google.wallet.proto.api.NanoWalletOcr.WobsOcrResponse)rpcCaller.call("b/ocr/recognize", wobsocrrequest, new com.google.wallet.proto.api.NanoWalletOcr.WobsOcrResponse());
_L2:
        wobsocrrequest.debugParameters.featureLevel = Integer.valueOf(1);
          goto _L4
        try
        {
            wobsocrrequest.debugParameters.featureLevel = Integer.valueOf(2);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.wallet.proto.api.NanoWalletOcr.WobsOcrRequest wobsocrrequest)
        {
            throw new IOException(wobsocrrequest);
        }
          goto _L4
    }
}
