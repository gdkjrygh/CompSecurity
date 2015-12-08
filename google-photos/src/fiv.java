// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class fiv extends omn
    implements android.content.DialogInterface.OnClickListener
{

    fiw ad;

    public fiv()
    {
        (new msi(pwz.p)).a(ag);
        new dsu(ah);
    }

    private void a(msp msp)
    {
        mry.a(af, 4, (new msn()).a(new msm(msp)).a(af));
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(O_());
        bundle.setMessage(b.pA).setTitle(b.pB).setPositiveButton(b.pz, this).setNegativeButton(0x1040000, this);
        return bundle.create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a(false);
        if (-1 == i)
        {
            a(pwz.o);
            if (ad != null)
            {
                ad.c();
            }
        } else
        if (-2 == i)
        {
            a(pwt.t);
            return;
        }
    }
}
