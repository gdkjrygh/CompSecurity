// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class bt
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    private View a;
    private Transition b;
    private ArrayList c;
    private Transition d;
    private ArrayList e;
    private Transition f;
    private ArrayList g;
    private Map h;
    private ArrayList i;
    private Transition j;
    private View k;

    public bt(View view, Transition transition, ArrayList arraylist, Transition transition1, ArrayList arraylist1, Transition transition2, ArrayList arraylist2, 
            Map map, ArrayList arraylist3, Transition transition3, View view1)
    {
        a = view;
        b = transition;
        c = arraylist;
        d = transition1;
        e = arraylist1;
        f = transition2;
        g = arraylist2;
        h = map;
        i = arraylist3;
        j = transition3;
        k = view1;
        super();
    }

    public final boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (b != null)
        {
            b.a(b, c);
        }
        if (d != null)
        {
            b.a(d, e);
        }
        if (f != null)
        {
            b.a(f, g);
        }
        java.util.Map.Entry entry;
        for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); ((View)entry.getValue()).setTransitionName((String)entry.getKey()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        int i1 = i.size();
        for (int l = 0; l < i1; l++)
        {
            j.excludeTarget((View)i.get(l), false);
        }

        j.excludeTarget(k, false);
        return true;
    }
}
