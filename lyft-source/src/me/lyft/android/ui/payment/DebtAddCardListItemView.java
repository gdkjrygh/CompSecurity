// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtListItemView

public class DebtAddCardListItemView extends DebtListItemView
{

    AppFlow appFlow;

    public DebtAddCardListItemView(Context context)
    {
        super(context, null);
    }

    protected int getIcon()
    {
        return 0x7f02006a;
    }

    protected String getTitle()
    {
        return getResources().getString(0x7f0700f3);
    }

    protected boolean isFailed()
    {
        return false;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    public boolean performClick()
    {
        appFlow.goTo(new PaymentScreens.DebtAddChargeAccountScreen(null));
        return true;
    }
}
