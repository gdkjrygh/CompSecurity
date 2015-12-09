// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.common.cache.Cache;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimablePurchaseRecordEventPublisher, ClaimablePurchaseRecordEvent

final class this._cls0
    implements AsyncCallback
{

    final ClaimablePurchaseRecordEventPublisher this$0;

    private void onSuccess(List list)
    {
        list = new ClaimablePurchaseRecordEvent(list, null);
        ClaimablePurchaseRecordEventPublisher.access$400(ClaimablePurchaseRecordEventPublisher.this).put(ClaimablePurchaseRecordEventPublisher.access$300(), list);
        ClaimablePurchaseRecordEventPublisher.access$500(ClaimablePurchaseRecordEventPublisher.this).post(list);
    }

    public final void onFailure(Exception exception)
    {
        ClaimablePurchaseRecordEventPublisher.access$500(ClaimablePurchaseRecordEventPublisher.this).post(new ClaimablePurchaseRecordEvent(null, exception));
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    ()
    {
        this$0 = ClaimablePurchaseRecordEventPublisher.this;
        super();
    }
}
