// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

public final class LockPlasticCardAction
    implements Callable
{

    private final PlasticCardModelPublisher plasticCardModelPublisher;
    private final String proxyCardSubId;

    public LockPlasticCardAction(PlasticCardModelPublisher plasticcardmodelpublisher, String s)
    {
        plasticCardModelPublisher = plasticcardmodelpublisher;
        proxyCardSubId = s;
    }

    private com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardResponse call()
        throws CallErrorException, RpcException
    {
        return plasticCardModelPublisher.lockPlasticCard(proxyCardSubId);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}
