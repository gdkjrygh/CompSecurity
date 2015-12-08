// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.moviemaker.MovieMakerActivity;
import java.util.Collections;
import java.util.List;

public final class cez extends omp
    implements bmx, bwj, che, chg, chh
{

    private static final bwk a = (bwk)ddz.a(bwk);
    private bwk b;
    private bvz c;
    private bmq d;
    private dam e;
    private View f;
    private cfa g;

    public cez()
    {
        b = a;
        (new msi(pwp.x)).a(ae);
        new msh(af, (byte)0);
    }

    static bwk a(cez cez1)
    {
        return cez1.b;
    }

    private void t()
    {
        if (e == null)
        {
            e = new dam(O_(), ((rz)O_()).e().a(), bmw.a);
        }
        e.a();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        f = layoutinflater.inflate(c.B, viewgroup, false);
        int i = b.fX;
        layoutinflater = f.findViewById(i);
        viewgroup = String.valueOf(g().getResourceName(i));
        layoutinflater = (RecyclerView)(View)c.a(layoutinflater, (new StringBuilder(String.valueOf(viewgroup).length() + 19)).append("View ").append(i).append(" / ").append(viewgroup).toString(), null);
        layoutinflater.a(new adi(O_()));
        g = new cfa(this);
        layoutinflater.a(g);
        t();
        return f;
    }

    public final void a(bmy bmy)
    {
        e.a(bmy);
    }

    public final void a(bwk bwk1)
    {
        bwk bwk2 = bwk1;
        if (bwk1 == null)
        {
            bwk2 = a;
        }
        b = bwk2;
    }

    public final void a(cqa cqa)
    {
        cfa cfa1 = g;
        cfa1.e = cqa;
        int i = cfa1.c.indexOf(cqa);
        if (cfa1.d != i)
        {
            int j = cfa1.d;
            cfa1.d = i;
            cfa1.c(j);
            cfa1.c(cfa1.d);
        }
    }

    public final void a(List list, bwg bwg1)
    {
        if (bwg1 != null)
        {
            list = g;
            bwg1 = bwg1.b;
            ((cfa) (list)).c.clear();
            ((cfa) (list)).c.addAll(bwg1);
            Collections.sort(((cfa) (list)).c);
            list.d = ((cfa) (list)).c.indexOf(((cfa) (list)).e);
            ((aen) (list)).a.b();
            ((aen) (g)).a.b();
        }
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            b.c();
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
    }

    public final void ak_()
    {
        e.b();
        c.b(this);
        d.b(this);
        super.ak_();
    }

    public final void b(boolean flag)
    {
    }

    public final void b_(boolean flag)
    {
    }

    public final void g(Bundle bundle)
    {
        super.g(bundle);
        c = MovieMakerActivity.b(this).d.n;
        c.a(this);
        d = MovieMakerActivity.b(this).d.r;
        d.a(this);
        b.b();
    }

    public final void r()
    {
        t();
    }

    public final boolean s()
    {
        b.c();
        return false;
    }

    static 
    {
        cgp.getSimpleName();
    }
}
