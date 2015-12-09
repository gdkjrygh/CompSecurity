// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.content.DialogInterface;
import com.jcp.model.PromotionDetails;

// Referenced classes of package com.jcp.helper:
//            CartSummaryHelper

class p
    implements android.content.DialogInterface.OnClickListener
{

    final PromotionDetails a;
    final CartSummaryHelper b;

    p(CartSummaryHelper cartsummaryhelper, PromotionDetails promotiondetails)
    {
        b = cartsummaryhelper;
        a = promotiondetails;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        CartSummaryHelper.a(b, a);
    }
}
