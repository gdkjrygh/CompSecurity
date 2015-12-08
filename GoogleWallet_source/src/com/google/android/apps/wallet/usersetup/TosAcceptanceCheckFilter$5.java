// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.api.QuitIntent;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            TosAcceptanceCheckFilter

final class this._cls0
    implements AsyncCallback
{

    final TosAcceptanceCheckFilter this$0;

    private void onSuccess(ceptTosResult cepttosresult)
    {
        TosAcceptanceCheckFilter.access$900(TosAcceptanceCheckFilter.this).hide();
        if (cepttosresult == ceptTosResult.SUCCESS)
        {
            return;
        } else
        {
            cepttosresult = AlertDialogFragment.newBuilder().setTitle(cepttosresult.getTitleId()).setMessage(cepttosresult.getDetailsId()).setPositiveButton(com.google.android.apps.walletnfcrel.again).setNegativeButton(com.google.android.apps.walletnfcrel.later).setCancelable(false).build();
            cepttosresult.setOnClickListener(TosAcceptanceCheckFilter.access$1000(TosAcceptanceCheckFilter.this));
            cepttosresult.show(TosAcceptanceCheckFilter.access$300(TosAcceptanceCheckFilter.this).getSupportFragmentManager(), "tos_try_again");
            return;
        }
    }

    public final void onFailure(Exception exception)
    {
        TosAcceptanceCheckFilter.access$900(TosAcceptanceCheckFilter.this).hide();
        TosAcceptanceCheckFilter.access$300(TosAcceptanceCheckFilter.this).startActivity(QuitIntent.create());
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((ceptTosResult)obj);
    }

    ceptTosResult()
    {
        this$0 = TosAcceptanceCheckFilter.this;
        super();
    }
}
