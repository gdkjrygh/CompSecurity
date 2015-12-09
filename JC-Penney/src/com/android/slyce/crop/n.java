// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.a.c;

// Referenced classes of package com.android.slyce.crop:
//            o

class n
{

    View a;
    boolean b;
    boolean c;
    Rect d;
    RectF e;
    Matrix f;
    private o g;
    private RectF h;
    private boolean i;
    private float j;
    private boolean k;
    private Drawable l;
    private Drawable m;
    private Drawable n;
    private final Paint o = new Paint();
    private final Paint p = new Paint();
    private final Paint q = new Paint();

    public n(View view)
    {
        g = o.a;
        i = false;
        k = false;
        a = view;
    }

    private void d()
    {
        Resources resources = a.getResources();
        l = resources.getDrawable(c.camera_crop_width);
        m = resources.getDrawable(c.camera_crop_height);
        n = resources.getDrawable(c.indicator_autocrop);
    }

    private Rect e()
    {
        RectF rectf = new RectF(e.left, e.top, e.right, e.bottom);
        f.mapRect(rectf);
        return new Rect(Math.round(rectf.left), Math.round(rectf.top), Math.round(rectf.right), Math.round(rectf.bottom));
    }

    public int a(float f1, float f2)
    {
        Rect rect;
        int i1;
        byte byte1;
        byte1 = 32;
        i1 = 0;
        rect = e();
        if (!k) goto _L2; else goto _L1
_L1:
        int j1;
        int l1;
        f1 -= rect.centerX();
        f2 -= rect.centerY();
        j1 = (int)Math.sqrt(f1 * f1 + f2 * f2);
        l1 = d.width() / 2;
        if ((float)Math.abs(j1 - l1) > 40F) goto _L4; else goto _L3
_L3:
        if (Math.abs(f2) <= Math.abs(f1)) goto _L6; else goto _L5
_L5:
        if (f2 >= 0.0F) goto _L8; else goto _L7
_L7:
        i1 = 8;
_L10:
        return i1;
_L8:
        return 16;
_L6:
        return f1 >= 0.0F ? 4 : 2;
_L4:
        i1 = byte1;
        if (j1 < l1) goto _L10; else goto _L9
_L9:
        return 1;
_L2:
        int k1;
        byte byte0;
        boolean flag;
        if (f2 >= (float)rect.top - 40F && f2 < (float)rect.bottom + 40F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        byte0 = i1;
        if (f1 >= (float)rect.left - 40F)
        {
            byte0 = i1;
            if (f1 < (float)rect.right + 40F)
            {
                byte0 = 1;
            }
        }
        if (Math.abs((float)rect.left - f1) < 40F && flag)
        {
            k1 = 3;
        } else
        {
            k1 = 1;
        }
        i1 = k1;
        if (Math.abs((float)rect.right - f1) < 40F)
        {
            i1 = k1;
            if (flag)
            {
                i1 = k1 | 4;
            }
        }
        k1 = i1;
        if (Math.abs((float)rect.top - f2) < 40F)
        {
            k1 = i1;
            if (byte0 != 0)
            {
                k1 = i1 | 8;
            }
        }
        if (Math.abs((float)rect.bottom - f2) < 40F && byte0 != 0)
        {
            k1 |= 0x10;
        }
        if (k1 != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = byte1;
        if (rect.contains((int)f1, (int)f2)) goto _L10; else goto _L11
_L11:
        return k1;
    }

    void a(int i1, float f1, float f2)
    {
        Rect rect = e();
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
        if (c)
        {
            return;
        }
        canvas.save();
        Path path = new Path();
        q.setStrokeWidth(3F);
        if (!a())
        {
            q.setColor(0xff000000);
            canvas.drawRect(d, q);
            return;
        }
        Rect rect = new Rect();
        a.getDrawingRect(rect);
        Paint paint;
        if (k)
        {
            float f1 = d.width();
            float f2 = d.height();
            float f3 = d.left;
            float f4 = f1 / 2.0F;
            float f5 = d.top;
            path.addCircle(f3 + f4, f2 / 2.0F + f5, f1 / 2.0F, android.graphics.Path.Direction.CW);
            q.setColor(0xffef04d6);
        } else
        {
            path.addRect(new RectF(d), android.graphics.Path.Direction.CW);
            q.setColor(-1);
        }
        canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
        if (a())
        {
            paint = o;
        } else
        {
            paint = p;
        }
        canvas.drawRect(rect, paint);
        canvas.restore();
        canvas.drawPath(path, q);
        if (k)
        {
            int i2 = n.getIntrinsicWidth();
            int i1 = n.getIntrinsicHeight();
            int k1 = (int)Math.round(Math.cos(0.78539816339744828D) * ((double)d.width() / 2D));
            i2 = (d.left + d.width() / 2 + k1) - i2 / 2;
            i1 = (d.top + d.height() / 2) - k1 - i1 / 2;
            n.setBounds(i2, i1, n.getIntrinsicWidth() + i2, n.getIntrinsicHeight() + i1);
            n.draw(canvas);
            return;
        } else
        {
            int j1 = d.left + 1;
            int l1 = d.right + 1;
            int j2 = d.top + 4;
            int k2 = d.bottom + 3;
            int l2 = l.getIntrinsicWidth() / 4;
            int i3 = l.getIntrinsicHeight() / 4;
            int j3 = m.getIntrinsicHeight() / 4;
            int k3 = m.getIntrinsicWidth() / 4;
            int l3 = d.left + (d.right - d.left) / 2;
            int i4 = d.top + (d.bottom - d.top) / 2;
            q.setStrokeWidth(8F);
            canvas.drawLine(j1 + 4, j2, j1 + 4, j2 + 50, q);
            canvas.drawLine(j1 + 4, j2, j1 + 54, j2, q);
            canvas.drawLine(l1 - 4, j2, l1 - 4, j2 + 50, q);
            canvas.drawLine(l1 - 4, j2, l1 - 54, j2, q);
            canvas.drawLine(l1 - 4, k2 - 8, l1 - 4, k2 - 58, q);
            canvas.drawLine(l1 - 4, k2 - 8, l1 - 58, k2 - 8, q);
            canvas.drawLine(j1 + 4, k2 - 8, j1 + 4, k2 - 58, q);
            canvas.drawLine(j1 + 4, k2 - 8, j1 + 54, k2 - 8, q);
            q.setStrokeWidth(0.7F);
            canvas.drawLine(j1, (d.bottom - d.top) / 3 + j2, l1, (d.bottom - d.top) / 3 + j2, q);
            canvas.drawLine(j1, ((d.bottom - d.top) / 3) * 2 + j2, l1, ((d.bottom - d.top) / 3) * 2 + j2, q);
            canvas.drawLine((d.right - d.left) / 3 + j1, j2, (d.right - d.left) / 3 + j1, k2, q);
            canvas.drawLine(((d.right - d.left) / 3) * 2 + j1, j2, ((d.right - d.left) / 3) * 2 + j1, k2, q);
            l.setBounds(j1 - l2, i4 - i3, j1 + l2, i4 + i3);
            l.draw(canvas);
            l.setBounds(l1 - l2, i4 - i3, l1 + l2, i4 + i3);
            l.draw(canvas);
            m.setBounds(l3 - k3, j2 - j3, l3 + k3, j2 + j3);
            m.draw(canvas);
            m.setBounds(l3 - k3, k2 - j3, l3 + k3, k2 + j3);
            m.draw(canvas);
            return;
        }
    }

    public void a(Matrix matrix, Rect rect, RectF rectf, boolean flag, boolean flag1)
    {
        if (flag)
        {
            flag1 = true;
        }
        f = new Matrix(matrix);
        e = rectf;
        h = new RectF(rect);
        i = flag1;
        k = flag;
        j = e.width() / e.height();
        d = e();
        o.setARGB(125, 50, 50, 50);
        p.setARGB(125, 50, 50, 50);
        q.setStrokeWidth(3F);
        q.setStyle(android.graphics.Paint.Style.STROKE);
        q.setAntiAlias(true);
        g = o.a;
        d();
    }

    public void a(o o1)
    {
        if (o1 != g)
        {
            g = o1;
            a.invalidate();
        }
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a()
    {
        return b;
    }

    public Rect b()
    {
        return new Rect((int)e.left, (int)e.top, (int)e.right, (int)e.bottom);
    }

    void b(float f1, float f2)
    {
        Rect rect = new Rect(d);
        e.offset(f1, f2);
        e.offset(Math.max(0.0F, h.left - e.left), Math.max(0.0F, h.top - e.top));
        e.offset(Math.min(0.0F, h.right - e.right), Math.min(0.0F, h.bottom - e.bottom));
        d = e();
        rect.union(d);
        rect.inset(-10, -10);
        a.invalidate(rect);
    }

    public void b(boolean flag)
    {
        c = flag;
    }

    public void c()
    {
        d = e();
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
        if (rectf.width() + 2.0F * f4 <= h.width()) goto _L2; else goto _L3
_L3:
        f2 = (h.width() - rectf.width()) / 2.0F;
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
            if (rectf.height() + 2.0F * f2 > h.height())
            {
                f2 = (h.height() - rectf.height()) / 2.0F;
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
        if (rectf.left < h.left)
        {
            rectf.offset(h.left - rectf.left, 0.0F);
        } else
        if (rectf.right > h.right)
        {
            rectf.offset(-(rectf.right - h.right), 0.0F);
        }
        if (rectf.top < h.top)
        {
            rectf.offset(0.0F, h.top - rectf.top);
        } else
        if (rectf.bottom > h.bottom)
        {
            rectf.offset(0.0F, -(rectf.bottom - h.bottom));
        }
        e.set(rectf);
        d = e();
        a.invalidate();
        return;
_L2:
        f2 = f3;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
