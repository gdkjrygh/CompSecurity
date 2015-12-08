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

public class VerifyIssueDialog extends UnrecoverableErrorDialog
{

    private static final String TITLE_ID = "title_id";
    private final android.content.DialogInterface.OnClickListener listener = new _cls1();

    public VerifyIssueDialog()
    {
    }

    private static void show(FragmentManager fragmentmanager, int i)
    {
        VerifyIssueDialog verifyissuedialog = new VerifyIssueDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("title_id", i);
        verifyissuedialog.setArguments(bundle);
        verifyissuedialog.show(fragmentmanager, "payment_error");
    }

    public static void showFail(FragmentManager fragmentmanager)
    {
        show(fragmentmanager, 0x7f0702ef);
    }

    public static void showTimeout(FragmentManager fragmentmanager)
    {
        show(fragmentmanager, 0x7f0702f0);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return (new ImageAlertDialog(getActivity())).setContent(0x7f0200f8, getArguments().getInt("title_id"), 0x7f0702f4).setPositiveButton(0x104000a, listener).create();
    }

    public volatile void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
    }

    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final VerifyIssueDialog this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dismiss();
        }

        _cls1()
        {
            this$0 = VerifyIssueDialog.this;
            super();
        }
    }

}
