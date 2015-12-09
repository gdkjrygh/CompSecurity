// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CBluePopupMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.AbsDrawerActivity;
import com.cardinalblue.android.piccollage.activities.RemixableListActivity;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.view.a.x;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            b

public class ak extends Fragment
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    private x a;
    private ViewPager b;
    private MenuItem c;

    public ak()
    {
    }

    public void onActivityResult(int i, int l, Intent intent)
    {
        i;
        JVM INSTR tableswitch 999 1000: default 24
    //                   999 32
    //                   1000 32;
           goto _L1 _L2 _L2
_L1:
        super.onActivityResult(i, l, intent);
_L4:
        return;
_L2:
        if (l == -1 && (getActivity() instanceof AbsDrawerActivity))
        {
            ((AbsDrawerActivity)getActivity()).a(0x7f1002de, null);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f110006, menu);
        c = menu.findItem(0x7f1002e8);
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ce, null);
        a = new x(getActivity(), getChildFragmentManager());
        viewgroup = new Bundle();
        viewgroup.putBoolean("extra_is_global_feed", true);
        a.a(getString(0x7f0700ee), com/cardinalblue/android/piccollage/view/fragments/b.getName(), new Bundle(), "activity_feed");
        a.a(getString(0x7f0700ec), com/cardinalblue/android/piccollage/view/fragments/b.getName(), viewgroup, "global_feed");
        b = (ViewPager)layoutinflater.findViewById(0x7f1000d1);
        b.setAdapter(a);
        viewgroup = (TabLayout)layoutinflater.findViewById(0x7f1000d0);
        int i = getResources().getColor(0x7f0f00fe);
        viewgroup.setTabTextColors(i, i);
        viewgroup.setupWithViewPager(b);
        b.addOnPageChangeListener(new android.support.design.widget.TabLayout.TabLayoutOnPageChangeListener(viewgroup));
        j.a(new Callable() {

            final ak a;

            public Void a()
                throws Exception
            {
                a.onPageSelected(0);
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = ak.this;
                super();
            }
        }, k.a);
        layoutinflater.findViewById(0x7f1000dd).setOnClickListener(new android.view.View.OnClickListener() {

            final ak a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.bP();
                view = new CBluePopupMenu(a.getActivity(), view, 0x800055);
                view.setOnDismissListener(new android.support.v7.widget.CBluePopupMenu.OnDismissListener(this) {

                    final _cls2 a;

                    public void onDismiss(CBluePopupMenu cbluepopupmenu)
                    {
                        d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.OnPopupMenuEvent(false));
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
                view.inflate(0x7f11000c);
                view.setOnMenuItemClickListener(new android.support.v7.widget.CBluePopupMenu.OnMenuItemClickListener(this) {

                    final _cls2 a;

                    public boolean onMenuItemClick(MenuItem menuitem)
                    {
                        d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.OnPopupMenuEvent(false));
                        switch (menuitem.getItemId())
                        {
                        default:
                            return false;

                        case 2131755759: 
                            com.cardinalblue.android.piccollage.a.b.a("activity : floating button");
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
                a = _pcls2;
                super();
            }
                });
                d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.OnPopupMenuEvent(true));
                view.show();
            }

            
            {
                a = ak.this;
                super();
            }
        });
        getActivity().setTitle(0x7f0700e5);
        setHasOptionsMenu(true);
        return layoutinflater;
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int l)
    {
    }

    public void onPageSelected(int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 47
    //                   1 41;
           goto _L1 _L2 _L3
_L1:
        com.cardinalblue.android.piccollage.view.fragments.b b1 = (com.cardinalblue.android.piccollage.view.fragments.b)a.instantiateItem(b, i);
        return;
_L3:
        com.cardinalblue.android.piccollage.a.b.bD();
        continue; /* Loop/switch isn't completed */
_L2:
        com.cardinalblue.android.piccollage.a.b.bE();
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        if (getActivity() != null)
        {
            boolean flag = ((AbsDrawerActivity)getActivity()).h();
            menu = c;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menu.setVisible(flag);
        }
    }

    public void onStart()
    {
        super.onStart();
        d.b(this);
    }

    public void onStop()
    {
        super.onStop();
        d.a(this);
    }
}
