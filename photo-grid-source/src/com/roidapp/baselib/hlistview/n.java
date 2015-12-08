// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.support.v4.util.SparseArrayCompat;
import android.view.View;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            AbsHListView

public final class n
{

    final AbsHListView a;
    private int b;
    private View c[];
    private ArrayList d[];
    private int e;
    private ArrayList f;
    private ArrayList g;
    private SparseArrayCompat h;

    public n(AbsHListView abshlistview)
    {
        a = abshlistview;
        super();
        c = new View[0];
    }

    public final void a()
    {
        boolean flag = false;
        if (e == 1)
        {
            ArrayList arraylist = f;
            int l = arraylist.size();
            for (int i = 0; i < l; i++)
            {
                ((View)arraylist.get(i)).forceLayout();
            }

        } else
        {
            int k1 = e;
            for (int j = 0; j < k1; j++)
            {
                ArrayList arraylist1 = d[j];
                int l1 = arraylist1.size();
                for (int i1 = 0; i1 < l1; i1++)
                {
                    ((View)arraylist1.get(i1)).forceLayout();
                }

            }

        }
        if (h != null)
        {
            int j1 = h.size();
            for (int k = ((flag) ? 1 : 0); k < j1; k++)
            {
                ((View)h.valueAt(k)).forceLayout();
            }

        }
    }

    public final void a(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
        }
        ArrayList aarraylist[] = new ArrayList[i];
        for (int j = 0; j < i; j++)
        {
            aarraylist[j] = new ArrayList();
        }

        e = i;
        f = aarraylist[0];
        d = aarraylist;
    }

    public final void a(int i, int j)
    {
        if (c.length < i)
        {
            c = new View[i];
        }
        b = j;
        View aview[] = c;
        for (j = 0; j < i; j++)
        {
            View view = a.getChildAt(j);
            AbsHListView.LayoutParams layoutparams = (AbsHListView.LayoutParams)view.getLayoutParams();
            if (layoutparams != null && layoutparams.a != -2)
            {
                aview[j] = view;
            }
        }

    }

    public final void a(View view, int i)
    {
        AbsHListView.LayoutParams layoutparams = (AbsHListView.LayoutParams)view.getLayoutParams();
        if (layoutparams != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        layoutparams.d = i;
        j = layoutparams.a;
        boolean flag;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag1 = view.hasTransientState();
        } else
        {
            flag1 = false;
        }
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j != -2 || flag1)
        {
            if (g == null)
            {
                g = new ArrayList();
            }
            g.add(view);
        }
        if (flag1)
        {
            if (h == null)
            {
                h = new SparseArrayCompat();
            }
            view.onStartTemporaryDetach();
            h.put(i, view);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        view.onStartTemporaryDetach();
        if (e == 1)
        {
            f.add(view);
        } else
        {
            d[j].add(view);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            view.setAccessibilityDelegate(null);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final View b(int i)
    {
        i -= b;
        View aview[] = c;
        if (i >= 0 && i < aview.length)
        {
            View view = aview[i];
            aview[i] = null;
            return view;
        } else
        {
            return null;
        }
    }

    public final void b()
    {
        int i = 0;
        if (e == 1)
        {
            ArrayList arraylist = f;
            for (int k = arraylist.size(); i < k; i++)
            {
                AbsHListView.a(a, (View)arraylist.remove(k - 1 - i));
            }

        } else
        {
            int i1 = e;
            for (int j = 0; j < i1; j++)
            {
                ArrayList arraylist1 = d[j];
                int j1 = arraylist1.size();
                for (int l = 0; l < j1; l++)
                {
                    AbsHListView.b(a, (View)arraylist1.remove(j1 - 1 - l));
                }

            }

        }
        if (h != null)
        {
            h.clear();
        }
    }

    final View c(int i)
    {
        if (h != null)
        {
            if ((i = h.indexOfKey(i)) >= 0)
            {
                View view = (View)h.valueAt(i);
                h.removeAt(i);
                return view;
            }
        }
        return null;
    }

    final void c()
    {
        if (h != null)
        {
            h.clear();
        }
    }

    final View d(int i)
    {
        if (e == 1)
        {
            return AbsHListView.a(f, i);
        }
        int j = a.j.getItemViewType(i);
        if (j >= 0 && j < d.length)
        {
            return AbsHListView.a(d[j], i);
        } else
        {
            return null;
        }
    }

    public final void d()
    {
        if (g == null)
        {
            return;
        }
        int j = g.size();
        for (int i = 0; i < j; i++)
        {
            AbsHListView.c(a, (View)g.get(i));
        }

        g.clear();
    }

    public final void e()
    {
        boolean flag2 = false;
        View aview[] = c;
        Object obj;
        boolean flag;
        int k;
        if (e > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = f;
        k = aview.length - 1;
        while (k >= 0) 
        {
            View view = aview[k];
            Object obj1 = obj;
            if (view != null)
            {
                obj1 = (AbsHListView.LayoutParams)view.getLayoutParams();
                int k1 = ((AbsHListView.LayoutParams) (obj1)).a;
                aview[k] = null;
                boolean flag1;
                boolean flag3;
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    flag3 = view.hasTransientState();
                } else
                {
                    flag3 = false;
                }
                if (k1 >= 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (!flag1 || flag3)
                {
                    if (k1 != -2 || flag3)
                    {
                        AbsHListView.d(a, view);
                    }
                    obj1 = obj;
                    if (flag3)
                    {
                        if (h == null)
                        {
                            h = new SparseArrayCompat();
                        }
                        h.put(b + k, view);
                        obj1 = obj;
                    }
                } else
                {
                    if (flag)
                    {
                        obj = d[k1];
                    }
                    view.onStartTemporaryDetach();
                    obj1.d = b + k;
                    ((ArrayList) (obj)).add(view);
                    obj1 = obj;
                    if (android.os.Build.VERSION.SDK_INT >= 14)
                    {
                        view.setAccessibilityDelegate(null);
                        obj1 = obj;
                    }
                }
            }
            k--;
            obj = obj1;
        }
        int l1 = c.length;
        int i2 = e;
        ArrayList aarraylist[] = d;
        for (int i = 0; i < i2; i++)
        {
            ArrayList arraylist = aarraylist[i];
            int j2 = arraylist.size();
            int l = j2 - 1;
            for (int j1 = 0; j1 < j2 - l1;)
            {
                AbsHListView.e(a, (View)arraylist.remove(l));
                j1++;
                l--;
            }

        }

        if (h != null)
        {
            int i1;
            for (int j = ((flag2) ? 1 : 0); j < h.size(); j = i1 + 1)
            {
                i1 = j;
                if (!((View)h.valueAt(j)).hasTransientState())
                {
                    h.removeAt(j);
                    i1 = j - 1;
                }
            }

        }
    }

    final void e(int i)
    {
        if (e == 1)
        {
            ArrayList arraylist = f;
            int i1 = arraylist.size();
            for (int j = 0; j < i1; j++)
            {
                ((View)arraylist.get(j)).setDrawingCacheBackgroundColor(i);
            }

        } else
        {
            int l1 = e;
            for (int k = 0; k < l1; k++)
            {
                ArrayList arraylist1 = d[k];
                int i2 = arraylist1.size();
                for (int j1 = 0; j1 < i2; j1++)
                {
                    ((View)arraylist1.get(j1)).setDrawingCacheBackgroundColor(i);
                }

            }

        }
        View aview[] = c;
        int k1 = aview.length;
        for (int l = 0; l < k1; l++)
        {
            View view = aview[l];
            if (view != null)
            {
                view.setDrawingCacheBackgroundColor(i);
            }
        }

    }
}
