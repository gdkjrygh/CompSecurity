// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bq;
import android.support.v4.view.q;
import android.support.v7.b.k;
import android.support.v7.internal.widget.am;
import android.support.v7.internal.widget.aq;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v7.widget:
//            ab

public class aa extends ViewGroup
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

    public aa(Context context)
    {
        this(context, null);
    }

    public aa(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public aa(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = true;
        b = -1;
        c = 0;
        e = 0x800033;
        context = am.a(context, attributeset, k.LinearLayoutCompat, i1, 0);
        i1 = context.a(k.LinearLayoutCompat_android_orientation, -1);
        if (i1 >= 0)
        {
            setOrientation(i1);
        }
        i1 = context.a(k.LinearLayoutCompat_android_gravity, -1);
        if (i1 >= 0)
        {
            setGravity(i1);
        }
        boolean flag = context.a(k.LinearLayoutCompat_android_baselineAligned, true);
        if (!flag)
        {
            setBaselineAligned(flag);
        }
        g = context.a(k.LinearLayoutCompat_android_weightSum, -1F);
        b = context.a(k.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        h = context.a(k.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(context.a(k.LinearLayoutCompat_divider));
        n = context.a(k.LinearLayoutCompat_showDividers, 0);
        o = context.e(k.LinearLayoutCompat_dividerPadding, 0);
        context.b();
    }

    private void a(View view, int i1, int j1, int k1, int l1)
    {
        view.layout(i1, j1, i1 + k1, j1 + l1);
    }

    private void c(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
        for (int k1 = 0; k1 < i1; k1++)
        {
            View view = b(k1);
            if (view.getVisibility() == 8)
            {
                continue;
            }
            ab ab1 = (ab)view.getLayoutParams();
            if (ab1.width == -1)
            {
                int i2 = ab1.height;
                ab1.height = view.getMeasuredHeight();
                measureChildWithMargins(view, l1, 0, j1, 0);
                ab1.height = i2;
            }
        }

    }

    private void d(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
        for (int k1 = 0; k1 < i1; k1++)
        {
            View view = b(k1);
            if (view.getVisibility() == 8)
            {
                continue;
            }
            ab ab1 = (ab)view.getLayoutParams();
            if (ab1.height == -1)
            {
                int i2 = ab1.width;
                ab1.width = view.getMeasuredWidth();
                measureChildWithMargins(view, j1, 0, l1, 0);
                ab1.width = i2;
            }
        }

    }

    int a(View view)
    {
        return 0;
    }

    int a(View view, int i1)
    {
        return 0;
    }

    void a(int i1, int j1)
    {
        float f1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l6;
        int i7;
        int j7;
        int k7;
        boolean flag;
        f = 0;
        l1 = 0;
        k1 = 0;
        l2 = 0;
        k3 = 0;
        i2 = 1;
        f1 = 0.0F;
        l6 = getVirtualChildCount();
        i7 = android.view.View.MeasureSpec.getMode(i1);
        j7 = android.view.View.MeasureSpec.getMode(j1);
        j3 = 0;
        k2 = 0;
        k7 = b;
        flag = h;
        j2 = 0x80000000;
        i3 = 0;
_L2:
        View view;
        if (i3 >= l6)
        {
            break MISSING_BLOCK_LABEL_728;
        }
        view = b(i3);
        if (view != null)
        {
            break; /* Loop/switch isn't completed */
        }
        f = f + d(i3);
        int l3 = j2;
        int l4 = k2;
        k2 = l1;
        j2 = k1;
        l1 = l4;
        k1 = l3;
_L3:
        i3++;
        int i4 = j2;
        int i5 = k2;
        j2 = k1;
        k2 = l1;
        k1 = i4;
        l1 = i5;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (view.getVisibility() != 8)
            {
                break label0;
            }
            int j5 = i3 + a(view, i3);
            i3 = j2;
            int j4 = k2;
            j2 = k1;
            k2 = l1;
            k1 = i3;
            l1 = j4;
            i3 = j5;
        }
          goto _L3
        ab ab1;
        if (c(i3))
        {
            f = f + m;
        }
        ab1 = (ab)view.getLayoutParams();
        f1 += ab1.g;
        if (j7 != 0x40000000 || ab1.height != 0 || ab1.g <= 0.0F) goto _L5; else goto _L4
_L4:
        int k4;
        int k5;
        k2 = f;
        f = Math.max(k2, ab1.topMargin + k2 + ab1.bottomMargin);
        k5 = 1;
        k4 = j2;
_L7:
        if (k7 >= 0 && k7 == i3 + 1)
        {
            c = f;
        }
        if (i3 < k7 && ab1.g > 0.0F)
        {
            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        }
        break; /* Loop/switch isn't completed */
_L5:
        k5 = 0x80000000;
        k4 = k5;
        if (ab1.height == 0)
        {
            k4 = k5;
            if (ab1.g > 0.0F)
            {
                k4 = 0;
                ab1.height = -2;
            }
        }
        int l5;
        if (f1 == 0.0F)
        {
            k5 = f;
        } else
        {
            k5 = 0;
        }
        a(view, i3, i1, 0, j1, k5);
        if (k4 != 0x80000000)
        {
            ab1.height = k4;
        }
        l5 = view.getMeasuredHeight();
        k4 = f;
        f = Math.max(k4, k4 + l5 + ab1.topMargin + ab1.bottomMargin + b(view));
        k4 = j2;
        k5 = k2;
        if (flag)
        {
            k4 = Math.max(l5, j2);
            k5 = k2;
        }
        if (true) goto _L7; else goto _L6
_L6:
        k2 = 0;
        float f2;
        int i6;
        int j6;
        int k6;
        if (i7 != 0x40000000 && ab1.width == -1)
        {
            j2 = 1;
            k2 = 1;
        } else
        {
            j2 = j3;
        }
        j3 = ab1.leftMargin;
        j3 = ab1.rightMargin + j3;
        i6 = view.getMeasuredWidth() + j3;
        k6 = Math.max(l1, i6);
        j6 = aq.a(k1, bq.g(view));
        if (i2 != 0 && ab1.width == -1)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        if (ab1.g > 0.0F)
        {
            if (k2 == 0)
            {
                j3 = i6;
            }
            l1 = Math.max(k3, j3);
            k1 = l2;
        } else
        {
            if (k2 == 0)
            {
                j3 = i6;
            }
            k1 = Math.max(l2, j3);
            l1 = k3;
        }
        i3 += a(view, i3);
        k3 = l1;
        l2 = k1;
        k2 = k6;
        k1 = k4;
        k4 = j6;
        j3 = j2;
        l1 = k5;
        j2 = k4;
          goto _L3
label1:
        {
            {
                if (f > 0 && c(l6))
                {
                    f = f + m;
                }
                if (flag && (j7 == 0x80000000 || j7 == 0))
                {
                    f = 0;
                    i3 = 0;
                    while (i3 < l6) 
                    {
                        view = b(i3);
                        if (view == null)
                        {
                            f = f + d(i3);
                        } else
                        if (view.getVisibility() == 8)
                        {
                            i3 = a(view, i3) + i3;
                        } else
                        {
                            ab1 = (ab)view.getLayoutParams();
                            k4 = f;
                            k5 = ab1.topMargin;
                            f = Math.max(k4, ab1.bottomMargin + (k4 + j2 + k5) + b(view));
                        }
                        i3++;
                    }
                }
                f = f + (getPaddingTop() + getPaddingBottom());
                k5 = bq.a(Math.max(f, getSuggestedMinimumHeight()), j1, 0);
                i3 = (0xffffff & k5) - f;
                if (k2 == 0 && (i3 == 0 || f1 <= 0.0F))
                {
                    break label1;
                }
                if (g > 0.0F)
                {
                    f1 = g;
                }
                f = 0;
                j2 = 0;
                k2 = i2;
                i2 = l2;
                l2 = i3;
                i3 = j2;
                j2 = l1;
                l1 = k2;
                k2 = l2;
                while (i3 < l6) 
                {
                    view = b(i3);
                    if (view.getVisibility() == 8)
                    {
                        l2 = i2;
                        i2 = j2;
                        j2 = l2;
                    } else
                    {
                        ab1 = (ab)view.getLayoutParams();
                        f2 = ab1.g;
                        if (f2 > 0.0F)
                        {
                            k3 = (int)(((float)k2 * f2) / f1);
                            i6 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + ab1.leftMargin + ab1.rightMargin, ab1.width);
                            if (ab1.height != 0 || j7 != 0x40000000)
                            {
                                k4 = k3 + view.getMeasuredHeight();
                                l2 = k4;
                                if (k4 < 0)
                                {
                                    l2 = 0;
                                }
                                view.measure(i6, android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000));
                            } else
                            {
                                if (k3 > 0)
                                {
                                    l2 = k3;
                                } else
                                {
                                    l2 = 0;
                                }
                                view.measure(i6, android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000));
                            }
                            k1 = aq.a(k1, bq.g(view) & 0xffffff00);
                            l2 = k2 - k3;
                            k2 = k1;
                            f1 -= f2;
                            k1 = l2;
                        } else
                        {
                            l2 = k1;
                            k1 = k2;
                            k2 = l2;
                        }
                        k3 = ab1.leftMargin + ab1.rightMargin;
                        k4 = view.getMeasuredWidth() + k3;
                        l2 = Math.max(j2, k4);
                        if (i7 != 0x40000000 && ab1.width == -1)
                        {
                            j2 = 1;
                        } else
                        {
                            j2 = 0;
                        }
                        if (j2 != 0)
                        {
                            j2 = k3;
                        } else
                        {
                            j2 = k4;
                        }
                        j2 = Math.max(i2, j2);
                        if (l1 != 0 && ab1.width == -1)
                        {
                            l1 = 1;
                        } else
                        {
                            l1 = 0;
                        }
                        i2 = f;
                        k3 = view.getMeasuredHeight();
                        k4 = ab1.topMargin;
                        f = Math.max(i2, ab1.bottomMargin + (k3 + i2 + k4) + b(view));
                        i2 = l2;
                        l2 = k1;
                        k1 = k2;
                        k2 = l2;
                    }
                    i3++;
                    l2 = i2;
                    i2 = j2;
                    j2 = l2;
                }
                f = f + (getPaddingTop() + getPaddingBottom());
                k2 = l1;
                l1 = i2;
                i2 = k2;
            }
            if (i2 != 0 || i7 == 0x40000000)
            {
                l1 = j2;
            }
            setMeasuredDimension(bq.a(Math.max(l1 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i1, k1), k5);
            if (j3 != 0)
            {
                c(l6, j1);
            }
            return;
        }
        l2 = Math.max(l2, k3);
        if (flag && j7 != 0x40000000)
        {
            k2 = 0;
            do
            {
                if (k2 >= l6)
                {
                    break;
                }
                view = b(k2);
                if (view != null && view.getVisibility() != 8 && ((ab)view.getLayoutParams()).g > 0.0F)
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000));
                }
                k2++;
            } while (true);
        }
        j2 = l2;
        k2 = l1;
        l1 = j2;
        j2 = k2;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_1470;
        }
    }

    void a(int i1, int j1, int k1, int l1)
    {
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        i2 = getPaddingLeft();
        j2 = k1 - i1;
        k2 = getPaddingRight();
        l2 = getPaddingRight();
        i3 = getVirtualChildCount();
        i1 = e;
        j3 = e;
        i1 & 0x70;
        JVM INSTR lookupswitch 2: default 72
    //                   16: 134
    //                   80: 116;
           goto _L1 _L2 _L3
_L1:
        i1 = getPaddingTop();
_L15:
        k1 = 0;
        j1 = i1;
        i1 = k1;
_L7:
        View view;
        if (i1 >= i3)
        {
            break; /* Loop/switch isn't completed */
        }
        view = b(i1);
        if (view != null) goto _L5; else goto _L4
_L4:
        j1 += d(i1);
_L9:
        i1++;
        if (true) goto _L7; else goto _L6
_L3:
        i1 = (getPaddingTop() + l1) - j1 - f;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = getPaddingTop() + (l1 - j1 - f) / 2;
        continue; /* Loop/switch isn't completed */
_L5:
        if (view.getVisibility() == 8) goto _L9; else goto _L8
_L8:
        ab ab1;
        int k3;
        int l3;
        k3 = view.getMeasuredWidth();
        l3 = view.getMeasuredHeight();
        ab1 = (ab)view.getLayoutParams();
        l1 = ab1.h;
        k1 = l1;
        if (l1 < 0)
        {
            k1 = j3 & 0x800007;
        }
        q.a(k1, bq.e(this)) & 7;
        JVM INSTR lookupswitch 2: default 248
    //                   1: 330
    //                   5: 362;
           goto _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_362;
_L10:
        k1 = i2 + ab1.leftMargin;
_L13:
        if (c(i1))
        {
            j1 = m + j1;
        }
        j1 += ab1.topMargin;
        a(view, k1, j1 + a(view), k3, l3);
        j1 += ab1.bottomMargin + l3 + b(view);
        i1 = a(view, i1) + i1;
          goto _L9
_L11:
        k1 = ((j2 - i2 - l2 - k3) / 2 + i2 + ab1.leftMargin) - ab1.rightMargin;
          goto _L13
        k1 = j2 - k2 - k3 - ab1.rightMargin;
          goto _L13
_L6:
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    void a(Canvas canvas)
    {
        int k1 = getVirtualChildCount();
        for (int i1 = 0; i1 < k1; i1++)
        {
            View view = b(i1);
            if (view != null && view.getVisibility() != 8 && c(i1))
            {
                ab ab1 = (ab)view.getLayoutParams();
                a(canvas, view.getTop() - ab1.topMargin - m);
            }
        }

        if (c(k1))
        {
            View view1 = b(k1 - 1);
            int j1;
            if (view1 == null)
            {
                j1 = getHeight() - getPaddingBottom() - m;
            } else
            {
                ab ab2 = (ab)view1.getLayoutParams();
                j1 = view1.getBottom();
                j1 = ab2.bottomMargin + j1;
            }
            a(canvas, j1);
        }
    }

    void a(Canvas canvas, int i1)
    {
        k.setBounds(getPaddingLeft() + o, i1, getWidth() - getPaddingRight() - o, m + i1);
        k.draw(canvas);
    }

    void a(View view, int i1, int j1, int k1, int l1, int i2)
    {
        measureChildWithMargins(view, j1, k1, l1, i2);
    }

    int b(View view)
    {
        return 0;
    }

    public ab b(AttributeSet attributeset)
    {
        return new ab(getContext(), attributeset);
    }

    protected ab b(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new ab(layoutparams);
    }

    View b(int i1)
    {
        return getChildAt(i1);
    }

    void b(int i1, int j1)
    {
        f = 0;
        int i2 = 0;
        int l1 = 0;
        int l2 = 0;
        int j3 = 0;
        int k1 = 1;
        float f1 = 0.0F;
        int l6 = getVirtualChildCount();
        int j7 = android.view.View.MeasureSpec.getMode(i1);
        int i7 = android.view.View.MeasureSpec.getMode(j1);
        int i3 = 0;
        int k2 = 0;
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
        boolean flag1 = a;
        boolean flag2 = h;
        int j2;
        int k3;
        boolean flag;
        if (j7 == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j2 = 0x80000000;
        k3 = 0;
        while (k3 < l6) 
        {
            View view1 = b(k3);
            int i4;
            int i5;
            if (view1 == null)
            {
                f = f + d(k3);
                int l3 = j2;
                int l4 = k2;
                k2 = i2;
                j2 = l1;
                i2 = k1;
                l1 = l4;
                k1 = l3;
            } else
            if (view1.getVisibility() == 8)
            {
                int l5 = k3 + a(view1, k3);
                k3 = j2;
                int j5 = k2;
                j2 = k1;
                k2 = l1;
                int j4 = i2;
                k1 = k3;
                l1 = j5;
                k3 = l5;
                i2 = j2;
                j2 = k2;
                k2 = j4;
            } else
            {
                if (c(k3))
                {
                    f = f + l;
                }
                ab ab1 = (ab)view1.getLayoutParams();
                f1 += ab1.g;
                int k4;
                int k5;
                int i6;
                if (j7 == 0x40000000 && ab1.width == 0 && ab1.g > 0.0F)
                {
                    int j6;
                    int k6;
                    if (flag)
                    {
                        f = f + (ab1.leftMargin + ab1.rightMargin);
                    } else
                    {
                        k4 = f;
                        f = Math.max(k4, ab1.leftMargin + k4 + ab1.rightMargin);
                    }
                    if (flag1)
                    {
                        k4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        view1.measure(k4, k4);
                        k5 = k2;
                        k4 = j2;
                    } else
                    {
                        k5 = 1;
                        k4 = j2;
                    }
                } else
                {
                    k5 = 0x80000000;
                    k4 = k5;
                    if (ab1.width == 0)
                    {
                        k4 = k5;
                        if (ab1.g > 0.0F)
                        {
                            k4 = 0;
                            ab1.width = -2;
                        }
                    }
                    if (f1 == 0.0F)
                    {
                        k5 = f;
                    } else
                    {
                        k5 = 0;
                    }
                    a(view1, k3, i1, k5, j1, 0);
                    if (k4 != 0x80000000)
                    {
                        ab1.width = k4;
                    }
                    i6 = view1.getMeasuredWidth();
                    if (flag)
                    {
                        f = f + (ab1.leftMargin + i6 + ab1.rightMargin + b(view1));
                    } else
                    {
                        k4 = f;
                        f = Math.max(k4, k4 + i6 + ab1.leftMargin + ab1.rightMargin + b(view1));
                    }
                    k4 = j2;
                    k5 = k2;
                    if (flag2)
                    {
                        k4 = Math.max(i6, j2);
                        k5 = k2;
                    }
                }
                k2 = 0;
                float f2;
                View view;
                if (i7 != 0x40000000 && ab1.height == -1)
                {
                    j2 = 1;
                    k2 = 1;
                } else
                {
                    j2 = i3;
                }
                i3 = ab1.topMargin;
                i3 = ab1.bottomMargin + i3;
                i6 = view1.getMeasuredHeight() + i3;
                j6 = aq.a(l1, bq.g(view1));
                if (flag1)
                {
                    k6 = view1.getBaseline();
                    if (k6 != -1)
                    {
                        if (ab1.h < 0)
                        {
                            l1 = e;
                        } else
                        {
                            l1 = ab1.h;
                        }
                        l1 = ((l1 & 0x70) >> 4 & -2) >> 1;
                        ai[l1] = Math.max(ai[l1], k6);
                        ai1[l1] = Math.max(ai1[l1], i6 - k6);
                    }
                }
                k6 = Math.max(i2, i6);
                if (k1 != 0 && ab1.height == -1)
                {
                    i2 = 1;
                } else
                {
                    i2 = 0;
                }
                if (ab1.g > 0.0F)
                {
                    if (k2 == 0)
                    {
                        i3 = i6;
                    }
                    l1 = Math.max(j3, i3);
                    k1 = l2;
                } else
                {
                    if (k2 == 0)
                    {
                        i3 = i6;
                    }
                    k1 = Math.max(l2, i3);
                    l1 = j3;
                }
                k3 += a(view1, k3);
                j3 = l1;
                l2 = k1;
                k2 = k6;
                k1 = k4;
                k4 = j6;
                i3 = j2;
                l1 = k5;
                j2 = k4;
            }
            k3++;
            i4 = j2;
            i5 = k2;
            j2 = k1;
            k2 = l1;
            k1 = i2;
            l1 = i4;
            i2 = i5;
        }
        if (f > 0 && c(l6))
        {
            f = f + l;
        }
        if (ai[1] != -1 || ai[0] != -1 || ai[2] != -1 || ai[3] != -1)
        {
            k3 = Math.max(i2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
        } else
        {
            k3 = i2;
        }
        if (flag2 && (j7 == 0x80000000 || j7 == 0))
        {
            f = 0;
            i2 = 0;
            while (i2 < l6) 
            {
                view1 = b(i2);
                if (view1 == null)
                {
                    f = f + d(i2);
                } else
                if (view1.getVisibility() == 8)
                {
                    i2 = a(view1, i2) + i2;
                } else
                {
                    ab1 = (ab)view1.getLayoutParams();
                    if (flag)
                    {
                        k4 = f;
                        k5 = ab1.leftMargin;
                        f = ab1.rightMargin + (k5 + j2) + b(view1) + k4;
                    } else
                    {
                        k4 = f;
                        k5 = ab1.leftMargin;
                        f = Math.max(k4, ab1.rightMargin + (k4 + j2 + k5) + b(view1));
                    }
                }
                i2++;
            }
        }
        f = f + (getPaddingLeft() + getPaddingRight());
        i6 = bq.a(Math.max(f, getSuggestedMinimumWidth()), i1, 0);
        i2 = (0xffffff & i6) - f;
        if (k2 == 0 && (i2 == 0 || f1 <= 0.0F)) goto _L2; else goto _L1
_L1:
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
            k3 = 0;
            j3 = l2;
            k2 = l1;
            j2 = i2;
            i2 = -1;
            l2 = k3;
            l1 = j3;
            while (l2 < l6) 
            {
                view1 = b(l2);
                if (view1 != null)
                {
                    if (view1.getVisibility() == 8)
                    {
                        j3 = j2;
                        j2 = i2;
                        i2 = l1;
                        l1 = k1;
                        k1 = j3;
                    } else
                    {
                        ab1 = (ab)view1.getLayoutParams();
                        f2 = ab1.g;
                        if (f2 > 0.0F)
                        {
                            k3 = (int)(((float)j2 * f2) / f1);
                            j3 = j2 - k3;
                            k4 = getChildMeasureSpec(j1, getPaddingTop() + getPaddingBottom() + ab1.topMargin + ab1.bottomMargin, ab1.height);
                            if (ab1.width != 0 || j7 != 0x40000000)
                            {
                                k3 += view1.getMeasuredWidth();
                                j2 = k3;
                                if (k3 < 0)
                                {
                                    j2 = 0;
                                }
                                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000), k4);
                            } else
                            {
                                if (k3 > 0)
                                {
                                    j2 = k3;
                                } else
                                {
                                    j2 = 0;
                                }
                                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000), k4);
                            }
                            k2 = aq.a(k2, bq.g(view1) & 0xff000000);
                            f1 -= f2;
                            j2 = j3;
                        }
                        if (flag)
                        {
                            f = f + (view1.getMeasuredWidth() + ab1.leftMargin + ab1.rightMargin + b(view1));
                        } else
                        {
                            j3 = f;
                            f = Math.max(j3, view1.getMeasuredWidth() + j3 + ab1.leftMargin + ab1.rightMargin + b(view1));
                        }
                        if (i7 != 0x40000000 && ab1.height == -1)
                        {
                            j3 = 1;
                        } else
                        {
                            j3 = 0;
                        }
                        k5 = ab1.topMargin + ab1.bottomMargin;
                        k4 = view1.getMeasuredHeight() + k5;
                        k3 = Math.max(i2, k4);
                        if (j3 != 0)
                        {
                            i2 = k5;
                        } else
                        {
                            i2 = k4;
                        }
                        i2 = Math.max(l1, i2);
                        if (k1 != 0 && ab1.height == -1)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        if (flag1)
                        {
                            j3 = view1.getBaseline();
                            if (j3 != -1)
                            {
                                if (ab1.h < 0)
                                {
                                    l1 = e;
                                } else
                                {
                                    l1 = ab1.h;
                                }
                                l1 = ((l1 & 0x70) >> 4 & -2) >> 1;
                                ai[l1] = Math.max(ai[l1], j3);
                                ai1[l1] = Math.max(ai1[l1], k4 - j3);
                            }
                        }
                        l1 = k1;
                        k1 = j2;
                        j2 = k3;
                    }
                } else
                {
                    j3 = j2;
                    j2 = i2;
                    i2 = l1;
                    l1 = k1;
                    k1 = j3;
                }
                j3 = l2 + 1;
                l2 = j2;
                j2 = k1;
                k1 = l1;
                l1 = i2;
                i2 = l2;
                l2 = j3;
            }
            f = f + (getPaddingLeft() + getPaddingRight());
            if (ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
            {
                j2 = i2;
                if (ai[3] == -1)
                {
                    break label0;
                }
            }
            j2 = Math.max(i2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
        }
        i2 = k1;
        k1 = k2;
        k2 = i2;
        i2 = l1;
_L4:
        if (k2 != 0 || i7 == 0x40000000)
        {
            i2 = j2;
        }
        setMeasuredDimension(0xff000000 & k1 | i6, bq.a(Math.max(i2 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j1, k1 << 16));
        if (i3 != 0)
        {
            d(l6, i1);
        }
        return;
_L2:
        k2 = Math.max(l2, j3);
        if (flag2 && j7 != 0x40000000)
        {
            i2 = 0;
            do
            {
                if (i2 >= l6)
                {
                    break;
                }
                view = b(i2);
                if (view != null && view.getVisibility() != 8 && ((ab)view.getLayoutParams()).g > 0.0F)
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
                }
                i2++;
            } while (true);
        }
        i2 = k2;
        j2 = k3;
        k2 = k1;
        k1 = l1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    void b(int i1, int j1, int k1, int l1)
    {
        int ai[];
        int ai1[];
        int k2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        boolean flag;
        boolean flag1;
        flag = aq.a(this);
        k2 = getPaddingTop();
        i3 = l1 - j1;
        j3 = getPaddingBottom();
        k3 = getPaddingBottom();
        l3 = getVirtualChildCount();
        j1 = e;
        i4 = e;
        flag1 = a;
        ai = i;
        ai1 = j;
        q.a(j1 & 0x800007, bq.e(this));
        JVM INSTR lookupswitch 2: default 104
    //                   1: 190
    //                   5: 173;
           goto _L1 _L2 _L3
_L1:
        i1 = getPaddingLeft();
_L9:
        View view;
        ab ab1;
        int i2;
        int j2;
        int l2;
        int j4;
        int k4;
        int l4;
        if (flag)
        {
            l1 = -1;
            i2 = l3 - 1;
        } else
        {
            l1 = 1;
            i2 = 0;
        }
        j1 = 0;
        k1 = i1;
_L8:
        if (j1 >= l3) goto _L5; else goto _L4
_L4:
        j4 = i2 + l1 * j1;
        view = b(j4);
        if (view != null) goto _L7; else goto _L6
_L6:
        k1 += d(j4);
        i1 = j1;
_L14:
        j1 = i1 + 1;
          goto _L8
_L3:
        i1 = (getPaddingLeft() + k1) - i1 - f;
          goto _L9
_L2:
        i1 = getPaddingLeft() + (k1 - i1 - f) / 2;
          goto _L9
_L7:
        if (view.getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_524;
        }
        k4 = view.getMeasuredWidth();
        l4 = view.getMeasuredHeight();
        ab1 = (ab)view.getLayoutParams();
        if (flag1 && ab1.height != -1)
        {
            j2 = view.getBaseline();
        } else
        {
            j2 = -1;
        }
        l2 = ab1.h;
        i1 = l2;
        if (l2 < 0)
        {
            i1 = i4 & 0x70;
        }
        i1 & 0x70;
        JVM INSTR lookupswitch 3: default 324
    //                   16: 435
    //                   48: 402
    //                   80: 467;
           goto _L10 _L11 _L12 _L13
_L13:
        break MISSING_BLOCK_LABEL_467;
_L10:
        i1 = k2;
_L15:
        if (c(j4))
        {
            k1 = l + k1;
        }
        k1 += ab1.leftMargin;
        a(view, k1 + a(view), i1, k4, l4);
        k1 += ab1.rightMargin + k4 + b(view);
        i1 = a(view, j4) + j1;
          goto _L14
_L12:
        l2 = k2 + ab1.topMargin;
        i1 = l2;
        if (j2 != -1)
        {
            i1 = l2 + (ai[1] - j2);
        }
          goto _L15
_L11:
        i1 = ((i3 - k2 - k3 - l4) / 2 + k2 + ab1.topMargin) - ab1.bottomMargin;
          goto _L15
        l2 = i3 - j3 - l4 - ab1.bottomMargin;
        i1 = l2;
        if (j2 != -1)
        {
            i1 = view.getMeasuredHeight();
            i1 = l2 - (ai1[2] - (i1 - j2));
        }
          goto _L15
_L5:
        return;
        i1 = j1;
          goto _L14
    }

    void b(Canvas canvas)
    {
        int l1 = getVirtualChildCount();
        boolean flag = aq.a(this);
        int i1 = 0;
        while (i1 < l1) 
        {
            View view = b(i1);
            if (view != null && view.getVisibility() != 8 && c(i1))
            {
                ab ab1 = (ab)view.getLayoutParams();
                int k1;
                if (flag)
                {
                    k1 = view.getRight();
                    k1 = ab1.rightMargin + k1;
                } else
                {
                    k1 = view.getLeft() - ab1.leftMargin - l;
                }
                b(canvas, k1);
            }
            i1++;
        }
        if (c(l1))
        {
            View view1 = b(l1 - 1);
            int j1;
            if (view1 == null)
            {
                if (flag)
                {
                    j1 = getPaddingLeft();
                } else
                {
                    j1 = getWidth() - getPaddingRight() - l;
                }
            } else
            {
                ab ab2 = (ab)view1.getLayoutParams();
                if (flag)
                {
                    j1 = view1.getLeft() - ab2.leftMargin - l;
                } else
                {
                    j1 = view1.getRight();
                    j1 = ab2.rightMargin + j1;
                }
            }
            b(canvas, j1);
        }
    }

    void b(Canvas canvas, int i1)
    {
        k.setBounds(i1, getPaddingTop() + o, l + i1, getHeight() - getPaddingBottom() - o);
        k.draw(canvas);
    }

    protected boolean c(int i1)
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

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof ab;
    }

    int d(int i1)
    {
        return 0;
    }

    protected ab g()
    {
        if (d == 0)
        {
            return new ab(-2, -2);
        }
        if (d == 1)
        {
            return new ab(-1, -2);
        } else
        {
            return null;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return g();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return b(attributeset);
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
        return ((ab)view.getLayoutParams()).topMargin + i1 + j1;
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
        if (k == null)
        {
            return;
        }
        if (d == 1)
        {
            a(canvas);
            return;
        } else
        {
            b(canvas);
            return;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            accessibilityevent.setClassName(android/support/v7/widget/aa.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
            accessibilitynodeinfo.setClassName(android/support/v7/widget/aa.getName());
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (d == 1)
        {
            a(i1, j1, k1, l1);
            return;
        } else
        {
            b(i1, j1, k1, l1);
            return;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        if (d == 1)
        {
            a(i1, j1);
            return;
        } else
        {
            b(i1, j1);
            return;
        }
    }

    public void setBaselineAligned(boolean flag)
    {
        a = flag;
    }

    public void setBaselineAlignedChildIndex(int i1)
    {
        if (i1 < 0 || i1 >= getChildCount())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("base aligned child index out of range (0, ").append(getChildCount()).append(")").toString());
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
