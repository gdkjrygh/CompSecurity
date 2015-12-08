// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class hub extends omp
    implements gsu, htt, htz, hwg, iwk
{

    private static final Set d = Collections.singleton("android.permission.READ_CONTACTS");
    final hwf a;
    private hgz ag;
    private mmr ah;
    private gst ai;
    private gss aj;
    private long ak;
    htr b;
    htq c;
    private final hqr e;
    private RecyclerView f;
    private iwm g;
    private huj h;

    public hub()
    {
        a = new hwf(af, this);
        e = (new hqr()).a(ae);
        g = new iwm(this, af, this);
        b = new htr(this, af, this);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.xO, null);
        f = (RecyclerView)layoutinflater.findViewById(au.y);
        f.a(new adi(ad));
        f.a(ag);
        e.a(f);
        return layoutinflater;
    }

    public final void a()
    {
        c.d = true;
        b.a(c.c);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ak = super.q.getLong("com.google.android.apps.photos.search.core.suggestions.subjectid");
        h = new huj(ad, ah.d(), ak);
        c.d = aj.a(ad, d);
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        ag.a(((List) (obj)));
    }

    public final void a(List list)
    {
        c.b = list;
        g.a(h, c);
    }

    public final void b()
    {
    }

    public final void b(List list)
    {
        c.a(list);
        g.a(h, c);
    }

    public final void c()
    {
        ai.a(O_(), d, this);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ah = (mmr)ae.a(mmr);
        ag = new hgz(ad, false, new huk());
        aj = (gss)ae.a(gss);
        ai = (gst)ae.a(gst);
        c = (htq)ae.a(htq);
        bundle = ae.a("com.google.android.apps.photos.ScrollingToolbarManager.NEEDS_SHADOW", true);
        bundle.a(hgz, ag);
        bundle.a(htz, this);
        bundle.a(ay, super.B);
    }

}
