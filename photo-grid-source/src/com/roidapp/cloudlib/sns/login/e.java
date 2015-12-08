// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.login;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.f.a;
import com.roidapp.cloudlib.sns.i;
import com.roidapp.cloudlib.sns.main.b;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.modifiedrefresh.x;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.cloudlib.sns.login:
//            a, f, g, h, 
//            i

public final class e extends b
    implements android.widget.AbsListView.OnScrollListener, x
{

    private ListView a;
    private TextView b;
    private com.roidapp.cloudlib.sns.b.x c;
    private p d;
    private boolean e;
    private com.roidapp.cloudlib.sns.login.a f;
    private long g;
    private boolean h;
    private boolean i;
    private boolean j;
    private com.roidapp.cloudlib.sns.b.a.b k;
    private SwipeRefreshLayout2 l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;

    public e()
    {
        o = 1;
    }

    static com.roidapp.cloudlib.sns.b.a.b a(e e1, com.roidapp.cloudlib.sns.b.a.b b1)
    {
        e1.k = b1;
        return b1;
    }

    static void a(e e1)
    {
        e1.i();
    }

    static void b(e e1)
    {
        e1.g();
    }

    private void g()
    {
        l.setEnabled(true);
        i = false;
        if (l.b())
        {
            l.a(false);
        }
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (!af.a(getActivity()))
        {
            break MISSING_BLOCK_LABEL_133;
        }
        if (f == null || f.getCount() != n || i) goto _L2; else goto _L1
_L1:
        i = true;
        l.a(true);
        l.setEnabled(false);
        p = o;
        o = o + 1;
        if (!h) goto _L4; else goto _L3
_L3:
        if (!e) goto _L6; else goto _L5
_L5:
        l();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        m();
          goto _L2
        Exception exception;
        exception;
        throw exception;
_L4:
label0:
        {
            if (!e)
            {
                break label0;
            }
            n();
        }
          goto _L2
        o();
          goto _L2
        if (l.b())
        {
            l.a(false);
        }
        an.a(getActivity(), at.aq);
          goto _L2
    }

    private void i()
    {
label0:
        {
            if (f == null)
            {
                long l2 = 0L;
                long l1 = l2;
                if (d != null)
                {
                    l1 = l2;
                    if (d.b != null)
                    {
                        l1 = d.b.a;
                    }
                }
                com.roidapp.cloudlib.sns.b.a.b b1 = k;
                String s;
                if (e)
                {
                    s = "Following_Page";
                } else
                {
                    s = "Followers_Page";
                }
                f = new com.roidapp.cloudlib.sns.login.a(this, b1, l1, s);
                a.setAdapter(f);
            } else
            {
                if (k != null)
                {
                    f.a(k);
                } else
                {
                    f.a(new ArrayList());
                }
                f.notifyDataSetChanged();
            }
            if (o == 1)
            {
                if (f != null && f.getCount() > 0)
                {
                    break label0;
                }
                j();
            }
            return;
        }
        k();
    }

    private void j()
    {
        if (q)
        {
            b.setText(at.ar);
        } else
        {
            b.setText(at.Z);
        }
        if (b.getVisibility() != 0)
        {
            b.setVisibility(0);
        }
    }

    private void k()
    {
        if (b.getVisibility() != 8)
        {
            b.setVisibility(8);
        }
    }

    private void l()
    {
        o o1 = com.roidapp.cloudlib.sns.q.b(d.a, c.a, g, o, new f(this));
        o1.l();
        o1.a(this);
    }

    private void m()
    {
        o o1 = com.roidapp.cloudlib.sns.q.c(d.a, c.a, g, o, new g(this));
        o1.l();
        o1.a(this);
    }

    private void n()
    {
        o o1 = com.roidapp.cloudlib.sns.q.a(d.a, c.a, o, new h(this));
        o1.l();
        o1.a(this);
    }

    private void o()
    {
        o o1 = com.roidapp.cloudlib.sns.q.b(d.a, c.a, o, new com.roidapp.cloudlib.sns.login.i(this));
        o1.l();
        o1.a(this);
    }

    public final View a(Context context)
    {
        context = new ab(context);
        context.a(u);
        if (e)
        {
            context.a(at.bi);
            return context;
        } else
        {
            context.a(at.O);
            return context;
        }
    }

    public final void a(long l1)
    {
        g = l1;
    }

    public final void a(com.roidapp.cloudlib.sns.b.a.b b1)
    {
        this;
        JVM INSTR monitorenter ;
        n = o * 20;
        if (o != 1) goto _L2; else goto _L1
_L1:
        k = b1;
        q = true;
_L4:
        if (z())
        {
            i();
        }
        g();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (k == null || b1 == null) goto _L4; else goto _L3
_L3:
        k.addAll(b1);
          goto _L4
        b1;
        throw b1;
    }

    public final void a(com.roidapp.cloudlib.sns.g.e e1, Object obj)
    {
        if (e1 == com.roidapp.cloudlib.sns.g.e.a && f != null)
        {
            f.notifyDataSetChanged();
        }
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        if (e)
        {
            com.roidapp.cloudlib.sns.f.a.a().a("Following_Page", 1);
            al.g().b(getActivity(), "Following page");
            com.roidapp.baselib.c.b.b("Following page");
            return;
        } else
        {
            com.roidapp.cloudlib.sns.f.a.a().a("Followers_Page", 1);
            al.g().b(getActivity(), "Followers page");
            com.roidapp.baselib.c.b.b("Followers page");
            return;
        }
    }

    protected final void b()
    {
        super.b();
        String s;
        if (e)
        {
            s = "Following page";
        } else
        {
            s = "Followers page";
        }
        if (f != null)
        {
            if (f.c())
            {
                com.roidapp.baselib.c.b.e(s);
            }
            int i1;
            if (f.getCount() == 0)
            {
                i1 = -1;
            } else
            {
                i1 = a.getFirstVisiblePosition();
            }
            if (i1 != -1)
            {
                com.roidapp.baselib.c.b.b(s, i1);
            }
        }
        com.roidapp.baselib.c.b.a(s, a());
    }

    public final void b(boolean flag)
    {
        e = flag;
    }

    public final void d()
    {
        h = true;
    }

    public final void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (o == 1)
        {
            q = false;
            if (z())
            {
                if (f != null && f.getCount() > 0)
                {
                    break MISSING_BLOCK_LABEL_72;
                }
                j();
            }
        }
_L1:
        o = p;
        v().a(getString(at.at));
        g();
        this;
        JVM INSTR monitorexit ;
        return;
        k();
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = true;
        a(new com.roidapp.cloudlib.sns.g.e[] {
            com.roidapp.cloudlib.sns.g.e.a
        });
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
label0:
        {
label1:
            {
label2:
                {
                    viewgroup = layoutinflater.inflate(as.D, viewgroup, false);
                    b = (TextView)viewgroup.findViewById(ar.u);
                    a = (ListView)viewgroup.findViewById(ar.aS);
                    a.setOnScrollListener(this);
                    l = (SwipeRefreshLayout2)viewgroup.findViewById(ar.cm);
                    a(l, false, false);
                    l.a(this);
                    com.roidapp.cloudlib.sns.a.a.a(a, s.b(), false, Integer.valueOf(hashCode()), this);
                    if (af.a(getActivity()))
                    {
                        d = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
                        c = d.b;
                        if (!j)
                        {
                            break label0;
                        }
                        j = false;
                        l.a(true);
                        if (!h)
                        {
                            break label1;
                        }
                        if (!e)
                        {
                            break label2;
                        }
                        l();
                    }
                    return viewgroup;
                }
                m();
                return viewgroup;
            }
            if (e)
            {
                n();
                return viewgroup;
            } else
            {
                o();
                return viewgroup;
            }
        }
        if (f == null && d != null && d.b != null)
        {
            bundle = k;
            long l1 = d.b.a;
            if (e)
            {
                layoutinflater = "Following_Page";
            } else
            {
                layoutinflater = "Followers_Page";
            }
            f = new com.roidapp.cloudlib.sns.login.a(this, bundle, l1, layoutinflater);
        }
        a.setAdapter(f);
        i();
        return viewgroup;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        if (f != null)
        {
            f.a();
        }
    }

    public final void onRefresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!af.a(getActivity()))
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (i) goto _L2; else goto _L1
_L1:
        i = true;
        l.setEnabled(false);
        p = o;
        o = 1;
        if (!h) goto _L4; else goto _L3
_L3:
        if (!e) goto _L6; else goto _L5
_L5:
        l();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        m();
          goto _L2
        Exception exception;
        exception;
        throw exception;
_L4:
label0:
        {
            if (!e)
            {
                break label0;
            }
            n();
        }
          goto _L2
        o();
          goto _L2
        if (l.b())
        {
            l.a(false);
        }
        an.a(getActivity(), at.aq);
          goto _L2
    }

    public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        boolean flag;
        if (k1 == i1 + j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = flag;
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (m && !i && i1 == 0)
        {
            h();
        }
    }
}
