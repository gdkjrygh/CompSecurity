// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.crop;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

class com.cardinalblue.android.piccollage.view.crop.a
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/view/crop/a$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("None", 0);
            b = new a("Move", 1);
            c = new a("Grow", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }


    private View a;
    private a b;
    private Rect c;
    private RectF d;
    private RectF e;
    private Matrix f;
    private int g;
    private int h;
    private boolean i;
    private float j;
    private Drawable k;
    private Drawable l;
    private final Paint m = new Paint();
    private final Paint n = new Paint();
    private final Paint o = new Paint();

    public com.cardinalblue.android.piccollage.view.crop.a(View view)
    {
        b = a.a;
        c = new Rect();
        d = new RectF();
        e = new RectF();
        f = new Matrix();
        i = false;
        a = view;
    }

    private void f()
    {
        Resources resources = a.getResources();
        k = resources.getDrawable(0x7f020149);
        l = resources.getDrawable(0x7f020148);
    }

    private Rect g()
    {
        RectF rectf = new RectF(e.left, e.top, e.right, e.bottom);
        f.mapRect(rectf);
        return new Rect(Math.round(rectf.left), Math.round(rectf.top), Math.round(rectf.right), Math.round(rectf.bottom));
    }

    public int a(float f1, float f2)
    {
        int i1 = 0;
        Rect rect = g();
        int j1;
        boolean flag;
        boolean flag1;
        if (f2 >= (float)rect.top - 20F && f2 < (float)rect.bottom + 20F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = i1;
        if (f1 >= (float)rect.left - 20F)
        {
            flag = i1;
            if (f1 < (float)rect.right + 20F)
            {
                flag = true;
            }
        }
        if (Math.abs((float)rect.left - f1) < 20F && flag1)
        {
            j1 = 3;
        } else
        {
            j1 = 1;
        }
        i1 = j1;
        if (Math.abs((float)rect.right - f1) < 20F)
        {
            i1 = j1;
            if (flag1)
            {
                i1 = j1 | 4;
            }
        }
        j1 = i1;
        if (Math.abs((float)rect.top - f2) < 20F)
        {
            j1 = i1;
            if (flag)
            {
                j1 = i1 | 8;
            }
        }
        if (Math.abs((float)rect.bottom - f2) < 20F && flag)
        {
            i1 = j1 | 0x10;
        } else
        {
            i1 = j1;
        }
        j1 = i1;
        if (i1 == 1)
        {
            j1 = i1;
            if (rect.contains((int)f1, (int)f2))
            {
                j1 = 32;
            }
        }
        return j1;
    }

    public Rect a()
    {
        return new Rect((int)e.left, (int)e.top, (int)e.right, (int)e.bottom);
    }

    public void a(int i1)
    {
        g = i1;
    }

    void a(int i1, float f1, float f2)
    {
        Rect rect = g();
        if (i1 == 1)
        {
            return;
        }
        if (i1 == 32)
        {
            b((e.width() / (float)rect.width()) * f1, (e.height() / (float)rect.height()) * f2);
            return;
        }
        if ((i1 & 6) == 0)
        {
            f1 = 0.0F;
        }
        if ((i1 & 0x18) == 0)
        {
            f2 = 0.0F;
        }
        float f3 = e.width() / (float)rect.width();
        float f4 = e.height() / (float)rect.height();
        float f5;
        int j1;
        if ((i1 & 2) != 0)
        {
            j1 = -1;
        } else
        {
            j1 = 1;
        }
        f5 = j1;
        if ((i1 & 8) != 0)
        {
            i1 = -1;
        } else
        {
            i1 = 1;
        }
        c(f1 * f3 * f5, (float)i1 * (f2 * f4));
    }

    protected void a(Canvas canvas)
    {
        Path path = new Path();
        Rect rect = new Rect();
        a.getDrawingRect(rect);
        Rect rect1 = new Rect(rect.left, rect.top, rect.right, c.top);
        if (rect1.width() > 0 && rect1.height() > 0)
        {
            canvas.drawRect(rect1, m);
        }
        Rect rect2 = new Rect(rect.left, c.bottom, rect.right, rect.bottom);
        if (rect2.width() > 0 && rect2.height() > 0)
        {
            canvas.drawRect(rect2, m);
        }
        Rect rect3 = new Rect(rect.left, rect1.bottom, c.left, rect2.top);
        if (rect3.width() > 0 && rect3.height() > 0)
        {
            canvas.drawRect(rect3, m);
        }
        rect = new Rect(c.right, rect1.bottom, rect.right, rect2.top);
        if (rect.width() > 0 && rect.height() > 0)
        {
            canvas.drawRect(rect, m);
        }
        path.addRect(new RectF(c), android.graphics.Path.Direction.CW);
        o.setColor(-30208);
        canvas.drawPath(path, o);
        if (b == a.c)
        {
            int i1 = c.left + 1;
            int j1 = c.right + 1;
            int k1 = c.top + 4;
            int l1 = c.bottom + 3;
            int i2 = k.getIntrinsicWidth() / 2;
            int j2 = k.getIntrinsicHeight() / 2;
            int k2 = l.getIntrinsicHeight() / 2;
            int l2 = l.getIntrinsicWidth() / 2;
            int i3 = c.left + (c.right - c.left) / 2;
            int j3 = c.top + (c.bottom - c.top) / 2;
            k.setBounds(i1 - i2, j3 - j2, i1 + i2, j3 + j2);
            k.draw(canvas);
            k.setBounds(j1 - i2, j3 - j2, j1 + i2, j3 + j2);
            k.draw(canvas);
            l.setBounds(i3 - l2, k1 - k2, i3 + l2, k1 + k2);
            l.draw(canvas);
            l.setBounds(i3 - l2, l1 - k2, i3 + l2, l1 + k2);
            l.draw(canvas);
        }
    }

    public void a(Matrix matrix, Rect rect, RectF rectf, boolean flag)
    {
        f = new Matrix(matrix);
        e = rectf;
        d = new RectF(rect);
        i = flag;
        j = e.width() / e.height();
        c = g();
        m.setARGB(125, 50, 50, 50);
        n.setARGB(125, 50, 50, 50);
        o.setStrokeWidth(3F);
        o.setStyle(android.graphics.Paint.Style.STROKE);
        o.setAntiAlias(true);
        b = a.a;
        f();
        a.invalidate();
    }

    public void a(a a1)
    {
        if (a1 != b)
        {
            b = a1;
            a.invalidate();
        }
    }

    public void b()
    {
        c = g();
    }

    void b(float f1, float f2)
    {
        Rect rect = new Rect(c);
        e.offset(f1, f2);
        e.offset(Math.max(0.0F, d.left - e.left), Math.max(0.0F, d.top - e.top));
        e.offset(Math.min(0.0F, d.right - e.right), Math.min(0.0F, d.bottom - e.bottom));
        c = g();
        rect.union(c);
        rect.inset(-10, -10);
        a.invalidate(rect);
    }

    public void b(int i1)
    {
        h = i1;
    }

    public Matrix c()
    {
        return f;
    }

    void c(float f1, float f2)
    {
        float f3;
        RectF rectf;
        float f4 = f1;
        f3 = f2;
        if (i)
        {
            if (f1 != 0.0F)
            {
                f3 = f1 / j;
                f4 = f1;
            } else
            {
                f4 = f1;
                f3 = f2;
                if (f2 != 0.0F)
                {
                    f4 = f2 * j;
                    f3 = f2;
                }
            }
        }
        rectf = new RectF(e);
        f1 = f4;
        if (f4 <= 0.0F) goto _L2; else goto _L1
_L1:
        f1 = f4;
        if (rectf.width() + 2.0F * f4 <= d.width()) goto _L2; else goto _L3
_L3:
        f2 = (d.width() - rectf.width()) / 2.0F;
        f1 = f2;
        if (!i) goto _L2; else goto _L4
_L4:
        f3 = f2 / j;
        f1 = f2;
        f2 = f3;
_L6:
        f3 = f2;
        f4 = f1;
        if (f2 > 0.0F)
        {
            f3 = f2;
            f4 = f1;
            if (rectf.height() + 2.0F * f2 > d.height())
            {
                f2 = (d.height() - rectf.height()) / 2.0F;
                f3 = f2;
                f4 = f1;
                if (i)
                {
                    f4 = j * f2;
                    f3 = f2;
                }
            }
        }
        rectf.inset(-f4, -f3);
        if (rectf.width() < 25F)
        {
            rectf.inset(-(25F - rectf.width()) / 2.0F, 0.0F);
        }
        if (i)
        {
            f1 = 25F / j;
        } else
        {
            f1 = 25F;
        }
        if (rectf.height() < f1)
        {
            rectf.inset(0.0F, -(f1 - rectf.height()) / 2.0F);
        }
        if (rectf.left < d.left)
        {
            rectf.offset(d.left - rectf.left, 0.0F);
        } else
        if (rectf.right > d.right)
        {
            rectf.offset(-(rectf.right - d.right), 0.0F);
        }
        if (rectf.top < d.top)
        {
            rectf.offset(0.0F, d.top - rectf.top);
        } else
        if (rectf.bottom > d.bottom)
        {
            rectf.offset(0.0F, -(rectf.bottom - d.bottom));
        }
        e.set(rectf);
        c = g();
        a.invalidate();
        return;
_L2:
        f2 = f3;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int d()
    {
        return g;
    }

    public int e()
    {
        return h;
    }
}
