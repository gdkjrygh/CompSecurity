// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bt;
import android.support.v4.view.q;
import android.support.v7.a.l;
import android.support.v7.internal.widget.an;
import android.support.v7.internal.widget.at;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v7.widget:
//            v

public class LinearLayoutCompat extends ViewGroup
{

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
        context = an.a(context, attributeset, l.LinearLayoutCompat, i1);
        i1 = context.a(l.LinearLayoutCompat_android_orientation, -1);
        if (i1 >= 0)
        {
            setOrientation(i1);
        }
        i1 = context.a(l.LinearLayoutCompat_android_gravity, -1);
        if (i1 >= 0)
        {
            setGravity(i1);
        }
        boolean flag = context.a(l.LinearLayoutCompat_android_baselineAligned, true);
        if (!flag)
        {
            setBaselineAligned(flag);
        }
        i1 = l.LinearLayoutCompat_android_weightSum;
        g = ((an) (context)).a.getFloat(i1, -1F);
        b = context.a(l.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        h = context.a(l.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(context.a(l.LinearLayoutCompat_divider));
        n = context.a(l.LinearLayoutCompat_showDividers, 0);
        o = context.c(l.LinearLayoutCompat_dividerPadding, 0);
        ((an) (context)).a.recycle();
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
            v v1 = (v)view.getLayoutParams();
            if (v1.width == -1)
            {
                int i2 = v1.height;
                v1.height = view.getMeasuredHeight();
                measureChildWithMargins(view, l1, 0, j1, 0);
                v1.height = i2;
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
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if ((n & 1) == 0) goto _L4; else goto _L3
_L3:
        return true;
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
        if ((n & 2) == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1--;
        do
        {
            if (i1 < 0)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            if (getChildAt(i1).getVisibility() != 8)
            {
                break;
            }
            i1--;
        } while (true);
        if (true) goto _L3; else goto _L6
_L6:
        return false;
        return false;
    }

    private void b(int i1, int j1)
    {
        f = 0;
        int i3 = 0;
        int j2 = 0;
        int i2 = 0;
        int l2 = 0;
        int k2 = 1;
        float f1 = 0.0F;
        int i7 = getVirtualChildCount();
        int k7 = android.view.View.MeasureSpec.getMode(i1);
        int j7 = android.view.View.MeasureSpec.getMode(j1);
        boolean flag = false;
        int k1 = 0;
        if (i == null || j == null)
        {
            i = new int[4];
            j = new int[4];
        }
        int ai[] = i;
        int ai1[] = j;
        ai[3] = -1;
        ai[2] = -1;
        ai[1] = -1;
        ai[0] = -1;
        ai1[3] = -1;
        ai1[2] = -1;
        ai1[1] = -1;
        ai1[0] = -1;
        boolean flag2 = a;
        boolean flag3 = h;
        int l1;
        boolean flag1;
        int j3;
        if (k7 == 0x40000000)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l1 = 0x80000000;
        j3 = 0;
        while (j3 < i7) 
        {
            Object obj = getChildAt(j3);
            int i4;
            int k5;
            if (obj == null)
            {
                f = f;
                int l3 = l1;
                l1 = k2;
                int j5 = l2;
                l2 = j2;
                k2 = i2;
                j2 = j5;
                i2 = l1;
                l1 = k1;
                k1 = l3;
            } else
            if (((View) (obj)).getVisibility() != 8)
            {
                if (a(j3))
                {
                    f = f + l;
                }
                v v2 = (v)((View) (obj)).getLayoutParams();
                f1 += v2.g;
                int k4;
                int l5;
                int j6;
                int l6;
                if (k7 == 0x40000000 && v2.width == 0 && v2.g > 0.0F)
                {
                    int l7;
                    if (flag1)
                    {
                        f = f + (v2.leftMargin + v2.rightMargin);
                    } else
                    {
                        k4 = f;
                        f = Math.max(k4, v2.leftMargin + k4 + v2.rightMargin);
                    }
                    if (flag2)
                    {
                        int j4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        ((View) (obj)).measure(j4, j4);
                        j4 = l1;
                        l1 = k1;
                        k1 = j4;
                    } else
                    {
                        k1 = l1;
                        l1 = 1;
                    }
                } else
                {
                    l5 = 0x80000000;
                    k4 = l5;
                    if (v2.width == 0)
                    {
                        k4 = l5;
                        if (v2.g > 0.0F)
                        {
                            k4 = 0;
                            v2.width = -2;
                        }
                    }
                    if (f1 == 0.0F)
                    {
                        l5 = f;
                    } else
                    {
                        l5 = 0;
                    }
                    a(((View) (obj)), i1, l5, j1, 0);
                    if (k4 != 0x80000000)
                    {
                        v2.width = k4;
                    }
                    k4 = ((View) (obj)).getMeasuredWidth();
                    if (flag1)
                    {
                        f = f + (v2.leftMargin + k4 + v2.rightMargin);
                    } else
                    {
                        l5 = f;
                        f = Math.max(l5, l5 + k4 + v2.leftMargin + v2.rightMargin);
                    }
                    float f2;
                    View view;
                    v v1;
                    int k3;
                    if (flag3)
                    {
                        k4 = Math.max(k4, l1);
                        l1 = k1;
                        k1 = k4;
                    } else
                    {
                        int l4 = k1;
                        k1 = l1;
                        l1 = l4;
                    }
                }
                l5 = 0;
                if (j7 != 0x40000000 && v2.height == -1)
                {
                    flag = true;
                    l5 = 1;
                }
                j6 = v2.topMargin + v2.bottomMargin;
                l6 = ((View) (obj)).getMeasuredHeight() + j6;
                k4 = at.a(j2, bt.i(((View) (obj))));
                if (flag2)
                {
                    l7 = ((View) (obj)).getBaseline();
                    if (l7 != -1)
                    {
                        if (v2.h < 0)
                        {
                            j2 = e;
                        } else
                        {
                            j2 = v2.h;
                        }
                        j2 = ((j2 & 0x70) >> 4 & -2) >> 1;
                        ai[j2] = Math.max(ai[j2], l7);
                        ai1[j2] = Math.max(ai1[j2], l6 - l7);
                    }
                }
                i3 = Math.max(i3, l6);
                if (k2 != 0 && v2.height == -1)
                {
                    j2 = 1;
                } else
                {
                    j2 = 0;
                }
                if (v2.g > 0.0F)
                {
                    if (l5 == 0)
                    {
                        j6 = l6;
                    }
                    k2 = Math.max(l2, j6);
                    l2 = k4;
                    k4 = i2;
                    i2 = j2;
                    j2 = k2;
                    k2 = k4;
                } else
                {
                    if (l5 == 0)
                    {
                        j6 = l6;
                    }
                    k2 = Math.max(i2, j6);
                    i2 = j2;
                    j2 = l2;
                    l2 = k4;
                }
            } else
            {
                int i5 = k1;
                int i6 = i2;
                int k6 = j2;
                k1 = l1;
                l1 = i5;
                i2 = k2;
                j2 = l2;
                k2 = i6;
                l2 = k6;
            }
            k5 = j3 + 1;
            j3 = k2;
            i4 = l2;
            k2 = l1;
            l1 = k1;
            k1 = k2;
            k2 = i2;
            l2 = j2;
            i2 = j3;
            j2 = i4;
            j3 = k5;
        }
        if (f > 0 && a(i7))
        {
            f = f + l;
        }
        if (ai[1] != -1 || ai[0] != -1 || ai[2] != -1 || ai[3] != -1)
        {
            i3 = Math.max(i3, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
        }
        if (flag3 && (k7 == 0x80000000 || k7 == 0))
        {
            f = 0;
            k3 = 0;
            while (k3 < i7) 
            {
                obj = getChildAt(k3);
                if (obj == null)
                {
                    f = f;
                } else
                if (((View) (obj)).getVisibility() != 8)
                {
                    obj = (v)((View) (obj)).getLayoutParams();
                    if (flag1)
                    {
                        k4 = f;
                        l5 = ((v) (obj)).leftMargin;
                        f = ((v) (obj)).rightMargin + (l5 + l1) + k4;
                    } else
                    {
                        k4 = f;
                        l5 = ((v) (obj)).leftMargin;
                        f = Math.max(k4, ((v) (obj)).rightMargin + (k4 + l1 + l5));
                    }
                }
                k3++;
            }
        }
        f = f + (getPaddingLeft() + getPaddingRight());
        j6 = bt.a(Math.max(f, getSuggestedMinimumWidth()), i1, 0);
        k3 = (0xffffff & j6) - f;
        if (k1 != 0 || k3 != 0 && f1 > 0.0F)
        {
label0:
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
                f = 0;
                i3 = 0;
                l1 = k2;
                k2 = -1;
                k1 = j2;
                j2 = k2;
                k2 = k3;
                while (i3 < i7) 
                {
                    obj = getChildAt(i3);
                    if (obj != null && ((View) (obj)).getVisibility() != 8)
                    {
                        v2 = (v)((View) (obj)).getLayoutParams();
                        f2 = v2.g;
                        if (f2 > 0.0F)
                        {
                            k3 = (int)(((float)k2 * f2) / f1);
                            l5 = getChildMeasureSpec(j1, getPaddingTop() + getPaddingBottom() + v2.topMargin + v2.bottomMargin, v2.height);
                            if (v2.width != 0 || k7 != 0x40000000)
                            {
                                k4 = k3 + ((View) (obj)).getMeasuredWidth();
                                l2 = k4;
                                if (k4 < 0)
                                {
                                    l2 = 0;
                                }
                            } else
                            if (k3 > 0)
                            {
                                l2 = k3;
                            } else
                            {
                                l2 = 0;
                            }
                            ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000), l5);
                            k1 = at.a(k1, bt.i(((View) (obj))) & 0xff000000);
                            f1 -= f2;
                            l2 = k2 - k3;
                            k2 = k1;
                            k1 = l2;
                        } else
                        {
                            l2 = k1;
                            k1 = k2;
                            k2 = l2;
                        }
                        if (flag1)
                        {
                            f = f + (((View) (obj)).getMeasuredWidth() + v2.leftMargin + v2.rightMargin);
                        } else
                        {
                            l2 = f;
                            f = Math.max(l2, ((View) (obj)).getMeasuredWidth() + l2 + v2.leftMargin + v2.rightMargin);
                        }
                        if (j7 != 0x40000000 && v2.height == -1)
                        {
                            l2 = 1;
                        } else
                        {
                            l2 = 0;
                        }
                        l5 = v2.topMargin + v2.bottomMargin;
                        k4 = ((View) (obj)).getMeasuredHeight() + l5;
                        k3 = Math.max(j2, k4);
                        if (l2 != 0)
                        {
                            j2 = l5;
                        } else
                        {
                            j2 = k4;
                        }
                        j2 = Math.max(i2, j2);
                        if (l1 != 0 && v2.height == -1)
                        {
                            l1 = 1;
                        } else
                        {
                            l1 = 0;
                        }
                        if (flag2)
                        {
                            l2 = ((View) (obj)).getBaseline();
                            if (l2 != -1)
                            {
                                if (v2.h < 0)
                                {
                                    i2 = e;
                                } else
                                {
                                    i2 = v2.h;
                                }
                                i2 = ((i2 & 0x70) >> 4 & -2) >> 1;
                                ai[i2] = Math.max(ai[i2], l2);
                                ai1[i2] = Math.max(ai1[i2], k4 - l2);
                            }
                        }
                        l2 = k2;
                        k2 = l1;
                        i2 = k3;
                        l1 = l2;
                    } else
                    {
                        k3 = l1;
                        l1 = k1;
                        l2 = j2;
                        k1 = k2;
                        k2 = k3;
                        j2 = i2;
                        i2 = l2;
                    }
                    k3 = i3 + 1;
                    l2 = k2;
                    i3 = i2;
                    k2 = k1;
                    k1 = l1;
                    l1 = l2;
                    i2 = j2;
                    j2 = i3;
                    i3 = k3;
                }
                f = f + (getPaddingLeft() + getPaddingRight());
                if (ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
                {
                    k2 = j2;
                    if (ai[3] == -1)
                    {
                        break label0;
                    }
                }
                k2 = Math.max(j2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
            }
            j2 = k1;
            i3 = k2;
            k1 = i2;
            do
            {
                if (l1 != 0 || j7 == 0x40000000)
                {
                    k1 = i3;
                }
                setMeasuredDimension(0xff000000 & j2 | j6, bt.a(Math.max(k1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j1, j2 << 16));
                if (flag)
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
                    for (j1 = 0; j1 < i7; j1++)
                    {
                        view = getChildAt(j1);
                        if (view.getVisibility() != 8)
                        {
                            v1 = (v)view.getLayoutParams();
                            if (v1.height == -1)
                            {
                                l1 = v1.width;
                                v1.width = view.getMeasuredWidth();
                                measureChildWithMargins(view, i1, 0, k1, 0);
                                v1.width = l1;
                            }
                        }
                    }

                }
                return;
            } while (true);
        } else
        {
            i2 = Math.max(i2, l2);
            if (flag3 && k7 != 0x40000000)
            {
                for (k1 = 0; k1 < i7; k1++)
                {
                    view = getChildAt(k1);
                    if (view != null && view.getVisibility() != 8 && ((v)view.getLayoutParams()).g > 0.0F)
                    {
                        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
                    }
                }

            }
            k1 = i2;
            l1 = k2;
            continue;
        }
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

    private static int getChildrenSkipCount$5359dca7()
    {
        return 0;
    }

    private static int getLocationOffset$3c7ec8d0()
    {
        return 0;
    }

    private static int getNextLocationOffset$3c7ec8d0()
    {
        return 0;
    }

    public v a(AttributeSet attributeset)
    {
        return new v(getContext(), attributeset);
    }

    protected v b(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new v(layoutparams);
    }

    protected v c()
    {
        if (d == 0)
        {
            return new v(-2, -2);
        }
        if (d == 1)
        {
            return new v(-1, -2);
        } else
        {
            return null;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof v;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return c();
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
        int j1;
        if (getChildCount() <= b)
        {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        view = getChildAt(b);
        j1 = view.getBaseline();
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b != 0)
        {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1 = c;
        if (d != 1) goto _L6; else goto _L5
_L5:
        int k1 = e & 0x70;
        if (k1 == 48) goto _L6; else goto _L7
_L7:
        k1;
        JVM INSTR lookupswitch 2: default 132
    //                   16: 170
    //                   80: 147;
           goto _L6 _L8 _L9
_L6:
        return ((v)view.getLayoutParams()).topMargin + i1 + j1;
_L9:
        i1 = getBottom() - getTop() - getPaddingBottom() - f;
        continue; /* Loop/switch isn't completed */
_L8:
        i1 += (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - f) / 2;
        if (true) goto _L6; else goto _L10
_L10:
    }

    public int getBaselineAlignedChildIndex()
    {
        return b;
    }

    public Drawable getDividerDrawable()
    {
        return k;
    }

    public int getDividerPadding()
    {
        return o;
    }

    public int getDividerWidth()
    {
        return l;
    }

    public int getOrientation()
    {
        return d;
    }

    public int getShowDividers()
    {
        return n;
    }

    int getVirtualChildCount()
    {
        return getChildCount();
    }

    public float getWeightSum()
    {
        return g;
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
        int i2 = getVirtualChildCount();
        for (int i1 = 0; i1 < i2; i1++)
        {
            View view = getChildAt(i1);
            if (view != null && view.getVisibility() != 8 && a(i1))
            {
                v v1 = (v)view.getLayoutParams();
                a(canvas, view.getTop() - v1.topMargin - m);
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
                v v2 = (v)view1.getLayoutParams();
                j1 = view1.getBottom();
                j1 = v2.bottomMargin + j1;
            }
            a(canvas, j1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k2 = getVirtualChildCount();
        boolean flag = at.a(this);
        int k1 = 0;
        while (k1 < k2) 
        {
            View view2 = getChildAt(k1);
            if (view2 != null && view2.getVisibility() != 8 && a(k1))
            {
                v v3 = (v)view2.getLayoutParams();
                int j2;
                if (flag)
                {
                    j2 = view2.getRight();
                    j2 = v3.rightMargin + j2;
                } else
                {
                    j2 = view2.getLeft() - v3.leftMargin - l;
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
                v v4 = (v)view3.getLayoutParams();
                if (flag)
                {
                    l1 = view3.getLeft() - v4.leftMargin - l;
                } else
                {
                    l1 = view3.getRight();
                    l1 = v4.rightMargin + l1;
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
        l3 = getVirtualChildCount();
        i1 = e;
        i4 = e;
        i1 & 0x70;
        JVM INSTR lookupswitch 2: default 80
    //                   16: 293
    //                   80: 275;
           goto _L3 _L4 _L5
_L3:
        i1 = getPaddingTop();
_L13:
        k1 = 0;
_L12:
        View view;
        if (k1 >= l3)
        {
            break MISSING_BLOCK_LABEL_854;
        }
        view = getChildAt(k1);
        j1 = i1;
        if (view == null) goto _L7; else goto _L6
_L6:
        j1 = i1;
        if (view.getVisibility() == 8) goto _L7; else goto _L8
_L8:
        v v1;
        int j4;
        int k4;
        j4 = view.getMeasuredWidth();
        k4 = view.getMeasuredHeight();
        v1 = (v)view.getLayoutParams();
        l1 = v1.h;
        j1 = l1;
        if (l1 < 0)
        {
            j1 = 0x800007 & i4;
        }
        q.a(j1, bt.e(this)) & 7;
        JVM INSTR lookupswitch 2: default 204
    //                   1: 313
    //                   5: 345;
           goto _L9 _L10 _L11
_L9:
        j1 = v1.leftMargin + i2;
_L14:
        l1 = i1;
        if (a(k1))
        {
            l1 = i1 + m;
        }
        i1 = l1 + v1.topMargin;
        b(view, j1, i1, j4, k4);
        j1 = i1 + (v1.bottomMargin + k4);
_L7:
        k1++;
        i1 = j1;
          goto _L12
_L5:
        i1 = (getPaddingTop() + l1) - j1 - f;
          goto _L13
_L4:
        i1 = getPaddingTop() + (l1 - j1 - f) / 2;
          goto _L13
_L10:
        j1 = ((k2 - i2 - j3 - j4) / 2 + i2 + v1.leftMargin) - v1.rightMargin;
          goto _L14
_L11:
        j1 = k2 - i3 - j4 - v1.rightMargin;
          goto _L14
_L2:
        int ai[];
        int ai1[];
        int l4;
        boolean flag1;
        flag = at.a(this);
        i3 = getPaddingTop();
        l3 = l1 - j1;
        i4 = getPaddingBottom();
        j4 = getPaddingBottom();
        k4 = getVirtualChildCount();
        j1 = e;
        l4 = e;
        flag1 = a;
        ai = i;
        ai1 = j;
        q.a(j1 & 0x800007, bt.e(this));
        JVM INSTR lookupswitch 2: default 464
    //                   1: 722
    //                   5: 704;
           goto _L15 _L16 _L17
_L15:
        i1 = getPaddingLeft();
_L26:
        View view1;
        v v2;
        int j2;
        int l2;
        int k3;
        int i5;
        int j5;
        int k5;
        if (flag)
        {
            l1 = k4 - 1;
            k1 = -1;
        } else
        {
            l1 = 0;
            k1 = 1;
        }
        j2 = 0;
        j1 = i1;
_L25:
        if (j2 >= k4)
        {
            break MISSING_BLOCK_LABEL_854;
        }
        k5 = l1 + k1 * j2;
        view1 = getChildAt(k5);
        i1 = j1;
        if (view1 == null) goto _L19; else goto _L18
_L18:
        i1 = j1;
        if (view1.getVisibility() == 8) goto _L19; else goto _L20
_L20:
        i5 = view1.getMeasuredWidth();
        j5 = view1.getMeasuredHeight();
        i1 = -1;
        v2 = (v)view1.getLayoutParams();
        l2 = i1;
        if (flag1)
        {
            l2 = i1;
            if (v2.height != -1)
            {
                l2 = view1.getBaseline();
            }
        }
        k3 = v2.h;
        i1 = k3;
        if (k3 < 0)
        {
            i1 = l4 & 0x70;
        }
        i1 & 0x70;
        JVM INSTR lookupswitch 3: default 644
    //                   16: 775
    //                   48: 742
    //                   80: 807;
           goto _L21 _L22 _L23 _L24
_L24:
        break MISSING_BLOCK_LABEL_807;
_L21:
        i1 = i3;
_L27:
        if (a(k5))
        {
            j1 = l + j1;
        }
        j1 += v2.leftMargin;
        b(view1, j1, i1, i5, j5);
        i1 = j1 + (v2.rightMargin + i5);
_L19:
        j2++;
        j1 = i1;
          goto _L25
_L17:
        i1 = (getPaddingLeft() + k1) - i1 - f;
          goto _L26
_L16:
        i1 = getPaddingLeft() + (k1 - i1 - f) / 2;
          goto _L26
_L23:
        k3 = v2.topMargin + i3;
        i1 = k3;
        if (l2 != -1)
        {
            i1 = (ai[1] - l2) + k3;
        }
          goto _L27
_L22:
        i1 = ((l3 - i3 - j4 - j5) / 2 + i3 + v2.topMargin) - v2.bottomMargin;
          goto _L27
        k3 = l3 - i4 - j5 - v2.bottomMargin;
        i1 = k3;
        if (l2 != -1)
        {
            i1 = view1.getMeasuredHeight();
            i1 = k3 - (ai1[2] - (i1 - l2));
        }
          goto _L27
          goto _L12
    }

    public void onMeasure(int i1, int j1)
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
        int i3;
        boolean flag;
        int j3;
        int l9;
        int i10;
        int j10;
        int k10;
        boolean flag1;
        f = 0;
        i2 = 0;
        l1 = 0;
        k1 = 0;
        i3 = 0;
        j2 = 1;
        f1 = 0.0F;
        l9 = getVirtualChildCount();
        i10 = android.view.View.MeasureSpec.getMode(i1);
        j10 = android.view.View.MeasureSpec.getMode(j1);
        flag = false;
        l2 = 0;
        k10 = b;
        flag1 = h;
        k2 = 0x80000000;
        j3 = 0;
_L7:
        if (j3 >= l9) goto _L4; else goto _L3
_L3:
        View view = getChildAt(j3);
        if (view != null) goto _L6; else goto _L5
_L5:
        f = f;
        int j4 = k2;
        int j6 = l2;
        int i8 = j2;
        j2 = i3;
        i3 = i2;
        l2 = l1;
        k2 = k1;
        i2 = i8;
        l1 = j6;
        k1 = j4;
_L12:
        int j9 = j3 + 1;
        j3 = j2;
        int k4 = k2;
        int k6 = l2;
        int j8 = i3;
        k2 = k1;
        l2 = l1;
        j2 = i2;
        i3 = j3;
        k1 = k4;
        l1 = k6;
        i2 = j8;
        j3 = j9;
          goto _L7
_L6:
        v v1;
        if (view.getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_1643;
        }
        if (a(j3))
        {
            f = f + m;
        }
        v1 = (v)view.getLayoutParams();
        f1 += v1.g;
        if (j10 != 0x40000000 || v1.height != 0 || v1.g <= 0.0F) goto _L9; else goto _L8
_L8:
        l2 = f;
        f = Math.max(l2, v1.topMargin + l2 + v1.bottomMargin);
        l2 = 1;
_L11:
        if (k10 >= 0 && k10 == j3 + 1)
        {
            c = f;
        }
        if (j3 < k10 && v1.g > 0.0F)
        {
            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        }
        break; /* Loop/switch isn't completed */
_L9:
        int l6 = 0x80000000;
        int l4 = l6;
        if (v1.height == 0)
        {
            l4 = l6;
            if (v1.g > 0.0F)
            {
                l4 = 0;
                v1.height = -2;
            }
        }
        if (f1 == 0.0F)
        {
            l6 = f;
        } else
        {
            l6 = 0;
        }
        a(view, i1, 0, j1, l6);
        if (l4 != 0x80000000)
        {
            v1.height = l4;
        }
        l4 = view.getMeasuredHeight();
        l6 = f;
        f = Math.max(l6, l6 + l4 + v1.topMargin + v1.bottomMargin);
        if (flag1)
        {
            k2 = Math.max(l4, k2);
        }
        if (true) goto _L11; else goto _L10
_L10:
        int i7 = 0;
        if (i10 != 0x40000000 && v1.width == -1)
        {
            flag = true;
            i7 = 1;
        }
        int k8 = v1.leftMargin + v1.rightMargin;
        int k9 = view.getMeasuredWidth() + k8;
        i2 = Math.max(i2, k9);
        int i5 = at.a(l1, bt.i(view));
        if (j2 != 0 && v1.width == -1)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (v1.g > 0.0F)
        {
            if (i7 == 0)
            {
                k8 = k9;
            }
            i3 = Math.max(i3, k8);
            j2 = l1;
            l1 = k2;
            k2 = k1;
            i7 = i2;
            k1 = l1;
            l1 = l2;
            i2 = j2;
            j2 = i3;
            l2 = i5;
            i3 = i7;
        } else
        {
            if (i7 == 0)
            {
                k8 = k9;
            }
            k1 = Math.max(k1, k8);
            j2 = l1;
            l1 = l2;
            i7 = i2;
            l2 = k1;
            k1 = k2;
            i2 = j2;
            j2 = i3;
            k2 = l2;
            l2 = i5;
            i3 = i7;
        }
          goto _L12
_L2:
        b(i1, j1);
        return;
_L4:
label0:
        {
            {
                if (f > 0 && a(l9))
                {
                    f = f + m;
                }
                if (flag1 && (j10 == 0x80000000 || j10 == 0))
                {
                    f = 0;
                    int k3 = 0;
                    while (k3 < l9) 
                    {
                        Object obj = getChildAt(k3);
                        if (obj == null)
                        {
                            f = f;
                        } else
                        if (((View) (obj)).getVisibility() != 8)
                        {
                            obj = (v)((View) (obj)).getLayoutParams();
                            int j5 = f;
                            int j7 = ((v) (obj)).topMargin;
                            f = Math.max(j5, ((v) (obj)).bottomMargin + (j5 + k2 + j7));
                        }
                        k3++;
                    }
                }
                f = f + (getPaddingTop() + getPaddingBottom());
                int k7 = bt.a(Math.max(f, getSuggestedMinimumHeight()), j1, 0);
                int l3 = (0xffffff & k7) - f;
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
                l2 = k1;
                k1 = l1;
                j2 = i2;
                i2 = l2;
                l1 = k2;
                k2 = l3;
                while (i3 < l9) 
                {
                    View view1 = getChildAt(i3);
                    if (view1.getVisibility() != 8)
                    {
                        v v2 = (v)view1.getLayoutParams();
                        float f2 = v2.g;
                        int l5;
                        if (f2 > 0.0F)
                        {
                            int i4 = (int)(((float)k2 * f2) / f1);
                            int l8 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + v2.leftMargin + v2.rightMargin, v2.width);
                            if (v2.height != 0 || j10 != 0x40000000)
                            {
                                int k5 = i4 + view1.getMeasuredHeight();
                                l2 = k5;
                                if (k5 < 0)
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
                            view1.measure(l8, android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000));
                            k1 = at.a(k1, bt.i(view1) & 0xffffff00);
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
                        i4 = v2.leftMargin + v2.rightMargin;
                        l5 = view1.getMeasuredWidth() + i4;
                        l2 = Math.max(j2, l5);
                        if (i10 != 0x40000000 && v2.width == -1)
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
                            j2 = l5;
                        }
                        i2 = Math.max(i2, j2);
                        if (l1 != 0 && v2.width == -1)
                        {
                            l1 = 1;
                        } else
                        {
                            l1 = 0;
                        }
                        j2 = f;
                        i4 = view1.getMeasuredHeight();
                        l5 = v2.topMargin;
                        f = Math.max(j2, v2.bottomMargin + (i4 + j2 + l5));
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
                l1 = k1;
                k1 = k2;
            }
            if (j2 != 0 || i10 == 0x40000000)
            {
                k1 = i2;
            }
            setMeasuredDimension(bt.a(Math.max(k1 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i1, l1), k7);
            if (flag)
            {
                a(l9, j1);
            }
            return;
        }
        l2 = Math.max(k1, i3);
        if (flag1 && j10 != 0x40000000)
        {
            for (k1 = 0; k1 < l9; k1++)
            {
                view1 = getChildAt(k1);
                if (view1 != null && view1.getVisibility() != 8 && ((v)view1.getLayoutParams()).g > 0.0F)
                {
                    view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x40000000));
                }
            }

        }
        k1 = l2;
        if (true)
        {
            break MISSING_BLOCK_LABEL_1417;
        }
        int i6 = i3;
        int l7 = k1;
        int i9 = l1;
        i3 = i2;
        k1 = k2;
        l1 = l2;
        i2 = j2;
        j2 = i6;
        k2 = l7;
        l2 = i9;
          goto _L12
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
            if ((0x800007 & i1) == 0)
            {
                i1 = 0x800003 | i1;
            }
            int j1 = i1;
            if ((i1 & 0x70) == 0)
            {
                j1 = i1 | 0x30;
            }
            e = j1;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i1)
    {
        i1 &= 0x800007;
        if ((e & 0x800007) != i1)
        {
            e = i1 | e & 0xff7ffff8;
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
            e = i1 | e & 0xffffff8f;
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
