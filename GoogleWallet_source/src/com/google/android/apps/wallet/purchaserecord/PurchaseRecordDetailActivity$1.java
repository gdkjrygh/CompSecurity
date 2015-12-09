// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailActivity

final class val.alertDialog
    implements android.content.
{

    final PurchaseRecordDetailActivity this$0;
    final AlertDialogFragment val$alertDialog;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            String s = val$alertDialog.getArguments().getString("KEY_TRANSACTION_ID");
            Preconditions.checkNotNull(s);
            PurchaseRecordDetailActivity.access$000(PurchaseRecordDetailActivity.this, s);
            dialoginterface.dismiss();
        }
    }

    ()
    {
        this$0 = final_purchaserecorddetailactivity;
        val$alertDialog = AlertDialogFragment.this;
        super();
    }
}
