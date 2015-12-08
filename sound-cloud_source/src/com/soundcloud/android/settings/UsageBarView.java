// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsageBarView extends View
{
    private class UsageBar
    {

        private long amount;
        private Paint paint;
        final UsageBarView this$0;

        public long getAmount()
        {
            return amount;
        }

        public Paint getPaint()
        {
            return paint;
        }

        UsageBar(int i, long l)
        {
            this$0 = UsageBarView.this;
            super();
            paint = new Paint();
            paint.setColor(i);
            amount = Math.max(0L, l);
        }
    }


    private final List bars;
    private final Paint borderPaint;
    private double totalAmount;

    public UsageBarView(Context context)
    {
        super(context);
        bars = new ArrayList();
        borderPaint = new Paint();
        setColors();
    }

    public UsageBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        bars = new ArrayList();
        borderPaint = new Paint();
        setColors();
    }

    public UsageBarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        bars = new ArrayList();
        borderPaint = new Paint();
        setColors();
    }

    private void setColors()
    {
        borderPaint.setColor(getResources().getColor(0x7f0e00e6));
    }

    public UsageBarView addBar(int i, long l)
    {
        bars.add(new UsageBar(getResources().getColor(i), l));
        totalAmount = totalAmount + (double)Math.max(0L, l);
        invalidate();
        return this;
    }

    protected void onDraw(Canvas canvas)
    {
        if (totalAmount != 0.0D)
        {
            int i = getMeasuredWidth() - 2;
            int j = getMeasuredHeight() - 2;
            canvas.drawRect(0.0F, 0.0F, i + 2, j + 2, borderPaint);
            Iterator iterator = bars.iterator();
            float f = 1.0F;
            while (iterator.hasNext()) 
            {
                UsageBar usagebar = (UsageBar)iterator.next();
                float f1 = (float)((double)(usagebar.getAmount() * (long)i) / totalAmount);
                canvas.drawRect(f, 1.0F, f + f1, j + 1, usagebar.getPaint());
                f += f1;
            }
        }
    }

    public UsageBarView reset()
    {
        bars.clear();
        totalAmount = 0.0D;
        return this;
    }
}
