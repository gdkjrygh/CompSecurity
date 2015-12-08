// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

public final class OrderPlasticCardAction
    implements Callable
{
    public static class Factory
    {

        private final PlasticCardModelPublisher plasticCardModelProvider;

        public final OrderPlasticCardAction get(com.google.wallet.proto.NanoWalletEntities.Address address1)
        {
            return new OrderPlasticCardAction(plasticCardModelProvider, address1);
        }

        Factory(PlasticCardModelPublisher plasticcardmodelpublisher)
        {
            plasticCardModelProvider = plasticcardmodelpublisher;
        }
    }


    private final com.google.wallet.proto.NanoWalletEntities.Address address;
    private final PlasticCardModelPublisher plasticCardModelPublisher;

    OrderPlasticCardAction(PlasticCardModelPublisher plasticcardmodelpublisher, com.google.wallet.proto.NanoWalletEntities.Address address1)
    {
        plasticCardModelPublisher = plasticcardmodelpublisher;
        address = address1;
    }

    private Void call()
        throws CallErrorException, RpcException
    {
        plasticCardModelPublisher.orderPlasticCard(address);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}
