// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.google.b.t;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GiftCardDeserializer
    implements v
{

    public GiftCardDeserializer()
    {
    }

    public GiftCard deserialize(w w1, Type type, u u)
    {
        u = ((z)w1).c("GiftCards").a(0).h();
        w1 = (new com.dominos.android.sdk.common.dom.order.GiftCard.Builder()).setFullNumber(u.b("Number").c()).setPin(u.b("Pin").c());
        double d;
        if (u.a("Balance"))
        {
            d = u.b("Balance").d();
        } else
        {
            d = 0.0D;
        }
        w1 = w1.setBalance(d).setStatus(u.b("Status").f()).build();
        if (u.a("StatusItems") && (u.b("StatusItems") instanceof t))
        {
            type = new ArrayList();
            u = u.c("StatusItems");
            for (int i = 0; i < u.a(); i++)
            {
                z z1 = u.a(i).h();
                if (z1.a("Code"))
                {
                    type.add(z1.b("Code").c());
                }
            }

            w1.setStatusItems((ArrayList)type);
        }
        return w1;
    }

    public volatile Object deserialize(w w1, Type type, u u)
    {
        return deserialize(w1, type, u);
    }
}
