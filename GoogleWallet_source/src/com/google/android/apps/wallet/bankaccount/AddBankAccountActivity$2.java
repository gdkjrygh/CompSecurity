// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            AddBankAccountActivity

final class this._cls0
    implements AsyncCallback
{

    final AddBankAccountActivity this$0;

    private void onSuccess(com.google.wallet.proto.api.ankAccountResponse ankaccountresponse)
    {
        AddBankAccountActivity.access$000(AddBankAccountActivity.this, ankaccountresponse);
    }

    public final void onFailure(Exception exception)
    {
        fullScreenProgressSpinnerManager.hide();
        AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel._error_please_try_again)).build().show(getSupportFragmentManager());
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.ankAccountResponse)obj);
    }

    nse()
    {
        this$0 = AddBankAccountActivity.this;
        super();
    }
}
