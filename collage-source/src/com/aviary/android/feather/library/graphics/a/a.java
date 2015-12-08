// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.graphics.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;

// Referenced classes of package com.aviary.android.feather.library.graphics.a:
//            b, c, d

public class a extends b
    implements c, d
{

    private boolean E;
    private float F;
    private float G;
    private Paint H;
    private float I;
    private float J;
    private boolean K;
    protected int a;
    protected int b;
    boolean c;

    public a(String s, float f, Typeface typeface, boolean flag)
    {
        super(s, f, typeface);
        E = true;
        K = true;
        c = flag;
        H = new Paint(e);
        a(s);
    }

    protected void a()
    {
        l();
    }

    public void a(float f)
    {
        if (f != p())
        {
            E = true;
        }
    }

    public void a(float f, float f1)
    {
        a = (int)f;
        b = (int)f1;
        I = Math.min(f, f1) / 7F;
        J = f / 40F;
    }

    public void a(float f, float f1, float f2, float f3)
    {
        if (f != m.left || f1 != m.top || f2 != m.right || f3 != m.bottom)
        {
            m.set(f, f1, f2, f3);
            K = true;
            a = (int)m.width();
        }
        if (E || K)
        {
            f1 = v;
            H.setTextSize(f1);
            if (l.length() > 0)
            {
                f = H.measureText(l);
            } else
            {
                f = H.measureText("a");
            }
            f1 = Math.min(((m.width() - J * 2.0F) / f) * f1, I);
            e.setTextSize(f1);
            g.setTextSize(f1);
            g.setStrokeWidth(f1 / 10F);
            t = g.getStrokeWidth();
            if (l.length() > 0)
            {
                f = e.measureText(l);
            } else
            {
                f = e.measureText("a");
            }
            G = f1;
            F = (m.width() - f) / 2.0F;
            E = false;
            K = false;
        }
    }

    public void a(String s)
    {
        super.a(s.toUpperCase());
        E = true;
    }

    public boolean a(RectF rectf)
    {
        return true;
    }

    public int b()
    {
        return 1;
    }

    public void draw(Canvas canvas)
    {
        b(D);
        if (h != null)
        {
            canvas.drawRect(D, h);
        }
        int i = b();
        a(B);
        float f1 = B.ascent - (B.top - B.ascent);
        float f;
        float f2;
        if (c)
        {
            f = D.top - f1;
        } else
        {
            f = D.bottom - (B.bottom - B.descent);
        }
        f2 = D.left;
        f2 = F + f2;
        canvas.drawText(this.l, f2, f, g);
        canvas.drawText(this.l, f2, f, e);
        if (n)
        {
            long l = System.currentTimeMillis();
            if (l - o > 300L)
            {
                float f3;
                boolean flag;
                if (!p)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p = flag;
                o = l;
            }
            if (p)
            {
                a(i - 1, C);
                f3 = t;
                f2 = (float)C.width() + (f3 + f2);
                f1 += f;
                f3 = f2 + s;
                canvas.drawRect(f2, f1, f3, f, g);
                canvas.drawRect(f2, f1, f3, f, this.f);
            }
        }
    }

    public int getIntrinsicHeight()
    {
        return (int)e.getTextSize();
    }

    public int getIntrinsicWidth()
    {
        return a;
    }
}
