// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import com.google.a.a.t;

public final class PaymentType extends Enum
{

    private static final PaymentType $VALUES[];
    public static final PaymentType CASH;
    public static final PaymentType CHECK;
    public static final PaymentType CREDIT_CARD;
    public static final PaymentType CREDIT_CARD_TOKEN;
    public static final PaymentType GIFT_CARD;
    public static final PaymentType TRADE_RECEIVABLE;
    public static final PaymentType UNKNOWN;
    public static final t fromStringFn = new _cls1();
    private final String name;

    private PaymentType(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static PaymentType valueOf(String s)
    {
        return (PaymentType)Enum.valueOf(com/dominos/android/sdk/common/dom/order/PaymentType, s);
    }

    public static PaymentType[] values()
    {
        return (PaymentType[])$VALUES.clone();
    }

    public final String toString()
    {
        return name;
    }

    static 
    {
        CASH = new PaymentType("CASH", 0, "Cash");
        CHECK = new PaymentType("CHECK", 1, "Check");
        CREDIT_CARD = new PaymentType("CREDIT_CARD", 2, "CreditCard");
        CREDIT_CARD_TOKEN = new PaymentType("CREDIT_CARD_TOKEN", 3, "CreditCardToken");
        GIFT_CARD = new PaymentType("GIFT_CARD", 4, "GiftCard");
        TRADE_RECEIVABLE = new PaymentType("TRADE_RECEIVABLE", 5, "TradeReceivable");
        UNKNOWN = new PaymentType("UNKNOWN", 6, "");
        $VALUES = (new PaymentType[] {
            CASH, CHECK, CREDIT_CARD, CREDIT_CARD_TOKEN, GIFT_CARD, TRADE_RECEIVABLE, UNKNOWN
        });
    }

    private class _cls1
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

        _cls1()
        {
        }
    }

}
