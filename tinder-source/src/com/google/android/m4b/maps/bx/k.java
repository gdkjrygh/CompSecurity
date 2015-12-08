// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.g;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bo.z;

public final class k
{
    public static final class a
    {

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }

    static final class b
    {

        private final String a;
        private final a b;
        private final z c;
        private final float d;
        private final int e;
        private final int f;
        private final int g;

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof b)
                {
                    if (((b) (obj = (b)obj)).d != d || ((b) (obj)).e != e || ((b) (obj)).f != f || ((b) (obj)).g != g || ((b) (obj)).b != b || ((b) (obj)).c != c && (((b) (obj)).c == null || !((b) (obj)).c.equals(c)) || !((b) (obj)).a.equals(a))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int i1 = (a.hashCode() + 31) * 31 + b.hashCode();
            int l = i1;
            if (c != null)
            {
                l = i1 * 31 + c.hashCode();
            }
            return (((l * 31 + Float.floatToIntBits(d)) * 31 + e) * 31 + f) * 31 + g;
        }

        public b(String s, a a1, z z1, float f1, int l, int i1, int j1)
        {
            a = s;
            b = a1;
            c = z1;
            d = f1;
            e = l;
            f = i1;
            g = j1;
        }
    }


    public static final a d = new a((byte)0);
    public static final a e = new a((byte)0);
    public static final a f = new a((byte)0);
    private static z g = null;
    public final Paint a = new Paint();
    public com.google.android.m4b.maps.bm.j.a b;
    public final float c;
    private final Paint h = new Paint();
    private final Path i = new Path();

    public k(float f1)
    {
        a.setAntiAlias(true);
        a.setStyle(android.graphics.Paint.Style.FILL);
        h.setAntiAlias(true);
        h.setStyle(android.graphics.Paint.Style.STROKE);
        b = new com.google.android.m4b.maps.bm.j.a(64);
        c = 2.1F * f1;
    }

    public final j a(d d1, String s, a a1, z z1, float f1, int l, int i1, 
            int j1)
    {
        b b1 = new b(s, a1, z1, f1, l, i1, j1);
        j j3 = (j)b.c(b1);
        j j2 = j3;
        if (j3 == null)
        {
            float f2;
            int k1;
            int l1;
            int i2;
            int k2;
            boolean flag;
            if (i1 != 0 || j1 != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(a1, z1);
            f2 = (int)(1.5F * f1);
            a.setTextSize(f2);
            if (flag)
            {
                f1 = c;
            } else
            {
                f1 = 0.0F;
            }
            a1 = a(s, a1, z1, f2, flag, 1.0F);
            i2 = (int)Math.ceil(a1[0] * 1.016F) + 1;
            k2 = (int)Math.ceil(a1[1]);
            k1 = j.a(i2, 8);
            l1 = j.a(k2, 8);
            if (k1 > d1.o || l1 > d1.o)
            {
                k1 = d1.o;
                l1 = d1.o;
            }
            if (l == 0xff000000 || l == -1)
            {
                a1 = android.graphics.Bitmap.Config.ARGB_4444;
            } else
            {
                a1 = android.graphics.Bitmap.Config.ARGB_8888;
            }
            a1 = d1.c.a(k1, l1, a1);
            a1.eraseColor(j1);
            z1 = new Canvas();
            z1.setBitmap(a1);
            j1 = (int)Math.ceil(-a.getFontMetrics().top + f1);
            h.setColor(i1);
            h.setStrokeWidth(2.0F * f1);
            a.setColor(l);
            if (i1 != 0 && f1 > 0.0F)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (l != 0)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            f1 = (int)(float)Math.ceil(f1);
            f2 = j1;
            a.getTextPath(s, 0, s.length(), f1, f2, i);
            if (i1 != 0)
            {
                z1.drawPath(i, h);
            }
            if (l != 0)
            {
                z1.drawPath(i, a);
            }
            j2 = new j(d1, (byte)0);
            j2.d = true;
            j2.a(a1, i2, k2);
            a1.recycle();
            b.b(b1, j2);
        }
        j2.b();
        return j2;
    }

    public final j a(String s, a a1, z z1, float f1, int l, int i1, int j1)
    {
        s = new b(s, a1, z1, f1, l, i1, j1);
        s = (j)b.c(s);
        if (s != null)
        {
            s.b();
        }
        return s;
    }

    public final void a(a a1, z z1)
    {
        int i1 = 1;
        int l = 0;
        if (a1 == f)
        {
            l = 1;
        }
        if (z1 != null)
        {
            if (com.google.android.m4b.maps.bo.d.a(1, z1.e))
            {
                l = i1;
            }
            i1 = l;
            if (com.google.android.m4b.maps.bo.d.a(2, z1.e))
            {
                i1 = l | 2;
            }
        } else
        {
            i1 = l;
        }
        a1 = Typeface.defaultFromStyle(i1);
        a.setTypeface(a1);
    }

    public final float[] a(String s, a a1, z z1, float f1, boolean flag, float f2)
    {
        a(a1, z1);
        a.setTextSize(f1);
        float f6 = a.measureText(s);
        s = a.getFontMetrics();
        float f7 = (float)Math.ceil(((android.graphics.Paint.FontMetrics) (s)).descent - ((android.graphics.Paint.FontMetrics) (s)).ascent);
        float f5 = ((android.graphics.Paint.FontMetrics) (s)).ascent - ((android.graphics.Paint.FontMetrics) (s)).top;
        float f4 = ((android.graphics.Paint.FontMetrics) (s)).bottom - ((android.graphics.Paint.FontMetrics) (s)).descent;
        float f8 = (f2 - 1.0F) * f7;
        float f3 = f5;
        f2 = f4;
        f1 = f6;
        if (flag)
        {
            f3 = f5;
            f2 = f4;
            f1 = f6;
            if (f6 > 0.0F)
            {
                f1 = f6 + c * 2.0F;
                f3 = f5 + c;
                f2 = f4 + c;
            }
        }
        return (new float[] {
            f1, f7 + (f3 + f2), f3 - f8 / 2.0F, f2 - f8 / 2.0F
        });
    }

}
