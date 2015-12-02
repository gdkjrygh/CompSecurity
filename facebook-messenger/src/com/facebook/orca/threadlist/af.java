// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.f.b;
import com.facebook.orca.f.x;
import com.facebook.orca.photos.a.e;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.widget.tiles.j;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.threadlist:
//            al, ak, aj, ag, 
//            ah, ai, q

public class af extends BaseAdapter
{

    public static final Object a = new Object();
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final Object e = new Object();
    private final Context f;
    private final LayoutInflater g;
    private final b h;
    private final x i;
    private final e j;
    private al k;
    private ak l;
    private String m;
    private es n;
    private es o;
    private Supplier p;

    public af(Context context, b b1, x x1, e e1, LayoutInflater layoutinflater)
    {
        k = al.NORMAL;
        l = ak.NONE;
        n = es.d();
        o = es.d();
        p = new aj(this, null);
        f = context;
        h = b1;
        i = x1;
        j = e1;
        g = layoutinflater;
    }

    private View a(View view)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = g.inflate(k.orca_thread_list_start_thread_button_item, null);
            ((TextView)view1.findViewById(i.thread_list_start_thread_text)).setText(o.thread_start_thread_button);
        }
        return view1;
    }

    private View a(View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = g.inflate(k.orca_load_more_placeholder_footer, viewgroup, false);
        }
        return view1;
    }

    static b a(af af1)
    {
        return af1.h;
    }

    private es a(es es1, Predicate predicate)
    {
        Object obj = es1.iterator();
        boolean flag = false;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if (predicate.apply((ThreadSummary)((Iterator) (obj)).next()))
            {
                flag = true;
            }
        } while (true);
        if (!flag)
        {
            return es1;
        }
        obj = es.e();
        es1 = es1.iterator();
        do
        {
            if (!es1.hasNext())
            {
                break;
            }
            ThreadSummary threadsummary = (ThreadSummary)es1.next();
            if (!predicate.apply(threadsummary))
            {
                ((et) (obj)).b(threadsummary);
            }
        } while (true);
        return ((et) (obj)).b();
    }

    private void a()
    {
        if (k == al.NORMAL)
        {
            b();
            return;
        } else
        {
            c();
            return;
        }
    }

    private View b(View view)
    {
        View view1 = view;
        if (view == null)
        {
            view = g.inflate(k.orca_thread_list_new_thread_item, null);
            TextView textview = (TextView)view.findViewById(i.thread_title);
            view1 = view;
            if (m != null)
            {
                textview.setText(m);
                view1 = view;
            }
        }
        return view1;
    }

    private View b(View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = g.inflate(k.orca_load_more_footer, viewgroup, false);
        }
        return view1;
    }

    static x b(af af1)
    {
        return af1.i;
    }

    private es b(es es1)
    {
        if (!h.a())
        {
            return es1;
        } else
        {
            return a(es1, new ag(this));
        }
    }

    private void b()
    {
        o = b(c(n));
        notifyDataSetChanged();
    }

    static Context c(af af1)
    {
        return af1.f;
    }

    private View c(View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = g.inflate(k.orca_loading_footer, viewgroup, false);
        }
        return view1;
    }

    private es c(es es1)
    {
        if (!i.a())
        {
            return es1;
        } else
        {
            return a(es1, new ah(this));
        }
    }

    private void c()
    {
        et et1 = es.e();
        et1.b(b);
        et1.b(d(b(c(n))));
        o = et1.b();
    }

    private es d(es es1)
    {
        return a(es1, new ai(this));
    }

    public View a(ThreadSummary threadsummary, View view)
    {
        view = (q)view;
        if (view == null)
        {
            view = (q)p.get();
        }
        view.a(threadsummary, k);
        return view;
    }

    void a(ak ak1)
    {
        l = ak1;
    }

    public void a(al al1)
    {
        k = al1;
    }

    public void a(es es1)
    {
        n = es1;
        a();
    }

    public void a(Supplier supplier)
    {
        p = supplier;
    }

    public void a(String s)
    {
        m = s;
    }

    public int getCount()
    {
        int j1 = o.size();
        int i1;
        if (l == ak.NONE)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        return i1 + j1;
    }

    public Object getItem(int i1)
    {
        if (i1 < o.size())
        {
            return o.get(i1);
        }
        if (i1 == o.size())
        {
            if (l == ak.LOAD_MORE_PLACEHOLDER)
            {
                return c;
            }
            if (l == ak.LOAD_MORE)
            {
                return d;
            } else
            {
                return e;
            }
        } else
        {
            return null;
        }
    }

    public long getItemId(int i1)
    {
        return (long)i1;
    }

    public int getItemViewType(int i1)
    {
        Object obj = getItem(i1);
        if (obj == a)
        {
            return 0;
        }
        if (obj == b)
        {
            return 3;
        }
        if (obj == c)
        {
            return 4;
        }
        if (obj == d)
        {
            return 5;
        }
        if (obj == e)
        {
            return 6;
        }
        if (obj instanceof ThreadSummary)
        {
            return j.a((ThreadSummary)obj).a() >= 2 ? 2 : 1;
        } else
        {
            return -1;
        }
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        Object obj = getItem(i1);
        if (obj == null)
        {
            throw new IllegalArgumentException("Null item");
        }
        if (obj == a)
        {
            return a(view);
        }
        if (obj == b)
        {
            return b(view);
        }
        if (obj == c)
        {
            return a(view, viewgroup);
        }
        if (obj == d)
        {
            return b(view, viewgroup);
        }
        if (obj == e)
        {
            return c(view, viewgroup);
        }
        if (obj instanceof ThreadSummary)
        {
            return a((ThreadSummary)obj, view);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown object type ").append(obj.getClass()).toString());
        }
    }

    public int getViewTypeCount()
    {
        return 7;
    }

}
