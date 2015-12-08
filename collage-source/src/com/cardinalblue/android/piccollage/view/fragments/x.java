// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.CBSwipeRefreshLayout;
import android.support.v7.widget.CBluePopupMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.activities.AbsDrawerActivity;
import com.cardinalblue.android.piccollage.activities.RemixableListActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.NotificationResponse;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            f

public class x extends com.cardinalblue.android.piccollage.view.fragments.f
{

    private MenuItem b;

    public x()
    {
    }

    protected void a(int i, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        f.b(getActivity(), i, new com.android.volley.m.b(b1) {

            final com.android.volley.m.b a;
            final x b;

            public void a(NotificationResponse notificationresponse)
            {
                k.a(false);
                if (a != null)
                {
                    a.a(notificationresponse);
                }
            }

            public volatile void a(Object obj)
            {
                a((NotificationResponse)obj);
            }

            
            {
                b = x.this;
                a = b1;
                super();
            }
        }, a1);
    }

    protected void a(View view)
    {
        view.findViewById(0x7f1001ec).setOnClickListener(new android.view.View.OnClickListener() {

            final x a;

            public void onClick(View view1)
            {
                (new com.cardinalblue.android.piccollage.auth.a.d()).a(a.getActivity(), 666, "activity feed");
            }

            
            {
                a = x.this;
                super();
            }
        });
        view.findViewById(0x7f1000dd).setOnClickListener(new android.view.View.OnClickListener() {

            final x a;

            public void onClick(View view1)
            {
                com.cardinalblue.android.piccollage.a.b.bP();
                view1 = new CBluePopupMenu(a.getActivity(), view1, 0x800055);
                view1.setOnDismissListener(new android.support.v7.widget.CBluePopupMenu.OnDismissListener(this) {

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
                view1.inflate(0x7f11000c);
                view1.setOnMenuItemClickListener(new android.support.v7.widget.CBluePopupMenu.OnMenuItemClickListener(this) {

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
                view1.show();
            }

            
            {
                a = x.this;
                super();
            }
        });
    }

    protected int b()
    {
        return 0x7f0300c1;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        i;
        JVM INSTR tableswitch 999 1000: default 24
    //                   999 32
    //                   1000 32;
           goto _L1 _L2 _L2
_L1:
        super.onActivityResult(i, j, intent);
_L4:
        return;
_L2:
        if (j == -1 && (getActivity() instanceof AbsDrawerActivity))
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
        b = menu.findItem(0x7f1002e8);
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        if (getActivity() != null)
        {
            boolean flag = ((AbsDrawerActivity)getActivity()).h();
            menu = b;
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

    public void onRefresh()
    {
        f.b(getActivity(), 0, new com.android.volley.m.b() {

            final x a;

            public void a(NotificationResponse notificationresponse)
            {
                a.a(notificationresponse);
                if (a.a.isRefreshing())
                {
                    a.a.setRefreshing(false);
                }
            }

            public volatile void a(Object obj)
            {
                a((NotificationResponse)obj);
            }

            
            {
                a = x.this;
                super();
            }
        }, this);
    }

    public void onResume()
    {
        super.onResume();
        if (PicAuth.h().b())
        {
            getFragmentManager().popBackStack();
            d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.b(0x7f1002e0));
        }
    }
}
