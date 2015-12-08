// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.g;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.m;
import com.google.android.m4b.maps.j.x;

public final class i extends h
{

    private Dialog a;
    private android.content.DialogInterface.OnCancelListener b;

    public i()
    {
        a = null;
        b = null;
    }

    public static i a(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        i j = new i();
        dialog = (Dialog)x.a(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        j.a = dialog;
        if (oncancellistener != null)
        {
            j.b = oncancellistener;
        }
        return j;
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

    public final void show(m m, String s)
    {
        super.show(m, s);
    }
}
