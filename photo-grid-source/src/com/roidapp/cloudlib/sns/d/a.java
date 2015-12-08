// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roidapp.baselib.c.y;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.c;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.basepost.PinnedListView2;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.basepost.d;
import com.roidapp.cloudlib.sns.basepost.h;
import com.roidapp.cloudlib.sns.basepost.u;
import com.roidapp.cloudlib.sns.g.b;
import com.roidapp.cloudlib.sns.g.f;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;
import com.roidapp.cloudlib.sns.upload.UploadProgressStatusView;
import com.roidapp.cloudlib.sns.upload.i;
import com.roidapp.cloudlib.sns.upload.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.d:
//            b, d, e, c

public final class a extends h
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, u
{

    private final aa A = new com.roidapp.cloudlib.sns.d.b(this);
    private j B;
    private ViewGroup v;
    private o w;
    private View x;
    private LinearLayout y;
    private boolean z;

    public a()
    {
        z = false;
        B = new com.roidapp.cloudlib.sns.d.d(this);
    }

    static boolean A(a a1)
    {
        a1.e = false;
        return false;
    }

    static PinnedListView2 B(a a1)
    {
        return a1.b;
    }

    static SwipeRefreshLayout2 C(a a1)
    {
        return a1.f;
    }

    static SwipeRefreshLayout2 D(a a1)
    {
        return a1.f;
    }

    static SwipeRefreshLayout2 E(a a1)
    {
        return a1.f;
    }

    static bc F(a a1)
    {
        return a1.d;
    }

    static SwipeRefreshLayout2 G(a a1)
    {
        return a1.f;
    }

    static SwipeRefreshLayout2 H(a a1)
    {
        return a1.f;
    }

    static boolean I(a a1)
    {
        a1.e = false;
        return false;
    }

    static LinearLayout J(a a1)
    {
        return a1.y;
    }

    static View K(a a1)
    {
        return a1.x;
    }

    static e a(e e1)
    {
        return b(e1);
    }

    static SwipeRefreshLayout2 a(a a1)
    {
        return a1.f;
    }

    static void a(a a1, int i1)
    {
        a1.a(i1);
    }

    static boolean a(a a1, long l1, int i1)
    {
        UploadProgressStatusView uploadprogressstatusview = (UploadProgressStatusView)a1.y.findViewWithTag(Long.valueOf(l1));
        if (uploadprogressstatusview != null)
        {
            uploadprogressstatusview.a(1);
            uploadprogressstatusview.b(i1);
            if (i1 == 100)
            {
                a1.y.removeView(uploadprogressstatusview);
                a1.onRefresh();
            }
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(a a1, boolean flag)
    {
        a1.z = flag;
        return flag;
    }

    private static e b(e e1)
    {
        if (e1 == null || e1.isEmpty())
        {
            return e1;
        }
        List list = com.roidapp.cloudlib.sns.basepost.d.a().c();
        e e2 = new e();
        e1 = e1.iterator();
        do
        {
            if (!e1.hasNext())
            {
                break;
            }
            n n1 = (n)e1.next();
            if (!n1.g)
            {
                e2.add(n1);
            } else
            if (!list.contains(Long.valueOf(n1.b.a)))
            {
                com.roidapp.cloudlib.sns.g.b.a();
                if (com.roidapp.cloudlib.sns.g.f.a(com.roidapp.cloudlib.sns.g.b.a(n1.b), n1.b.q) == c.c)
                {
                    e2.add(n1);
                }
            }
        } while (true);
        return e2;
    }

    static void b(a a1, int i1)
    {
        a1.a(i1);
    }

    static boolean b(a a1)
    {
        a1.g = false;
        return false;
    }

    static ProgressBar c(a a1)
    {
        return a1.a;
    }

    static void c(a a1, int i1)
    {
        a1.a(i1);
    }

    static ProgressBar d(a a1)
    {
        return a1.a;
    }

    static SwipeRefreshLayout2 e(a a1)
    {
        return a1.f;
    }

    static SwipeRefreshLayout2 f(a a1)
    {
        return a1.f;
    }

    static boolean g(a a1)
    {
        a1.e = false;
        return false;
    }

    static SwipeRefreshLayout2 h(a a1)
    {
        return a1.f;
    }

    static ProgressBar i(a a1)
    {
        return a1.a;
    }

    static ProgressBar j(a a1)
    {
        return a1.a;
    }

    static bc k(a a1)
    {
        return a1.d;
    }

    static bc l(a a1)
    {
        return a1.d;
    }

    static SwipeRefreshLayout2 m(a a1)
    {
        return a1.f;
    }

    static SwipeRefreshLayout2 n(a a1)
    {
        return a1.f;
    }

    static boolean o(a a1)
    {
        a1.e = false;
        return false;
    }

    static SwipeRefreshLayout2 p(a a1)
    {
        return a1.f;
    }

    static ProgressBar q(a a1)
    {
        return a1.a;
    }

    static ProgressBar r(a a1)
    {
        return a1.a;
    }

    static SwipeRefreshLayout2 s(a a1)
    {
        return a1.f;
    }

    static boolean t(a a1)
    {
        return a1.g;
    }

    static SwipeRefreshLayout2 u(a a1)
    {
        return a1.f;
    }

    static boolean v(a a1)
    {
        a1.e = false;
        return false;
    }

    static SwipeRefreshLayout2 w(a a1)
    {
        return a1.f;
    }

    static SwipeRefreshLayout2 x(a a1)
    {
        return a1.f;
    }

    static bc y(a a1)
    {
        return a1.d;
    }

    static o z(a a1)
    {
        a1.w = null;
        return null;
    }

    protected final void a(long l1)
    {
        super.a(l1);
        if (d != null)
        {
            d.a(l1);
        }
    }

    protected final void a(View view, LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(view, layoutinflater, viewgroup, bundle);
    }

    protected final void a(e e1, boolean flag, boolean flag1)
    {
        super.a(b(e1), flag, flag1);
    }

    public final void a(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            i i1 = (i)collection.next();
            long l1 = i1.e;
            byte byte0 = i1.f;
            UploadProgressStatusView uploadprogressstatusview = (UploadProgressStatusView)y.findViewWithTag(Long.valueOf(l1));
            if (uploadprogressstatusview == null)
            {
                uploadprogressstatusview = new UploadProgressStatusView(getActivity());
                uploadprogressstatusview.setTag(Long.valueOf(l1));
                uploadprogressstatusview.a(byte0);
                uploadprogressstatusview.b(i1.d);
                uploadprogressstatusview.a(i1.a);
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutparams.bottomMargin = 20;
                uploadprogressstatusview.setLayoutParams(layoutparams);
                y.addView(uploadprogressstatusview);
                uploadprogressstatusview.a(new com.roidapp.cloudlib.sns.d.e(this, uploadprogressstatusview, i1));
            } else
            {
                uploadprogressstatusview.a(byte0);
                uploadprogressstatusview.b(i1.d);
            }
        }

    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        al.g().a("Feed");
        al.g().b(getActivity(), "FeedPage");
        com.roidapp.baselib.c.b.b("FeedPage");
        f.setEnabled(false);
        if (flag)
        {
            com.roidapp.cloudlib.sns.basepost.d.a().b();
            s.l_();
            if (f != null && g)
            {
                f.setEnabled(true);
                f.a(true);
            } else
            {
                a.setVisibility(0);
            }
            e = true;
            com.roidapp.cloudlib.sns.q.c(i.a, h.a, 1, A).a(this);
        } else
        if (!e)
        {
            a(m, true, false);
            return;
        }
    }

    protected final void b()
    {
        super.b();
        if (w != null)
        {
            w.f();
            if (f.c())
            {
                f.a();
            }
            e = false;
        }
        if (d != null)
        {
            if (d.i())
            {
                com.roidapp.baselib.c.b.e("FeedPage");
            }
            int i1 = g();
            if (i1 != -1)
            {
                com.roidapp.baselib.c.b.b("FeedPage", i1);
            }
        }
        com.roidapp.baselib.c.b.a("FeedPage", a());
        com.roidapp.cloudlib.sns.basepost.d.a().d();
    }

    public final void b(boolean flag)
    {
        super.b(flag);
        if (flag)
        {
            k.removeAllViews();
            v = (ViewGroup)LayoutInflater.from(getActivity()).inflate(as.x, k, false);
            TextView textview = (TextView)v.findViewById(ar.aG);
            if (!com.roidapp.baselib.e.l.b(getActivity()))
            {
                textview.setText(at.aG);
            }
            k.addView(v);
            k.setVisibility(0);
        } else
        if (k != null && k.getVisibility() == 0)
        {
            k.removeAllViews();
            k.setVisibility(8);
            return;
        }
    }

    protected final void d()
    {
        j = LayoutInflater.from(getActivity()).inflate(as.y, b, false);
        y = (LinearLayout)j.findViewById(ar.J);
        a(com.roidapp.cloudlib.sns.upload.e.a().c());
        c.a(j);
        x = j.findViewById(ar.K);
        if (y != null && y.getChildCount() > 0)
        {
            x.setVisibility(0);
        } else
        {
            x.setVisibility(8);
        }
        com.roidapp.cloudlib.sns.upload.e.a().a(B);
    }

    protected final void f()
    {
        super.f();
        r = true;
    }

    public final boolean j()
    {
        super.j();
        while (z || e) 
        {
            return false;
        }
        e = true;
        w = com.roidapp.cloudlib.sns.q.c(i.a, h.a, d.f() + 1, new com.roidapp.cloudlib.sns.d.c(this));
        w.l();
        w.a(this);
        return true;
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        com.roidapp.cloudlib.sns.upload.e.a().b(B);
    }

    public final void onRefresh()
    {
        super.onRefresh();
        if (af.a(getActivity()))
        {
            e = true;
            if (!f.b())
            {
                f.a(true);
            }
            if (w != null)
            {
                w.f();
                if (f.c())
                {
                    f.a();
                }
            }
            if (d != null)
            {
                d.d();
                d.a(true);
            }
            i = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
            h = i.b;
            o o1 = com.roidapp.cloudlib.sns.q.c(i.a, h.a, 1, A);
            o1.l();
            o1.a(this);
        }
    }

    public final void p()
    {
        super.p();
        getActivity();
        com.roidapp.baselib.c.b.a("SNS", "UpGlide", "SNS/UpGlide/Feed");
        al.g().a(getActivity(), "SNS", "UpGlide", "SNS/UpGlide/Feed", Long.valueOf(1L));
    }
}
