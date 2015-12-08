// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

// Referenced classes of package kik.android.widget:
//            da

public class ProgressWheel extends View
{
    static class WheelSavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new da();
        float a;
        float b;
        boolean c;
        float d;
        int e;
        int f;
        int g;
        int h;
        int i;
        boolean j;
        boolean k;

        public void writeToParcel(Parcel parcel, int i1)
        {
            boolean flag = true;
            super.writeToParcel(parcel, i1);
            parcel.writeFloat(a);
            parcel.writeFloat(b);
            if (c)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeByte((byte)i1);
            parcel.writeFloat(d);
            parcel.writeInt(e);
            parcel.writeInt(f);
            parcel.writeInt(g);
            parcel.writeInt(h);
            parcel.writeInt(i);
            if (j)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeByte((byte)i1);
            if (k)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeByte((byte)i1);
        }


        private WheelSavedState(Parcel parcel)
        {
            boolean flag1 = true;
            super(parcel);
            a = parcel.readFloat();
            b = parcel.readFloat();
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
            d = parcel.readFloat();
            e = parcel.readInt();
            f = parcel.readInt();
            g = parcel.readInt();
            h = parcel.readInt();
            i = parcel.readInt();
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = flag;
            if (parcel.readByte() != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            k = flag;
        }

        WheelSavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        WheelSavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public static interface a
    {
    }


    private static final String a = kik/android/widget/ProgressWheel.getSimpleName();
    private int b;
    private int c;
    private int d;
    private final int e;
    private final int f;
    private boolean g;
    private double h;
    private double i;
    private float j;
    private boolean k;
    private long l;
    private final long m;
    private int n;
    private int o;
    private Paint p;
    private Paint q;
    private RectF r;
    private float s;
    private long t;
    private boolean u;
    private float v;
    private float w;
    private float x;
    private boolean y;
    private a z;

    public ProgressWheel(Context context)
    {
        super(context);
        b = 28;
        c = 3;
        d = 3;
        e = 16;
        f = 270;
        g = false;
        h = 0.0D;
        i = 460D;
        j = 0.0F;
        k = true;
        l = 0L;
        m = 200L;
        n = 0xaa000000;
        o = 0xffffff;
        p = new Paint();
        q = new Paint();
        r = new RectF();
        s = 230F;
        t = 0L;
        v = 0.0F;
        w = 0.0F;
        x = 0.0F;
        y = false;
    }

    public ProgressWheel(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 28;
        c = 3;
        d = 3;
        e = 16;
        f = 270;
        g = false;
        h = 0.0D;
        i = 460D;
        j = 0.0F;
        k = true;
        l = 0L;
        m = 200L;
        n = 0xaa000000;
        o = 0xffffff;
        p = new Paint();
        q = new Paint();
        r = new RectF();
        s = 230F;
        t = 0L;
        v = 0.0F;
        w = 0.0F;
        x = 0.0F;
        y = false;
        context = context.obtainStyledAttributes(attributeset, kik.android.ag.b.n);
        attributeset = getContext().getResources().getDisplayMetrics();
        c = (int)TypedValue.applyDimension(1, c, attributeset);
        d = (int)TypedValue.applyDimension(1, d, attributeset);
        b = (int)TypedValue.applyDimension(1, b, attributeset);
        b = (int)context.getDimension(6, b);
        g = context.getBoolean(7, false);
        c = (int)context.getDimension(8, c);
        d = (int)context.getDimension(3, d);
        s = context.getFloat(4, s / 360F) * 360F;
        i = context.getInt(5, (int)i);
        n = context.getColor(1, n);
        o = context.getColor(2, o);
        u = context.getBoolean(9, false);
        if (context.getBoolean(0, false))
        {
            t = SystemClock.uptimeMillis();
            y = true;
            invalidate();
        }
        context.recycle();
    }

    private void d()
    {
        if (z != null)
        {
            Math.round((w * 100F) / 360F);
        }
    }

    public final void a()
    {
        w = 0.0F;
        x = 0.0F;
        invalidate();
    }

    public final void a(float f1)
    {
        if (y)
        {
            w = 0.0F;
            y = false;
            d();
        }
        if (f1 <= 1.0F) goto _L2; else goto _L1
_L1:
        float f2 = f1 - 1.0F;
_L4:
        if (f2 == x)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        f2 = f1;
        if (f1 < 0.0F)
        {
            f2 = 0.0F;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (w == x)
        {
            t = SystemClock.uptimeMillis();
        }
        x = Math.min(f2 * 360F, 360F);
        invalidate();
        return;
    }

    public final float b()
    {
        if (y)
        {
            return -1F;
        } else
        {
            return w / 360F;
        }
    }

    public final void c()
    {
        s = 119.88F;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawArc(r, 360F, 360F, false, q);
        if (y)
        {
            w = ((float)(SystemClock.uptimeMillis() - t) * s) / 1000F + w;
            if (w > 360F)
            {
                w = w - 360F;
            }
            t = SystemClock.uptimeMillis();
            float f1 = w - 90F;
            float f3 = 16F + j;
            if (isInEditMode())
            {
                f1 = 0.0F;
                f3 = 135F;
            }
            canvas.drawArc(r, f1, f3, false, p);
        } else
        {
            long l1 = SystemClock.uptimeMillis() - t;
            float f2 = ((float)l1 * s) / 1000F;
            float f4 = w;
            if (w != x)
            {
                w = Math.min(w + f2, x);
            }
            if (f4 != w)
            {
                d();
            }
            if (l >= 200L)
            {
                double d1 = h;
                h = (double)l1 + d1;
                float f5;
                if (h > i)
                {
                    h = h - i;
                    l = 0L;
                    boolean flag;
                    if (!k)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    k = flag;
                }
                f5 = (float)Math.cos((h / i + 1.0D) * 3.1415926535897931D) / 2.0F + 0.5F;
                if (k)
                {
                    j = f5 * 254F;
                } else
                {
                    f5 = (1.0F - f5) * 254F;
                    v = v + (j - f5);
                    j = f5;
                }
            } else
            {
                l = l1 + l;
            }
            v = v + f2 * 2.0F;
            if (v > 360F)
            {
                v = v - 360F;
            }
            t = SystemClock.uptimeMillis();
            canvas.drawArc(r, v - 90F, w, false, p);
        }
        invalidate();
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        int i2 = b + getPaddingLeft() + getPaddingRight();
        int k1 = b + getPaddingTop() + getPaddingBottom();
        int k2 = android.view.View.MeasureSpec.getMode(i1);
        int j2 = android.view.View.MeasureSpec.getSize(i1);
        int l2 = android.view.View.MeasureSpec.getMode(j1);
        int l1 = android.view.View.MeasureSpec.getSize(j1);
        if (k2 != 0x40000000)
        {
            i1 = i2;
            if (k2 == 0x80000000)
            {
                i1 = Math.min(i2, j2);
            }
        } else
        {
            i1 = j2;
        }
        if (l2 != 0x40000000 && k2 != 0x40000000) goto _L2; else goto _L1
_L1:
        j1 = l1;
_L4:
        setMeasuredDimension(i1, j1);
        return;
_L2:
        j1 = k1;
        if (l2 == 0x80000000)
        {
            j1 = Math.min(k1, l1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof WheelSavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (WheelSavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            w = ((WheelSavedState) (parcelable)).a;
            x = ((WheelSavedState) (parcelable)).b;
            y = ((WheelSavedState) (parcelable)).c;
            s = ((WheelSavedState) (parcelable)).d;
            c = ((WheelSavedState) (parcelable)).e;
            n = ((WheelSavedState) (parcelable)).f;
            d = ((WheelSavedState) (parcelable)).g;
            o = ((WheelSavedState) (parcelable)).h;
            b = ((WheelSavedState) (parcelable)).i;
            u = ((WheelSavedState) (parcelable)).j;
            g = ((WheelSavedState) (parcelable)).k;
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        WheelSavedState wheelsavedstate = new WheelSavedState(super.onSaveInstanceState());
        wheelsavedstate.a = w;
        wheelsavedstate.b = x;
        wheelsavedstate.c = y;
        wheelsavedstate.d = s;
        wheelsavedstate.e = c;
        wheelsavedstate.f = n;
        wheelsavedstate.g = d;
        wheelsavedstate.h = o;
        wheelsavedstate.i = b;
        wheelsavedstate.j = u;
        wheelsavedstate.k = g;
        return wheelsavedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        l1 = getPaddingTop();
        int i2 = getPaddingBottom();
        int j2 = getPaddingLeft();
        int k2 = getPaddingRight();
        if (!g)
        {
            k1 = Math.min(Math.min(i1 - j2 - k2, j1 - i2 - l1), b * 2 - c * 2);
            i1 = j2 + (i1 - j2 - k2 - k1) / 2;
            j1 = l1 + (j1 - l1 - i2 - k1) / 2;
            r = new RectF(c + i1, c + j1, (i1 + k1) - c, (j1 + k1) - c);
        } else
        {
            r = new RectF(j2 + c, l1 + c, i1 - k2 - c, j1 - i2 - c);
        }
        p.setColor(n);
        p.setAntiAlias(true);
        p.setStyle(android.graphics.Paint.Style.STROKE);
        p.setStrokeWidth(c);
        q.setColor(o);
        q.setAntiAlias(true);
        q.setStyle(android.graphics.Paint.Style.STROKE);
        q.setStrokeWidth(d);
        invalidate();
    }

    protected void onVisibilityChanged(View view, int i1)
    {
        super.onVisibilityChanged(view, i1);
        if (i1 == 0)
        {
            t = SystemClock.uptimeMillis();
        }
    }

}
