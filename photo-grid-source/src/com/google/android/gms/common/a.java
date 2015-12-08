// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.bl;

public final class a extends DialogFragment
{

    private Dialog a;
    private android.content.DialogInterface.OnCancelListener b;

    public a()
    {
        a = null;
        b = null;
    }

    public static a a(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        a a1 = new a();
        dialog = (Dialog)bl.a(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        a1.a = dialog;
        if (oncancellistener != null)
        {
            a1.b = oncancellistener;
        }
        return a1;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (b != null)
        {
            b.onCancel(dialoginterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        if (a == null)
        {
            setShowsDialog(false);
        }
        return a;
    }

    public final void show(FragmentManager fragmentmanager, String s)
    {
        super.show(fragmentmanager, s);
    }
}
