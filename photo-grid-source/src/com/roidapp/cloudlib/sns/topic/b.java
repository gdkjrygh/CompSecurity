// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.au;
import android.support.v7.widget.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import com.roidapp.baselib.c.ad;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.y;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.i;
import com.roidapp.cloudlib.sns.main.a;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.modifiedrefresh.w;
import com.roidapp.cloudlib.sns.modifiedrefresh.x;
import com.roidapp.cloudlib.sns.o;

// Referenced classes of package com.roidapp.cloudlib.sns.topic:
//            a, c

public abstract class b extends com.roidapp.cloudlib.sns.main.b
    implements android.view.View.OnClickListener, w, x
{

    protected String a;
    protected String b;
    protected SwipeRefreshLayout2 c;
    protected y d;
    protected RecyclerView e;
    protected com.roidapp.cloudlib.sns.b.x f;
    protected p g;
    protected o h;
    protected boolean i;
    protected boolean j;
    protected Object k;
    protected boolean l;
    private FrameLayout m;
    private boolean n;
    private boolean o;

    public b()
    {
    }

    static boolean a(b b1)
    {
        return b1.n;
    }

    static boolean b(b b1)
    {
        b1.n = true;
        return true;
    }

    protected final void a(int i1, int j1)
    {
        while (!getUserVisibleHint() || getActivity() == null) 
        {
            return;
        }
        v().a(getActivity().getString(i1), j1);
    }

    protected abstract void a(n n1);

    public final void a(String s, String s1)
    {
        a = s;
        b = s1;
    }

    protected abstract boolean a(Object obj);

    protected final void b(Object obj)
    {
        if (!z())
        {
            return;
        }
        k = obj;
        boolean flag;
        if (!a(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            m.removeAllViews();
            e.a(null);
            View view = LayoutInflater.from(getActivity()).inflate(as.ah, m, false);
            m.addView(view);
            m.setVisibility(0);
        } else
        if (m != null && m.getVisibility() == 0)
        {
            m.removeAllViews();
            m.setVisibility(8);
        }
        if (!flag)
        {
            if (d == null)
            {
                d = new y(g());
            }
            d.e();
            com.roidapp.cloudlib.sns.a.a.a(e, null, d, s.b(), Integer.valueOf(hashCode()));
            ((com.roidapp.cloudlib.sns.topic.a)d.d()).f(d.g());
            ((com.roidapp.cloudlib.sns.topic.a)d.d()).b(obj);
            if (e.a() == null)
            {
                e.a(d);
                obj = new ad((k)d.d(), (l)d.d());
                e.b(((android.support.v7.widget.ax) (obj)));
            } else
            {
                d.c();
            }
        }
        c.setEnabled(true);
    }

    protected abstract void d();

    protected abstract au f();

    protected abstract com.roidapp.cloudlib.sns.topic.a g();

    public final void h()
    {
        if (!l() && !i)
        {
            an.a(getActivity(), at.ae);
            c.a();
        }
    }

    protected void i()
    {
    }

    public final void i_()
    {
        if (e != null)
        {
            e.a_(0);
            s.l_();
        }
    }

    public final boolean j()
    {
        return ((com.roidapp.cloudlib.sns.topic.a)d.d()).a() > 0 && !o;
    }

    protected final int k()
    {
        if (((com.roidapp.cloudlib.sns.topic.a)d.d()).a() == 0)
        {
            return -1;
        } else
        {
            GridLayoutManager gridlayoutmanager = (GridLayoutManager)e.b();
            return gridlayoutmanager.c().c(gridlayoutmanager.l(), gridlayoutmanager.d());
        }
    }

    protected boolean l()
    {
        return false;
    }

    protected final boolean m()
    {
        if (h != null)
        {
            h.f();
            h = null;
            c.a();
            return true;
        } else
        {
            return false;
        }
    }

    public void onClick(View view)
    {
        if (view.getTag() instanceof n)
        {
            o = true;
            a((n)view.getTag());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (af.a(getActivity()))
        {
            g = q.a(getActivity()).c();
            f = g.b;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.af, viewgroup, false);
        d();
        c = (SwipeRefreshLayout2)layoutinflater.findViewById(ar.cX);
        a(c, false, l);
        c.a(this);
        if (l)
        {
            c.a(this);
        }
        e = (RecyclerView)layoutinflater.findViewById(ar.cW);
        e.b(new c(this));
        e.a(f());
        m = (FrameLayout)layoutinflater.findViewById(ar.cY);
        return layoutinflater;
    }
}
