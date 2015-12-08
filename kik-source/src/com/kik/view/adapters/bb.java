// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bb extends BaseAdapter
{
    final class a extends DataSetObserver
    {

        final bb a;

        public final void onChanged()
        {
            super.onChanged();
            a.notifyDataSetChanged();
        }

        a()
        {
            a = bb.this;
            super();
        }
    }

    private final class b
    {

        final String a;
        final Adapter b;
        final boolean c;
        final bb d;

        public b(String s, Adapter adapter, boolean flag)
        {
            d = bb.this;
            super();
            a = s;
            b = adapter;
            c = flag;
        }
    }


    private final List a = new ArrayList();
    private final ArrayAdapter b;
    private final a c = new a();
    private boolean d;

    public bb(Context context)
    {
        d = true;
        b = new ArrayAdapter(context, 0x7f03007c);
    }

    private boolean a(b b1)
    {
        return b1 != null && d && b1.c && b1.b != null && b1.b.getCount() > 0;
    }

    public final Adapter a(int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < a.size();)
        {
            Adapter adapter = ((b)a.get(i)).b;
            int k = j;
            if (adapter.getCount() != 0)
            {
                k = adapter.getCount() + 1;
                if (j < k)
                {
                    return adapter;
                }
                k = j - k;
            }
            i++;
            j = k;
        }

        return null;
    }

    public final Adapter a(String s)
    {
        if (s == null)
        {
            return null;
        }
        for (int i = 0; i < a.size(); i++)
        {
            if (s.equals(((b)a.get(i)).a))
            {
                return ((b)a.get(i)).b;
            }
        }

        return null;
    }

    public final void a(boolean flag)
    {
        d = flag;
    }

    public final void c(String s, Adapter adapter)
    {
        if (adapter != null)
        {
            b.add(s);
            a.add(new b(s, adapter, true));
        }
    }

    public final void c(String s, Adapter adapter, boolean flag)
    {
        if (adapter != null)
        {
            b.add(s);
            a.add(new b(s, adapter, flag));
        }
    }

    public final void d(String s, Adapter adapter)
    {
        if (adapter != null)
        {
            b.insert(s, 0);
            a.add(0, new b(s, adapter, false));
        }
    }

    public final void e(String s, Adapter adapter)
    {
        if (s == null || adapter == null)
        {
            return;
        }
        boolean flag = true;
        int j = 0;
        for (int i = 0; i < a.size(); i++)
        {
            if (s.equals(((b)a.get(i)).a))
            {
                flag = ((b)a.get(i)).c;
                j = i;
            }
        }

        if (a(s) != null)
        {
            b.remove(s);
            a.remove(j);
            b.insert(s, j);
            a.add(j, new b(s, adapter, flag));
            return;
        } else
        {
            b.add(s);
            a.add(new b(s, adapter, flag));
            return;
        }
    }

    public final void f(String s, Adapter adapter)
    {
        if (adapter != null)
        {
            b.add(s);
            a.add(new b(s, adapter, false));
        }
    }

    public int getCount()
    {
        int i = 0;
        int j = 0;
        while (i < a.size()) 
        {
            b b1 = (b)a.get(i);
            Adapter adapter = b1.b;
            int k;
            int l;
            if (a(b1))
            {
                l = 1;
            } else
            {
                l = 0;
            }
            k = j;
            if (adapter.getCount() > 0)
            {
                k = j + (l + adapter.getCount());
            }
            i++;
            j = k;
        }
        return j;
    }

    public Object getItem(int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < a.size();)
        {
            b b1 = (b)a.get(i);
            Adapter adapter = b1.b;
            int k = j;
            if (adapter.getCount() != 0)
            {
                int l;
                if (a(b1))
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                l = adapter.getCount() + k;
                if (j == 0 && a(b1))
                {
                    return b1.a;
                }
                if (j < l)
                {
                    return adapter.getItem(j - k);
                }
                k = j - l;
            }
            i++;
            j = k;
        }

        return null;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        Iterator iterator = a.iterator();
        int k = 0;
        int j = 1;
        while (iterator.hasNext()) 
        {
            b b1 = (b)iterator.next();
            int i1 = i - k;
            Adapter adapter = b1.b;
            if (adapter.getCount() == 0)
            {
                j = adapter.getViewTypeCount() + j;
            } else
            {
                boolean flag = a(b1);
                int l;
                int j1;
                if (flag)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                j1 = adapter.getCount() + l;
                if (i1 == 0 && flag)
                {
                    return 0;
                }
                if (i1 < j1)
                {
                    return j + adapter.getItemViewType(i1 - l);
                }
                j = adapter.getViewTypeCount() + j;
                k += j1;
            }
        }
        return -1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j;
        int k;
        j = 0;
        boolean flag = false;
        k = i;
        i = ((flag) ? 1 : 0);
_L2:
        b b1;
        Adapter adapter;
        if (j >= a.size())
        {
            break MISSING_BLOCK_LABEL_224;
        }
        b1 = (b)a.get(j);
        adapter = b1.b;
        if (adapter.getCount() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
_L7:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        if (a(b1))
        {
            l = 1;
        } else
        {
            l = 0;
        }
        i1 = adapter.getCount() + l;
        if (k != 0 || !a(b1)) goto _L4; else goto _L3
_L3:
        view = b.getView(i, view, viewgroup);
        if (d && b1.c)
        {
            view.getLayoutParams().height = view.getResources().getDimensionPixelSize(0x7f0d0019);
        } else
        {
            view.getLayoutParams().height = 1;
        }
_L6:
        return view;
_L4:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        viewgroup = adapter.getView(k - l, view, viewgroup);
        view = viewgroup;
        if (viewgroup.getContentDescription() == null)
        {
            viewgroup.setContentDescription("AUTOMATION_CONTACT_CELL");
            return viewgroup;
        }
        if (true) goto _L6; else goto _L5
_L5:
        k -= i1;
        i++;
          goto _L7
        return null;
    }

    public int getViewTypeCount()
    {
        int j = 1;
        for (int i = 0; i < a.size(); i++)
        {
            j += ((b)a.get(i)).b.getViewTypeCount();
        }

        return j;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEmpty()
    {
        return getCount() == 0;
    }

    public boolean isEnabled(int i)
    {
        return getItemViewType(i) != 0;
    }
}
