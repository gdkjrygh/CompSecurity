// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.skype.android.util.FloatMath;

public class SqueezeableImageView extends View
{
    public static interface OnScaleListener
    {
    }


    private float A;
    private float B;
    private float C;
    private float D;
    private boolean E;
    private final Paint F;
    public float a;
    public float b;
    boolean c;
    float d;
    float e;
    int f;
    android.view.View.OnClickListener g;
    OnScaleListener h;
    private Bitmap i;
    private int j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public SqueezeableImageView(Context context)
    {
        this(context, null);
    }

    public SqueezeableImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = false;
        d = 0.0F;
        e = 0.0F;
        f = 0;
        E = false;
        F = new Paint();
        F.setAntiAlias(true);
    }

    private static float a(float f1, float f2, float f3, float f4)
    {
        return (float)Math.pow(FloatMath.a(f3 - f1) + FloatMath.a(f4 - f2), 0.5D);
    }

    private void a()
    {
        if (b())
        {
            a = Math.min(v / t, w / u);
            b = a * 6F;
            o = a;
        }
    }

    private boolean b()
    {
        return i != null && c;
    }

    private void c()
    {
        if (b()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        f1 = r;
        f2 = t;
        f3 = o;
        f4 = s;
        f5 = u;
        f6 = o;
        f7 = t * o;
        f8 = u * o;
        if (f7 > v) goto _L4; else goto _L3
_L3:
        r = (v - f7) / 2.0F / o;
_L6:
        if (f8 <= w)
        {
            s = (w - f8) / 2.0F / o;
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (r > 0.0F)
        {
            r = 0.0F;
        } else
        if ((f1 + f2) * f3 < v)
        {
            r = v / o - t;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (s > 0.0F)
        {
            s = 0.0F;
            return;
        }
        if ((f4 + f5) * f6 < w)
        {
            s = w / o - u;
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (E)
        {
            D = D + 0.05F;
            if (D > 1.0F)
            {
                D = 1.0F;
                E = false;
            }
            r = x + (z - x) * D;
            s = y + (A - y) * D;
            float f1;
            if (D == 1.0F)
            {
                f1 = a;
            } else
            {
                f1 = B + (C - B) * D;
            }
            o = f1;
            if (h != null)
            {
                Math.abs(o - a);
            }
            invalidate();
        }
        canvas.save();
        canvas.scale(o, o);
        canvas.translate(r, s);
        if (i != null && !i.isRecycled())
        {
            canvas.drawBitmap(i, 0.0F, 0.0F, F);
        }
        canvas.restore();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (flag)
        {
            v = Math.abs(i1 - k1);
            w = Math.abs(j1 - l1);
            if (E)
            {
                o = a;
                E = false;
            }
            c = true;
            a();
            c();
            invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (E || !b())
        {
            return super.onTouchEvent(motionevent);
        }
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        k = motionevent.getX();
        l = motionevent.getY();
        m = k;
        n = l;
        j = 0;
        d = 0.0F;
        e = 0.0F;
        f = 1;
_L10:
        if (h != null)
        {
            Math.abs(o - a);
        }
        return true;
_L2:
        if (motionevent.getAction() != 2)
        {
            break MISSING_BLOCK_LABEL_672;
        }
        float f1;
        float f3;
        int i1;
        if (motionevent.getPointerCount() > f)
        {
            i1 = motionevent.getPointerCount();
        } else
        {
            i1 = f;
        }
        f = i1;
        if (j != motionevent.getPointerCount())
        {
            if (motionevent.getPointerCount() == 1)
            {
                k = motionevent.getX();
                l = motionevent.getY();
                m = k;
                n = l;
            } else
            if (motionevent.getPointerCount() == 2)
            {
                k = (motionevent.getX() + motionevent.getX(1)) / 2.0F;
                l = (motionevent.getY() + motionevent.getY(1)) / 2.0F;
                m = k;
                n = l;
                p = o;
                q = a(motionevent.getX(), motionevent.getY(), motionevent.getX(1), motionevent.getY(1));
            }
        }
        j = motionevent.getPointerCount();
        if (j != 1) goto _L4; else goto _L3
_L3:
        k = motionevent.getX();
        l = motionevent.getY();
        f1 = (k - m) / o;
        f3 = (l - n) / o;
        d = d + Math.abs(f1);
        e = e + Math.abs(f3);
        r = r + f1;
        s = s + f3;
        m = k;
        n = l;
_L6:
        c();
        invalidate();
        continue; /* Loop/switch isn't completed */
_L4:
        float f2;
        float f4;
        float f6;
        if (j != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = (motionevent.getX() + motionevent.getX(1)) / 2.0F;
        l = (motionevent.getY() + motionevent.getY(1)) / 2.0F;
        f2 = (k - m) / o;
        f4 = (l - n) / o;
        float f5 = a(motionevent.getX(), motionevent.getY(), motionevent.getX(1), motionevent.getY(1));
        f6 = o;
        o = p * (f5 / q);
        if (o >= a)
        {
            break; /* Loop/switch isn't completed */
        }
        o = a;
_L8:
        r = r + f2;
        s = s + f4;
        r = r + (k * (1.0F - o / f6)) / o;
        s = s + (l * (1.0F - o / f6)) / o;
        m = k;
        n = l;
        if (true) goto _L6; else goto _L5
_L5:
        if (o <= b) goto _L8; else goto _L7
_L7:
        o = b;
          goto _L8
        if (motionevent.getAction() == 1 && g != null && f == 1)
        {
            k = motionevent.getX();
            l = motionevent.getY();
            if (d < 20F && e < 20F)
            {
                g.onClick(this);
            }
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void setBitmap(Bitmap bitmap)
    {
        if (i != bitmap)
        {
            i = bitmap;
            t = i.getWidth();
            u = i.getHeight();
            a();
            c();
            invalidate();
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        g = onclicklistener;
    }

    public void setOnScaleListener(OnScaleListener onscalelistener)
    {
        h = onscalelistener;
    }
}
