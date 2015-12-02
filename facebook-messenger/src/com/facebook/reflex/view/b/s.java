// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.b;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.reflex.Widget;
import com.facebook.reflex.d;

// Referenced classes of package com.facebook.reflex.view.b:
//            r, p

public class s extends ViewGroup
    implements r
{

    private static final Class a = com/facebook/reflex/view/b/s;
    private final p b;
    private final View c;
    private final Widget d;
    private int e;
    private int f;

    private int a(int i)
    {
        if (i >= 0)
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
    }

    public void a()
    {
        measure(a(e), a(f));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean d()
    {
        return false;
    }

    public void draw(Canvas canvas)
    {
        e();
    }

    public void e()
    {
        ((r)c).e();
    }

    public View f()
    {
        return this;
    }

    public void forceLayout()
    {
        super.forceLayout();
        if (b != null)
        {
            b.a(this);
        }
    }

    public d getBackingContent()
    {
        return ((r)c).getBackingContent();
    }

    public Widget getBackingWidget()
    {
        return d;
    }

    public int getScrollOffsetX()
    {
        return getScrollX();
    }

    public int getScrollOffsetY()
    {
        return getScrollY();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        c.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    protected void onMeasure(int i, int j)
    {
        i = a(e);
        j = a(f);
        c.measure(i, j);
        setMeasuredDimension(c.getMeasuredWidth(), c.getMeasuredHeight());
    }

    public void onWindowFocusChanged(boolean flag)
    {
    }

    public void requestLayout()
    {
        super.requestLayout();
        if (b != null)
        {
            b.a(this);
        }
    }

}
