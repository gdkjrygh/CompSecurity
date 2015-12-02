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
import android.widget.Button;
import com.facebook.reflex.Container;
import com.facebook.reflex.Widget;
import com.facebook.reflex.d;
import com.facebook.reflex.view.b.j;
import com.facebook.reflex.view.b.m;
import com.facebook.reflex.view.b.r;

// Referenced classes of package com.facebook.reflex.view:
//            b, c

public class a extends Button
    implements r
{

    private Container a;
    private m b;

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    private void a()
    {
        setWillNotDraw(false);
        a = new Container();
        b = new b(this, this);
        a.a(b);
        a.a(new c(this));
    }

    static boolean a(a a1, MotionEvent motionevent)
    {
        return a1.View.dispatchTouchEvent(motionevent);
    }

    protected void a(Canvas canvas)
    {
        super.draw(canvas);
    }

    public boolean d()
    {
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public void draw(Canvas canvas)
    {
        super.draw(j.a());
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
        return b;
    }

    public Widget getBackingWidget()
    {
        return a;
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
        ((com.facebook.reflex.j)getContext()).a(this);
    }

    public void invalidate(int i, int k, int l, int i1)
    {
        ((com.facebook.reflex.j)getContext()).a(this);
    }

    public void invalidate(Rect rect)
    {
        ((com.facebook.reflex.j)getContext()).a(this);
    }

    protected void onLayout(boolean flag, int i, int k, int l, int i1)
    {
        super.onLayout(flag, i, k, l, i1);
        a.a(l - i, i1 - k);
        b.a(l - i, i1 - k);
    }

    public void onWindowFocusChanged(boolean flag)
    {
    }
}
