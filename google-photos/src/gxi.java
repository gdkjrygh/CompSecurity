// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;
import java.util.Iterator;
import java.util.List;

public class gxi extends omp
    implements gzb, gzk
{

    public static final ds a = new gps();
    private static final ekk f = (new ekm()).b(gaf).a(elt).a();
    private grn ag;
    private grk ah;
    private final gxp ai = new gxp(this);
    private final Runnable aj = new gxl(this);
    private final gxm ak = new gxm(this);
    public PhotoView b;
    View c;
    public final nud d = new ntz(this);
    public int e;
    private gxr g;
    private gpu h;

    public gxi()
    {
        new ghb(af, new gxj(this), (short)0);
        new ghb(af, new gxk(this), '\0');
        e = gxn.a;
    }

    static int a(gxi gxi1, int i)
    {
        gxi1.e = i;
        return i;
    }

    static void a(gxi gxi1)
    {
label0:
        {
            if (gxi1.b != null)
            {
                if ((elt)gxi1.ag.b.b(elt) != null)
                {
                    break label0;
                }
                gxi1.b.a(null);
            }
            return;
        }
        gxi1.b.a(gxi1.ag.b);
        gxi1.u();
    }

    static PhotoView b(gxi gxi1)
    {
        return gxi1.b;
    }

    static grn c(gxi gxi1)
    {
        return gxi1.ag;
    }

    static grk d(gxi gxi1)
    {
        return gxi1.ah;
    }

    static gpu e(gxi gxi1)
    {
        return gxi1.h;
    }

    static gxp f(gxi gxi1)
    {
        return gxi1.ai;
    }

    static void g(gxi gxi1)
    {
        gxi1.u();
    }

    private void u()
    {
        b.removeCallbacks(aj);
        boolean flag;
        if (!g.b() && !super.q.getBoolean("for_animation", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b.postDelayed(aj, 150L);
            return;
        } else
        {
            b.b(false);
            return;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (ag == null)
        {
            throw new IllegalStateException("Must have a photoModel in onCreateView.");
        }
        layoutinflater = layoutinflater.inflate(b.uI, null);
        b = (PhotoView)layoutinflater.findViewById(b.uH);
        if (super.q.getBoolean("for_animation", false))
        {
            b.c(false);
        }
        c = layoutinflater.findViewById(b.uG);
        viewgroup = b;
        bundle = ag.b;
        viewgroup.b = bundle;
        viewgroup.a(bundle);
        viewgroup = b;
        viewgroup.f = true;
        if (!((PhotoView) (viewgroup)).f)
        {
            viewgroup.a();
        }
        b.setOnClickListener(new gxo(this));
        viewgroup = b;
        if (!((PhotoView) (viewgroup)).n)
        {
            viewgroup.n = true;
            viewgroup.invalidate();
        }
        b.e = true;
        b.a(ai);
        for (viewgroup = ae.c(gyw).iterator(); viewgroup.hasNext(); b.a(bundle))
        {
            bundle = (gyw)viewgroup.next();
        }

        d.b();
        return layoutinflater;
    }

    public final nud a()
    {
        return d;
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        u();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        g = (gxr)ae.a(gxr);
        h = (gpu)ae.a(gpu);
        ag = (grn)ae.a(grn);
        ah = (grk)ae.a(grk);
        ae.a(gzb, this);
    }

    public final void l()
    {
        super.l();
        g.a(ak);
        if (super.q.getBoolean("for_animation", false))
        {
            gyr gyr1 = (gyr)ae.b(gyr);
            b.m = gyr1;
        }
        u();
    }

    public final void m()
    {
        super.m();
        g.b(ak);
    }

    public final PhotoView r()
    {
        return b;
    }

    public final View s()
    {
        return c;
    }

    public final ekk t()
    {
        return f;
    }

}
