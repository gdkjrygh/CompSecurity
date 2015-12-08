// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class b extends FrameLayout
{

    private Drawable a;
    private Rect b;
    private Rect c;

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int i = getWidth();
        int j = getHeight();
        if (b != null && a != null)
        {
            int k = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            c.set(0, 0, i, b.top);
            a.setBounds(c);
            a.draw(canvas);
            c.set(0, j - b.bottom, i, j);
            a.setBounds(c);
            a.draw(canvas);
            c.set(0, b.top, b.left, j - b.bottom);
            a.setBounds(c);
            a.draw(canvas);
            c.set(i - b.right, b.top, i, j - b.bottom);
            a.setBounds(c);
            a.draw(canvas);
            canvas.restoreToCount(k);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            a.setCallback(this);
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            a.setCallback(null);
        }
    }
}
