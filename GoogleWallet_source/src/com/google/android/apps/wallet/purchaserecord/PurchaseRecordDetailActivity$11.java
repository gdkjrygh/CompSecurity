// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailActivity, PurchaseRecordPublisher

final class this._cls0
    implements AsyncCallback
{

    final PurchaseRecordDetailActivity this$0;

    private void onSuccess(com.google.wallet.proto.api.neyResponse neyresponse)
    {
        if (neyresponse.callError != null)
        {
            if (neyresponse.callError.t != null && neyresponse.callError.callError != null)
            {
                AlertDialogFragment.newBuilder().itle(neyresponse.callError.callError).essage(neyresponse.callError.t).d().show(getSupportFragmentManager());
                return;
            } else
            {
                showToast(com.google.android.apps.walletnfcrel.ast);
                return;
            }
        } else
        {
            showToast(com.google.android.apps.walletnfcrel.ast);
            purchaseRecordPublisher.reload();
            return;
        }
    }

    private void showToast(int i)
    {
        Toasts.show(PurchaseRecordDetailActivity.this, i);
    }

    public final void onFailure(Exception exception)
    {
        showToast(com.google.android.apps.walletnfcrel.ast);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.neyResponse)obj);
    }

    ()
    {
        this$0 = PurchaseRecordDetailActivity.this;
        super();
    }
}
