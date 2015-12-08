// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.roidapp.imagelib.f;
import java.math.BigDecimal;

// Referenced classes of package com.roidapp.imagelib.filter:
//            bm, bl, bn

public final class bk extends View
{

    public final int a = Color.argb(255, 51, 181, 229);
    private final Paint b = new Paint(1);
    private Integer c;
    private Integer d;
    private double e;
    private double f;
    private final Bitmap g;
    private final Bitmap h;
    private final Drawable i;
    private final Drawable j;
    private final float k;
    private final float l;
    private final float m;
    private final float n;
    private final float o;
    private final float p;
    private int q;
    private boolean r;
    private final bm s;
    private boolean t;
    private double u;
    private float v;
    private boolean w;
    private bn x;
    private float y;
    private int z;

    public bk(Integer integer, Integer integer1, Context context)
    {
        super(context);
        u = 0.5D;
        v = 3F;
        w = true;
        z = 255;
        g = BitmapFactory.decodeResource(getResources(), f.p);
        h = BitmapFactory.decodeResource(getResources(), f.q);
        i = context.getResources().getDrawable(f.e);
        j = context.getResources().getDrawable(f.f);
        c = integer;
        d = integer1;
        e = integer.doubleValue();
        f = integer1.doubleValue();
        s = bm.a(integer);
        k = g.getWidth();
        l = k * 0.5F;
        m = (float)g.getHeight() * 0.5F;
        n = 0.3F * m;
        o = l;
        p = i.getIntrinsicHeight();
        v = v * context.getResources().getDisplayMetrics().density;
        setFocusable(true);
        setFocusableInTouchMode(true);
        q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private Integer a(double d1)
    {
        Object obj;
        obj = s;
        d1 = e + (f - e) * d1;
        bl.a[((bm) (obj)).ordinal()];
        JVM INSTR tableswitch 1 7: default 72
    //                   1 101
    //                   2 116
    //                   3 124
    //                   4 137
    //                   5 149
    //                   6 163
    //                   7 177;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        throw new InstantiationError((new StringBuilder("can't convert ")).append(obj).append(" to a Number object").toString());
_L2:
        obj = new Long((long)d1);
_L10:
        return (Integer)obj;
_L3:
        obj = Double.valueOf(d1);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new Integer((int)d1);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new Float(d1);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new Short((short)(int)d1);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new Byte((byte)(int)d1);
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new BigDecimal(d1);
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void a()
    {
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    private final void a(MotionEvent motionevent)
    {
        float f1 = motionevent.getX(motionevent.findPointerIndex(z));
        int i1 = getWidth();
        double d1;
        if ((float)i1 <= o * 2.0F)
        {
            d1 = 0.0D;
        } else
        {
            d1 = Math.min(1.0D, Math.max(0.0D, (f1 - o) / ((float)i1 - o * 2.0F)));
        }
        u = Math.max(0.0D, d1);
        invalidate();
    }

    private double b()
    {
        if (0.0D == f - e)
        {
            return 0.0D;
        } else
        {
            return (0.0D - e) / (f - e);
        }
    }

    private float b(double d1)
    {
        return (float)((double)o + (double)((float)getWidth() - 2.0F * o) * d1);
    }

    private void c()
    {
        r = true;
        if (x != null)
        {
            x.a();
        }
    }

    private void d()
    {
        r = false;
        if (x != null)
        {
            x.b();
        }
    }

    public final void a(bn bn1)
    {
        x = bn1;
    }

    public final void a(Integer integer)
    {
        double d1 = 0.0D;
        if (0.0D != f - e)
        {
            d1 = (integer.doubleValue() - e) / (f - e);
        }
        u = d1;
        invalidate();
    }

    public final void a(Integer integer, Integer integer1)
    {
        c = integer;
        d = integer1;
        e = integer.doubleValue();
        f = integer1.doubleValue();
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Object obj = new RectF(o, ((float)getHeight() - n) * 0.5F, (float)getWidth() - o, ((float)getHeight() + n) * 0.5F);
        i.setBounds(new Rect((int)((RectF) (obj)).left, (int)((RectF) (obj)).top, (int)((RectF) (obj)).right, (int)((RectF) (obj)).bottom));
        i.draw(canvas);
        float f1;
        float f2;
        if (b(b()) < b(u))
        {
            obj.left = b(b());
            obj.right = b(u);
        } else
        {
            obj.right = b(b());
            obj.left = b(u);
        }
        j.setBounds(new Rect((int)((RectF) (obj)).left, (int)((RectF) (obj)).top, (int)((RectF) (obj)).right, (int)((RectF) (obj)).bottom));
        j.draw(canvas);
        f1 = b(0.5D) - v / 2.0F;
        f2 = v;
        obj = new RectF(f1, (float)getHeight() * 0.5F - p / 2.0F, f2 + f1, (float)getHeight() * 0.5F + p / 2.0F);
        b.setColor(0xff000000);
        canvas.drawRect(((RectF) (obj)), b);
        f1 = b(u);
        if (t)
        {
            obj = h;
        } else
        {
            obj = g;
        }
        canvas.drawBitmap(((Bitmap) (obj)), f1 - l, (float)getHeight() * 0.5F - m, null);
    }

    protected final void onMeasure(int i1, int j1)
    {
        this;
        JVM INSTR monitorenter ;
        if (android.view.View.MeasureSpec.getMode(i1) == 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        i1 = android.view.View.MeasureSpec.getSize(i1);
_L1:
        int l1 = g.getHeight();
        int k1 = l1;
        if (android.view.View.MeasureSpec.getMode(j1) != 0)
        {
            k1 = Math.min(l1, android.view.View.MeasureSpec.getSize(j1));
        }
        setMeasuredDimension(i1, k1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
        i1 = 200;
          goto _L1
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        i1 = 0;
        flag = false;
        if (!isEnabled())
        {
            return false;
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 64
    //                   0 66
    //                   1 293
    //                   2 182
    //                   3 457
    //                   4 64
    //                   5 370
    //                   6 402;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_457;
_L8:
        return true;
_L2:
        z = motionevent.getPointerId(motionevent.getPointerCount() - 1);
        y = motionevent.getX(motionevent.findPointerIndex(z));
        if (Math.abs(y - b(u)) <= l)
        {
            flag = true;
        }
        t = flag;
        setPressed(true);
        invalidate();
        c();
        a(motionevent);
        a();
        if (x != null)
        {
            x.a(this, a(u).intValue());
        }
          goto _L8
_L4:
        if (t)
        {
            if (r)
            {
                a(motionevent);
            } else
            if (Math.abs(motionevent.getX(motionevent.findPointerIndex(z)) - y) > (float)q)
            {
                setPressed(true);
                invalidate();
                c();
                a(motionevent);
                a();
            }
            if (w && x != null)
            {
                x.a(this, a(u).intValue());
            }
        }
          goto _L8
_L3:
        if (r)
        {
            a(motionevent);
            d();
            setPressed(false);
        } else
        {
            c();
            a(motionevent);
            d();
        }
        t = false;
        invalidate();
        if (x != null)
        {
            x.a(this, a(u).intValue());
        }
          goto _L8
_L6:
        i1 = motionevent.getPointerCount() - 1;
        y = motionevent.getX(i1);
        z = motionevent.getPointerId(i1);
_L9:
        invalidate();
          goto _L8
_L7:
        int j1 = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(j1) == z)
        {
            if (j1 == 0)
            {
                i1 = 1;
            }
            y = motionevent.getX(i1);
            z = motionevent.getPointerId(i1);
        }
        invalidate();
          goto _L8
        if (r)
        {
            d();
            setPressed(false);
        }
          goto _L9
    }
}
