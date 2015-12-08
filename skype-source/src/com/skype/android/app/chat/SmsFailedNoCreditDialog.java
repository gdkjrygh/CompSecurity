// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.app.NavigationUrl;

public class SmsFailedNoCreditDialog extends SkypeDialogFragment
{

    NavigationUrl navigationUrl;

    public SmsFailedNoCreditDialog()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(0x7f080274);
        bundle.b(0x7f080439);
        bundle.a(0x7f080115, new android.content.DialogInterface.OnClickListener() {

            final SmsFailedNoCreditDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                navigationUrl.goToUrl(getActivity(), com.skype.android.res.Urls.Type.e);
            }

            
            {
                this$0 = SmsFailedNoCreditDialog.this;
                super();
            }
        });
        return bundle.c();
    }
}
