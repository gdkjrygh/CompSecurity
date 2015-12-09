// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.common.base.Predicate;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardModel

final class val.use
    implements Predicate
{

    final PaymentCardModel this$0;
    final int val$use;

    private boolean apply(PaymentCard paymentcard)
    {
        return !paymentcard.isInapplicableForUse(val$use);
    }

    public final volatile boolean apply(Object obj)
    {
        return apply((PaymentCard)obj);
    }

    ()
    {
        this$0 = final_paymentcardmodel;
        val$use = I.this;
        super();
    }
}
