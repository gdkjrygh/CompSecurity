// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.roidapp.baselib.view:
//            q, n

final class p
    implements Filterable, WrapperListAdapter
{

    ArrayList a;
    ArrayList b;
    boolean c;
    private final DataSetObservable d = new DataSetObservable();
    private final ListAdapter e;
    private int f;
    private final boolean g;
    private View h;
    private View i;
    private int j;

    public p(ArrayList arraylist, ArrayList arraylist1, ListAdapter listadapter)
    {
        f = 1;
        e = listadapter;
        g = listadapter instanceof Filterable;
        if (arraylist == null)
        {
            throw new IllegalArgumentException("headerViewInfos cannot be null");
        }
        if (arraylist1 == null)
        {
            throw new IllegalArgumentException("footerViewInfos cannot be null");
        } else
        {
            a = arraylist;
            b = arraylist1;
            c = a(a) & a(b);
            return;
        }
    }

    private q a(ViewGroup viewgroup, View view)
    {
        viewgroup = new q(this, viewgroup.getContext());
        viewgroup.a(view);
        return viewgroup;
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
            } while (((n)arraylist.next()).d);
            return false;
        }
        return true;
    }

    public final void a()
    {
        d.notifyChanged();
    }

    public final void a(int k)
    {
        if (k <= 0)
        {
            throw new IllegalArgumentException("Number of columns must be 1 or more");
        }
        if (f != k)
        {
            f = k;
            d.notifyChanged();
        }
    }

    public final boolean areAllItemsEnabled()
    {
        return e == null || c && e.areAllItemsEnabled() && j == 0;
    }

    public final int getCount()
    {
        if (e != null)
        {
            int k = a.size();
            int l = f;
            int i1 = e.getCount();
            int j1 = b.size();
            int k1 = f;
            if (e != null)
            {
                j = (int)Math.ceil((float)e.getCount() / (float)f) * f - e.getCount();
            }
            return k * l + i1 + j1 * k1 + j;
        } else
        {
            return a.size() * f + b.size() * f;
        }
    }

    public final Filter getFilter()
    {
        if (g)
        {
            return ((Filterable)e).getFilter();
        } else
        {
            return null;
        }
    }

    public final Object getItem(int k)
    {
        int l = a.size();
        int k1 = f * l;
        if (k < k1)
        {
            if (k % f == 0)
            {
                return ((n)a.get(k / f)).c;
            } else
            {
                return null;
            }
        }
        int l1 = k - k1;
        l = 0;
        if (e != null)
        {
            int i1 = e.getCount();
            if (l1 < i1)
            {
                return e.getItem(l1);
            }
            l = i1;
            if (l1 - i1 < j)
            {
                return null;
            }
        }
        int j1 = b.size();
        l1 = f;
        l = k - l - k1 - j;
        if (j1 * l1 > 0 && l >= 0 && k % f == 0)
        {
            return ((n)b.get(l / f)).c;
        } else
        {
            throw new ArrayIndexOutOfBoundsException(k);
        }
    }

    public final long getItemId(int k)
    {
        int l = a.size() * f;
        if (e != null && k >= l)
        {
            k -= l;
            if (k < e.getCount())
            {
                return e.getItemId(k);
            }
        }
        return -1L;
    }

    public final int getItemViewType(int k)
    {
        boolean flag = false;
        int l = a.size();
        int l1 = f * l;
        if (k < l1 && k % f != 0)
        {
            k = ((flag) ? 1 : 0);
            if (e != null)
            {
                k = (e.getViewTypeCount() + 1) - 1;
            }
        } else
        {
            int i1;
            if (e != null && k >= l1)
            {
                int i2 = k - l1;
                int j1 = e.getCount();
                if (i2 < j1)
                {
                    return e.getItemViewType(i2);
                }
                i1 = j1;
                if (i2 - j1 < j)
                {
                    return (e.getViewTypeCount() + 2) - 1;
                }
            } else
            {
                i1 = 0;
            }
            int k1 = b.size();
            int j2 = f;
            k = k - i1 - l1 - j;
            if (k1 * j2 > 0 && k >= 0 && k % f != 0)
            {
                k = ((flag) ? 1 : 0);
                if (e != null)
                {
                    return (e.getViewTypeCount() + 1) - 1;
                }
            } else
            {
                return -2;
            }
        }
        return k;
    }

    public final View getView(int k, View view, ViewGroup viewgroup)
    {
        int l = a.size();
        int k1 = f * l;
        if (k < k1)
        {
            view = ((n)a.get(k / f)).b;
            if (k % f == 0)
            {
                i = view;
                return view;
            } else
            {
                return a(viewgroup, i);
            }
        }
        int l1 = k - k1;
        l = 0;
        if (e != null)
        {
            int i1 = e.getCount();
            if (l1 < i1)
            {
                view = e.getView(l1, view, viewgroup);
                h = view;
                return view;
            }
            l = i1;
            if (l1 - i1 < j)
            {
                return a(viewgroup, h);
            }
        }
        int j1 = b.size();
        l1 = f;
        l = k - l - k1 - j;
        if (j1 * l1 > 0 && l >= 0)
        {
            view = ((n)b.get(l / f)).b;
            if (k % f == 0)
            {
                i = view;
                return view;
            } else
            {
                return a(viewgroup, i);
            }
        } else
        {
            throw new ArrayIndexOutOfBoundsException(k);
        }
    }

    public final int getViewTypeCount()
    {
        if (e != null)
        {
            return e.getViewTypeCount() + 2;
        } else
        {
            return 2;
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
        return (e == null || e.isEmpty()) && a.size() == 0 && b.size() == 0;
    }

    public final boolean isEnabled(int k)
    {
        int j1;
        boolean flag1;
        flag1 = false;
        int l = a.size();
        j1 = f * l;
        if (k >= j1) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = flag1;
        if (k % f == 0)
        {
            flag = flag1;
            if (((n)a.get(k / f)).d)
            {
                flag = true;
            }
        }
_L4:
        return flag;
_L2:
        int i1;
        int k1 = k - j1;
        if (e == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = e.getCount();
        if (k1 < i1)
        {
            return e.isEnabled(k1);
        }
        flag = flag1;
        if (k1 - i1 < j)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        int l1 = b.size();
        int i2 = f;
        i1 = k - i1 - j1 - j;
        if (l1 * i2 > 0 && i1 >= 0)
        {
            flag = flag1;
            if (k % f == 0)
            {
                flag = flag1;
                if (((n)b.get(i1 / f)).d)
                {
                    return true;
                }
            }
        } else
        {
            throw new ArrayIndexOutOfBoundsException(k);
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1 = 0;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        d.registerObserver(datasetobserver);
        if (e != null)
        {
            e.registerDataSetObserver(datasetobserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        d.unregisterObserver(datasetobserver);
        if (e != null)
        {
            e.unregisterDataSetObserver(datasetobserver);
        }
    }
}
