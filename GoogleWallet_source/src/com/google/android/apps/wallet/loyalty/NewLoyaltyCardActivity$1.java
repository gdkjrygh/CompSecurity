// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            NewLoyaltyCardActivity, LoyaltyCardInfo, LoyaltyCardsHandler

final class this._cls0
    implements android.content.stener
{

    final NewLoyaltyCardActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        loyaltyCardsHandler.setIsForOtherUser(flag, (LoyaltyCardInfo)cardInfo);
        onCardInfoComplete();
    }

    ()
    {
        this$0 = NewLoyaltyCardActivity.this;
        super();
    }
}
