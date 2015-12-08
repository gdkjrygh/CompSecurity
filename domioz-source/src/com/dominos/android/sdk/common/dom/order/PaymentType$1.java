// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import com.dominos.android.sdk.common.StringHelper;
import com.google.a.a.t;

// Referenced classes of package com.dominos.android.sdk.common.dom.order:
//            PaymentType

final class 
    implements t
{

    public final PaymentType apply(String s)
    {
        if (PaymentType.CASH.toString().equals(s))
        {
            return PaymentType.CASH;
        }
        if (StringHelper.startsWithIgnoreCase(s, PaymentType.CREDIT_CARD.toString()))
        {
            return PaymentType.CREDIT_CARD;
        }
        if (PaymentType.GIFT_CARD.toString().equals(s))
        {
            return PaymentType.GIFT_CARD;
        }
        if (PaymentType.CHECK.toString().equals(s))
        {
            return PaymentType.CHECK;
        }
        if (PaymentType.TRADE_RECEIVABLE.toString().equals(s))
        {
            return PaymentType.TRADE_RECEIVABLE;
        } else
        {
            return PaymentType.UNKNOWN;
        }
    }

    public final volatile Object apply(Object obj)
    {
        return apply((String)obj);
    }

    ()
    {
    }
}
