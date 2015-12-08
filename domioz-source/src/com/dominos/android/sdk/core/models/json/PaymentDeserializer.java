// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.google.b.t;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PaymentDeserializer
    implements v
{

    public PaymentDeserializer()
    {
    }

    public LabsPayment deserialize(w w1, Type type, u u)
    {
        int i = 0;
        u = (z)w1;
        type = new LabsPayment();
        Object obj;
        if (u.a("CardID"))
        {
            type.setCardId(u.b("CardID").c());
            type.setPaymentType("CreditCardToken");
            if (u.a("Type"))
            {
                type.setCardType(u.b("Type").c());
            }
        } else
        if (u.a("Type"))
        {
            type.setPaymentType(u.b("Type").c());
            if (u.a("CardType"))
            {
                type.setCardType(u.b("CardType").c());
            }
        }
        if (u.a("Amount"))
        {
            type.setAmount(u.b("Amount").d());
        }
        if (u.a("Expiration"))
        {
            obj = u.b("Expiration").c();
            if (StringHelper.isNotEmpty(((String) (obj))))
            {
                type.setExpiration(((String) (obj)));
                Iterator iterator;
                java.util.Map.Entry entry;
                if (((String) (obj)).charAt(0) == '0')
                {
                    w1 = ((String) (obj)).substring(1, 2);
                } else
                {
                    w1 = ((String) (obj)).substring(0, 2);
                }
                obj = (new StringBuilder("20")).append(((String) (obj)).substring(2)).toString();
                type.setExpirationMonth(w1);
                type.setExpirationYear(((String) (obj)));
            }
        }
        if (u.a("Number"))
        {
            type.setNumber(u.b("Number").c());
        }
        if (u.a("CardType"))
        {
            type.setCardType(u.b("CardType").c());
        }
        if (u.a("SecurityCode"))
        {
            type.setSecurityCode(u.b("SecurityCode").c());
        }
        if (u.a("PostalCode"))
        {
            type.setPostalCode(u.b("PostalCode").c());
        }
        if (u.a("Wallet"))
        {
            type.getClass();
            w1 = new com.dominos.android.sdk.core.models.LabsPayment.WalletPayment(type);
            obj = u.d("Wallet");
            if (((z) (obj)).a("BackingCardNumber"))
            {
                w1.cardNumber = ((z) (obj)).b("BackingCardNumber").c();
            }
            if (((z) (obj)).a("BackingCardType"))
            {
                w1.cardType = ((z) (obj)).b("BackingCardType").c();
            }
            type.setWalletPayment(w1);
        }
        if (u.a("StatusItems"))
        {
            w1 = new ArrayList();
            for (u = u.c("StatusItems"); i < u.a(); i++)
            {
                obj = new HashMap();
                for (iterator = u.a(i).h().a().iterator(); iterator.hasNext(); ((Map) (obj)).put(entry.getKey(), ((w)entry.getValue()).c()))
                {
                    entry = (java.util.Map.Entry)iterator.next();
                }

                w1.add(obj);
            }

            type.setStatusItemList(w1);
        }
        return type;
    }

    public volatile Object deserialize(w w1, Type type, u u)
    {
        return deserialize(w1, type, u);
    }
}
