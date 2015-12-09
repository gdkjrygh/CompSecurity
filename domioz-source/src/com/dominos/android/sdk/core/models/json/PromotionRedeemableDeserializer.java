// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.LabsPromotionRedeemable;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;

public class PromotionRedeemableDeserializer
    implements v
{

    public PromotionRedeemableDeserializer()
    {
    }

    public LabsPromotionRedeemable deserialize(w w1, Type type, u u)
    {
        type = new LabsPromotionRedeemable();
        w1 = (z)w1;
        if (w1.a("Code"))
        {
            type.setCode(w1.b("Code").c());
        }
        if (w1.a("Status"))
        {
            type.setStatus(w1.b("Status").c());
        }
        if (w1.a("Message"))
        {
            type.setMessage(w1.b("Message").c());
        }
        if (w1.a("CouponCode"))
        {
            type.setCouponCode(w1.b("CouponCode").c());
        }
        return type;
    }

    public volatile Object deserialize(w w1, Type type, u u)
    {
        return deserialize(w1, type, u);
    }
}
