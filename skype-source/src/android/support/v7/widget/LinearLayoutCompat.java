// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.e;
import android.support.v4.view.x;
import android.support.v7.internal.widget.p;
import android.support.v7.internal.widget.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.annotation.Annotation;

public class LinearLayoutCompat extends ViewGroup
{
    public static interface DividerMode
        extends Annotation
    {
    }

    public static interface OrientationMode
        extends Annotation
    {
    }

    public static class a extends android.view.ViewGroup.MarginLayoutParams
    {

        public float g;
        public int h;

        public a(int i1, int j1)
        {
            super(i1, j1);
            h = -1;
            g = 0.0F;
        }

        public a(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            h = -1;
            context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.a.k.LinearLayoutCompat_Layout);
            g = context.getFloat(android.support.v7.appcompat.a.k.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
            h = context.getInt(android.support.v7.appcompat.a.k.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            context.recycle();
        }

        public a(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            h = -1;
        }
    }


    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int i[];
    private int j[];
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public LinearLayoutCompat(Context context)
    {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = true;
        b = -1;
        c = 0;
        e = 0x800033;
        context = p.a(context, attributeset, android.support.v7.appcompat.a.k.LinearLayoutCompat, i1);
        i1 = context.a(android.support.v7.appcompat.a.k.LinearLayoutCompat_android_orientation, -1);
        if (i1 >= 0)
        {
            setOrientation(i1);
        }
        i1 = context.a(android.support.v7.appcompat.a.k.LinearLayoutCompat_android_gravity, -1);
        if (i1 >= 0)
        {
            setGravity(i1);
        }
        boolean flag = context.a(android.support.v7.appcompat.a.k.LinearLayoutCompat_android_baselineAligned, true);
        if (!flag)
        {
            setBaselineAligned(flag);
        }
        g = context.e(android.support.v7.appcompat.a.k.LinearLayoutCompat_android_weightSum);
        b = context.a(android.support.v7.appcompat.a.k.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        h = context.a(android.support.v7.appcompat.a.k.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(context.a(android.support.v7.appcompat.a.k.LinearLayoutCompat_divider));
        n = context.a(android.support.v7.appcompat.a.k.LinearLayoutCompat_showDividers, 0);
        o = context.d(android.support.v7.appcompat.a.k.LinearLayoutCompat_dividerPadding, 0);
        context.b();
    }

    private void a(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
        for (int k1 = 0; k1 < i1; k1++)
        {
            View view = getChildAt(k1);
            if (view.getVisibility() == 8)
            {
                continue;
            }
            a a1 = (a)view.getLayoutParams();
            if (a1.width == -1)
            {
                int i2 = a1.height;
                a1.height = view.getMeasuredHeight();
                measureChildWithMargins(view, l1, 0, j1, 0);
                a1.height = i2;
            }
        }

    }

    private void a(Canvas canvas, int i1)
    {
        k.setBounds(getPaddingLeft() + o, i1, getWidth() - getPaddingRight() - o, m + i1);
        k.draw(canvas);
    }

    private void a(View view, int i1, int j1, int k1, int l1)
    {
        measureChildWithMargins(view, i1, j1, k1, l1);
    }

    private boolean a(int i1)
    {
        boolean flag = true;
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if ((n & 1) == 0) goto _L4; else goto _L3
_L3:
        return flag;
_L4:
        return false;
_L2:
        if (i1 != getChildCount())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((n & 4) == 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
label0:
        {
            if ((n & 2) == 0)
            {
                break label0;
            }
            boolean flag1 = false;
            i1--;
            do
            {
                flag = flag1;
                if (i1 < 0)
                {
                    break;
                }
                if (getChildAt(i1).getVisibility() != 8)
                {
                    return true;
                }
                i1--;
            } while (true);
        }
        if (true) goto _L3; else goto _L6
_L6:
        return false;
    }

    private void b(int i1, int j1)
    {
        float f1;
        int ai[];
        int ai1[];
        View view2;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int l3;
        int i4;
        int j4;
        boolean flag;
        int i9;
        int j9;
        int k9;
        boolean flag1;
        boolean flag2;
        f = 0;
        l2 = 0;
        l1 = 0;
        j2 = 0;
        i4 = 0;
        k1 = 1;
        f1 = 0.0F;
        i9 = getChildCount();
        k9 = android.view.View.MeasureSpec.getMode(i1);
        j9 = android.view.View.MeasureSpec.getMode(j1);
        i2 = 0;
        l3 = 0;
        if (i == null || j == null)
        {
            i = new int[4];
            j = new int[4];
        }
        ai = i;
        ai1 = j;
        ai[3] = -1;
        ai[2] = -1;
        ai[1] = -1;
        ai[0] = -1;
        ai1[3] = -1;
        ai1[2] = -1;
        ai1[1] = -1;
        ai1[0] = -1;
        flag1 = a;
        flag2 = h;
        if (k9 == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k2 = 0x80000000;
        j4 = 0;
        if (j4 >= i9)
        {
            break; /* Loop/switch isn't completed */
        }
        view2 = getChildAt(j4);
        if (view2 == null)
        {
            f = f + 0;
        } else
        {
            int l8 = k1;
            int l7 = j2;
            int j8 = l1;
            int k4 = k2;
            int j7 = i2;
            int l6 = l2;
            int k5 = l3;
            float f2 = f1;
            int j6 = i4;
            if (view2.getVisibility() != 8)
            {
                if (a(j4))
                {
                    f = f + l;
                }
                a a2 = (a)view2.getLayoutParams();
                f2 = f1 + a2.g;
                if (k9 == 0x40000000 && a2.width == 0 && a2.g > 0.0F)
                {
                    if (flag)
                    {
                        f = f + (a2.leftMargin + a2.rightMargin);
                    } else
                    {
                        k4 = f;
                        f = Math.max(k4, a2.leftMargin + k4 + a2.rightMargin);
                    }
                    if (flag1)
                    {
                        k4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        view2.measure(k4, k4);
                        k5 = l3;
                        k4 = k2;
                    } else
                    {
                        k5 = 1;
                        k4 = k2;
                    }
                } else
                {
                    k5 = 0x80000000;
                    k4 = k5;
                    if (a2.width == 0)
                    {
                        k4 = k5;
                        if (a2.g > 0.0F)
                        {
                            k4 = 0;
                            a2.width = -2;
                        }
                    }
                    if (f2 == 0.0F)
                    {
                        k5 = f;
                    } else
                    {
                        k5 = 0;
                    }
                    a(view2, i1, k5, j1, 0);
                    if (k4 != 0x80000000)
                    {
                        a2.width = k4;
                    }
                    j6 = view2.getMeasuredWidth();
                    if (flag)
                    {
                        f = f + (a2.leftMargin + j6 + a2.rightMargin + 0);
                    } else
                    {
                        int l4 = f;
                        f = Math.max(l4, l4 + j6 + a2.leftMargin + a2.rightMargin + 0);
                    }
                    k4 = k2;
                    k5 = l3;
                    if (flag2)
                    {
                        k4 = Math.max(j6, k2);
                        k5 = l3;
                    }
                }
                j6 = 0;
                k2 = i2;
                l3 = j6;
                if (j9 != 0x40000000)
                {
                    k2 = i2;
                    l3 = j6;
                    if (a2.height == -1)
                    {
                        k2 = 1;
                        l3 = 1;
                    }
                }
                i2 = a2.topMargin + a2.bottomMargin;
                j6 = view2.getMeasuredHeight() + i2;
                j8 = r.a(l1, x.l(view2));
                if (flag1)
                {
                    l6 = view2.getBaseline();
                    if (l6 != -1)
                    {
                        if (a2.h < 0)
                        {
                            l1 = e;
                        } else
                        {
                            l1 = a2.h;
                        }
                        l1 = ((l1 & 0x70) >> 4 & -2) >> 1;
                        ai[l1] = Math.max(ai[l1], l6);
                        ai1[l1] = Math.max(ai1[l1], j6 - l6);
                    }
                }
                l6 = Math.max(l2, j6);
                if (k1 != 0 && a2.height == -1)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                if (a2.g > 0.0F)
                {
                    if (l3 == 0)
                    {
                        i2 = j6;
                    }
                    j6 = Math.max(i4, i2);
                    j7 = k2;
                    l7 = j2;
                    l8 = k1;
                } else
                {
                    if (l3 == 0)
                    {
                        i2 = j6;
                    }
                    l7 = Math.max(j2, i2);
                    l8 = k1;
                    j7 = k2;
                    j6 = i4;
                }
            }
            j4 += 0;
            k1 = l8;
            j2 = l7;
            l1 = j8;
            k2 = k4;
            i2 = j7;
            l2 = l6;
            l3 = k5;
            f1 = f2;
            i4 = j6;
        }
_L8:
        j4++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_155;
_L1:
        int j5;
        int i8;
label0:
        {
            if (f > 0 && a(i9))
            {
                f = f + l;
            }
            if (ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
            {
                j4 = l2;
                if (ai[3] == -1)
                {
                    break label0;
                }
            }
            j4 = Math.max(l2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
        }
        if (flag2 && (k9 == 0x80000000 || k9 == 0))
        {
            f = 0;
            int i3 = 0;
            while (i3 < i9) 
            {
                Object obj = getChildAt(i3);
                if (obj == null)
                {
                    f = f + 0;
                } else
                if (((View) (obj)).getVisibility() == 8)
                {
                    i3 += 0;
                } else
                {
                    obj = (a)((View) (obj)).getLayoutParams();
                    if (flag)
                    {
                        f = f + (((a) (obj)).leftMargin + k2 + ((a) (obj)).rightMargin + 0);
                    } else
                    {
                        int i5 = f;
                        f = Math.max(i5, i5 + k2 + ((a) (obj)).leftMargin + ((a) (obj)).rightMargin + 0);
                    }
                }
                i3++;
            }
        }
        f = f + (getPaddingLeft() + getPaddingRight());
        i8 = x.a(Math.max(f, getSuggestedMinimumWidth()), i1, 0);
        j5 = (0xffffff & i8) - f;
        if (l3 == 0 && (j5 == 0 || f1 <= 0.0F)) goto _L4; else goto _L3
_L3:
label1:
        {
            if (g > 0.0F)
            {
                f1 = g;
            }
            ai[3] = -1;
            ai[2] = -1;
            ai[1] = -1;
            ai[0] = -1;
            ai1[3] = -1;
            ai1[2] = -1;
            ai1[1] = -1;
            ai1[0] = -1;
            int j3 = -1;
            f = 0;
            j4 = 0;
            i4 = j5;
            k2 = j2;
            while (j4 < i9) 
            {
                View view3 = getChildAt(j4);
                j5 = k1;
                int l5 = k2;
                int k6 = l1;
                int i7 = i4;
                int k7 = j3;
                float f4 = f1;
                if (view3 != null)
                {
                    j5 = k1;
                    l5 = k2;
                    k6 = l1;
                    i7 = i4;
                    k7 = j3;
                    f4 = f1;
                    if (view3.getVisibility() != 8)
                    {
                        a a3 = (a)view3.getLayoutParams();
                        f4 = a3.g;
                        l3 = l1;
                        j2 = i4;
                        float f3 = f1;
                        if (f4 > 0.0F)
                        {
                            j2 = (int)(((float)i4 * f4) / f1);
                            f3 = f1 - f4;
                            l3 = i4 - j2;
                            j5 = getChildMeasureSpec(j1, getPaddingTop() + getPaddingBottom() + a3.topMargin + a3.bottomMargin, a3.height);
                            int k8;
                            if (a3.width != 0 || k9 != 0x40000000)
                            {
                                i4 = view3.getMeasuredWidth() + j2;
                                j2 = i4;
                                if (i4 < 0)
                                {
                                    j2 = 0;
                                }
                            } else
                            if (j2 <= 0)
                            {
                                j2 = 0;
                            }
                            view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000), j5);
                            l1 = r.a(l1, x.l(view3) & 0xff000000);
                            j2 = l3;
                            l3 = l1;
                        }
                        if (flag)
                        {
                            f = f + (view3.getMeasuredWidth() + a3.leftMargin + a3.rightMargin + 0);
                        } else
                        {
                            l1 = f;
                            f = Math.max(l1, view3.getMeasuredWidth() + l1 + a3.leftMargin + a3.rightMargin + 0);
                        }
                        if (j9 != 0x40000000 && a3.height == -1)
                        {
                            l1 = 1;
                        } else
                        {
                            l1 = 0;
                        }
                        j5 = a3.topMargin + a3.bottomMargin;
                        i4 = view3.getMeasuredHeight() + j5;
                        j3 = Math.max(j3, i4);
                        if (l1 != 0)
                        {
                            l1 = j5;
                        } else
                        {
                            l1 = i4;
                        }
                        k2 = Math.max(k2, l1);
                        if (k1 != 0 && a3.height == -1)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        j5 = k1;
                        l5 = k2;
                        k6 = l3;
                        i7 = j2;
                        k7 = j3;
                        f4 = f3;
                        if (flag1)
                        {
                            k8 = view3.getBaseline();
                            j5 = k1;
                            l5 = k2;
                            k6 = l3;
                            i7 = j2;
                            k7 = j3;
                            f4 = f3;
                            if (k8 != -1)
                            {
                                if (a3.h < 0)
                                {
                                    l1 = e;
                                } else
                                {
                                    l1 = a3.h;
                                }
                                l1 = ((l1 & 0x70) >> 4 & -2) >> 1;
                                ai[l1] = Math.max(ai[l1], k8);
                                ai1[l1] = Math.max(ai1[l1], i4 - k8);
                                f4 = f3;
                                k7 = j3;
                                i7 = j2;
                                k6 = l3;
                                l5 = k2;
                                j5 = k1;
                            }
                        }
                    }
                }
                j4++;
                k1 = j5;
                k2 = l5;
                l1 = k6;
                i4 = i7;
                j3 = k7;
                f1 = f4;
            }
            f = f + (getPaddingLeft() + getPaddingRight());
            if (ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
            {
                j5 = k1;
                l3 = k2;
                i4 = l1;
                j2 = j3;
                if (ai[3] == -1)
                {
                    break label1;
                }
            }
            j2 = Math.max(j3, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
            i4 = l1;
            l3 = k2;
            j5 = k1;
        }
_L6:
        k1 = j2;
        if (j5 == 0)
        {
            k1 = j2;
            if (j9 != 0x40000000)
            {
                k1 = l3;
            }
        }
        setMeasuredDimension(0xff000000 & i4 | i8, x.a(Math.max(getPaddingTop() + getPaddingBottom() + k1, getSuggestedMinimumHeight()), j1, i4 << 16));
        if (i2 != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
            for (j1 = 0; j1 < i9; j1++)
            {
                View view = getChildAt(j1);
                if (view.getVisibility() != 8)
                {
                    a a1 = (a)view.getLayoutParams();
                    if (a1.height == -1)
                    {
                        l1 = a1.width;
                        a1.width = view.getMeasuredWidth();
                        measureChildWithMargins(view, i1, 0, k1, 0);
                        a1.width = l1;
                    }
                }
            }

        }
        break MISSING_BLOCK_LABEL_2419;
_L4:
        int i6 = Math.max(j2, i4);
        j5 = k1;
        l3 = i6;
        i4 = l1;
        j2 = j4;
        if (flag2)
        {
            j5 = k1;
            l3 = i6;
            i4 = l1;
            j2 = j4;
            if (k9 != 0x40000000)
            {
                int k3 = 0;
                do
                {
                    j5 = k1;
                    l3 = i6;
                    i4 = l1;
                    j2 = j4;
                    if (k3 >= i9)
                    {
                        break;
                    }
                    View view1 = getChildAt(k3);
                    if (view1 != null && view1.getVisibility() != 8 && ((a)view1.getLayoutParams()).g > 0.0F)
                    {
                        view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000));
                    }
                    k3++;
                } while (true);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void b(Canvas canvas, int i1)
    {
        k.setBounds(i1, getPaddingTop() + o, l + i1, getHeight() - getPaddingBottom() - o);
        k.draw(canvas);
    }

    private static void b(View view, int i1, int j1, int k1, int l1)
    {
        view.layout(i1, j1, i1 + k1, j1 + l1);
    }

    public a a(AttributeSet attributeset)
    {
        return new a(getContext(), attributeset);
    }

    protected a b(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new a(layoutparams);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof a;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return j();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return b(layoutparams);
    }

    public int getBaseline()
    {
        int i1 = -1;
        if (b >= 0) goto _L2; else goto _L1
_L1:
        i1 = super.getBaseline();
_L4:
        return i1;
_L2:
        View view;
        int k1;
        if (getChildCount() <= b)
        {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        view = getChildAt(b);
        k1 = view.getBaseline();
        if (k1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b != 0)
        {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        if (true) goto _L4; else goto _L3
_L3:
        int j1;
        j1 = c;
        i1 = j1;
        if (d != 1) goto _L6; else goto _L5
_L5:
        int l1;
        l1 = e & 0x70;
        i1 = j1;
        if (l1 == 48) goto _L6; else goto _L7
_L7:
        l1;
        JVM INSTR lookupswitch 2: default 140
    //                   16: 181
    //                   80: 158;
           goto _L8 _L9 _L10
_L8:
        i1 = j1;
_L6:
        return ((a)view.getLayoutParams()).topMargin + i1 + k1;
_L10:
        i1 = getBottom() - getTop() - getPaddingBottom() - f;
        continue; /* Loop/switch isn't completed */
_L9:
        i1 = j1 + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - f) / 2;
        if (true) goto _L6; else goto _L11
_L11:
    }

    protected a j()
    {
        if (d == 0)
        {
            return new a(-2, -2);
        }
        if (d == 1)
        {
            return new a(-1, -2);
        } else
        {
            return null;
        }
    }

    public final int k()
    {
        return l;
    }

    protected void onDraw(Canvas canvas)
    {
        if (k != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (d != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i2 = getChildCount();
        for (int i1 = 0; i1 < i2; i1++)
        {
            View view = getChildAt(i1);
            if (view != null && view.getVisibility() != 8 && a(i1))
            {
                a a1 = (a)view.getLayoutParams();
                a(canvas, view.getTop() - a1.topMargin - m);
            }
        }

        if (a(i2))
        {
            View view1 = getChildAt(i2 - 1);
            int j1;
            if (view1 == null)
            {
                j1 = getHeight() - getPaddingBottom() - m;
            } else
            {
                a a2 = (a)view1.getLayoutParams();
                j1 = view1.getBottom();
                j1 = a2.bottomMargin + j1;
            }
            a(canvas, j1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k2 = getChildCount();
        boolean flag = r.a(this);
        int k1 = 0;
        while (k1 < k2) 
        {
            View view2 = getChildAt(k1);
            if (view2 != null && view2.getVisibility() != 8 && a(k1))
            {
                a a3 = (a)view2.getLayoutParams();
                int j2;
                if (flag)
                {
                    j2 = view2.getRight();
                    j2 = a3.rightMargin + j2;
                } else
                {
                    j2 = view2.getLeft() - a3.leftMargin - l;
                }
                b(canvas, j2);
            }
            k1++;
        }
        if (a(k2))
        {
            View view3 = getChildAt(k2 - 1);
            int l1;
            if (view3 == null)
            {
                if (flag)
                {
                    l1 = getPaddingLeft();
                } else
                {
                    l1 = getWidth() - getPaddingRight() - l;
                }
            } else
            {
                a a4 = (a)view3.getLayoutParams();
                if (flag)
                {
                    l1 = view3.getLeft() - a4.leftMargin - l;
                } else
                {
                    l1 = view3.getRight();
                    l1 = a4.rightMargin + l1;
                }
            }
            b(canvas, l1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            accessibilityevent.setClassName(android/support/v7/widget/LinearLayoutCompat.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
            accessibilitynodeinfo.setClassName(android/support/v7/widget/LinearLayoutCompat.getName());
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (d != 1) goto _L2; else goto _L1
_L1:
        int i2;
        int k2;
        int i3;
        int j3;
        int l3;
        int i4;
        i2 = getPaddingLeft();
        k2 = k1 - i1;
        i3 = getPaddingRight();
        j3 = getPaddingRight();
        l3 = getChildCount();
        i1 = e;
        i4 = e;
        i1 & 0x70;
        JVM INSTR lookupswitch 2: default 80
    //                   16: 140
    //                   80: 122;
           goto _L3 _L4 _L5
_L3:
        i1 = getPaddingTop();
_L10:
        k1 = 0;
        j1 = i1;
        i1 = k1;
_L9:
        View view;
        if (i1 >= l3)
        {
            break; /* Loop/switch isn't completed */
        }
        view = getChildAt(i1);
        if (view != null) goto _L7; else goto _L6
_L6:
        j1 += 0;
_L12:
        i1++;
        if (true) goto _L9; else goto _L8
_L5:
        i1 = (getPaddingTop() + l1) - j1 - f;
          goto _L10
_L4:
        i1 = getPaddingTop() + (l1 - j1 - f) / 2;
          goto _L10
_L7:
        if (view.getVisibility() == 8) goto _L12; else goto _L11
_L11:
        a a1;
        int j4;
        int k4;
        j4 = view.getMeasuredWidth();
        k4 = view.getMeasuredHeight();
        a1 = (a)view.getLayoutParams();
        l1 = a1.h;
        k1 = l1;
        if (l1 < 0)
        {
            k1 = 0x800007 & i4;
        }
        android.support.v4.view.e.a(k1, x.h(this)) & 7;
        JVM INSTR lookupswitch 2: default 256
    //                   1: 328
    //                   5: 361;
           goto _L13 _L14 _L15
_L15:
        break MISSING_BLOCK_LABEL_361;
_L13:
        k1 = a1.leftMargin + i2;
_L16:
        l1 = j1;
        if (a(i1))
        {
            l1 = j1 + m;
        }
        j1 = l1 + a1.topMargin;
        b(view, k1, j1 + 0, j4, k4);
        j1 += a1.bottomMargin + k4 + 0;
        i1 += 0;
          goto _L12
_L14:
        k1 = ((k2 - i2 - j3 - j4) / 2 + i2 + a1.leftMargin) - a1.rightMargin;
          goto _L16
        k1 = k2 - i3 - j4 - a1.rightMargin;
          goto _L16
_L2:
        int ai[];
        int ai1[];
        int l4;
        boolean flag1;
        flag = r.a(this);
        i3 = getPaddingTop();
        l3 = l1 - j1;
        i4 = getPaddingBottom();
        j4 = getPaddingBottom();
        k4 = getChildCount();
        j1 = e;
        l4 = e;
        flag1 = a;
        ai = i;
        ai1 = j;
        android.support.v4.view.e.a(j1 & 0x800007, x.h(this));
        JVM INSTR lookupswitch 2: default 484
    //                   1: 568
    //                   5: 550;
           goto _L17 _L18 _L19
_L17:
        i1 = getPaddingLeft();
_L24:
        View view1;
        a a2;
        int j2;
        int l2;
        int k3;
        int i5;
        int j5;
        int k5;
        if (flag)
        {
            j2 = k4 - 1;
            l1 = -1;
        } else
        {
            j2 = 0;
            l1 = 1;
        }
        j1 = 0;
        k1 = i1;
_L23:
        if (j1 >= k4) goto _L8; else goto _L20
_L20:
        k5 = j2 + l1 * j1;
        view1 = getChildAt(k5);
        if (view1 != null) goto _L22; else goto _L21
_L21:
        k1 += 0;
        i1 = j1;
_L29:
        j1 = i1 + 1;
          goto _L23
_L19:
        i1 = (getPaddingLeft() + k1) - i1 - f;
          goto _L24
_L18:
        i1 = getPaddingLeft() + (k1 - i1 - f) / 2;
          goto _L24
_L22:
        if (view1.getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_898;
        }
        i5 = view1.getMeasuredWidth();
        j5 = view1.getMeasuredHeight();
        i1 = -1;
        a2 = (a)view1.getLayoutParams();
        l2 = i1;
        if (flag1)
        {
            l2 = i1;
            if (a2.height != -1)
            {
                l2 = view1.getBaseline();
            }
        }
        k3 = a2.h;
        i1 = k3;
        if (k3 < 0)
        {
            i1 = l4 & 0x70;
        }
        i1 & 0x70;
        JVM INSTR lookupswitch 3: default 712
    //                   16: 812
    //                   48: 779
    //                   80: 844;
           goto _L25 _L26 _L27 _L28
_L28:
        break MISSING_BLOCK_LABEL_844;
_L25:
        i1 = i3;
_L30:
        if (a(k5))
        {
            k1 = l + k1;
        }
        k1 += a2.leftMargin;
        b(view1, k1 + 0, i1, i5, j5);
        k1 += a2.rightMargin + i5 + 0;
        i1 = j1 + 0;
          goto _L29
_L27:
        k3 = a2.topMargin + i3;
        i1 = k3;
        if (l2 != -1)
        {
            i1 = (ai[1] - l2) + k3;
        }
          goto _L30
_L26:
        i1 = ((l3 - i3 - j4 - j5) / 2 + i3 + a2.topMargin) - a2.bottomMargin;
          goto _L30
        k3 = l3 - i4 - j5 - a2.bottomMargin;
        i1 = k3;
        if (l2 != -1)
        {
            i1 = view1.getMeasuredHeight();
            i1 = k3 - (ai1[2] - (i1 - l2));
        }
          goto _L30
_L8:
        return;
        i1 = j1;
          goto _L29
    }

    protected void onMeasure(int i1, int j1)
    {
        if (d != 1) goto _L2; else goto _L1
_L1:
        float f1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        boolean flag;
        int i3;
        int j3;
        int k7;
        int l7;
        int i8;
        int j8;
        boolean flag1;
        f = 0;
        i2 = 0;
        k1 = 0;
        l1 = 0;
        i3 = 0;
        j2 = 1;
        f1 = 0.0F;
        k7 = getChildCount();
        l7 = android.view.View.MeasureSpec.getMode(i1);
        i8 = android.view.View.MeasureSpec.getMode(j1);
        flag = false;
        l2 = 0;
        j8 = b;
        flag1 = h;
        k2 = 0x80000000;
        j3 = 0;
_L7:
        if (j3 >= k7) goto _L4; else goto _L3
_L3:
        View view = getChildAt(j3);
        if (view != null) goto _L6; else goto _L5
_L5:
        int j4;
        int k5;
        int k6;
        int j7;
        f = f + 0;
        j7 = j3;
        k6 = i2;
        k5 = k1;
        j4 = l1;
        j3 = i3;
        i2 = j2;
        l1 = l2;
        k1 = k2;
_L12:
        j7++;
        k2 = k1;
        l2 = l1;
        j2 = i2;
        i3 = j3;
        l1 = j4;
        k1 = k5;
        i2 = k6;
        j3 = j7;
          goto _L7
_L6:
        a a1;
        if (view.getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_1655;
        }
        if (a(j3))
        {
            f = f + m;
        }
        a1 = (a)view.getLayoutParams();
        f1 += a1.g;
        if (i8 != 0x40000000 || a1.height != 0 || a1.g <= 0.0F) goto _L9; else goto _L8
_L8:
        l2 = f;
        f = Math.max(l2, a1.topMargin + l2 + a1.bottomMargin);
        l2 = 1;
_L11:
        if (j8 >= 0 && j8 == j3 + 1)
        {
            c = f;
        }
        if (j3 < j8 && a1.g > 0.0F)
        {
            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        }
        break; /* Loop/switch isn't completed */
_L9:
        k5 = 0x80000000;
        j4 = k5;
        if (a1.height == 0)
        {
            j4 = k5;
            if (a1.g > 0.0F)
            {
                j4 = 0;
                a1.height = -2;
            }
        }
        if (f1 == 0.0F)
        {
            k5 = f;
        } else
        {
            k5 = 0;
        }
        a(view, i1, 0, j1, k5);
        if (j4 != 0x80000000)
        {
            a1.height = j4;
        }
        j4 = view.getMeasuredHeight();
        k5 = f;
        f = Math.max(k5, k5 + j4 + a1.topMargin + a1.bottomMargin + 0);
        if (flag1)
        {
            k2 = Math.max(j4, k2);
        }
        if (true) goto _L11; else goto _L10
_L10:
        j4 = 0;
        if (l7 != 0x40000000 && a1.width == -1)
        {
            flag = true;
            j4 = 1;
        }
        k5 = a1.leftMargin + a1.rightMargin;
        k6 = view.getMeasuredWidth() + k5;
        i2 = Math.max(i2, k6);
        j7 = r.a(k1, x.l(view));
        if (j2 != 0 && a1.width == -1)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (a1.g > 0.0F)
        {
            if (j4 == 0)
            {
                k5 = k6;
            }
            i3 = Math.max(i3, k5);
            j2 = l1;
            l1 = l2;
            l2 = i2;
            i2 = i3;
            j4 = k2;
            i3 = j7;
            k2 = j2;
            j2 = i2;
            i2 = k1;
            k1 = l1;
            l1 = j4;
        } else
        {
            if (j4 == 0)
            {
                k5 = k6;
            }
            j4 = Math.max(l1, k5);
            j2 = k1;
            k1 = l2;
            l1 = k2;
            l2 = i2;
            i2 = j2;
            j2 = i3;
            k2 = j4;
            i3 = j7;
        }
_L13:
        j7 = j3 + 0;
        j3 = k1;
        k1 = l1;
        l1 = j3;
        j3 = j2;
        j4 = k2;
        k5 = i3;
        k6 = l2;
          goto _L12
_L2:
        b(i1, j1);
        return;
_L4:
label0:
        {
            {
                if (f > 0 && a(k7))
                {
                    f = f + m;
                }
                if (flag1 && (i8 == 0x80000000 || i8 == 0))
                {
                    f = 0;
                    int k3 = 0;
                    while (k3 < k7) 
                    {
                        Object obj = getChildAt(k3);
                        if (obj == null)
                        {
                            f = f + 0;
                        } else
                        if (((View) (obj)).getVisibility() == 8)
                        {
                            k3 += 0;
                        } else
                        {
                            obj = (a)((View) (obj)).getLayoutParams();
                            int k4 = f;
                            int l5 = ((a) (obj)).topMargin;
                            f = Math.max(k4, ((a) (obj)).bottomMargin + (k4 + k2 + l5) + 0);
                        }
                        k3++;
                    }
                }
                f = f + (getPaddingTop() + getPaddingBottom());
                int i6 = x.a(Math.max(f, getSuggestedMinimumHeight()), j1, 0);
                int l3 = (0xffffff & i6) - f;
                if (l2 == 0 && (l3 == 0 || f1 <= 0.0F))
                {
                    break label0;
                }
                if (g > 0.0F)
                {
                    f1 = g;
                }
                f = 0;
                i3 = 0;
                k2 = j2;
                j2 = i2;
                i2 = l1;
                l1 = k2;
                k2 = l3;
                while (i3 < k7) 
                {
                    View view1 = getChildAt(i3);
                    if (view1.getVisibility() != 8)
                    {
                        a a2 = (a)view1.getLayoutParams();
                        float f2 = a2.g;
                        int i5;
                        if (f2 > 0.0F)
                        {
                            int i4 = (int)(((float)k2 * f2) / f1);
                            int l6 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + a2.leftMargin + a2.rightMargin, a2.width);
                            if (a2.height != 0 || i8 != 0x40000000)
                            {
                                int l4 = i4 + view1.getMeasuredHeight();
                                l2 = l4;
                                if (l4 < 0)
                                {
                                    l2 = 0;
                                }
                            } else
                            if (i4 > 0)
                            {
                                l2 = i4;
                            } else
                            {
                                l2 = 0;
                            }
                            view1.measure(l6, android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000));
                            k1 = r.a(k1, x.l(view1) & 0xffffff00);
                            l2 = k2 - i4;
                            k2 = k1;
                            f1 -= f2;
                            k1 = l2;
                        } else
                        {
                            l2 = k1;
                            k1 = k2;
                            k2 = l2;
                        }
                        i4 = a2.leftMargin + a2.rightMargin;
                        i5 = view1.getMeasuredWidth() + i4;
                        l2 = Math.max(j2, i5);
                        if (l7 != 0x40000000 && a2.width == -1)
                        {
                            j2 = 1;
                        } else
                        {
                            j2 = 0;
                        }
                        if (j2 != 0)
                        {
                            j2 = i4;
                        } else
                        {
                            j2 = i5;
                        }
                        i2 = Math.max(i2, j2);
                        if (l1 != 0 && a2.width == -1)
                        {
                            l1 = 1;
                        } else
                        {
                            l1 = 0;
                        }
                        j2 = f;
                        i4 = view1.getMeasuredHeight();
                        i5 = a2.topMargin;
                        f = Math.max(j2, a2.bottomMargin + (i4 + j2 + i5) + 0);
                        j2 = l1;
                        l1 = l2;
                    } else
                    {
                        l2 = l1;
                        l1 = j2;
                        j2 = k1;
                        k1 = k2;
                        k2 = j2;
                        j2 = l2;
                    }
                    i4 = i3 + 1;
                    i3 = k2;
                    l2 = l1;
                    k2 = k1;
                    k1 = i3;
                    l1 = j2;
                    j2 = l2;
                    i3 = i4;
                }
                f = f + (getPaddingTop() + getPaddingBottom());
                k2 = i2;
                i2 = j2;
                j2 = l1;
                l1 = k2;
            }
            if (j2 != 0 || l7 == 0x40000000)
            {
                l1 = i2;
            }
            setMeasuredDimension(x.a(Math.max(l1 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i1, k1), i6);
            if (flag)
            {
                a(k7, j1);
            }
            return;
        }
        l2 = Math.max(l1, i3);
        if (flag1 && i8 != 0x40000000)
        {
            for (l1 = 0; l1 < k7; l1++)
            {
                view1 = getChildAt(l1);
                if (view1 != null && view1.getVisibility() != 8 && ((a)view1.getLayoutParams()).g > 0.0F)
                {
                    view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x40000000));
                }
            }

        }
        l1 = l2;
        if (true)
        {
            break MISSING_BLOCK_LABEL_1429;
        }
        int j5 = k2;
        int j6 = l2;
        k2 = l1;
        l2 = i2;
        int i7 = k1;
        l1 = j5;
        k1 = j6;
        i2 = j2;
        j2 = i3;
        i3 = i7;
          goto _L13
    }

    public void setBaselineAligned(boolean flag)
    {
        a = flag;
    }

    public void setBaselineAlignedChildIndex(int i1)
    {
        if (i1 < 0 || i1 >= getChildCount())
        {
            throw new IllegalArgumentException((new StringBuilder("base aligned child index out of range (0, ")).append(getChildCount()).append(")").toString());
        } else
        {
            b = i1;
            return;
        }
    }

    public void setDividerDrawable(Drawable drawable)
    {
        boolean flag = false;
        if (drawable == k)
        {
            return;
        }
        k = drawable;
        if (drawable != null)
        {
            l = drawable.getIntrinsicWidth();
            m = drawable.getIntrinsicHeight();
        } else
        {
            l = 0;
            m = 0;
        }
        if (drawable == null)
        {
            flag = true;
        }
        setWillNotDraw(flag);
        requestLayout();
    }

    public void setDividerPadding(int i1)
    {
        o = i1;
    }

    public void setGravity(int i1)
    {
        if (e != i1)
        {
            int j1 = i1;
            if ((0x800007 & i1) == 0)
            {
                j1 = i1 | 0x800003;
            }
            i1 = j1;
            if ((j1 & 0x70) == 0)
            {
                i1 = j1 | 0x30;
            }
            e = i1;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i1)
    {
        i1 &= 0x800007;
        if ((e & 0x800007) != i1)
        {
            e = e & 0xff7ffff8 | i1;
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean flag)
    {
        h = flag;
    }

    public void setOrientation(int i1)
    {
        if (d != i1)
        {
            d = i1;
            requestLayout();
        }
    }

    public void setShowDividers(int i1)
    {
        if (i1 != n)
        {
            requestLayout();
        }
        n = i1;
    }

    public void setVerticalGravity(int i1)
    {
        i1 &= 0x70;
        if ((e & 0x70) != i1)
        {
            e = e & 0xffffff8f | i1;
            requestLayout();
        }
    }

    public void setWeightSum(float f1)
    {
        g = Math.max(0.0F, f1);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }
}
