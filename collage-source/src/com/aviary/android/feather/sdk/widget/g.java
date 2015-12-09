// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.a.a;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.ArrayList;

public class g
{
    static class a
    {

        float a;
        float b;
        float c;

        public a(float f1, float f2, float f3)
        {
            a = f1;
            b = f2;
            c = f3;
        }
    }

    public static class b
    {

        private float a;
        private float b;
        private float c;
        private c d;

        static float a(b b1)
        {
            return b1.a;
        }

        static float b(b b1)
        {
            return b1.b;
        }

        static float c(b b1)
        {
            return b1.c;
        }

        public c a()
        {
            return d;
        }

        public void a(float f1)
        {
            a = f1;
        }

        public void a(c c1)
        {
            d = c1;
        }

        public float b()
        {
            return c;
        }

        public void b(float f1)
        {
            c = f1;
        }

        public b()
        {
            a = 50F;
            b = 200F;
            c = 0.0F;
            d = com.aviary.android.feather.sdk.widget.c.a;
        }
    }

    static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        private static final c c[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/aviary/android/feather/sdk/widget/g$c, s);
        }

        public static c[] values()
        {
            return (c[])c.clone();
        }

        static 
        {
            a = new c("Circle", 0);
            b = new c("Line", 1);
            c = (new c[] {
                a, b
            });
        }

        private c(String s, int k)
        {
            super(s, k);
        }
    }


    public b a;
    private ArrayList b;
    private ArrayList c;
    private Drawable d;
    private float e;
    private float f;
    private float g;
    private Paint h;
    private float i;
    private float j;

    public g(Drawable drawable)
    {
        b = new ArrayList();
        c = new ArrayList();
        f = 0.0F;
        i = 1.0F;
        a = new b();
        h = new Paint();
        h.setFilterBitmap(true);
        h.setColor(Color.rgb(255, 255, 255));
        h.setAntiAlias(true);
        h.setDither(true);
        d = drawable;
        if (d != null)
        {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    private float a(float f1, float f2, float f3)
    {
        return (f2 - f1) * f3 + f1;
    }

    private static float b(float f1, float f2)
    {
        return android.a.a.a(f1 * f1 + f2 * f2);
    }

    private static float c(float f1, float f2)
    {
        if (f1 > f2)
        {
            return f1;
        } else
        {
            return f2;
        }
    }

    public int a(a a1, boolean flag)
    {
        float f1;
        f1 = b(a1.a, a1.b);
        if (!flag)
        {
            f1 = a1.c;
        }
        f1 -= com.aviary.android.feather.sdk.widget.b.a(a);
        if (f1 <= 0.0F) goto _L2; else goto _L1
_L1:
        if (f1 >= b.b(a) * 0.5F) goto _L4; else goto _L3
_L3:
        f1 = android.a.a.b((f1 * 0.7853982F) / (b.b(a) * 0.5F));
        float f2 = b.c(a);
        f1 = c(0.0F, (float)Math.pow(f1, 20D)) * f2;
_L6:
        return (int)(f1 * 255F);
_L2:
        if (f1 > -(b.b(a) * 0.5F))
        {
            f1 = android.a.a.b((f1 * 0.7853982F) / (b.b(a) * 0.5F));
            float f3 = b.c(a);
            f1 = c(0.0F, (float)Math.pow(f1, 20D)) * f3;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        f1 = 0.0F;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(float f1)
    {
        f = f1;
    }

    public void a(float f1, float f2)
    {
        e = f1;
        g = f2;
    }

    public void a(float f1, float f2, RectF rectf)
    {
        if (f1 == 0.0F)
        {
            Log.w("PointCloud", "Must specify an inner radius");
        } else
        {
            j = f2;
            b.clear();
            f2 -= f1;
            float f5 = (6.283185F * f1) / 8F;
            int j1 = Math.round(f2 / f5);
            float f6 = f2 / (float)j1;
            int k = 0;
            for (f2 = f1; k <= j1; f2 += f6)
            {
                int k1 = (int)((6.283185F * f2) / f5);
                float f3 = 1.570796F;
                float f7 = 6.283185F / (float)k1;
                for (int l = 0; l < k1; l++)
                {
                    float f8 = android.a.a.b(f3);
                    float f9 = android.a.a.c(f3);
                    f3 += f7;
                    b.add(new a(f8 * f2, f9 * f2, f2));
                }

                k++;
            }

            c.clear();
            f2 = Math.max(rectf.width(), rectf.height());
            k = 0;
            while (k <= j1) 
            {
                int l1 = (int)(f2 / ((a(4F, 2.0F, f1 / j) / 2.0F) * f5));
                for (int i1 = 0; i1 <= l1; i1++)
                {
                    float f4 = -f2 / 2.0F + (f2 / (float)l1) * (float)i1;
                    c.add(new a(f1, f4, f1));
                    c.add(new a(-f1, f4, f1));
                }

                f1 += f6;
                k++;
            }
        }
    }

    public void a(Canvas canvas)
    {
        if (a.b() <= 0.0F)
        {
            return;
        }
        c c1 = a.a();
        int i1 = canvas.save(1);
        canvas.scale(i, i, e, g);
        if (c1 == c.b)
        {
            canvas.rotate(f, e, g);
            ArrayList arraylist = c;
            int k = 0;
            while (k < arraylist.size()) 
            {
                a a1 = (a)arraylist.get(k);
                float f1 = a(4F, 2.0F, a1.c / j);
                float f3 = a1.a;
                f3 = e + f3;
                float f5 = a1.b;
                f5 = g + f5;
                int j1;
                boolean flag;
                if (c1 == com.aviary.android.feather.sdk.widget.c.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j1 = a(a1, flag);
                if (j1 != 0)
                {
                    if (d != null)
                    {
                        int l1 = canvas.save(1);
                        float f7 = d.getIntrinsicWidth();
                        float f9 = d.getIntrinsicHeight();
                        f1 /= 4F;
                        canvas.scale(f1, f1, f3, f5);
                        canvas.translate(f3 - f7 * 0.5F, f5 - f9 * 0.5F);
                        d.setAlpha(j1);
                        d.draw(canvas);
                        canvas.restoreToCount(l1);
                    } else
                    {
                        h.setAlpha(j1);
                        canvas.drawCircle(f3, f5, f1, h);
                    }
                }
                k++;
            }
        } else
        {
            ArrayList arraylist1 = b;
            int l = 0;
            while (l < arraylist1.size()) 
            {
                a a2 = (a)arraylist1.get(l);
                float f2 = a(4F, 2.0F, a2.c / j);
                float f4 = a2.a;
                f4 = e + f4;
                float f6 = a2.b;
                f6 = g + f6;
                int k1;
                boolean flag1;
                if (c1 == com.aviary.android.feather.sdk.widget.c.a)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                k1 = a(a2, flag1);
                if (k1 != 0)
                {
                    if (d != null)
                    {
                        int i2 = canvas.save(1);
                        float f8 = d.getIntrinsicWidth();
                        float f10 = d.getIntrinsicHeight();
                        f2 /= 4F;
                        canvas.scale(f2, f2, f4, f6);
                        canvas.translate(f4 - f8 * 0.5F, f6 - f10 * 0.5F);
                        d.setAlpha(k1);
                        d.draw(canvas);
                        canvas.restoreToCount(i2);
                    } else
                    {
                        h.setAlpha(k1);
                        canvas.drawCircle(f4, f6, f2, h);
                    }
                }
                l++;
            }
        }
        canvas.restoreToCount(i1);
    }
}
