// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.FloatMath;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.Enums.Alignment;

// Referenced classes of package com.artfulbits.aiCharts.a:
//            a, b

public class d extends a
{

    private Drawable c;
    private String d;
    private Alignment e;
    private Alignment f;
    private TextPaint g;
    private Paint h;
    private boolean i;
    private boolean j;
    private final PointF k;

    public d(Drawable drawable, String s)
    {
        this(drawable, s, "");
    }

    public d(Drawable drawable, String s, String s1)
    {
        this(drawable, s, s1, Alignment.b, Alignment.b);
    }

    public d(Drawable drawable, String s, String s1, Alignment alignment, Alignment alignment1)
    {
        e = null;
        f = null;
        g = new TextPaint();
        h = new Paint();
        i = true;
        j = true;
        k = new PointF();
        c = drawable;
        d = s;
        a = s1;
        e = alignment;
        f = alignment1;
        g.setAntiAlias(true);
        g.setColor(-1);
        h.setColor(-1);
        h.setStrokeWidth(1.0F);
    }

    public d(String s)
    {
        this(s, "");
    }

    public d(String s, String s1)
    {
        this(null, s, s1);
    }

    private static void a(PointF pointf, Alignment alignment, Alignment alignment1, int i1, int j1, int k1, Rect rect)
    {
        int l1;
        int i2;
        l1 = i1 / 2;
        i2 = j1 / 2;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Alignment.values().length];
                try
                {
                    a[Alignment.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Alignment.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Alignment.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[alignment.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 106
    //                   2 126
    //                   3 143;
           goto _L1 _L2 _L3 _L4
_L1:
        _cls1.a[alignment1.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 160
    //                   2 181
    //                   3 198;
           goto _L5 _L6 _L7 _L8
_L5:
        rect.bottom = rect.top + j1;
        rect.right = rect.left + i1;
        return;
_L2:
        rect.left = (int)(pointf.x - (float)i1 - (float)k1);
          goto _L1
_L3:
        rect.left = (int)(pointf.x - (float)l1);
          goto _L1
_L4:
        rect.left = (int)(pointf.x + (float)k1);
          goto _L1
_L6:
        rect.top = (int)(pointf.y - (float)j1 - (float)k1);
          goto _L5
_L7:
        rect.top = (int)(pointf.y - (float)i2);
          goto _L5
_L8:
        rect.top = (int)(pointf.y + (float)k1);
          goto _L5
    }

    public void a(Canvas canvas, e e1)
    {
        b().a(e1, k);
        e1 = e1.g();
        Rect rect = new Rect();
        Rect rect1 = new Rect();
        int i2 = b;
        int k1 = (int)FloatMath.ceil(g.measureText(d));
        int l1 = (int)FloatMath.ceil(g.getTextSize());
        int i1;
        int j1;
        if (c != null)
        {
            c.getPadding(rect1);
            i1 = Math.max(rect1.left + k1 + rect1.right, c.getMinimumWidth());
            j1 = Math.max(rect1.top + l1 + rect1.bottom, c.getMinimumHeight());
        } else
        {
            j1 = l1;
            i1 = k1;
        }
        a(k, e, f, i1, j1, i2, rect);
        if (j)
        {
            int j2 = e1.centerX();
            int k2 = e1.centerY();
            if (k.x < (float)j2 && rect.left < ((Rect) (e1)).left)
            {
                a(k, Alignment.c, f, i1, j1, i2, rect);
            } else
            if (k.x > (float)j2 && rect.right > ((Rect) (e1)).right)
            {
                a(k, Alignment.a, f, i1, j1, i2, rect);
            }
            if (k.y < (float)k2 && rect.top < ((Rect) (e1)).top)
            {
                a(k, e, Alignment.c, i1, j1, i2, rect);
            } else
            if (k.y > (float)k2 && rect.bottom > ((Rect) (e1)).bottom)
            {
                a(k, e, Alignment.a, i1, j1, i2, rect);
            }
        }
        if (i)
        {
            float f1 = rect.centerX();
            float f2 = rect.centerY();
            if ((float)rect.right < k.x)
            {
                f1 = rect.right;
            } else
            if ((float)rect.left > k.x)
            {
                f1 = rect.left;
            }
            if ((float)rect.bottom < k.y)
            {
                f2 = rect.bottom;
            } else
            if ((float)rect.top > k.y)
            {
                f2 = rect.top;
            }
            canvas.drawLine(k.x, k.y, f1, f2, h);
        }
        if (c != null)
        {
            c.setBounds(rect);
            c.draw(canvas);
        }
        i1 = ((rect.left + rect1.left + rect.right) - rect1.right) / 2;
        j1 = ((rect.top + rect1.top + rect.bottom) - rect1.bottom) / 2;
        canvas.drawText(d, i1 - k1 / 2, (float)(j1 + l1 / 2) - g.descent(), g);
    }

    public void a(Drawable drawable)
    {
        if (c != drawable)
        {
            c = drawable;
        }
    }

    public void a(Alignment alignment)
    {
        f = alignment;
    }

    public void a(Alignment alignment, Alignment alignment1)
    {
        b(alignment);
        a(alignment1);
    }

    public void a(boolean flag)
    {
        if (i != flag)
        {
            i = flag;
        }
    }

    public void b(int i1)
    {
        if (g.getColor() != i1)
        {
            g.setColor(i1);
        }
    }

    public void b(Alignment alignment)
    {
        e = alignment;
    }

    public void b(String s)
    {
        d = s;
    }

    public void b(boolean flag)
    {
        if (j != flag)
        {
            j = flag;
        }
    }

    public Alignment d()
    {
        return f;
    }

    public Alignment e()
    {
        return e;
    }

    public TextPaint f()
    {
        return g;
    }

    public int g()
    {
        return g.getColor();
    }

    public Paint h()
    {
        return h;
    }

    public boolean i()
    {
        return i;
    }

    public String j()
    {
        return d;
    }

    public Drawable k()
    {
        return c;
    }

    public boolean l()
    {
        return j;
    }
}
