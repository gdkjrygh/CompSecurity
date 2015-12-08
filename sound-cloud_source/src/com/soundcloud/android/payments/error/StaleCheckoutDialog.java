// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.error;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.soundcloud.android.dialog.ImageAlertDialog;

// Referenced classes of package com.soundcloud.android.payments.error:
//            UnrecoverableErrorDialog

public class StaleCheckoutDialog extends UnrecoverableErrorDialog
{

    private final android.content.DialogInterface.OnClickListener listener = new _cls1();

    public StaleCheckoutDialog()
    {
    }

    private void openSupport()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.startActivity((new Intent("android.intent.action.VIEW")).setData(Uri.parse(getString(0x7f07032f))));
        }
    }

    public static void show(FragmentManager fragmentmanager)
    {
        (new StaleCheckoutDialog()).show(fragmentmanager, "payment_error");
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return (new ImageAlertDialog(getActivity())).setContent(0x7f0200f8, 0x7f0702ec, 0x7f0702e8).setPositiveButton(0x7f0700f8, listener).setNegativeButton(0x1040000, listener).create();
    }

    public volatile void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
    }


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final StaleCheckoutDialog this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            if (i == -1)
            {
                openSupport();
            }
            dismiss();
        }

        _cls1()
        {
            this$0 = StaleCheckoutDialog.this;
            super();
        }
    }

}
