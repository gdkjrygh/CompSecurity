// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.Toast;
import com.qihoo.security.appbox.core.c;
import com.qihoo.security.appbox.ui.receiver.AppBoxReceiver;
import com.qihoo.security.appbox.ui.view.FooterLoadingView;
import com.qihoo.security.appbox.ui.view.a;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.language.b;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BaseAppBoxFragment extends ListFragment
    implements android.view.View.OnClickListener, android.widget.AbsListView.OnScrollListener, com.qihoo.security.appbox.ui.receiver.AppBoxReceiver.a
{

    protected a i;
    protected ListView j;
    protected View k;
    protected View l;
    protected FooterLoadingView m;
    protected final AtomicBoolean n = new AtomicBoolean(false);
    protected final AtomicBoolean o = new AtomicBoolean(false);
    protected final AtomicBoolean p = new AtomicBoolean(false);
    protected final AtomicBoolean q = new AtomicBoolean(false);
    protected Context r;
    protected AppBoxReceiver s;
    protected String t;
    protected int u;
    protected long v;
    protected Handler w;
    protected long x;

    public BaseAppBoxFragment()
    {
        k = null;
        l = null;
        u = 0;
        w = new Handler(Looper.getMainLooper());
    }

    private void a(String s1, boolean flag)
    {
        if (i != null)
        {
            List list = i.a();
            if (list != null)
            {
                Iterator iterator = list.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    c c1 = (c)iterator.next();
                    if (c1.k != null && c1.k.equals(s1))
                    {
                        c1.c = flag;
                    }
                } while (true);
                i.a(list);
            }
        }
    }

    protected void a(String s1)
    {
        t = s1;
    }

    protected void b()
    {
        String s1 = com.qihoo.security.appbox.a.a.a();
        String s2 = SharedPref.b(r, "appbox_last_time_use_language", "");
        if (s2 != null && !s2.equals(s1))
        {
            com.qihoo.security.appbox.core.a.a().f();
        }
    }

    public void b(String s1)
    {
        a(s1, true);
    }

    protected void c()
    {
    }

    public void c(String s1)
    {
        a(s1, false);
    }

    protected void d()
    {
        if (com.qihoo.security.locale.language.b.a(r))
        {
            if (com.qihoo360.mobilesafe.b.o.a(r, "com.facebook.katana") && com.qihoo360.mobilesafe.b.o.e(r) && com.qihoo.security.appbox.core.a.a().b() && android.os.Build.VERSION.SDK_INT > 10)
            {
                e();
            } else
            {
                com.qihoo.security.appbox.core.a.a().e();
            }
            b();
            return;
        } else
        {
            f();
            return;
        }
    }

    protected void e()
    {
    }

    protected void f()
    {
        if (com.qihoo.security.locale.language.b.a(r))
        {
            com.qihoo.security.support.b.c(26011);
        }
        k.setVisibility(8);
        i.a(null);
    }

    public void g()
    {
        if (i != null)
        {
            i.notifyDataSetChanged();
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        r = getActivity().getApplicationContext();
        s = new AppBoxReceiver(this);
        s.a(r);
        i = new a(r, null, t);
        j.setAdapter(i);
        w.postDelayed(new Runnable() {

            final BaseAppBoxFragment a;

            public void run()
            {
                a.d();
            }

            
            {
                a = BaseAppBoxFragment.this;
                super();
            }
        }, x);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131427475: 
            if (!com.qihoo.security.locale.language.b.a(r))
            {
                Toast.makeText(r, com.qihoo.security.locale.d.a().a(0x7f0c01c0), 0).show();
                return;
            } else
            {
                b();
                return;
            }

        case 2131427617: 
            b();
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030023, null);
        k = layoutinflater.findViewById(0x7f0b009b);
        k.setVisibility(0);
        l = layoutinflater.findViewById(0x7f0b0093);
        l.setOnClickListener(this);
        return layoutinflater;
    }

    public void onDestroy()
    {
        if (s != null)
        {
            r.unregisterReceiver(s);
        }
        com.qihoo.security.appbox.c.a.b.a().b();
        super.onDestroy();
    }

    public void onDetach()
    {
        super.onDetach();
        if (i != null)
        {
            i.c();
        }
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        while (k1 <= 1 || n.get() || o.get() || p.get() || abslistview.getLastVisiblePosition() != k1 - 1) 
        {
            return;
        }
        m.b();
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        i1;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 29
    //                   1 28
    //                   2 28;
           goto _L1 _L2 _L1 _L1
_L1:
        return;
_L2:
        if (!n.get() && !o.get() && !p.get() && abslistview.getLastVisiblePosition() == abslistview.getCount() - 1)
        {
            c();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        j = a();
        j.setEmptyView(l);
        m = new FooterLoadingView(getActivity());
        m.setFooterClickListener(this);
        j.addFooterView(m);
        j.setOnScrollListener(this);
    }
}
