// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import com.pinterest.base.Constants;

public class RoundedMaskView extends View
{

    private Paint a;
    private int b;
    private int c;
    private RectF d;
    private Bitmap e;
    private Canvas f;

    public RoundedMaskView(Context context)
    {
        this(context, Constants.CORNER_RADIUS);
    }

    private RoundedMaskView(Context context, int i)
    {
        super(context);
        a = new Paint();
        d = new RectF();
        setWillNotDraw(false);
        b = -1;
        c = i;
        a.setAntiAlias(true);
        a.setColor(-1);
        a.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (e != null)
        {
            f.drawColor(b);
            f.drawRoundRect(d, c, c, a);
            canvas.drawBitmap(e, 0.0F, 0.0F, null);
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        d.set(0.0F, 0.0F, i, j);
        if (e != null)
        {
            e.recycle();
        }
        e = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        e.eraseColor(0);
        f = new Canvas(e);
    }
}
