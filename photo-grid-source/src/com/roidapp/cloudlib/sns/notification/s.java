// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.basepost.h;
import com.roidapp.cloudlib.sns.basepost.u;
import com.roidapp.cloudlib.sns.g.a;
import com.roidapp.cloudlib.sns.g.b;
import com.roidapp.cloudlib.sns.g.f;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;
import com.roidapp.cloudlib.sns.w;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            t, u, v, w

public final class s extends h
    implements u
{

    private n v;
    private int w;
    private String x;
    private final w y = new t(this);

    public s()
    {
    }

    static n a(s s1, n n1)
    {
        s1.v = n1;
        return n1;
    }

    static boolean a(s s1)
    {
        s1.e = false;
        return false;
    }

    static SwipeRefreshLayout2 b(s s1)
    {
        return s1.f;
    }

    static SwipeRefreshLayout2 c(s s1)
    {
        return s1.f;
    }

    static ProgressBar d(s s1)
    {
        return s1.a;
    }

    static boolean e(s s1)
    {
        s1.e = false;
        return false;
    }

    static boolean f(s s1)
    {
        return s1.z();
    }

    static SwipeRefreshLayout2 g(s s1)
    {
        return s1.f;
    }

    static SwipeRefreshLayout2 h(s s1)
    {
        return s1.f;
    }

    static void i(s s1)
    {
        if (s1.v != null)
        {
            s1.a(at.X);
            return;
        }
        s1.k.removeAllViews();
        ViewGroup viewgroup = (ViewGroup)LayoutInflater.from(s1.getActivity()).inflate(as.x, s1.k, false);
        TextView textview = (TextView)viewgroup.findViewById(ar.aG);
        ImageView imageview = (ImageView)viewgroup.findViewById(ar.aH);
        if (!l.b(s1.getActivity()))
        {
            textview.setText(s1.getActivity().getString(at.e));
            imageview.setOnClickListener(new com.roidapp.cloudlib.sns.notification.u(s1));
            imageview.setVisibility(0);
        } else
        {
            textview.setText(s1.getActivity().getString(at.X));
            imageview.setVisibility(8);
        }
        s1.k.addView(viewgroup);
        s1.k.setVisibility(0);
    }

    static ProgressBar j(s s1)
    {
        return s1.a;
    }

    public final View a(Context context)
    {
        context = new ab(context);
        context.a(u);
        context.a(x);
        return context;
    }

    public final void a(int k, String s1)
    {
        w = k;
        v = null;
        x = s1;
    }

    protected final void a(View view, LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(view, layoutinflater, viewgroup, bundle);
        if (v != null)
        {
            view = new e();
            view.add(v);
            super.a(view, true, false);
        } else
        {
            k.removeAllViews();
            view = (ViewGroup)LayoutInflater.from(getActivity()).inflate(as.x, k, false);
            layoutinflater = (TextView)view.findViewById(ar.aG);
            viewgroup = (ImageView)view.findViewById(ar.aH);
            if (!l.b(getActivity()))
            {
                layoutinflater.setText(getActivity().getString(at.e));
                viewgroup.setOnClickListener(new v(this));
                viewgroup.setVisibility(0);
                k.addView(view);
                k.setVisibility(0);
                return;
            }
        }
    }

    protected final void a(e e1, boolean flag, boolean flag1)
    {
        super.a(e1, flag, flag1);
    }

    public final void a(com.roidapp.cloudlib.sns.g.e e1, Object obj)
    {
        if (com.roidapp.cloudlib.sns.g.e.c == e1)
        {
            if (getUserVisibleHint())
            {
                h_();
            }
            return;
        } else
        {
            super.a(e1, obj);
            return;
        }
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        al.g().a("PostDetail");
        if (flag)
        {
            if (af.a(getActivity()))
            {
                a.setVisibility(0);
                q.d(i.a, i.b.a, w, y).a(this);
            }
            return;
        } else
        {
            super.a(m, true, false);
            return;
        }
    }

    protected final void b()
    {
        super.b();
    }

    public final void b(boolean flag)
    {
        if (getActivity() != null && !getActivity().isFinishing())
        {
            if (flag)
            {
                k.removeAllViews();
                ViewGroup viewgroup = (ViewGroup)LayoutInflater.from(getActivity()).inflate(as.x, k, false);
                TextView textview = (TextView)viewgroup.findViewById(ar.aG);
                ImageView imageview = (ImageView)viewgroup.findViewById(ar.aH);
                if (!l.b(getActivity()))
                {
                    textview.setText(getActivity().getString(at.aG));
                    imageview.setOnClickListener(new com.roidapp.cloudlib.sns.notification.w(this));
                    imageview.setVisibility(0);
                } else
                {
                    textview.setText(getActivity().getString(at.X));
                    imageview.setVisibility(8);
                }
                k.addView(viewgroup);
                k.setVisibility(0);
                return;
            }
            if (k != null && k.getVisibility() == 0)
            {
                k.removeAllViews();
                k.setVisibility(8);
                return;
            }
        }
    }

    protected final void f()
    {
        super.f();
        r = false;
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
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
            if (d != null)
            {
                d.d();
                d.a(true);
            }
            i = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
            h = i.b;
            o o1 = q.d(i.a, i.b.a, w, y);
            o1.l();
            o1.a(this);
        } else
        if (f.b())
        {
            f.a(false);
            return;
        }
    }

    public final void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        if (flag && v != null && v.a != null && v.b != null)
        {
            com.roidapp.cloudlib.sns.g.b.a();
            if (com.roidapp.cloudlib.sns.g.a.a(com.roidapp.cloudlib.sns.g.f.b(com.roidapp.cloudlib.sns.g.b.a(v.b), v.a.a)))
            {
                h_();
            }
        }
    }
}
