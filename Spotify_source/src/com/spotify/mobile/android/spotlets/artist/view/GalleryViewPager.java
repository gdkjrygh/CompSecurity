// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.spotify.mobile.android.util.TouchLifecycle;
import ejm;
import ggd;

public class GalleryViewPager extends ViewPager
{

    private TouchLifecycle e;
    private float f;
    private final ggd g;

    public GalleryViewPager(Context context)
    {
        super(context);
        g = new ggd() {

            private GalleryViewPager a;

            public final void a()
            {
                a.requestDisallowInterceptTouchEvent(true);
            }

            public final boolean a(float f1)
            {
                return f1 > GalleryViewPager.a(a);
            }

            public final boolean a(MotionEvent motionevent)
            {
                return GalleryViewPager.a(a, motionevent);
            }

            public final void b()
            {
                a.requestDisallowInterceptTouchEvent(false);
            }

            public final boolean b(float f1)
            {
                return f1 > GalleryViewPager.a(a);
            }

            public final boolean b(MotionEvent motionevent)
            {
                GalleryViewPager.f();
                return GalleryViewPager.b(a, motionevent);
            }

            public final void c()
            {
                GalleryViewPager.f();
            }

            public final void d()
            {
                GalleryViewPager.f();
                a.requestDisallowInterceptTouchEvent(false);
            }

            
            {
                a = GalleryViewPager.this;
                super();
            }
        };
        g();
    }

    public GalleryViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = new _cls1();
        g();
    }

    static float a(GalleryViewPager galleryviewpager)
    {
        return galleryviewpager.f;
    }

    static boolean a(GalleryViewPager galleryviewpager, MotionEvent motionevent)
    {
        return galleryviewpager.ViewPager.onTouchEvent(motionevent);
    }

    static boolean b(GalleryViewPager galleryviewpager, MotionEvent motionevent)
    {
        return galleryviewpager.ViewPager.onTouchEvent(motionevent);
    }

    static ejm f()
    {
        return null;
    }

    private void g()
    {
        f = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        e = new TouchLifecycle(g);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        TouchLifecycle touchlifecycle;
        boolean flag;
        flag = false;
        touchlifecycle = e;
        touchlifecycle.e = motionevent;
        if (motionevent.getActionMasked() != 0) goto _L2; else goto _L1
_L1:
        touchlifecycle.f = false;
        touchlifecycle.c = motionevent.getX();
        touchlifecycle.d = motionevent.getY();
        touchlifecycle.b = com.spotify.mobile.android.util.TouchLifecycle.State.a;
        touchlifecycle.b.a(touchlifecycle);
        flag = touchlifecycle.b.d(touchlifecycle);
_L9:
        return flag;
_L2:
        if (motionevent.getActionMasked() != 2) goto _L4; else goto _L3
_L3:
        float f1;
        float f2;
        if (motionevent.getPointerCount() > 1)
        {
            touchlifecycle.f = true;
        }
        f1 = Math.abs(touchlifecycle.c - motionevent.getX());
        f2 = Math.abs(touchlifecycle.d - motionevent.getY());
        if (!touchlifecycle.a.a(f1) && !touchlifecycle.f) goto _L6; else goto _L5
_L5:
        touchlifecycle.b.b(touchlifecycle);
_L7:
        return touchlifecycle.b.d(touchlifecycle);
_L6:
        if (touchlifecycle.a.b(f2))
        {
            touchlifecycle.b.c(touchlifecycle);
        }
        if (true) goto _L7; else goto _L4
_L4:
        if (motionevent.getActionMasked() == 6 || motionevent.getActionMasked() == 5)
        {
            return touchlifecycle.b.d(touchlifecycle);
        }
        if (motionevent.getActionMasked() == 1 || motionevent.getActionMasked() == 3)
        {
            return touchlifecycle.b.d(touchlifecycle);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }
}
