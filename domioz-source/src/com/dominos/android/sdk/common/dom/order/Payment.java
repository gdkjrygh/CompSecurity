// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import com.dominos.android.sdk.common.core.ToMap;
import com.google.a.a.t;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.common.dom.order:
//            PaymentType

public abstract class Payment
    implements ToMap
{

    protected static final Map paymentFactory;

    public Payment()
    {
    }

    public static Payment from(Map map)
    {
        Object obj;
        if (map.containsKey("CardID"))
        {
            obj = PaymentType.CREDIT_CARD_TOKEN.toString();
        } else
        {
            obj = (String)map.get("Type");
        }
        obj = (t)paymentFactory.get(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return (Payment)((t) (obj)).apply(map);
        }
    }

    public abstract double getAmount();

    public abstract Payment setAmount(double d);

    public abstract Map toMap();

    static 
    {
        HashMap hashmap = new HashMap();
        paymentFactory = hashmap;
        hashmap.put(PaymentType.CASH.toString(), new _cls1());
        paymentFactory.put(PaymentType.CREDIT_CARD.toString(), new _cls2());
        paymentFactory.put(PaymentType.CREDIT_CARD_TOKEN.toString(), new _cls3());
        paymentFactory.put(PaymentType.GIFT_CARD.toString(), new _cls4());
    }

    private class _cls1
        implements t
    {

        public final Payment apply(Map map)
        {
            double d = 0.0D;
            MapNode mapnode = new MapNode(map);
            if (map.containsKey("Amount"))
            {
                d = mapnode.getDbl("Amount", Double.valueOf(0.0D)).doubleValue();
            }
            return (new CashPayment.Builder()).setAmount(d).build();
        }

        public final volatile Object apply(Object obj)
        {
            return apply((Map)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements t
    {

        public final Payment apply(Map map)
        {
            double d = 0.0D;
            MapNode mapnode = new MapNode(map);
            String s1 = mapnode.getText("Expiration");
            String s;
            if (s1.charAt(0) == '0')
            {
                s = s1.substring(1, 2);
            } else
            {
                s = s1.substring(0, 2);
            }
            s1 = (new StringBuilder("20")).append(s1.substring(2)).toString();
            if (map.containsKey("Amount"))
            {
                d = mapnode.getDbl("Amount", Double.valueOf(0.0D)).doubleValue();
            }
            return (new com.dominos.android.sdk.common.dom.useraccounts.AnonymousCreditCard.Builder()).setAmount(d).setFullNumber(mapnode.getText("Number")).setType(CreditCardType.fromString(mapnode.getText("CardType"))).setMonth(s).setYear(s1).setSecurityCode(mapnode.getText("SecurityCode")).setZip(mapnode.getText("PostalCode")).build();
        }

        public final volatile Object apply(Object obj)
        {
            return apply((Map)obj);
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements t
    {

        public final Payment apply(Map map)
        {
            MapNode mapnode = new MapNode(map);
            com.dominos.android.sdk.common.dom.useraccounts.CreditCardToken.Builder builder = new com.dominos.android.sdk.common.dom.useraccounts.CreditCardToken.Builder();
            builder.setId(mapnode.getText("CardID"));
            builder.setCardType(mapnode.getText("Type"));
            if (mapnode.contains("Expiration"))
            {
                String s = mapnode.getText("Expiration");
                if (s.charAt(0) == '0')
                {
                    map = s.substring(1, 2);
                } else
                {
                    map = s.substring(0, 2);
                }
                s = (new StringBuilder("20")).append(s.substring(2)).toString();
                builder.setExpirationMonth(Integer.parseInt(map));
                builder.setExpirationYear(Integer.parseInt(s));
            }
            if (mapnode.contains("Number"))
            {
                builder.setLastFour(mapnode.getText("Number"));
            }
            if (mapnode.contains("PostalCode"))
            {
                builder.setBillingZip(mapnode.getText("PostalCode"));
            }
            return builder.build();
        }

        public final volatile Object apply(Object obj)
        {
            return apply((Map)obj);
        }

        _cls3()
        {
        }
    }


    private class _cls4
        implements t
    {

        public final Payment apply(Map map)
        {
            double d = 0.0D;
            MapNode mapnode = new MapNode(map);
            if (map.containsKey("Amount"))
            {
                d = mapnode.getDbl("Amount", Double.valueOf(0.0D)).doubleValue();
            }
            return (new com.dominos.android.sdk.common.dom.useraccounts.AnonymousCreditCard.Builder()).setAmount(d).setFullNumber(mapnode.getText("Number")).build();
        }

        public final volatile Object apply(Object obj)
        {
            return apply((Map)obj);
        }

        _cls4()
        {
        }
    }

}
