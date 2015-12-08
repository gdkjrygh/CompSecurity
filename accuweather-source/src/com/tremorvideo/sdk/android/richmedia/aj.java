// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import com.tremorvideo.sdk.android.videoad.ct;
import com.tremorvideo.sdk.android.videoad.eb;
import java.util.GregorianCalendar;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ab, am, z, a, 
//            an, aa, b, l, 
//            e, n, k

public class aj extends ab
{
    protected class a extends k
    {

        public float a;
        public int b;
        public float c;
        public int d;
        public float e;
        public int f;
        public float g;
        public int h;
        public boolean i;
        final aj j;

        public void a(e e1)
        {
            super.a(e1);
            try
            {
                a = e1.d();
                b = e1.b();
                c = e1.d();
                d = e1.b();
                e = e1.d();
                f = e1.b();
                g = e1.d();
                h = e1.b();
                i = e1.f();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                return;
            }
        }

        protected a()
        {
            j = aj.this;
            super();
        }
    }


    Paint l;
    Paint m;
    Paint n;
    Paint o;
    Paint p;
    int q;
    int r;
    int s;
    int t;
    int u;
    int v;
    int w;
    double x;
    int y;

    public aj(z z1)
    {
        super(z1);
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        u = 0;
        v = 0;
        x = 0.0D;
        y = 0;
    }

    private int a(am aam[], int i1)
    {
        int j1 = 0;
        int l1 = aam.length;
        int k1 = 0;
        for (; j1 < l1; j1++)
        {
            am am1 = aam[j1];
            if (am1.c == 0)
            {
                am1.c = Math.round(a(am1.a, i1).measureText(am1.b));
            }
            k1 += am1.c;
        }

        return k1;
    }

    private Paint a(am.a a1, int i1)
    {
        if (a1 == am.a.a)
        {
            return c(i1);
        }
        if (a1 == am.a.c)
        {
            return b(i1);
        }
        if (a1 == am.a.b)
        {
            return d(i1);
        } else
        {
            return c(i1);
        }
    }

    private am i(int i1, int j1)
    {
        j1 = e(j1);
        int k1 = t;
        am aam[] = g.f().m();
        if (aam != null)
        {
            int l1 = aam.length;
            k1 += j1;
            for (j1 = 0; j1 < l1; j1++)
            {
                am am1 = aam[j1];
                if (k1 < i1 && am1.c + k1 >= i1)
                {
                    return am1;
                }
                k1 += am1.c;
            }

        }
        return null;
    }

    protected void a(Canvas canvas, int i1, int j1, int k1, int l1)
    {
        canvas.save();
        Object obj = g.f().m();
        int i2 = 0;
        if (obj != null)
        {
            i2 = a(((am []) (obj)), l1);
        }
        w = i2;
        i2 = e(k1) + (i1 + 2);
        b(canvas, i1, j1, k1, l1);
        canvas.clipRect(i1 + 2, 0, (i1 + k1) - 2, l1);
        if (obj == null)
        {
            obj = c(l1);
            i1 = Math.round(((float)l1 - ((Paint) (obj)).getTextSize()) / 2.0F);
            canvas.drawText("Loading Show Times...", i2, ((float)i1 + ((Paint) (obj)).getTextSize()) - ((Paint) (obj)).descent(), ((Paint) (obj)));
        } else
        {
            k1 = obj.length;
            i1 = 0;
            j1 = i2;
            while (i1 < k1) 
            {
                Object obj1 = obj[i1];
                Paint paint = a(((am) (obj1)).a, l1);
                int j2 = Math.round(((float)l1 - paint.getTextSize()) / 2.0F);
                canvas.save();
                canvas.translate(j1, ((float)j2 + paint.getTextSize()) - paint.descent());
                canvas.drawText(((am) (obj1)).b, 0.0F, 0.0F, paint);
                canvas.restore();
                j1 += ((am) (obj1)).c;
                i1++;
            }
        }
        canvas.restore();
    }

    public void a(aa aa1, long l1)
    {
        ab.a a1 = a(l1);
        if (a1 != null)
        {
            Object obj = (a)a1.a;
            a a2 = (a)a1.b;
            float f4 = a1.c;
            if (d(((a) (obj)).i))
            {
                float f1 = an.b(((a) (obj)).a, a2.a, ((a) (obj)).b, a2.b, f4);
                float f2 = an.b(((a) (obj)).c, a2.c, ((a) (obj)).d, a2.d, f4);
                float f3 = an.b(((a) (obj)).e, a2.e, ((a) (obj)).f, a2.f, f4);
                f4 = an.b(((a) (obj)).g, a2.g, ((a) (obj)).h, a2.h, f4);
                Canvas canvas = aa1.c();
                obj = com.tremorvideo.sdk.android.richmedia.b.a(f3, f4, c.c());
                aa1.a(f1 - ((PointF) (obj)).x, f2 - ((PointF) (obj)).y, f3, f4, k, c.c());
                f4 = aa1.h();
                f3 = aa1.i();
                float f5 = aa1.j();
                float f6 = aa1.k();
                f2 = f3;
                f1 = f4;
                if (c.a() != null)
                {
                    Object obj1 = c.a().b(aa1, l1);
                    f1 = ((l) (obj1)).a;
                    f2 = ((l) (obj1)).b;
                    obj1 = com.tremorvideo.sdk.android.richmedia.b.a(Math.round(((l) (obj1)).f), Math.round(((l) (obj1)).g), c.b());
                    f1 = f4 + f1 + (float)((Point) (obj1)).x;
                    f2 = f3 + f2 + (float)((Point) (obj1)).y;
                }
                aa1 = a(aa1, l1, new RectF(f1, f2, f5 + f1, f6 + f2));
                f1 = ((RectF) (aa1)).left;
                f2 = ((RectF) (aa1)).top;
                f3 = aa1.width();
                f4 = aa1.height();
                int i1 = Math.round(f4);
                int l2 = Math.round(f3);
                int i3 = Math.round(f4);
                int j1 = e(l2, i3);
                int k1 = f(l2, i3);
                int i2 = c(l2, i3);
                int j2 = d(l2, i3);
                int k2 = g(l2, i3);
                l2 = h(l2, i3);
                canvas.save();
                canvas.translate(Math.round(f1), Math.round(f2));
                c(canvas, j1, 0, k1, i1);
                a(canvas, k2, 0, l2, i1);
                d(canvas, i2, 0, j2, i1);
                canvas.restore();
            }
        }
    }

    public void a(e e1)
    {
        super.a(e1);
        h = true;
    }

    public void a(n n1, long l1)
    {
        if (g.f().m() != null && w != 0)
        {
            if (y > 0)
            {
                y = (int)Math.max(0L, (long)y - l1);
                if (y == 0)
                {
                    i();
                    y = 0;
                }
            }
            double d1 = s;
            x = x - (d1 * 0.20000000000000001D * (double)l1) / 1000D;
        }
    }

    public boolean a(int i1, int j1)
    {
        if (i1 >= u && i1 < u + v)
        {
            g.f().a().a(com.tremorvideo.sdk.android.videoad.ea.b.G);
        } else
        if (i1 >= q && i1 < q + r)
        {
            g.f().a().a(com.tremorvideo.sdk.android.videoad.ea.b.F);
            return true;
        }
        if (i1 >= t && i1 <= t + s)
        {
            am am1 = i(i1, s);
            if (am1 != null && am1.d != null && am1.d != "")
            {
                ct.d((new StringBuilder()).append("TMS URL: ").append(am1.d).toString());
                eb eb1 = g.f().a();
                eb1.a(com.tremorvideo.sdk.android.videoad.ea.b.I);
                eb1.a(am1.d);
            }
        }
        return false;
    }

    protected Paint b(int i1)
    {
        if (p != null)
        {
            return p;
        } else
        {
            p = new Paint();
            p.setTextSize((float)i1 * 0.4F);
            p.setColor(-1);
            p.setAntiAlias(true);
            return p;
        }
    }

    protected Paint b(int i1, int j1)
    {
        if (l != null)
        {
            return l;
        } else
        {
            int k1 = Color.argb(255, 54, 54, 54);
            int l1 = Color.argb(255, 35, 35, 35);
            int i2 = Color.argb(255, 35, 35, 35);
            float f1 = i1;
            float f2 = j1;
            Object obj = android.graphics.Shader.TileMode.CLAMP;
            obj = new LinearGradient(0.0F, f1, 0.0F, f2, new int[] {
                k1, l1, i2
            }, new float[] {
                0.0F, 0.75F, 1.0F
            }, ((android.graphics.Shader.TileMode) (obj)));
            l = new Paint();
            l.setDither(true);
            l.setShader(((android.graphics.Shader) (obj)));
            return l;
        }
    }

    protected void b(Canvas canvas, int i1, int j1, int k1, int l1)
    {
        Paint paint = j();
        Paint paint1 = b(j1, j1 + l1);
        canvas.drawRect(i1, j1, i1 + k1, j1 + l1, paint1);
        canvas.drawRect(i1, j1, (i1 + k1) - 1, (j1 + l1) - 1, paint);
    }

    protected int c(int i1, int j1)
    {
        if (q > 0)
        {
            return q;
        } else
        {
            q = e(i1, j1) + f(i1, j1) + 2;
            return q;
        }
    }

    protected Paint c(int i1)
    {
        if (m != null)
        {
            return m;
        } else
        {
            m = new Paint();
            m.setTextSize((float)i1 * 0.4F);
            m.setColor(-1);
            m.setAntiAlias(true);
            return m;
        }
    }

    public l c(aa aa1, long l1)
    {
        Object obj = a(l1);
        if (obj != null)
        {
            a a1 = (a)((ab.a) (obj)).a;
            a a2 = (a)((ab.a) (obj)).b;
            float f4 = ((ab.a) (obj)).c;
            float f1 = an.b(a1.a, a2.a, a1.b, a2.b, f4);
            float f2 = an.b(a1.c, a2.c, a1.d, a2.d, f4);
            float f3 = an.b(a1.e, a2.e, a1.f, a2.f, f4);
            f4 = an.b(a1.g, a2.g, a1.h, a2.h, f4);
            obj = com.tremorvideo.sdk.android.richmedia.b.a(f3, f4, c.c());
            aa1.a(f1 - ((PointF) (obj)).x, f2 - ((PointF) (obj)).y, f3, f4, k, c.c());
            f4 = aa1.h();
            f3 = aa1.i();
            float f5 = aa1.j();
            float f6 = aa1.k();
            f2 = f3;
            f1 = f4;
            if (c.a() != null)
            {
                Object obj1 = c.a().b(aa1, l1);
                f1 = ((l) (obj1)).a;
                f2 = ((l) (obj1)).b;
                obj1 = com.tremorvideo.sdk.android.richmedia.b.a(Math.round(((l) (obj1)).f), Math.round(((l) (obj1)).g), c.b());
                f1 = f4 + f1 + (float)((Point) (obj1)).x;
                f2 = f3 + f2 + (float)((Point) (obj1)).y;
            }
            aa1 = a(aa1, l1, new RectF(f1, f2, f5 + f1, f6 + f2));
            return new l(((RectF) (aa1)).left, ((RectF) (aa1)).top, ((RectF) (aa1)).right - ((RectF) (aa1)).left, ((RectF) (aa1)).bottom - ((RectF) (aa1)).top, 1.0F, 1.0F, 0.0F);
        } else
        {
            return l.h;
        }
    }

    protected void c(Canvas canvas, int i1, int j1, int k1, int l1)
    {
        int i2 = f(k1, l1);
        Paint paint = c(l1);
        String s1 = g.f().n();
        i2 = (i2 - Math.round(paint.measureText(s1))) / 2;
        int j2 = Math.round(((float)l1 - paint.getTextSize()) / 2.0F);
        b(canvas, i1, j1, k1, l1);
        canvas.drawText(s1, i2 + i1, ((float)(j2 + j1) + paint.getTextSize()) - paint.descent(), paint);
    }

    protected int d(int i1, int j1)
    {
        if (r > 0)
        {
            return r;
        } else
        {
            r = Math.round(c(j1).measureText("0000-00-00") + 20F);
            return r;
        }
    }

    protected Paint d(int i1)
    {
        if (o != null)
        {
            return o;
        } else
        {
            o = new Paint();
            o.setTextSize((float)i1 * 0.4F);
            o.setColor(-1);
            o.setAntiAlias(true);
            o.setFakeBoldText(true);
            return o;
        }
    }

    protected void d(Canvas canvas, int i1, int j1, int k1, int l1)
    {
        int i2 = d(k1, l1);
        Paint paint = c(l1);
        Object obj = g.f().o();
        int j2 = ((GregorianCalendar) (obj)).get(1);
        int k2 = ((GregorianCalendar) (obj)).get(5);
        obj = String.format("%d-%02d-%02d", new Object[] {
            Integer.valueOf(j2), Integer.valueOf(((GregorianCalendar) (obj)).get(2) + 1), Integer.valueOf(k2)
        });
        i2 = (i2 - Math.round(paint.measureText(((String) (obj))))) / 2;
        j2 = Math.round(((float)(l1 + 0) - paint.getTextSize()) / 2.0F);
        b(canvas, i1, j1, k1, l1);
        canvas.drawText(((String) (obj)), i2 + (i1 + 0), ((float)(0 + j1 + j2) + paint.getTextSize()) - paint.descent(), paint);
    }

    protected int e(int i1)
    {
        if (g.f().m() == null)
        {
            return 0;
        }
        if (x <= (double)(-(w + i1)))
        {
            x = 0.0D;
        }
        return (int)x + i1;
    }

    protected int e(int i1, int j1)
    {
        return 0;
    }

    protected int f(int i1, int j1)
    {
        if (v > 0)
        {
            return v;
        } else
        {
            v = Math.round(c(j1).measureText("00000") + 20F);
            return v;
        }
    }

    protected int g(int i1, int j1)
    {
        if (t > 0)
        {
            return t;
        } else
        {
            t = c(i1, j1) + d(i1, j1) + 2;
            return t;
        }
    }

    protected int h(int i1, int j1)
    {
        if (s > 0)
        {
            return s;
        } else
        {
            j1 = g(i1, j1);
            s = Math.round(i1) - j1;
            return s;
        }
    }

    protected k h()
    {
        return k();
    }

    public void i()
    {
        super.i();
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        u = 0;
        v = 0;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        y = 250;
        am aam[] = g.f().m();
        if (aam != null)
        {
            int j1 = aam.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                aam[i1].c = 0;
            }

        }
    }

    protected Paint j()
    {
        if (n != null)
        {
            return n;
        } else
        {
            n = new Paint();
            n.setColor(Color.argb(255, 73, 73, 73));
            n.setStyle(android.graphics.Paint.Style.STROKE);
            return n;
        }
    }

    protected a k()
    {
        return new a();
    }
}
