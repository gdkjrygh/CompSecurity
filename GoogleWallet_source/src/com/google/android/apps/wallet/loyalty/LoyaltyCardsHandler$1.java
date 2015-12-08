// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.view.View;
import android.widget.ScrollView;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyCardsHandler

final class this._cls0
    implements Runnable
{

    final LoyaltyCardsHandler this$0;

    public final void run()
    {
        LoyaltyCardsHandler.access$200(LoyaltyCardsHandler.this).scrollTo(0, LoyaltyCardsHandler.access$000(LoyaltyCardsHandler.this).getTop() + LoyaltyCardsHandler.access$100(LoyaltyCardsHandler.this).getTop());
    }

    ()
    {
        this$0 = LoyaltyCardsHandler.this;
        super();
    }
}
