// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.LabsPayment;
import com.google.b.ad;
import com.google.b.ae;
import com.google.b.t;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PaymentSerializer
    implements ae
{

    public PaymentSerializer()
    {
    }

    public w serialize(LabsPayment labspayment, Type type, ad ad)
    {
        type = new z();
        if (!labspayment.getPaymentType().equalsIgnoreCase("Cash")) goto _L2; else goto _L1
_L1:
        type.a("Type", labspayment.getPaymentType());
_L7:
        if (labspayment.getStatusItemList() == null) goto _L4; else goto _L3
_L3:
        ad = new t();
        labspayment = labspayment.getStatusItemList().iterator();
_L5:
        if (!labspayment.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = (Map)labspayment.next();
        z z1 = new z();
        String s;
        for (Iterator iterator = ((Map) (obj)).keySet().iterator(); iterator.hasNext(); z1.a(s, (String)((Map) (obj)).get(s)))
        {
            s = (String)iterator.next();
        }

        if (ad.a() > 0)
        {
            type.a("StatusItems", ad.toString());
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (labspayment.getPaymentType().equalsIgnoreCase("CreditCard"))
        {
            type.a("Type", "CreditCard");
            type.a("Number", labspayment.getNumber());
            type.a("CardType", labspayment.getCardType());
            type.a("Expiration", labspayment.getExpiration());
            type.a("SecurityCode", labspayment.getSecurityCode());
            type.a("PostalCode", labspayment.getPostalCode());
            ad = labspayment.getWalletPayment();
            if (labspayment.getWalletPayment() != null)
            {
                obj = new z();
                ((z) (obj)).a("Type", "Google");
                ((z) (obj)).a("BackingCardNumber", ((com.dominos.android.sdk.core.models.LabsPayment.WalletPayment) (ad)).cardNumber);
                ((z) (obj)).a("BackingCardType", ((com.dominos.android.sdk.core.models.LabsPayment.WalletPayment) (ad)).cardType);
                type.a("Wallet", ((w) (obj)));
            }
        } else
        if (labspayment.getPaymentType().equalsIgnoreCase("CreditCardToken"))
        {
            type.a("Type", "CreditCard");
            type.a("CardID", labspayment.getCardId());
            type.a("CardType", labspayment.getCardType());
        } else
        if (labspayment.getPaymentType().equalsIgnoreCase("GiftCard"))
        {
            type.a("Type", "GiftCard");
            type.a("Amount", Double.valueOf(labspayment.getAmount()));
            type.a("Number", labspayment.getNumber());
            type.a("SecurityCode", labspayment.getSecurityCode());
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L5; else goto _L4
_L4:
        return type;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public volatile w serialize(Object obj, Type type, ad ad)
    {
        return serialize((LabsPayment)obj, type, ad);
    }
}
