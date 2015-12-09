// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            AbstractCachedRpcPublisher, EventBus

final class this._cls0
    implements AsyncCallback
{

    final AbstractCachedRpcPublisher this$0;

    public final void onFailure(Exception exception)
    {
        AbstractCachedRpcPublisher.access$302(AbstractCachedRpcPublisher.this, false);
        AbstractCachedRpcPublisher.access$200(AbstractCachedRpcPublisher.this).post(buildErrorEvent(exception));
    }

    public final void onSuccess(Object obj)
    {
        AbstractCachedRpcPublisher.access$302(AbstractCachedRpcPublisher.this, false);
        postAndCacheNewData(obj);
    }

    ()
    {
        this$0 = AbstractCachedRpcPublisher.this;
        super();
    }
}
