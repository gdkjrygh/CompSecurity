// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.payment.ICard;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCreditCardFraudView

class this._cls0
    implements Action1
{

    final AddCreditCardFraudView this$0;

    public volatile void call(Object obj)
    {
        call((ICard)obj);
    }

    public void call(ICard icard)
    {
        appFlow.replaceWith(new ardScreen(icard.getNumber()));
    }

    ardScreen()
    {
        this$0 = AddCreditCardFraudView.this;
        super();
    }
}
