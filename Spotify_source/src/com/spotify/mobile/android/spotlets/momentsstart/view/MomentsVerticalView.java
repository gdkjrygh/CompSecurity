// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;

import abd;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import dhq;
import eui;
import evi;
import evj;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart.view:
//            MomentVerticalLayoutManager

public class MomentsVerticalView extends RecyclerView
{

    public eui t;
    public boolean u;
    public evj v;
    private dhq w;
    private GestureDetector x;
    private final evi y;

    public MomentsVerticalView(Context context)
    {
        super(context);
        y = new evi((byte)0);
        v();
    }

    public MomentsVerticalView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        y = new evi((byte)0);
        v();
    }

    private void v()
    {
        a(new MomentVerticalLayoutManager());
        b();
        x = new GestureDetector(getContext(), new android.view.GestureDetector.SimpleOnGestureListener() {

            public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                return Math.abs(f) < Math.abs(f1);
            }

        });
    }

    public final void a(int i)
    {
        super.a(i);
        if (v != null)
        {
            y.b = i;
            v.a(i);
        }
    }

    public final void a(abd abd)
    {
        w = (dhq)abd;
        super.a(abd);
    }

    public final boolean a(int i, int j)
    {
        i = w.a(i, j);
        boolean flag = w.a(i);
        b(i);
        return flag;
    }

    public final void b(int i, int j)
    {
        evi evi1 = y;
        evi1.a = evi1.a + j;
        float f = (float)y.a / (float)getHeight();
        i = y.b;
        j = Math.round(f);
        if (v != null)
        {
            v.a(Math.max(0, j + i), y.a);
        }
    }

    public final void d(int i)
    {
        if (i == 0)
        {
            y.b = w.h();
            y.a = 0;
        }
        if (i == 0 && v != null)
        {
            v.b(i);
        }
    }

    public final void d(int i, int j)
    {
        t.c[i] = j;
    }

    public final int e(int i)
    {
        return t.c[i];
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        t.d = null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (f() != 2)
        {
            boolean flag;
            if (!u && super.onInterceptTouchEvent(motionevent))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!x.onTouchEvent(motionevent) || !flag)
            {
                return false;
            }
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (f() == 2 || u)
        {
            return true;
        }
        dhq dhq1 = (dhq)d();
        boolean flag = super.onTouchEvent(motionevent);
        if (f() == 0 && (motionevent.getAction() == 1 || motionevent.getAction() == 3))
        {
            b(dhq1.c());
        }
        return flag;
    }

    public final int u()
    {
        return w.h();
    }
}
