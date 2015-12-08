// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

public final class ActivatePlasticCardAction
    implements Callable
{

    private final String last4Digits;
    private final PlasticCardModelPublisher plasticCardModelPublisher;

    public ActivatePlasticCardAction(String s, PlasticCardModelPublisher plasticcardmodelpublisher)
    {
        last4Digits = s;
        plasticCardModelPublisher = (PlasticCardModelPublisher)Preconditions.checkNotNull(plasticcardmodelpublisher);
    }

    private Void call()
        throws RpcException, CallErrorException
    {
        boolean flag = true;
        Object obj = plasticCardModelPublisher.getPlasticCards();
        Object obj1 = null;
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            obj = obj1;
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails)iterator.next();
            if (((com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails) (obj)).proxyCard == null || !Protos.valuesEqual(((com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails) (obj)).proxyCard.status, 1))
            {
                continue;
            }
            obj = ((com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails) (obj)).proxyCard.cdpProxyId;
            break;
        } while (true);
        if (obj == null)
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Proxy card id must not be null.");
        plasticCardModelPublisher.activatePlasticCard(last4Digits, ((com.google.wallet.proto.NanoWalletEntities.CdpIdData) (obj)));
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}
