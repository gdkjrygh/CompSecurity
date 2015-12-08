// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import me.lyft.android.infrastructure.cardscan.ICardScanService;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCreditCardFraudView

class this._cls0
    implements android.view.rdFraudView._cls2
{

    final AddCreditCardFraudView this$0;

    public void onClick(View view)
    {
        cardScanService.startCardScan();
    }

    vice()
    {
        this$0 = AddCreditCardFraudView.this;
        super();
    }
}
