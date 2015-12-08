// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.CouponTags;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.google.b.ac;
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

public class CouponLineDeserializer
    implements v
{

    public CouponLineDeserializer()
    {
    }

    public LabsCouponLine deserialize(w w1, Type type, u u)
    {
        type = new LabsCouponLine();
        u = (z)w1;
        if (u.a("ID"))
        {
            type.setId(u.b("ID").f());
        }
        if (u.a("Code"))
        {
            w1 = new Coupon();
            CouponTags coupontags = new CouponTags();
            w1.setCode(u.b("Code").c());
            Iterator iterator;
            java.util.Map.Entry entry;
            boolean flag;
            if (u.a("Hidden") && u.b("Hidden").g())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            coupontags.setHidden(flag);
            w1.setTags(coupontags);
            type.setCoupon(w1);
        }
        if (u.a("Status"))
        {
            type.setStatus(u.b("Status").f());
        }
        if (u.a("StatusItems"))
        {
            w1 = new ArrayList();
            u = u.c("StatusItems");
            for (int i = 0; i < u.a(); i++)
            {
                HashMap hashmap = new HashMap();
                iterator = u.a(i).h().a().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    entry = (java.util.Map.Entry)iterator.next();
                    if ((w)entry.getValue() instanceof ac)
                    {
                        hashmap.put(entry.getKey(), ((w)entry.getValue()).c());
                    }
                } while (true);
                w1.add(hashmap);
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
