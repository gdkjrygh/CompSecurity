// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelPublisher;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.ui.toast.Toasts;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            VerifyWithIavActivity

final class this._cls0
    implements OnActionListener
{

    final VerifyWithIavActivity this$0;

    private void onAction(Void void1)
    {
        bankAccountsModelPublisher.generateAndPostEventDontPreserveCache();
        Toasts.show(VerifyWithIavActivity.this, getString(com.google.android.apps.walletnfcrel.ded));
        analyticsUtil.sendSuccess("VerifyBankAccount", new AnalyticsCustomDimension[0]);
        finish();
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Void)obj);
    }

    lisher()
    {
        this$0 = VerifyWithIavActivity.this;
        super();
    }
}
