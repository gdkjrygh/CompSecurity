// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

public final class CancelPlasticCardAction
    implements Callable
{

    private final String otherExplanation;
    private final PlasticCardModelPublisher plasticCardModelPublisher;
    private final String proxyCardSubId;
    private final int reason;

    public CancelPlasticCardAction(PlasticCardModelPublisher plasticcardmodelpublisher, String s, int i, String s1)
    {
        plasticCardModelPublisher = plasticcardmodelpublisher;
        proxyCardSubId = s;
        reason = i;
        otherExplanation = s1;
    }

    private com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardResponse call()
        throws CallErrorException, RpcException
    {
        com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
        cdpiddata.subId = proxyCardSubId;
        return plasticCardModelPublisher.cancelPlasticCard(cdpiddata, reason, otherExplanation);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}
