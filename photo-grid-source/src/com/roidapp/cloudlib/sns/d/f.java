// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.basepost.h;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;

// Referenced classes of package com.roidapp.cloudlib.sns.d:
//            g, h, i

public final class f extends h
{

    private ViewGroup v;
    private o w;
    private boolean x;
    private final aa y = new g(this);

    public f()
    {
        x = false;
    }

    static void a(f f1, int i1)
    {
        f1.a(i1);
    }

    static boolean a(f f1)
    {
        f1.g = false;
        return false;
    }

    static void b(f f1, int i1)
    {
        f1.a(i1);
    }

    static boolean b(f f1)
    {
        f1.x = false;
        return false;
    }

    static ProgressBar c(f f1)
    {
        return f1.a;
    }

    static ProgressBar d(f f1)
    {
        return f1.a;
    }

    static SwipeRefreshLayout2 e(f f1)
    {
        return f1.f;
    }

    static SwipeRefreshLayout2 f(f f1)
    {
        return f1.f;
    }

    static boolean g(f f1)
    {
        f1.e = false;
        return false;
    }

    static ProgressBar h(f f1)
    {
        return f1.a;
    }

    static ProgressBar i(f f1)
    {
        return f1.a;
    }

    static bc j(f f1)
    {
        return f1.d;
    }

    static bc k(f f1)
    {
        return f1.d;
    }

    static SwipeRefreshLayout2 l(f f1)
    {
        return f1.f;
    }

    static SwipeRefreshLayout2 m(f f1)
    {
        return f1.f;
    }

    static boolean n(f f1)
    {
        f1.e = false;
        return false;
    }

    static ProgressBar o(f f1)
    {
        return f1.a;
    }

    static ProgressBar p(f f1)
    {
        return f1.a;
    }

    static SwipeRefreshLayout2 q(f f1)
    {
        return f1.f;
    }

    static boolean r(f f1)
    {
        return f1.g;
    }

    static SwipeRefreshLayout2 s(f f1)
    {
        return f1.f;
    }

    static boolean t(f f1)
    {
        f1.e = false;
        return false;
    }

    protected final void a(View view, LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(view, layoutinflater, viewgroup, bundle);
    }

    protected final void a(e e1, boolean flag, boolean flag1)
    {
        super.a(e1, flag, flag1);
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        al.g().a("FeedPublic");
        al.g().b(getActivity(), "FeedPublicPage");
        com.roidapp.baselib.c.b.b("FeedPublicPage");
        if (flag)
        {
            if (f != null && g)
            {
                f.setEnabled(true);
                f.a(true);
            } else
            {
                a.setVisibility(0);
            }
            com.roidapp.cloudlib.sns.q.e(y).a(this);
        } else
        if (!e)
        {
            super.a(m, true, false);
            return;
        }
    }

    protected final void b()
    {
        super.b();
        if (d != null)
        {
            if (d.i())
            {
                com.roidapp.baselib.c.b.e("FeedPublicPage");
            }
            int i1 = g();
            if (i1 != -1)
            {
                com.roidapp.baselib.c.b.b("FeedPublicPage", i1);
            }
        }
        com.roidapp.baselib.c.b.a("FeedPublicPage", a());
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
            } else
            {
                textview.setText(at.t);
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
        j = LayoutInflater.from(getActivity()).inflate(as.w, b, false);
        com.roidapp.cloudlib.sns.d.h h1 = new com.roidapp.cloudlib.sns.d.h(this);
        ImageView imageview = (ImageView)j.findViewById(ar.A);
        com.roidapp.baselib.c.n.a(imageview, aq.C);
        imageview.setOnClickListener(h1);
        imageview = (ImageView)j.findViewById(ar.y);
        com.roidapp.baselib.c.n.a(imageview, aq.A);
        imageview.setOnClickListener(h1);
        imageview = (ImageView)j.findViewById(ar.z);
        if (al.g().e(aj.a()))
        {
            com.roidapp.baselib.c.n.a(imageview, aq.B);
            imageview.setOnClickListener(h1);
        } else
        {
            imageview.setVisibility(8);
        }
        l.addView(j);
        l.setVisibility(0);
    }

    protected final void f()
    {
        super.f();
        o = true;
        n = false;
        p = false;
        r = false;
        q = false;
    }

    public final void k()
    {
        super.k();
        if (!s())
        {
            af.a(getActivity(), new i(this), "FeedPublic");
        }
    }

    public final void onRefresh()
    {
        super.onRefresh();
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
        o o1 = com.roidapp.cloudlib.sns.q.e(y);
        o1.l();
        o1.a(this);
    }
}
