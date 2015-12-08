// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            EditGiftCardActivity, GiftCardsClient

final class this._cls0
    implements Callable
{

    final EditGiftCardActivity this$0;

    private com.google.wallet.proto.api.EditFormResponse call()
        throws Exception
    {
        return giftCardsClient.getEditForm(EditGiftCardActivity.access$100(EditGiftCardActivity.this), EditGiftCardActivity.access$300(EditGiftCardActivity.this));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    onse()
    {
        this$0 = EditGiftCardActivity.this;
        super();
    }
}
