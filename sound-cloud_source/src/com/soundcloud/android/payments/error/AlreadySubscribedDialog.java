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

public class AlreadySubscribedDialog extends UnrecoverableErrorDialog
{

    private final android.content.DialogInterface.OnClickListener listener = new _cls1();

    public AlreadySubscribedDialog()
    {
    }

    public static void show(FragmentManager fragmentmanager)
    {
        (new AlreadySubscribedDialog()).show(fragmentmanager, "payment_error");
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return (new ImageAlertDialog(getActivity())).setContent(0x7f0200f8, 0x7f0702e9, 0x7f0702e5).setPositiveButton(0x104000a, listener).create();
    }

    public volatile void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
    }

    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final AlreadySubscribedDialog this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dismiss();
        }

        _cls1()
        {
            this$0 = AlreadySubscribedDialog.this;
            super();
        }
    }

}
