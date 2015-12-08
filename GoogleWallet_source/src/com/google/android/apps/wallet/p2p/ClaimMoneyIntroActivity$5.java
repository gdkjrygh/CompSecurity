// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.view.View;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimMoneyIntroActivity

final class this._cls0
    implements android.view.mMoneyIntroActivity._cls5
{

    final ClaimMoneyIntroActivity this$0;

    public final void onClick(View view)
    {
        startActivityForResult(BankAccountApi.createAddBankAccountActivityIntent(ClaimMoneyIntroActivity.this), 2);
    }

    ()
    {
        this$0 = ClaimMoneyIntroActivity.this;
        super();
    }
}
