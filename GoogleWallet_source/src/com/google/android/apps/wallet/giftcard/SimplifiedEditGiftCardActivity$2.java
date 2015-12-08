// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            SimplifiedEditGiftCardActivity, SimplifiedEditGiftCardModel, GiftCardsClient

final class this._cls0
    implements Callable
{

    final SimplifiedEditGiftCardActivity this$0;

    private com.google.wallet.proto.api.sponse call()
        throws Exception
    {
        return giftCardsClient.getEditForm(SimplifiedEditGiftCardActivity.access$100(SimplifiedEditGiftCardActivity.this).getWobInstanceServerData(), SimplifiedEditGiftCardActivity.access$100(SimplifiedEditGiftCardActivity.this).getEditWobUri());
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = SimplifiedEditGiftCardActivity.this;
        super();
    }
}
