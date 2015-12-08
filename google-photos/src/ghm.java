// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

final class ghm extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private ghn ad;

    ghm()
    {
        (new msi(pww.a)).a(ag);
        new dsu(ah);
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(af)).setTitle(b.rY).setMessage(b.rX).setPositiveButton(b.sK, this).setNegativeButton(b.sj, this).create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (ghn)ag.a(ghn);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        olq olq = af;
        msn msn1 = new msn();
        boolean flag;
        if (j == -1)
        {
            dialoginterface = pwt.u;
        } else
        {
            dialoginterface = pwt.t;
        }
        mry.a(olq, 4, msn1.a(new msm(dialoginterface)).a(af));
        dialoginterface = ad;
        if (j == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dialoginterface.b(flag);
    }
}
