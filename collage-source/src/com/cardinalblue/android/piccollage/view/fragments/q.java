// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.res.Resources;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.FeedAccessorFactory;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.view.a.d;
import com.cardinalblue.android.piccollage.view.j;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            i

public class q extends i
{

    d a;
    private View l;
    private Button m;
    private boolean n;
    private float o;
    private GestureDetector p;
    private android.view.GestureDetector.SimpleOnGestureListener q;
    private boolean r;
    private Animation s;
    private Animation t;
    private android.view.animation.Animation.AnimationListener u;

    public q()
    {
        n = false;
        o = 0.0F;
        q = new android.view.GestureDetector.SimpleOnGestureListener() {

            final q a;

            public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
            {
                if (f2 <= 100F) goto _L2; else goto _L1
_L1:
                if (!q.a(a) && com.cardinalblue.android.piccollage.view.fragments.q.b(a).getVisibility() == 8)
                {
                    com.cardinalblue.android.piccollage.view.fragments.q.b(a).startAnimation(q.c(a));
                }
_L4:
                return super.onFling(motionevent, motionevent1, f1, f2);
_L2:
                if (f2 < -100F && !q.a(a) && com.cardinalblue.android.piccollage.view.fragments.q.b(a).getVisibility() == 0)
                {
                    com.cardinalblue.android.piccollage.view.fragments.q.b(a).startAnimation(com.cardinalblue.android.piccollage.view.fragments.q.d(a));
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
            {
                View view;
                view = a.k.getChildAt(0);
                if (view == null)
                {
                    return false;
                }
                if (f2 <= 0.0F) goto _L2; else goto _L1
_L1:
                if (com.cardinalblue.android.piccollage.view.fragments.q.b(a).getVisibility() == 0)
                {
                    q.e(a);
                }
                if (q.f(a) >= 3F && (double)view.getTop() < (double)a.k.getPaddingTop() * 0.10000000000000001D && !q.a(a) && com.cardinalblue.android.piccollage.view.fragments.q.b(a).getVisibility() == 0)
                {
                    com.cardinalblue.android.piccollage.view.fragments.q.b(a).startAnimation(com.cardinalblue.android.piccollage.view.fragments.q.d(a));
                }
_L4:
                return super.onScroll(motionevent, motionevent1, f1, f2);
_L2:
                if (com.cardinalblue.android.piccollage.view.fragments.q.b(a).getVisibility() == 8)
                {
                    q.g(a);
                }
                if (q.f(a) <= -3F && !q.a(a) && com.cardinalblue.android.piccollage.view.fragments.q.b(a).getVisibility() == 8)
                {
                    com.cardinalblue.android.piccollage.view.fragments.q.b(a).startAnimation(q.c(a));
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = q.this;
                super();
            }
        };
        r = false;
        u = new android.view.animation.Animation.AnimationListener() {

            final q a;

            public void onAnimationEnd(Animation animation)
            {
                if (animation == com.cardinalblue.android.piccollage.view.fragments.q.d(a))
                {
                    com.cardinalblue.android.piccollage.view.fragments.q.b(a).setVisibility(8);
                }
                q.a(a, false);
                q.a(a, 0.0F);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                q.a(a, true);
                if (animation == q.c(a))
                {
                    com.cardinalblue.android.piccollage.view.fragments.q.b(a).setVisibility(0);
                }
            }

            
            {
                a = q.this;
                super();
            }
        };
    }

    static float a(q q1, float f1)
    {
        q1.o = f1;
        return f1;
    }

    static boolean a(q q1)
    {
        return q1.r;
    }

    static boolean a(q q1, boolean flag)
    {
        q1.r = flag;
        return flag;
    }

    static View b(q q1)
    {
        return q1.l;
    }

    static Animation c(q q1)
    {
        return q1.t;
    }

    static Animation d(q q1)
    {
        return q1.s;
    }

    static float e(q q1)
    {
        float f1 = q1.o;
        q1.o = 1.0F + f1;
        return f1;
    }

    static float f(q q1)
    {
        return q1.o;
    }

    static float g(q q1)
    {
        float f1 = q1.o;
        q1.o = f1 - 1.0F;
        return f1;
    }

    static GestureDetector h(q q1)
    {
        return q1.p;
    }

    protected View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        l = layoutinflater.findViewById(0x7f100214);
        k = (SuperRecyclerView)layoutinflater.findViewById(0x7f1001d6);
        s = AnimationUtils.loadAnimation(getActivity(), 0x7f040034);
        t = AnimationUtils.loadAnimation(getActivity(), 0x7f040030);
        s.setAnimationListener(u);
        t.setAnimationListener(u);
        p = new GestureDetector(getActivity(), q);
        k.setOnTouchListener(new android.view.View.OnTouchListener() {

            final q a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                return q.h(a).onTouchEvent(motionevent);
            }

            
            {
                a = q.this;
                super();
            }
        });
        viewgroup = new GridLayoutManager(getActivity(), getResources().getInteger(0x7f09001d));
        k.a(new j(getResources().getDimensionPixelSize(0x7f0b0062)));
        k.setLayoutManager(viewgroup);
        int i1 = getResources().getDimensionPixelSize(0x7f0b0121);
        int j1 = getResources().getDimensionPixelSize(0x7f0b0122);
        k.getSwipeToRefresh().setProgressViewOffset(false, i1, j1);
        m = (Button)l.findViewById(0x7f100215);
        m.setOnClickListener(new android.view.View.OnClickListener() {

            final q a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.b(0x7f1002e3));
            }

            
            {
                a = q.this;
                super();
            }
        });
        setHasOptionsMenu(true);
        return layoutinflater;
    }

    protected d a(CBCollagesResponse cbcollagesresponse)
    {
        return new d(getActivity(), cbcollagesresponse, 0x7f03008e, 2);
    }

    protected boolean a(Exception exception)
    {
        if (exception instanceof com.cardinalblue.android.piccollage.auth.PicAuth.a)
        {
            if (a != null)
            {
                a.f();
                a.notifyDataSetChanged();
                d();
            }
            if (((com.cardinalblue.android.piccollage.auth.PicAuth.a)exception).a() == 1)
            {
                PicAuth.h().a();
                if (c != null)
                {
                    c.a(5, "home");
                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    public com.cardinalblue.android.piccollage.amazon.HomeHeroWidgetManager.UpdateHeroWidgetEvent b(CBCollagesResponse cbcollagesresponse)
    {
        if (PicAuth.h().b())
        {
            return new com.cardinalblue.android.piccollage.amazon.HomeHeroWidgetManager.UpdateHeroWidgetEvent(getString(0x7f0701b6), getString(0x7f07021c), cbcollagesresponse.getPhotos());
        } else
        {
            return null;
        }
    }

    public void b(boolean flag)
    {
        n = flag;
    }

    protected com.cardinalblue.android.piccollage.controller.FeedAccessorFactory.FeedAccessor e()
    {
        return FeedAccessorFactory.a(3, null);
    }

    protected void f()
    {
        h.setImageResource(0x7f020226);
        if (!PicAuth.h().b())
        {
            i.setText(0x7f0701db);
            j.setText(0x7f070278);
            return;
        } else
        {
            i.setText(0x7f0700f8);
            j.setText(0x7f070249);
            return;
        }
    }

    protected void g()
    {
        if (!PicAuth.h().b())
        {
            c.a(5, "home");
            return;
        } else
        {
            a(false);
            return;
        }
    }

    protected void h()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.activities.HomeActivity.b(0x7f1002e3));
    }

    protected int i()
    {
        return 0x7f0300a7;
    }

    protected String j()
    {
        return "following";
    }

    public void k()
    {
        k.getSwipeToRefresh().setRefreshing(true);
        b();
    }

    public void onRefresh()
    {
        if (PicAuth.h().b())
        {
            b();
            return;
        } else
        {
            d();
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        if (PicAuth.h().b())
        {
            if (n)
            {
                k();
                n = false;
            } else
            {
                a(true);
            }
        } else
        {
            d();
        }
        if (l != null)
        {
            l.startAnimation(t);
        }
    }

    public void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.controller.d.b(this);
    }

    public void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.controller.d.a(this);
    }
}
