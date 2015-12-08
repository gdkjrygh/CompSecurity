// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CBluePopupMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.view.a.x;
import com.cardinalblue.android.piccollage.view.fragments.i;
import com.cardinalblue.android.piccollage.view.fragments.l;
import com.cardinalblue.android.piccollage.view.fragments.n;
import com.cardinalblue.android.piccollage.view.fragments.q;
import com.cardinalblue.android.piccollage.view.fragments.s;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity, RemixableListActivity

public class a extends Fragment
    implements android.support.v4.view.ViewPager.OnPageChangeListener, s
{

    private View a;
    private ViewPager b;
    private x c;
    private TabLayout d;
    private Fragment e;
    private View f;
    private MenuItem g;
    private MenuItem h;

    public a()
    {
        e = null;
    }

    static MenuItem a(a a1)
    {
        return a1.g;
    }

    private void a()
    {
        c = new x(getActivity(), getChildFragmentManager());
        c.a(getString(0x7f0701b6), com/cardinalblue/android/piccollage/view/fragments/q.getName(), "fragment_home_feed");
        c.a(getString(0x7f0701ad), com/cardinalblue/android/piccollage/view/fragments/n.getName(), "fragment_feature_feed");
        c.a(getString(0x7f07011b), com/cardinalblue/android/piccollage/view/fragments/l.getName(), "fragment_contest_feed");
        b.setAdapter(c);
        b.setOffscreenPageLimit(2);
        d.setupWithViewPager(b);
    }

    private void a(boolean flag)
    {
        if (g != null)
        {
            View view = MenuItemCompat.getActionView(g).findViewById(0x7f1000bb);
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 4;
            }
            view.setVisibility(i1);
        }
    }

    public void a(Fragment fragment, Intent intent, int i1, Bundle bundle)
    {
        e = fragment;
        ActivityCompat.startActivityForResult(getActivity(), intent, i1, bundle);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 999 1000: default 24
    //                   999 32
    //                   1000 32;
           goto _L1 _L2 _L2
_L1:
        super.onActivityResult(i1, j1, intent);
_L4:
        return;
_L2:
        if (j1 == -1 && (getActivity() instanceof AbsDrawerActivity))
        {
            ((AbsDrawerActivity)getActivity()).a(0x7f1002de, null);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onBadgeNumberChange(AbsDrawerActivity.OnBadgeNumberChangeEvent onbadgenumberchangeevent)
    {
        a(onbadgenumberchangeevent.a);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f11000b, menu);
        g = menu.findItem(0x7f1002ed);
        h = menu.findItem(0x7f1002ec);
        MenuItemCompat.getActionView(g).setOnClickListener(new android.view.View.OnClickListener() {

            final a a;

            public void onClick(View view)
            {
                a.getActivity().onOptionsItemSelected(a.a(a));
            }

            
            {
                a = a.this;
                super();
            }
        });
        a(k.g());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = layoutinflater.inflate(0x7f0300ba, viewgroup, false);
        d = (TabLayout)a.findViewById(0x7f1001d9);
        d.setTabTextColors(getResources().getColor(0x7f0f00fe), getResources().getColor(0x7f0f00fe));
        b = (ViewPager)a.findViewById(0x7f1001da);
        b.addOnPageChangeListener(new android.support.design.widget.TabLayout.TabLayoutOnPageChangeListener(d));
        b.addOnPageChangeListener(this);
        setHasOptionsMenu(true);
        a();
        b.setCurrentItem(getArguments().getInt("extra_position", 1));
        f = a.findViewById(0x7f1000dd);
        f.setOnClickListener(new android.view.View.OnClickListener() {

            final a a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.bP();
                view = new CBluePopupMenu(a.getActivity(), view, 0x800055);
                view.setOnDismissListener(new android.support.v7.widget.CBluePopupMenu.OnDismissListener(this) {

                    final _cls1 a;

                    public void onDismiss(CBluePopupMenu cbluepopupmenu)
                    {
                        com.cardinalblue.android.piccollage.controller.d.a().c(new HomeActivity.OnPopupMenuEvent(false));
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                view.inflate(0x7f11000c);
                view.setOnMenuItemClickListener(new android.support.v7.widget.CBluePopupMenu.OnMenuItemClickListener(this) {

                    final _cls1 a;

                    public boolean onMenuItemClick(MenuItem menuitem)
                    {
                        com.cardinalblue.android.piccollage.controller.d.a().c(new HomeActivity.OnPopupMenuEvent(false));
                        switch (menuitem.getItemId())
                        {
                        default:
                            return false;

                        case 2131755759: 
                            com.cardinalblue.android.piccollage.a.b.a("floating action button");
                            com.cardinalblue.android.piccollage.a.b.bR();
                            com.cardinalblue.android.piccollage.a.b.aM("empty");
                            a.a.startActivityForResult(Collage.a(a.a.getActivity()), 999);
                            return true;

                        case 2131755758: 
                            com.cardinalblue.android.piccollage.a.b.bQ();
                            menuitem = new Intent(a.a.getActivity(), com/cardinalblue/android/piccollage/activities/RemixableListActivity);
                            a.a.startActivityForResult(menuitem, 1000);
                            return true;

                        case 2131755760: 
                            com.cardinalblue.android.piccollage.a.b.bS();
                            break;
                        }
                        com.cardinalblue.android.piccollage.a.b.aM("grid");
                        menuitem = Collage.a(a.a.getActivity());
                        menuitem.putExtra("extra_grid_flow", true);
                        a.a.startActivityForResult(menuitem, 999);
                        return true;
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                com.cardinalblue.android.piccollage.controller.d.a().c(new HomeActivity.OnPopupMenuEvent(true));
                view.show();
            }

            
            {
                a = a.this;
                super();
            }
        });
        return a;
    }

    public void onDestroy()
    {
        try
        {
            com.bumptech.glide.g.a(getActivity()).f();
        }
        catch (Throwable throwable)
        {
            com.cardinalblue.android.piccollage.a.f.a(throwable);
        }
        super.onDestroy();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        b.clearOnPageChangeListeners();
    }

    public void onPageScrollStateChanged(int i1)
    {
    }

    public void onPageScrolled(int i1, float f1, int j1)
    {
    }

    public void onPageSelected(int i1)
    {
        i1;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 64
    //                   1 97
    //                   2 109;
           goto _L1 _L2 _L3 _L4
_L1:
        Fragment fragment = (Fragment)c.instantiateItem(b, i1);
        if (fragment != null && (fragment instanceof i))
        {
            ((i)fragment).a(this);
        }
        return;
_L2:
        com.cardinalblue.android.piccollage.a.b.c("following");
        String s1;
        if (PicAuth.h().b())
        {
            s1 = "yes";
        } else
        {
            s1 = "no";
        }
        com.cardinalblue.android.piccollage.a.b.d(s1);
        continue; /* Loop/switch isn't completed */
_L3:
        com.cardinalblue.android.piccollage.a.b.c("featured");
        com.cardinalblue.android.piccollage.a.b.g();
        continue; /* Loop/switch isn't completed */
_L4:
        com.cardinalblue.android.piccollage.a.b.c("contests");
        com.cardinalblue.android.piccollage.a.b.h();
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        boolean flag1 = true;
        if (getActivity() != null)
        {
            boolean flag2 = ((AbsDrawerActivity)getActivity()).h();
            boolean flag;
            if (g != null)
            {
                menu = g;
                if (!flag2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                menu.setVisible(flag);
            }
            if (h != null)
            {
                menu = h;
                if (!flag2)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                menu.setVisible(flag);
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        getActivity().setTitle(0x7f07010b);
    }

    public void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.controller.d.b(this);
        try
        {
            com.bumptech.glide.g.a(getActivity()).d();
            return;
        }
        catch (Throwable throwable)
        {
            com.cardinalblue.android.piccollage.a.f.a(throwable);
        }
    }

    public void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.controller.d.a(this);
        try
        {
            com.bumptech.glide.g.a(getActivity()).e();
            return;
        }
        catch (Throwable throwable)
        {
            com.cardinalblue.android.piccollage.a.f.a(throwable);
        }
    }
}
