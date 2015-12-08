// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public final class dae extends czv
{

    private static final Set f = new HashSet(Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(7)
    }));
    private static final Set g = new HashSet(Arrays.asList(new Integer[] {
        Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8)
    }));
    private final WeakHashMap c = new WeakHashMap();
    private final List d;
    private final String e;
    private boolean h;
    private final dag i;
    private final daa j = new daa((byte)0);

    public dae(List list, List list1, String s, dag dag1)
    {
        super(list);
        d = list1;
        e = s;
        h = true;
        i = dag1;
    }

    private boolean a(Set set, SparseArray sparsearray)
    {
        TreeMap treemap = new TreeMap(new Comparator() {

            public final int compare(Object obj, Object obj1)
            {
                obj = (View)obj;
                obj1 = (View)obj1;
                if (obj == obj1)
                {
                    return 0;
                }
                if (obj == null)
                {
                    return -1;
                }
                if (obj1 == null)
                {
                    return 1;
                } else
                {
                    return obj1.hashCode() - obj.hashCode();
                }
            }

        });
        int l = sparsearray.size();
        for (int k = 0; k < l; k++)
        {
            View view = (View)sparsearray.valueAt(k);
            int ai[] = ((android.widget.RelativeLayout.LayoutParams)view.getLayoutParams()).getRules();
            ArrayList arraylist = new ArrayList();
            Iterator iterator = set.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                int i1 = ai[((Integer)iterator.next()).intValue()];
                if (i1 > 0 && i1 != view.getId())
                {
                    arraylist.add(sparsearray.get(i1));
                }
            } while (true);
            treemap.put(view, arraylist);
        }

        return j.a(treemap);
    }

    public final void a()
    {
        View view;
        android.widget.RelativeLayout.LayoutParams layoutparams;
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); view.setLayoutParams(layoutparams))
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            view = (View)entry.getKey();
            int ai[] = (int[])entry.getValue();
            layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
            for (int k = 0; k < ai.length; k++)
            {
                layoutparams.addRule(k, ai[k]);
            }

        }

        h = false;
    }

    public final void a(View view)
    {
        view = (ViewGroup)view;
        SparseArray sparsearray = new SparseArray();
        int i1 = view.getChildCount();
        for (int k = 0; k < i1; k++)
        {
            View view1 = view.getChildAt(k);
            int j1 = view1.getId();
            if (j1 > 0)
            {
                sparsearray.put(j1, view1);
            }
        }

        i1 = d.size();
        int l = 0;
        do
        {
label0:
            {
                View view2;
                android.widget.RelativeLayout.LayoutParams layoutparams;
label1:
                {
                    if (l < i1)
                    {
                        view = (dad)d.get(l);
                        view2 = (View)sparsearray.get(((dad) (view)).a);
                        if (view2 == null)
                        {
                            break label0;
                        }
                        layoutparams = (android.widget.RelativeLayout.LayoutParams)view2.getLayoutParams();
                        int ai[] = (int[])layoutparams.getRules().clone();
                        if (ai[((dad) (view)).b] == ((dad) (view)).c)
                        {
                            break label0;
                        }
                        if (!c.containsKey(view2))
                        {
                            c.put(view2, ai);
                        }
                        layoutparams.addRule(((dad) (view)).b, ((dad) (view)).c);
                        if (f.contains(Integer.valueOf(((dad) (view)).b)))
                        {
                            view = f;
                        } else
                        if (g.contains(Integer.valueOf(((dad) (view)).b)))
                        {
                            view = g;
                        } else
                        {
                            view = null;
                        }
                        if (view == null || a(((Set) (view)), sparsearray))
                        {
                            break label1;
                        }
                        a();
                        i.a(new dac("circular_dependency", e));
                    }
                    return;
                }
                view2.setLayoutParams(layoutparams);
            }
            l++;
        } while (true);
    }

    public final void b(View view)
    {
        if (h)
        {
            super.b.a(view, super.a, this);
        }
    }

}
