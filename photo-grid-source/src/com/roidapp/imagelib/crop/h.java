// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.roidapp.imagelib.f;

// Referenced classes of package com.roidapp.imagelib.crop:
//            i

public final class h
{

    View a;
    public boolean b;
    boolean c;
    public Rect d;
    public RectF e;
    public Matrix f;
    private int g;
    private RectF h;
    private boolean i;
    private float j;
    private boolean k;
    private Drawable l;
    private final Paint m = new Paint();
    private final Paint n = new Paint();
    private final Paint o = new Paint();

    public h(View view)
    {
        g = i.a;
        i = false;
        k = false;
        a = view;
    }

    private Rect c()
    {
        RectF rectf = new RectF(e.left, e.top, e.right, e.bottom);
        f.mapRect(rectf);
        return new Rect(Math.round(rectf.left), Math.round(rectf.top), Math.round(rectf.right), Math.round(rectf.bottom));
    }

    public final int a(float f1, float f2)
    {
        Rect rect;
        int i1;
        boolean flag;
        int k1;
        int l1;
        i1 = 0;
        flag = true;
        rect = c();
        if (!k)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        f1 -= rect.centerX();
        f2 -= rect.centerY();
        k1 = (int)Math.sqrt(f1 * f1 + f2 * f2);
        l1 = d.width() / 2;
        if ((float)Math.abs(k1 - l1) > 30F) goto _L2; else goto _L1
_L1:
        if (Math.abs(f2) <= Math.abs(f1)) goto _L4; else goto _L3
_L3:
        if (f2 >= 0.0F) goto _L6; else goto _L5
_L5:
        i1 = 8;
_L8:
        return i1;
_L6:
        return 16;
_L4:
        return f1 >= 0.0F ? 4 : 2;
_L2:
        i1 = ((flag) ? 1 : 0);
        if (k1 >= l1) goto _L8; else goto _L7
_L7:
        return 32;
        int j1;
        byte byte0;
        boolean flag1;
        if (f2 >= (float)rect.top - 30F && f2 < (float)rect.bottom + 30F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        byte0 = i1;
        if (f1 >= (float)rect.left - 30F)
        {
            byte0 = i1;
            if (f1 < (float)rect.right + 30F)
            {
                byte0 = 1;
            }
        }
        if (Math.abs((float)rect.left - f1) < 30F && flag1)
        {
            j1 = 3;
        } else
        {
            j1 = 1;
        }
        i1 = j1;
        if (Math.abs((float)rect.right - f1) < 30F)
        {
            i1 = j1;
            if (flag1)
            {
                i1 = j1 | 4;
            }
        }
        j1 = i1;
        if (Math.abs((float)rect.top - f2) < 30F)
        {
            j1 = i1;
            if (byte0 != 0)
            {
                j1 = i1 | 8;
            }
        }
        if (Math.abs((float)rect.bottom - f2) < 30F && byte0 != 0)
        {
            i1 = j1 | 0x10;
        } else
        {
            i1 = j1;
        }
        if (i1 == 1 && rect.contains((int)f1, (int)f2))
        {
            return 32;
        } else
        {
            return i1;
        }
    }

    public final Rect a()
    {
        return new Rect((int)e.left, (int)e.top, (int)e.right, (int)e.bottom);
    }

    public final void a(int i1)
    {
        if (i1 != g)
        {
            g = i1;
            a.invalidate();
        }
    }

    public final void a(int i1, float f1, float f2)
    {
        boolean flag = true;
        Object obj = c();
        if (i1 == 1)
        {
            return;
        }
        if (i1 == 32)
        {
            float f3 = e.width() / (float)((Rect) (obj)).width();
            float f5 = e.height() / (float)((Rect) (obj)).height();
            obj = new Rect(d);
            e.offset(f3 * f1, f5 * f2);
            e.offset(Math.max(0.0F, h.left - e.left), Math.max(0.0F, h.top - e.top));
            e.offset(Math.min(0.0F, h.right - e.right), Math.min(0.0F, h.bottom - e.bottom));
            d = c();
            ((Rect) (obj)).union(d);
            ((Rect) (obj)).inset(-10, -10);
            a.invalidate(((Rect) (obj)));
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
        float f4;
        float f6;
        int j1;
        int k1;
        if (((Rect) (obj)).width() == 0)
        {
            j1 = 1;
        } else
        {
            j1 = ((Rect) (obj)).width();
        }
        if (((Rect) (obj)).height() == 0)
        {
            k1 = 1;
        } else
        {
            k1 = ((Rect) (obj)).height();
        }
        f6 = e.width() / (float)j1;
        f4 = e.height() / (float)k1;
        if ((i1 & 2) != 0)
        {
            j1 = -1;
        } else
        {
            j1 = 1;
        }
        f1 = (float)j1 * (f1 * f6);
        j1 = ((flag) ? 1 : 0);
        if ((i1 & 8) != 0)
        {
            j1 = -1;
        }
        f4 = (float)j1 * (f2 * f4);
        if (i)
        {
            if (f1 != 0.0F)
            {
                f4 = f1 / j;
            } else
            if (f4 != 0.0F)
            {
                f1 = j * f4;
            }
        }
        obj = new RectF(e);
        f6 = f4;
        f2 = f1;
        if (f1 > 0.0F)
        {
            f6 = f4;
            f2 = f1;
            if (((RectF) (obj)).width() + 2.0F * f1 > h.width())
            {
                f1 = (h.width() - ((RectF) (obj)).width()) / 2.0F;
                f6 = f4;
                f2 = f1;
                if (i)
                {
                    f6 = f1 / j;
                    f2 = f1;
                }
            }
        }
        f1 = f6;
        f4 = f2;
        if (f6 > 0.0F)
        {
            f1 = f6;
            f4 = f2;
            if (((RectF) (obj)).height() + 2.0F * f6 > h.height())
            {
                float f7 = (h.height() - ((RectF) (obj)).height()) / 2.0F;
                f1 = f7;
                f4 = f2;
                if (i)
                {
                    f4 = j * f7;
                    f1 = f7;
                }
            }
        }
        if (i)
        {
            ((RectF) (obj)).inset(-f4, -f1);
        } else
        {
            if ((i1 & 2) != 0)
            {
                obj.left = ((RectF) (obj)).left - f4;
                if (((RectF) (obj)).width() < 25F)
                {
                    obj.left = ((RectF) (obj)).left + f4;
                }
            }
            if ((i1 & 4) != 0)
            {
                obj.right = ((RectF) (obj)).right + f4;
                if (((RectF) (obj)).width() < 25F)
                {
                    obj.right = ((RectF) (obj)).right - f4;
                }
            }
            if ((i1 & 8) != 0)
            {
                obj.top = ((RectF) (obj)).top - f1;
                if (((RectF) (obj)).height() < 25F)
                {
                    obj.top = ((RectF) (obj)).top + f1;
                }
            }
            if ((i1 & 0x10) != 0)
            {
                obj.bottom = ((RectF) (obj)).bottom + f1;
                if (((RectF) (obj)).height() < 25F)
                {
                    obj.bottom = ((RectF) (obj)).bottom - f1;
                }
            }
        }
        if (((RectF) (obj)).width() < 25F)
        {
            ((RectF) (obj)).inset(-(25F - ((RectF) (obj)).width()) / 2.0F, 0.0F);
        }
        if (i)
        {
            f1 = 25F / j;
        } else
        {
            f1 = 25F;
        }
        if (((RectF) (obj)).height() < f1)
        {
            ((RectF) (obj)).inset(0.0F, -(f1 - ((RectF) (obj)).height()) / 2.0F);
        }
        if (((RectF) (obj)).left < h.left)
        {
            if (i)
            {
                ((RectF) (obj)).offset(h.left - ((RectF) (obj)).left, 0.0F);
            } else
            {
                obj.left = ((RectF) (obj)).left + (h.left - ((RectF) (obj)).left);
            }
        } else
        if (((RectF) (obj)).right > h.right)
        {
            if (i)
            {
                ((RectF) (obj)).offset(-(((RectF) (obj)).right - h.right), 0.0F);
            } else
            {
                obj.right = ((RectF) (obj)).right + -(((RectF) (obj)).right - h.right);
            }
        }
        if (((RectF) (obj)).top < h.top)
        {
            if (i)
            {
                ((RectF) (obj)).offset(0.0F, h.top - ((RectF) (obj)).top);
            } else
            {
                obj.top = ((RectF) (obj)).top + (h.top - ((RectF) (obj)).top);
            }
        } else
        if (((RectF) (obj)).bottom > h.bottom)
        {
            if (i)
            {
                ((RectF) (obj)).offset(0.0F, -(((RectF) (obj)).bottom - h.bottom));
            } else
            {
                obj.bottom = ((RectF) (obj)).bottom + -(((RectF) (obj)).bottom - h.bottom);
            }
        }
        e.set(((RectF) (obj)));
        d = c();
        a.invalidate();
    }

    public final void a(Canvas canvas)
    {
        if (!c)
        {
            canvas.save();
            Path path = new Path();
            if (!b)
            {
                o.setColor(0xff000000);
                canvas.drawRect(d, o);
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
                o.setColor(0x880000ff);
            } else
            {
                path.addRect(new RectF(d), android.graphics.Path.Direction.CW);
                o.setColor(0x880000ff);
            }
            o.setAntiAlias(true);
            canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
            if (b)
            {
                paint = m;
            } else
            {
                paint = n;
            }
            canvas.drawRect(rect, paint);
            canvas.restore();
            canvas.drawPath(path, o);
            if (g == i.a || g == i.c)
            {
                if (k)
                {
                    int i2 = l.getIntrinsicWidth();
                    int i1 = l.getIntrinsicHeight();
                    int k1 = (int)Math.round(Math.cos(0.78539816339744828D) * ((double)d.width() / 2D));
                    i2 = (d.left + d.width() / 2 + k1) - i2 / 2;
                    i1 = (d.top + d.height() / 2) - k1 - i1 / 2;
                    l.setBounds(i2, i1, l.getIntrinsicWidth() + i2, l.getIntrinsicHeight() + i1);
                    l.draw(canvas);
                    return;
                } else
                {
                    int j1 = d.left;
                    int l1 = d.right;
                    int j2 = d.top;
                    int k2 = d.bottom;
                    int l2 = l.getIntrinsicWidth() / 2;
                    int i3 = l.getIntrinsicHeight() / 2;
                    int j3 = d.left + (d.right - d.left) / 2;
                    int k3 = d.top + (d.bottom - d.top) / 2;
                    l.setBounds(j1 - l2, k3 - i3, j1 + l2, k3 + i3);
                    l.draw(canvas);
                    l.setBounds(l1 - l2, k3 - i3, l1 + l2, k3 + i3);
                    l.draw(canvas);
                    l.setBounds(j3 - l2, j2 - i3, j3 + l2, j2 + i3);
                    l.draw(canvas);
                    l.setBounds(j3 - l2, k2 - i3, j3 + l2, k2 + i3);
                    l.draw(canvas);
                    l.setBounds(j1 - l2, j2 - i3, j1 + l2, j2 + i3);
                    l.draw(canvas);
                    l.setBounds(l1 - l2, j2 - i3, l1 + l2, j2 + i3);
                    l.draw(canvas);
                    l.setBounds(j1 - l2, k2 - i3, j1 + l2, k2 + i3);
                    l.draw(canvas);
                    l.setBounds(l1 - l2, k2 - i3, l1 + l2, k2 + i3);
                    l.draw(canvas);
                    return;
                }
            }
        }
    }

    public final void a(Matrix matrix, Rect rect, RectF rectf, boolean flag, boolean flag1)
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
        d = c();
        m.setARGB(125, 50, 50, 50);
        n.setARGB(125, 50, 50, 50);
        o.setStrokeWidth(3F);
        o.setStyle(android.graphics.Paint.Style.STROKE);
        o.setAntiAlias(true);
        g = i.a;
        l = a.getResources().getDrawable(f.at);
    }

    public final void b()
    {
        d = c();
    }
}
