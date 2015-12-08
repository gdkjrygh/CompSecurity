// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.envelope.settings;

import adi;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import b;
import dhc;
import dhj;
import dsu;
import egf;
import ejz;
import eke;
import ekk;
import ekm;
import ekq;
import elb;
import eml;
import emm;
import fib;
import fic;
import fig;
import fio;
import fir;
import fix;
import fpj;
import fpk;
import fpl;
import ftx;
import fty;
import hgz;
import hjp;
import hjv;
import hjz;
import hqr;
import hqv;
import ibz;
import ile;
import iwk;
import iwm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import msi;
import noz;
import olm;
import omp;
import pwz;
import rv;

public final class EnvelopeSettingsFragment extends omp
    implements dhc, emm, fpl, iwk
{

    private static final ekk a = (new ekm()).a(hjp).a(hjv).a(hjz).a(ile).a();
    private RecyclerView ag;
    private final eml b;
    private final iwm c;
    private final List d;
    private final hqr e;
    private noz f;
    private hgz g;
    private ekq h;

    public EnvelopeSettingsFragment()
    {
        b = new eml(this, af, b.pd, this);
        c = new iwm(this, af, this);
        d = Arrays.asList(new fig[] {
            new fix(this, af), new fic(this, af), new fio(af)
        });
        e = (new hqr()).a(ae);
        (new msi(pwz.m)).a(ae);
        new dsu(af);
        (new egf(af, (byte)0)).a(ae);
        (new ibz(this, af)).a(ae);
        (new hqv(this, af)).a(ae);
        (new fpj(af, (byte)0)).a(ae);
        new fpk(af, this);
        (new dhj(this, null, b.pj)).a(ae);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.pk, null);
        ag = (RecyclerView)layoutinflater.findViewById(b.pi);
        ag.a(new adi(ad));
        ag.h = true;
        e.a(ag);
        for (viewgroup = ae.c(ftx).iterator(); viewgroup.hasNext(); ag.b(new fty(bundle)))
        {
            bundle = (ftx)viewgroup.next();
        }

        g = new hgz(ad, false, new fib());
        ag.a(g);
        e.b();
        viewgroup = ((ejz)ae.a(ejz)).b();
        bundle = b;
        ekm ekm1 = (new ekm()).a(a);
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ekm1.a(((fig)iterator.next()).a())) { }
        bundle.a(viewgroup, ekm1.a());
        return layoutinflater;
    }

    public final void a(elb elb1)
    {
        try
        {
            h = (ekq)elb1.a();
            c.a(new fir(), h);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            Toast.makeText(ad, b.pl, 0).show();
        }
    }

    public final void a(fpj fpj1, Rect rect)
    {
        ag.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        ArrayList arraylist = new ArrayList();
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fig fig1 = (fig)iterator.next();
            if (fig1.a(h))
            {
                arraylist.add(fig1.b(h));
            }
        } while (true);
        arraylist.addAll(((java.util.Collection) (obj)));
        g.a(arraylist);
    }

    public final void a(rv rv1)
    {
    }

    public final void a(rv rv1, boolean flag)
    {
        b.a(rv1, true);
        rv1.b(true);
        rv1.c(true);
        rv1.c(b.pm);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        bundle = ae;
        bundle.b(dhc, this);
        bundle.a("com.google.android.apps.photos.ScrollingToolbarManager.NEEDS_SHADOW", true);
        f = noz.a(ad, "EnvelopeSettingsFrag", new String[0]);
    }

}
