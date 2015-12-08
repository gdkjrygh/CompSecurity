// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            AbstractCachedRpcPublisher, RpcCache

final class val.data
    implements Callable
{

    final AbstractCachedRpcPublisher this$0;
    final Object val$data;

    private Void call()
    {
        AbstractCachedRpcPublisher.access$000(AbstractCachedRpcPublisher.this).writeToCache(val$data);
        afterWriteToCache();
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_abstractcachedrpcpublisher;
        val$data = Object.this;
        super();
    }
}
