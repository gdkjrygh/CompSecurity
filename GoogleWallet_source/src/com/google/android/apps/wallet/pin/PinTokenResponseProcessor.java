// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.app.Activity;
import com.google.android.apps.wallet.pin.api.PinApi;
import com.google.android.apps.wallet.util.proto.Protos;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            CloudPinManager

public class PinTokenResponseProcessor
{

    private final CloudPinManager cloudPinManager;

    PinTokenResponseProcessor(CloudPinManager cloudpinmanager)
    {
        cloudPinManager = cloudpinmanager;
    }

    public final void process(com.google.wallet.proto.NanoWalletTransport.ResponseMetadata.RejectedRequestInfo rejectedrequestinfo, Activity activity)
    {
        if (Protos.valuesEqual(rejectedrequestinfo.reason, 5))
        {
            cloudPinManager.expirePin();
            PinApi.startVerifyPinActivityForResult(activity, 0);
        }
    }
}
