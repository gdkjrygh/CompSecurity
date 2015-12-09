// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.android.apps.wallet.rpc.RpcRequestMetadataProcessor;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            AppPinToken

public class PinTokenRequestProcessor
    implements RpcRequestMetadataProcessor
{

    private final AppPinToken appPinToken;

    PinTokenRequestProcessor(AppPinToken apppintoken)
    {
        appPinToken = apppintoken;
    }

    public final void process(com.google.wallet.proto.NanoWalletTransport.RequestMetadata requestmetadata)
    {
        com.google.wallet.proto.NanoWalletEntities.PinToken pintoken = appPinToken.get();
        if (pintoken != null)
        {
            requestmetadata.pinToken = pintoken;
        }
    }
}
