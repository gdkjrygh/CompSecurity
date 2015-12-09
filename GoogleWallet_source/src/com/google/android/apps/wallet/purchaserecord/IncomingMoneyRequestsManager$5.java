// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.common.cache.Cache;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            IncomingMoneyRequestsManager, IncomingMoneyRequestsEvent

final class this._cls0
    implements AsyncCallback
{

    final IncomingMoneyRequestsManager this$0;

    private void onSuccess(List list)
    {
        IncomingMoneyRequestsManager.access$300(IncomingMoneyRequestsManager.this).post(new IncomingMoneyRequestsEvent(list, null));
        cache.put(IncomingMoneyRequestsManager.access$400(), list);
    }

    public final void onFailure(Exception exception)
    {
        List list = (List)cache.getIfPresent(IncomingMoneyRequestsManager.access$400());
        IncomingMoneyRequestsManager.access$300(IncomingMoneyRequestsManager.this).post(new IncomingMoneyRequestsEvent(list, exception));
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    ()
    {
        this$0 = IncomingMoneyRequestsManager.this;
        super();
    }
}
