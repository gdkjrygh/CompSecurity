// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.n;
import android.support.v4.view.t;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.viewpagerindicator:
//            a

public final class TitlePageIndicator extends View
    implements com.viewpagerindicator.a
{
    public static final class IndicatorStyle extends Enum
    {

        public static final IndicatorStyle a;
        public static final IndicatorStyle b;
        public static final IndicatorStyle c;
        private static final IndicatorStyle e[];
        public final int d;

        public static IndicatorStyle valueOf(String s1)
        {
            return (IndicatorStyle)Enum.valueOf(com/viewpagerindicator/TitlePageIndicator$IndicatorStyle, s1);
        }

        public static IndicatorStyle[] values()
        {
            return (IndicatorStyle[])e.clone();
        }

        static 
        {
            a = new IndicatorStyle("None", 0, 0);
            b = new IndicatorStyle("Triangle", 1, 1);
            c = new IndicatorStyle("Underline", 2, 2);
            e = (new IndicatorStyle[] {
                a, b, c
            });
        }

        private IndicatorStyle(String s1, int i1, int j1)
        {
            super(s1, i1);
            d = j1;
        }
    }

    public static final class LinePosition extends Enum
    {

        public static final LinePosition a;
        public static final LinePosition b;
        private static final LinePosition d[];
        public final int c;

        public static LinePosition valueOf(String s1)
        {
            return (LinePosition)Enum.valueOf(com/viewpagerindicator/TitlePageIndicator$LinePosition, s1);
        }

        public static LinePosition[] values()
        {
            return (LinePosition[])d.clone();
        }

        static 
        {
            a = new LinePosition("Bottom", 0, 0);
            b = new LinePosition("Top", 1, 1);
            d = (new LinePosition[] {
                a, b
            });
        }

        private LinePosition(String s1, int i1, int j1)
        {
            super(s1, i1);
            c = j1;
        }
    }

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

    public static interface a
    {
    }


    private a A;
    private final Paint a;
    private final Rect b;
    private final Paint c;
    private final Paint d;
    private ViewPager e;
    private android.support.v4.view.ViewPager.f f;
    private int g;
    private float h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private Path m;
    private IndicatorStyle n;
    private LinePosition o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private int w;
    private float x;
    private int y;
    private boolean z;

    private void a(Rect rect, float f1, int i1)
    {
        rect.right = (int)((float)i1 - u);
        rect.left = (int)((float)rect.right - f1);
    }

    private void b(Rect rect, float f1, int i1)
    {
        rect.left = (int)((float)i1 + u);
        rect.right = (int)(u + f1);
    }

    private CharSequence c(int i1)
    {
        CharSequence charsequence = e.getAdapter().getPageTitle(i1);
        Object obj = charsequence;
        if (charsequence == null)
        {
            obj = "";
        }
        return ((CharSequence) (obj));
    }

    public final void a(int i1)
    {
        i = i1;
        if (f != null)
        {
            f.a(i1);
        }
    }

    public final void a(int i1, float f1, int j1)
    {
        g = i1;
        h = f1;
        invalidate();
        if (f != null)
        {
            f.a(i1, f1, j1);
        }
    }

    public final void b(int i1)
    {
        if (i == 0)
        {
            g = i1;
            invalidate();
        }
        if (f != null)
        {
            f.b(i1);
        }
    }

    public final float getClipPadding()
    {
        return u;
    }

    public final int getFooterColor()
    {
        return c.getColor();
    }

    public final float getFooterIndicatorHeight()
    {
        return p;
    }

    public final float getFooterIndicatorPadding()
    {
        return r;
    }

    public final IndicatorStyle getFooterIndicatorStyle()
    {
        return n;
    }

    public final float getFooterLineHeight()
    {
        return v;
    }

    public final LinePosition getLinePosition()
    {
        return o;
    }

    public final int getSelectedColor()
    {
        return l;
    }

    public final int getTextColor()
    {
        return k;
    }

    public final float getTextSize()
    {
        return a.getTextSize();
    }

    public final float getTitlePadding()
    {
        return s;
    }

    public final float getTopPadding()
    {
        return t;
    }

    public final Typeface getTypeface()
    {
        return a.getTypeface();
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int l3;
        if (e != null)
        {
            if ((l3 = e.getAdapter().getCount()) != 0)
            {
                if (g == -1 && e != null)
                {
                    g = e.getCurrentItem();
                }
                Object obj1 = a;
                Object obj = new ArrayList();
                int k1 = e.getAdapter().getCount();
                int l1 = getWidth();
                int i2 = l1 / 2;
                for (int i1 = 0; i1 < k1; i1++)
                {
                    Rect rect3 = new Rect();
                    CharSequence charsequence1 = c(i1);
                    rect3.right = (int)((Paint) (obj1)).measureText(charsequence1, 0, charsequence1.length());
                    rect3.bottom = (int)(((Paint) (obj1)).descent() - ((Paint) (obj1)).ascent());
                    int j2 = rect3.right - rect3.left;
                    int j3 = rect3.bottom;
                    int i4 = rect3.top;
                    rect3.left = (int)(((float)i2 - (float)j2 / 2.0F) + ((float)(i1 - g) - h) * (float)l1);
                    rect3.right = j2 + rect3.left;
                    rect3.top = 0;
                    rect3.bottom = j3 - i4;
                    ((ArrayList) (obj)).add(rect3);
                }

                int j4 = ((ArrayList) (obj)).size();
                if (g >= j4)
                {
                    setCurrentItem(j4 - 1);
                    return;
                }
                float f3 = (float)getWidth() / 2.0F;
                int l4 = getLeft();
                float f2 = (float)l4 + u;
                int k4 = getWidth();
                int k3 = getHeight();
                int i5 = l4 + k4;
                float f6 = (float)i5 - u;
                int j1 = g;
                float f1;
                float f5;
                if ((double)h <= 0.5D)
                {
                    f1 = h;
                } else
                {
                    f1 = h;
                    j1++;
                    f1 = 1.0F - f1;
                }
                if (f1 <= 0.25F)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                if (f1 <= 0.05F)
                {
                    l1 = 1;
                } else
                {
                    l1 = 0;
                }
                f5 = (0.25F - f1) / 0.25F;
                obj1 = (Rect)((ArrayList) (obj)).get(g);
                f1 = ((Rect) (obj1)).right - ((Rect) (obj1)).left;
                if ((float)((Rect) (obj1)).left < f2)
                {
                    b(((Rect) (obj1)), f1, l4);
                }
                if ((float)((Rect) (obj1)).right > f6)
                {
                    a(((Rect) (obj1)), f1, i5);
                }
                if (g > 0)
                {
                    for (i2 = g - 1; i2 >= 0; i2--)
                    {
                        Rect rect = (Rect)((ArrayList) (obj)).get(i2);
                        if ((float)rect.left >= f2)
                        {
                            continue;
                        }
                        int k2 = rect.right - rect.left;
                        b(rect, k2, l4);
                        Rect rect4 = (Rect)((ArrayList) (obj)).get(i2 + 1);
                        if ((float)rect.right + s > (float)rect4.left)
                        {
                            rect.left = (int)((float)(rect4.left - k2) - s);
                            rect.right = rect.left + k2;
                        }
                    }

                }
                if (g < l3 - 1)
                {
                    for (i2 = g + 1; i2 < l3; i2++)
                    {
                        Rect rect1 = (Rect)((ArrayList) (obj)).get(i2);
                        if ((float)rect1.right <= f6)
                        {
                            continue;
                        }
                        int l2 = rect1.right - rect1.left;
                        a(rect1, l2, i5);
                        Rect rect5 = (Rect)((ArrayList) (obj)).get(i2 - 1);
                        if ((float)rect1.left - s < (float)rect5.right)
                        {
                            rect1.left = (int)((float)rect5.right + s);
                            rect1.right = rect1.left + l2;
                        }
                    }

                }
                int j5 = k >>> 24;
                i2 = 0;
                while (i2 < l3) 
                {
                    Rect rect2 = (Rect)((ArrayList) (obj)).get(i2);
                    if ((rect2.left <= l4 || rect2.left >= i5) && (rect2.right <= l4 || rect2.right >= i5))
                    {
                        continue;
                    }
                    CharSequence charsequence;
                    Paint paint;
                    int i3;
                    int l5;
                    boolean flag;
                    if (i2 == j1)
                    {
                        i3 = 1;
                    } else
                    {
                        i3 = 0;
                    }
                    charsequence = c(i2);
                    paint = a;
                    if (i3 != 0 && l1 && j)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    paint.setFakeBoldText(flag);
                    a.setColor(k);
                    if (i3 != 0 && k1)
                    {
                        a.setAlpha(j5 - (int)((float)j5 * f5));
                    }
                    if (i2 < j4 - 1)
                    {
                        Rect rect6 = (Rect)((ArrayList) (obj)).get(i2 + 1);
                        if ((float)rect2.right + s > (float)rect6.left)
                        {
                            int k5 = rect2.right - rect2.left;
                            rect2.left = (int)((float)(rect6.left - k5) - s);
                            rect2.right = rect2.left + k5;
                        }
                    }
                    l5 = charsequence.length();
                    f1 = rect2.left;
                    f2 = rect2.bottom;
                    canvas.drawText(charsequence, 0, l5, f1, t + f2, a);
                    if (i3 != 0 && k1)
                    {
                        a.setColor(l);
                        a.setAlpha((int)((float)(l >>> 24) * f5));
                        i3 = charsequence.length();
                        f1 = rect2.left;
                        f2 = rect2.bottom;
                        canvas.drawText(charsequence, 0, i3, f1, t + f2, a);
                    }
                    i2++;
                }
                f2 = v;
                f1 = p;
                static final class _cls1
                {

                    static final int a[];

                    static 
                    {
                        a = new int[IndicatorStyle.values().length];
                        try
                        {
                            a[IndicatorStyle.b.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[IndicatorStyle.c.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                if (o == LinePosition.b)
                {
                    l1 = 0;
                    f2 = -f2;
                    f1 = -f1;
                } else
                {
                    l1 = k3;
                }
                m.reset();
                m.moveTo(0.0F, (float)l1 - f2 / 2.0F);
                m.lineTo(k4, (float)l1 - f2 / 2.0F);
                m.close();
                canvas.drawPath(m, c);
                f2 = (float)l1 - f2;
                switch (_cls1.a[n.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    m.reset();
                    m.moveTo(f3, f2 - f1);
                    m.lineTo(f3 + f1, f2);
                    m.lineTo(f3 - f1, f2);
                    m.close();
                    canvas.drawPath(m, d);
                    return;

                case 2: // '\002'
                    break;
                }
                if (k1 && j1 < j4)
                {
                    obj = (Rect)((ArrayList) (obj)).get(j1);
                    float f4 = (float)((Rect) (obj)).right + q;
                    float f7 = (float)((Rect) (obj)).left - q;
                    f1 = f2 - f1;
                    m.reset();
                    m.moveTo(f7, f2);
                    m.lineTo(f4, f2);
                    m.lineTo(f4, f1);
                    m.lineTo(f7, f1);
                    m.close();
                    d.setAlpha((int)(255F * f5));
                    canvas.drawPath(m, d);
                    d.setAlpha(255);
                    return;
                }
            }
        }
    }

    protected final void onMeasure(int i1, int j1)
    {
        i1 = android.view.View.MeasureSpec.getSize(i1);
        if (android.view.View.MeasureSpec.getMode(j1) != 0x40000000) goto _L2; else goto _L1
_L1:
        float f1 = android.view.View.MeasureSpec.getSize(j1);
_L4:
        setMeasuredDimension(i1, (int)f1);
        return;
_L2:
        b.setEmpty();
        b.bottom = (int)(a.descent() - a.ascent());
        float f2 = (float)(b.bottom - b.top) + v + r + t;
        f1 = f2;
        if (n != IndicatorStyle.a)
        {
            f1 = f2 + p;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        g = ((SavedState) (parcelable)).a;
        requestLayout();
    }

    public final Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = g;
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
        if (e == null || e.getAdapter().getCount() == 0)
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
    //                   5 348
    //                   6 376;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L7 _L8
_L3:
        return true;
_L4:
        y = android.support.v4.view.n.b(motionevent, 0);
        x = motionevent.getX();
        return true;
_L6:
        float f1 = android.support.v4.view.n.c(motionevent, android.support.v4.view.n.a(motionevent, y));
        float f3 = f1 - x;
        if (!z && Math.abs(f3) > (float)w)
        {
            z = true;
        }
        if (z)
        {
            x = f1;
            if (e.isFakeDragging() || e.beginFakeDrag())
            {
                e.fakeDragBy(f3);
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (z)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = e.getAdapter().getCount();
        int l1 = getWidth();
        float f2 = (float)l1 / 2.0F;
        float f4 = (float)l1 / 6F;
        float f5 = motionevent.getX();
        if (f5 < f2 - f4)
        {
            if (g <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            if (j1 != 3)
            {
                e.setCurrentItem(g - 1);
                return true;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (f5 <= f4 + f2 || g >= i1 - 1)
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
        z = false;
        y = -1;
        if (e.isFakeDragging())
        {
            e.endFakeDrag();
            return true;
        }
          goto _L1
_L7:
        i1 = android.support.v4.view.n.b(motionevent);
        x = android.support.v4.view.n.c(motionevent, i1);
        y = android.support.v4.view.n.b(motionevent, i1);
        return true;
_L8:
        int k1 = android.support.v4.view.n.b(motionevent);
        if (android.support.v4.view.n.b(motionevent, k1) == y)
        {
            if (k1 == 0)
            {
                i1 = 1;
            }
            y = android.support.v4.view.n.b(motionevent, i1);
        }
        x = android.support.v4.view.n.c(motionevent, android.support.v4.view.n.a(motionevent, y));
        return true;
    }

    public final void setClipPadding(float f1)
    {
        u = f1;
        invalidate();
    }

    public final void setCurrentItem(int i1)
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

    public final void setFooterColor(int i1)
    {
        c.setColor(i1);
        d.setColor(i1);
        invalidate();
    }

    public final void setFooterIndicatorHeight(float f1)
    {
        p = f1;
        invalidate();
    }

    public final void setFooterIndicatorPadding(float f1)
    {
        r = f1;
        invalidate();
    }

    public final void setFooterIndicatorStyle(IndicatorStyle indicatorstyle)
    {
        n = indicatorstyle;
        invalidate();
    }

    public final void setFooterLineHeight(float f1)
    {
        v = f1;
        c.setStrokeWidth(v);
        invalidate();
    }

    public final void setLinePosition(LinePosition lineposition)
    {
        o = lineposition;
        invalidate();
    }

    public final void setOnCenterItemClickListener(a a1)
    {
        A = a1;
    }

    public final void setOnPageChangeListener(android.support.v4.view.ViewPager.f f1)
    {
        f = f1;
    }

    public final void setSelectedBold(boolean flag)
    {
        j = flag;
        invalidate();
    }

    public final void setSelectedColor(int i1)
    {
        l = i1;
        invalidate();
    }

    public final void setTextColor(int i1)
    {
        a.setColor(i1);
        k = i1;
        invalidate();
    }

    public final void setTextSize(float f1)
    {
        a.setTextSize(f1);
        invalidate();
    }

    public final void setTitlePadding(float f1)
    {
        s = f1;
        invalidate();
    }

    public final void setTopPadding(float f1)
    {
        t = f1;
        invalidate();
    }

    public final void setTypeface(Typeface typeface)
    {
        a.setTypeface(typeface);
        invalidate();
    }

    public final void setViewPager(ViewPager viewpager)
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
}
