// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import S;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.google.android.gms.common.internal.zzx;

public class SupportErrorDialogFragment extends DialogFragment
{

    private Dialog mDialog;
    private android.content.DialogInterface.OnCancelListener zzLt;

    public SupportErrorDialogFragment()
    {
        mDialog = null;
        zzLt = null;
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        SupportErrorDialogFragment supporterrordialogfragment = new SupportErrorDialogFragment();
        dialog = (Dialog)zzx.zzb(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        supporterrordialogfragment.mDialog = dialog;
        if (oncancellistener != null)
        {
            supporterrordialogfragment.zzLt = oncancellistener;
        }
        return supporterrordialogfragment;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (zzLt != null)
        {
            zzLt.onCancel(dialoginterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (mDialog == null)
        {
            setShowsDialog(false);
        }
        return mDialog;
    }

    public void show(S s, String s1)
    {
        super.show(s, s1);
    }
}
