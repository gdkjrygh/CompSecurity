// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package in.srain.cube.views:
//            a, GridViewWithHeaderAndFooter

class b
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

    public b(ArrayList arraylist, ArrayList arraylist1, ListAdapter listadapter)
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

    private boolean a(ArrayList arraylist)
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
            } while (((a)arraylist.next()).c);
            return false;
        }
        return true;
    }

    private int d()
    {
        return (int)(Math.ceil((1.0F * (float)f.getCount()) / (float)g) * (double)g);
    }

    public int a()
    {
        return b.size();
    }

    public void a(int l)
    {
        while (l < 1 || g == l) 
        {
            return;
        }
        g = l;
        c();
    }

    public boolean areAllItemsEnabled()
    {
        return f == null || d && f.areAllItemsEnabled();
    }

    public int b()
    {
        return c.size();
    }

    public void b(int l)
    {
        h = l;
    }

    public void c()
    {
        e.notifyChanged();
    }

    public int getCount()
    {
        if (f != null)
        {
            return (b() + a()) * g + d();
        } else
        {
            return (b() + a()) * g;
        }
    }

    public Filter getFilter()
    {
        if (i)
        {
            return ((Filterable)f).getFilter();
        } else
        {
            return null;
        }
    }

    public Object getItem(int l)
    {
        int i1 = a() * g;
        if (l < i1)
        {
            if (l % g == 0)
            {
                return ((a)b.get(l / g)).b;
            } else
            {
                return null;
            }
        }
        int k1 = l - i1;
        l = 0;
        if (f != null)
        {
            int j1 = d();
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
            return ((a)c.get(l)).b;
        } else
        {
            return null;
        }
    }

    public long getItemId(int l)
    {
        int i1 = a() * g;
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

    public int getItemViewType(int l)
    {
        int i1;
        int j1;
        int k1;
        int l1 = a() * g;
        int i2;
        if (f == null)
        {
            k1 = 0;
        } else
        {
            k1 = f.getViewTypeCount() - 1;
        }
        j1 = -2;
        i1 = j1;
        if (j)
        {
            i1 = j1;
            if (l < l1)
            {
                i1 = j1;
                if (l == 0)
                {
                    i1 = j1;
                    if (k)
                    {
                        i1 = b.size() + k1 + c.size() + 1 + 1;
                    }
                }
                if (l % g != 0)
                {
                    i1 = l / g + 1 + k1;
                }
            }
        }
        i2 = l - l1;
        if (f == null) goto _L2; else goto _L1
_L1:
        j1 = d();
        if (i2 < 0 || i2 >= j1) goto _L4; else goto _L3
_L3:
        if (i2 >= f.getCount()) goto _L6; else goto _L5
_L5:
        i1 = f.getItemViewType(i2);
_L4:
        l1 = i1;
        if (j)
        {
            j1 = i2 - j1;
            l1 = i1;
            if (j1 >= 0)
            {
                l1 = i1;
                if (j1 < getCount())
                {
                    l1 = i1;
                    if (j1 % g != 0)
                    {
                        l1 = k1 + b.size() + 1 + (j1 / g + 1);
                    }
                }
            }
        }
        if (GridViewWithHeaderAndFooter.a)
        {
            Log.d("grid-view-with-header-and-footer", String.format("getItemViewType: pos: %s, result: %s", new Object[] {
                Integer.valueOf(l), Integer.valueOf(l1), Boolean.valueOf(j), Boolean.valueOf(k)
            }));
        }
        return l1;
_L6:
        if (j)
        {
            i1 = b.size() + k1 + 1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        j1 = 0;
        if (true) goto _L4; else goto _L7
_L7:
    }

    public View getView(int l, View view, ViewGroup viewgroup)
    {
        int i1 = 0;
        int j1;
        if (GridViewWithHeaderAndFooter.a)
        {
            boolean flag;
            if (view == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Log.d("grid-view-with-header-and-footer", String.format("getView: %s, reused: %s", new Object[] {
                Integer.valueOf(l), Boolean.valueOf(flag)
            }));
        }
        j1 = a() * g;
        if (l < j1)
        {
            ViewGroup viewgroup1 = ((a)b.get(l / g)).a;
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
        int l1 = l - j1;
        if (f != null)
        {
            int k1 = d();
            i1 = k1;
            if (l1 < k1)
            {
                if (l1 < f.getCount())
                {
                    return f.getView(l1, view, viewgroup);
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
        i1 = l1 - i1;
        if (i1 < getCount())
        {
            ViewGroup viewgroup2 = ((a)c.get(i1 / g)).a;
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

    public int getViewTypeCount()
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
        if (GridViewWithHeaderAndFooter.a)
        {
            Log.d("grid-view-with-header-and-footer", String.format("getViewTypeCount: %s", new Object[] {
                Integer.valueOf(i1)
            }));
        }
        return i1;
    }

    public ListAdapter getWrappedAdapter()
    {
        return f;
    }

    public boolean hasStableIds()
    {
        if (f != null)
        {
            return f.hasStableIds();
        } else
        {
            return false;
        }
    }

    public boolean isEmpty()
    {
        return (f == null || f.isEmpty()) && a() == 0 && b() == 0;
    }

    public boolean isEnabled(int l)
    {
        int i1;
        boolean flag;
        flag = true;
        i1 = a() * g;
        if (l >= i1) goto _L2; else goto _L1
_L1:
        if (l % g == 0 && ((a)b.get(l / g)).c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L4:
        return flag;
_L2:
        int k1 = l - i1;
        if (f != null)
        {
            int j1 = d();
            l = j1;
            if (k1 < j1)
            {
                if (k1 >= f.getCount() || !f.isEnabled(k1))
                {
                    return false;
                }
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            l = 0;
        }
        l = k1 - l;
        if (l % g != 0 || !((a)c.get(l / g)).c)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        e.registerObserver(datasetobserver);
        if (f != null)
        {
            f.registerDataSetObserver(datasetobserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        e.unregisterObserver(datasetobserver);
        if (f != null)
        {
            f.unregisterDataSetObserver(datasetobserver);
        }
    }

}
