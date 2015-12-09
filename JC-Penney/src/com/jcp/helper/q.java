// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.View;
import com.jcp.h.a;
import com.jcp.model.PromotionDetails;
import com.jcp.model.rewards.Certificate;
import com.jcp.util.au;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.helper:
//            CartSummaryHelper

class q
    implements android.view.View.OnClickListener
{

    final CartSummaryHelper a;

    q(CartSummaryHelper cartsummaryhelper)
    {
        a = cartsummaryhelper;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
label1:
            {
                view = (Certificate)view.getTag();
                if (view == null)
                {
                    break label1;
                }
                if (!view.isApplied())
                {
                    break label0;
                }
                view = view.getSerialNumber();
                if (TextUtils.isEmpty(view))
                {
                    break label1;
                }
                Iterator iterator = com.jcp.helper.CartSummaryHelper.a(a).iterator();
                PromotionDetails promotiondetails;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label1;
                    }
                    promotiondetails = (PromotionDetails)iterator.next();
                } while (!view.equalsIgnoreCase(promotiondetails.getSerialNumber()));
                com.jcp.helper.CartSummaryHelper.a(a, promotiondetails);
            }
            return;
        }
        if (com.jcp.helper.CartSummaryHelper.a(a).size() < CartSummaryHelper.e())
        {
            com.jcp.h.a.r();
            a.a(view.getCode(), view.getSerialNumber(), "REWARDS", false);
            return;
        } else
        {
            au.a(CartSummaryHelper.b(a), CartSummaryHelper.b(a).getString(0x7f070358));
            return;
        }
    }
}
