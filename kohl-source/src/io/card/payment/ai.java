// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;

class ai extends ViewGroup
{

    private static boolean d;
    private int a;
    private int b;
    private SurfaceView c;

    public ai(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, null);
        a = 480;
        b = 640;
        c = new SurfaceView(context);
        addView(c);
    }

    public final SurfaceView a()
    {
        if (!d && c == null)
        {
            throw new AssertionError();
        } else
        {
            return c;
        }
    }

    final SurfaceHolder b()
    {
        SurfaceHolder surfaceholder = a().getHolder();
        if (!d && surfaceholder == null)
        {
            throw new AssertionError();
        } else
        {
            return surfaceholder;
        }
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawARGB(255, 255, 0, 0);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
label0:
        {
            (new StringBuilder("- isSurfaceValid: ")).append(false).toString();
            if (flag && getChildCount() > 0)
            {
                if (!d && c == null)
                {
                    throw new AssertionError();
                }
                i = k - i;
                j = l - j;
                if (b * i <= a * j)
                {
                    break label0;
                }
                k = (a * j) / b;
                c.layout((i - k) / 2, 0, (i + k) / 2, j);
            }
            return;
        }
        k = (b * i) / a;
        c.layout(0, (j - k) / 2, i, (j + k) / 2);
    }

    protected void onMeasure(int i, int j)
    {
        int k = resolveSize(getSuggestedMinimumWidth(), i);
        int l = resolveSize(getSuggestedMinimumHeight(), j);
        String.format("Preview.onMeasure(w:%d, h:%d) setMeasuredDimension(w:%d, h:%d)", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l)
        });
        setMeasuredDimension(k, l);
    }

    static 
    {
        boolean flag;
        if (!io/card/payment/ai.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
