// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public final class cha extends DialogFragment
{

    public cha()
    {
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(getActivity())).setTitle(c.aD).setMessage(c.aB).setPositiveButton(c.aC, new chb(this)).setCancelable(true).create();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        dialoginterface = getActivity();
        if (dialoginterface != null)
        {
            dialoginterface.finish();
        }
    }
}
