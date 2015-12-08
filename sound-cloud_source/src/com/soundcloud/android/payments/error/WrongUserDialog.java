// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.error;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.soundcloud.android.dialog.ImageAlertDialog;

// Referenced classes of package com.soundcloud.android.payments.error:
//            UnrecoverableErrorDialog

public class WrongUserDialog extends UnrecoverableErrorDialog
{

    private final android.content.DialogInterface.OnClickListener listener = new _cls1();

    public WrongUserDialog()
    {
    }

    public static void show(FragmentManager fragmentmanager)
    {
        (new WrongUserDialog()).show(fragmentmanager, "payment_error");
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return (new ImageAlertDialog(getActivity())).setContent(0x7f0200f8, 0x7f0702f1, 0x7f0702f5).setPositiveButton(0x7f0702f6, listener).setNegativeButton(0x1040000, listener).create();
    }

    public volatile void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
    }

    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final WrongUserDialog this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            if (i == -1)
            {
                LogoutActivity.start(getActivity());
            }
            dismiss();
        }

        _cls1()
        {
            this$0 = WrongUserDialog.this;
            super();
        }
    }

}
