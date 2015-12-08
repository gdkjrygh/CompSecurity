// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.pager.viewpager;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Scroller;
import fpj;
import gsf;
import gsg;
import java.lang.reflect.Method;
import lt;
import mg;
import nm;
import nq;
import olm;

public class PhotoViewPager extends ViewPager
{

    public gsg u;
    public int v;
    public Scroller w;
    public final Runnable x;
    private int y;

    public PhotoViewPager(Context context)
    {
        super(context);
        x = new gsf(this);
        j();
    }

    public PhotoViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        x = new gsf(this);
        j();
    }

    public static int a(PhotoViewPager photoviewpager, int k)
    {
        photoviewpager.v = k;
        return k;
    }

    public static Scroller a(PhotoViewPager photoviewpager)
    {
        return photoviewpager.w;
    }

    public static int b(PhotoViewPager photoviewpager)
    {
        return photoviewpager.v;
    }

    public static Runnable c(PhotoViewPager photoviewpager)
    {
        return photoviewpager.x;
    }

    private void j()
    {
        boolean flag1 = true;
        nq nq1 = new nq();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            boolean flag;
            if (super.r != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            super.r = nq1;
            if (android.os.Build.VERSION.SDK_INT >= 7)
            {
                if (super.s == null)
                {
                    try
                    {
                        super.s = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                            Boolean.TYPE
                        });
                    }
                    catch (NoSuchMethodException nosuchmethodexception)
                    {
                        Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", nosuchmethodexception);
                    }
                }
                try
                {
                    super.s.invoke(this, new Object[] {
                        Boolean.valueOf(true)
                    });
                }
                catch (Exception exception)
                {
                    Log.e("ViewPager", "Error changing children drawing order", exception);
                }
            }
            super.t = 2;
            if (flag)
            {
                d();
            }
        }
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        if (android.os.Build.VERSION.SDK_INT != 19)
        {
            return true;
        } else
        {
            ((fpj)olm.a(getContext(), fpj)).b(rect);
            return true;
        }
    }

    public final void i()
    {
        f();
        if (!super.n)
        {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else
        {
            Object obj = super.l;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, super.m);
            int k = (int)mg.a(((VelocityTracker) (obj)), super.k);
            super.g = true;
            int l = super.a();
            int i1 = getScrollX();
            obj = super.e();
            a(super.a(((nm) (obj)).b, ((float)i1 / (float)l - ((nm) (obj)).e) / ((nm) (obj)).d, k, (int)(super.i - super.j)), true, true, k);
            super.g();
            super.n = false;
            removeCallbacks(x);
            v = 0;
            return;
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowinsets)
    {
        ((fpj)olm.a(getContext(), fpj)).a(windowinsets);
        return windowinsets.consumeSystemWindowInsets();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        int l;
        if (u != null && u.r())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = motionevent.getAction() & 0xff;
        if (l == 3 || l == 1)
        {
            y = -1;
        }
        l;
        JVM INSTR lookupswitch 3: default 88
    //                   0: 113
    //                   2: 99
    //                   6: 125;
           goto _L1 _L2 _L3 _L4
_L1:
        return super.onInterceptTouchEvent(motionevent);
_L3:
        if (flag && y != -1)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        y = lt.b(motionevent, 0);
        continue; /* Loop/switch isn't completed */
_L4:
        int k = lt.b(motionevent);
        if (lt.b(motionevent, k) == y)
        {
            if (k == 0)
            {
                k = ((flag1) ? 1 : 0);
            } else
            {
                k = 0;
            }
            y = lt.b(motionevent, k);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
