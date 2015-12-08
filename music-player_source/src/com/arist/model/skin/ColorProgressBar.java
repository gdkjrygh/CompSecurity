// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import a.a.a.a.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.arist.model.skin:
//            m, l, b

public class ColorProgressBar extends View
    implements m
{

    private Drawable a;
    private Drawable b;
    private int c;
    private boolean d;
    private float e;
    private RectF f;
    private RectF g;
    private Paint h;
    private int i;
    private int j;
    private Rect k;
    private boolean l;
    private PointF m;
    private l n;

    public ColorProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 6;
        d = false;
        e = 0.0F;
        i = 0xff0000ff;
        j = 0xffcccccc;
        l = false;
        h = new Paint(1);
        h.setStyle(android.graphics.Paint.Style.FILL);
        f = new RectF();
        g = new RectF();
        k = new Rect();
        m = new PointF();
        context = context.obtainStyledAttributes(attributeset, b.c);
        e = b(context.getFloat(0, e));
        c = context.getDimensionPixelOffset(2, c);
        a = context.getDrawable(3);
        b = context.getDrawable(5);
        i = context.getColor(1, i);
        j = context.getColor(6, j);
        d = context.getBoolean(7, d);
        int i1 = context.getColor(4, -1);
        if (i1 != -1)
        {
            b(i1);
        }
        context.recycle();
    }

    private void a(boolean flag, float f1)
    {
        float f3 = b(f1);
        e = f3;
        RectF rectf = g;
        float f4 = f.left;
        float f2;
        if (d)
        {
            f1 = f.height() * (1.0F - f3) + f.top;
        } else
        {
            f1 = f.top;
        }
        if (d)
        {
            f2 = f.right;
        } else
        {
            f2 = f.width() * f3 + f.left;
        }
        rectf.set(f4, f1, f2, f.bottom);
        if (d)
        {
            k.offsetTo(0, (int)(f.height() * (1.0F - f3)));
        } else
        {
            k.offsetTo((int)(f.width() * f3), 0);
        }
        invalidate();
        if (n != null)
        {
            n.a(this, flag, f3);
        }
    }

    private static float b(float f1)
    {
        float f2;
        if (f1 > 1.0F)
        {
            f2 = 1.0F;
        } else
        {
            f2 = f1;
            if (f1 < 0.0F)
            {
                return 0.0F;
            }
        }
        return f2;
    }

    private void b(int i1)
    {
        if (a != null)
        {
            a.setColorFilter(new LightingColorFilter(i1, 1));
        }
        if (b != null)
        {
            b.setColorFilter(new LightingColorFilter(i1, 1));
        }
    }

    public final float a()
    {
        return e;
    }

    public final void a(float f1)
    {
        a(false, f1);
    }

    public final void a(int i1)
    {
        b(i1);
        j = j;
        i = i1;
        invalidate();
    }

    public final void a(l l1)
    {
        n = l1;
    }

    protected void onAttachedToWindow()
    {
        com.arist.model.skin.b.a().a(this);
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        com.arist.model.skin.b.a().b(this);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        h.setColor(j);
        canvas.drawRoundRect(f, 2.0F, 2.0F, h);
        if (e > 0.0F)
        {
            h.setColor(i);
            canvas.drawRoundRect(g, 2.0F, 2.0F, h);
        }
        if (l && b != null)
        {
            b.setBounds(k);
            b.draw(canvas);
        } else
        if (a != null)
        {
            a.setBounds(k);
            a.draw(canvas);
            return;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        if (!d || android.view.View.MeasureSpec.getMode(i1) == 0x40000000) goto _L2; else goto _L1
_L1:
        int k1;
        int l1;
        if (a != null)
        {
            i1 = a.getIntrinsicWidth();
        } else
        {
            i1 = c;
        }
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        l1 = j1;
_L4:
        super.onMeasure(k1, l1);
        return;
_L2:
        k1 = i1;
        l1 = j1;
        if (!d)
        {
            k1 = i1;
            l1 = j1;
            if (android.view.View.MeasureSpec.getMode(j1) != 0x40000000)
            {
                if (a != null)
                {
                    j1 = a.getIntrinsicHeight();
                } else
                {
                    j1 = c;
                }
                l1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
                k1 = i1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        float f2 = 0.0F;
        float f1 = 0.0F;
        float f3;
        float f4;
        if (a != null)
        {
            if (d)
            {
                k.set(0, j1 - (int)(((float)a.getIntrinsicHeight() * (float)i1) / (float)a.getIntrinsicWidth()), i1, j1);
            } else
            {
                k.set(0, 0, (int)(((float)a.getIntrinsicWidth() * (float)j1) / (float)a.getIntrinsicHeight()), j1);
            }
        } else
        if (d)
        {
            k.set(0, j1 - i1, i1, i1);
        } else
        {
            k.set(0, 0, j1, j1);
        }
        if (d)
        {
            f3 = (float)(i1 - c) / 2.0F;
            if (a != null)
            {
                f1 = (float)k.height() / 2.0F;
            }
            f2 = i1;
            float f5 = j1;
            f4 = f2 - f3;
            f2 = f1;
            f5 -= f1;
            f1 = f3;
            f3 = f5;
        } else
        {
            f1 = f2;
            if (a != null)
            {
                f1 = (float)k.width() / 2.0F;
            }
            f3 = (float)(j1 - c) / 2.0F;
            f2 = i1;
            float f6 = j1;
            f4 = f2 - f1;
            f2 = f3;
            f3 = f6 - f3;
        }
        f.set(f1, f2, f4, f3);
        a(false, e);
        super.onSizeChanged(i1, j1, k1, l1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = false;
        if (isEnabled()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 44
    //                   0 77
    //                   1 44
    //                   2 405;
           goto _L3 _L4 _L3 _L5
_L5:
        continue; /* Loop/switch isn't completed */
_L3:
        if (!l)
        {
            continue; /* Loop/switch isn't completed */
        }
        m.set(motionevent.getX(), motionevent.getY());
        l = false;
        invalidate();
_L6:
        return true;
_L4:
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        boolean flag = flag1;
        if (k.left < k.right)
        {
            flag = flag1;
            if (k.top < k.bottom)
            {
                flag = flag1;
                if (f1 >= (float)(k.left - 15))
                {
                    flag = flag1;
                    if (f1 < (float)(k.right + 15))
                    {
                        flag = flag1;
                        if (f2 >= (float)(k.top - 15))
                        {
                            flag = flag1;
                            if (f2 < (float)(k.bottom + 15))
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        if (flag)
        {
            m.set(motionevent.getX(), motionevent.getY());
            l = true;
            invalidate();
        } else
        {
            if (d && motionevent.getY() <= f.bottom && motionevent.getY() >= f.top)
            {
                e = (f.bottom - motionevent.getY()) / f.height();
                a(true, e);
            } else
            if (!d && motionevent.getX() <= f.right && motionevent.getX() >= f.left)
            {
                e = (motionevent.getX() - f.left) / f.width();
                a(true, e);
            }
            m.set(motionevent.getX(), motionevent.getY());
        }
          goto _L6
        if (!l) goto _L1; else goto _L7
_L7:
        if (d)
        {
            e = e - (motionevent.getY() - m.y) / f.height();
            a(true, e);
        } else
        {
            e = e + (motionevent.getX() - m.x) / f.width();
            a(true, e);
        }
        m.set(motionevent.getX(), motionevent.getY());
          goto _L6
        if (true) goto _L1; else goto _L8
_L8:
    }
}
