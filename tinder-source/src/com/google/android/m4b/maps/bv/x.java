// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.opengl.Visibility;
import android.os.SystemClock;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            p, d

final class x
{
    static interface a
    {

        public abstract int a(int i1);

        public abstract p a(int i1, int j1, float f1, float f2, int k1, float f3, float f4, 
                float f5, float f6, boolean flag);
    }


    final a a;
    final int b;
    final int c;
    private final int d;
    private int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private p n[];
    private final float o;
    private final float p;
    private final float q;
    private final float r;
    private float s[];
    private boolean t;

    public x(int i1, int j1, a a1, int k1, int l1, int i2, int j2, 
            int k2)
    {
        boolean flag = true;
        super();
        t = false;
        if (j1 < 0)
        {
            throw new IllegalArgumentException("zoomShift");
        }
        a = a1;
        d = i1;
        f = k1 >> j1;
        g = l1 >> j1;
        h = i2;
        i = j2;
        j = f / h;
        l = f - j * h;
        k = g / i;
        m = g - k * i;
        e = k2;
        j1 = j;
        if (l > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        b = i1 + j1;
        j1 = k;
        if (m > 0)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        c = j1 + i1;
        o = (float)h / (float)f;
        p = (float)l / (float)f;
        q = ((float)i / (float)g) * 1.0F;
        r = ((float)m / (float)g) * 1.0F;
    }

    private static int a(float f1, boolean flag, int i1)
    {
        if (!flag)
        {
            f1 /= 0.03125F;
        } else
        {
            f1 /= 0.015625F;
        }
        return Math.max((int)Math.ceil(f1 / (float)i1), 1);
    }

    public final int a()
    {
        return b * c * e;
    }

    public final int a(int i1, int j1, int k1)
    {
        if (i1 < 0 || i1 >= b)
        {
            throw new IllegalArgumentException("tileX");
        }
        if (j1 < 0 || j1 >= c)
        {
            throw new IllegalArgumentException("tileY");
        }
        if (k1 < 0 || k1 >= e)
        {
            throw new IllegalArgumentException("tileFace");
        } else
        {
            return b * j1 + i1 + b * k1 * c;
        }
    }

    public final p a(int i1, boolean flag)
    {
        a(flag);
        return n[i1];
    }

    public final float[] a(boolean flag)
    {
        if (s == null || flag != t)
        {
            long l4 = SystemClock.uptimeMillis();
            int i3 = a(o, flag, e);
            int j3 = a(p, flag, e);
            int k3 = a(q, flag, e);
            int l3 = a(r, flag, e);
            float f3 = (float)l / (float)h;
            float f4 = (float)m / (float)i;
            n = new p[a()];
            for (int i1 = 0; i1 < e; i1++)
            {
                float f1 = 0.0F;
                for (int l1 = 0; l1 < c; l1++)
                {
                    float f2 = 0.0F;
                    int j2 = 0;
                    while (j2 < b) 
                    {
                        p p1;
                        if (l1 < k)
                        {
                            if (j2 < j)
                            {
                                p1 = a.a(i3, k3, f2, f1, i1, o, q, 1.0F, 1.0F, flag);
                            } else
                            {
                                p1 = a.a(j3, k3, f2, f1, i1, p, q, f3, 1.0F, flag);
                            }
                        } else
                        if (j2 < j)
                        {
                            p1 = a.a(i3, l3, f2, f1, i1, o, r, 1.0F, f4, flag);
                        } else
                        {
                            p1 = a.a(j3, l3, f2, f1, i1, p, r, f3, f4, flag);
                        }
                        n[a(j2, l1, i1)] = p1;
                        f2 += o;
                        j2++;
                    }
                    f1 += q;
                }

            }

            int i2 = a();
            s = new float[i2 * 4];
            for (int j1 = 0; j1 < i2; j1++)
            {
                p p2 = n[j1];
                float af[] = s;
                float af1[] = p2.a;
                int k2 = p2.c;
                Visibility.computeBoundingSphere(af1, 0, p2.d * k2, af, j1 * 4);
            }

            long l5 = SystemClock.uptimeMillis();
            int k1 = b;
            i2 = c;
            int l2 = d;
            com.google.android.m4b.maps.bv.d.a((new StringBuilder(97)).append("LevelInfo.genGridsAndBoundingSpheres ").append(k1).append("*").append(i2).append("@").append(l2).append(": ").append(l5 - l4).append(" ms").toString());
            t = flag;
        }
        return s;
    }
}
