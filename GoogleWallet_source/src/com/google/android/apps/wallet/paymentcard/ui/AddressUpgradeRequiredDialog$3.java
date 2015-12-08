// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.ui:
//            AddressUpgradeRequiredDialog

final class val.dialog
    implements AsyncCallback
{

    final AddressUpgradeRequiredDialog this$0;
    final Activity val$activity;
    final DialogInterface val$dialog;

    private void onSuccess(Intent intent)
    {
        fullScreenProgressSpinnerManager.hide();
        val$activity.startActivityForResult(intent, 1);
    }

    public final void onFailure(Exception exception)
    {
        Toasts.show(val$activity, com.google.android.apps.walletnfcrel.title);
        WLog.e(AddressUpgradeRequiredDialog.access$200(), "Could not create intent to edit instrument", exception);
        val$dialog.dismiss();
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Intent)obj);
    }

    nerManager()
    {
        this$0 = final_addressupgraderequireddialog;
        val$activity = activity1;
        val$dialog = DialogInterface.this;
        super();
    }
}
