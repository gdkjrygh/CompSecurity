// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.h;

// Referenced classes of package com.facebook.orca.camera:
//            n

class m
{

    private static final Class g = com/facebook/orca/camera/m;
    View a;
    boolean b;
    boolean c;
    Rect d;
    RectF e;
    Matrix f;
    private n h;
    private RectF i;
    private boolean j;
    private float k;
    private boolean l;
    private Drawable m;
    private Drawable n;
    private Drawable o;
    private final Paint p = new Paint();
    private final Paint q = new Paint();
    private final Paint r = new Paint();

    public m(View view)
    {
        h = n.None;
        j = false;
        l = false;
        a = view;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a.setLayerType(1, null);
        }
    }

    private void d()
    {
        Resources resources = a.getResources();
        m = resources.getDrawable(h.orca_camera_crop_width);
        n = resources.getDrawable(h.orca_camera_crop_height);
        o = resources.getDrawable(h.orca_indicator_autocrop);
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
        if (!l) goto _L2; else goto _L1
_L1:
        int j1;
        int l1;
        f1 -= rect.centerX();
        f2 -= rect.centerY();
        j1 = (int)Math.sqrt(f1 * f1 + f2 * f2);
        l1 = d.width() / 2;
        if ((float)Math.abs(j1 - l1) > 20F) goto _L4; else goto _L3
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
        if (f2 >= (float)rect.top - 20F && f2 < (float)rect.bottom + 20F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        byte0 = i1;
        if (f1 >= (float)rect.left - 20F)
        {
            byte0 = i1;
            if (f1 < (float)rect.right + 20F)
            {
                byte0 = 1;
            }
        }
        if (Math.abs((float)rect.left - f1) < 20F && flag)
        {
            k1 = 3;
        } else
        {
            k1 = 1;
        }
        i1 = k1;
        if (Math.abs((float)rect.right - f1) < 20F)
        {
            i1 = k1;
            if (flag)
            {
                i1 = k1 | 4;
            }
        }
        k1 = i1;
        if (Math.abs((float)rect.top - f2) < 20F)
        {
            k1 = i1;
            if (byte0 != 0)
            {
                k1 = i1 | 8;
            }
        }
        if (Math.abs((float)rect.bottom - f2) < 20F && byte0 != 0)
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
        if (!c)
        {
            canvas.save();
            Path path = new Path();
            if (!a())
            {
                r.setColor(0xff000000);
                canvas.drawRect(d, r);
                return;
            }
            Rect rect = new Rect();
            a.getDrawingRect(rect);
            Paint paint;
            if (l)
            {
                float f1 = d.width();
                float f2 = d.height();
                float f3 = d.left;
                float f4 = f1 / 2.0F;
                float f5 = d.top;
                path.addCircle(f3 + f4, f2 / 2.0F + f5, f1 / 2.0F, android.graphics.Path.Direction.CW);
                r.setColor(0xffef04d6);
            } else
            {
                path.addRect(new RectF(d), android.graphics.Path.Direction.CW);
                r.setColor(-30208);
            }
            canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
            if (a())
            {
                paint = p;
            } else
            {
                paint = q;
            }
            canvas.drawRect(rect, paint);
            canvas.restore();
            canvas.drawPath(path, r);
            if (h == n.Grow)
            {
                if (l)
                {
                    int i2 = o.getIntrinsicWidth();
                    int i1 = o.getIntrinsicHeight();
                    int k1 = (int)Math.round(Math.cos(0.78539816339744828D) * ((double)d.width() / 2D));
                    i2 = (d.left + d.width() / 2 + k1) - i2 / 2;
                    i1 = (d.top + d.height() / 2) - k1 - i1 / 2;
                    o.setBounds(i2, i1, o.getIntrinsicWidth() + i2, o.getIntrinsicHeight() + i1);
                    o.draw(canvas);
                    return;
                } else
                {
                    int j1 = d.left + 1;
                    int l1 = d.right + 1;
                    int j2 = d.top + 4;
                    int k2 = d.bottom + 3;
                    int l2 = m.getIntrinsicWidth() / 2;
                    int i3 = m.getIntrinsicHeight() / 2;
                    int j3 = n.getIntrinsicHeight() / 2;
                    int k3 = n.getIntrinsicWidth() / 2;
                    int l3 = d.left + (d.right - d.left) / 2;
                    int i4 = d.top + (d.bottom - d.top) / 2;
                    m.setBounds(j1 - l2, i4 - i3, j1 + l2, i4 + i3);
                    m.draw(canvas);
                    m.setBounds(l1 - l2, i4 - i3, l1 + l2, i4 + i3);
                    m.draw(canvas);
                    n.setBounds(l3 - k3, j2 - j3, l3 + k3, j2 + j3);
                    n.draw(canvas);
                    n.setBounds(l3 - k3, k2 - j3, l3 + k3, k2 + j3);
                    n.draw(canvas);
                    return;
                }
            }
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
        i = new RectF(rect);
        j = flag1;
        l = flag;
        k = e.width() / e.height();
        d = e();
        p.setARGB(125, 50, 50, 50);
        q.setARGB(125, 50, 50, 50);
        r.setStrokeWidth(3F);
        r.setStyle(android.graphics.Paint.Style.STROKE);
        r.setAntiAlias(true);
        h = n.None;
        d();
    }

    public void a(n n1)
    {
        if (n1 != h)
        {
            h = n1;
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
        e.offset(Math.max(0.0F, i.left - e.left), Math.max(0.0F, i.top - e.top));
        e.offset(Math.min(0.0F, i.right - e.right), Math.min(0.0F, i.bottom - e.bottom));
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
        if (j)
        {
            if (f1 != 0.0F)
            {
                f3 = f1 / k;
                f4 = f1;
            } else
            {
                f4 = f1;
                f3 = f2;
                if (f2 != 0.0F)
                {
                    f4 = f2 * k;
                    f3 = f2;
                }
            }
        }
        rectf = new RectF(e);
        f1 = f4;
        if (f4 <= 0.0F) goto _L2; else goto _L1
_L1:
        f1 = f4;
        if (rectf.width() + 2.0F * f4 <= i.width()) goto _L2; else goto _L3
_L3:
        f2 = (i.width() - rectf.width()) / 2.0F;
        f1 = f2;
        if (!j) goto _L2; else goto _L4
_L4:
        f3 = f2 / k;
        f1 = f2;
        f2 = f3;
_L6:
        f3 = f2;
        f4 = f1;
        if (f2 > 0.0F)
        {
            f3 = f2;
            f4 = f1;
            if (rectf.height() + 2.0F * f2 > i.height())
            {
                f2 = (i.height() - rectf.height()) / 2.0F;
                f3 = f2;
                f4 = f1;
                if (j)
                {
                    f4 = k * f2;
                    f3 = f2;
                }
            }
        }
        rectf.inset(-f4, -f3);
        if (rectf.width() < 25F)
        {
            rectf.inset(-(25F - rectf.width()) / 2.0F, 0.0F);
        }
        if (j)
        {
            f1 = 25F / k;
        } else
        {
            f1 = 25F;
        }
        if (rectf.height() < f1)
        {
            rectf.inset(0.0F, -(f1 - rectf.height()) / 2.0F);
        }
        if (rectf.left < i.left)
        {
            rectf.offset(i.left - rectf.left, 0.0F);
        } else
        if (rectf.right > i.right)
        {
            rectf.offset(-(rectf.right - i.right), 0.0F);
        }
        if (rectf.top < i.top)
        {
            rectf.offset(0.0F, i.top - rectf.top);
        } else
        if (rectf.bottom > i.bottom)
        {
            rectf.offset(0.0F, -(rectf.bottom - i.bottom));
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
