// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import com.facebook.reflex.Scroller;
import com.facebook.reflex.Widget;
import com.facebook.reflex.d;
import com.facebook.reflex.view.b.a;
import com.facebook.reflex.view.b.h;
import com.facebook.reflex.view.b.i;
import com.facebook.reflex.view.b.j;
import com.facebook.reflex.view.b.m;
import com.facebook.reflex.view.b.r;
import java.util.EnumSet;

// Referenced classes of package com.facebook.reflex.view:
//            q, r

public class p extends ScrollView
    implements h, i, r
{

    protected a a;
    private Scroller b;
    private m c;
    private float d;
    private Canvas e;

    public p(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = j.a();
        a();
        a.a(attributeset);
    }

    static float a(p p1, float f1)
    {
        p1.d = f1;
        return f1;
    }

    private void a()
    {
        a = new a(this, this);
        b = new Scroller();
        b.a(a.a());
        c = new q(this, this);
        b.a(c);
        b.a(new com.facebook.reflex.view.r(this));
        b.a(ViewConfiguration.get(getContext()).getScaledMaximumFlingVelocity());
    }

    static void a(p p1, Canvas canvas)
    {
        p1.b(canvas);
    }

    private void b(Canvas canvas)
    {
        if (getBackground() != null)
        {
            e = j.a();
            super.draw(canvas);
        }
    }

    public void a(Canvas canvas)
    {
        e = canvas;
        super.draw(j.a());
    }

    public boolean a(MotionEvent motionevent)
    {
        if (getChildCount() == 0)
        {
            return false;
        } else
        {
            motionevent.offsetLocation(-getChildAt(0).getLeft(), -getChildAt(0).getTop());
            return getChildAt(0).dispatchTouchEvent(motionevent);
        }
    }

    public ViewGroup b()
    {
        return this;
    }

    public r c()
    {
        return this;
    }

    public boolean d()
    {
        return true;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(e);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public void draw(Canvas canvas)
    {
        e = j.a();
        super.draw(j.a());
    }

    public void e()
    {
        a.f();
        c.f();
    }

    public View f()
    {
        return this;
    }

    public d getBackingContent()
    {
        return c;
    }

    public Widget getBackingWidget()
    {
        return b;
    }

    public int getScrollOffsetX()
    {
        return 0;
    }

    public int getScrollOffsetY()
    {
        return (int)d;
    }

    public void invalidate()
    {
        if (a != null)
        {
            a.e();
        }
    }

    public void invalidate(int k, int l, int i1, int j1)
    {
        if (a != null)
        {
            a.a(k, l, i1, j1);
        }
    }

    public void invalidate(Rect rect)
    {
        if (a != null)
        {
            a.a(rect);
        }
    }

    public ViewParent invalidateChildInParent(int ai[], Rect rect)
    {
        a.a(ai, rect);
        return null;
    }

    public boolean isHorizontalScrollBarEnabled()
    {
        return false;
    }

    public boolean isVerticalScrollBarEnabled()
    {
        return false;
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        super.onLayout(flag, k, l, i1, j1);
        b.a(i1 - k, j1 - l);
        c.a(i1 - k, j1 - l);
        if (getChildCount() > 0)
        {
            a.a(getChildAt(0).getRight() + getPaddingRight(), getChildAt(0).getBottom() + getPaddingBottom());
            b.a(0.0F, getChildAt(0).getBottom() + getPaddingBottom());
        }
        a.g();
    }

    public void scrollTo(int k, int l)
    {
        d = l;
    }

    public void setAndroidTouchMode(EnumSet enumset)
    {
        a.a(enumset);
    }

    public void setCompatibilityDrawEnabled(boolean flag)
    {
        a.b(flag);
    }

    public void setDispatchAndroidTouchEventsEnabled(boolean flag)
    {
        a.a(flag);
    }
}
