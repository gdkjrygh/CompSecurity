// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class jyf extends al
{

    private Dialog ad;
    private android.content.DialogInterface.OnCancelListener ae;

    public jyf()
    {
        ad = null;
        ae = null;
    }

    public static jyf a(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        jyf jyf1 = new jyf();
        dialog = (Dialog)b.f(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        jyf1.ad = dialog;
        if (oncancellistener != null)
        {
            jyf1.ae = oncancellistener;
        }
        return jyf1;
    }

    public final void a(ay ay, String s)
    {
        super.a(ay, s);
    }

    public final Dialog c(Bundle bundle)
    {
        if (ad == null)
        {
            super.c = false;
        }
        return ad;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (ae != null)
        {
            ae.onCancel(dialoginterface);
        }
    }
}
