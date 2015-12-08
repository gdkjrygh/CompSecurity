// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

public final class dgb extends omn
    implements android.content.DialogInterface.OnClickListener, mnc
{

    private nga ad;
    private mmv ae;
    private dfy ai;

    public dgb()
    {
        (new egf(ah, (byte)0)).a(ag);
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = (TextView)LayoutInflater.from(af).inflate(b.iD, null);
        ai = new dfy(af);
        ai.a();
        return (new sr(af)).a(bundle).a(ai, this).a();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (nga)ag.a(nga);
        ae = (mmv)ag.a(mmv);
    }

    public final void l()
    {
        super.l();
        ae.a(this);
    }

    public final void m()
    {
        super.m();
        ae.b(this);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        dialoginterface = ai.a(j);
        ad.a(((dfz) (dialoginterface)).a, ((dfz) (dialoginterface)).b);
    }

    public final void r()
    {
        ai.a();
    }
}
