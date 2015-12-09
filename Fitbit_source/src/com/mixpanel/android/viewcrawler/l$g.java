// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            l, e

public static class g extends l
{

    private static final Set d = new HashSet(Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(7)
    }));
    private static final Set e = new HashSet(Arrays.asList(new Integer[] {
        Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8)
    }));
    private final WeakHashMap a = new WeakHashMap();
    private final List b;
    private final String c;
    private boolean f;
    private final b g;
    private final b h = new <init>(null);

    private boolean a(Set set, SparseArray sparsearray)
    {
    /* block-local class not found */
    class _cls1 {}

        TreeMap treemap = new TreeMap(new _cls1());
        int j = sparsearray.size();
        for (int i = 0; i < j; i++)
        {
            View view = (View)sparsearray.valueAt(i);
            int ai[] = ((android.widget.tiveLayout.LayoutParams)view.getLayoutParams()).getRules();
            ArrayList arraylist = new ArrayList();
            Iterator iterator = set.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                int k = ai[((Integer)iterator.next()).intValue()];
                if (k > 0 && k != view.getId())
                {
                    arraylist.add(sparsearray.get(k));
                }
            } while (true);
            treemap.put(view, arraylist);
        }

        return h.a(treemap);
    }

    public void a()
    {
        View view;
        android.widget.tiveLayout.LayoutParams layoutparams;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); view.setLayoutParams(layoutparams))
        {
            java.util.Entry entry = (java.util.Entry)iterator.next();
            view = (View)entry.getKey();
            int ai[] = (int[])entry.getValue();
            layoutparams = (android.widget.tiveLayout.LayoutParams)view.getLayoutParams();
            for (int i = 0; i < ai.length; i++)
            {
                layoutparams.addRule(i, ai[i]);
            }

        }

        f = false;
    }

    public void a(View view)
    {
        SparseArray sparsearray;
        int j;
        int k;
        view = (ViewGroup)view;
        sparsearray = new SparseArray();
        k = view.getChildCount();
        for (int i = 0; i < k; i++)
        {
            View view1 = view.getChildAt(i);
            int i1 = view1.getId();
            if (i1 > 0)
            {
                sparsearray.put(i1, view1);
            }
        }

        k = b.size();
        j = 0;
_L5:
        if (j >= k) goto _L2; else goto _L1
_L1:
        View view2;
        view = (b)b.get(j);
        view2 = (View)sparsearray.get(((b) (view)).a);
        if (view2 != null) goto _L4; else goto _L3
_L3:
        j++;
          goto _L5
_L4:
        android.widget.tiveLayout.LayoutParams layoutparams;
        int ai[];
        layoutparams = (android.widget.tiveLayout.LayoutParams)view2.getLayoutParams();
        ai = (int[])layoutparams.getRules().clone();
        if (ai[((s.getRules) (view)).b] == ((b) (view)).c) goto _L3; else goto _L6
_L6:
        if (!a.containsKey(view2))
        {
            a.put(view2, ai);
        }
        layoutparams.addRule(((s.addRule) (view)).b, ((b) (view)).c);
        if (d.contains(Integer.valueOf(((d) (view)).b)))
        {
            view = d;
        } else
        if (e.contains(Integer.valueOf(((e) (view)).b)))
        {
            view = e;
        } else
        {
            view = null;
        }
        if (view == null || a(((Set) (view)), sparsearray))
        {
            break MISSING_BLOCK_LABEL_290;
        }
        a();
        g.a(new <init>("circular_dependency", c));
_L2:
        return;
        view2.setLayoutParams(layoutparams);
          goto _L3
    }

    public void b(View view)
    {
        if (f)
        {
            c().a(view, b(), this);
        }
    }

    protected String d()
    {
        return "Layout Update";
    }


    public arams(List list, List list1, String s, arams arams)
    {
        super(list);
        b = list1;
        c = s;
        f = true;
        g = arams;
    }
}
