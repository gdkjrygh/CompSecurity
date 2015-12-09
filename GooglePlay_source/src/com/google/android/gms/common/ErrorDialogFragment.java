// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

public final class ErrorDialogFragment extends DialogFragment
{

    private android.content.DialogInterface.OnCancelListener mCancelListener;
    private Dialog mDialog;

    public ErrorDialogFragment()
    {
        mDialog = null;
        mCancelListener = null;
    }

    public static ErrorDialogFragment newInstance(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        ErrorDialogFragment errordialogfragment = new ErrorDialogFragment();
        dialog = (Dialog)Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        errordialogfragment.mDialog = dialog;
        if (oncancellistener != null)
        {
            errordialogfragment.mCancelListener = oncancellistener;
        }
        return errordialogfragment;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (mCancelListener != null)
        {
            mCancelListener.onCancel(dialoginterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        if (mDialog == null)
        {
            setShowsDialog(false);
        }
        return mDialog;
    }

    public final void show(FragmentManager fragmentmanager, String s)
    {
        super.show(fragmentmanager, s);
    }
}
