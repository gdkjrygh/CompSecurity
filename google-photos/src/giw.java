// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.photos.onboarding.PageDotsView;

public final class giw extends omp
    implements fpl, mus, np, nug, nwn
{

    nwm a;
    ViewPager b;
    private fqc c;
    private git d;
    private View e;
    private ImageView f;
    private PageDotsView g;

    public giw()
    {
        new mut(af, this);
        new fpk(af, this);
        (new gia()).a(ae);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.rQ, null);
        d = new git(ad, h());
        d.b.a(this, false);
        e = layoutinflater.findViewById(s.P);
        f = (ImageView)layoutinflater.findViewById(s.aa);
        f.setOnClickListener(new gix(this));
        g = (PageDotsView)layoutinflater.findViewById(s.ah);
        viewgroup = g;
        bundle = d;
        viewgroup.a = Math.max(0, giu.values().length);
        viewgroup.invalidate();
        b = (ViewPager)layoutinflater.findViewById(s.ai);
        b.q = this;
        b.a(d);
        if (c.a())
        {
            viewgroup = b;
            bundle = d;
            viewgroup.a(giu.values().length - 1);
        }
        return layoutinflater;
    }

    public final void a(int i, float f1, int j)
    {
    }

    public final void a(fpj fpj, Rect rect)
    {
        e.setPadding(0, 0, 0, rect.bottom);
    }

    public final void b(int i)
    {
    }

    public final void b_(Object obj)
    {
        a.c();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        a = (nwm)ae.a(nwm);
        c = (fqc)ae.a(fqc);
    }

    public final void c_(int i)
    {
        Object obj = g;
        p.b(i, ((PageDotsView) (obj)).a);
        obj.b = i;
        ((PageDotsView) (obj)).invalidate();
        ImageView imageview = f;
        if (t())
        {
            obj = g().getDrawable(p.R);
        } else
        {
            obj = g().getDrawable(p.S);
        }
        imageview.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
    }

    public final boolean r()
    {
        boolean flag = false;
        int i;
        if (c.a())
        {
            i = b.b.b() - 1;
        } else
        {
            i = 0;
        }
        if (b.c == i)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            b.a(b.c - s(), true);
            flag = true;
        }
        return flag;
    }

    int s()
    {
        return !c.a() ? 1 : -1;
    }

    boolean t()
    {
        boolean flag = false;
        int i;
        if (c.a())
        {
            i = 0;
        } else
        {
            i = b.b.b() - 1;
        }
        if (b.c == i)
        {
            flag = true;
        }
        return flag;
    }

    public final am u()
    {
        if (d == null)
        {
            return null;
        } else
        {
            git git1 = d;
            int i = b.c;
            return (am)git1.c.get(i);
        }
    }
}
