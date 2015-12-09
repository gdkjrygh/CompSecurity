// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.ui:
//            AddressUpgradeRequiredDialog

final class val.activity
    implements android.content.
{

    final AddressUpgradeRequiredDialog this$0;
    final Activity val$activity;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            fullScreenProgressSpinnerManager.show();
            AddressUpgradeRequiredDialog.access$000(AddressUpgradeRequiredDialog.this, val$activity, dialoginterface);
            return;

        case -2: 
            dialoginterface.dismiss();
            return;
        }
    }

    nerManager()
    {
        this$0 = final_addressupgraderequireddialog;
        val$activity = Activity.this;
        super();
    }
}
