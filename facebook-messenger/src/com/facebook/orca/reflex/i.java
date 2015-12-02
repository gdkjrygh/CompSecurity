// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.orca.common.ui.overlay.SwipableOverlayLayout;
import com.facebook.reflex.Widget;
import com.facebook.reflex.d;
import com.facebook.reflex.view.b.a;
import com.facebook.reflex.view.b.h;
import com.facebook.reflex.view.b.r;
import java.util.EnumSet;

public class i extends SwipableOverlayLayout
    implements h, com.facebook.reflex.view.b.i, r
{

    protected final a a;

    public i(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public i(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = new a(this, this);
        a.a(attributeset);
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
        return a.h();
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return a.a(motionevent);
    }

    public void draw(Canvas canvas)
    {
        a.a(canvas);
    }

    public void e()
    {
        a.f();
    }

    public View f()
    {
        return this;
    }

    public d getBackingContent()
    {
        return a.b();
    }

    public Widget getBackingWidget()
    {
        return a.a();
    }

    public int getScrollOffsetX()
    {
        return 0;
    }

    public int getScrollOffsetY()
    {
        return 0;
    }

    public void invalidate()
    {
        if (a != null && !a.e())
        {
            super.invalidate();
        }
    }

    public void invalidate(int j, int k, int l, int i1)
    {
        if (a != null && !a.a(j, k, l, i1))
        {
            super.invalidate(j, k, l, i1);
        }
    }

    public void invalidate(Rect rect)
    {
        if (a != null && !a.a(rect))
        {
            super.invalidate(rect);
        }
    }

    public ViewParent invalidateChildInParent(int ai[], Rect rect)
    {
        if (a.a(ai, rect))
        {
            return null;
        } else
        {
            return super.invalidateChildInParent(ai, rect);
        }
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        a.g();
        a.a(l - j, i1 - k);
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
