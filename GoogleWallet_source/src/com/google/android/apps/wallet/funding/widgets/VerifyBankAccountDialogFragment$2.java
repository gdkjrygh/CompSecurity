// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding.widgets;

import android.content.DialogInterface;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;

// Referenced classes of package com.google.android.apps.wallet.funding.widgets:
//            VerifyBankAccountDialogFragment

final class this._cls0
    implements android.content.ifyBankAccountDialogFragment._cls2
{

    final VerifyBankAccountDialogFragment this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        startActivity(BankAccountApi.createVerifyBankAccountActivityIntent(getActivity(), VerifyBankAccountDialogFragment.access$000(VerifyBankAccountDialogFragment.this)));
    }

    ()
    {
        this$0 = VerifyBankAccountDialogFragment.this;
        super();
    }
}
