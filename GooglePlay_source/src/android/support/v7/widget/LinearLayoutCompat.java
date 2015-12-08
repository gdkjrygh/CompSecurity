// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.internal.widget.ViewUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat extends ViewGroup
{
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int gravity;
        public float weight;

        public LayoutParams(int i, int j)
        {
            super(i, j);
            gravity = -1;
            weight = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            gravity = -1;
            context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout);
            weight = context.getFloat(3, 0.0F);
            gravity = context.getInt(0, -1);
            context.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            gravity = -1;
        }
    }


    public static final int HORIZONTAL = 0;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int mMaxAscent[];
    private int mMaxDescent[];
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public LinearLayoutCompat(Context context)
    {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mBaselineAligned = true;
        mBaselineAlignedChildIndex = -1;
        mBaselineChildTop = 0;
        mGravity = 0x800033;
        context = TintTypedArray.obtainStyledAttributes$1a6c1917(context, attributeset, android.support.v7.appcompat.R.styleable.LinearLayoutCompat, i);
        i = context.getInt(1, -1);
        if (i >= 0)
        {
            setOrientation(i);
        }
        i = context.getInt(0, -1);
        if (i >= 0)
        {
            setGravity(i);
        }
        boolean flag = context.getBoolean(2, true);
        if (!flag)
        {
            setBaselineAligned(flag);
        }
        mWeightSum = ((TintTypedArray) (context)).mWrapped.getFloat(4, -1F);
        mBaselineAlignedChildIndex = context.getInt(3, -1);
        mUseLargestChild = context.getBoolean(6, false);
        setDividerDrawable(context.getDrawable(5));
        mShowDividers = context.getInt(7, 0);
        mDividerPadding = context.getDimensionPixelSize(8, 0);
        ((TintTypedArray) (context)).mWrapped.recycle();
    }

    private void drawHorizontalDivider(Canvas canvas, int i)
    {
        mDivider.setBounds(getPaddingLeft() + mDividerPadding, i, getWidth() - getPaddingRight() - mDividerPadding, mDividerHeight + i);
        mDivider.draw(canvas);
    }

    private void drawVerticalDivider(Canvas canvas, int i)
    {
        mDivider.setBounds(i, getPaddingTop() + mDividerPadding, mDividerWidth + i, getHeight() - getPaddingBottom() - mDividerPadding);
        mDivider.draw(canvas);
    }

    private void forceUniformWidth(int i, int j)
    {
        int l = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
        for (int k = 0; k < i; k++)
        {
            View view = getChildAt(k);
            if (view.getVisibility() == 8)
            {
                continue;
            }
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            if (layoutparams.width == -1)
            {
                int i1 = layoutparams.height;
                layoutparams.height = view.getMeasuredHeight();
                measureChildWithMargins(view, l, 0, j, 0);
                layoutparams.height = i1;
            }
        }

    }

    private boolean hasDividerBeforeChildAt(int i)
    {
        boolean flag = true;
        if (i != 0) goto _L2; else goto _L1
_L1:
        if ((mShowDividers & 1) == 0) goto _L4; else goto _L3
_L3:
        return flag;
_L4:
        return false;
_L2:
        if (i != getChildCount())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((mShowDividers & 4) == 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
label0:
        {
            if ((mShowDividers & 2) == 0)
            {
                break label0;
            }
            boolean flag1 = false;
            i--;
            do
            {
                flag = flag1;
                if (i < 0)
                {
                    break;
                }
                if (getChildAt(i).getVisibility() != 8)
                {
                    return true;
                }
                i--;
            } while (true);
        }
        if (true) goto _L3; else goto _L6
_L6:
        return false;
    }

    private void measureChildBeforeLayout$12802926(View view, int i, int j, int k, int l)
    {
        measureChildWithMargins(view, i, j, k, l);
    }

    private void measureHorizontal(int i, int j)
    {
        float f;
        int ai[];
        int ai1[];
        View view2;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int l2;
        int i3;
        int j3;
        boolean flag;
        int i8;
        int j8;
        int k8;
        boolean flag1;
        boolean flag2;
        mTotalLength = 0;
        l1 = 0;
        l = 0;
        j1 = 0;
        i3 = 0;
        k = 1;
        f = 0.0F;
        i8 = getChildCount();
        k8 = android.view.View.MeasureSpec.getMode(i);
        j8 = android.view.View.MeasureSpec.getMode(j);
        i1 = 0;
        l2 = 0;
        if (mMaxAscent == null || mMaxDescent == null)
        {
            mMaxAscent = new int[4];
            mMaxDescent = new int[4];
        }
        ai = mMaxAscent;
        ai1 = mMaxDescent;
        ai[3] = -1;
        ai[2] = -1;
        ai[1] = -1;
        ai[0] = -1;
        ai1[3] = -1;
        ai1[2] = -1;
        ai1[1] = -1;
        ai1[0] = -1;
        flag1 = mBaselineAligned;
        flag2 = mUseLargestChild;
        if (k8 == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = 0x80000000;
        j3 = 0;
        if (j3 >= i8)
        {
            break; /* Loop/switch isn't completed */
        }
        view2 = getChildAt(j3);
        if (view2 == null)
        {
            mTotalLength = mTotalLength + 0;
        } else
        {
            int l7 = k;
            int l6 = j1;
            int j7 = l;
            int k3 = k1;
            int j6 = i1;
            int l5 = l1;
            int k4 = l2;
            float f1 = f;
            int j5 = i3;
            if (view2.getVisibility() != 8)
            {
                if (hasDividerBeforeChildAt(j3))
                {
                    mTotalLength = mTotalLength + mDividerWidth;
                }
                LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
                f1 = f + layoutparams1.weight;
                if (k8 == 0x40000000 && layoutparams1.width == 0 && layoutparams1.weight > 0.0F)
                {
                    if (flag)
                    {
                        mTotalLength = mTotalLength + (layoutparams1.leftMargin + layoutparams1.rightMargin);
                    } else
                    {
                        k3 = mTotalLength;
                        mTotalLength = Math.max(k3, layoutparams1.leftMargin + k3 + layoutparams1.rightMargin);
                    }
                    if (flag1)
                    {
                        k3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        view2.measure(k3, k3);
                        k4 = l2;
                        k3 = k1;
                    } else
                    {
                        k4 = 1;
                        k3 = k1;
                    }
                } else
                {
                    k4 = 0x80000000;
                    k3 = k4;
                    if (layoutparams1.width == 0)
                    {
                        k3 = k4;
                        if (layoutparams1.weight > 0.0F)
                        {
                            k3 = 0;
                            layoutparams1.width = -2;
                        }
                    }
                    if (f1 == 0.0F)
                    {
                        k4 = mTotalLength;
                    } else
                    {
                        k4 = 0;
                    }
                    measureChildBeforeLayout$12802926(view2, i, k4, j, 0);
                    if (k3 != 0x80000000)
                    {
                        layoutparams1.width = k3;
                    }
                    j5 = view2.getMeasuredWidth();
                    if (flag)
                    {
                        mTotalLength = mTotalLength + (layoutparams1.leftMargin + j5 + layoutparams1.rightMargin + 0);
                    } else
                    {
                        int l3 = mTotalLength;
                        mTotalLength = Math.max(l3, l3 + j5 + layoutparams1.leftMargin + layoutparams1.rightMargin + 0);
                    }
                    k3 = k1;
                    k4 = l2;
                    if (flag2)
                    {
                        k3 = Math.max(j5, k1);
                        k4 = l2;
                    }
                }
                j5 = 0;
                k1 = i1;
                l2 = j5;
                if (j8 != 0x40000000)
                {
                    k1 = i1;
                    l2 = j5;
                    if (layoutparams1.height == -1)
                    {
                        k1 = 1;
                        l2 = 1;
                    }
                }
                i1 = layoutparams1.topMargin + layoutparams1.bottomMargin;
                j5 = view2.getMeasuredHeight() + i1;
                j7 = ViewUtils.combineMeasuredStates(l, ViewCompat.getMeasuredState(view2));
                if (flag1)
                {
                    l5 = view2.getBaseline();
                    if (l5 != -1)
                    {
                        if (layoutparams1.gravity < 0)
                        {
                            l = mGravity;
                        } else
                        {
                            l = layoutparams1.gravity;
                        }
                        l = ((l & 0x70) >> 4 & -2) >> 1;
                        ai[l] = Math.max(ai[l], l5);
                        ai1[l] = Math.max(ai1[l], j5 - l5);
                    }
                }
                l5 = Math.max(l1, j5);
                if (k != 0 && layoutparams1.height == -1)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (layoutparams1.weight > 0.0F)
                {
                    if (l2 == 0)
                    {
                        i1 = j5;
                    }
                    j5 = Math.max(i3, i1);
                    j6 = k1;
                    l6 = j1;
                    l7 = k;
                } else
                {
                    if (l2 == 0)
                    {
                        i1 = j5;
                    }
                    l6 = Math.max(j1, i1);
                    l7 = k;
                    j6 = k1;
                    j5 = i3;
                }
            }
            j3 += 0;
            k = l7;
            j1 = l6;
            l = j7;
            k1 = k3;
            i1 = j6;
            l1 = l5;
            l2 = k4;
            f = f1;
            i3 = j5;
        }
_L8:
        j3++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_155;
_L1:
        int j4;
        int i7;
label0:
        {
            if (mTotalLength > 0 && hasDividerBeforeChildAt(i8))
            {
                mTotalLength = mTotalLength + mDividerWidth;
            }
            if (ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
            {
                j3 = l1;
                if (ai[3] == -1)
                {
                    break label0;
                }
            }
            j3 = Math.max(l1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
        }
        if (flag2 && (k8 == 0x80000000 || k8 == 0))
        {
            mTotalLength = 0;
            int i2 = 0;
            while (i2 < i8) 
            {
                Object obj = getChildAt(i2);
                if (obj == null)
                {
                    mTotalLength = mTotalLength + 0;
                } else
                if (((View) (obj)).getVisibility() == 8)
                {
                    i2 += 0;
                } else
                {
                    obj = (LayoutParams)((View) (obj)).getLayoutParams();
                    if (flag)
                    {
                        mTotalLength = mTotalLength + (((LayoutParams) (obj)).leftMargin + k1 + ((LayoutParams) (obj)).rightMargin + 0);
                    } else
                    {
                        int i4 = mTotalLength;
                        mTotalLength = Math.max(i4, i4 + k1 + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin + 0);
                    }
                }
                i2++;
            }
        }
        mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
        i7 = ViewCompat.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumWidth()), i, 0);
        j4 = (0xffffff & i7) - mTotalLength;
        if (l2 == 0 && (j4 == 0 || f <= 0.0F)) goto _L4; else goto _L3
_L3:
label1:
        {
            if (mWeightSum > 0.0F)
            {
                f = mWeightSum;
            }
            ai[3] = -1;
            ai[2] = -1;
            ai[1] = -1;
            ai[0] = -1;
            ai1[3] = -1;
            ai1[2] = -1;
            ai1[1] = -1;
            ai1[0] = -1;
            int j2 = -1;
            mTotalLength = 0;
            j3 = 0;
            i3 = j4;
            k1 = j1;
            while (j3 < i8) 
            {
                View view3 = getChildAt(j3);
                j4 = k;
                int l4 = k1;
                int k5 = l;
                int i6 = i3;
                int k6 = j2;
                float f3 = f;
                if (view3 != null)
                {
                    j4 = k;
                    l4 = k1;
                    k5 = l;
                    i6 = i3;
                    k6 = j2;
                    f3 = f;
                    if (view3.getVisibility() != 8)
                    {
                        LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
                        f3 = layoutparams2.weight;
                        l2 = l;
                        j1 = i3;
                        float f2 = f;
                        if (f3 > 0.0F)
                        {
                            j1 = (int)(((float)i3 * f3) / f);
                            f2 = f - f3;
                            l2 = i3 - j1;
                            j4 = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom() + layoutparams2.topMargin + layoutparams2.bottomMargin, layoutparams2.height);
                            int k7;
                            if (layoutparams2.width != 0 || k8 != 0x40000000)
                            {
                                i3 = view3.getMeasuredWidth() + j1;
                                j1 = i3;
                                if (i3 < 0)
                                {
                                    j1 = 0;
                                }
                            } else
                            if (j1 <= 0)
                            {
                                j1 = 0;
                            }
                            view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), j4);
                            l = ViewUtils.combineMeasuredStates(l, ViewCompat.getMeasuredState(view3) & 0xff000000);
                            j1 = l2;
                            l2 = l;
                        }
                        if (flag)
                        {
                            mTotalLength = mTotalLength + (view3.getMeasuredWidth() + layoutparams2.leftMargin + layoutparams2.rightMargin + 0);
                        } else
                        {
                            l = mTotalLength;
                            mTotalLength = Math.max(l, view3.getMeasuredWidth() + l + layoutparams2.leftMargin + layoutparams2.rightMargin + 0);
                        }
                        if (j8 != 0x40000000 && layoutparams2.height == -1)
                        {
                            l = 1;
                        } else
                        {
                            l = 0;
                        }
                        j4 = layoutparams2.topMargin + layoutparams2.bottomMargin;
                        i3 = view3.getMeasuredHeight() + j4;
                        j2 = Math.max(j2, i3);
                        if (l != 0)
                        {
                            l = j4;
                        } else
                        {
                            l = i3;
                        }
                        k1 = Math.max(k1, l);
                        if (k != 0 && layoutparams2.height == -1)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        j4 = k;
                        l4 = k1;
                        k5 = l2;
                        i6 = j1;
                        k6 = j2;
                        f3 = f2;
                        if (flag1)
                        {
                            k7 = view3.getBaseline();
                            j4 = k;
                            l4 = k1;
                            k5 = l2;
                            i6 = j1;
                            k6 = j2;
                            f3 = f2;
                            if (k7 != -1)
                            {
                                if (layoutparams2.gravity < 0)
                                {
                                    l = mGravity;
                                } else
                                {
                                    l = layoutparams2.gravity;
                                }
                                l = ((l & 0x70) >> 4 & -2) >> 1;
                                ai[l] = Math.max(ai[l], k7);
                                ai1[l] = Math.max(ai1[l], i3 - k7);
                                f3 = f2;
                                k6 = j2;
                                i6 = j1;
                                k5 = l2;
                                l4 = k1;
                                j4 = k;
                            }
                        }
                    }
                }
                j3++;
                k = j4;
                k1 = l4;
                l = k5;
                i3 = i6;
                j2 = k6;
                f = f3;
            }
            mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
            if (ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
            {
                j4 = k;
                l2 = k1;
                i3 = l;
                j1 = j2;
                if (ai[3] == -1)
                {
                    break label1;
                }
            }
            j1 = Math.max(j2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
            i3 = l;
            l2 = k1;
            j4 = k;
        }
_L6:
        k = j1;
        if (j4 == 0)
        {
            k = j1;
            if (j8 != 0x40000000)
            {
                k = l2;
            }
        }
        setMeasuredDimension(0xff000000 & i3 | i7, ViewCompat.resolveSizeAndState(Math.max(getPaddingTop() + getPaddingBottom() + k, getSuggestedMinimumHeight()), j, i3 << 16));
        if (i1 != 0)
        {
            k = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
            for (j = 0; j < i8; j++)
            {
                View view = getChildAt(j);
                if (view.getVisibility() != 8)
                {
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    if (layoutparams.height == -1)
                    {
                        l = layoutparams.width;
                        layoutparams.width = view.getMeasuredWidth();
                        measureChildWithMargins(view, i, 0, k, 0);
                        layoutparams.width = l;
                    }
                }
            }

        }
        break MISSING_BLOCK_LABEL_2420;
_L4:
        int i5 = Math.max(j1, i3);
        j4 = k;
        l2 = i5;
        i3 = l;
        j1 = j3;
        if (flag2)
        {
            j4 = k;
            l2 = i5;
            i3 = l;
            j1 = j3;
            if (k8 != 0x40000000)
            {
                int k2 = 0;
                do
                {
                    j4 = k;
                    l2 = i5;
                    i3 = l;
                    j1 = j3;
                    if (k2 >= i8)
                    {
                        break;
                    }
                    View view1 = getChildAt(k2);
                    if (view1 != null && view1.getVisibility() != 8 && ((LayoutParams)view1.getLayoutParams()).weight > 0.0F)
                    {
                        view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000));
                    }
                    k2++;
                } while (true);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void setChildFrame(View view, int i, int j, int k, int l)
    {
        view.layout(i, j, i + k, j + l);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        if (mOrientation == 0)
        {
            return new LayoutParams(-2, -2);
        }
        if (mOrientation == 1)
        {
            return new LayoutParams(-1, -2);
        } else
        {
            return null;
        }
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new LayoutParams(layoutparams);
    }

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public int getBaseline()
    {
        int i = -1;
        if (mBaselineAlignedChildIndex >= 0) goto _L2; else goto _L1
_L1:
        i = super.getBaseline();
_L4:
        return i;
_L2:
        View view;
        int k;
        if (getChildCount() <= mBaselineAlignedChildIndex)
        {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        view = getChildAt(mBaselineAlignedChildIndex);
        k = view.getBaseline();
        if (k != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mBaselineAlignedChildIndex != 0)
        {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        if (true) goto _L4; else goto _L3
_L3:
        int j;
        j = mBaselineChildTop;
        i = j;
        if (mOrientation != 1) goto _L6; else goto _L5
_L5:
        int l;
        l = mGravity & 0x70;
        i = j;
        if (l == 48) goto _L6; else goto _L7
_L7:
        l;
        JVM INSTR lookupswitch 2: default 140
    //                   16: 181
    //                   80: 158;
           goto _L8 _L9 _L10
_L8:
        i = j;
_L6:
        return ((LayoutParams)view.getLayoutParams()).topMargin + i + k;
_L10:
        i = getBottom() - getTop() - getPaddingBottom() - mTotalLength;
        continue; /* Loop/switch isn't completed */
_L9:
        i = j + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - mTotalLength) / 2;
        if (true) goto _L6; else goto _L11
_L11:
    }

    public int getBaselineAlignedChildIndex()
    {
        return mBaselineAlignedChildIndex;
    }

    public Drawable getDividerDrawable()
    {
        return mDivider;
    }

    public int getDividerPadding()
    {
        return mDividerPadding;
    }

    public int getDividerWidth()
    {
        return mDividerWidth;
    }

    public int getOrientation()
    {
        return mOrientation;
    }

    public int getShowDividers()
    {
        return mShowDividers;
    }

    public float getWeightSum()
    {
        return mWeightSum;
    }

    public boolean isBaselineAligned()
    {
        return mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled()
    {
        return mUseLargestChild;
    }

    protected void onDraw(Canvas canvas)
    {
        if (mDivider != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (mOrientation != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = getChildCount();
        for (int i = 0; i < i1; i++)
        {
            View view = getChildAt(i);
            if (view != null && view.getVisibility() != 8 && hasDividerBeforeChildAt(i))
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                drawHorizontalDivider(canvas, view.getTop() - layoutparams.topMargin - mDividerHeight);
            }
        }

        if (hasDividerBeforeChildAt(i1))
        {
            View view1 = getChildAt(i1 - 1);
            int j;
            if (view1 == null)
            {
                j = getHeight() - getPaddingBottom() - mDividerHeight;
            } else
            {
                LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                j = view1.getBottom();
                j = layoutparams1.bottomMargin + j;
            }
            drawHorizontalDivider(canvas, j);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k1 = getChildCount();
        boolean flag = ViewUtils.isLayoutRtl(this);
        int k = 0;
        while (k < k1) 
        {
            View view2 = getChildAt(k);
            if (view2 != null && view2.getVisibility() != 8 && hasDividerBeforeChildAt(k))
            {
                LayoutParams layoutparams2 = (LayoutParams)view2.getLayoutParams();
                int j1;
                if (flag)
                {
                    j1 = view2.getRight();
                    j1 = layoutparams2.rightMargin + j1;
                } else
                {
                    j1 = view2.getLeft() - layoutparams2.leftMargin - mDividerWidth;
                }
                drawVerticalDivider(canvas, j1);
            }
            k++;
        }
        if (hasDividerBeforeChildAt(k1))
        {
            View view3 = getChildAt(k1 - 1);
            int l;
            if (view3 == null)
            {
                if (flag)
                {
                    l = getPaddingLeft();
                } else
                {
                    l = getWidth() - getPaddingRight() - mDividerWidth;
                }
            } else
            {
                LayoutParams layoutparams3 = (LayoutParams)view3.getLayoutParams();
                if (flag)
                {
                    l = view3.getLeft() - layoutparams3.leftMargin - mDividerWidth;
                } else
                {
                    l = view3.getRight();
                    l = layoutparams3.rightMargin + l;
                }
            }
            drawVerticalDivider(canvas, l);
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

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (mOrientation != 1) goto _L2; else goto _L1
_L1:
        int i1;
        int k1;
        int i2;
        int j2;
        int l2;
        int i3;
        i1 = getPaddingLeft();
        k1 = k - i;
        i2 = getPaddingRight();
        j2 = getPaddingRight();
        l2 = getChildCount();
        i = mGravity;
        i3 = mGravity;
        i & 0x70;
        JVM INSTR lookupswitch 2: default 80
    //                   16: 140
    //                   80: 122;
           goto _L3 _L4 _L5
_L3:
        i = getPaddingTop();
_L10:
        k = 0;
        j = i;
        i = k;
_L9:
        View view;
        if (i >= l2)
        {
            break; /* Loop/switch isn't completed */
        }
        view = getChildAt(i);
        if (view != null) goto _L7; else goto _L6
_L6:
        j += 0;
_L12:
        i++;
        if (true) goto _L9; else goto _L8
_L5:
        i = (getPaddingTop() + l) - j - mTotalLength;
          goto _L10
_L4:
        i = getPaddingTop() + (l - j - mTotalLength) / 2;
          goto _L10
_L7:
        if (view.getVisibility() == 8) goto _L12; else goto _L11
_L11:
        LayoutParams layoutparams;
        int j3;
        int k3;
        j3 = view.getMeasuredWidth();
        k3 = view.getMeasuredHeight();
        layoutparams = (LayoutParams)view.getLayoutParams();
        l = layoutparams.gravity;
        k = l;
        if (l < 0)
        {
            k = 0x800007 & i3;
        }
        GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(this)) & 7;
        JVM INSTR lookupswitch 2: default 256
    //                   1: 328
    //                   5: 361;
           goto _L13 _L14 _L15
_L15:
        break MISSING_BLOCK_LABEL_361;
_L13:
        k = layoutparams.leftMargin + i1;
_L16:
        l = j;
        if (hasDividerBeforeChildAt(i))
        {
            l = j + mDividerHeight;
        }
        j = l + layoutparams.topMargin;
        setChildFrame(view, k, j + 0, j3, k3);
        j += layoutparams.bottomMargin + k3 + 0;
        i += 0;
          goto _L12
_L14:
        k = ((k1 - i1 - j2 - j3) / 2 + i1 + layoutparams.leftMargin) - layoutparams.rightMargin;
          goto _L16
        k = k1 - i2 - j3 - layoutparams.rightMargin;
          goto _L16
_L2:
        int ai[];
        int ai1[];
        int l3;
        boolean flag1;
        flag = ViewUtils.isLayoutRtl(this);
        i2 = getPaddingTop();
        l2 = l - j;
        i3 = getPaddingBottom();
        j3 = getPaddingBottom();
        k3 = getChildCount();
        j = mGravity;
        l3 = mGravity;
        flag1 = mBaselineAligned;
        ai = mMaxAscent;
        ai1 = mMaxDescent;
        GravityCompat.getAbsoluteGravity(j & 0x800007, ViewCompat.getLayoutDirection(this));
        JVM INSTR lookupswitch 2: default 484
    //                   1: 568
    //                   5: 550;
           goto _L17 _L18 _L19
_L17:
        i = getPaddingLeft();
_L24:
        View view1;
        LayoutParams layoutparams1;
        int j1;
        int l1;
        int k2;
        int i4;
        int j4;
        int k4;
        if (flag)
        {
            j1 = k3 - 1;
            l = -1;
        } else
        {
            j1 = 0;
            l = 1;
        }
        j = 0;
        k = i;
_L23:
        if (j >= k3) goto _L8; else goto _L20
_L20:
        k4 = j1 + l * j;
        view1 = getChildAt(k4);
        if (view1 != null) goto _L22; else goto _L21
_L21:
        k += 0;
        i = j;
_L29:
        j = i + 1;
          goto _L23
_L19:
        i = (getPaddingLeft() + k) - i - mTotalLength;
          goto _L24
_L18:
        i = getPaddingLeft() + (k - i - mTotalLength) / 2;
          goto _L24
_L22:
        if (view1.getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_898;
        }
        i4 = view1.getMeasuredWidth();
        j4 = view1.getMeasuredHeight();
        i = -1;
        layoutparams1 = (LayoutParams)view1.getLayoutParams();
        l1 = i;
        if (flag1)
        {
            l1 = i;
            if (layoutparams1.height != -1)
            {
                l1 = view1.getBaseline();
            }
        }
        k2 = layoutparams1.gravity;
        i = k2;
        if (k2 < 0)
        {
            i = l3 & 0x70;
        }
        i & 0x70;
        JVM INSTR lookupswitch 3: default 712
    //                   16: 812
    //                   48: 779
    //                   80: 844;
           goto _L25 _L26 _L27 _L28
_L28:
        break MISSING_BLOCK_LABEL_844;
_L25:
        i = i2;
_L30:
        if (hasDividerBeforeChildAt(k4))
        {
            k = mDividerWidth + k;
        }
        k += layoutparams1.leftMargin;
        setChildFrame(view1, k + 0, i, i4, j4);
        k += layoutparams1.rightMargin + i4 + 0;
        i = j + 0;
          goto _L29
_L27:
        k2 = layoutparams1.topMargin + i2;
        i = k2;
        if (l1 != -1)
        {
            i = (ai[1] - l1) + k2;
        }
          goto _L30
_L26:
        i = ((l2 - i2 - j3 - j4) / 2 + i2 + layoutparams1.topMargin) - layoutparams1.bottomMargin;
          goto _L30
        k2 = l2 - i3 - j4 - layoutparams1.bottomMargin;
        i = k2;
        if (l1 != -1)
        {
            i = view1.getMeasuredHeight();
            i = k2 - (ai1[2] - (i - l1));
        }
          goto _L30
_L8:
        return;
        i = j;
          goto _L29
    }

    public void onMeasure(int i, int j)
    {
        if (mOrientation != 1) goto _L2; else goto _L1
_L1:
        float f;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag;
        int i2;
        int j2;
        int k6;
        int l6;
        int i7;
        int j7;
        boolean flag1;
        mTotalLength = 0;
        i1 = 0;
        k = 0;
        l = 0;
        i2 = 0;
        j1 = 1;
        f = 0.0F;
        k6 = getChildCount();
        l6 = android.view.View.MeasureSpec.getMode(i);
        i7 = android.view.View.MeasureSpec.getMode(j);
        flag = false;
        l1 = 0;
        j7 = mBaselineAlignedChildIndex;
        flag1 = mUseLargestChild;
        k1 = 0x80000000;
        j2 = 0;
_L7:
        if (j2 >= k6) goto _L4; else goto _L3
_L3:
        View view = getChildAt(j2);
        if (view != null) goto _L6; else goto _L5
_L5:
        int j3;
        int k4;
        int k5;
        int j6;
        mTotalLength = mTotalLength + 0;
        j6 = j2;
        k5 = i1;
        k4 = k;
        j3 = l;
        j2 = i2;
        i1 = j1;
        l = l1;
        k = k1;
_L12:
        j6++;
        k1 = k;
        l1 = l;
        j1 = i1;
        i2 = j2;
        l = j3;
        k = k4;
        i1 = k5;
        j2 = j6;
          goto _L7
_L6:
        LayoutParams layoutparams;
        if (view.getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_1656;
        }
        if (hasDividerBeforeChildAt(j2))
        {
            mTotalLength = mTotalLength + mDividerHeight;
        }
        layoutparams = (LayoutParams)view.getLayoutParams();
        f += layoutparams.weight;
        if (i7 != 0x40000000 || layoutparams.height != 0 || layoutparams.weight <= 0.0F) goto _L9; else goto _L8
_L8:
        l1 = mTotalLength;
        mTotalLength = Math.max(l1, layoutparams.topMargin + l1 + layoutparams.bottomMargin);
        l1 = 1;
_L11:
        if (j7 >= 0 && j7 == j2 + 1)
        {
            mBaselineChildTop = mTotalLength;
        }
        if (j2 < j7 && layoutparams.weight > 0.0F)
        {
            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        }
        break; /* Loop/switch isn't completed */
_L9:
        k4 = 0x80000000;
        j3 = k4;
        if (layoutparams.height == 0)
        {
            j3 = k4;
            if (layoutparams.weight > 0.0F)
            {
                j3 = 0;
                layoutparams.height = -2;
            }
        }
        if (f == 0.0F)
        {
            k4 = mTotalLength;
        } else
        {
            k4 = 0;
        }
        measureChildBeforeLayout$12802926(view, i, 0, j, k4);
        if (j3 != 0x80000000)
        {
            layoutparams.height = j3;
        }
        j3 = view.getMeasuredHeight();
        k4 = mTotalLength;
        mTotalLength = Math.max(k4, k4 + j3 + layoutparams.topMargin + layoutparams.bottomMargin + 0);
        if (flag1)
        {
            k1 = Math.max(j3, k1);
        }
        if (true) goto _L11; else goto _L10
_L10:
        j3 = 0;
        if (l6 != 0x40000000 && layoutparams.width == -1)
        {
            flag = true;
            j3 = 1;
        }
        k4 = layoutparams.leftMargin + layoutparams.rightMargin;
        k5 = view.getMeasuredWidth() + k4;
        i1 = Math.max(i1, k5);
        j6 = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(view));
        if (j1 != 0 && layoutparams.width == -1)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (layoutparams.weight > 0.0F)
        {
            if (j3 == 0)
            {
                k4 = k5;
            }
            i2 = Math.max(i2, k4);
            j1 = l;
            l = l1;
            l1 = i1;
            i1 = i2;
            j3 = k1;
            i2 = j6;
            k1 = j1;
            j1 = i1;
            i1 = k;
            k = l;
            l = j3;
        } else
        {
            if (j3 == 0)
            {
                k4 = k5;
            }
            j3 = Math.max(l, k4);
            j1 = k;
            k = l1;
            l = k1;
            l1 = i1;
            i1 = j1;
            j1 = i2;
            k1 = j3;
            i2 = j6;
        }
_L13:
        j6 = j2 + 0;
        j2 = k;
        k = l;
        l = j2;
        j2 = j1;
        j3 = k1;
        k4 = i2;
        k5 = l1;
          goto _L12
_L2:
        measureHorizontal(i, j);
        return;
_L4:
label0:
        {
            {
                if (mTotalLength > 0 && hasDividerBeforeChildAt(k6))
                {
                    mTotalLength = mTotalLength + mDividerHeight;
                }
                if (flag1 && (i7 == 0x80000000 || i7 == 0))
                {
                    mTotalLength = 0;
                    int k2 = 0;
                    while (k2 < k6) 
                    {
                        Object obj = getChildAt(k2);
                        if (obj == null)
                        {
                            mTotalLength = mTotalLength + 0;
                        } else
                        if (((View) (obj)).getVisibility() == 8)
                        {
                            k2 += 0;
                        } else
                        {
                            obj = (LayoutParams)((View) (obj)).getLayoutParams();
                            int k3 = mTotalLength;
                            int l4 = ((LayoutParams) (obj)).topMargin;
                            mTotalLength = Math.max(k3, ((LayoutParams) (obj)).bottomMargin + (k3 + k1 + l4) + 0);
                        }
                        k2++;
                    }
                }
                mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
                int i5 = ViewCompat.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumHeight()), j, 0);
                int l2 = (0xffffff & i5) - mTotalLength;
                if (l1 == 0 && (l2 == 0 || f <= 0.0F))
                {
                    break label0;
                }
                if (mWeightSum > 0.0F)
                {
                    f = mWeightSum;
                }
                mTotalLength = 0;
                i2 = 0;
                k1 = j1;
                j1 = i1;
                i1 = l;
                l = k1;
                k1 = l2;
                while (i2 < k6) 
                {
                    View view1 = getChildAt(i2);
                    if (view1.getVisibility() != 8)
                    {
                        LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                        float f1 = layoutparams1.weight;
                        int i4;
                        if (f1 > 0.0F)
                        {
                            int i3 = (int)(((float)k1 * f1) / f);
                            int l5 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutparams1.leftMargin + layoutparams1.rightMargin, layoutparams1.width);
                            if (layoutparams1.height != 0 || i7 != 0x40000000)
                            {
                                int l3 = i3 + view1.getMeasuredHeight();
                                l1 = l3;
                                if (l3 < 0)
                                {
                                    l1 = 0;
                                }
                            } else
                            if (i3 > 0)
                            {
                                l1 = i3;
                            } else
                            {
                                l1 = 0;
                            }
                            view1.measure(l5, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
                            k = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(view1) & 0xffffff00);
                            l1 = k1 - i3;
                            k1 = k;
                            f -= f1;
                            k = l1;
                        } else
                        {
                            l1 = k;
                            k = k1;
                            k1 = l1;
                        }
                        i3 = layoutparams1.leftMargin + layoutparams1.rightMargin;
                        i4 = view1.getMeasuredWidth() + i3;
                        l1 = Math.max(j1, i4);
                        if (l6 != 0x40000000 && layoutparams1.width == -1)
                        {
                            j1 = 1;
                        } else
                        {
                            j1 = 0;
                        }
                        if (j1 != 0)
                        {
                            j1 = i3;
                        } else
                        {
                            j1 = i4;
                        }
                        i1 = Math.max(i1, j1);
                        if (l != 0 && layoutparams1.width == -1)
                        {
                            l = 1;
                        } else
                        {
                            l = 0;
                        }
                        j1 = mTotalLength;
                        i3 = view1.getMeasuredHeight();
                        i4 = layoutparams1.topMargin;
                        mTotalLength = Math.max(j1, layoutparams1.bottomMargin + (i3 + j1 + i4) + 0);
                        j1 = l;
                        l = l1;
                    } else
                    {
                        l1 = l;
                        l = j1;
                        j1 = k;
                        k = k1;
                        k1 = j1;
                        j1 = l1;
                    }
                    i3 = i2 + 1;
                    i2 = k1;
                    l1 = l;
                    k1 = k;
                    k = i2;
                    l = j1;
                    j1 = l1;
                    i2 = i3;
                }
                mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
                k1 = i1;
                i1 = j1;
                j1 = l;
                l = k1;
            }
            if (j1 != 0 || l6 == 0x40000000)
            {
                l = i1;
            }
            setMeasuredDimension(ViewCompat.resolveSizeAndState(Math.max(l + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, k), i5);
            if (flag)
            {
                forceUniformWidth(k6, j);
            }
            return;
        }
        l1 = Math.max(l, i2);
        if (flag1 && i7 != 0x40000000)
        {
            for (l = 0; l < k6; l++)
            {
                view1 = getChildAt(l);
                if (view1 != null && view1.getVisibility() != 8 && ((LayoutParams)view1.getLayoutParams()).weight > 0.0F)
                {
                    view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000));
                }
            }

        }
        l = l1;
        if (true)
        {
            break MISSING_BLOCK_LABEL_1430;
        }
        int j4 = k1;
        int j5 = l1;
        k1 = l;
        l1 = i1;
        int i6 = k;
        l = j4;
        k = j5;
        i1 = j1;
        j1 = i2;
        i2 = i6;
          goto _L13
    }

    public void setBaselineAligned(boolean flag)
    {
        mBaselineAligned = flag;
    }

    public void setBaselineAlignedChildIndex(int i)
    {
        if (i < 0 || i >= getChildCount())
        {
            throw new IllegalArgumentException((new StringBuilder("base aligned child index out of range (0, ")).append(getChildCount()).append(")").toString());
        } else
        {
            mBaselineAlignedChildIndex = i;
            return;
        }
    }

    public void setDividerDrawable(Drawable drawable)
    {
        boolean flag = false;
        if (drawable == mDivider)
        {
            return;
        }
        mDivider = drawable;
        if (drawable != null)
        {
            mDividerWidth = drawable.getIntrinsicWidth();
            mDividerHeight = drawable.getIntrinsicHeight();
        } else
        {
            mDividerWidth = 0;
            mDividerHeight = 0;
        }
        if (drawable == null)
        {
            flag = true;
        }
        setWillNotDraw(flag);
        requestLayout();
    }

    public void setDividerPadding(int i)
    {
        mDividerPadding = i;
    }

    public void setGravity(int i)
    {
        if (mGravity != i)
        {
            int j = i;
            if ((0x800007 & i) == 0)
            {
                j = i | 0x800003;
            }
            i = j;
            if ((j & 0x70) == 0)
            {
                i = j | 0x30;
            }
            mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i)
    {
        i &= 0x800007;
        if ((mGravity & 0x800007) != i)
        {
            mGravity = mGravity & 0xff7ffff8 | i;
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean flag)
    {
        mUseLargestChild = flag;
    }

    public void setOrientation(int i)
    {
        if (mOrientation != i)
        {
            mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i)
    {
        if (i != mShowDividers)
        {
            requestLayout();
        }
        mShowDividers = i;
    }

    public void setVerticalGravity(int i)
    {
        i &= 0x70;
        if ((mGravity & 0x70) != i)
        {
            mGravity = mGravity & 0xffffff8f | i;
            requestLayout();
        }
    }

    public void setWeightSum(float f)
    {
        mWeightSum = Math.max(0.0F, f);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }
}
