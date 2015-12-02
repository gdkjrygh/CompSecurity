// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            i

public abstract class com.qihoo.security.opti.trashclear.ui.a extends BaseAdapter
{
    public static interface a
    {

        public abstract void a();
    }

    public static interface b
    {

        public abstract void a();
    }

    public static interface c
    {

        public abstract void a(i i1);
    }

    public static interface d
    {

        public abstract void a(View view, i i1);
    }

    private final class e
        implements android.view.View.OnClickListener
    {

        final com.qihoo.security.opti.trashclear.ui.a a;
        private final i b;
        private final d c;

        public void onClick(View view)
        {
            if (c != null && b != null)
            {
                c.a(view, b);
            }
        }

        public e(i i1, d d1)
        {
            a = com.qihoo.security.opti.trashclear.ui.a.this;
            super();
            b = i1;
            c = d1;
        }
    }


    protected final List a = new ArrayList();
    protected Context b;
    private final SparseIntArray c = new SparseIntArray();
    private final List d = new ArrayList();
    private final Map e = new HashMap();
    private int f;
    private int g;
    private b h;
    private a i;
    private int j;
    private c k;
    private d l;

    public com.qihoo.security.opti.trashclear.ui.a(Context context, List list)
    {
        f = -1;
        g = -1;
        k = null;
        l = null;
        b = context;
        context = list;
        if (list == null)
        {
            context = new ArrayList();
        }
        if (context.size() > 0)
        {
            j = ((i)context.get(0)).i().intValue();
        } else
        {
            j = 0;
        }
        for (context = context.iterator(); context.hasNext(); f(list))
        {
            list = (i)context.next();
            a.add(list);
        }

        c();
    }

    private View a(int i1, View view, ViewGroup viewgroup, int j1)
    {
        i k1 = (i)a.get(i1);
        Integer integer = k1.i();
        View view1 = view;
        if (view == null)
        {
            view = LayoutInflater.from(b);
            if (integer != null)
            {
                j1 = integer.intValue();
            }
            view1 = view.inflate(j1, viewgroup, false);
        }
        view1.setOnClickListener(new e(k1, l));
        a(view1, k1);
        return view1;
    }

    static c a(com.qihoo.security.opti.trashclear.ui.a a1)
    {
        return a1.k;
    }

    private void a(i i1, Map map)
    {
        if (i1 != null && map != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (map.get(i1.i()) == null)
        {
            int j1 = map.size();
            map.put(i1.i(), Integer.valueOf(j1));
        }
        i1 = i1.b();
        if (i1 != null)
        {
            i1 = i1.iterator();
            while (i1.hasNext()) 
            {
                a((i)i1.next(), map);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void b()
    {
        a.clear();
        for (int j1 = 0; j1 < d.size(); j1++)
        {
            i i1 = (i)d.get(j1);
            if (!i1.e() || i1.h())
            {
                a.add(i1);
            }
        }

    }

    private void c()
    {
        e.clear();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); a((i)iterator.next(), e)) { }
    }

    private void f(i i1)
    {
        d.add(i1);
        if (i1.g())
        {
            int j1 = 0;
            while (j1 < i1.b().size()) 
            {
                f((i)i1.b().get(j1));
                j1++;
            }
        }
    }

    private void g(i i1)
    {
        for (Iterator iterator = i1.b().iterator(); iterator.hasNext(); g((i)iterator.next())) { }
        i1.f();
        a.remove(i1);
        d.remove(i1);
    }

    private void h(i i1)
    {
        i j1 = i1.a();
        if (j1 != null)
        {
            j1.b().remove(i1);
            a.remove(i1);
            d.remove(i1);
            if (!j1.g())
            {
                h(j1);
            }
            return;
        } else
        {
            i1.f();
            a.remove(i1);
            d.remove(i1);
            return;
        }
    }

    public i a(int i1)
    {
        return (i)a.get(i1);
    }

    public List a()
    {
        return a;
    }

    protected abstract void a(View view, i i1);

    public void a(c c1)
    {
        k = c1;
    }

    public void a(d d1)
    {
        l = d1;
    }

    public void a(i i1)
    {
        if (i1 != null)
        {
            g(i1);
            h(i1);
            notifyDataSetChanged();
        }
    }

    protected void b(View view, i i1)
    {
        view.setOnClickListener(new android.view.View.OnClickListener(i1) {

            final i a;
            final com.qihoo.security.opti.trashclear.ui.a b;

            public void onClick(View view1)
            {
                if (com.qihoo.security.opti.trashclear.ui.a.a(b) != null)
                {
                    com.qihoo.security.opti.trashclear.ui.a.a(b).a(a);
                }
            }

            
            {
                b = com.qihoo.security.opti.trashclear.ui.a.this;
                a = i1;
                super();
            }
        });
    }

    public void b(i i1)
    {
        if (i1 != null && i1.g())
        {
            boolean flag;
            if (!i1.d())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i1.a(flag);
            b();
            c(i1);
            notifyDataSetChanged();
            if (h != null && i1.d())
            {
                h.a();
            }
            if (i != null && !i1.d())
            {
                i.a();
            }
        }
    }

    protected abstract void c(i i1);

    protected int d(i i1)
    {
        if (i1 != null)
        {
            i1 = (Integer)e.get(i1.i());
            if (i1 != null)
            {
                return i1.intValue();
            }
        }
        return 0;
    }

    public int e(i i1)
    {
        if (a != null)
        {
            return a.indexOf(i1);
        } else
        {
            return -1;
        }
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i1)
    {
        return a(i1);
    }

    public long getItemId(int i1)
    {
        return (long)i1;
    }

    public final int getItemViewType(int i1)
    {
        return d((i)a.get(i1));
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        return a(i1, view, viewgroup, j);
    }

    public int getViewTypeCount()
    {
        int i1 = e.size();
        if (i1 > 0)
        {
            return i1;
        } else
        {
            return 1;
        }
    }
}
