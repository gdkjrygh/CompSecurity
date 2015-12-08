// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.cardlist.FrontingInstrumentClient;
import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

final class this._cls0
    implements Callable
{

    final PlasticCardModelPublisher this$0;

    private com.google.wallet.proto.nstrumentInfo call()
        throws RpcException, CallErrorException
    {
        return PlasticCardModelPublisher.access$800(PlasticCardModelPublisher.this).getFrontingInstrumentInfo();
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = PlasticCardModelPublisher.this;
        super();
    }
}
