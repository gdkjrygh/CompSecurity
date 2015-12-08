// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.roidapp.imagelib.d;

public class Magnifier extends View
{

    private int a;
    private int b;
    private int c;
    private float d;
    private RectF e;
    private RectF f;
    private Path g;
    private Bitmap h;
    private RectF i;
    private int j;
    private int k;
    private Paint l;
    private Paint m;
    private float n;
    private float o;
    private int p;
    private PointF q;
    private float r;
    private Matrix s;

    public Magnifier(Context context)
    {
        super(context);
        s = new Matrix();
        ViewCompat.setLayerType(this, 1, null);
        a = context.getResources().getDisplayMetrics().widthPixels;
        b();
    }

    public Magnifier(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        s = new Matrix();
        ViewCompat.setLayerType(this, 1, null);
        a = context.getResources().getDisplayMetrics().widthPixels;
        b();
    }

    private void b()
    {
        b = Math.round((float)a * 0.15F);
        e = new RectF(0.0F, 0.0F, b * 2, b * 2);
        f = new RectF(0.0F, 0.0F, (float)(b * 2) + 5F, (float)(b * 2) + 5F);
        g = new Path();
        g.addRect(e, android.graphics.Path.Direction.CW);
        i = new RectF();
        l = new Paint();
        int i1 = getResources().getColor(d.a);
        l.setColor(i1);
        l.setStrokeWidth(4F);
        l.setStyle(android.graphics.Paint.Style.STROKE);
        l.setAntiAlias(true);
        m = new Paint();
        m.setARGB(255, 255, 255, 255);
        m.setAntiAlias(true);
        m.setStyle(android.graphics.Paint.Style.STROKE);
        m.setStrokeWidth(5F);
        c = (int)((float)(b * 2) * 2.0F);
        n = (float)b * 2.0F + 5F;
        o = (float)b * 2.0F + 5F;
        setBackgroundColor(0xff000000);
    }

    public final int a()
    {
        return b * 2 + 5;
    }

    public final void a(float f1)
    {
        r = f1;
    }

    public final void a(Bitmap bitmap)
    {
        h = bitmap;
        j = h.getWidth();
        k = h.getHeight();
        p = Math.min(j, k);
        if ((float)p / (float)(b * 2) < 2.0F)
        {
            d = (float)c / (float)p;
            return;
        } else
        {
            d = 1.0F;
            return;
        }
    }

    public final void a(PointF pointf)
    {
        q = pointf;
        i.left = pointf.x - (float)b;
        i.right = pointf.x + (float)b;
        i.top = pointf.y - (float)b;
        i.bottom = pointf.y + (float)b;
    }

    public final void b(float f1)
    {
        if (f1 > 1.0F)
        {
            d = f1;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (h != null && !h.isRecycled())
        {
            canvas.save();
            s.reset();
            s.postScale(d, d, q.x, q.y);
            s.postTranslate(-i.left, -i.top);
            canvas.drawBitmap(h, s, null);
            canvas.restore();
            canvas.save();
            canvas.translate(-i.left, -i.top);
            canvas.drawCircle(q.x, q.y, r, l);
            canvas.restore();
        }
        canvas.drawRect(f, m);
    }
}
