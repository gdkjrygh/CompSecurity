// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.wave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class RoundLayout extends LinearLayout
{

    protected int a;
    private final Rect b;
    private Paint c;
    private GradientDrawable d;
    private int e;
    private Path f;

    public RoundLayout(Context context)
    {
        super(context);
        b = new Rect();
        e = 0;
        a();
    }

    public RoundLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Rect();
        e = 0;
        a();
    }

    public RoundLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new Rect();
        e = 0;
        a();
    }

    private void a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setLayerType(1, null);
        }
        c = new Paint();
        c.setAntiAlias(true);
        d = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
            0x66ffffff, 0x33ffffff
        });
        d.setShape(1);
        d.setGradientType(0);
    }

    public void draw(Canvas canvas)
    {
        d.setBounds(b);
        d.draw(canvas);
        if (f != null)
        {
            canvas.clipPath(f, android.graphics.Region.Op.REPLACE);
        }
        canvas.drawColor(a);
        super.draw(canvas);
    }

    public int getCoverColor()
    {
        return a;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (getMeasuredWidth() != 0)
        {
            if (e <= 0)
            {
                e = getMeasuredWidth() / 2;
            }
            f = new Path();
            f.addCircle(e, e, e, android.graphics.Path.Direction.CCW);
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        b.right = i;
        b.bottom = j;
        e = 0;
    }

    public void setCoverColor(int i)
    {
        a = i;
    }
}
