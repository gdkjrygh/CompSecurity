// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardsClient

final class val.query
    implements Callable
{

    final GiftCardsClient this$0;
    final String val$query;

    private List call()
        throws Exception
    {
        Object obj = new com.google.wallet.proto.api.s.DiscoverGiftCardsRequest();
        if (!val$query.isEmpty())
        {
            obj.queryString = val$query;
        }
        obj.pageSize = Integer.valueOf(500);
        obj = (com.google.wallet.proto.api.s.DiscoverGiftCardsResponse)GiftCardsClient.access$000(GiftCardsClient.this).call("b/giftcards/discover", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.s.DiscoverGiftCardsResponse());
        if (((com.google.wallet.proto.api.s.DiscoverGiftCardsResponse) (obj)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.s.DiscoverGiftCardsResponse) (obj)).callError);
        } else
        {
            return ImmutableList.copyOf(((com.google.wallet.proto.api.s.DiscoverGiftCardsResponse) (obj)).forms);
        }
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    on()
    {
        this$0 = final_giftcardsclient;
        val$query = String.this;
        super();
    }
}
