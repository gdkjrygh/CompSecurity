// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.payment.WalletChargeAccount;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChargeAccountPaymentItemView

public class WalletPaymentItemView extends ChargeAccountPaymentItemView
{

    AppFlow appFlow;

    public WalletPaymentItemView(Context context, WalletChargeAccount walletchargeaccount, int i)
    {
        super(context, walletchargeaccount, i);
        Scoop.a(this).b(this);
    }

    private WalletChargeAccount getWalletChargeAccount()
    {
        return (WalletChargeAccount)getChargeAccount();
    }

    protected int getIcon()
    {
        return 0x7f020071;
    }

    protected String getTitle()
    {
        return getResources().getString(0x7f070285, new Object[] {
            getWalletChargeAccount().getLastFour()
        });
    }

    protected void onOpenChargeAccountEdit()
    {
        PaymentAnalytics.openEditWalletItem();
        appFlow.goTo(new PaymentScreens.EditGoogleWalletScreen(getWalletChargeAccount()));
    }
}
