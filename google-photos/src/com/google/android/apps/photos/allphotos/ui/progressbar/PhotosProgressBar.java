// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.allphotos.ui.progressbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import b;

public class PhotosProgressBar extends ProgressBar
{

    private Paint a;
    private long b;
    private boolean c;
    private int d;

    public PhotosProgressBar(Context context)
    {
        super(context);
    }

    public PhotosProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PhotosProgressBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean isIndeterminate()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        super.onDraw(canvas);
        flag = c;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        double d1;
        int j;
        int k;
        j = getHeight();
        k = getWidth();
        d1 = (double)((System.nanoTime() - b) % 0x3b9aca00L) / 1000000000D;
        int i = -1;
_L4:
        int l;
        if (i > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l = i * k + (int)((double)k * d1);
        canvas.drawRect(l, 0.0F, l + d, j, a);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        postInvalidate();
        if (true) goto _L1; else goto _L5
_L5:
        canvas;
        throw canvas;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = new Paint();
        a.setColor(getResources().getColor(b.ju));
        d = getResources().getDimensionPixelSize(b.jv);
    }

    public void setIndeterminate(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        c = flag;
        if (c)
        {
            setProgress(getMax());
            b = System.nanoTime();
        }
        postInvalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
