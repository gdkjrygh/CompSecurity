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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.bumptech.glide.a;
import com.bumptech.glide.d;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.a.h;
import com.roidapp.cloudlib.sns.main.b;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.modifiedrefresh.x;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.b:
//            k, m, a, l

public final class j extends b
    implements android.view.View.OnClickListener, android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, x
{

    private ListView a;
    private View b;
    private TextView c;
    private SwipeRefreshLayout2 d;
    private TextView e;
    private TextView f;
    private m g;
    private List h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private String n;
    private o o;
    private boolean p;
    private boolean q;

    public j()
    {
        j = 1;
        k = 1;
    }

    static void a(j j1, h h1)
    {
        if (j1.p) goto _L2; else goto _L1
_L1:
        j1.l();
        if (j1.j != 1) goto _L4; else goto _L3
_L3:
        j1.g();
        j1.h = h1;
        if (h1 != null && h1.size() > 0)
        {
            h1.size();
            if (j1.n != null && j1.n.length() == 1)
            {
                j1.i();
            }
        } else
        if (j1.n != null && j1.n.length() == 1)
        {
            j1.i();
        } else
        {
            j1.a(at.ac);
        }
_L6:
        j1.k();
_L2:
        return;
_L4:
        if (h1 != null && h1.size() > 0)
        {
            if (j1.h != null)
            {
                j1.h.addAll(h1);
            } else
            {
                j1.h = h1;
            }
            h1.size();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void a(j j1, String s, ImageView imageview)
    {
        com.bumptech.glide.h.a(j1).a(s).i().a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(imageview));
    }

    static void a(j j1, boolean flag)
    {
label0:
        {
            if (!j1.p)
            {
                j1.q = flag;
                j1.l();
                j1.j = j1.k;
                if (j1.h == null || j1.h.size() <= 0)
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    j1.c(at.e);
                }
            }
            return;
        }
        j1.c(at.t);
    }

    static boolean a(j j1)
    {
        j1.m = false;
        return false;
    }

    static List b(j j1)
    {
        return j1.h;
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
        p = false;
        if (o != null)
        {
            o.f();
        }
        if (h != null)
        {
            h.clear();
        }
        k();
        n = s;
        o = com.roidapp.cloudlib.sns.q.a(false, s, new k(this));
        o.l();
        o.a(this);
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
        if (g != null && g.getCount() > 0) goto _L2; else goto _L1
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
        if (g == null)
        {
            g = new m(this);
            a.setAdapter(g);
        }
        g.notifyDataSetChanged();
        int i1 = (j - 1) * 20 - 1;
        if (h != null && i1 >= 0 && i1 < h.size())
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
        h = null;
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
        if (g == null)
        {
            g = new m(this);
        }
        a.setAdapter(g);
        if (i)
        {
            i = false;
            j = 1;
            k = 1;
        } else
        if (g.getCount() == 1 && n != null && n.length() == 1)
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
        i = true;
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
        e.setText(at.ac);
        f.setOnClickListener(this);
        com.roidapp.cloudlib.sns.f.a.a().a("Usersearch_Page", 1);
        return layoutinflater;
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (af.a(getActivity()))
        {
            if (h != null && h.size() > i1)
            {
                adapterview = (com.roidapp.cloudlib.sns.b.x)h.get(i1);
                if (adapterview != null)
                {
                    adapterview = com.roidapp.cloudlib.sns.h.h.a(((com.roidapp.cloudlib.sns.b.x) (adapterview)).a, ((com.roidapp.cloudlib.sns.b.x) (adapterview)).b, ((com.roidapp.cloudlib.sns.b.x) (adapterview)).h);
                    adapterview.C();
                    ((com.roidapp.cloudlib.b.a)getParentFragment()).a(adapterview);
                }
            }
        } else
        if (!s())
        {
            af.a(getActivity(), new l(this), "Usersearch_Page");
            return;
        }
    }

    public final void onRefresh()
    {
        if (!l)
        {
            l = true;
            k = j;
            j = 1;
            c(((com.roidapp.cloudlib.b.a)getParentFragment()).e());
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
