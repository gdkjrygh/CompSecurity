// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.n;
import android.support.v4.view.t;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.viewpagerindicator:
//            a

public final class LinePageIndicator extends View
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
    private ViewPager c;
    private android.support.v4.view.ViewPager.f d;
    private int e;
    private boolean f;
    private float g;
    private float h;
    private int i;
    private float j;
    private int k;
    private boolean l;

    public final void a(int i1)
    {
        if (d != null)
        {
            d.a(i1);
        }
    }

    public final void a(int i1, float f1, int j1)
    {
        if (d != null)
        {
            d.a(i1, f1, j1);
        }
    }

    public final void b(int i1)
    {
        e = i1;
        invalidate();
        if (d != null)
        {
            d.b(i1);
        }
    }

    public final float getGapWidth()
    {
        return h;
    }

    public final float getLineWidth()
    {
        return g;
    }

    public final int getSelectedColor()
    {
        return b.getColor();
    }

    public final float getStrokeWidth()
    {
        return b.getStrokeWidth();
    }

    public final int getUnselectedColor()
    {
        return a.getColor();
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (c != null) goto _L2; else goto _L1
_L1:
        int j1;
        return;
_L2:
        if ((j1 = c.getAdapter().getCount()) != 0)
        {
            if (e >= j1)
            {
                setCurrentItem(j1 - 1);
                return;
            }
            float f2 = g + h;
            float f4 = j1;
            float f6 = h;
            float f3 = getPaddingTop();
            float f1 = getPaddingLeft();
            float f8 = getPaddingRight();
            f3 += ((float)getHeight() - f3 - (float)getPaddingBottom()) / 2.0F;
            if (f)
            {
                f1 += ((float)getWidth() - f1 - f8) / 2.0F - (f4 * f2 - f6) / 2.0F;
            }
            int i1 = 0;
            while (i1 < j1) 
            {
                float f5 = f1 + (float)i1 * f2;
                float f7 = g;
                Paint paint;
                if (i1 == e)
                {
                    paint = b;
                } else
                {
                    paint = a;
                }
                canvas.drawLine(f5, f3, f5 + f7, f3, paint);
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected final void onMeasure(int i1, int j1)
    {
        int k1 = android.view.View.MeasureSpec.getMode(i1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        float f1;
        if (k1 == 0x40000000 || c == null)
        {
            f1 = i1;
        } else
        {
            int l1 = c.getAdapter().getCount();
            f1 = getPaddingLeft() + getPaddingRight();
            float f2 = l1;
            float f4 = g;
            f2 = (float)(l1 - 1) * h + (f1 + f2 * f4);
            f1 = f2;
            if (k1 == 0x80000000)
            {
                f1 = Math.min(f2, i1);
            }
        }
        i1 = (int)Math.ceil(f1);
        k1 = android.view.View.MeasureSpec.getMode(j1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        if (k1 == 0x40000000)
        {
            f1 = j1;
        } else
        {
            float f3 = b.getStrokeWidth() + (float)getPaddingTop() + (float)getPaddingBottom();
            f1 = f3;
            if (k1 == 0x80000000)
            {
                f1 = Math.min(f3, j1);
            }
        }
        setMeasuredDimension(i1, (int)Math.ceil(f1));
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        e = ((SavedState) (parcelable)).a;
        requestLayout();
    }

    public final Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = e;
        return savedstate;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = 0;
        if (!super.onTouchEvent(motionevent)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int j1;
        if (c == null || c.getAdapter().getCount() == 0)
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
    //                   5 345
    //                   6 373;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L7 _L8
_L3:
        return true;
_L4:
        k = n.b(motionevent, 0);
        j = motionevent.getX();
        return true;
_L6:
        float f1 = n.c(motionevent, n.a(motionevent, k));
        float f3 = f1 - j;
        if (!l && Math.abs(f3) > (float)i)
        {
            l = true;
        }
        if (l)
        {
            j = f1;
            if (c.isFakeDragging() || c.beginFakeDrag())
            {
                c.fakeDragBy(f3);
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (l)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = c.getAdapter().getCount();
        int l1 = getWidth();
        float f2 = (float)l1 / 2.0F;
        float f4 = (float)l1 / 6F;
        if (e > 0 && motionevent.getX() < f2 - f4)
        {
            if (j1 != 3)
            {
                c.setCurrentItem(e - 1);
                return true;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (e >= i1 - 1 || motionevent.getX() <= f4 + f2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j1 != 3)
        {
            c.setCurrentItem(e + 1);
            return true;
        }
        if (true) goto _L1; else goto _L9
_L9:
        l = false;
        k = -1;
        if (c.isFakeDragging())
        {
            c.endFakeDrag();
            return true;
        }
          goto _L1
_L7:
        i1 = n.b(motionevent);
        j = n.c(motionevent, i1);
        k = n.b(motionevent, i1);
        return true;
_L8:
        int k1 = n.b(motionevent);
        if (n.b(motionevent, k1) == k)
        {
            if (k1 == 0)
            {
                i1 = 1;
            }
            k = n.b(motionevent, i1);
        }
        j = n.c(motionevent, n.a(motionevent, k));
        return true;
    }

    public final void setCentered(boolean flag)
    {
        f = flag;
        invalidate();
    }

    public final void setCurrentItem(int i1)
    {
        if (c == null)
        {
            throw new IllegalStateException("ViewPager has not been bound.");
        } else
        {
            c.setCurrentItem(i1);
            e = i1;
            invalidate();
            return;
        }
    }

    public final void setGapWidth(float f1)
    {
        h = f1;
        invalidate();
    }

    public final void setLineWidth(float f1)
    {
        g = f1;
        invalidate();
    }

    public final void setOnPageChangeListener(android.support.v4.view.ViewPager.f f1)
    {
        d = f1;
    }

    public final void setSelectedColor(int i1)
    {
        b.setColor(i1);
        invalidate();
    }

    public final void setStrokeWidth(float f1)
    {
        b.setStrokeWidth(f1);
        a.setStrokeWidth(f1);
        invalidate();
    }

    public final void setUnselectedColor(int i1)
    {
        a.setColor(i1);
        invalidate();
    }

    public final void setViewPager(ViewPager viewpager)
    {
        if (c == viewpager)
        {
            return;
        }
        if (c != null)
        {
            c.setOnPageChangeListener(null);
        }
        if (viewpager.getAdapter() == null)
        {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        } else
        {
            c = viewpager;
            c.setOnPageChangeListener(this);
            invalidate();
            return;
        }
    }
}
