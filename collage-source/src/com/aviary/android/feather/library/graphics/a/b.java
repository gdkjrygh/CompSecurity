// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.graphics.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.aviary.android.feather.common.a.a;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.library.graphics.a:
//            c, d

public class b extends Drawable
    implements c, d
{

    static final boolean d;
    protected float A;
    android.graphics.Paint.FontMetrics B;
    final Rect C;
    final RectF D;
    private c.a a;
    protected final Paint e;
    protected final Paint f;
    protected final Paint g;
    protected final Paint h;
    protected int i;
    protected int j;
    protected String k;
    protected String l;
    protected final RectF m;
    protected boolean n;
    protected long o;
    protected boolean p;
    protected final List q;
    protected boolean r;
    protected float s;
    protected float t;
    protected boolean u;
    protected float v;
    protected float w;
    protected float x;
    protected float y;
    protected float z;

    public b(String s1, float f1)
    {
        this(s1, f1, null);
    }

    public b(String s1, float f1, Typeface typeface)
    {
        l = "";
        m = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
        n = false;
        o = 0L;
        p = false;
        q = new ArrayList();
        r = false;
        s = 2.0F;
        t = 1.0F;
        u = true;
        A = 14F;
        B = new android.graphics.Paint.FontMetrics();
        C = new Rect();
        D = new RectF();
        e = new Paint(451);
        v = f1;
        if (A > v)
        {
            A = v - 1.0F;
        }
        e.setDither(true);
        e.setStyle(android.graphics.Paint.Style.FILL);
        e.setTextSize(f1);
        if (typeface != null)
        {
            if (d)
            {
                Log.i("text-drawable", (new StringBuilder()).append("typeface: ").append(typeface).toString());
            }
            e.setTypeface(typeface);
        }
        f = new Paint(e);
        g = new Paint(e);
        g.setStyle(android.graphics.Paint.Style.STROKE);
        g.setStrokeWidth(f1 / 10F);
        h = null;
        c(-1);
        b(0xff000000);
        a(s1);
        s();
    }

    protected float a(int i1, int j1)
    {
        float af[] = new float[j1 - i1];
        if (d)
        {
            Log.d("text-drawable", (new StringBuilder()).append("getTextWidth: ").append(l.substring(i1, j1)).toString());
        }
        e.getTextWidths(l, i1, j1, af);
        return a(af);
    }

    public float a(android.graphics.Paint.FontMetrics fontmetrics)
    {
        return e.getFontMetrics(fontmetrics);
    }

    protected float a(float af[])
    {
        float f1 = 0.0F;
        int j1 = af.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 += af[i1];
        }

        return f1;
    }

    protected void a()
    {
        if (d)
        {
            Log.i("text-drawable", "onTextInvalidate");
        }
        int i1;
        if (e())
        {
            e.setAlpha(i / 2);
            g.setAlpha(j / 2);
        } else
        {
            e.setAlpha(i);
            g.setAlpha(j);
        }
        q.clear();
        i1 = 0;
        do
        {
            int j1 = l.indexOf('\n', i1);
            if (j1 <= -1)
            {
                break;
            }
            i1 = j1 + 1;
            q.add(Integer.valueOf(j1));
        } while (true);
        q.add(Integer.valueOf(l.length()));
        l();
        if (a != null)
        {
            c.a a1 = a;
            float f1 = m.left;
            float f2 = m.top;
            float f3 = m.left;
            float f4 = getIntrinsicWidth();
            float f5 = m.top;
            a1.a(this, f1, f2, f4 + f3, (float)getIntrinsicHeight() + f5);
        }
    }

    public void a(float f1)
    {
        if (f1 / (float)b() != e.getTextSize())
        {
            if (d)
            {
                Log.i("text-drawable", (new StringBuilder()).append("setTextSize: ").append(f1).toString());
            }
            int i1 = b();
            e.setTextSize(f1 / (float)i1);
            f.setTextSize(f1 / (float)i1);
            g.setTextSize(f1 / (float)i1);
            g.setStrokeWidth(f1 / (float)i1 / 10F);
            l();
            s();
        }
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        if (f1 != m.left || f2 != m.top || f3 != m.right || f4 != m.bottom)
        {
            if (d)
            {
                Log.i("text-drawable", (new StringBuilder()).append("setBounds: ").append(f1).append(", ").append(f2).append(", ").append(f3).append(", ").append(f4).toString());
            }
            m.set(f1, f2, f3, f4);
            a(f4 - f2);
        }
    }

    public void a(int i1)
    {
        s = i1;
    }

    protected void a(int i1, Rect rect)
    {
        if (l.length() > 0)
        {
            if (b() == 1)
            {
                e.getTextBounds(l, 0, l.length(), rect);
                rect.left = 0;
                return;
            } else
            {
                e.getTextBounds(l, ((Integer)q.get(i1 - 1)).intValue() + 1, ((Integer)q.get(i1)).intValue(), rect);
                rect.left = 0;
                rect.right = (int)a(((Integer)q.get(i1 - 1)).intValue() + 1, ((Integer)q.get(i1)).intValue());
                return;
            }
        } else
        {
            e.getTextBounds(l, 0, l.length(), rect);
            rect.left = 0;
            rect.right = 0;
            return;
        }
    }

    public void a(c.a a1)
    {
        a = a1;
    }

    public void a(CharSequence charsequence)
    {
        b((String)charsequence);
    }

    public void a(String s1)
    {
        if (d)
        {
            Log.i("text-drawable", (new StringBuilder()).append("setText: ").append(s1).toString());
        }
        l = s1;
        r = false;
        a();
    }

    public void a(boolean flag)
    {
        u = flag;
    }

    public boolean a(RectF rectf)
    {
        if (d)
        {
            Log.i("text-drawable", (new StringBuilder()).append("validateSize: ").append(rectf.width()).append("x").append(rectf.height()).append(" == ").append(z).toString());
        }
        return rectf.height() >= z;
    }

    public int b()
    {
        return Math.max(q.size(), 1);
    }

    public void b(float f1)
    {
        if (d)
        {
            Log.i("text-drawable", (new StringBuilder()).append("setMinTextSize: ").append(f1).toString());
        }
        A = f1;
    }

    public void b(float f1, float f2)
    {
    }

    public void b(int i1)
    {
        g.setColor(i1);
        j = g.getAlpha();
    }

    protected void b(RectF rectf)
    {
        rectf.set(m);
    }

    public void b(CharSequence charsequence)
    {
        a((String)charsequence);
    }

    public void b(String s1)
    {
        String s2;
        boolean flag;
        if (s1 == null)
        {
            s2 = "";
        } else
        {
            s2 = s1;
        }
        l = s2;
        if (s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r = flag;
        s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        k = s2;
        a();
    }

    public float c()
    {
        return v;
    }

    public void c(int i1)
    {
        e.setColor(i1);
        f.setColor(i1);
        i = e.getAlpha();
    }

    public boolean d()
    {
        return u;
    }

    public void draw(Canvas canvas)
    {
        b(D);
        if (h != null)
        {
            canvas.drawRect(D, h);
        }
        int k1 = b();
        a(B);
        float f3 = B.descent;
        float f4 = B.leading;
        float f5 = B.bottom;
        float f6 = B.descent;
        float f7 = B.ascent - (B.top - B.ascent);
        float f1 = D.top;
        float f8 = D.left;
        int j1 = 0;
        int i1 = 0;
        while (i1 < k1) 
        {
            float f9 = f1 - f7;
            int l1 = ((Integer)q.get(i1)).intValue();
            String s1 = l.substring(j1, l1);
            if (!e() && u)
            {
                canvas.drawText(s1, f8, f9, g);
            }
            canvas.drawText(s1, f8, f9, e);
            if (n && i1 == k1 - 1)
            {
                long l2 = System.currentTimeMillis();
                if (l2 - o > 400L)
                {
                    float f10;
                    float f11;
                    float f12;
                    float f13;
                    float f14;
                    float f15;
                    float f16;
                    boolean flag;
                    if (!p)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    p = flag;
                    o = l2;
                }
                if (p)
                {
                    a(k1 - 1, C);
                    f10 = D.left;
                    f11 = C.right;
                    f12 = t;
                    float f2;
                    if (e() || !u)
                    {
                        f1 = 0.0F;
                    } else
                    {
                        f1 = g.getStrokeWidth() / 2.0F;
                    }
                    f13 = D.left;
                    f14 = C.right;
                    f15 = s;
                    f16 = t;
                    if (e() || !u)
                    {
                        f2 = 0.0F;
                    } else
                    {
                        f2 = g.getStrokeWidth() / 2.0F;
                    }
                    canvas.drawRect(f12 + (f10 + f11) + f1, f9 + f7, f16 + (f13 + f14 + f15) + f2, f9 + B.descent, f);
                }
            }
            j1 = l1 + 1;
            i1++;
            f1 = f9 + ((f3 + f4) - (f5 - f6));
        }
    }

    public boolean e()
    {
        return r;
    }

    public float f()
    {
        return 3.402823E+38F;
    }

    public float g()
    {
        if (d)
        {
            Log.i("text-drawable", "getMinHeight");
        }
        return z;
    }

    public int getIntrinsicHeight()
    {
        return (int)j();
    }

    public int getIntrinsicWidth()
    {
        return (int)k();
    }

    public int getOpacity()
    {
        return e.getAlpha();
    }

    public void h()
    {
        n = true;
    }

    public void i()
    {
        n = false;
        if ((m() == null || m().length() < 1) && k != null)
        {
            b(k);
        }
    }

    public float j()
    {
        if (w < 0.0F)
        {
            w = u();
        }
        if (d)
        {
            Log.i("text-drawable", (new StringBuilder()).append("getIntrinsicHeight: ").append(w).toString());
        }
        return w;
    }

    public float k()
    {
        if (x < 0.0F)
        {
            x = Math.max(y, v());
        }
        if (d)
        {
            Log.i("text-drawable", (new StringBuilder()).append("getIntrinsicWidth: ").append(x).toString());
        }
        return x;
    }

    protected void l()
    {
        w = -1F;
        x = -1F;
    }

    public CharSequence m()
    {
        return l;
    }

    public int n()
    {
        return e.getColor();
    }

    public int o()
    {
        return g.getColor();
    }

    public float p()
    {
        return e.getTextSize();
    }

    public boolean q()
    {
        return n;
    }

    public float r()
    {
        return A;
    }

    protected void s()
    {
        y = t();
        z = r() * (float)b();
        if (d)
        {
            Log.i("text-drawable", (new StringBuilder()).append("computeMinSize, minHeight: ").append(z).toString());
        }
    }

    public void setAlpha(int i1)
    {
        e.setAlpha(i1);
    }

    public void setBounds(int i1, int j1, int k1, int l1)
    {
        super.setBounds(i1, j1, k1, l1);
        a(i1, j1, k1, l1);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        e.setColorFilter(colorfilter);
        g.setColorFilter(colorfilter);
        f.setColorFilter(colorfilter);
    }

    protected float t()
    {
        float af[] = new float[1];
        e.getTextWidths(" ", af);
        return af[0] / 2.0F;
    }

    protected float u()
    {
        float f1 = p();
        if (d)
        {
            Log.i("text-drawable", (new StringBuilder()).append("computeTextHeight. single line height: ").append(f1).toString());
        }
        if (l.length() < 1)
        {
            return (float)(int)f1;
        } else
        {
            return Math.max(f1, (float)b() * f1);
        }
    }

    protected float v()
    {
        if (l.length() <= 0) goto _L2; else goto _L1
_L1:
        if (b() != 1) goto _L4; else goto _L3
_L3:
        float f1 = a(0, l.length()) + s + t;
_L6:
        f1 = Math.max(f1, y);
        if (d)
        {
            Log.d("text-drawable", (new StringBuilder()).append("\tresult: ").append(f1).toString());
        }
        return f1;
_L4:
        int j1 = 0;
        float f2 = 0.0F;
        int i1 = 0;
        do
        {
            f1 = f2;
            if (i1 >= q.size())
            {
                continue; /* Loop/switch isn't completed */
            }
            int k1 = ((Integer)q.get(i1)).intValue();
            f2 = Math.max(f2, a(j1, k1) + s + t);
            j1 = k1 + 1;
            i1++;
        } while (true);
_L2:
        f1 = 0.0F;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        d = a.a;
    }
}
