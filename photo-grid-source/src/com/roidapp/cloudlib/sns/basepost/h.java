// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.roidapp.baselib.c.ad;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.y;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.i;
import com.roidapp.cloudlib.sns.main.a;
import com.roidapp.cloudlib.sns.main.b;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.modifiedrefresh.w;
import com.roidapp.cloudlib.sns.modifiedrefresh.x;
import com.roidapp.cloudlib.sns.u;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            u, ad, bc, PinnedListView2, 
//            i

public class h extends b
    implements com.roidapp.cloudlib.sns.basepost.u, w, x
{

    protected ProgressBar a;
    protected PinnedListView2 b;
    protected y c;
    protected bc d;
    protected boolean e;
    protected SwipeRefreshLayout2 f;
    protected boolean g;
    protected com.roidapp.cloudlib.sns.b.x h;
    protected p i;
    protected View j;
    protected FrameLayout k;
    protected FrameLayout l;
    protected e m;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    protected boolean q;
    protected boolean r;
    private View v;

    public h()
    {
        n = true;
        o = false;
        p = true;
        q = true;
    }

    protected final void a(int i1)
    {
        while (!getUserVisibleHint() || getActivity() == null || !z()) 
        {
            return;
        }
        v().a(getActivity().getString(i1));
    }

    public final void a(int i1, boolean flag)
    {
        if (!af.a(getActivity()))
        {
            k();
            return;
        }
        if (i == null)
        {
            i = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
            h = i.b;
        }
        com.roidapp.cloudlib.sns.basepost.ad ad1 = new com.roidapp.cloudlib.sns.basepost.ad();
        ad1.x();
        ad1.a(i.a, h.a, flag, (n)d.g(i1));
        a(((b) (ad1)));
    }

    protected void a(long l1)
    {
    }

    protected void a(View view, LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        l = (FrameLayout)view.findViewById(ar.aI);
        k = (FrameLayout)view.findViewById(ar.aG);
        f = (SwipeRefreshLayout2)view.findViewById(ar.aF);
        f.setEnabled(true);
        f.a(this);
        a(f, false, r);
        if (!q)
        {
            float f1 = getResources().getDimension(ap.m);
            f.a(0, (int)f1);
        }
        if (r)
        {
            f.a(this);
        }
        b = (PinnedListView2)view.findViewById(ar.aA);
        b.b(q);
        b.a(new com.roidapp.cloudlib.sns.basepost.i(b));
        getActivity();
        layoutinflater = new LinearLayoutManager();
        layoutinflater.i();
        b.a(layoutinflater);
        a = (ProgressBar)view.findViewById(ar.aD);
    }

    protected void a(e e1, boolean flag, boolean flag1)
    {
        int i1 = 0;
        if (!z())
        {
            return;
        }
        m = e1;
        PinnedListView2 pinnedlistview2;
        boolean flag2;
        if (flag && (e1 == null || e1.isEmpty()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d == null)
        {
            d = new bc(this, b, n, o, p, this);
            c = new y(d);
            ad ad1 = new ad(d, d);
            b.b(ad1);
        }
        if (e1 == null || e1.isEmpty())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        d.a(i, h);
        d.a(e1);
        if (flag1)
        {
            d.f(1);
        }
        d.a(false);
        pinnedlistview2 = b;
        if (!flag2)
        {
            i1 = e1.size();
        }
        pinnedlistview2.b(i1);
        if (flag2)
        {
            b.k();
        }
        f.a(this);
        if (!flag)
        {
            if (b.a() == null)
            {
                b.a(c);
            } else
            {
                c.c();
            }
        }
        b(flag);
        f.setEnabled(true);
    }

    public final void a(com.roidapp.cloudlib.sns.b.x x1, String s)
    {
        if (!af.a(getActivity()))
        {
            k();
        } else
        {
            if (i == null)
            {
                i = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
                h = i.b;
            }
            if (x1 != null)
            {
                long l1 = x1.a;
                if ((this instanceof com.roidapp.cloudlib.sns.h.h) && l1 == ((com.roidapp.cloudlib.sns.h.h)this).B())
                {
                    if (d != null && d.a() > 0)
                    {
                        this.s.l_();
                        b.a_(0);
                        return;
                    }
                } else
                {
                    x1 = com.roidapp.cloudlib.sns.h.h.a(l1, x1.b, x1.h);
                    x1.C();
                    a(((b) (x1)));
                    return;
                }
            } else
            {
                x1 = com.roidapp.cloudlib.sns.h.h.b(s);
                x1.C();
                a(((b) (x1)));
                return;
            }
        }
    }

    public void a(com.roidapp.cloudlib.sns.g.e e1, Object obj)
    {
label0:
        {
            if (d != null)
            {
                if (com.roidapp.cloudlib.sns.g.e.c != e1)
                {
                    break label0;
                }
                d.e(((Integer)obj).intValue());
            }
            return;
        }
        if (com.roidapp.cloudlib.sns.g.e.d == e1)
        {
            o();
            return;
        }
        if (com.roidapp.cloudlib.sns.g.e.a == e1)
        {
            a(((Long)obj).longValue());
            return;
        } else
        {
            d.c();
            return;
        }
    }

    public final void a(String s)
    {
        com.roidapp.cloudlib.sns.topic.e e1 = new com.roidapp.cloudlib.sns.topic.e();
        e1.a(s, "Comment_[tag]_Page");
        a(((b) (e1)));
    }

    protected void a(boolean flag)
    {
        super.a(flag);
        if (flag)
        {
            a(new com.roidapp.cloudlib.sns.g.e[] {
                com.roidapp.cloudlib.sns.g.e.b, com.roidapp.cloudlib.sns.g.e.c, com.roidapp.cloudlib.sns.g.e.d, com.roidapp.cloudlib.sns.g.e.a
            });
        }
        if (d == null)
        {
            d = new bc(this, b, n, o, p, this);
            c = new y(d);
            ad ad1 = new ad(d, d);
            b.b(ad1);
        }
        c.e();
        c.f();
        if (q)
        {
            com.roidapp.cloudlib.sns.a.a.a(b, b.j(), c, s.b(), Integer.valueOf(hashCode()));
        }
        d();
        d.h(c.g());
        f.a(this);
        if (b.a() == null)
        {
            b.a(c);
        } else
        {
            c.c();
        }
        if (b != null)
        {
            b.l();
        }
    }

    public void b(boolean flag)
    {
        if (flag)
        {
            b.k();
            d.c();
            s.l_();
        }
    }

    protected void d()
    {
    }

    protected void f()
    {
    }

    protected final int g()
    {
        if (d.a() == 0)
        {
            return -1;
        } else
        {
            return ((LinearLayoutManager)b.b()).l();
        }
    }

    public final void h()
    {
        if (d != null && d.h())
        {
            f.a();
        } else
        if (!j())
        {
            an.a(getActivity(), at.ae);
            f.a();
            return;
        }
    }

    public final boolean h_()
    {
        if (v != null)
        {
            v.setOnClickListener(null);
        }
        return super.h_();
    }

    public final boolean i()
    {
        if (e)
        {
            return false;
        }
        if (f != null && !f.b())
        {
            f.a(true);
        }
        onRefresh();
        return true;
    }

    public final void i_()
    {
        super.i_();
        if (b == null)
        {
            return;
        } else
        {
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/TittleClick/Base");
            al.g().a(getActivity(), "SNS", "click", "SNS/TittleClick/Base", Long.valueOf(1L));
            b.k();
            b.a_(0);
            s.l_();
            return;
        }
    }

    public boolean j()
    {
        return false;
    }

    public void k()
    {
    }

    public final void l()
    {
        a.setVisibility(0);
        a.bringToFront();
    }

    public final void m()
    {
        a.setVisibility(8);
    }

    public final void n()
    {
        boolean flag;
        if (m == null || m.size() <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
    }

    protected void o()
    {
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag1 = false;
        super.onCreate(bundle);
        if (af.a(getActivity()))
        {
            i = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
            h = i.b;
        }
        boolean flag = flag1;
        if (getArguments() != null)
        {
            flag = flag1;
            if (getArguments().getBoolean("FromShare", false))
            {
                flag = true;
            }
        }
        g = flag;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(as.t, viewgroup, false);
        f();
        a(view, layoutinflater, viewgroup, bundle);
        return view;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (d != null)
        {
            bc bc1 = d;
            u.a().a(bc1);
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (c != null)
        {
            c.e();
            c.f();
        }
    }

    public void onRefresh()
    {
    }

    public void p()
    {
    }

    public final void q()
    {
        s.l_();
    }
}
