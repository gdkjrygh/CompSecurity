// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

public class MoviePlayerView extends View
{

    private long a;
    private Movie b;
    private float c;
    private long d;
    private int e;
    private boolean f;

    public MoviePlayerView(Context context)
    {
        super(context);
        a = 100L;
        setLayerType(1, null);
    }

    public MoviePlayerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 100L;
        setLayerType(1, null);
    }

    public MoviePlayerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 100L;
        setLayerType(1, null);
    }

    private void a()
    {
label0:
        {
            if (f && b != null)
            {
                if (a != -1L)
                {
                    break label0;
                }
                postInvalidate();
            }
            return;
        }
        postInvalidateDelayed(a);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (b != null)
        {
            long l = SystemClock.uptimeMillis();
            if (d == 0L)
            {
                d = l;
            }
            int i = (int)((l - d) % (long)e);
            b.setTime(i);
            canvas.save();
            canvas.scale(c, c);
            b.draw(canvas, 0.0F, 0.0F);
            canvas.restore();
            a();
        }
    }

    protected void onMeasure(int i, int j)
    {
        if (b != null)
        {
            j = b.width();
            int k = b.height();
            c = (float)android.view.View.MeasureSpec.getSize(i) / (float)j;
            setMeasuredDimension((int)((float)j * c), (int)((float)k * c));
            return;
        } else
        {
            setMeasuredDimension(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
            return;
        }
    }

    public void onScreenStateChanged(int i)
    {
        boolean flag = true;
        super.onScreenStateChanged(i);
        if (i != 1)
        {
            flag = false;
        }
        f = flag;
        a();
    }

    protected void onVisibilityChanged(View view, int i)
    {
        super.onVisibilityChanged(view, i);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        a();
    }

    protected void onWindowVisibilityChanged(int i)
    {
        super.onWindowVisibilityChanged(i);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        a();
    }

    public void setMovie(Movie movie)
    {
        b = movie;
        e = b.duration();
        if (e == 0)
        {
            e = 100;
        }
        requestLayout();
    }

    public void setRefreshRate(long l)
    {
        a = l;
    }
}
