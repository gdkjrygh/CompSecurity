// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            y

public final class aa
    implements Filterable, WrapperListAdapter
{

    static final ArrayList c = new ArrayList();
    ArrayList a;
    ArrayList b;
    boolean d;
    private final ListAdapter e;
    private final boolean f;

    public aa(ArrayList arraylist, ArrayList arraylist1, ListAdapter listadapter)
    {
        e = listadapter;
        f = listadapter instanceof Filterable;
        boolean flag;
        if (arraylist == null)
        {
            a = c;
        } else
        {
            a = arraylist;
        }
        if (arraylist1 == null)
        {
            b = c;
        } else
        {
            b = arraylist1;
        }
        if (a(a) && a(b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    private static boolean a(ArrayList arraylist)
    {
label0:
        {
            if (arraylist == null)
            {
                break label0;
            }
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break label0;
                }
            } while (((y)arraylist.next()).c);
            return false;
        }
        return true;
    }

    public final boolean areAllItemsEnabled()
    {
        return e == null || d && e.areAllItemsEnabled();
    }

    public final int getCount()
    {
        if (e != null)
        {
            return b.size() + a.size() + e.getCount();
        } else
        {
            return b.size() + a.size();
        }
    }

    public final Filter getFilter()
    {
        if (f)
        {
            return ((Filterable)e).getFilter();
        } else
        {
            return null;
        }
    }

    public final Object getItem(int i)
    {
        int j = a.size();
        if (i < j)
        {
            return ((y)a.get(i)).b;
        }
        int l = i - j;
        i = 0;
        if (e != null)
        {
            int k = e.getCount();
            i = k;
            if (l < k)
            {
                return e.getItem(l);
            }
        }
        return ((y)b.get(l - i)).b;
    }

    public final long getItemId(int i)
    {
        int j = a.size();
        if (e != null && i >= j)
        {
            i -= j;
            if (i < e.getCount())
            {
                return e.getItemId(i);
            }
        }
        return -1L;
    }

    public final int getItemViewType(int i)
    {
        int j = a.size();
        if (e != null && i >= j)
        {
            i -= j;
            if (i < e.getCount())
            {
                return e.getItemViewType(i);
            }
        }
        return -2;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = a.size();
        if (i < j)
        {
            return ((y)a.get(i)).a;
        }
        int l = i - j;
        i = 0;
        if (e != null)
        {
            int k = e.getCount();
            i = k;
            if (l < k)
            {
                return e.getView(l, view, viewgroup);
            }
        }
        return ((y)b.get(l - i)).a;
    }

    public final int getViewTypeCount()
    {
        if (e != null)
        {
            return e.getViewTypeCount();
        } else
        {
            return 1;
        }
    }

    public final ListAdapter getWrappedAdapter()
    {
        return e;
    }

    public final boolean hasStableIds()
    {
        if (e != null)
        {
            return e.hasStableIds();
        } else
        {
            return false;
        }
    }

    public final boolean isEmpty()
    {
        return e == null || e.isEmpty();
    }

    public final boolean isEnabled(int i)
    {
        int j = a.size();
        if (i < j)
        {
            return ((y)a.get(i)).c;
        }
        int l = i - j;
        i = 0;
        if (e != null)
        {
            int k = e.getCount();
            i = k;
            if (l < k)
            {
                return e.isEnabled(l);
            }
        }
        return ((y)b.get(l - i)).c;
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        if (e != null)
        {
            e.registerDataSetObserver(datasetobserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        if (e != null)
        {
            e.unregisterDataSetObserver(datasetobserver);
        }
    }

}
