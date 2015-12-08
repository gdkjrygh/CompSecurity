// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.Contact;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.app.Navigation;
import com.skype.android.util.ContactUtil;

public class ContactBlockedDialog extends SkypeDialogFragment
{

    private Contact contact;
    ContactUtil contactUtil;
    Navigation nav;

    public ContactBlockedDialog()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        contact = (Contact)getObjectInterface(com/skype/Contact);
        bundle = getString(0x7f08023c, new Object[] {
            contactUtil.l(contact)
        });
        android.support.v7.app.AlertDialog.a a = getMaterialDialogBuilder(getActivity());
        a.a(bundle);
        a.b(0x7f080469);
        a.a(0x7f08019e, new android.content.DialogInterface.OnClickListener() {

            final ContactBlockedDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    contact.setBlocked(false, false);
                    nav.chat(contact);
                }
            }

            
            {
                this$0 = ContactBlockedDialog.this;
                super();
            }
        });
        a.b(0x7f080120, null);
        return a.c();
    }

}
