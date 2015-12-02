// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

public class h extends View
{

    private Drawable a;
    private float b;
    private float c;
    private Rect d;
    private Rect e;
    private Rect f;

    public h(Context context)
    {
        super(context);
        d = new Rect();
        e = new Rect();
        f = new Rect();
    }

    public void a(float f1, float f2)
    {
        int i = Math.min((int)Math.max(f2, 0.0F), getMeasuredHeight() - a.getBounds().height());
        int j = (int)f1;
        int k = getDrawableWidth();
        int l = getDrawableHeight();
        e.set(j, i, k + j, l + i);
        f.setEmpty();
        f.union(d);
        f.union(e);
        invalidate(f);
        d.set(e);
        b = f1;
        c = i;
    }

    public int getDrawableHeight()
    {
        if (a != null)
        {
            return a.getIntrinsicHeight();
        } else
        {
            return 0;
        }
    }

    public int getDrawableWidth()
    {
        if (a != null)
        {
            return a.getIntrinsicWidth();
        } else
        {
            return 0;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(b, c);
        a.draw(canvas);
        canvas.restore();
    }

    public void setDrawable(Drawable drawable)
    {
        a = drawable;
        if (a != null)
        {
            a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
        }
    }
}
