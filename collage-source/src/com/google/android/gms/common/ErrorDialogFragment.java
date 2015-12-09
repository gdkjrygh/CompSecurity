// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.z;

public class ErrorDialogFragment extends DialogFragment
{

    private Dialog a;
    private android.content.DialogInterface.OnCancelListener b;

    public ErrorDialogFragment()
    {
        a = null;
        b = null;
    }

    public static ErrorDialogFragment a(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        ErrorDialogFragment errordialogfragment = new ErrorDialogFragment();
        dialog = (Dialog)z.a(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        errordialogfragment.a = dialog;
        if (oncancellistener != null)
        {
            errordialogfragment.b = oncancellistener;
        }
        return errordialogfragment;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (b != null)
        {
            b.onCancel(dialoginterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (a == null)
        {
            setShowsDialog(false);
        }
        return a;
    }

    public void show(FragmentManager fragmentmanager, String s)
    {
        super.show(fragmentmanager, s);
    }
}
