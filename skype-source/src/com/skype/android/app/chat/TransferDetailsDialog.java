// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.skype.Transfer;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.app.transfer.TransferUtil;
import java.io.File;

public class TransferDetailsDialog extends SkypeDialogFragment
{

    private Transfer transfer;
    TransferUtil transferUtil;

    public TransferDetailsDialog()
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
        bundle = getMaterialDialogBuilder(getActivity());
        View view = LayoutInflater.from(getActivity()).inflate(0x7f03011f, null);
        ((TextView)view.findViewById(0x7f100556)).setText(getString(0x7f0803c1, new Object[] {
            transferUtil.getLocalFilename(transfer)
        }));
        ((TextView)view.findViewById(0x7f100557)).setText(getString(0x7f0803c3, new Object[] {
            transferUtil.queryFileSizeString(Long.parseLong(transfer.getFilesizeProp()))
        }));
        File file = transferUtil.getFileDirectory(transfer);
        TextView textview = (TextView)view.findViewById(0x7f100558);
        if (file == null)
        {
            textview.setVisibility(8);
        } else
        {
            textview.setText(getString(0x7f0803c2, new Object[] {
                file.getPath()
            }));
        }
        bundle.a(0x7f08024d);
        bundle.b(view);
        bundle.a(0x7f0802f6, new android.content.DialogInterface.OnClickListener() {

            final TransferDetailsDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dismiss();
            }

            
            {
                this$0 = TransferDetailsDialog.this;
                super();
            }
        });
        return bundle.c();
    }
}
