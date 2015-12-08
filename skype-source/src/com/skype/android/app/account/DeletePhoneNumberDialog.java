// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;

public class DeletePhoneNumberDialog extends SkypeDialogFragment
{

    Account account;

    public DeletePhoneNumberDialog()
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
        bundle.a(0x7f080244);
        bundle.b(0x7f0803b8);
        bundle.a(0x7f0802f6, new android.content.DialogInterface.OnClickListener() {

            final DeletePhoneNumberDialog this$0;
            final PROPKEY val$property;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1 && account.setStrProperty(property, ""))
                {
                    account.setServersideStrProperty(property, "");
                    getActivity().finish();
                }
            }

            
            {
                this$0 = DeletePhoneNumberDialog.this;
                property = propkey;
                super();
            }
        });
        bundle.b(0x7f080120, null);
        return bundle.c();
    }
}
