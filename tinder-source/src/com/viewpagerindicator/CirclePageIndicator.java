// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ab;
import android.support.v4.view.n;
import android.support.v4.view.t;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

// Referenced classes of package com.viewpagerindicator:
//            a

public class CirclePageIndicator extends View
    implements a
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
        int a;

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

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private final Paint a;
    private final Paint b;
    private final Paint c;
    private int d;
    private float e;
    private ViewPager f;
    private android.support.v4.view.ViewPager.f g;
    private int h;
    private int i;
    private float j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private float p;
    private boolean q;
    private float r;

    public CirclePageIndicator(Context context)
    {
        this(context, null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.a.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = new Paint(1);
        b = new Paint(1);
        c = new Paint(1);
        d = -1;
        p = -1F;
        if (isInEditMode())
        {
            return;
        }
        Object obj = getResources();
        int j1 = ((Resources) (obj)).getColor(b.c.default_circle_indicator_page_color);
        int k1 = ((Resources) (obj)).getColor(b.c.default_circle_indicator_fill_color);
        int l1 = ((Resources) (obj)).getInteger(b.e.default_circle_indicator_orientation);
        int i2 = ((Resources) (obj)).getColor(b.c.default_circle_indicator_stroke_color);
        float f1 = ((Resources) (obj)).getDimension(b.d.default_circle_indicator_stroke_width);
        float f2 = ((Resources) (obj)).getDimension(b.d.default_circle_indicator_radius);
        boolean flag = ((Resources) (obj)).getBoolean(b.b.default_circle_indicator_centered);
        boolean flag1 = ((Resources) (obj)).getBoolean(b.b.default_circle_indicator_snap);
        attributeset = context.obtainStyledAttributes(attributeset, b.f.CirclePageIndicator, i1, 0);
        m = attributeset.getBoolean(b.f.CirclePageIndicator_centered, flag);
        l = attributeset.getInt(b.f.CirclePageIndicator_android_orientation, l1);
        a.setStyle(android.graphics.Paint.Style.FILL);
        a.setColor(attributeset.getColor(b.f.CirclePageIndicator_pageColor, j1));
        b.setStyle(android.graphics.Paint.Style.STROKE);
        b.setColor(attributeset.getColor(b.f.CirclePageIndicator_strokeColor, i2));
        b.setStrokeWidth(attributeset.getDimension(b.f.CirclePageIndicator_strokeWidth, f1));
        c.setStyle(android.graphics.Paint.Style.FILL);
        c.setColor(attributeset.getColor(b.f.CirclePageIndicator_fillColor, k1));
        e = attributeset.getDimension(b.f.CirclePageIndicator_radius, f2);
        n = attributeset.getBoolean(b.f.CirclePageIndicator_snap, flag1);
        r = attributeset.getDimension(b.f.CirclePageIndicator_extraSpacing, 0.0F);
        obj = attributeset.getDrawable(b.f.CirclePageIndicator_android_background);
        if (obj != null)
        {
            setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
        }
        attributeset.recycle();
        o = ab.a(ViewConfiguration.get(context));
    }

    private int c(int i1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int j1 = android.view.View.MeasureSpec.getSize(i1);
        if (l1 == 0x40000000 || f == null)
        {
            i1 = j1;
        } else
        {
            i1 = f.getAdapter().getCount();
            float f1 = getPaddingLeft() + getPaddingRight();
            float f2 = i1 * 2;
            float f3 = e;
            int k1 = (int)((float)(i1 - 1) * (e + r) + (f1 + f2 * f3) + 1.0F);
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
        int k1 = (int)(2.0F * e + (float)getPaddingTop() + (float)getPaddingBottom() + 1.0F);
        if (j1 == 0x80000000)
        {
            return Math.min(k1, i1);
        } else
        {
            return k1;
        }
    }

    public final void a(int i1)
    {
        k = i1;
        if (g != null)
        {
            g.a(i1);
        }
    }

    public final void a(int i1, float f1, int j1)
    {
        h = i1;
        j = f1;
        invalidate();
        if (g != null)
        {
            g.a(i1, f1, j1);
        }
    }

    public final void a(ViewPager viewpager, int i1)
    {
        setViewPager(viewpager);
        setCurrentItem(i1);
    }

    public final void b(int i1)
    {
        if (n || k == 0)
        {
            h = i1;
            i = i1;
            invalidate();
        }
        if (g != null)
        {
            g.b(i1);
        }
    }

    public int getFillColor()
    {
        return c.getColor();
    }

    public int getOrientation()
    {
        return l;
    }

    public int getPageColor()
    {
        return a.getColor();
    }

    public float getRadius()
    {
        return e;
    }

    public int getStrokeColor()
    {
        return b.getColor();
    }

    public float getStrokeWidth()
    {
        return b.getStrokeWidth();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i2;
        if (f != null)
        {
            if ((i2 = f.getAdapter().getCount()) != 0)
            {
                if (h >= i2)
                {
                    setCurrentItem(i2 - 1);
                    return;
                }
                float f1;
                float f2;
                float f4;
                float f6;
                float f9;
                int i1;
                int j1;
                int k1;
                int l1;
                if (l == 0)
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
                f9 = e * 3F + r;
                f1 = i1;
                f1 = e + f1;
                f2 = (float)k1 + e;
                if (m)
                {
                    float f3 = e;
                    float f5 = i2;
                    float f7 = e;
                    float f10 = i2 - 1;
                    f2 += (float)(l1 - k1 - j1) / 2.0F - (f3 * 2.0F * f5 + f7 * f10) / 2.0F;
                    f1 = ((float)(getHeight() - getPaddingTop() - getPaddingBottom()) / 2.0F - e) + f1;
                }
                f6 = e;
                f4 = f6;
                if (b.getStrokeWidth() > 0.0F)
                {
                    f4 = f6 - b.getStrokeWidth() / 2.0F;
                }
                i1 = 0;
                while (i1 < i2) 
                {
                    f6 = (float)i1 * f9 + f2;
                    float f8;
                    if (l == 0)
                    {
                        f8 = f1;
                    } else
                    {
                        f8 = f6;
                        f6 = f1;
                    }
                    if (a.getAlpha() > 0)
                    {
                        canvas.drawCircle(f6, f8, f4, a);
                    }
                    if (f4 != e)
                    {
                        canvas.drawCircle(f6, f8, e, b);
                    }
                    i1++;
                }
                if (n)
                {
                    i1 = i;
                } else
                {
                    i1 = h;
                }
                f6 = (float)i1 * f9;
                f4 = f6;
                if (!n)
                {
                    f4 = f6 + j * f9;
                }
                if (l == 0)
                {
                    f4 = f2 + f4;
                    f2 = f1;
                } else
                {
                    f2 += f4;
                    f4 = f1;
                }
                canvas.drawCircle(f4, f2, e, c);
                return;
            }
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        if (l == 0)
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
        h = ((SavedState) (parcelable)).a;
        i = ((SavedState) (parcelable)).a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = h;
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
        if (f == null || f.getAdapter().getCount() == 0)
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
    //                   5 346
    //                   6 374;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L7 _L8
_L3:
        return true;
_L4:
        d = android.support.v4.view.n.b(motionevent, 0);
        p = motionevent.getX();
        return true;
_L6:
        float f1 = android.support.v4.view.n.c(motionevent, android.support.v4.view.n.a(motionevent, d));
        float f3 = f1 - p;
        if (!q && Math.abs(f3) > (float)o)
        {
            q = true;
        }
        if (q)
        {
            p = f1;
            if (f.isFakeDragging() || f.beginFakeDrag())
            {
                f.fakeDragBy(f3);
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (q)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = f.getAdapter().getCount();
        int l1 = getWidth();
        float f2 = (float)l1 / 2.0F;
        float f4 = (float)l1 / 6F;
        if (h > 0 && motionevent.getX() < f2 - f4)
        {
            if (j1 != 3)
            {
                f.setCurrentItem(h - 1);
                return true;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (h >= i1 - 1 || motionevent.getX() <= f4 + f2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j1 != 3)
        {
            f.setCurrentItem(h + 1);
            return true;
        }
        if (true) goto _L1; else goto _L9
_L9:
        q = false;
        d = -1;
        if (f.isFakeDragging())
        {
            f.endFakeDrag();
            return true;
        }
          goto _L1
_L7:
        i1 = android.support.v4.view.n.b(motionevent);
        p = android.support.v4.view.n.c(motionevent, i1);
        d = android.support.v4.view.n.b(motionevent, i1);
        return true;
_L8:
        int k1 = android.support.v4.view.n.b(motionevent);
        if (android.support.v4.view.n.b(motionevent, k1) == d)
        {
            if (k1 == 0)
            {
                i1 = 1;
            }
            d = android.support.v4.view.n.b(motionevent, i1);
        }
        p = android.support.v4.view.n.c(motionevent, android.support.v4.view.n.a(motionevent, d));
        return true;
    }

    public void setCentered(boolean flag)
    {
        m = flag;
        invalidate();
    }

    public void setCurrentItem(int i1)
    {
        if (f == null)
        {
            throw new IllegalStateException("ViewPager has not been bound.");
        } else
        {
            f.setCurrentItem(i1);
            h = i1;
            invalidate();
            return;
        }
    }

    public void setFillColor(int i1)
    {
        c.setColor(i1);
        invalidate();
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.f f1)
    {
        g = f1;
    }

    public void setOrientation(int i1)
    {
        switch (i1)
        {
        default:
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");

        case 0: // '\0'
        case 1: // '\001'
            l = i1;
            break;
        }
        requestLayout();
    }

    public void setPageColor(int i1)
    {
        a.setColor(i1);
        invalidate();
    }

    public void setRadius(float f1)
    {
        e = f1;
        invalidate();
    }

    public void setSnap(boolean flag)
    {
        n = flag;
        invalidate();
    }

    public void setStrokeColor(int i1)
    {
        b.setColor(i1);
        invalidate();
    }

    public void setStrokeWidth(float f1)
    {
        b.setStrokeWidth(f1);
        invalidate();
    }

    public void setViewPager(ViewPager viewpager)
    {
        if (f == viewpager)
        {
            return;
        }
        if (f != null)
        {
            f.setOnPageChangeListener(null);
        }
        if (viewpager.getAdapter() == null)
        {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        } else
        {
            f = viewpager;
            f.setOnPageChangeListener(this);
            invalidate();
            return;
        }
    }
}
