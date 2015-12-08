// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycExperimentPublisher

final class this._cls0
    implements AsyncCallback
{

    final KycExperimentPublisher this$0;

    private void onSuccess(com.google.wallet.proto.api.esponse esponse)
    {
        int i;
        if (esponse != null)
        {
            i = esponse.experiment.intValue();
        } else
        {
            i = 1;
        }
        KycExperimentPublisher.access$300(KycExperimentPublisher.this, i);
        KycExperimentPublisher.access$400(KycExperimentPublisher.this).post(new cExperimentEvent(i));
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(KycExperimentPublisher.access$500(), "Could not fetch kyc experiment", exception);
        KycExperimentPublisher.access$400(KycExperimentPublisher.this).post(new cExperimentEvent(exception));
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.esponse)obj);
    }

    cExperimentEvent()
    {
        this$0 = KycExperimentPublisher.this;
        super();
    }
}
