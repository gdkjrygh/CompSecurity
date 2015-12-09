// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget.carousel;

import abd;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import dhh;
import dhi;
import dhq;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CarouselView extends RecyclerView
{

    private List t;
    private dhq u;
    private boolean v;
    private final dhi w;

    public CarouselView(Context context)
    {
        super(context);
        t = new LinkedList();
        w = new dhi((byte)0);
        v();
    }

    public CarouselView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        t = new LinkedList();
        w = new dhi((byte)0);
        v();
    }

    private void e(int i)
    {
        for (Iterator iterator = t.iterator(); iterator.hasNext(); ((dhh)iterator.next()).a(i)) { }
    }

    private void v()
    {
        super.g = true;
        try
        {
            Field field = android/support/v7/widget/RecyclerView.getDeclaredField("p");
            field.setAccessible(true);
            field.set(this, Integer.valueOf(ViewConfiguration.get(getContext()).getScaledPagingTouchSlop()));
            Log.e("CarouselView", "Changed carousel touch slop to paging touch slop.");
            return;
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            Log.e("CarouselView", "Failed updating touch slop", nosuchfieldexception);
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            Log.e("CarouselView", "Failed updating touch slop", illegalaccessexception);
        }
    }

    public final void a(abd abd)
    {
        if (!(abd instanceof dhq))
        {
            throw new UnsupportedOperationException("You must provide a SnappingLayoutManager to CarouselRecyclerView.");
        } else
        {
            u = (dhq)abd;
            super.a(abd);
            return;
        }
    }

    public final void a(dhh dhh1)
    {
        t.add(dhh1);
    }

    public final boolean a(int i, int j)
    {
        dhq dhq1 = (dhq)super.f;
        i = dhq1.a(i, j);
        boolean flag = dhq1.a(i);
        super.b(i);
        if (w.b != 0)
        {
            e(i);
        }
        return flag;
    }

    public final void b(int i, int j)
    {
        Iterator iterator;
        if ((i == 0 || j != 0) && i == 0 && j != 0)
        {
            dhi dhi1 = w;
            dhi1.b = dhi1.b + j;
        } else
        {
            dhi dhi2 = w;
            dhi2.b = dhi2.b + i;
        }
        Math.abs((float)w.b / (float)w.a);
        if (w.b > 0)
        {
            i = w.d + 1;
        } else
        if (w.b < 0)
        {
            i = w.d - 1;
        } else
        {
            i = w.d;
        }
        for (iterator = t.iterator(); iterator.hasNext(); ((dhh)iterator.next()).a(w.d, i)) { }
    }

    public final void b(boolean flag)
    {
        v = flag;
    }

    public final void d(int i)
    {
        Object obj = (dhq)super.f;
        if (w.c == 0 && i != w.c)
        {
            android.view.View view = getChildAt(0);
            if (view != null)
            {
                w.a = ((dhq) (obj)).e(view);
            } else
            {
                w.a = getMeasuredWidth();
            }
            w.d = ((dhq) (obj)).h();
            w.b = 0;
        }
        w.c = i;
        if (i == 0)
        {
            i = ((dhq) (obj)).h();
            for (obj = t.iterator(); ((Iterator) (obj)).hasNext(); ((dhh)((Iterator) (obj)).next()).b(i)) { }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return !v && super.onInterceptTouchEvent(motionevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (v)
        {
            return true;
        }
        dhq dhq1 = (dhq)super.f;
        motionevent.getAction();
        boolean flag = super.onTouchEvent(motionevent);
        if ((motionevent.getAction() == 1 || motionevent.getAction() == 3) && super.o == 0)
        {
            int i = dhq1.c();
            b(i);
            e(i);
        }
        return flag;
    }

    public final int u()
    {
        if (u == null)
        {
            throw new IllegalStateException("Cannot get the current position without a LayoutManager.");
        } else
        {
            return u.h();
        }
    }
}
