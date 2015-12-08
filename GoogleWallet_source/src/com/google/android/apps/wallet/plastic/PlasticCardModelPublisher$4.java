// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.eventbus.EventBus;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

final class val.frontingInstrumentInfo
    implements Runnable
{

    final PlasticCardModelPublisher this$0;
    final com.google.wallet.proto.nstrumentInfo val$frontingInstrumentInfo;

    public final void run()
    {
        com.google.android.apps.wallet.plastic.api.PlasticCardModelEvent plasticcardmodelevent = PlasticCardModelPublisher.access$500(PlasticCardModelPublisher.this, val$frontingInstrumentInfo);
        PlasticCardModelPublisher.access$200(PlasticCardModelPublisher.this).post(plasticcardmodelevent);
    }

    ()
    {
        this$0 = final_plasticcardmodelpublisher;
        val$frontingInstrumentInfo = com.google.wallet.proto.nstrumentInfo.this;
        super();
    }
}
