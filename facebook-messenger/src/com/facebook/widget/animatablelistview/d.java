// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.animatablelistview;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.a.a.a;
import com.a.a.ar;
import com.a.a.q;
import com.facebook.debug.log.b;
import com.google.common.a.es;
import com.google.common.a.hq;
import com.google.common.a.hy;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.widget.animatablelistview:
//            g, h, e, j, 
//            i, a, f, k, 
//            q, AnimatingItemView

public class d
    implements ListAdapter
{

    private static final Class a = com/facebook/widget/animatablelistview/d;
    private final Context b;
    private final com.facebook.widget.animatablelistview.q c;
    private final Map d = (new hy()).f().n();
    private final Map e = (new hy()).f().n();
    private DataSetObservable f;
    private g g;
    private final List h = hq.a();
    private j i;
    private es j;
    private es k;
    private Set l;
    private Set m;
    private boolean n;
    private long o;
    private k p;
    private com.a.a.d q;

    public d(Context context, com.facebook.widget.animatablelistview.q q1)
    {
        g = g.STEADY_STATE;
        l = kl.a();
        m = kl.a();
        o = 300L;
        b = context;
        c = q1;
        j = es.d();
        k = es.d();
        l.add(h());
    }

    private q a(h h1)
    {
        com.facebook.widget.animatablelistview.a a1 = f(h1);
        q q1 = com.a.a.q.a(a1, "animationOffset", new float[] {
            0.0F, -1F
        });
        q1.b(o);
        if (h1.e())
        {
            a(q1, a1);
        }
        for (h1 = m.iterator(); h1.hasNext(); q1.a((ar)h1.next())) { }
        return q1;
    }

    private void a(q q1, com.facebook.widget.animatablelistview.a a1)
    {
        q1.a(new e(this, a1));
    }

    private q b(h h1)
    {
        com.facebook.widget.animatablelistview.a a1 = f(h1);
        q q1 = com.a.a.q.a(a1, "animationOffset", new float[] {
            0.0F, 1.0F
        });
        q1.b(o);
        if (h1.e())
        {
            a(q1, a1);
        }
        for (h1 = m.iterator(); h1.hasNext(); q1.a((ar)h1.next())) { }
        return q1;
    }

    private q c(h h1)
    {
        com.facebook.widget.animatablelistview.a a1 = f(h1);
        q q1 = com.a.a.q.a(a1, "animationOffset", new float[] {
            1.0F, 0.0F
        });
        q1.b(o);
        if (h1.e())
        {
            a(q1, a1);
        }
        for (h1 = m.iterator(); h1.hasNext(); q1.a((ar)h1.next())) { }
        return q1;
    }

    private q d(h h1)
    {
        com.facebook.widget.animatablelistview.a a1 = f(h1);
        q q1 = com.a.a.q.a(a1, "animationOffset", new float[] {
            -1F, 0.0F
        });
        q1.b(o);
        if (h1.e())
        {
            a(q1, a1);
        }
        for (h1 = m.iterator(); h1.hasNext(); q1.a((ar)h1.next())) { }
        return q1;
    }

    private a e(h h1)
    {
        com.facebook.widget.animatablelistview.a a2 = f(h1);
        a a1 = h1.d();
        a1.a(a2);
        if (a1 instanceof com.a.a.d)
        {
            Iterator iterator = ((com.a.a.d)a1).h().iterator();
            do
            {
                h1 = a1;
                if (!iterator.hasNext())
                {
                    break;
                }
                h1 = (a)iterator.next();
                if (h1 instanceof q)
                {
                    h1 = (q)h1;
                    Iterator iterator1 = m.iterator();
                    while (iterator1.hasNext()) 
                    {
                        h1.a((ar)iterator1.next());
                    }
                }
            } while (true);
        } else
        if (a1 instanceof q)
        {
            q q1 = (q)a1;
            Iterator iterator2 = m.iterator();
            do
            {
                h1 = a1;
                if (!iterator2.hasNext())
                {
                    break;
                }
                q1.a((ar)iterator2.next());
            } while (true);
        } else
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Unsupported animation: ").append(a1).toString());
            h1 = null;
        }
        return h1;
    }

    private void e()
    {
        boolean flag;
        for (flag = false; g != g.STEADY_STATE || h.isEmpty();)
        {
            return;
        }

        i = (j)h.remove(0);
        j = i.b();
        g();
        i();
        ArrayList arraylist = hq.a();
        Iterator iterator = i.a().iterator();
label0:
        do
        {
            h h1;
            i i1;
            boolean flag1;
label1:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                h1 = (h)iterator.next();
                i1 = h1.a();
                if (i1 != i.ADD_WITH_ANIMATION_UP && i1 != i.ADD_WITH_ANIMATION_DOWN && i1 != i.REMOVE_WITH_ANIMATION_DOWN && i1 != i.REMOVE_WITH_ANIMATION_UP)
                {
                    flag1 = flag;
                    if (i1 != i.CUSTOM)
                    {
                        break label1;
                    }
                }
                flag1 = true;
            }
            flag = flag1;
            if (!n)
            {
                if (i1 == i.ADD_WITH_ANIMATION_UP)
                {
                    arraylist.add(b(h1));
                    flag = flag1;
                } else
                if (i1 == i.ADD_WITH_ANIMATION_DOWN)
                {
                    arraylist.add(a(h1));
                    flag = flag1;
                } else
                if (i1 == i.REMOVE_WITH_ANIMATION_DOWN)
                {
                    arraylist.add(c(h1));
                    flag = flag1;
                } else
                if (i1 == i.REMOVE_WITH_ANIMATION_UP)
                {
                    arraylist.add(d(h1));
                    flag = flag1;
                } else
                {
                    flag = flag1;
                    if (i1 == i.CUSTOM)
                    {
                        arraylist.add(e(h1));
                        flag = flag1;
                    }
                }
            }
        } while (true);
        if (!flag)
        {
            i = null;
            g = g.STEADY_STATE;
            e();
            return;
        }
        if (n)
        {
            g = g.WAITING_FOR_ANIMATION_TO_FINISH;
            return;
        }
        q = new com.a.a.d();
        com.a.a.b b1;
        for (Iterator iterator1 = l.iterator(); iterator1.hasNext(); q.a(b1))
        {
            b1 = (com.a.a.b)iterator1.next();
        }

        q.a(arraylist);
        q.a();
        g = g.WAITING_FOR_ANIMATION_TO_FINISH;
    }

    private com.facebook.widget.animatablelistview.a f(h h1)
    {
        Object obj = h1.b();
        com.facebook.widget.animatablelistview.a a1 = (com.facebook.widget.animatablelistview.a)d.get(obj);
        obj = a1;
        if (h1.c() != -1)
        {
            obj = a1.a(h1.c());
        }
        return ((com.facebook.widget.animatablelistview.a) (obj));
    }

    private void f()
    {
        j = i.c();
        g();
        i();
        i = null;
        q = null;
        g = g.STEADY_STATE;
        e();
    }

    private void g()
    {
        Iterator iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = iterator.next();
            if ((com.facebook.widget.animatablelistview.a)d.get(obj) == null)
            {
                com.facebook.widget.animatablelistview.a a1 = new com.facebook.widget.animatablelistview.a();
                d.put(obj, a1);
            }
        } while (true);
    }

    private com.a.a.b h()
    {
        return new f(this);
    }

    private void i()
    {
        this;
        JVM INSTR monitorenter ;
        if (f != null)
        {
            f.notifyChanged();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        if (f != null)
        {
            f.notifyInvalidated();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public k a()
    {
        boolean flag;
        if (p == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Already a pending transaction");
        p = new k(this);
        return p;
    }

    public void a(a a1)
    {
        if (a1 == q && g == g.WAITING_FOR_ANIMATION_TO_FINISH)
        {
            f();
        }
    }

    void a(ar ar1)
    {
        m.add(ar1);
    }

    void a(k k1, es es1, es es2, es es3)
    {
        boolean flag;
        if (p == k1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Wrong transaction");
        k1 = new j(es3, es1, es2);
        h.add(k1);
        k = es2;
        p = null;
        e();
    }

    public boolean areAllItemsEnabled()
    {
        return c.b();
    }

    public void b()
    {
        j = es.d();
        k = es.d();
        h.clear();
        q = null;
        p = null;
        i = null;
        g = g.STEADY_STATE;
        j();
    }

    public void b(a a1)
    {
        if (a1 == q && g == g.WAITING_FOR_ANIMATION_TO_FINISH)
        {
            f();
        }
    }

    public es c()
    {
        return j;
    }

    public es d()
    {
        return k;
    }

    public int getCount()
    {
        return j.size();
    }

    public Object getItem(int i1)
    {
        if (i1 >= j.size())
        {
            return null;
        } else
        {
            return j.get(i1);
        }
    }

    public long getItemId(int i1)
    {
        return c.b(getItem(i1));
    }

    public int getItemViewType(int i1)
    {
        Object obj = getItem(i1);
        if (obj == null)
        {
            return -1;
        } else
        {
            return c.c(obj);
        }
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        Object obj;
        view = (AnimatingItemView)view;
        obj = getItem(i1);
        if (view != null) goto _L2; else goto _L1
_L1:
        viewgroup = new AnimatingItemView(b);
        viewgroup.addView(c.a(obj, null, viewgroup));
_L4:
        obj = (com.facebook.widget.animatablelistview.a)d.get(obj);
        viewgroup.setItemInfo(((com.facebook.widget.animatablelistview.a) (obj)));
        view = (List)e.get(viewgroup);
        if (view != null)
        {
            for (Iterator iterator = view.iterator(); iterator.hasNext(); ((AnimatingItemView)iterator.next()).setItemInfo(null)) { }
        }
        break; /* Loop/switch isn't completed */
_L2:
        View view1 = view.getChildAt(0);
        View view2 = c.a(obj, view1, view);
        viewgroup = view;
        if (view2 != view1)
        {
            view.removeAllViews();
            view.addView(view2);
            viewgroup = view;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj = ((com.facebook.widget.animatablelistview.a) (obj)).f().entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            Object obj1 = viewgroup.findViewById(((Integer)entry.getKey()).intValue());
            if (obj1 instanceof AnimatingItemView)
            {
                obj1 = (AnimatingItemView)obj1;
                ((AnimatingItemView) (obj1)).setItemInfo((com.facebook.widget.animatablelistview.a)entry.getValue());
                if (view == null)
                {
                    view = hq.c(1);
                    e.put(viewgroup, view);
                }
                view.add(obj1);
            }
        } while (true);
        return viewgroup;
    }

    public int getViewTypeCount()
    {
        return c.a();
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEmpty()
    {
        return getCount() == 0;
    }

    public boolean isEnabled(int i1)
    {
        return c.a(getItem(i1));
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new DataSetObservable();
        }
        f.registerObserver(datasetobserver);
        this;
        JVM INSTR monitorexit ;
        return;
        datasetobserver;
        throw datasetobserver;
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        this;
        JVM INSTR monitorenter ;
        if (f != null)
        {
            f.unregisterObserver(datasetobserver);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        datasetobserver;
        throw datasetobserver;
    }

}
