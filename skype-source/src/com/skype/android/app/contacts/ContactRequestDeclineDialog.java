// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Dialog;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.CheckBox;
import com.skype.Contact;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactBlockDialog

public class ContactRequestDeclineDialog extends ContactBlockDialog
{

    NotificationManager notificationManager;

    public ContactRequestDeclineDialog()
    {
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch -1 -1: default 20
    //                   -1 27;
           goto _L1 _L2
_L1:
        super.onClick(dialoginterface, i);
        return;
_L2:
        contact.ignoreAuthRequest();
        contact.setBlocked(actionCheckbox.isChecked(), spamCheckbox.isChecked());
        ContactUtil.n(contact);
        notificationManager.cancel(contact.getObjectID());
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.setTitle(0x7f0801b2);
        return bundle;
    }
}
