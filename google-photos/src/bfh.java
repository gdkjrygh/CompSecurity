// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.widget.Button;

public final class bfh extends omn
{

    private Button ad;

    public bfh()
    {
        (new msi(pwu.p)).a(ag);
        new msh(ah, (byte)0);
    }

    static Button a(bfh bfh1)
    {
        return bfh1.ad;
    }

    public final void au_()
    {
        super.au_();
        ad = ((AlertDialog)super.e).getButton(-1);
        b.a(ad, new msm(pwu.q));
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(new ContextThemeWrapper(O_(), com.google.android.apps.consumerphotoeditor.R.style.Theme_AppCompat_Light))).setMessage(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_leave_editing_message)).setTitle(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_leave_editing_title)).setPositiveButton(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_leave_editing_confirm), new bfi(this)).setNegativeButton(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_leave_editing_cancel), null).setCancelable(false).create();
    }

    public final void i(Bundle bundle)
    {
        super.i(bundle);
    }
}
