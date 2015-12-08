// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.ksoichiro.android.observablescrollview;

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

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//            ObservableGridView

public static final class d
    implements Filterable, WrapperListAdapter
{

    static final ArrayList a = new ArrayList();
    ArrayList b;
    ArrayList c;
    boolean d;
    private final DataSetObservable e = new DataSetObservable();
    private final ListAdapter f;
    private int g;
    private int h;
    private final boolean i;
    private boolean j;
    private boolean k;

    private int a()
    {
        return (int)(Math.ceil((1.0F * (float)f.getCount()) / (float)g) * (double)g);
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
            } while (((g)arraylist.next()).c);
            return false;
        }
        return true;
    }

    public final void a(int l)
    {
        while (l <= 0 || g == l) 
        {
            return;
        }
        g = l;
        e.notifyChanged();
    }

    public final boolean areAllItemsEnabled()
    {
        return f == null || d && f.areAllItemsEnabled();
    }

    public final int getCount()
    {
        if (f != null)
        {
            return (c.size() + b.size()) * g + a();
        } else
        {
            return (c.size() + b.size()) * g;
        }
    }

    public final Filter getFilter()
    {
        if (i)
        {
            return ((Filterable)f).getFilter();
        } else
        {
            return null;
        }
    }

    public final Object getItem(int l)
    {
        int i1 = b.size() * g;
        if (l < i1)
        {
            if (l % g == 0)
            {
                return ((g)b.get(l / g)).b;
            } else
            {
                return null;
            }
        }
        int k1 = l - i1;
        l = 0;
        if (f != null)
        {
            int j1 = a();
            l = j1;
            if (k1 < j1)
            {
                if (k1 < f.getCount())
                {
                    return f.getItem(k1);
                } else
                {
                    return null;
                }
            }
        }
        l = k1 - l;
        if (l % g == 0)
        {
            return ((g)c.get(l)).b;
        } else
        {
            return null;
        }
    }

    public final long getItemId(int l)
    {
        int i1 = b.size() * g;
        if (f != null && l >= i1)
        {
            l -= i1;
            if (l < f.getCount())
            {
                return f.getItemId(l);
            }
        }
        return -1L;
    }

    public final int getItemViewType(int l)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        l1 = 0;
        int i2 = b.size() * g;
        if (f == null)
        {
            j1 = 0;
        } else
        {
            j1 = f.getViewTypeCount() - 1;
        }
        k1 = -2;
        i1 = k1;
        if (j)
        {
            i1 = k1;
            if (l < i2)
            {
                i1 = k1;
                if (l == 0)
                {
                    i1 = k1;
                    if (k)
                    {
                        i1 = b.size() + j1 + c.size() + 1 + 1;
                    }
                }
                if (l % g != 0)
                {
                    i1 = l / g + 1 + j1;
                }
            }
        }
        i2 = l - i2;
        k1 = l1;
        l = i1;
        if (f == null) goto _L2; else goto _L1
_L1:
        l1 = a();
        k1 = l1;
        l = i1;
        if (i2 < 0) goto _L2; else goto _L3
_L3:
        k1 = l1;
        l = i1;
        if (i2 >= l1) goto _L2; else goto _L4
_L4:
        if (i2 >= f.getCount()) goto _L6; else goto _L5
_L5:
        l = f.getItemViewType(i2);
        k1 = l1;
_L2:
        i1 = l;
        if (j)
        {
            k1 = i2 - k1;
            i1 = l;
            if (k1 >= 0)
            {
                i1 = l;
                if (k1 < getCount())
                {
                    i1 = l;
                    if (k1 % g != 0)
                    {
                        i1 = j1 + b.size() + 1 + (k1 / g + 1);
                    }
                }
            }
        }
        return i1;
_L6:
        k1 = l1;
        l = i1;
        if (j)
        {
            l = b.size() + j1 + 1;
            k1 = l1;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public final View getView(int l, View view, ViewGroup viewgroup)
    {
        int i1 = b.size() * g;
        if (l < i1)
        {
            ViewGroup viewgroup1 = ((g)b.get(l / g)).a;
            if (l % g == 0)
            {
                return viewgroup1;
            }
            View view1 = view;
            if (view == null)
            {
                view1 = new View(viewgroup.getContext());
            }
            view1.setVisibility(4);
            view1.setMinimumHeight(viewgroup1.getHeight());
            return view1;
        }
        int k1 = l - i1;
        i1 = 0;
        if (f != null)
        {
            int j1 = a();
            i1 = j1;
            if (k1 < j1)
            {
                if (k1 < f.getCount())
                {
                    return f.getView(k1, view, viewgroup);
                }
                View view2 = view;
                if (view == null)
                {
                    view2 = new View(viewgroup.getContext());
                }
                view2.setVisibility(4);
                view2.setMinimumHeight(h);
                return view2;
            }
        }
        i1 = k1 - i1;
        if (i1 < getCount())
        {
            ViewGroup viewgroup2 = ((getCount)c.get(i1 / g)).a;
            if (l % g == 0)
            {
                return viewgroup2;
            }
            View view3 = view;
            if (view == null)
            {
                view3 = new View(viewgroup.getContext());
            }
            view3.setVisibility(4);
            view3.setMinimumHeight(viewgroup2.getHeight());
            return view3;
        } else
        {
            throw new ArrayIndexOutOfBoundsException(l);
        }
    }

    public final int getViewTypeCount()
    {
        int l;
        int i1;
        if (f == null)
        {
            l = 1;
        } else
        {
            l = f.getViewTypeCount();
        }
        i1 = l;
        if (j)
        {
            int j1 = b.size() + 1 + c.size();
            i1 = j1;
            if (k)
            {
                i1 = j1 + 1;
            }
            i1 = l + i1;
        }
        return i1;
    }

    public final ListAdapter getWrappedAdapter()
    {
        return f;
    }

    public final boolean hasStableIds()
    {
        return f != null && f.hasStableIds();
    }

    public final boolean isEmpty()
    {
        return f == null || f.isEmpty();
    }

    public final boolean isEnabled(int l)
    {
        int i1;
        boolean flag1;
        flag1 = false;
        i1 = b.size() * g;
        if (l >= i1) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = flag1;
        if (l % g == 0)
        {
            flag = flag1;
            if (((g)b.get(l / g)).c)
            {
                flag = true;
            }
        }
_L4:
        return flag;
_L2:
        int k1 = l - i1;
        if (f != null)
        {
            int j1 = a();
            l = j1;
            if (k1 < j1)
            {
                flag = flag1;
                if (k1 < f.getCount())
                {
                    flag = flag1;
                    if (f.isEnabled(k1))
                    {
                        return true;
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            l = 0;
        }
        l = k1 - l;
        flag = flag1;
        if (l % g == 0)
        {
            flag = flag1;
            if (((g)c.get(l / g)).c)
            {
                return true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        e.registerObserver(datasetobserver);
        if (f != null)
        {
            f.registerDataSetObserver(datasetobserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        e.unregisterObserver(datasetobserver);
        if (f != null)
        {
            f.unregisterDataSetObserver(datasetobserver);
        }
    }


    public (ArrayList arraylist, ArrayList arraylist1, ListAdapter listadapter)
    {
        boolean flag = true;
        super();
        g = 1;
        h = -1;
        j = true;
        k = false;
        f = listadapter;
        i = listadapter instanceof Filterable;
        if (arraylist == null)
        {
            b = a;
        } else
        {
            b = arraylist;
        }
        if (arraylist1 == null)
        {
            c = a;
        } else
        {
            c = arraylist1;
        }
        if (!a(b) || !a(c))
        {
            flag = false;
        }
        d = flag;
    }
}
