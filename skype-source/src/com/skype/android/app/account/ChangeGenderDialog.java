// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;

public class ChangeGenderDialog extends SkypeDialogFragment
{

    Account account;

    public ChangeGenderDialog()
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
        bundle.a(getString(0x7f08024f));
        bundle.a(getResources().getStringArray(0x7f0a0005), account.getGenderProp(), new android.content.DialogInterface.OnClickListener() {

            final ChangeGenderDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                account.setIntProperty(PROPKEY.CONTACT_GENDER, i);
                account.setServersideIntProperty(PROPKEY.CONTACT_GENDER, i);
                dismiss();
            }

            
            {
                this$0 = ChangeGenderDialog.this;
                super();
            }
        });
        bundle = bundle.c();
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
    }
}
