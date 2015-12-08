// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import android.view.View;
import me.lyft.android.infrastructure.cardscan.ICardScanService;

// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            CreditCardInput

class this._cls0
    implements android.view.r
{

    final CreditCardInput this$0;

    public void onClick(View view)
    {
        cardScanService.startCardScan();
    }

    ()
    {
        this$0 = CreditCardInput.this;
        super();
    }
}
