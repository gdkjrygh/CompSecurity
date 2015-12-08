// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.ContactImpl;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.util.ContactUtil;

public class ParticipantRemoveDialog extends SkypeDialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    ContactUtil contactUtil;
    SkyLib lib;
    private Participant participant;

    public ParticipantRemoveDialog()
    {
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            participant.retire();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        participant = (Participant)getObjectInterface(com/skype/Participant);
        bundle = getMaterialDialogBuilder(getActivity());
        Object obj = new ContactImpl();
        lib.getContact(participant.getIdentityProp(), ((com.skype.Contact) (obj)));
        obj = contactUtil.l(((com.skype.Contact) (obj)));
        bundle.a(getString(0x7f080269, new Object[] {
            obj
        }));
        bundle.b(getString(0x7f0803a5, new Object[] {
            obj
        }));
        bundle.a(0x7f0802f6, this);
        bundle.b(0x7f080120, null);
        return bundle.c();
    }
}
