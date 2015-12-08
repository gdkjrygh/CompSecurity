// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycStatusPublisher

final class this._cls0
    implements AsyncCallback
{

    final KycStatusPublisher this$0;

    public final void onFailure(Exception exception)
    {
        WLog.e(KycStatusPublisher.access$200(), "Could not fetch kyc status", exception);
        KycStatusPublisher.access$300(KycStatusPublisher.this).post(new cStatusEvent(null, exception));
    }

    public final volatile void onSuccess(Object obj)
    {
    }

    cStatusEvent()
    {
        this$0 = KycStatusPublisher.this;
        super();
    }
}
