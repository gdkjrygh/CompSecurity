// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import dfh;

public class CircularProgressBar extends View
{

    private boolean a;
    private Paint b;
    private int c;
    private int d;
    private final RectF e;
    private int f;
    private Paint g;
    private int h;
    private float i;
    private Paint j;
    private float k;
    private Paint l;
    private boolean m;
    private final int n;
    private int o;
    private int p;
    private float q;
    private float r;
    private float s;
    private float t;
    private boolean u;
    private final RectF v;
    private boolean w;

    public CircularProgressBar(Context context)
    {
        this(context, null);
    }

    public CircularProgressBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101f7);
    }

    public CircularProgressBar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = true;
        b = new Paint();
        c = 10;
        d = 20;
        e = new RectF();
        i = 0.3F;
        j = new Paint();
        k = 0.0F;
        m = false;
        o = 0;
        p = 0;
        u = false;
        v = new RectF();
        w = true;
        context = context.obtainStyledAttributes(attributeset, dfh.x, i1, 0);
        f = context.getColor(dfh.D, 0xff00ffff);
        c();
        h = context.getColor(dfh.C, -65281);
        b();
        a();
        a(context.getFloat(dfh.B, 0.0F));
        b(context.getFloat(dfh.z, 0.0F));
        c = (int)context.getDimension(dfh.E, 10F);
        w = context.getBoolean(dfh.F, true);
        m = context.getBoolean(dfh.A, true);
        n = context.getInt(dfh.y, 17);
        context.recycle();
        d = c << 1;
        a();
        b();
        c();
        a = false;
    }

    private void a()
    {
        b = new Paint(1);
        b.setColor(h);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        b.setStrokeWidth(c);
        invalidate();
    }

    private void b()
    {
        l = new Paint(1);
        l.setColor(h);
        l.setStyle(android.graphics.Paint.Style.STROKE);
        l.setStrokeWidth((float)c / 2.0F);
        invalidate();
    }

    private void b(float f1)
    {
        m = true;
        k = f1;
    }

    private void c()
    {
        g = new Paint(1);
        g.setColor(f);
        g.setStyle(android.graphics.Paint.Style.STROKE);
        g.setStrokeWidth(c);
        j = new Paint(1);
        j.setColor(f);
        j.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        j.setStrokeWidth(c);
        invalidate();
    }

    public final void a(float f1)
    {
        if (f1 != i)
        {
            if (f1 == 1.0F)
            {
                u = false;
                i = 1.0F;
            } else
            {
                if (f1 >= 1.0F)
                {
                    u = true;
                } else
                {
                    u = false;
                }
                i = f1 % 1.0F;
            }
            if (!a)
            {
                invalidate();
                return;
            }
        }
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.translate(q, r);
        float f2 = 360F * i;
        if (!u)
        {
            canvas.drawArc(e, 270F, -(360F - f2), false, b);
        }
        RectF rectf = e;
        float f1;
        if (u)
        {
            f1 = 360F;
        } else
        {
            f1 = f2;
        }
        canvas.drawArc(rectf, 270F, f1, false, g);
        if (m)
        {
            f1 = k;
            canvas.save();
            canvas.rotate(360F * f1 - 90F);
            canvas.drawLine((float)((double)s + ((double)d / 2D) * 1.3999999999999999D), t, (float)((double)s - ((double)d / 2D) * 1.3999999999999999D), t, l);
            canvas.restore();
        }
        if (w)
        {
            canvas.save();
            canvas.rotate(f2 - 90F);
            canvas.rotate(45F, s, t);
            v.left = s - (float)d / 3F;
            v.right = s + (float)d / 3F;
            v.top = t - (float)d / 3F;
            v.bottom = t + (float)d / 3F;
            canvas.drawRect(v, j);
            canvas.restore();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        float f1;
        int k1;
        k1 = getDefaultSize(getSuggestedMinimumHeight(), j1);
        j1 = getDefaultSize(getSuggestedMinimumWidth(), i1);
        i1 = Math.min(j1, k1);
        setMeasuredDimension(i1, k1);
        f1 = (float)i1 * 0.5F;
        float f2 = f1 - (float)d;
        e.set(-f2, -f2, f2, f2);
        s = f2;
        t = f2;
        j1 -= i1;
        k1 -= i1;
        i1 = n;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            i1 = getLayoutDirection();
            i1 = Gravity.getAbsoluteGravity(n, i1);
        }
        i1 & 7;
        JVM INSTR tableswitch 3 5: default 144
    //                   3 211
    //                   4 144
    //                   5 219;
           goto _L1 _L2 _L1 _L3
_L1:
        o = j1 / 2;
_L7:
        i1 & 0x70;
        JVM INSTR lookupswitch 2: default 180
    //                   48: 227
    //                   80: 235;
           goto _L4 _L5 _L6
_L4:
        p = k1 / 2;
_L8:
        q = (float)o + f1;
        r = (float)p + f1;
        return;
_L2:
        o = 0;
          goto _L7
_L3:
        o = j1;
          goto _L7
_L5:
        p = 0;
          goto _L8
_L6:
        p = k1;
          goto _L8
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            a(parcelable.getFloat("progress"));
            b(parcelable.getFloat("marker_progress"));
            int i1 = parcelable.getInt("progress_color");
            if (i1 != f)
            {
                f = i1;
                c();
            }
            i1 = parcelable.getInt("progress_background_color");
            if (i1 != h)
            {
                h = i1;
                a();
            }
            super.onRestoreInstanceState(parcelable.getParcelable("saved_state"));
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_state", super.onSaveInstanceState());
        bundle.putFloat("progress", i);
        bundle.putFloat("marker_progress", k);
        bundle.putInt("progress_color", f);
        bundle.putInt("progress_background_color", h);
        return bundle;
    }

    static 
    {
        com/spotify/android/paste/widget/CircularProgressBar.getSimpleName();
    }
}
