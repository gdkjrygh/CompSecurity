// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import com.google.common.base.Function;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardsHandler, GiftCardProgram

final class this._cls0
    implements Function
{

    final GiftCardsHandler this$0;

    private GiftCardProgram apply(com.google.wallet.proto.api..GiftCardForm giftcardform)
    {
        return new GiftCardProgram(GiftCardsHandler.access$000(GiftCardsHandler.this), giftcardform);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.wallet.proto.api..GiftCardForm)obj);
    }

    m()
    {
        this$0 = GiftCardsHandler.this;
        super();
    }
}
