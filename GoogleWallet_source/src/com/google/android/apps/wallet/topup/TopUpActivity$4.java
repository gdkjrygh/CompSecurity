// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.topup;

import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.widgets.money.MonetaryValueInput;
import java.util.Currency;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.wallet.topup:
//            TopUpActivity

final class val.topUpAmount
    implements android.view.ener
{

    final TopUpActivity this$0;
    final String val$analyticsLabel;
    final int val$topUpAmount;

    public final void onClick(View view)
    {
        analyticsUtil.sendButtonTap(val$analyticsLabel, new AnalyticsCustomDimension[0]);
        int i = CurrencyUtil.getLegalAddressCurrency().getDefaultFractionDigits();
        view = String.format(Locale.getDefault(), (new StringBuilder(14)).append("%.").append(i).append("f").toString(), new Object[] {
            Double.valueOf(1.0D * (double)val$topUpAmount)
        });
        amount.setText(view);
        amount.formatAmount();
    }

    ValueInput()
    {
        this$0 = final_topupactivity;
        val$analyticsLabel = s;
        val$topUpAmount = I.this;
        super();
    }
}
