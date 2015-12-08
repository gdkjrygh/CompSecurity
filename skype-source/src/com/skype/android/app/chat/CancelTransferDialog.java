// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.SkyLib;
import com.skype.Transfer;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;

public class CancelTransferDialog extends SkypeDialogFragment
{

    SkyLib lib;
    private Transfer transfer;

    public CancelTransferDialog()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        transfer = (Transfer)getObjectInterface(com/skype/Transfer);
        android.support.v7.app.AlertDialog.a a = getMaterialDialogBuilder(getActivity());
        if (transfer.getTypeProp() == com.skype.Transfer.TYPE.OUTGOING)
        {
            bundle = getString(0x7f0803c0);
        } else
        {
            bundle = getString(0x7f0803bf);
        }
        a.b(bundle);
        a.a(0x7f08034b, new android.content.DialogInterface.OnClickListener() {

            final CancelTransferDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    transfer.cancel();
                }
            }

            
            {
                this$0 = CancelTransferDialog.this;
                super();
            }
        });
        a.b(0x7f0802e5, null);
        return a.c();
    }

}
