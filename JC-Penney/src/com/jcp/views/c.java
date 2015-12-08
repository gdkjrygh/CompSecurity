// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import java.math.BigDecimal;

// Referenced classes of package com.jcp.views:
//            d

public class c extends ImageView
{

    protected final int a;
    protected int b;
    protected int c;
    private final Paint d = new Paint(1);
    private final Bitmap e = BitmapFactory.decodeResource(getResources(), 0x7f0201cf);
    private final Bitmap f = BitmapFactory.decodeResource(getResources(), 0x7f0201cf);
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final Number l;
    private final Number m;
    private final double n;
    private final double o;
    private double p;
    private double q;
    private boolean r;
    private d s;
    private float t;
    private int u;
    private boolean v;

    public c(Number number, Number number1, Context context)
    {
        super(context);
        g = e.getWidth();
        h = g * 0.5F;
        i = (float)e.getHeight() * 0.5F;
        j = 0.3F * i;
        k = h;
        q = 1.0D;
        c = 255;
        l = number;
        m = number1;
        n = number.doubleValue();
        o = number1.doubleValue();
        a = b(number);
        setFocusable(true);
        setFocusableInTouchMode(true);
        c();
    }

    private Number a(double d1)
    {
        return a(n + (o - n) * d1, a);
    }

    protected static Number a(double d1, int i1)
    {
        switch (i1)
        {
        default:
            throw new InstantiationError((new StringBuilder()).append("can't convert ").append(i1).append(" to a Number object").toString());

        case 0: // '\0'
            return new Long((long)d1);

        case 1: // '\001'
            return Double.valueOf(d1);

        case 2: // '\002'
            return new Integer((int)d1);

        case 3: // '\003'
            return new Float(d1);

        case 4: // '\004'
            return new Short((short)(int)d1);

        case 5: // '\005'
            return new Byte((byte)(int)d1);

        case 6: // '\006'
            return new BigDecimal(d1);
        }
    }

    private void a(float f1, boolean flag, Canvas canvas)
    {
        Bitmap bitmap;
        if (flag)
        {
            bitmap = f;
        } else
        {
            bitmap = e;
        }
        canvas.drawBitmap(bitmap, f1 - h, 0.5F * (float)getHeight() - i, d);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(i1) == c)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            t = motionevent.getX(i1);
            c = motionevent.getPointerId(i1);
        }
    }

    private boolean a(float f1, double d1)
    {
        return Math.abs(f1 - b(d1)) <= h;
    }

    private float b(double d1)
    {
        return (float)((double)k + (double)((float)getWidth() - 2.0F * k) * d1);
    }

    private int b(float f1)
    {
        boolean flag;
        boolean flag1;
        flag = a(f1, p);
        flag1 = a(f1, q);
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        if (f1 / (float)getWidth() <= 0.5F) goto _L4; else goto _L3
_L3:
        return 0;
_L4:
        return 1;
_L2:
        if (!flag)
        {
            return !flag1 ? 2 : 1;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    protected static int b(Number number)
    {
        if (number instanceof Long)
        {
            return 0;
        }
        if (number instanceof Double)
        {
            return 1;
        }
        if (number instanceof Integer)
        {
            return 2;
        }
        if (number instanceof Float)
        {
            return 3;
        }
        if (number instanceof Short)
        {
            return 4;
        }
        if (number instanceof Byte)
        {
            return 5;
        }
        if (number instanceof BigDecimal)
        {
            return 6;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Number class '").append(number.getClass().getName()).append("' is not supported").toString());
        }
    }

    private void b(MotionEvent motionevent)
    {
        float f1 = motionevent.getX(motionevent.findPointerIndex(c));
        if (b == 0)
        {
            setNormalizedMinValue(a(f1));
        } else
        if (1 == b)
        {
            setNormalizedMaxValue(a(f1));
            return;
        }
    }

    private void c()
    {
        u = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private void d()
    {
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    protected double a(float f1)
    {
        int i1 = getWidth();
        if ((float)i1 <= k * 2.0F)
        {
            return 0.0D;
        } else
        {
            return Math.min(1.0D, Math.max(0.0D, (f1 - k) / ((float)i1 - k * 2.0F)));
        }
    }

    protected double a(Number number)
    {
        if (0.0D == o - n)
        {
            return 0.0D;
        } else
        {
            return (number.doubleValue() - n) / (o - n);
        }
    }

    void a()
    {
        v = true;
    }

    void b()
    {
        v = false;
    }

    public Number getAbsoluteMaxValue()
    {
        return m;
    }

    public Number getAbsoluteMinValue()
    {
        return l;
    }

    public Number getSelectedMaxValue()
    {
        return a(q);
    }

    public Number getSelectedMinValue()
    {
        return a(p);
    }

    protected void onDraw(Canvas canvas)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        float f1;
        super.onDraw(canvas);
        RectF rectf = new RectF(k, ((float)getHeight() - j) * 0.5F, (float)getWidth() - k, ((float)getHeight() + j) * 0.5F);
        d.setStyle(android.graphics.Paint.Style.FILL);
        d.setColor(getResources().getColor(0x7f0d0047));
        d.setAntiAlias(true);
        canvas.drawRect(rectf, d);
        rectf.left = b(p);
        rectf.right = b(q);
        d.setColor(getResources().getColor(0x7f0d0048));
        canvas.drawRect(rectf, d);
        f1 = b(p);
        boolean flag;
        if (b == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(f1, flag, canvas);
        f1 = b(q);
        if (1 == b)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(f1, flag, canvas);
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        throw canvas;
    }

    protected void onMeasure(int i1, int j1)
    {
        this;
        JVM INSTR monitorenter ;
        if (android.view.View.MeasureSpec.getMode(i1) == 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        i1 = android.view.View.MeasureSpec.getSize(i1);
_L1:
        int l1 = e.getHeight();
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

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (Bundle)parcelable;
        super.onRestoreInstanceState(parcelable.getParcelable("SUPER"));
        p = parcelable.getDouble("MIN");
        q = parcelable.getDouble("MAX");
    }

    protected Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putDouble("MIN", p);
        bundle.putDouble("MAX", q);
        return bundle;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled())
        {
            return false;
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 60
    //                   0 62
    //                   1 252
    //                   2 143
    //                   3 370
    //                   4 60
    //                   5 326
    //                   6 358;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return true;
_L2:
        c = motionevent.getPointerId(motionevent.getPointerCount() - 1);
        t = motionevent.getX(motionevent.findPointerIndex(c));
        b = b(t);
        if (b == 2)
        {
            return super.onTouchEvent(motionevent);
        }
        setPressed(true);
        invalidate();
        a();
        b(motionevent);
        d();
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!v) goto _L9; else goto _L8
_L8:
        b(motionevent);
_L10:
        if (r && s != null)
        {
            s.a(this, getSelectedMinValue(), getSelectedMaxValue());
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (Math.abs(motionevent.getX(motionevent.findPointerIndex(c)) - t) > (float)u)
        {
            setPressed(true);
            invalidate();
            a();
            b(motionevent);
            d();
        }
        if (true) goto _L10; else goto _L3
_L3:
        if (v)
        {
            b(motionevent);
            b();
            setPressed(false);
        } else
        {
            a();
            b(motionevent);
            b();
        }
        b = 2;
        invalidate();
        if (s != null)
        {
            s.a(this, getSelectedMinValue(), getSelectedMaxValue());
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int i1 = motionevent.getPointerCount() - 1;
        t = motionevent.getX(i1);
        c = motionevent.getPointerId(i1);
        invalidate();
        continue; /* Loop/switch isn't completed */
_L7:
        a(motionevent);
        invalidate();
        continue; /* Loop/switch isn't completed */
_L5:
        if (v)
        {
            b();
            setPressed(false);
        }
        invalidate();
        if (true) goto _L1; else goto _L11
_L11:
    }

    public void setNormalizedMaxValue(double d1)
    {
        q = Math.max(0.0D, Math.min(1.0D, Math.max(d1, p)));
        invalidate();
    }

    public void setNormalizedMinValue(double d1)
    {
        p = Math.max(0.0D, Math.min(1.0D, Math.min(d1, q)));
        invalidate();
    }

    public void setNotifyWhileDragging(boolean flag)
    {
        r = flag;
    }

    public void setOnRangeSeekBarChangeListener(d d1)
    {
        s = d1;
    }

    public void setSelectedMaxValue(Number number)
    {
        if (0.0D == o - n)
        {
            setNormalizedMaxValue(1.0D);
            return;
        } else
        {
            setNormalizedMaxValue(a(number));
            return;
        }
    }

    public void setSelectedMinValue(Number number)
    {
        if (0.0D == o - n)
        {
            setNormalizedMinValue(0.0D);
            return;
        } else
        {
            setNormalizedMinValue(a(number));
            return;
        }
    }
}
