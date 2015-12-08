// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.translate.l;
import com.google.android.apps.unveil.env.j;

public class EdgeDetectingView extends View
{

    private static final int a = Color.rgb(24, 64, 186);
    private final float b;
    private final int c;
    private final Bitmap d;
    private final Rect e;
    private final Rect f;
    private final Paint g = new Paint();
    private j h;
    private int i;
    private long j;
    private boolean k;
    private boolean l;
    private int m;

    public EdgeDetectingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0.15F * getResources().getDisplayMetrics().density;
        g.setColor(a);
        d = BitmapFactory.decodeResource(getResources(), l.glowing_line);
        if (d != null)
        {
            c = d.getWidth();
            e = new Rect(0, 0, c, d.getHeight());
            f = new Rect(e);
        } else
        {
            c = 0;
            context = new Rect();
            f = context;
            e = context;
        }
        l = false;
    }

    public void draw(Canvas canvas)
    {
        if (!l) goto _L2; else goto _L1
_L1:
        int i1;
        long l1 = System.currentTimeMillis();
        i1 = (int)((float)(l1 - j) * b);
        j = l1;
        if (!k) goto _L4; else goto _L3
_L3:
        i = i + i1;
        f.offsetTo(i, 0);
        if (i > m)
        {
            k = false;
            i = m;
        }
_L6:
        float f1 = Math.max(0, Math.min(i, m));
        g.setAlpha((int)(Math.sin(((double)f1 * 3.1415926535897931D) / (double)m) * 100D + 100D));
        canvas.save();
        if (!k)
        {
            canvas.scale(-1F, 1.0F, f.centerX(), 0.0F);
        }
        canvas.drawBitmap(d, e, f, null);
        canvas.restore();
        canvas.drawBitmap(h.c(), f, f, g);
        postInvalidate();
_L2:
        return;
_L4:
        i = i - i1;
        f.offsetTo(i, 0);
        if (i < -c)
        {
            k = true;
            i = -c;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        f.bottom = j1;
        m = i1;
    }

}
