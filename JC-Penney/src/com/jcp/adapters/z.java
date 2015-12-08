// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.res.Resources;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.View;
import com.jcp.b.a;
import com.jcp.model.Coupons;

// Referenced classes of package com.jcp.adapters:
//            CouponAdapter

class z
    implements android.view.View.OnClickListener
{

    final Coupons a;
    final CouponAdapter b;

    z(CouponAdapter couponadapter, Coupons coupons)
    {
        b = couponadapter;
        a = coupons;
        super();
    }

    public void onClick(View view)
    {
        if (!TextUtils.isEmpty(a.getShopMobileURL()))
        {
            com.jcp.adapters.CouponAdapter.a(b, a.getShopMobileURL(), a.getCode());
            return;
        } else
        {
            com.jcp.b.a.c(com.jcp.adapters.CouponAdapter.a(b), com.jcp.adapters.CouponAdapter.a(b).getResources().getString(0x7f070137));
            return;
        }
    }
}
