// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.graphics.Path;
import android.graphics.RectF;

public final class c extends Path
{

    private int a;
    private float b;
    private float c[];
    private float d[];
    private RectF e;

    public c()
    {
        this(1.0F);
    }

    public c(float f1)
    {
        a = 0;
        b = 1.0F;
        c = new float[200];
        d = new float[200];
        e = new RectF(-1F, -1F, -1F, -1F);
        b = f1;
    }

    public static boolean a(float f1, float f2, float f3, float f4)
    {
        f1 = Math.abs(f3 - f1);
        f2 = Math.abs(f4 - f2);
        return f1 < 50F && f2 < 50F;
    }

    public static boolean a(RectF rectf)
    {
        return rectf == null || rectf.width() < 5F && rectf.height() < 5F;
    }

    public final float a()
    {
        return b;
    }

    public final void a(float f1)
    {
        b = f1;
    }

    public final void a(float f1, float f2, boolean flag)
    {
label0:
        {
label1:
            {
                if (a == 5000)
                {
                    break label1;
                }
                if (a == 0)
                {
                    break label0;
                }
                float f3 = c[a - 1];
                f3 = b * f3;
                float f4 = d[a - 1];
                f4 = b * f4;
                float f5 = f1 * b;
                float f6 = f2 * b;
                if (flag)
                {
                    float f7 = Math.abs(f5 - f3);
                    float f8 = Math.abs(f6 - f4);
                    float af[];
                    boolean flag1;
                    if (f7 < 10F && f8 < 10F)
                    {
                        flag1 = false;
                    } else
                    {
                        flag1 = true;
                    }
                    if (!flag1)
                    {
                        break label1;
                    }
                }
                quadTo(f3, f4, (f5 + f3) / 2.0F, (f6 + f4) / 2.0F);
                if (c.length <= a || d.length <= a)
                {
                    af = new float[c.length + 200];
                    System.arraycopy(c, 0, af, 0, a);
                    c = af;
                    af = new float[d.length + 200];
                    System.arraycopy(d, 0, af, 0, a);
                    d = af;
                }
                if (e.left < 0.0F || f1 < e.left)
                {
                    e.left = f1;
                }
                if (f1 > e.right)
                {
                    e.right = f1;
                }
                if (e.top < 0.0F || f2 < e.top)
                {
                    e.top = f2;
                }
                if (f2 > e.bottom)
                {
                    e.bottom = f2;
                }
                c[a] = f1;
                d[a] = f2;
                a = a + 1;
            }
            return;
        }
        moveTo(f1, f2);
    }

    public final void a(float af[], float af1[])
    {
        if (af != null && af1 != null && af.length == af1.length && af.length > 0 && af.length <= 5000)
        {
            moveTo(af[0], af1[0]);
        }
        if (af == null || af1 == null || af.length != af1.length) goto _L2; else goto _L1
_L1:
        int j = 1;
_L6:
        if (j < af.length) goto _L4; else goto _L3
_L3:
        close();
_L2:
        return;
_L4:
        a(af[j], af1[j], false);
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean a(float f1, float f2)
    {
        while (a == 0 || Math.sqrt(Math.pow(f1 - c[a - 1], 2D) + Math.pow(f2 - d[a - 1], 2D)) * (double)b >= 50D) 
        {
            return false;
        }
        return true;
    }

    public final RectF b()
    {
        return e;
    }

    public final float c()
    {
        if (a >= 2 && c != null && d != null)
        {
            return (float)Math.toDegrees(Math.atan2(c[a - 1] - c[a - 2], -d[a - 1] + d[a - 2]));
        } else
        {
            return 0.0F;
        }
    }

    public final float[] d()
    {
        if (a != 0 && c != null && d != null)
        {
            return (new float[] {
                c[a - 1], d[a - 1]
            });
        } else
        {
            return null;
        }
    }

    public final float[] e()
    {
        if (a != 0 && c != null && d != null)
        {
            return (new float[] {
                c[0], d[0]
            });
        } else
        {
            return null;
        }
    }

    public final float[] f()
    {
        float af[] = new float[a];
        int j = 0;
        do
        {
            if (j >= a)
            {
                return af;
            }
            af[j] = c[j];
            j++;
        } while (true);
    }

    public final float[] g()
    {
        float af[] = new float[a];
        int j = 0;
        do
        {
            if (j >= a)
            {
                return af;
            }
            af[j] = d[j];
            j++;
        } while (true);
    }

    public final void h()
    {
        if (a != 0)
        {
            lineTo(c[a - 1] * b, d[a - 1] * b);
        }
    }

    public final int i()
    {
        return a;
    }

    public final void moveTo(float f1, float f2)
    {
        reset();
        super.moveTo(b * f1, b * f2);
        a = 0;
        c[a] = f1;
        d[a] = f2;
        a = a + 1;
    }

    public final void reset()
    {
        super.reset();
        RectF rectf = e;
        RectF rectf1 = e;
        RectF rectf2 = e;
        e.bottom = -1F;
        rectf2.top = -1F;
        rectf1.right = -1F;
        rectf.left = -1F;
        a = 0;
    }
}
