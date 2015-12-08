// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.skype.android.SkypeDialogFragment;

public class MediaDownloadErrorDialog extends SkypeDialogFragment
{

    private static final String FINISH_ACTIVITY_ON_DISMISS = "finishOnDismiss";

    public MediaDownloadErrorDialog()
    {
    }

    public static MediaDownloadErrorDialog create(boolean flag)
    {
        MediaDownloadErrorDialog mediadownloaderrordialog = new MediaDownloadErrorDialog();
        Bundle bundle = new Bundle();
        bundle.putBoolean("finishOnDismiss", flag);
        mediadownloaderrordialog.setArguments(bundle);
        return mediadownloaderrordialog;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(getString(0x7f0803e9));
        bundle.b(getString(0x7f0803e8));
        bundle.a(0x7f0802f6, new android.content.DialogInterface.OnClickListener() {

            final MediaDownloadErrorDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                i = 1;
                if (getArguments() == null || !getArguments().getBoolean("finishOnDismiss", true))
                {
                    i = 0;
                }
                if (i != 0)
                {
                    getActivity().onBackPressed();
                    return;
                } else
                {
                    dismiss();
                    return;
                }
            }

            
            {
                this$0 = MediaDownloadErrorDialog.this;
                super();
            }
        });
        bundle.a(false);
        return bundle.c();
    }
}
