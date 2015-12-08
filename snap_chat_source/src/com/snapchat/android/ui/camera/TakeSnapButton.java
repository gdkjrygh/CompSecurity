// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.camera;

import Jo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.snapchat.android.util.SnapMediaUtils;

public class TakeSnapButton extends View
{

    public long a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Runnable f;
    private final Paint g = new Paint();
    private final Paint h = new Paint();
    private final Paint i = new Paint();
    private final RectF j = new RectF();
    private final float k;
    private final float l;
    private float m;
    private float n;
    private int o;
    private Bitmap p;

    public TakeSnapButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        o = -1;
        c = true;
        e = true;
        f = new Runnable() {

            private TakeSnapButton a;

            public final void run()
            {
                a.invalidate();
            }

            
            {
                a = TakeSnapButton.this;
                super();
            }
        };
        g.setAntiAlias(true);
        g.setStyle(android.graphics.Paint.Style.FILL);
        h.setAntiAlias(true);
        h.setStyle(android.graphics.Paint.Style.STROKE);
        k = Jo.a(5F, context);
        l = Jo.a(1.0F, context);
    }

    private void a(Canvas canvas, float f1)
    {
        g.setColor(-1);
        g.setAlpha(127);
        canvas.drawCircle(m, n, (float)o - k / 2.0F, g);
        if (e)
        {
            g.setColor(0xffff0000);
            g.setAlpha(255);
            canvas.drawCircle(m, n, (1.0F - f1) * 0.75F * ((float)o - k / 2.0F), g);
        }
        h.setColor(-1);
        h.setStrokeWidth(k);
        canvas.drawCircle(m, n, (float)o - k / 2.0F, h);
        h.setColor(0xff000000);
        h.setStrokeWidth(l);
        canvas.drawCircle(m, n, (float)o + l / 2.0F, h);
    }

    public final void a()
    {
        removeCallbacks(f);
        d = false;
        b = false;
        c = false;
    }

    public void onDraw(Canvas canvas)
    {
        if (p == null)
        {
            return;
        }
        if (o == -1)
        {
            o = (int)m - 20;
        }
        if (b)
        {
            if (c)
            {
                invalidate();
            }
            long l1 = SystemClock.elapsedRealtime() - a;
            if (d)
            {
                float f1 = Math.max(0.0F, (float)((l1 - 500L) * 360L) / 10000F);
                a(canvas, 0.0F);
                canvas.drawArc(j, -90F, f1, true, i);
                return;
            } else
            {
                a(canvas, 1.0F - (float)Math.min(l1 - 125L, 375L) / 375F);
                return;
            }
        } else
        {
            a(canvas, 1.0F);
            return;
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        p = SnapMediaUtils.a(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        if (p == null)
        {
            return;
        } else
        {
            Object obj = new Canvas(p);
            h.setColor(0xffff0000);
            h.setStrokeWidth(k);
            m = i1 / 2;
            n = j1 / 2;
            o = (int)m - 20;
            ((Canvas) (obj)).drawCircle(m, n, (float)o - k / 2.0F, h);
            obj = new BitmapShader(p, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            i.setShader(((android.graphics.Shader) (obj)));
            j.set(0.0F, 0.0F, i1, j1);
            return;
        }
    }
}
