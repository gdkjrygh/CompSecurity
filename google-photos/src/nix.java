// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public final class nix extends omn
    implements nja
{

    private LayoutInflater ad;
    private nga ae;
    private mmv ai;
    private niy aj;

    public nix()
    {
        aj = new niy(ah);
        a(0, p.bE);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = ad.inflate(b.GB, viewgroup, false);
        ((ListView)layoutinflater.findViewById(0x102000a)).setAdapter(aj);
        aj.a = this;
        return layoutinflater;
    }

    public final void a(String s, String s1)
    {
        a(true);
        ae.a(s, s1);
    }

    public final void b(String s, String s1)
    {
        a(true);
        int j = ai.b(s, s1);
        ae.e_(j);
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.c(bundle);
        bundle.setTitle(p.bC);
        return bundle;
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = LayoutInflater.from(new ContextThemeWrapper(af, super.a));
        ae = (nga)ag.a(nga);
        ai = (mmv)ag.a(mmv);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        ae.b();
    }
}
