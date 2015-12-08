// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class bqk extends t
{

    private Dialog Y;
    private android.content.DialogInterface.OnCancelListener Z;

    public bqk()
    {
        Y = null;
        Z = null;
    }

    public static bqk a(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        bqk bqk1 = new bqk();
        dialog = (Dialog)btl.a(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        bqk1.Y = dialog;
        if (oncancellistener != null)
        {
            bqk1.Z = oncancellistener;
        }
        return bqk1;
    }

    public final void a(aa aa, String s)
    {
        super.a(aa, s);
    }

    public final Dialog c(Bundle bundle)
    {
        if (Y == null)
        {
            super.a = false;
        }
        return Y;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (Z != null)
        {
            Z.onCancel(dialoginterface);
        }
    }
}
