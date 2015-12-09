// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.HackyViewPager;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.widget.CBluePopupMenu;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bolts.j;
import com.bumptech.glide.g;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.AbsDrawerActivity;
import com.cardinalblue.android.piccollage.activities.RemixableListActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.h;
import com.cardinalblue.android.piccollage.events.i;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.a.a;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.NotificationResponse;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;
import com.cardinalblue.android.piccollage.model.gson.WebPromotionData;
import com.cardinalblue.android.piccollage.model.k;
import com.cardinalblue.android.piccollage.view.a.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class v extends Fragment
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{
    public static class a
    {

        public a()
        {
        }
    }

    public static class b
    {

        public b()
        {
        }
    }

    public static class c
    {

        public c()
        {
        }
    }


    private boolean a;
    private ImageView b;
    private HackyViewPager c;
    private p d;
    private View e;
    private MenuItem f;
    private MenuItem g;

    public v()
    {
        a = false;
    }

    static ImageView a(v v1)
    {
        return v1.b;
    }

    private void a()
    {
        ViewCompat.animate(e).alpha(1.0F).scaleX(1.0F).scaleY(1.0F).start();
    }

    private void a(Collage collage)
    {
        List list;
        FragmentActivity fragmentactivity;
        fragmentactivity = getActivity();
        list = null;
        Object obj = collage.x();
        list = ((List) (obj));
_L2:
        obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        long l = collage.p();
        list = com.cardinalblue.android.piccollage.model.a.a.a(fragmentactivity).a(l);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((List) (obj)).addAll(list);
        com.cardinalblue.android.piccollage.model.a.a.a(fragmentactivity).a(collage);
        for (collage = ((List) (obj)).iterator(); collage.hasNext(); k.b((File)collage.next())) { }
        break MISSING_BLOCK_LABEL_112;
        collage;
        com.cardinalblue.android.b.k.a(fragmentactivity, 0x7f0700df, 0);
        com.cardinalblue.android.piccollage.a.f.a(collage);
        return;
        IOException ioexception;
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void a(WebPromotionData webpromotiondata)
    {
        j.a(new Callable(webpromotiondata) {

            final WebPromotionData a;
            final v b;

            public Bitmap a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.lib.i.a().a(a.getBannerUrl(), 0, 0, android.graphics.Bitmap.Config.ARGB_8888);
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = v.this;
                a = webpromotiondata;
                super();
            }
        }).c(new bolts.i(webpromotiondata) {

            final WebPromotionData a;
            final v b;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.b.k.a(com.cardinalblue.android.piccollage.view.fragments.v.a(b), (Bitmap)j1.e());
                com.cardinalblue.android.piccollage.view.fragments.v.a(b).setOnClickListener(new android.view.View.OnClickListener(this) {

                    final _cls7 a;

                    public void onClick(View view)
                    {
                        com.cardinalblue.android.piccollage.a.b.av(a.a.getPromotionId());
                        if (!TextUtils.isEmpty(a.a.getClickEvent()))
                        {
                            com.cardinalblue.android.piccollage.a.f.a(a.a.getClickEvent());
                        }
                        try
                        {
                            view = PICAppRoutesService.d(a.a.getClickUrl());
                            view.putExtra("extra_start_from", "banner");
                            a.b.getActivity().startService(view);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (View view)
                        {
                            com.cardinalblue.android.piccollage.a.f.a(view);
                        }
                    }

            
            {
                a = _pcls7;
                super();
            }
                });
                com.cardinalblue.android.piccollage.a.b.au(a.getPromotionId());
                if (!TextUtils.isEmpty(a.getShowEvent()))
                {
                    com.cardinalblue.android.piccollage.a.f.a(a.getShowEvent());
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = v.this;
                a = webpromotiondata;
                super();
            }
        }, j.b);
    }

    static void a(v v1, WebPromotionData webpromotiondata)
    {
        v1.a(webpromotiondata);
    }

    private void a(boolean flag)
    {
        if (f != null)
        {
            View view = MenuItemCompat.getActionView(f).findViewById(0x7f1000bb);
            int l;
            if (flag)
            {
                l = 0;
            } else
            {
                l = 4;
            }
            view.setVisibility(l);
        }
    }

    static boolean a(v v1, Collage collage)
    {
        return v1.b(collage);
    }

    private void b()
    {
        ViewCompat.animate(e).alpha(0.0F).scaleX(0.0F).scaleY(0.0F).start();
    }

    static void b(v v1)
    {
        v1.c();
    }

    private boolean b(Collage collage)
    {
        if (d == null)
        {
            return false;
        } else
        {
            com.cardinalblue.android.b.k.a(getActivity(), d.b(collage.p()));
            a(collage);
            return true;
        }
    }

    static MenuItem c(v v1)
    {
        return v1.f;
    }

    private void c()
    {
        d.a(com.cardinalblue.android.piccollage.model.a.a.a(getActivity()).a());
        long l1 = com.cardinalblue.android.b.k.g(getActivity());
        int l = d.a(l1);
        c.setCurrentItem(l, false);
    }

    private void c(Collage collage)
    {
        (new android.app.AlertDialog.Builder(getActivity())).setMessage(0x7f0700fe).setCancelable(true).setPositiveButton(0x1040013, new android.content.DialogInterface.OnClickListener(collage) {

            final Collage a;
            final v b;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                if (com.cardinalblue.android.piccollage.view.fragments.v.a(b, a))
                {
                    com.cardinalblue.android.piccollage.view.fragments.v.b(b);
                } else
                {
                    com.cardinalblue.android.b.k.a(b.getActivity(), 0x7f0700f8, 1);
                }
                dialoginterface.dismiss();
            }

            
            {
                b = v.this;
                a = collage;
                super();
            }
        }).setNegativeButton(0x1040009, null).create().show();
    }

    private void d()
    {
        if (!PicAuth.h().b())
        {
            return;
        } else
        {
            j.a(new Callable() {

                final v a;

                public NotificationResponse a()
                    throws Exception
                {
                    return com.cardinalblue.android.piccollage.controller.network.f.d(a.getActivity());
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = v.this;
                super();
            }
            }).c(new bolts.i() {

                final v a;

                public Void a(j j1)
                    throws Exception
                {
                    com.cardinalblue.android.b.k.a(((NotificationResponse)j1.e()).hasBadge());
                    return null;
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                a = v.this;
                super();
            }
            }, j.b);
            return;
        }
    }

    private void e()
    {
        j.a(new Callable() {

            final v a;

            public CBCollagesResponse a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.controller.network.f.j();
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = v.this;
                super();
            }
        }).a(new bolts.i() {

            final v a;

            public Void a(j j1)
                throws Exception
            {
                if (j1.c() || j1.d())
                {
                    com.cardinalblue.android.piccollage.view.fragments.v.a(a).setVisibility(8);
                    return null;
                }
                j1 = (CBCollagesResponse)j1.e();
                if (j1 != null && j1.getPromotion() != null)
                {
                    com.cardinalblue.android.piccollage.view.fragments.v.a(a, j1.getPromotion());
                    return null;
                } else
                {
                    com.cardinalblue.android.piccollage.view.fragments.v.a(a).setVisibility(8);
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = v.this;
                super();
            }
        }, com.cardinalblue.android.b.k.a);
    }

    public void createFreeFormCollage(a a1)
    {
        startActivityForResult(Collage.a(getActivity()), 123);
    }

    public void createGridsCollage(b b1)
    {
        b1 = Collage.a(getActivity());
        b1.putExtra("extra_grid_flow", true);
        startActivityForResult(b1, 123);
    }

    public void createTemplateCollage(c c1)
    {
        startActivityForResult(new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/RemixableListActivity), 123);
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        l;
        JVM INSTR tableswitch 123 123: default 20
    //                   123 28;
           goto _L1 _L2
_L1:
        super.onActivityResult(l, i1, intent);
_L4:
        return;
_L2:
        if (i1 == -1 && d != null)
        {
            j.a(new Callable() {

                final v a;

                public Void a()
                    throws Exception
                {
                    com.cardinalblue.android.piccollage.view.fragments.v.b(a);
                    return null;
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = v.this;
                super();
            }
            }, j.b);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onAddedBuildinCollage(com.cardinalblue.android.piccollage.events.b b1)
    {
        c();
    }

    public void onBadgeNumberChange(com.cardinalblue.android.piccollage.activities.AbsDrawerActivity.OnBadgeNumberChangeEvent onbadgenumberchangeevent)
    {
        a(onbadgenumberchangeevent.a);
    }

    public void onCollageClicked(h h1)
    {
        if (h1.b == null)
        {
            return;
        }
        switch (h1.a)
        {
        default:
            return;

        case 1: // '\001'
            a = true;
            com.cardinalblue.android.piccollage.a.b.e();
            com.cardinalblue.android.b.k.a(getActivity(), h1.b.p());
            startActivityForResult(h1.b.b(getActivity()), 123);
            return;

        case 2: // '\002'
            com.cardinalblue.android.piccollage.a.b.d();
            break;
        }
        c(h1.b);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f110010, menu);
        f = menu.findItem(0x7f1002ed);
        g = menu.findItem(0x7f1002e8);
        MenuItemCompat.getActionView(f).setOnClickListener(new android.view.View.OnClickListener() {

            final v a;

            public void onClick(View view)
            {
                a.getActivity().onOptionsItemSelected(v.c(a));
            }

            
            {
                a = v.this;
                super();
            }
        });
        a(com.cardinalblue.android.b.k.g());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300c0, viewgroup, false);
        b = (ImageView)layoutinflater.findViewById(0x7f1001ea);
        c = (HackyViewPager)layoutinflater.findViewById(0x7f1001eb);
        d = new p(getChildFragmentManager());
        int l = Collage.n();
        int i1 = getResources().getDimensionPixelSize(0x7f0b012a);
        int j1 = com.cardinalblue.android.b.k.t().x;
        c.setPageMargin(-(l - (i1 * 2 + j1)));
        c.setOffscreenPageLimit(2);
        c.setOnPageChangeListener(this);
        c.setAdapter(d);
        e = layoutinflater.findViewById(0x7f1000dd);
        e.setOnClickListener(new android.view.View.OnClickListener() {

            final v a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.bP();
                view = new CBluePopupMenu(a.getActivity(), view, 0x800055);
                view.setOnDismissListener(new android.support.v7.widget.CBluePopupMenu.OnDismissListener(this) {

                    final _cls1 a;

                    public void onDismiss(CBluePopupMenu cbluepopupmenu)
                    {
                        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.OnPopupMenuEvent(false));
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
                        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.OnPopupMenuEvent(false));
                        switch (menuitem.getItemId())
                        {
                        default:
                            return false;

                        case 2131755759: 
                            com.cardinalblue.android.piccollage.a.b.a("my collages : floating button");
                            com.cardinalblue.android.piccollage.a.b.bR();
                            com.cardinalblue.android.piccollage.a.b.aM("empty");
                            a.a.createFreeFormCollage(null);
                            return true;

                        case 2131755758: 
                            com.cardinalblue.android.piccollage.a.b.bQ();
                            a.a.createTemplateCollage(null);
                            return true;

                        case 2131755760: 
                            com.cardinalblue.android.piccollage.a.b.bS();
                            break;
                        }
                        com.cardinalblue.android.piccollage.a.b.aM("grid");
                        a.a.createGridsCollage(null);
                        return true;
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.OnPopupMenuEvent(true));
                view.show();
            }

            
            {
                a = v.this;
                super();
            }
        });
        setHasOptionsMenu(true);
        getActivity().setTitle(0x7f07020f);
        c();
        return layoutinflater;
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

    public void onPageScrollStateChanged(int l)
    {
        switch (l)
        {
        default:
            return;

        case 1: // '\001'
            com.cardinalblue.android.piccollage.controller.d.a().c(new i(c.getCurrentItem(), false));
            return;

        case 0: // '\0'
            com.cardinalblue.android.piccollage.controller.d.a().c(new i(c.getCurrentItem()));
            return;
        }
    }

    public void onPageScrolled(int l, float f1, int i1)
    {
    }

    public void onPageSelected(int l)
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new i(l));
        if (l == d.a())
        {
            b();
            return;
        } else
        {
            a();
            return;
        }
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
            if (f != null)
            {
                menu = f;
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
        if (com.cardinalblue.android.b.d.g() || ((com.cardinalblue.android.piccollage.lib.d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a().isGalleryBannerEnabled())
        {
            e();
        }
        d();
    }

    public void onStart()
    {
        super.onStart();
        a = false;
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
        if (a)
        {
            a = false;
        }
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
