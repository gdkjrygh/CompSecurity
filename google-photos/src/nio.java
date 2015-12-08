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
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public final class nio extends omn
    implements android.widget.AdapterView.OnItemClickListener
{

    private LayoutInflater ad;
    private List ae;
    private nga ai;

    public nio()
    {
        ae = new ArrayList();
        a(0, p.bE);
    }

    static LayoutInflater a(nio nio1)
    {
        return nio1.ad;
    }

    public static void b(ay ay, String s)
    {
        nio nio1 = new nio();
        Bundle bundle = new Bundle();
        bundle.putString("account_name", s);
        nio1.f(bundle);
        nio1.a(ay, "oob_select_page");
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = ad.inflate(b.GB, viewgroup, false);
        viewgroup = (ListView)layoutinflater.findViewById(0x102000a);
        viewgroup.setAdapter(new niq(this, ae));
        viewgroup.setOnItemClickListener(this);
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = super.q.getString("account_name");
        mmv mmv1 = (mmv)olm.a(O_(), mmv);
        bundle = mmv1.a(mmv1.a(bundle));
        for (int j = 0; j < bundle.a("page_count", 0); j++)
        {
            mmx mmx1 = bundle.d("page").d(Integer.toString(j));
            nip nip1 = new nip(this);
            nip1.a = mmx1.b("gaia_id");
            nip1.b = mmx1.b("display_name");
            nip1.c = mmx1.b("avatar_url");
            ae.add(nip1);
        }

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
        ad = LayoutInflater.from(new ContextThemeWrapper(O_(), super.a));
        ai = (nga)ag.a(nga);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        ai.b();
    }

    public final void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        view = (nip)ae.get(j);
        adapterview = super.q.getString("account_name");
        view = ((nip) (view)).a;
        ai.a(adapterview, view);
        a(true);
    }
}
