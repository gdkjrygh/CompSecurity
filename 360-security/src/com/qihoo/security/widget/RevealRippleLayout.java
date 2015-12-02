// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class RevealRippleLayout extends LinearLayout
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(boolean flag, float f1);

        public abstract boolean a(int i1, boolean flag);

        public abstract void b();
    }

    public static class b
        implements a
    {

        public void a()
        {
        }

        public void a(boolean flag, float f1)
        {
        }

        public boolean a(int i1, boolean flag)
        {
            return true;
        }

        public void b()
        {
        }

        public b()
        {
        }
    }


    Rect a;
    Bitmap b;
    Canvas c;
    boolean d;
    float e;
    int f;
    float g;
    float h;
    float i;
    float j;
    float k;
    float l;
    int m;
    Paint n;
    a o;
    private Rect p;

    public RevealRippleLayout(Context context)
    {
        super(context);
        p = null;
        a = null;
        b = null;
        c = null;
        e = 10F;
        f = 0xfffafafa;
        g = -100F;
        i = -1F;
        j = -1F;
        k = -1F;
        l = 0.0F;
        m = 0;
        a();
    }

    public RevealRippleLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        p = null;
        a = null;
        b = null;
        c = null;
        e = 10F;
        f = 0xfffafafa;
        g = -100F;
        i = -1F;
        j = -1F;
        k = -1F;
        l = 0.0F;
        m = 0;
        a();
    }

    public RevealRippleLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        p = null;
        a = null;
        b = null;
        c = null;
        e = 10F;
        f = 0xfffafafa;
        g = -100F;
        i = -1F;
        j = -1F;
        k = -1F;
        l = 0.0F;
        m = 0;
        a();
    }

    private void a()
    {
        setWillNotDraw(false);
        p = new Rect(0, 0, getWidth(), getHeight());
        a = new Rect(0, 0, getWidth(), getHeight());
    }

    void a(Canvas canvas)
    {
        if (n == null)
        {
            n = new Paint();
            n.setAntiAlias(true);
            n.setColor(f);
        }
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(i, j, k, n);
        if (k > 0.0F)
        {
            float f3 = k;
            float f1;
            if (d)
            {
                f1 = e;
            } else
            {
                f1 = -e;
            }
            k = f1 + f3;
        }
        if (k >= l || k <= 0.0F)
        {
            if (o != null)
            {
                if (k <= 0.0F)
                {
                    o.a();
                } else
                {
                    o.b();
                }
            }
            i = -1F;
            j = -1F;
        } else
        if (o != null && l != 0.0F)
        {
            float f2;
            int i1;
            if (d)
            {
                f2 = k;
            } else
            {
                f2 = l - k;
            }
            i1 = (int)((f2 * 100F) / l);
            if (m != i1)
            {
                m = i1;
                o.a(m, d);
                return;
            }
        }
    }

    public void a(boolean flag)
    {
        d = true;
        if (flag)
        {
            k = e;
        } else
        {
            k = Math.max(getWidth(), getHeight());
        }
        i = g;
        j = h;
        invalidate();
    }

    public void b(boolean flag)
    {
        d = false;
        if (flag)
        {
            k = Math.max(getWidth(), getHeight());
        } else
        {
            k = 0.0F;
        }
        i = g;
        j = h;
        invalidate();
    }

    public a getCallback()
    {
        return o;
    }

    public int getRippleColor()
    {
        return f;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (i != -1F)
        {
            if (i < -10F)
            {
                i = g;
                j = h;
            }
            p.right = getWidth();
            p.bottom = getHeight();
            a.right = getWidth();
            a.bottom = getHeight();
            l = Math.max(getWidth(), getHeight());
            a(canvas);
            invalidate();
        }
    }

    protected void onFocusChanged(boolean flag, int i1, Rect rect)
    {
        if (!flag)
        {
            i = -1F;
            j = -1F;
        }
    }

    public void setCallback(a a1)
    {
        o = a1;
    }

    public void setRippleColor(int i1)
    {
        f = i1;
    }

    public void setRippleSpeed(int i1)
    {
        e = i1;
    }

    public void setxRippleOrigin(Float float1)
    {
        g = float1.floatValue();
    }

    public void setyRippleOrigin(Float float1)
    {
        h = float1.floatValue();
    }
}
