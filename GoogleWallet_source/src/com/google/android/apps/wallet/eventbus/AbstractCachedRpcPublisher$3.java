// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            AbstractCachedRpcPublisher, RpcCache

final class this._cls0
    implements Callable
{

    final AbstractCachedRpcPublisher this$0;

    public final Object call()
        throws Exception
    {
        return AbstractCachedRpcPublisher.access$000(AbstractCachedRpcPublisher.this).readFromServer();
    }

    ()
    {
        this$0 = AbstractCachedRpcPublisher.this;
        super();
    }
}
