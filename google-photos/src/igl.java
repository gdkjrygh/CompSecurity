// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class igl extends omn
{

    ign ad;
    igk ae;

    public igl()
    {
        (new msi(pwt.K)).a(ag);
        new dsu(ah);
    }

    public static igl a(igs igs1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("share_state", igs1);
        igs1 = new igl();
        igs1.f(bundle);
        return igs1;
    }

    void a(msp msp)
    {
        mry.a(af, 4, (new msn()).a(new msm(msp)).a(af));
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = (igs)super.q.getParcelable("share_state");
        ae = new igk(af, bundle);
        return (new android.app.AlertDialog.Builder(af)).setTitle(b.zo).setAdapter(ae, new igm(this)).create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (ign)ag.a(ign);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a(pwt.t);
        a(false);
    }
}
