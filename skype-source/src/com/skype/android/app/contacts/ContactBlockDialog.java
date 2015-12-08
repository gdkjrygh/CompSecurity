// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.event.EventBus;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.contacts:
//            OnContactBlocked

public abstract class ContactBlockDialog extends SkypeDialogFragment
    implements android.content.DialogInterface.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    CheckBox actionCheckbox;
    protected Contact contact;
    ContactUtil contactUtil;
    TextView descriptionText;
    EventBus eventBus;
    SkyLib lib;
    CheckBox spamCheckbox;

    public ContactBlockDialog()
    {
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        switch (compoundbutton.getId())
        {
        default:
            return;

        case 2131755760: 
            break;
        }
        if (flag)
        {
            actionCheckbox.setChecked(true);
            actionCheckbox.setEnabled(false);
            return;
        } else
        {
            actionCheckbox.setEnabled(true);
            return;
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            eventBus.a(new OnContactBlocked(contact));
            break;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        contact = (Contact)getObjectInterface(com/skype/Contact);
        Object obj = getMaterialDialogBuilder(getActivity());
        bundle = getActivity().getLayoutInflater().inflate(0x7f030057, null);
        ((android.support.v7.app.AlertDialog.a) (obj)).b(bundle);
        ((android.support.v7.app.AlertDialog.a) (obj)).a(0x104000a, this);
        ((android.support.v7.app.AlertDialog.a) (obj)).b(0x1040000, this);
        ((android.support.v7.app.AlertDialog.a) (obj)).a(true);
        obj = ((android.support.v7.app.AlertDialog.a) (obj)).c();
        ((Dialog) (obj)).setCanceledOnTouchOutside(true);
        actionCheckbox = (CheckBox)bundle.findViewById(0x7f1002ef);
        spamCheckbox = (CheckBox)bundle.findViewById(0x7f1002f0);
        descriptionText = (TextView)bundle.findViewById(0x7f1002ee);
        spamCheckbox.setOnCheckedChangeListener(this);
        return ((Dialog) (obj));
    }
}
