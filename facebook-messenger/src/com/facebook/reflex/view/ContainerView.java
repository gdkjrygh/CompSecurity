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
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.reflex.Widget;
import com.facebook.reflex.d;
import com.facebook.reflex.view.b.a;
import com.facebook.reflex.view.b.h;
import com.facebook.reflex.view.b.i;
import com.facebook.reflex.view.b.r;
import java.util.EnumSet;

public class ContainerView extends ViewGroup
    implements h, i, r
{

    protected final a b;

    public ContainerView(Context context)
    {
        this(context, (AttributeSet)null);
    }

    public ContainerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ContainerView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        b = new a(this, this);
        b.a(attributeset);
    }

    public void a(Canvas canvas)
    {
        super.draw(canvas);
    }

    public boolean a(MotionEvent motionevent)
    {
        return super.dispatchTouchEvent(motionevent);
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
        return b.h();
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return b.a(motionevent);
    }

    public void draw(Canvas canvas)
    {
        b.a(canvas);
    }

    public void e()
    {
        b.f();
    }

    public View f()
    {
        return this;
    }

    public d getBackingContent()
    {
        return b.b();
    }

    public Widget getBackingWidget()
    {
        return b.a();
    }

    public int getScrollOffsetX()
    {
        return getScrollX();
    }

    public int getScrollOffsetY()
    {
        return getScrollY();
    }

    public void invalidate()
    {
        if (b != null && !b.e())
        {
            super.invalidate();
        }
    }

    public void invalidate(int j, int k, int l, int i1)
    {
        if (b != null && !b.a(j, k, l, i1))
        {
            super.invalidate(j, k, l, i1);
        }
    }

    public void invalidate(Rect rect)
    {
        if (b != null && !b.a(rect))
        {
            super.invalidate(rect);
        }
    }

    public ViewParent invalidateChildInParent(int ai[], Rect rect)
    {
        if (b.a(ai, rect))
        {
            return null;
        } else
        {
            return super.invalidateChildInParent(ai, rect);
        }
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        int k2 = getChildCount();
        int i2 = getPaddingLeft();
        int j2 = getPaddingTop();
        int j1 = 0;
        while (j1 < k2) 
        {
            View view = getChildAt(j1);
            if (view.getVisibility() == 8)
            {
                continue;
            }
            int l2 = view.getMeasuredWidth();
            int i3 = view.getMeasuredHeight();
            Object obj = view.getLayoutParams();
            int k1;
            int l1;
            if (obj instanceof android.view.ViewGroup.MarginLayoutParams)
            {
                obj = (android.view.ViewGroup.MarginLayoutParams)obj;
                l1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin + i2;
                k1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin + j2;
            } else
            {
                k1 = j2;
                l1 = i2;
            }
            view.layout(l1, k1, l2 + l1, i3 + k1);
            j1++;
        }
        b.g();
        b.a(l - j, i1 - k);
    }

    protected void onMeasure(int j, int k)
    {
        int j2 = getChildCount();
        int j1 = 0;
        int i1 = 0;
        int l = 0;
        while (j1 < j2) 
        {
            View view = getChildAt(j1);
            int l1;
            if (view.getVisibility() != 8)
            {
                if (view.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)
                {
                    android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
                    measureChildWithMargins(view, j, 0, k, 0);
                    int k1 = Math.max(i1, view.getMeasuredWidth() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin);
                    i1 = Math.max(l, view.getMeasuredHeight() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin);
                    l = k1;
                } else
                {
                    measureChild(view, j, k);
                    i1 = Math.max(i1, view.getMeasuredWidth());
                    l1 = Math.max(l, view.getMeasuredHeight());
                    l = i1;
                    i1 = l1;
                }
            } else
            {
                int i2 = l;
                l = i1;
                i1 = i2;
            }
            l1 = j1 + 1;
            j1 = i1;
            i1 = l;
            l = j1;
            j1 = l1;
        }
        j1 = getPaddingLeft();
        l1 = getPaddingRight();
        l = Math.max(getPaddingTop() + getPaddingBottom() + l, getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(Math.max(j1 + l1 + i1, getSuggestedMinimumWidth()), j), resolveSize(l, k));
    }

    public void onWindowFocusChanged(boolean flag)
    {
    }

    public void setAndroidTouchMode(EnumSet enumset)
    {
        b.a(enumset);
    }

    public void setCompatibilityDrawEnabled(boolean flag)
    {
        b.b(flag);
    }

    public void setDispatchAndroidTouchEventsEnabled(boolean flag)
    {
        b.a(flag);
    }
}
