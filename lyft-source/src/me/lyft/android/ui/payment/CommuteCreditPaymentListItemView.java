// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.payment.Credit;

// Referenced classes of package me.lyft.android.ui.payment:
//            CouponPaymentListItemView

public class CommuteCreditPaymentListItemView extends CouponPaymentListItemView
{

    public CommuteCreditPaymentListItemView(Context context, Credit credit, int i)
    {
        super(context, credit, i);
    }

    protected void onOpenCreditDetails()
    {
        appFlow.goTo(new me.lyft.android.ui.enterprise.EnterpriseScreens.WorkPerksMainScreen(credit.getLabel()));
    }
}
