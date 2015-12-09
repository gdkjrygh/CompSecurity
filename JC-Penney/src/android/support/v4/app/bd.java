// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.app:
//            az

final class bd
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final Transition b;
    final ArrayList c;
    final Transition d;
    final ArrayList e;
    final Transition f;
    final ArrayList g;
    final Map h;
    final ArrayList i;
    final Transition j;
    final View k;

    bd(View view, Transition transition, ArrayList arraylist, Transition transition1, ArrayList arraylist1, Transition transition2, ArrayList arraylist2, 
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

    public boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (b != null)
        {
            az.a(b, c);
        }
        if (d != null)
        {
            az.a(d, e);
        }
        if (f != null)
        {
            az.a(f, g);
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
