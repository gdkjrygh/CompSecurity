// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            EditGiftCardActivity, GiftCardInfo, GiftCardsClient

final class this._cls0
    implements Callable
{

    final EditGiftCardActivity this$0;

    private Void call()
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.stance stance = giftCardsClient.updateWobInstance(EditGiftCardActivity.access$100(EditGiftCardActivity.this), EditGiftCardActivity.access$400(EditGiftCardActivity.this).getAllPrompts());
        wobsManager.upsertWobIfNecessary(stance);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = EditGiftCardActivity.this;
        super();
    }
}
