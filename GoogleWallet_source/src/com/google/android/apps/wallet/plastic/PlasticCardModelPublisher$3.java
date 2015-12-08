// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;


// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

final class asticCardResponse
    implements Runnable
{

    final PlasticCardModelPublisher this$0;
    final com.google.wallet.proto.api..ActivatePlasticCardResponse val$response;

    public final void run()
    {
        PlasticCardModelPublisher.access$400(PlasticCardModelPublisher.this, val$response.frontingInstrumentInfo);
    }

    asticCardResponse()
    {
        this$0 = final_plasticcardmodelpublisher;
        val$response = com.google.wallet.proto.api..ActivatePlasticCardResponse.this;
        super();
    }
}
