// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.util.SortedList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.b.a.d;
import com.tinder.activities.ActivityMain;
import com.tinder.adapters.v;
import com.tinder.e.q;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.i;
import com.tinder.model.Match;
import com.tinder.utils.ab;
import com.tinder.views.DividerItemDecoration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.tinder.fragments:
//            i, h

public final class g extends Fragment
{

    i a;
    private Set b;
    private RecyclerView c;
    private v d;

    public g()
    {
    }

    public static g a(Set set)
    {
        g g1 = new g();
        Bundle bundle = new Bundle();
        bundle.putSerializable("match-content", (HashSet)set);
        g1.setArguments(bundle);
        (new StringBuilder("contents ")).append(set.size());
        return g1;
    }

    static void a(g g1, int j)
    {
        Match match = (Match)g1.d.b.get(j);
        ((q)g1.getActivity()).a(match, false);
        g1.a.a(match);
        (new Handler()).postDelayed(g1. new Runnable() {

            final g a;

            public final void run()
            {
                if (a.getActivity() instanceof ActivityMain)
                {
                    ((ActivityMain)a.getActivity()).s();
                }
            }

            
            {
                a = g.this;
                super();
            }
        }, 800L);
    }

    static boolean a(String s, Match match)
    {
        return match.getName().toLowerCase().startsWith(s);
    }

    public final void a(String s)
    {
        if (b == null || b.isEmpty())
        {
            return;
        }
        s = s.toLowerCase();
        s = (List)com.b.a.d.a(b).a(new com.tinder.fragments.i(s)).a(new com.b.a.b._cls1());
        int l = s.size();
        for (int j = 0; j < l; j++)
        {
            Match match = (Match)s.get(j);
            if (d.a(match) < 0)
            {
                d.b.add(match);
            }
        }

        for (int k = s.size() - 1; k >= 0; k--)
        {
            Match match1 = (Match)s.get(k);
            int i1 = d.a(match1);
            if (i1 >= 0 && i1 != k)
            {
                d.b.recalculatePositionOfItemAt(i1);
            }
        }

        c.scrollToPosition(0);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ManagerApp.h().a(this);
        return layoutinflater.inflate(0x7f030056, viewgroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        c = (RecyclerView)view.findViewById(0x7f0e0185);
        view = new LinearLayoutManager(getContext(), 1, false);
        bundle = new DividerItemDecoration(getContext(), getContext().getResources().getDrawable(0x7f020222));
        bundle.setLeftMargin(0x7f090124);
        c.addItemDecoration(bundle);
        c.setLayoutManager(view);
        c.addOnItemTouchListener(new ab(getContext(), new h(this)));
        b = (Set)getArguments().getSerializable("match-content");
        (new StringBuilder("Matches ")).append(b.size());
        d = new v(getContext());
        view = d;
        bundle = b;
        ((v) (view)).b.addAll(bundle);
        c.setAdapter(d);
    }
}
