// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.m;
import com.google.android.gms.common.internal.u;

public final class c extends h
{

    private Dialog a;
    private android.content.DialogInterface.OnCancelListener b;

    public c()
    {
        a = null;
        b = null;
    }

    public static c a(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        c c1 = new c();
        dialog = (Dialog)u.a(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        c1.a = dialog;
        if (oncancellistener != null)
        {
            c1.b = oncancellistener;
        }
        return c1;
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
