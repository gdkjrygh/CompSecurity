// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.skype.Contact;
import com.skype.android.SkypeDialogFragment;

public class ContactDeleteNumberDialog extends SkypeDialogFragment
{

    private Contact contact;

    public ContactDeleteNumberDialog()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        contact = (Contact)getObjectInterface(com/skype/Contact);
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(0x7f080244);
        bundle.b(0x7f0803b8);
        bundle.a(0x7f0802f6, new android.content.DialogInterface.OnClickListener() {

            final ContactDeleteNumberDialog this$0;
            final int val$index;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1 && contact.setPhoneNumber(index, "", ""))
                {
                    getActivity().finish();
                }
            }

            
            {
                this$0 = ContactDeleteNumberDialog.this;
                index = i;
                super();
            }
        });
        bundle.b(0x7f080120, null);
        return bundle.c();
    }

}
