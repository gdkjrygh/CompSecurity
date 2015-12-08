// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import com.google.android.apps.wallet.wobs.caching.WobsManager;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            SimplifiedEditGiftCardActivity, SimplifiedEditGiftCardModel, GiftCardsClient

final class val.userDataPrompts
    implements Callable
{

    final SimplifiedEditGiftCardActivity this$0;
    final List val$userDataPrompts;

    private Void call()
        throws Exception
    {
        com.google.wallet.proto.tCardActivity tcardactivity = giftCardsClient.updateWobInstance(SimplifiedEditGiftCardActivity.access$100(SimplifiedEditGiftCardActivity.this).getWobInstanceServerData(), val$userDataPrompts);
        if (tcardactivity != null)
        {
            wobsManager.upsertWobIfNecessary(tcardactivity);
        }
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_simplifiededitgiftcardactivity;
        val$userDataPrompts = List.this;
        super();
    }
}
