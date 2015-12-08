// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.Sms;
import com.skype.android.SkypeDialogFragment;

public class SmsFailedRetryDialog extends SkypeDialogFragment
{

    private Sms sms;

    public SmsFailedRetryDialog()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        sms = (Sms)getObjectInterface(com/skype/Sms);
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(0x7f08027c);
        bundle.b(0x7f08043a);
        bundle.a(0x7f080176, new android.content.DialogInterface.OnClickListener() {

            final SmsFailedRetryDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                sms.send();
            }

            
            {
                this$0 = SmsFailedRetryDialog.this;
                super();
            }
        });
        bundle.b(0x7f080120, null);
        return bundle.c();
    }

}
