// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.main.b;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.modifiedrefresh.x;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;
import com.roidapp.cloudlib.sns.topic.e;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.b:
//            h, i, a

public final class g extends b
    implements android.view.View.OnClickListener, android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, x
{

    private ListView a;
    private View b;
    private TextView c;
    private SwipeRefreshLayout2 d;
    private TextView e;
    private TextView f;
    private List g;
    private boolean h;
    private i i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private String n;
    private o o;
    private boolean p;
    private boolean q;

    public g()
    {
        j = 1;
        k = 1;
    }

    static void a(g g1, com.roidapp.cloudlib.sns.b.a.g g2)
    {
        if (g1.p) goto _L2; else goto _L1
_L1:
        g1.l();
        if (g1.j != 1) goto _L4; else goto _L3
_L3:
        g1.g();
        g1.g = g2;
        if (g2 != null && g2.size() > 0)
        {
            g2.size();
            if (g1.n != null && g1.n.length() == 1)
            {
                g1.i();
            }
        } else
        if (g1.n != null && g1.n.length() == 1)
        {
            g1.i();
        } else
        {
            g1.a(at.ad);
        }
_L6:
        g1.k();
_L2:
        return;
_L4:
        if (g2 != null && g2.size() > 0)
        {
            if (g1.g != null)
            {
                g1.g.addAll(g2);
            } else
            {
                g1.g = g2;
            }
            g2.size();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void a(g g1, boolean flag)
    {
label0:
        {
            if (!g1.p)
            {
                g1.q = flag;
                g1.l();
                g1.j = g1.k;
                if (g1.g == null || g1.g.size() <= 0)
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    g1.c(at.e);
                }
            }
            return;
        }
        g1.c(at.t);
    }

    static boolean a(g g1)
    {
        g1.m = false;
        return false;
    }

    static List b(g g1)
    {
        return g1.g;
    }

    private void c(int i1)
    {
        g();
        h();
        if (f.getVisibility() != 0)
        {
            f.setVisibility(0);
        }
        f.setText(i1);
    }

    private void c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        p = false;
        if (o != null)
        {
            o.f();
        }
        if (g != null)
        {
            g.clear();
        }
        k();
        n = s;
        o = com.roidapp.cloudlib.sns.q.a(s, new h(this));
        o.l();
        o.a(this);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private void g()
    {
        if (b.getVisibility() != 8)
        {
            b.setVisibility(8);
        }
    }

    private void h()
    {
        if (e.getVisibility() != 8)
        {
            e.setVisibility(8);
        }
    }

    private void i()
    {
        if (i != null && i.getCount() > 0) goto _L2; else goto _L1
_L1:
        g();
_L4:
        j();
        if (e.getVisibility() != 0)
        {
            e.setVisibility(0);
        }
        e.setText(at.aB);
        return;
_L2:
        if (b.getVisibility() != 4)
        {
            b.setVisibility(4);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void j()
    {
        if (f.getVisibility() != 8)
        {
            f.setVisibility(8);
        }
    }

    private void k()
    {
        if (i == null)
        {
            i = new i(this);
            a.setAdapter(i);
        }
        i.notifyDataSetChanged();
        int i1 = (j - 1) * 20 - 1;
        if (g != null && i1 >= 0 && i1 < g.size())
        {
            a.setSelection(i1);
        }
    }

    private void l()
    {
        if (l)
        {
            l = false;
            if (d.b())
            {
                d.a(false);
            }
        }
    }

    public final void a(int i1)
    {
        g();
        j();
        if (e.getVisibility() != 0)
        {
            e.setVisibility(0);
        }
        e.setText(i1);
    }

    public final void a(String s)
    {
        n = s;
    }

    public final void b(String s)
    {
label0:
        {
            if (isAdded() && isVisible())
            {
                if (s == null || n != null && s.equals(n) && s.length() != 1)
                {
                    break label0;
                }
                h();
                j();
                if (b.getVisibility() != 0)
                {
                    b.setVisibility(0);
                }
                c.setText(getString(at.aC, new Object[] {
                    s
                }));
                c(s);
            }
            return;
        }
        m = false;
    }

    public final void c()
    {
        g();
        h();
        j();
        g = null;
        k();
    }

    public final void d()
    {
        if (!m)
        {
            m = true;
        }
    }

    public final boolean e()
    {
        return m;
    }

    public final void f()
    {
        p = true;
        if (o != null)
        {
            o.f();
        }
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (i == null)
        {
            i = new i(this);
        }
        a.setAdapter(i);
        if (h)
        {
            h = false;
            j = 1;
            k = 1;
        } else
        if (i.getCount() == 1 && n != null && n.length() == 1)
        {
            i();
            return;
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public final void onClick(View view)
    {
        if (f.equals(view) && q)
        {
            startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.R, null);
        a = (ListView)layoutinflater.findViewById(ar.cg);
        b = layoutinflater.findViewById(ar.cf);
        c = (TextView)layoutinflater.findViewById(ar.ce);
        e = (TextView)layoutinflater.findViewById(ar.bY);
        f = (TextView)layoutinflater.findViewById(ar.bZ);
        d = (SwipeRefreshLayout2)layoutinflater.findViewById(ar.cm);
        a(d, false, false);
        d.setEnabled(false);
        d.a(this);
        a.setOnItemClickListener(this);
        e.setText(at.ad);
        f.setOnClickListener(this);
        return layoutinflater;
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (g != null && g.size() > i1)
        {
            adapterview = new e();
            adapterview.a((String)g.get(i1), "Hashtagsearch_%s_Page");
            ((a)getParentFragment()).a(adapterview);
        }
    }

    public final void onRefresh()
    {
        if (!l)
        {
            l = true;
            k = j;
            j = 1;
            c(((a)getParentFragment()).e());
        }
    }

    public final void onResume()
    {
        super.onResume();
    }

    public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i1)
    {
    }
}
