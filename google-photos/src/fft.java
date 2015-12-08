// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class fft extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private mmr ad;
    private ffu ae;

    public fft()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = a(b.oa, new Object[] {
            ad.g().b("account_name")
        });
        return (new android.app.AlertDialog.Builder(af)).setTitle(b.oc).setMessage(bundle).setPositiveButton(b.ob, this).setNegativeButton(b.nZ, this).create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ae = (ffu)ag.a(ffu);
        ad = (mmr)ag.a(mmr);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        dialoginterface = ae;
        boolean flag;
        if (j == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dialoginterface.a(flag);
    }
}
