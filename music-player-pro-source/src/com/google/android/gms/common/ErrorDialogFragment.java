// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.internal.jx;

public class ErrorDialogFragment extends DialogFragment
{

    private android.content.DialogInterface.OnCancelListener Iw;
    private Dialog mDialog;

    public ErrorDialogFragment()
    {
        mDialog = null;
        Iw = null;
    }

    public static ErrorDialogFragment newInstance(Dialog dialog)
    {
        return newInstance(dialog, null);
    }

    public static ErrorDialogFragment newInstance(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        ErrorDialogFragment errordialogfragment = new ErrorDialogFragment();
        dialog = (Dialog)jx.b(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        errordialogfragment.mDialog = dialog;
        if (oncancellistener != null)
        {
            errordialogfragment.Iw = oncancellistener;
        }
        return errordialogfragment;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (Iw != null)
        {
            Iw.onCancel(dialoginterface);
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

    public void show(FragmentManager fragmentmanager, String s)
    {
        super.show(fragmentmanager, s);
    }
}
