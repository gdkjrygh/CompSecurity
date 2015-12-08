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

public final class UnderlinePageIndicator extends View
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
    private boolean b;
    private int c;
    private int d;
    private int e;
    private final Runnable f;
    private ViewPager g;
    private android.support.v4.view.ViewPager.f h;
    private int i;
    private int j;
    private float k;
    private int l;
    private float m;
    private int n;
    private boolean o;

    static boolean a(UnderlinePageIndicator underlinepageindicator)
    {
        return underlinepageindicator.b;
    }

    static Runnable b(UnderlinePageIndicator underlinepageindicator)
    {
        return underlinepageindicator.f;
    }

    public final void a(int i1)
    {
        i = i1;
        if (h != null)
        {
            h.a(i1);
        }
    }

    public final void a(int i1, float f1, int j1)
    {
        j = i1;
        k = f1;
        if (!b) goto _L2; else goto _L1
_L1:
        if (j1 <= 0) goto _L4; else goto _L3
_L3:
        removeCallbacks(f);
        a.setAlpha(255);
_L2:
        invalidate();
        if (h != null)
        {
            h.a(i1, f1, j1);
        }
        return;
_L4:
        if (i != 1)
        {
            postDelayed(f, c);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void b(int i1)
    {
        if (i == 0)
        {
            j = i1;
            k = 0.0F;
            invalidate();
            f.run();
        }
        if (h != null)
        {
            h.b(i1);
        }
    }

    public final int getFadeDelay()
    {
        return c;
    }

    public final int getFadeLength()
    {
        return d;
    }

    public final boolean getFades()
    {
        return b;
    }

    public final int getSelectedColor()
    {
        return a.getColor();
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i1;
        if (g != null)
        {
            if ((i1 = g.getAdapter().getCount()) != 0)
            {
                if (j >= i1)
                {
                    setCurrentItem(i1 - 1);
                    return;
                } else
                {
                    int j1 = getPaddingLeft();
                    float f1 = (float)(getWidth() - j1 - getPaddingRight()) / ((float)i1 * 1.0F);
                    float f2 = (float)j1 + ((float)j + k) * f1;
                    canvas.drawRect(f2, getPaddingTop(), f2 + f1, getHeight() - getPaddingBottom(), a);
                    return;
                }
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        j = ((SavedState) (parcelable)).a;
        requestLayout();
    }

    public final Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = j;
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
        if (g == null || g.getAdapter().getCount() == 0)
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
        n = android.support.v4.view.n.b(motionevent, 0);
        m = motionevent.getX();
        return true;
_L6:
        float f1 = android.support.v4.view.n.c(motionevent, android.support.v4.view.n.a(motionevent, n));
        float f3 = f1 - m;
        if (!o && Math.abs(f3) > (float)l)
        {
            o = true;
        }
        if (o)
        {
            m = f1;
            if (g.isFakeDragging() || g.beginFakeDrag())
            {
                g.fakeDragBy(f3);
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (o)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = g.getAdapter().getCount();
        int l1 = getWidth();
        float f2 = (float)l1 / 2.0F;
        float f4 = (float)l1 / 6F;
        if (j > 0 && motionevent.getX() < f2 - f4)
        {
            if (j1 != 3)
            {
                g.setCurrentItem(j - 1);
                return true;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j >= i1 - 1 || motionevent.getX() <= f4 + f2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j1 != 3)
        {
            g.setCurrentItem(j + 1);
            return true;
        }
        if (true) goto _L1; else goto _L9
_L9:
        o = false;
        n = -1;
        if (g.isFakeDragging())
        {
            g.endFakeDrag();
            return true;
        }
          goto _L1
_L7:
        i1 = android.support.v4.view.n.b(motionevent);
        m = android.support.v4.view.n.c(motionevent, i1);
        n = android.support.v4.view.n.b(motionevent, i1);
        return true;
_L8:
        int k1 = android.support.v4.view.n.b(motionevent);
        if (android.support.v4.view.n.b(motionevent, k1) == n)
        {
            if (k1 == 0)
            {
                i1 = 1;
            }
            n = android.support.v4.view.n.b(motionevent, i1);
        }
        m = android.support.v4.view.n.c(motionevent, android.support.v4.view.n.a(motionevent, n));
        return true;
    }

    public final void setCurrentItem(int i1)
    {
        if (g == null)
        {
            throw new IllegalStateException("ViewPager has not been bound.");
        } else
        {
            g.setCurrentItem(i1);
            j = i1;
            invalidate();
            return;
        }
    }

    public final void setFadeDelay(int i1)
    {
        c = i1;
    }

    public final void setFadeLength(int i1)
    {
        d = i1;
        e = 255 / (d / 30);
    }

    public final void setFades(boolean flag)
    {
label0:
        {
            if (flag != b)
            {
                b = flag;
                if (!flag)
                {
                    break label0;
                }
                post(f);
            }
            return;
        }
        removeCallbacks(f);
        a.setAlpha(255);
        invalidate();
    }

    public final void setOnPageChangeListener(android.support.v4.view.ViewPager.f f1)
    {
        h = f1;
    }

    public final void setSelectedColor(int i1)
    {
        a.setColor(i1);
        invalidate();
    }

    public final void setViewPager(ViewPager viewpager)
    {
        if (g == viewpager)
        {
            return;
        }
        if (g != null)
        {
            g.setOnPageChangeListener(null);
        }
        if (viewpager.getAdapter() == null)
        {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        } else
        {
            g = viewpager;
            g.setOnPageChangeListener(this);
            invalidate();
            post(new Runnable() {

                final UnderlinePageIndicator a;

                public final void run()
                {
                    if (UnderlinePageIndicator.a(a))
                    {
                        a.post(UnderlinePageIndicator.b(a));
                    }
                }

            
            {
                a = UnderlinePageIndicator.this;
                super();
            }
            });
            return;
        }
    }
}
