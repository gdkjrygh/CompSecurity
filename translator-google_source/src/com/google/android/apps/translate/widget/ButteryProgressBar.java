// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.translate.j;
import com.google.android.apps.translate.t;

// Referenced classes of package com.google.android.apps.translate.widget:
//            b, a

public class ButteryProgressBar extends View
{

    private final GradientDrawable a;
    private final ValueAnimator b;
    private final Paint c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private int h;

    public ButteryProgressBar(Context context)
    {
        this(context, null);
    }

    public ButteryProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new Paint();
        g = context.getResources().getDisplayMetrics().density;
        attributeset = context.obtainStyledAttributes(attributeset, t.ButteryProgressBar);
        d = attributeset.getColor(t.ButteryProgressBar_barColor, context.getResources().getColor(j.selected_text));
        e = attributeset.getDimensionPixelSize(t.ButteryProgressBar_barHeight, Math.round(4F * g));
        f = attributeset.getDimensionPixelSize(t.ButteryProgressBar_detentWidth, Math.round(3F * g));
        attributeset.recycle();
        b = new ValueAnimator();
        b.setFloatValues(new float[] {
            1.0F, 2.0F
        });
        b.setRepeatCount(-1);
        b.setInterpolator(new b());
        b.addUpdateListener(new a(this));
        c.setColor(d);
        a = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
            d & 0xffffff | 0x22000000, 0
        });
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    protected void onDraw(Canvas canvas)
    {
        if (b.isStarted())
        {
            a.draw(canvas);
            float f2 = ((Float)b.getAnimatedValue()).floatValue();
            int k = getWidth();
            int l = k >> h - 1;
            int i = 0;
            while (i < h) 
            {
                float f3 = f2 * (float)(k >> i + 1);
                float f1;
                if (i == 0)
                {
                    f1 = k + l;
                } else
                {
                    f1 = 2.0F * f3;
                }
                canvas.drawRect((f3 + (float)f) - (float)l, 0.0F, f1 - (float)l, e, c);
                i++;
            }
        }
    }

    protected void onLayout(boolean flag, int i, int k, int l, int i1)
    {
        if (flag)
        {
            i = getWidth();
            a.setBounds(0, e, i, getHeight() - e);
            float f1 = (float)i / g / 300F;
            b.setDuration((int)((0.3F * (f1 - 1.0F) + 1.0F) * 500F));
            h = (int)(((f1 - 1.0F) * 0.1F + 1.0F) * 5F);
        }
    }

    protected void onVisibilityChanged(View view, int i)
    {
        super.onVisibilityChanged(view, i);
        if (i == 0)
        {
            if (b != null)
            {
                b.start();
            }
        } else
        if (b != null)
        {
            b.cancel();
            return;
        }
    }
}
