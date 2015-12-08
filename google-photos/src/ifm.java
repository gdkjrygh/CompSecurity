// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ifm extends omn
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener
{

    private ifn ad;

    public ifm()
    {
        (new msi(pwz.d)).a(ag);
        new dsu(ah);
    }

    public static ifm a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("link_url", s);
        s = new ifm();
        s.f(bundle);
        return s;
    }

    private void a(msp msp)
    {
        mry.a(af, 4, (new msn()).a(new msm(msp)).a(af));
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.q.getString("link_url");
        bundle = (new sr(af)).a(b.yV).b(bundle).a(this);
        ((sr) (bundle)).a.i = ((sr) (bundle)).a.a.getText(0x1040000);
        ((sr) (bundle)).a.j = this;
        return bundle.a(b.yU, this).a();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (ifn)ag.a(ifn);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        if (j == -1)
        {
            a(pwz.c);
            ad.e();
        } else
        if (j == -2)
        {
            a(pwt.t);
            ad.f();
            return;
        }
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        ad.f();
    }
}
