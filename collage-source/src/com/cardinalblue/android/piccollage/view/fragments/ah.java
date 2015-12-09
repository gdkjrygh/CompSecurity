// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.view.a.x;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ag, ai

public class ah extends Fragment
{
    public static class a
    {

        public final String a;

        public a(String s)
        {
            a = s;
        }
    }

    public static class b
    {

        public final String a;

        public b(String s)
        {
            a = s;
        }
    }

    public static class c
    {

        public final String a;

        public c(String s)
        {
            a = s;
        }
    }


    protected String a;
    private ViewPager b;
    private MenuItem c;

    public ah()
    {
    }

    static ViewPager a(ah ah1)
    {
        return ah1.b;
    }

    static void a(ah ah1, String s)
    {
        ah1.b(s);
    }

    private void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            getActivity().setTitle(0x7f070254);
            return;
        } else
        {
            s = (new StringBuilder()).append(getString(0x7f070255)).append(" ").append(s).toString();
            getActivity().setTitle(s);
            return;
        }
    }

    private void b(String s)
    {
        a = s;
        a(s);
        d.a().c(new b(s));
        if (c != null)
        {
            c.collapseActionView();
        }
    }

    public void onChoose(a a1)
    {
        a1 = a1.a;
        com.cardinalblue.android.piccollage.a.b.as(a1);
        b(a1);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f110008, menu);
        c = menu.findItem(0x7f1002eb);
        menu = (SearchView)MenuItemCompat.getActionView(c);
        MenuItemCompat.setOnActionExpandListener(c, new android.support.v4.view.MenuItemCompat.OnActionExpandListener() {

            final ah a;

            public boolean onMenuItemActionCollapse(MenuItem menuitem)
            {
                return true;
            }

            public boolean onMenuItemActionExpand(MenuItem menuitem)
            {
                d.a().c(new b(null));
                a.a = null;
                return true;
            }

            
            {
                a = ah.this;
                super();
            }
        });
        if (menu != null)
        {
            k.a(menu);
            menu.setQueryHint(getString(0x7f070254));
            menu.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {

                final ah a;

                public boolean onQueryTextChange(String s)
                {
                    if (TextUtils.isEmpty(s))
                    {
                        d.a().c(new b(null));
                    }
                    a.a = s;
                    return false;
                }

                public boolean onQueryTextSubmit(String s)
                {
                    ah.a(a).getCurrentItem();
                    JVM INSTR tableswitch 0 1: default 32
                //                               0 42
                //                               1 49;
                       goto _L1 _L2 _L3
_L1:
                    ah.a(a, s);
                    return false;
_L2:
                    com.cardinalblue.android.piccollage.a.b.ar(s);
                    continue; /* Loop/switch isn't completed */
_L3:
                    com.cardinalblue.android.piccollage.a.b.aq(s);
                    if (true) goto _L1; else goto _L4
_L4:
                }

            
            {
                a = ah.this;
                super();
            }
            });
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        setHasOptionsMenu(true);
        layoutinflater = layoutinflater.inflate(0x7f0300b7, viewgroup, false);
        viewgroup = new x(getActivity(), getChildFragmentManager());
        viewgroup.a(getString(0x7f070115), com/cardinalblue/android/piccollage/view/fragments/ag.getName(), "tag_search_collage_fragment");
        viewgroup.a(getString(0x7f0702bc), com/cardinalblue/android/piccollage/view/fragments/ai.getName(), "tag_search_user_fragment");
        b = (ViewPager)layoutinflater.findViewById(0x7f1000d1);
        b.setAdapter(viewgroup);
        b.setOffscreenPageLimit(3);
        viewgroup = (TabLayout)layoutinflater.findViewById(0x7f1000d0);
        int i = getResources().getColor(0x7f0f00fe);
        viewgroup.setTabTextColors(i, i);
        viewgroup.setupWithViewPager(b);
        b.addOnPageChangeListener(new android.support.design.widget.TabLayout.TabLayoutOnPageChangeListener(viewgroup));
        viewgroup = getArguments();
        if (viewgroup != null && viewgroup.containsKey("extra_init_fragment_pos"))
        {
            b.setCurrentItem(viewgroup.getInt("extra_init_fragment_pos"));
        }
        if (bundle != null)
        {
            a = bundle.getString("saved_query_string");
            b(a);
        }
        a(a);
        return layoutinflater;
    }

    public void onPause()
    {
        super.onPause();
        d.a(this);
    }

    public void onResume()
    {
        super.onResume();
        d.b(this);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("saved_query_string", a);
    }
}
