// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.google.b.ad;
import com.google.b.ae;
import com.google.b.t;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;

public class GiftCardSerializer
    implements ae
{

    public GiftCardSerializer()
    {
    }

    public w serialize(GiftCard giftcard, Type type, ad ad)
    {
        type = new z();
        ad = new t();
        z z1 = new z();
        z1.a("Number", giftcard.getFullCardNumber());
        z1.a("Pin", giftcard.getPin());
        ad.a(z1);
        type.a("GiftCards", ad);
        return type;
    }

    public volatile w serialize(Object obj, Type type, ad ad)
    {
        return serialize((GiftCard)obj, type, ad);
    }
}
