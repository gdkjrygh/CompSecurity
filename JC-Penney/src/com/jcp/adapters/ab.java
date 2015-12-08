// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.View;
import com.jcp.h.c;
import com.jcp.model.Coupons;
import com.jcp.model.Offers;

// Referenced classes of package com.jcp.adapters:
//            CouponAdapter

class ab
    implements android.view.View.OnClickListener
{

    final int a;
    final CouponAdapter b;

    ab(CouponAdapter couponadapter, int i)
    {
        b = couponadapter;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        Coupons coupons = CouponAdapter.b(b)[a];
        Object obj;
        if (coupons.getOffers() != null)
        {
            view = "";
            int i = 0;
            do
            {
                obj = view;
                if (i >= coupons.getOffers().length)
                {
                    break;
                }
                obj = view;
                if (!TextUtils.isEmpty(coupons.getOffers()[i].getName()))
                {
                    obj = (new StringBuilder()).append(view).append(coupons.getOffers()[i].getName()).toString();
                }
                view = ((View) (obj));
                if (!TextUtils.isEmpty(coupons.getOffers()[i].getDescription()))
                {
                    view = (new StringBuilder()).append(((String) (obj))).append("\n").append(coupons.getOffers()[i].getDescription()).toString();
                }
                i++;
            } while (true);
        } else
        {
            obj = "";
        }
        view = ((View) (obj));
        if (!TextUtils.isEmpty(coupons.getValidTill()))
        {
            view = (new StringBuilder()).append(((String) (obj))).append("\n").append(coupons.getValidTill()).toString();
        }
        obj = view;
        if (!TextUtils.isEmpty(coupons.getCode()))
        {
            obj = (new StringBuilder()).append(view).append("\n").append(coupons.getCode()).toString();
        }
        view = ((View) (obj));
        if (!TextUtils.isEmpty(coupons.getDetailMobileURL()))
        {
            view = (new StringBuilder()).append(((String) (obj))).append("\n").append(coupons.getDetailMobileURL()).toString();
        }
        obj = new Intent("android.intent.action.SEND");
        ((Intent) (obj)).setType("text/plain");
        ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", CouponAdapter.a(b).getResources().getString(0x7f070080));
        ((Intent) (obj)).putExtra("android.intent.extra.TEXT", view);
        CouponAdapter.a(b).startActivity(Intent.createChooser(((Intent) (obj)), CouponAdapter.a(b).getResources().getString(0x7f070138)));
        c.a(coupons.getCode());
    }
}
