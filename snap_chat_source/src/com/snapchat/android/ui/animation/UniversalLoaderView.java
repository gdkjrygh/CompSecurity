// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.animation;

import PB;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

public class UniversalLoaderView extends View
    implements Runnable
{

    private final RectF a = new RectF();
    private final RectF b = new RectF();
    private final Paint c = new Paint();
    private final long d = SystemClock.elapsedRealtime();

    public UniversalLoaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        new PB();
        c.setColor(-1);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    public void onDraw(Canvas canvas)
    {
        postDelayed(this, 16L);
        float f = 360F * ((float)(int)(SystemClock.elapsedRealtime() - d) / 1000F);
        canvas.drawArc(a, f + 90F, 180F, false, c);
        canvas.drawArc(b, 90F - f, -180F, false, c);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        i /= 12;
        j /= 12;
        c.setStrokeWidth(i);
        a.set(i * 3, j * 3, i * 9, j * 9);
        b.set(i, j, i * 11, j * 11);
    }

    public void run()
    {
        postInvalidate();
    }
}
