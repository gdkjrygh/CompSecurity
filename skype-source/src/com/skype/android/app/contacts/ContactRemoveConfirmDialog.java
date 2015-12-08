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
import com.skype.android.event.EventBus;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.contacts:
//            OnContactRemoved

public class ContactRemoveConfirmDialog extends SkypeDialogFragment
{

    private Contact contact;
    ContactUtil contactUtil;
    EventBus eventBus;

    public ContactRemoveConfirmDialog()
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
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(0x7f080268);
        bundle.b(getString(0x7f08041b, new Object[] {
            contactUtil.l(contact)
        }));
        bundle.a(0x7f08034b, new android.content.DialogInterface.OnClickListener() {

            final ContactRemoveConfirmDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    contact.setBuddyStatus(false, false);
                    dialoginterface = contactUtil;
                    ContactUtil.n(contact);
                    eventBus.a(new OnContactRemoved(contact));
                }
            }

            
            {
                this$0 = ContactRemoveConfirmDialog.this;
                super();
            }
        });
        bundle.b(0x7f0802e5, null);
        return bundle.c();
    }

}
