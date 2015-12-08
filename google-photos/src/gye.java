// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.photofragment.components.photobar.PhotoActionBar;
import java.util.Set;

public final class gye extends omp
    implements android.view.View.OnLayoutChangeListener, fpl
{

    public static final gpr a = new gpr();
    public static final gpr b;
    public static final gpr c;
    public static final gpr d = new gpr();
    private fpj ag;
    private mwx ah;
    private PhotoActionBar ai;
    private dgk aj;
    private dgz ak;
    private int al;
    private int am;
    private mwz an;
    private final Runnable ao = new gyf(this);
    ekp e;
    gyh f;
    private final gyg g = new gyg(this);
    private gpu h;

    public gye()
    {
        new fpk(af, this);
    }

    static void a(gye gye1)
    {
        gye1.t();
    }

    private boolean a(gpr gpr1)
    {
        return f.a().contains(gpr1) && f.a(gpr1, e);
    }

    static gpu b(gye gye1)
    {
        return gye1.h;
    }

    private void t()
    {
        if (ai == null || f == null)
        {
            return;
        }
        if (f.a().isEmpty())
        {
            ai.setVisibility(8);
            return;
        }
        ai.setVisibility(0);
        ai.a(a(a), gyc.b);
        Object obj = ai;
        ((PhotoActionBar) (obj)).a(a(c), gyc.a);
        obj = ((PhotoActionBar) (obj)).findViewById(gyc.b(gyc.a));
        if (obj != null)
        {
            ((View) (obj)).setVisibility(8);
        }
        ai.a(a(b), gyc.d);
        ai.a(a(d), gyc.c);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.uW, null);
        ai = (PhotoActionBar)layoutinflater.findViewById(p.ag);
        al = ai.getPaddingRight();
        am = ai.getPaddingBottom();
        ai.addOnLayoutChangeListener(this);
        ak = new dgz(viewgroup);
        return layoutinflater;
    }

    public final void a(fpj fpj1, Rect rect)
    {
        ai.setPadding(ai.getPaddingLeft(), ai.getPaddingTop(), al + rect.right, (am + rect.bottom) - fpj1.b.bottom);
    }

    public final void a(gpu gpu1)
    {
        h = gpu1;
        if (h != null)
        {
            if (super.w)
            {
                ai.a = g;
            }
            h.a(a);
            h.a(c);
            h.a(d);
            h.a(b);
            r();
        } else
        if (ai != null)
        {
            ai.a = null;
            return;
        }
    }

    public final void aj_()
    {
        super.aj_();
        aj.b(ak);
    }

    public final void au_()
    {
        super.au_();
        aj.a(ak);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ag = (fpj)ae.a(fpj);
        ah = (mwx)ae.a(mwx);
        aj = (dgk)ae.a(dgk);
        a((gpu)ae.b(gpu));
    }

    public final void l()
    {
        super.l();
        if (h != null)
        {
            ai.a = g;
        }
        t();
    }

    public final void m()
    {
        super.m();
        ai.a = null;
    }

    public final void onLayoutChange(View view, int i, int j, int k, int i1, int j1, int k1, 
            int l1, int i2)
    {
        Rect rect = new Rect(ag.b);
        rect.bottom = view.getHeight() - view.getPaddingBottom() - view.getPaddingTop();
        ag.a(rect);
        mk.u(view);
    }

    public final void r()
    {
        if (!super.w)
        {
            return;
        } else
        {
            ah.a(an);
            an = ah.a(ao);
            return;
        }
    }

    static 
    {
        b = new gpr(new gpt(p.ae));
        c = new gpr(new gpt(p.ac));
    }
}
