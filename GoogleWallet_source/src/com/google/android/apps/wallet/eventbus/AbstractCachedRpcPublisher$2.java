// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            AbstractCachedRpcPublisher, EventBus

final class val.originalCacheExpirationTimeMillis
    implements AsyncCallback
{

    final AbstractCachedRpcPublisher this$0;
    final long val$originalCacheExpirationTimeMillis;

    public final void onFailure(Exception exception)
    {
        if (val$originalCacheExpirationTimeMillis != AbstractCachedRpcPublisher.access$100(AbstractCachedRpcPublisher.this))
        {
            return;
        } else
        {
            AbstractCachedRpcPublisher.access$200(AbstractCachedRpcPublisher.this).post(buildErrorEvent(exception));
            return;
        }
    }

    public final void onSuccess(Object obj)
    {
        while (val$originalCacheExpirationTimeMillis != AbstractCachedRpcPublisher.access$100(AbstractCachedRpcPublisher.this) || obj == null) 
        {
            return;
        }
        AbstractCachedRpcPublisher.access$200(AbstractCachedRpcPublisher.this).post(buildEvent(obj));
    }

    ()
    {
        this$0 = final_abstractcachedrpcpublisher;
        val$originalCacheExpirationTimeMillis = J.this;
        super();
    }
}
