// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.CouponTags;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
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

public class CouponLineSerializer
    implements ae
{

    public CouponLineSerializer()
    {
    }

    public w serialize(LabsCouponLine labscouponline, Type type, ad ad)
    {
        ad = new z();
        ad.a("ID", Integer.valueOf(labscouponline.getId()));
        Coupon coupon = labscouponline.getCoupon();
        boolean flag;
        if (coupon != null)
        {
            type = coupon.getCode();
        } else
        {
            type = "";
        }
        if (coupon != null && coupon.getTags().isHidden())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ad.a("Code", type);
        ad.a("Hidden", Boolean.valueOf(flag));
        type = new t();
        if (labscouponline.getStatusItemList() != null)
        {
            z z1;
            for (Iterator iterator = labscouponline.getStatusItemList().iterator(); iterator.hasNext(); type.a(z1))
            {
                Map map = (Map)iterator.next();
                z1 = new z();
                String s;
                for (Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); z1.a(s, (String)map.get(s)))
                {
                    s = (String)iterator1.next();
                }

            }

        }
        ad.a("Status", Integer.valueOf(labscouponline.getStatus()));
        if (type.a() > 0)
        {
            ad.a("StatusItems", type);
        }
        return ad;
    }

    public volatile w serialize(Object obj, Type type, ad ad)
    {
        return serialize((LabsCouponLine)obj, type, ad);
    }
}
