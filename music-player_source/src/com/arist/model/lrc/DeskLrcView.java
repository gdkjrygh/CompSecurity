// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;

// Referenced classes of package com.arist.model.lrc:
//            LrcView, a, d

public class DeskLrcView extends LrcView
{

    private Drawable o;
    private a p;

    public DeskLrcView(Context context)
    {
        super(context);
        d();
    }

    public DeskLrcView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d();
    }

    public DeskLrcView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d();
    }

    private void d()
    {
        p = new a(this);
        o = getResources().getDrawable(0x7f02003b);
    }

    public final int a()
    {
        return d;
    }

    public final void a(d d1)
    {
        p.a(d1);
    }

    protected void onDraw(Canvas canvas)
    {
        if (p.a)
        {
            canvas.drawColor(0x66666666);
            o.draw(canvas);
        }
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, j));
        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(d, 0x40000000));
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        o.setBounds(i - o.getIntrinsicWidth() - getPaddingRight(), getPaddingTop(), i - getPaddingRight(), getPaddingTop() + o.getIntrinsicHeight());
        p.a(o.getBounds());
        super.onSizeChanged(i, j, k, l);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return p.a(motionevent);
    }
}
