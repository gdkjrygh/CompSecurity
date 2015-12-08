// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class nib extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private nga ad;

    public nib()
    {
    }

    public static void a(ay ay)
    {
        (new nib()).a(ay, "connection_error");
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(O_());
        bundle.setTitle(b.Gt);
        bundle.setMessage(b.Gp);
        bundle.setPositiveButton(b.Gr, this);
        bundle.setNegativeButton(0x1040000, this);
        return bundle.create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (nga)ag.a(nga);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        ad.b();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        if (j == -1)
        {
            ad.c();
            return;
        } else
        {
            ad.b();
            return;
        }
    }
}
