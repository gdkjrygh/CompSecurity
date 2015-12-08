// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.v4.text.e;
import android.support.v4.view.x;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.design.widget:
//            a

final class d
{

    private static final boolean a;
    private static final Paint b = null;
    private float A;
    private float B;
    private float C;
    private float D;
    private boolean E;
    private final TextPaint F = new TextPaint();
    private Interpolator G;
    private Interpolator H;
    private final View c;
    private boolean d;
    private float e;
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final RectF h = new RectF();
    private int i;
    private int j;
    private float k;
    private float l;
    private int m;
    private int n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private CharSequence u;
    private CharSequence v;
    private boolean w;
    private boolean x;
    private Bitmap y;
    private Paint z;

    public d(View view)
    {
        i = 16;
        j = 16;
        k = 15F;
        l = 15F;
        c = view;
        F.setAntiAlias(true);
    }

    private static float a(float f1, float f2, float f3, Interpolator interpolator)
    {
        float f4 = f3;
        if (interpolator != null)
        {
            f4 = interpolator.getInterpolation(f3);
        }
        return android.support.design.widget.a.a(f1, f2, f4);
    }

    private static boolean a(float f1, float f2)
    {
        return Math.abs(f1 - f2) < 0.001F;
    }

    private static boolean a(Rect rect, int i1, int j1, int k1, int l1)
    {
        return rect.left == i1 && rect.top == j1 && rect.right == k1 && rect.bottom == l1;
    }

    private void g()
    {
        boolean flag;
        if (g.width() > 0 && g.height() > 0 && f.width() > 0 && f.height() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    private void h()
    {
        float f3;
        float f4;
        boolean flag;
        flag = true;
        f3 = e;
        h.left = a(f.left, g.left, f3, G);
        h.top = a(o, p, f3, G);
        h.right = a(f.right, g.right, f3, G);
        h.bottom = a(f.bottom, g.bottom, f3, G);
        s = a(q, r, f3, G);
        t = a(o, p, f3, G);
        f4 = a(k, l, f3, H);
        if (u == null) goto _L2; else goto _L1
_L1:
        float f1;
        float f2;
        int i1;
        if (a(f4, l))
        {
            f2 = g.width();
            f1 = l;
            C = 1.0F;
        } else
        {
            f2 = f.width();
            f1 = k;
            if (a(f4, k))
            {
                C = 1.0F;
            } else
            {
                C = f4 / k;
            }
        }
        int k1;
        if (f2 > 0.0F)
        {
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            CharSequence charsequence;
            CharSequence charsequence1;
            int j1;
            if (D != f1 || E)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            D = f1;
            E = false;
        } else
        {
            i1 = 0;
        }
        if (v == null || i1 != 0)
        {
            F.setTextSize(D);
            charsequence = TextUtils.ellipsize(u, F, f2, android.text.TextUtils.TruncateAt.END);
            if (v == null || !v.equals(charsequence))
            {
                v = charsequence;
            }
            charsequence1 = v;
            Object obj;
            if (android.support.v4.view.x.h(c) == 1)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                obj = e.d;
            } else
            {
                obj = e.c;
            }
            w = ((android.support.v4.text.d) (obj)).a(charsequence1, charsequence1.length());
        }
        if (!a || C == 1.0F)
        {
            flag = false;
        }
        x = flag;
        if (x && y == null && !f.isEmpty() && !TextUtils.isEmpty(v)) goto _L4; else goto _L3
_L3:
        android.support.v4.view.x.d(c);
_L2:
        if (n != m)
        {
            obj = F;
            i1 = m;
            j1 = n;
            f1 = 1.0F - f3;
            f2 = Color.alpha(i1);
            f4 = Color.alpha(j1);
            f5 = Color.red(i1);
            f6 = Color.red(j1);
            f7 = Color.green(i1);
            f8 = Color.green(j1);
            f9 = Color.blue(i1);
            f10 = Color.blue(j1);
            ((TextPaint) (obj)).setColor(Color.argb((int)(f2 * f1 + f4 * f3), (int)(f5 * f1 + f6 * f3), (int)(f7 * f1 + f8 * f3), (int)(f9 * f1 + f10 * f3)));
        } else
        {
            F.setColor(n);
        }
        android.support.v4.view.x.d(c);
        return;
_L4:
        F.setTextSize(k);
        F.setColor(m);
        A = F.ascent();
        B = F.descent();
        i1 = Math.round(F.measureText(v, 0, v.length()));
        k1 = Math.round(B - A);
        if (i1 > 0 || k1 > 0)
        {
            y = Bitmap.createBitmap(i1, k1, android.graphics.Bitmap.Config.ARGB_8888);
            (new Canvas(y)).drawText(v, 0, v.length(), 0.0F, (float)k1 - F.descent(), F);
            if (z == null)
            {
                z = new Paint(3);
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void i()
    {
        if (y != null)
        {
            y.recycle();
            y = null;
        }
    }

    final Typeface a()
    {
        return F.getTypeface();
    }

    final void a(float f1)
    {
        if (k != f1)
        {
            k = f1;
            d();
        }
    }

    final void a(int i1)
    {
        if (n != i1)
        {
            n = i1;
            d();
        }
    }

    final void a(int i1, int j1, int k1, int l1)
    {
        if (!a(f, i1, j1, k1, l1))
        {
            f.set(i1, j1, k1, l1);
            E = true;
            g();
        }
    }

    public final void a(Canvas canvas)
    {
        int i1 = canvas.save();
        if (v != null && d)
        {
            float f4 = s;
            float f3 = t;
            float f1;
            float f2;
            boolean flag;
            if (x && y != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            F.setTextSize(D);
            if (flag)
            {
                f1 = A * C;
            } else
            {
                F.ascent();
                f1 = 0.0F;
                F.descent();
            }
            f2 = f3;
            if (flag)
            {
                f2 = f3 + f1;
            }
            if (C != 1.0F)
            {
                canvas.scale(C, C, f4, f2);
            }
            if (flag)
            {
                canvas.drawBitmap(y, f4, f2, z);
            } else
            {
                canvas.drawText(v, 0, v.length(), f4, f2, F);
            }
        }
        canvas.restoreToCount(i1);
    }

    final void a(Typeface typeface)
    {
        Typeface typeface1 = typeface;
        if (typeface == null)
        {
            typeface1 = Typeface.DEFAULT;
        }
        if (F.getTypeface() != typeface1)
        {
            F.setTypeface(typeface1);
            d();
        }
    }

    final void a(Interpolator interpolator)
    {
        H = interpolator;
        d();
    }

    final void a(CharSequence charsequence)
    {
        if (charsequence == null || !charsequence.equals(u))
        {
            u = charsequence;
            v = null;
            i();
            d();
        }
    }

    final float b()
    {
        return e;
    }

    final void b(float f1)
    {
        if (f1 >= 0.0F) goto _L2; else goto _L1
_L1:
        float f2 = 0.0F;
_L4:
        if (f2 != e)
        {
            e = f2;
            h();
        }
        return;
_L2:
        f2 = f1;
        if (f1 > 1.0F)
        {
            f2 = 1.0F;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void b(int i1)
    {
        if (m != i1)
        {
            m = i1;
            d();
        }
    }

    final void b(int i1, int j1, int k1, int l1)
    {
        if (!a(g, i1, j1, k1, l1))
        {
            g.set(i1, j1, k1, l1);
            E = true;
            g();
        }
    }

    final void b(Interpolator interpolator)
    {
        G = interpolator;
        d();
    }

    final float c()
    {
        return l;
    }

    final void c(int i1)
    {
        if (i != i1)
        {
            i = i1;
            d();
        }
    }

    public final void d()
    {
        float f2;
        boolean flag;
        flag = true;
        f2 = 0.0F;
        if (c.getHeight() <= 0 || c.getWidth() <= 0) goto _L2; else goto _L1
_L1:
        float f1;
        int i1;
        F.setTextSize(l);
        int j1;
        if (v != null)
        {
            f1 = F.measureText(v, 0, v.length());
        } else
        {
            f1 = 0.0F;
        }
        j1 = j;
        if (w)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        i1 = android.support.v4.view.e.a(j1, i1);
        i1 & 0x70;
        JVM INSTR lookupswitch 2: default 116
    //                   48: 406
    //                   80: 391;
           goto _L3 _L4 _L5
_L3:
        p = ((F.descent() - F.ascent()) / 2.0F - F.descent()) + (float)g.centerY();
_L15:
        i1 & 7;
        JVM INSTR lookupswitch 2: default 184
    //                   1: 429
    //                   5: 448;
           goto _L6 _L7 _L8
_L6:
        r = g.left;
_L16:
        F.setTextSize(k);
        f1 = f2;
        if (v != null)
        {
            f1 = F.measureText(v, 0, v.length());
        }
        j1 = i;
        if (w)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        i1 = android.support.v4.view.e.a(j1, i1);
        i1 & 0x70;
        JVM INSTR lookupswitch 2: default 292
    //                   48: 485
    //                   80: 470;
           goto _L9 _L10 _L11
_L9:
        o = ((F.descent() - F.ascent()) / 2.0F - F.descent()) + (float)f.centerY();
_L17:
        i1 & 7;
        JVM INSTR lookupswitch 2: default 360
    //                   1: 508
    //                   5: 527;
           goto _L12 _L13 _L14
_L12:
        q = f.left;
_L18:
        i();
        h();
_L2:
        return;
_L5:
        p = g.bottom;
          goto _L15
_L4:
        p = (float)g.top - F.ascent();
          goto _L15
_L7:
        r = (float)g.centerX() - f1 / 2.0F;
          goto _L16
_L8:
        r = (float)g.right - f1;
          goto _L16
_L11:
        o = f.bottom;
          goto _L17
_L10:
        o = (float)f.top - F.ascent();
          goto _L17
_L13:
        q = (float)f.centerX() - f1 / 2.0F;
          goto _L18
_L14:
        q = (float)f.right - f1;
          goto _L18
    }

    final void d(int i1)
    {
        if (j != i1)
        {
            j = i1;
            d();
        }
    }

    final CharSequence e()
    {
        return u;
    }

    final void e(int i1)
    {
        TypedArray typedarray = c.getContext().obtainStyledAttributes(i1, android.support.design.a.i.TextAppearance);
        if (typedarray.hasValue(android.support.design.a.i.TextAppearance_android_textColor))
        {
            n = typedarray.getColor(android.support.design.a.i.TextAppearance_android_textColor, n);
        }
        if (typedarray.hasValue(android.support.design.a.i.TextAppearance_android_textSize))
        {
            l = typedarray.getDimensionPixelSize(android.support.design.a.i.TextAppearance_android_textSize, (int)l);
        }
        typedarray.recycle();
        d();
    }

    final int f()
    {
        return n;
    }

    final void f(int i1)
    {
        TypedArray typedarray = c.getContext().obtainStyledAttributes(i1, android.support.design.a.i.TextAppearance);
        if (typedarray.hasValue(android.support.design.a.i.TextAppearance_android_textColor))
        {
            m = typedarray.getColor(android.support.design.a.i.TextAppearance_android_textColor, m);
        }
        if (typedarray.hasValue(android.support.design.a.i.TextAppearance_android_textSize))
        {
            k = typedarray.getDimensionPixelSize(android.support.design.a.i.TextAppearance_android_textSize, (int)k);
        }
        typedarray.recycle();
        d();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
