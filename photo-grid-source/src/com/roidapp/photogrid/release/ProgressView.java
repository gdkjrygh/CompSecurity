// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.roidapp.photogrid.common.bl;

public class ProgressView extends View
{

    private int a;
    private int b;
    private Paint c;
    private Paint d;
    private RectF e;
    private Path f;
    private float g;
    private Matrix h;
    private RectF i;
    private Paint j;
    private float k;
    private float l;
    private TextPaint m;
    private String n;
    private float o;
    private float p;
    private float q;
    private int r;
    private boolean s;
    private boolean t;

    public ProgressView(Context context)
    {
        super(context);
        c = new Paint();
        d = new Paint();
        e = new RectF();
        f = new Path();
        g = 10F;
        h = new Matrix();
        i = new RectF();
        j = new Paint();
        m = new TextPaint();
        n = "1";
        p = 1.5F;
        t = false;
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            bl.a(this);
        }
    }

    public ProgressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new Paint();
        d = new Paint();
        e = new RectF();
        f = new Path();
        g = 10F;
        h = new Matrix();
        i = new RectF();
        j = new Paint();
        m = new TextPaint();
        n = "1";
        p = 1.5F;
        t = false;
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            bl.a(this);
        }
    }

    public ProgressView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = new Paint();
        d = new Paint();
        e = new RectF();
        f = new Path();
        g = 10F;
        h = new Matrix();
        i = new RectF();
        j = new Paint();
        m = new TextPaint();
        n = "1";
        p = 1.5F;
        t = false;
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            bl.a(this);
        }
    }

    public final void a(int i1)
    {
        e.set(0.0F, (float)b - g, (float)i1 * q, b);
        h.postTranslate(q, 0.0F);
        invalidate();
    }

    public final void a(int i1, int j1)
    {
        a = i1;
        b = j1;
        p = getResources().getDisplayMetrics().density;
        g = p * 3F;
        c.reset();
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setStrokeWidth(g);
        c.setColor(getResources().getColor(0x7f0c0085));
        d.reset();
        d.setStyle(android.graphics.Paint.Style.STROKE);
        d.setStrokeWidth(g * 2.0F);
        d.setColor(getResources().getColor(0x7f0c0086));
        j.setStyle(android.graphics.Paint.Style.STROKE);
        j.setStrokeWidth(g);
        j.setColor(getResources().getColor(0x7f0c0084));
        i.set(0.0F, (float)b - g, a, b);
        m.setStyle(android.graphics.Paint.Style.STROKE);
        m.setTextSize(12F * p);
        m.setColor(getResources().getColor(0x7f0c0087));
    }

    public final void a(int i1, int j1, float f1)
    {
        r = i1;
        q = (1.0F / (float)j1) * (float)a;
        h.reset();
        h.postTranslate(-k + q + p * 2.0F, (float)b - g - l);
        e.set(0.0F, (float)b - g, 0.0F, b);
        t = false;
        n = "1";
        float f2 = p * 2.0F;
        f1 = ((float)a * f1) / (float)j1;
        f1 = (float)a - f1;
        DashPathEffect dashpatheffect = new DashPathEffect(new float[] {
            0.0F, 0.0F, f2, (f1 - ((float)i1 - 1.0F) * f2) / (float)i1
        }, f2);
        f.reset();
        f.moveTo(0.0F, (float)b - g / 2.0F);
        f.lineTo(f2 + f1, (float)b - g / 2.0F);
        d.setPathEffect(dashpatheffect);
        o = 5.5F * p;
    }

    public final void a(boolean flag)
    {
        s = flag;
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.drawRect(i, j);
        canvas.drawRect(e, c);
        if (s)
        {
            canvas.drawPath(f, d);
        }
        super.onDraw(canvas);
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
    }
}
