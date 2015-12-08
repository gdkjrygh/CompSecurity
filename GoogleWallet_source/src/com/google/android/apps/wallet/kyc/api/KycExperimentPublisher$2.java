// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycExperimentPublisher

final class this._cls0
    implements EventHandler
{

    final KycExperimentPublisher this$0;

    private void handleEvent(RequestRefreshEvent requestrefreshevent)
    {
        KycExperimentPublisher.access$000(KycExperimentPublisher.this);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((RequestRefreshEvent)obj);
    }

    ()
    {
        this$0 = KycExperimentPublisher.this;
        super();
    }
}
