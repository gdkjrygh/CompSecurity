// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ba;
import android.support.v4.view.bi;
import android.support.v4.view.ck;
import android.support.v4.view.di;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.jcp.d;
import com.jcp.util.bt;

public class CarouselPageIndicator extends View
    implements di
{

    private float a;
    private final Paint b;
    private final Paint c;
    private final Paint d;
    private ViewPager e;
    private di f;
    private int g;
    private int h;
    private float i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private float o;
    private int p;
    private boolean q;

    public CarouselPageIndicator(Context context)
    {
        this(context, null);
    }

    public CarouselPageIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010119);
    }

    public CarouselPageIndicator(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = new Paint(1);
        c = new Paint(1);
        d = new Paint(1);
        o = -1F;
        p = -1;
        if (isInEditMode())
        {
            return;
        }
        Object obj = getResources();
        int j1 = ((Resources) (obj)).getColor(0x7f0d004c);
        int k1 = ((Resources) (obj)).getColor(0x7f0d004b);
        int l1 = ((Resources) (obj)).getInteger(0x7f0b0006);
        int i2 = ((Resources) (obj)).getColor(0x7f0d004d);
        float f1 = ((Resources) (obj)).getDimension(0x7f080067);
        float f2 = ((Resources) (obj)).getDimension(0x7f080066);
        boolean flag = ((Resources) (obj)).getBoolean(0x7f0a0008);
        boolean flag1 = ((Resources) (obj)).getBoolean(0x7f0a0009);
        attributeset = context.obtainStyledAttributes(attributeset, d.CirclePageIndicator, i1, 0);
        l = attributeset.getBoolean(2, flag);
        k = attributeset.getInt(0, l1);
        b.setStyle(android.graphics.Paint.Style.FILL);
        b.setColor(attributeset.getColor(5, j1));
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setColor(attributeset.getColor(8, i2));
        c.setStrokeWidth(attributeset.getDimension(3, f1));
        d.setStyle(android.graphics.Paint.Style.FILL);
        d.setColor(attributeset.getColor(4, k1));
        a = attributeset.getDimension(6, f2);
        m = attributeset.getBoolean(7, flag1);
        obj = attributeset.getDrawable(1);
        if (obj != null)
        {
            bt.a(this, ((android.graphics.drawable.Drawable) (obj)));
        }
        attributeset.recycle();
        n = ck.a(ViewConfiguration.get(context));
    }

    private int c(int i1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int j1 = android.view.View.MeasureSpec.getSize(i1);
        if (l1 == 0x40000000 || e == null)
        {
            i1 = j1;
        } else
        {
            i1 = e.getAdapter().b();
            float f1 = getPaddingLeft() + getPaddingRight();
            float f2 = i1 * 2;
            float f3 = a;
            int k1 = (int)((float)(i1 - 1) * a + (f1 + f2 * f3) + 1.0F);
            i1 = k1;
            if (l1 == 0x80000000)
            {
                return Math.min(k1, j1);
            }
        }
        return i1;
    }

    private int d(int i1)
    {
        int j1 = android.view.View.MeasureSpec.getMode(i1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        if (j1 == 0x40000000)
        {
            return i1;
        }
        int k1 = (int)(2.0F * a + (float)getPaddingTop() + (float)getPaddingBottom() + 1.0F);
        if (j1 == 0x80000000)
        {
            return Math.min(k1, i1);
        } else
        {
            return k1;
        }
    }

    public void a(int i1)
    {
        if (m || j == 0)
        {
            g = i1;
            h = i1;
            invalidate();
        }
        if (f != null)
        {
            f.a(i1);
        }
    }

    public void a(int i1, float f1, int j1)
    {
        g = i1;
        i = f1;
        invalidate();
        if (f != null)
        {
            f.a(i1, f1, j1);
        }
    }

    public void b(int i1)
    {
        j = i1;
        if (f != null)
        {
            f.b(i1);
        }
    }

    public int getFillColor()
    {
        return d.getColor();
    }

    public int getOrientation()
    {
        return k;
    }

    public int getPageColor()
    {
        return b.getColor();
    }

    public float getRadius()
    {
        return a;
    }

    public int getStrokeColor()
    {
        return c.getColor();
    }

    public float getStrokeWidth()
    {
        return c.getStrokeWidth();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i2;
        if (e != null)
        {
            if ((i2 = e.getAdapter().b()) != 0)
            {
                if (g >= i2)
                {
                    setCurrentItem(i2 - 1);
                    return;
                }
                float f1;
                float f2;
                float f3;
                float f4;
                float f6;
                int i1;
                int j1;
                int k1;
                int l1;
                if (k == 0)
                {
                    l1 = getWidth();
                    k1 = getPaddingLeft();
                    j1 = getPaddingRight();
                    i1 = getPaddingTop();
                } else
                {
                    l1 = getHeight();
                    k1 = getPaddingTop();
                    j1 = getPaddingBottom();
                    i1 = getPaddingLeft();
                }
                f6 = a * 4F;
                f1 = i1;
                f1 = a + f1;
                f3 = (float)k1 + a;
                f2 = f3;
                if (l)
                {
                    f2 = f3 + ((float)(l1 - k1 - j1) / 2.0F - ((float)i2 * f6) / 2.0F);
                }
                f4 = a;
                f3 = f4;
                if (c.getStrokeWidth() > 0.0F)
                {
                    f3 = f4 - c.getStrokeWidth() / 2.0F;
                }
                i1 = 0;
                while (i1 < i2) 
                {
                    f4 = (float)i1 * f6 + f2;
                    float f5;
                    if (k == 0)
                    {
                        f5 = f4;
                        f4 = f1;
                    } else
                    {
                        f5 = f1;
                    }
                    if (b.getAlpha() > 0)
                    {
                        canvas.drawCircle(f5, f4, f3, b);
                    }
                    if (f3 != a)
                    {
                        canvas.drawCircle(f5, f4, a, c);
                    }
                    i1++;
                }
                if (m)
                {
                    i1 = h;
                } else
                {
                    i1 = g;
                }
                f4 = (float)i1 * f6;
                f3 = f4;
                if (!m)
                {
                    f3 = f4 + i * f6;
                }
                if (k == 0)
                {
                    f3 = f2 + f3;
                    f2 = f1;
                    f1 = f3;
                } else
                {
                    f2 += f3;
                }
                canvas.drawCircle(f1, f2, a, d);
                return;
            }
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        if (k == 0)
        {
            setMeasuredDimension(c(i1), d(j1));
            return;
        } else
        {
            setMeasuredDimension(d(i1), c(j1));
            return;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        g = SavedState.a(parcelable);
        h = SavedState.a(parcelable);
        requestLayout();
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        SavedState.a(savedstate, g);
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = 0;
        if (!super.onTouchEvent(motionevent)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int j1;
        if (e == null || e.getAdapter().b() == 0)
        {
            return false;
        }
        j1 = motionevent.getAction() & 0xff;
        j1;
        JVM INSTR tableswitch 0 6: default 88
    //                   0 90
    //                   1 196
    //                   2 109
    //                   3 196
    //                   4 88
    //                   5 353
    //                   6 381;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L7 _L8
_L3:
        return true;
_L4:
        p = ba.b(motionevent, 0);
        o = motionevent.getX();
        return true;
_L6:
        float f1 = ba.c(motionevent, ba.a(motionevent, p));
        float f3 = f1 - o;
        if (!q && Math.abs(f3) > (float)n)
        {
            q = true;
            o = f1;
            if (e != null && (e.d() || e.f()))
            {
                e.b(f3);
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (q)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = e.getAdapter().b();
        int l1 = getWidth();
        float f2 = (float)l1 / 2.0F;
        float f4 = (float)l1 / 6F;
        if (g > 0 && motionevent.getX() < f2 - f4)
        {
            if (j1 != 3)
            {
                e.setCurrentItem(g - 1);
                return true;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (g >= i1 - 1 || motionevent.getX() <= f4 + f2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j1 != 3)
        {
            e.setCurrentItem(g + 1);
            return true;
        }
        if (true) goto _L1; else goto _L9
_L9:
        q = false;
        p = -1;
        if (e != null && e.f())
        {
            e.e();
            return true;
        }
          goto _L1
_L7:
        i1 = ba.b(motionevent);
        o = ba.c(motionevent, i1);
        p = ba.b(motionevent, i1);
        return true;
_L8:
        int k1 = ba.b(motionevent);
        if (ba.b(motionevent, k1) == p)
        {
            if (k1 == 0)
            {
                i1 = 1;
            }
            p = ba.b(motionevent, i1);
        }
        o = ba.c(motionevent, ba.a(motionevent, p));
        return true;
    }

    public void setCentered(boolean flag)
    {
        l = flag;
        invalidate();
    }

    public void setCurrentItem(int i1)
    {
        if (e == null)
        {
            throw new IllegalStateException("ViewPager has not been bound.");
        } else
        {
            e.setCurrentItem(i1);
            g = i1;
            invalidate();
            return;
        }
    }

    public void setFillColor(int i1)
    {
        d.setColor(i1);
        invalidate();
    }

    public void setOnPageChangeListener(di di1)
    {
        f = di1;
    }

    public void setOrientation(int i1)
    {
        switch (i1)
        {
        default:
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");

        case 0: // '\0'
        case 1: // '\001'
            k = i1;
            break;
        }
        requestLayout();
    }

    public void setPageColor(int i1)
    {
        b.setColor(i1);
        invalidate();
    }

    public void setRadius(float f1)
    {
        a = f1;
        invalidate();
    }

    public void setSnap(boolean flag)
    {
        m = flag;
        invalidate();
    }

    public void setStrokeColor(int i1)
    {
        c.setColor(i1);
        invalidate();
    }

    public void setStrokeWidth(float f1)
    {
        c.setStrokeWidth(f1);
        invalidate();
    }

    public void setViewPager(ViewPager viewpager)
    {
        if (e == viewpager)
        {
            return;
        }
        if (e != null)
        {
            e.setOnPageChangeListener(null);
        }
        if (viewpager.getAdapter() == null)
        {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        } else
        {
            e = viewpager;
            e.setOnPageChangeListener(this);
            invalidate();
            return;
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new b();
        private int a;

        static int a(SavedState savedstate)
        {
            return savedstate.a;
        }

        static int a(SavedState savedstate, int i1)
        {
            savedstate.a = i1;
            return i1;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
        }

        SavedState(Parcel parcel, a a1)
        {
            this(parcel);
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
