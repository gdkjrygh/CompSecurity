// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster.draglist;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class DragLayer extends View
{

    Paint a;
    private float b;
    private float c;
    private Bitmap d;
    private float e;
    private float f;
    private Rect g;
    private Rect h;

    public DragLayer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Paint();
        g = new Rect();
        h = new Rect();
    }

    private void d(float f1, float f2)
    {
        float f3 = f1;
        if (f1 < 0.0F)
        {
            f3 = 0.0F;
        }
        f1 = f2;
        if (f2 < 0.0F)
        {
            f1 = 0.0F;
        }
        if (d == null)
        {
            return;
        }
        int i = d.getWidth();
        int j = d.getHeight();
        i = getMeasuredWidth() - i;
        int k = Math.round(f1);
        int l = Math.round(f3);
        int i1 = d.getWidth();
        int j1 = d.getHeight();
        if (l <= i)
        {
            i = l;
        }
        j = getMeasuredHeight() - j;
        if (k <= j)
        {
            j = k;
        }
        g.set(i, j, i1 + l, j1 + k);
    }

    public void a(float f1, float f2)
    {
        b = f1;
        c = f2;
        if (d != null)
        {
            d(f1, f2);
            invalidate(g);
        }
    }

    public void b(float f1, float f2)
    {
        b = f1 - e;
        c = f2 - f;
        h.set(g);
        d(b, c);
        h.union(g);
        invalidate(h);
    }

    public void c(float f1, float f2)
    {
        e = f1;
        f = f2;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (d == null || d.isRecycled())
        {
            return;
        } else
        {
            canvas.drawBitmap(d, g.left, g.top, a);
            return;
        }
    }

    public void setDragBitmap(Bitmap bitmap)
    {
        d = bitmap;
        if (d == null)
        {
            invalidate(g);
        }
    }
}
