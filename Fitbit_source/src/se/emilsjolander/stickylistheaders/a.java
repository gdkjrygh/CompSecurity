// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            h, i, c

class se.emilsjolander.stickylistheaders.a extends BaseAdapter
    implements h
{
    static interface a
    {

        public abstract void a(View view, int j, long l);
    }


    h a;
    private final List b = new LinkedList();
    private final Context c;
    private Drawable d;
    private int e;
    private a f;
    private DataSetObserver g;

    se.emilsjolander.stickylistheaders.a(Context context, h h1)
    {
        g = new DataSetObserver() {

            final se.emilsjolander.stickylistheaders.a a;

            public void onChanged()
            {
                se.emilsjolander.stickylistheaders.a.c(a);
            }

            public void onInvalidated()
            {
                se.emilsjolander.stickylistheaders.a.a(a).clear();
                se.emilsjolander.stickylistheaders.a.b(a);
            }

            
            {
                a = se.emilsjolander.stickylistheaders.a.this;
                super();
            }
        };
        c = context;
        a = h1;
        h1.registerDataSetObserver(g);
    }

    private View a()
    {
        if (b.size() > 0)
        {
            return (View)b.remove(0);
        } else
        {
            return null;
        }
    }

    private View a(i j, int k)
    {
        View view;
        if (j.d == null)
        {
            view = a();
        } else
        {
            view = j.d;
        }
        j = a.a(k, view, j);
        if (j == null)
        {
            throw new NullPointerException("Header view must not be null.");
        } else
        {
            j.setClickable(true);
            j.setOnClickListener(new android.view.View.OnClickListener(k) {

                final int a;
                final se.emilsjolander.stickylistheaders.a b;

                public void onClick(View view1)
                {
                    if (se.emilsjolander.stickylistheaders.a.d(b) != null)
                    {
                        long l = b.a.a(a);
                        se.emilsjolander.stickylistheaders.a.d(b).a(view1, a, l);
                    }
                }

            
            {
                b = se.emilsjolander.stickylistheaders.a.this;
                a = j;
                super();
            }
            });
            return j;
        }
    }

    static List a(se.emilsjolander.stickylistheaders.a a1)
    {
        return a1.b;
    }

    private void a(i j)
    {
        j = j.d;
        if (j != null)
        {
            j.setVisibility(0);
            b.add(j);
        }
    }

    static void b(se.emilsjolander.stickylistheaders.a a1)
    {
        a1.BaseAdapter.notifyDataSetInvalidated();
    }

    private boolean b(int j)
    {
        return j != 0 && a.a(j) == a.a(j - 1);
    }

    static void c(se.emilsjolander.stickylistheaders.a a1)
    {
        a1.BaseAdapter.notifyDataSetChanged();
    }

    static a d(se.emilsjolander.stickylistheaders.a a1)
    {
        return a1.f;
    }

    public long a(int j)
    {
        return a.a(j);
    }

    public View a(int j, View view, ViewGroup viewgroup)
    {
        return a.a(j, view, viewgroup);
    }

    void a(Drawable drawable, int j)
    {
        d = drawable;
        e = j;
        notifyDataSetChanged();
    }

    public void a(a a1)
    {
        f = a1;
    }

    public boolean areAllItemsEnabled()
    {
        return a.areAllItemsEnabled();
    }

    public i b(int j, View view, ViewGroup viewgroup)
    {
        View view2;
        View view1;
        if (view == null)
        {
            view = new i(c);
        } else
        {
            view = (i)view;
        }
        view2 = a.getView(j, ((i) (view)).a, viewgroup);
        view1 = null;
        if (b(j))
        {
            a(view);
        } else
        {
            view1 = a(view, j);
        }
        if (!(view2 instanceof Checkable) || (view instanceof c)) goto _L2; else goto _L1
_L1:
        viewgroup = new c(c);
_L4:
        viewgroup.a(view2, view1, d, e);
        return viewgroup;
_L2:
        viewgroup = view;
        if (!(view2 instanceof Checkable))
        {
            viewgroup = view;
            if (view instanceof c)
            {
                viewgroup = new i(c);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean equals(Object obj)
    {
        return a.equals(obj);
    }

    public int getCount()
    {
        return a.getCount();
    }

    public View getDropDownView(int j, View view, ViewGroup viewgroup)
    {
        return ((BaseAdapter)a).getDropDownView(j, view, viewgroup);
    }

    public Object getItem(int j)
    {
        return a.getItem(j);
    }

    public long getItemId(int j)
    {
        return a.getItemId(j);
    }

    public int getItemViewType(int j)
    {
        return a.getItemViewType(j);
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        return b(j, view, viewgroup);
    }

    public int getViewTypeCount()
    {
        return a.getViewTypeCount();
    }

    public boolean hasStableIds()
    {
        return a.hasStableIds();
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public boolean isEnabled(int j)
    {
        return a.isEnabled(j);
    }

    public void notifyDataSetChanged()
    {
        ((BaseAdapter)a).notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated()
    {
        ((BaseAdapter)a).notifyDataSetInvalidated();
    }

    public String toString()
    {
        return a.toString();
    }
}
