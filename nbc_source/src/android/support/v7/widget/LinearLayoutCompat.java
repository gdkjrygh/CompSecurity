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
            weight = context.getFloat(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
            gravity = context.getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            context.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            gravity = -1;
        }
    }


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
        context = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.LinearLayoutCompat, i, 0);
        i = context.getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i >= 0)
        {
            setOrientation(i);
        }
        i = context.getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i >= 0)
        {
            setGravity(i);
        }
        boolean flag = context.getBoolean(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!flag)
        {
            setBaselineAligned(flag);
        }
        mWeightSum = context.getFloat(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_weightSum, -1F);
        mBaselineAlignedChildIndex = context.getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        mUseLargestChild = context.getBoolean(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(context.getDrawable(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_divider));
        mShowDividers = context.getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_showDividers, 0);
        mDividerPadding = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_dividerPadding, 0);
        context.recycle();
    }

    private void forceUniformHeight(int i, int j)
    {
        int l = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
        for (int k = 0; k < i; k++)
        {
            View view = getVirtualChildAt(k);
            if (view.getVisibility() == 8)
            {
                continue;
            }
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            if (layoutparams.height == -1)
            {
                int i1 = layoutparams.width;
                layoutparams.width = view.getMeasuredWidth();
                measureChildWithMargins(view, j, 0, l, 0);
                layoutparams.width = i1;
            }
        }

    }

    private void forceUniformWidth(int i, int j)
    {
        int l = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
        for (int k = 0; k < i; k++)
        {
            View view = getVirtualChildAt(k);
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

    private void setChildFrame(View view, int i, int j, int k, int l)
    {
        view.layout(i, j, i + k, j + l);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    void drawDividersHorizontal(Canvas canvas)
    {
        int l = getVirtualChildCount();
        boolean flag = ViewUtils.isLayoutRtl(this);
        int i = 0;
        while (i < l) 
        {
            View view = getVirtualChildAt(i);
            if (view != null && view.getVisibility() != 8 && hasDividerBeforeChildAt(i))
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int k;
                if (flag)
                {
                    k = view.getRight() + layoutparams.rightMargin;
                } else
                {
                    k = view.getLeft() - layoutparams.leftMargin - mDividerWidth;
                }
                drawVerticalDivider(canvas, k);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(l))
        {
            View view1 = getVirtualChildAt(l - 1);
            int j;
            if (view1 == null)
            {
                if (flag)
                {
                    j = getPaddingLeft();
                } else
                {
                    j = getWidth() - getPaddingRight() - mDividerWidth;
                }
            } else
            {
                LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                if (flag)
                {
                    j = view1.getLeft() - layoutparams1.leftMargin - mDividerWidth;
                } else
                {
                    j = view1.getRight() + layoutparams1.rightMargin;
                }
            }
            drawVerticalDivider(canvas, j);
        }
    }

    void drawDividersVertical(Canvas canvas)
    {
        int k = getVirtualChildCount();
        for (int i = 0; i < k; i++)
        {
            View view = getVirtualChildAt(i);
            if (view != null && view.getVisibility() != 8 && hasDividerBeforeChildAt(i))
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                drawHorizontalDivider(canvas, view.getTop() - layoutparams.topMargin - mDividerHeight);
            }
        }

        if (hasDividerBeforeChildAt(k))
        {
            View view1 = getVirtualChildAt(k - 1);
            int j;
            if (view1 == null)
            {
                j = getHeight() - getPaddingBottom() - mDividerHeight;
            } else
            {
                LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                j = view1.getBottom() + layoutparams1.bottomMargin;
            }
            drawHorizontalDivider(canvas, j);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i)
    {
        mDivider.setBounds(getPaddingLeft() + mDividerPadding, i, getWidth() - getPaddingRight() - mDividerPadding, mDividerHeight + i);
        mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i)
    {
        mDivider.setBounds(i, getPaddingTop() + mDividerPadding, mDividerWidth + i, getHeight() - getPaddingBottom() - mDividerPadding);
        mDivider.draw(canvas);
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

    int getChildrenSkipCount(View view, int i)
    {
        return 0;
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

    int getLocationOffset(View view)
    {
        return 0;
    }

    int getNextLocationOffset(View view)
    {
        return 0;
    }

    public int getOrientation()
    {
        return mOrientation;
    }

    public int getShowDividers()
    {
        return mShowDividers;
    }

    View getVirtualChildAt(int i)
    {
        return getChildAt(i);
    }

    int getVirtualChildCount()
    {
        return getChildCount();
    }

    public float getWeightSum()
    {
        return mWeightSum;
    }

    protected boolean hasDividerBeforeChildAt(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        if ((mShowDividers & 1) == 0) goto _L4; else goto _L3
_L3:
        return true;
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
        if ((mShowDividers & 2) != 0)
        {
            boolean flag1 = false;
            i--;
            do
            {
label0:
                {
                    boolean flag = flag1;
                    if (i >= 0)
                    {
                        if (getChildAt(i).getVisibility() == 8)
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    return flag;
                }
                i--;
            } while (true);
        } else
        {
            return false;
        }
    }

    void layoutHorizontal(int i, int j, int k, int l)
    {
        int ai[];
        int ai1[];
        int k1;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        boolean flag;
        boolean flag1;
        flag = ViewUtils.isLayoutRtl(this);
        k1 = getPaddingTop();
        k2 = l - j;
        l2 = getPaddingBottom();
        i3 = getPaddingBottom();
        j3 = getVirtualChildCount();
        j = mGravity;
        k3 = mGravity;
        flag1 = mBaselineAligned;
        ai = mMaxAscent;
        ai1 = mMaxDescent;
        GravityCompat.getAbsoluteGravity(j & 0x800007, ViewCompat.getLayoutDirection(this));
        JVM INSTR lookupswitch 2: default 104
    //                   1: 200
    //                   5: 183;
           goto _L1 _L2 _L3
_L1:
        i = getPaddingLeft();
_L17:
        int i1;
        i1 = 0;
        l = 1;
        if (flag)
        {
            i1 = j3 - 1;
            l = -1;
        }
        j = 0;
        k = i;
_L8:
        if (j >= j3) goto _L5; else goto _L4
_L4:
        View view;
        int l3;
        l3 = i1 + l * j;
        view = getVirtualChildAt(l3);
        if (view != null) goto _L7; else goto _L6
_L6:
        int j1;
        i = k + measureNullChild(l3);
        j1 = j;
_L10:
        j = j1 + 1;
        k = i;
          goto _L8
_L3:
        i = (getPaddingLeft() + k) - i - mTotalLength;
        continue; /* Loop/switch isn't completed */
_L2:
        i = getPaddingLeft() + (k - i - mTotalLength) / 2;
        continue; /* Loop/switch isn't completed */
_L7:
        i = k;
        j1 = j;
        if (view.getVisibility() == 8) goto _L10; else goto _L9
_L9:
        LayoutParams layoutparams;
        int i4;
        int j4;
        i4 = view.getMeasuredWidth();
        j4 = view.getMeasuredHeight();
        i = -1;
        layoutparams = (LayoutParams)view.getLayoutParams();
        j1 = i;
        if (flag1)
        {
            j1 = i;
            if (layoutparams.height != -1)
            {
                j1 = view.getBaseline();
            }
        }
        int l1 = layoutparams.gravity;
        i = l1;
        if (l1 < 0)
        {
            i = k3 & 0x70;
        }
        i & 0x70;
        JVM INSTR lookupswitch 3: default 348
    //                   16: 465
    //                   48: 432
    //                   80: 497;
           goto _L11 _L12 _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_497;
_L11:
        i = k1;
_L15:
        j1 = k;
        if (hasDividerBeforeChildAt(l3))
        {
            j1 = k + mDividerWidth;
        }
        k = j1 + layoutparams.leftMargin;
        setChildFrame(view, k + getLocationOffset(view), i, i4, j4);
        i = k + (layoutparams.rightMargin + i4 + getNextLocationOffset(view));
        j1 = j + getChildrenSkipCount(view, l3);
          goto _L10
_L13:
        int i2 = k1 + layoutparams.topMargin;
        i = i2;
        if (j1 != -1)
        {
            i = i2 + (ai[1] - j1);
        }
          goto _L15
_L12:
        i = ((k2 - k1 - i3 - j4) / 2 + k1 + layoutparams.topMargin) - layoutparams.bottomMargin;
          goto _L15
        int j2 = k2 - l2 - j4 - layoutparams.bottomMargin;
        i = j2;
        if (j1 != -1)
        {
            i = view.getMeasuredHeight();
            i = j2 - (ai1[2] - (i - j1));
        }
          goto _L15
_L5:
        return;
        if (true) goto _L17; else goto _L16
_L16:
    }

    void layoutVertical(int i, int j, int k, int l)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        i1 = getPaddingLeft();
        j1 = k - i;
        k1 = getPaddingRight();
        l1 = getPaddingRight();
        i2 = getVirtualChildCount();
        i = mGravity;
        j2 = mGravity;
        i & 0x70;
        JVM INSTR lookupswitch 2: default 72
    //                   16: 136
    //                   80: 118;
           goto _L1 _L2 _L3
_L1:
        i = getPaddingTop();
_L16:
        j = 0;
_L8:
        if (j >= i2) goto _L5; else goto _L4
_L4:
        View view = getVirtualChildAt(j);
        if (view != null) goto _L7; else goto _L6
_L6:
        k = i + measureNullChild(j);
        l = j;
_L10:
        j = l + 1;
        i = k;
          goto _L8
_L3:
        i = (getPaddingTop() + l) - j - mTotalLength;
        continue; /* Loop/switch isn't completed */
_L2:
        i = getPaddingTop() + (l - j - mTotalLength) / 2;
        continue; /* Loop/switch isn't completed */
_L7:
        k = i;
        l = j;
        if (view.getVisibility() == 8) goto _L10; else goto _L9
_L9:
        LayoutParams layoutparams;
        int k2;
        int l2;
        k2 = view.getMeasuredWidth();
        l2 = view.getMeasuredHeight();
        layoutparams = (LayoutParams)view.getLayoutParams();
        l = layoutparams.gravity;
        k = l;
        if (l < 0)
        {
            k = j2 & 0x800007;
        }
        GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(this)) & 7;
        JVM INSTR lookupswitch 2: default 256
    //                   1: 344
    //                   5: 376;
           goto _L11 _L12 _L13
_L13:
        break MISSING_BLOCK_LABEL_376;
_L11:
        k = i1 + layoutparams.leftMargin;
_L14:
        l = i;
        if (hasDividerBeforeChildAt(j))
        {
            l = i + mDividerHeight;
        }
        i = l + layoutparams.topMargin;
        setChildFrame(view, k, i + getLocationOffset(view), k2, l2);
        k = i + (layoutparams.bottomMargin + l2 + getNextLocationOffset(view));
        l = j + getChildrenSkipCount(view, j);
          goto _L10
_L12:
        k = ((j1 - i1 - l1 - k2) / 2 + i1 + layoutparams.leftMargin) - layoutparams.rightMargin;
          goto _L14
        k = j1 - k1 - k2 - layoutparams.rightMargin;
          goto _L14
_L5:
        return;
        if (true) goto _L16; else goto _L15
_L15:
    }

    void measureChildBeforeLayout(View view, int i, int j, int k, int l, int i1)
    {
        measureChildWithMargins(view, j, k, l, i1);
    }

    void measureHorizontal(int i, int j)
    {
        float f;
        int ai[];
        int ai1[];
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int l2;
        boolean flag;
        boolean flag1;
        int l6;
        int i7;
        int j7;
        int k7;
        boolean flag2;
        boolean flag3;
label0:
        {
            mTotalLength = 0;
            int j2 = 0;
            i1 = 0;
            k = 0;
            k1 = 0;
            l = 1;
            f = 0.0F;
            l6 = getVirtualChildCount();
            j7 = android.view.View.MeasureSpec.getMode(i);
            i7 = android.view.View.MeasureSpec.getMode(j);
            j1 = 0;
            flag = false;
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
            flag2 = mBaselineAligned;
            flag3 = mUseLargestChild;
            if (j7 == 0x40000000)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            i2 = 0x80000000;
            l1 = 0;
            while (l1 < l6) 
            {
                View view1 = getVirtualChildAt(l1);
                int k4;
                if (view1 == null)
                {
                    mTotalLength = mTotalLength + measureNullChild(l1);
                    k4 = i2;
                } else
                if (view1.getVisibility() == 8)
                {
                    l1 += getChildrenSkipCount(view1, l1);
                    k4 = i2;
                } else
                {
                    if (hasDividerBeforeChildAt(l1))
                    {
                        mTotalLength = mTotalLength + mDividerWidth;
                    }
                    LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
                    f += layoutparams.weight;
                    int j3;
                    int j5;
                    if (j7 == 0x40000000 && layoutparams.width == 0 && layoutparams.weight > 0.0F)
                    {
                        int l5;
                        int j6;
                        if (flag1)
                        {
                            mTotalLength = mTotalLength + (layoutparams.leftMargin + layoutparams.rightMargin);
                        } else
                        {
                            j3 = mTotalLength;
                            mTotalLength = Math.max(j3, layoutparams.leftMargin + j3 + layoutparams.rightMargin);
                        }
                        if (flag2)
                        {
                            j3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                            view1.measure(j3, j3);
                            j3 = ((flag) ? 1 : 0);
                            k4 = i2;
                        } else
                        {
                            j3 = 1;
                            k4 = i2;
                        }
                    } else
                    {
                        k4 = 0x80000000;
                        j3 = k4;
                        if (layoutparams.width == 0)
                        {
                            j3 = k4;
                            if (layoutparams.weight > 0.0F)
                            {
                                j3 = 0;
                                layoutparams.width = -2;
                            }
                        }
                        if (f == 0.0F)
                        {
                            k4 = mTotalLength;
                        } else
                        {
                            k4 = 0;
                        }
                        measureChildBeforeLayout(view1, l1, i, k4, j, 0);
                        if (j3 != 0x80000000)
                        {
                            layoutparams.width = j3;
                        }
                        j5 = view1.getMeasuredWidth();
                        if (flag1)
                        {
                            mTotalLength = mTotalLength + (layoutparams.leftMargin + j5 + layoutparams.rightMargin + getNextLocationOffset(view1));
                        } else
                        {
                            int k3 = mTotalLength;
                            mTotalLength = Math.max(k3, k3 + j5 + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view1));
                        }
                        k4 = i2;
                        j3 = ((flag) ? 1 : 0);
                        if (flag3)
                        {
                            k4 = Math.max(j5, i2);
                            j3 = ((flag) ? 1 : 0);
                        }
                    }
                    j5 = 0;
                    i2 = j1;
                    flag = j5;
                    if (i7 != 0x40000000)
                    {
                        i2 = j1;
                        flag = j5;
                        if (layoutparams.height == -1)
                        {
                            i2 = 1;
                            flag = true;
                        }
                    }
                    j1 = layoutparams.topMargin + layoutparams.bottomMargin;
                    j5 = view1.getMeasuredHeight() + j1;
                    l5 = ViewUtils.combineMeasuredStates(i1, ViewCompat.getMeasuredState(view1));
                    if (flag2)
                    {
                        j6 = view1.getBaseline();
                        if (j6 != -1)
                        {
                            if (layoutparams.gravity < 0)
                            {
                                i1 = mGravity;
                            } else
                            {
                                i1 = layoutparams.gravity;
                            }
                            i1 = ((i1 & 0x70) >> 4 & -2) >> 1;
                            ai[i1] = Math.max(ai[i1], j6);
                            ai1[i1] = Math.max(ai1[i1], j5 - j6);
                        }
                    }
                    j2 = Math.max(j2, j5);
                    if (l != 0 && layoutparams.height == -1)
                    {
                        l = 1;
                    } else
                    {
                        l = 0;
                    }
                    if (layoutparams.weight > 0.0F)
                    {
                        if (!flag)
                        {
                            j1 = j5;
                        }
                        k1 = Math.max(k1, j1);
                    } else
                    {
                        if (!flag)
                        {
                            j1 = j5;
                        }
                        k = Math.max(k, j1);
                    }
                    l1 += getChildrenSkipCount(view1, l1);
                    i1 = l5;
                    j1 = i2;
                    flag = j3;
                }
                l1++;
                i2 = k4;
            }
            if (mTotalLength > 0 && hasDividerBeforeChildAt(l6))
            {
                mTotalLength = mTotalLength + mDividerWidth;
            }
            if (ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
            {
                l1 = j2;
                if (ai[3] == -1)
                {
                    break label0;
                }
            }
            l1 = Math.max(j2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
        }
        if (flag3 && (j7 == 0x80000000 || j7 == 0))
        {
            mTotalLength = 0;
            int k2 = 0;
            while (k2 < l6) 
            {
                View view2 = getVirtualChildAt(k2);
                if (view2 == null)
                {
                    mTotalLength = mTotalLength + measureNullChild(k2);
                } else
                if (view2.getVisibility() == 8)
                {
                    k2 += getChildrenSkipCount(view2, k2);
                } else
                {
                    LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
                    if (flag1)
                    {
                        mTotalLength = mTotalLength + (layoutparams1.leftMargin + i2 + layoutparams1.rightMargin + getNextLocationOffset(view2));
                    } else
                    {
                        int l3 = mTotalLength;
                        mTotalLength = Math.max(l3, l3 + i2 + layoutparams1.leftMargin + layoutparams1.rightMargin + getNextLocationOffset(view2));
                    }
                }
                k2++;
            }
        }
        mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
        k7 = ViewCompat.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumWidth()), i, 0);
        l2 = (k7 & 0xffffff) - mTotalLength;
        if (!flag && (l2 == 0 || f <= 0.0F)) goto _L2; else goto _L1
_L1:
        int i3;
        int j4;
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
            l1 = -1;
            mTotalLength = 0;
            i3 = 0;
            k1 = k;
            while (i3 < l6) 
            {
                View view3 = getVirtualChildAt(i3);
                int i4 = l;
                int l4 = k1;
                int k5 = i1;
                int i6 = l2;
                int k6 = l1;
                float f2 = f;
                if (view3 != null)
                {
                    if (view3.getVisibility() == 8)
                    {
                        f2 = f;
                        k6 = l1;
                        i6 = l2;
                        k5 = i1;
                        l4 = k1;
                        i4 = l;
                    } else
                    {
                        LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
                        f2 = layoutparams2.weight;
                        i2 = i1;
                        k = l2;
                        float f1 = f;
                        if (f2 > 0.0F)
                        {
                            k = (int)(((float)l2 * f2) / f);
                            f1 = f - f2;
                            i2 = l2 - k;
                            i4 = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom() + layoutparams2.topMargin + layoutparams2.bottomMargin, layoutparams2.height);
                            int l7;
                            if (layoutparams2.width != 0 || j7 != 0x40000000)
                            {
                                l2 = view3.getMeasuredWidth() + k;
                                k = l2;
                                if (l2 < 0)
                                {
                                    k = 0;
                                }
                                view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), i4);
                            } else
                            {
                                if (k <= 0)
                                {
                                    k = 0;
                                }
                                view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), i4);
                            }
                            i1 = ViewUtils.combineMeasuredStates(i1, ViewCompat.getMeasuredState(view3) & 0xff000000);
                            k = i2;
                            i2 = i1;
                        }
                        if (flag1)
                        {
                            mTotalLength = mTotalLength + (view3.getMeasuredWidth() + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view3));
                        } else
                        {
                            i1 = mTotalLength;
                            mTotalLength = Math.max(i1, view3.getMeasuredWidth() + i1 + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view3));
                        }
                        if (i7 != 0x40000000 && layoutparams2.height == -1)
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                        i4 = layoutparams2.topMargin + layoutparams2.bottomMargin;
                        l2 = view3.getMeasuredHeight() + i4;
                        l1 = Math.max(l1, l2);
                        if (i1 != 0)
                        {
                            i1 = i4;
                        } else
                        {
                            i1 = l2;
                        }
                        k1 = Math.max(k1, i1);
                        if (l != 0 && layoutparams2.height == -1)
                        {
                            l = 1;
                        } else
                        {
                            l = 0;
                        }
                        i4 = l;
                        l4 = k1;
                        k5 = i2;
                        i6 = k;
                        k6 = l1;
                        f2 = f1;
                        if (flag2)
                        {
                            l7 = view3.getBaseline();
                            i4 = l;
                            l4 = k1;
                            k5 = i2;
                            i6 = k;
                            k6 = l1;
                            f2 = f1;
                            if (l7 != -1)
                            {
                                if (layoutparams2.gravity < 0)
                                {
                                    i1 = mGravity;
                                } else
                                {
                                    i1 = layoutparams2.gravity;
                                }
                                i1 = ((i1 & 0x70) >> 4 & -2) >> 1;
                                ai[i1] = Math.max(ai[i1], l7);
                                ai1[i1] = Math.max(ai1[i1], l2 - l7);
                                i4 = l;
                                l4 = k1;
                                k5 = i2;
                                i6 = k;
                                k6 = l1;
                                f2 = f1;
                            }
                        }
                    }
                }
                i3++;
                l = i4;
                k1 = l4;
                i1 = k5;
                l2 = i6;
                l1 = k6;
                f = f2;
            }
            mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
            if (ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
            {
                j4 = l;
                l2 = k1;
                i3 = i1;
                k = l1;
                if (ai[3] == -1)
                {
                    break label1;
                }
            }
            k = Math.max(l1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
            i3 = i1;
            l2 = k1;
            j4 = l;
        }
_L4:
        l = k;
        if (j4 == 0)
        {
            l = k;
            if (i7 != 0x40000000)
            {
                l = l2;
            }
        }
        setMeasuredDimension(0xff000000 & i3 | k7, ViewCompat.resolveSizeAndState(Math.max(l + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j, i3 << 16));
        if (j1 != 0)
        {
            forceUniformHeight(l6, i);
        }
        return;
_L2:
        int i5;
        i5 = Math.max(k, k1);
        j4 = l;
        l2 = i5;
        i3 = i1;
        k = l1;
        if (!flag3) goto _L4; else goto _L3
_L3:
        j4 = l;
        l2 = i5;
        i3 = i1;
        k = l1;
        if (j7 == 0x40000000) goto _L4; else goto _L5
_L5:
        k1 = 0;
_L7:
        j4 = l;
        l2 = i5;
        i3 = i1;
        k = l1;
        if (k1 >= l6) goto _L4; else goto _L6
_L6:
        View view = getVirtualChildAt(k1);
        if (view != null && view.getVisibility() != 8 && ((LayoutParams)view.getLayoutParams()).weight > 0.0F)
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
        }
        k1++;
          goto _L7
    }

    int measureNullChild(int i)
    {
        return 0;
    }

    void measureVertical(int i, int j)
    {
        float f;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int i4;
        int j4;
        int k4;
        int l4;
        boolean flag;
        mTotalLength = 0;
        j1 = 0;
        i1 = 0;
        k = 0;
        l1 = 0;
        l = 1;
        f = 0.0F;
        i4 = getVirtualChildCount();
        j4 = android.view.View.MeasureSpec.getMode(i);
        k4 = android.view.View.MeasureSpec.getMode(j);
        k1 = 0;
        k2 = 0;
        l4 = mBaselineAlignedChildIndex;
        flag = mUseLargestChild;
        j2 = 0x80000000;
        i2 = 0;
_L2:
        View view;
        int i3;
        if (i2 >= i4)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        view = getVirtualChildAt(i2);
        if (view != null)
        {
            break; /* Loop/switch isn't completed */
        }
        mTotalLength = mTotalLength + measureNullChild(i2);
        i3 = j2;
_L3:
        i2++;
        j2 = i3;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (view.getVisibility() != 8)
            {
                break label0;
            }
            i2 += getChildrenSkipCount(view, i2);
            i3 = j2;
        }
          goto _L3
        LayoutParams layoutparams;
        if (hasDividerBeforeChildAt(i2))
        {
            mTotalLength = mTotalLength + mDividerHeight;
        }
        layoutparams = (LayoutParams)view.getLayoutParams();
        f += layoutparams.weight;
        if (k4 != 0x40000000 || layoutparams.height != 0 || layoutparams.weight <= 0.0F) goto _L5; else goto _L4
_L4:
        int l2;
        k2 = mTotalLength;
        mTotalLength = Math.max(k2, layoutparams.topMargin + k2 + layoutparams.bottomMargin);
        l2 = 1;
        i3 = j2;
_L7:
        if (l4 >= 0 && l4 == i2 + 1)
        {
            mBaselineChildTop = mTotalLength;
        }
        if (i2 < l4 && layoutparams.weight > 0.0F)
        {
            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        }
        break; /* Loop/switch isn't completed */
_L5:
        i3 = 0x80000000;
        l2 = i3;
        if (layoutparams.height == 0)
        {
            l2 = i3;
            if (layoutparams.weight > 0.0F)
            {
                l2 = 0;
                layoutparams.height = -2;
            }
        }
        int j3;
        if (f == 0.0F)
        {
            i3 = mTotalLength;
        } else
        {
            i3 = 0;
        }
        measureChildBeforeLayout(view, i2, i, 0, j, i3);
        if (l2 != 0x80000000)
        {
            layoutparams.height = l2;
        }
        j3 = view.getMeasuredHeight();
        l2 = mTotalLength;
        mTotalLength = Math.max(l2, l2 + j3 + layoutparams.topMargin + layoutparams.bottomMargin + getNextLocationOffset(view));
        i3 = j2;
        l2 = k2;
        if (flag)
        {
            i3 = Math.max(j3, j2);
            l2 = k2;
        }
        if (true) goto _L7; else goto _L6
_L6:
        int k3 = 0;
        j2 = k1;
        k2 = k3;
        if (j4 != 0x40000000)
        {
            j2 = k1;
            k2 = k3;
            if (layoutparams.width == -1)
            {
                j2 = 1;
                k2 = 1;
            }
        }
        k1 = layoutparams.leftMargin + layoutparams.rightMargin;
        k3 = view.getMeasuredWidth() + k1;
        j1 = Math.max(j1, k3);
        i1 = ViewUtils.combineMeasuredStates(i1, ViewCompat.getMeasuredState(view));
        if (l != 0 && layoutparams.width == -1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (layoutparams.weight > 0.0F)
        {
            if (k2 == 0)
            {
                k1 = k3;
            }
            l1 = Math.max(l1, k1);
        } else
        {
            if (k2 == 0)
            {
                k1 = k3;
            }
            k = Math.max(k, k1);
        }
        i2 += getChildrenSkipCount(view, i2);
        k1 = j2;
        k2 = l2;
          goto _L3
        int l3;
        if (mTotalLength > 0 && hasDividerBeforeChildAt(i4))
        {
            mTotalLength = mTotalLength + mDividerHeight;
        }
        if (flag && (k4 == 0x80000000 || k4 == 0))
        {
            mTotalLength = 0;
            i2 = 0;
            while (i2 < i4) 
            {
                View view1 = getVirtualChildAt(i2);
                if (view1 == null)
                {
                    mTotalLength = mTotalLength + measureNullChild(i2);
                } else
                if (view1.getVisibility() == 8)
                {
                    i2 += getChildrenSkipCount(view1, i2);
                } else
                {
                    LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                    l2 = mTotalLength;
                    mTotalLength = Math.max(l2, l2 + j2 + layoutparams1.topMargin + layoutparams1.bottomMargin + getNextLocationOffset(view1));
                }
                i2++;
            }
        }
        mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
        l3 = ViewCompat.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumHeight()), j, 0);
        i2 = (l3 & 0xffffff) - mTotalLength;
        if (k2 == 0 && (i2 == 0 || f <= 0.0F)) goto _L9; else goto _L8
_L8:
        if (mWeightSum > 0.0F)
        {
            f = mWeightSum;
        }
        mTotalLength = 0;
        k2 = 0;
        l1 = j1;
        j2 = i2;
        while (k2 < i4) 
        {
            View view2 = getVirtualChildAt(k2);
            if (view2.getVisibility() == 8)
            {
                j1 = j2;
                i2 = i1;
                i1 = k;
                k = l;
            } else
            {
                LayoutParams layoutparams2 = (LayoutParams)view2.getLayoutParams();
                float f2 = layoutparams2.weight;
                i2 = i1;
                j1 = j2;
                float f1 = f;
                if (f2 > 0.0F)
                {
                    j1 = (int)(((float)j2 * f2) / f);
                    f1 = f - f2;
                    i2 = j2 - j1;
                    l2 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutparams2.leftMargin + layoutparams2.rightMargin, layoutparams2.width);
                    if (layoutparams2.height != 0 || k4 != 0x40000000)
                    {
                        j2 = view2.getMeasuredHeight() + j1;
                        j1 = j2;
                        if (j2 < 0)
                        {
                            j1 = 0;
                        }
                        view2.measure(l2, android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
                    } else
                    {
                        if (j1 <= 0)
                        {
                            j1 = 0;
                        }
                        view2.measure(l2, android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
                    }
                    i1 = ViewUtils.combineMeasuredStates(i1, ViewCompat.getMeasuredState(view2) & 0xffffff00);
                    j1 = i2;
                    i2 = i1;
                }
                j2 = layoutparams2.leftMargin + layoutparams2.rightMargin;
                l2 = view2.getMeasuredWidth() + j2;
                l1 = Math.max(l1, l2);
                if (j4 != 0x40000000 && layoutparams2.width == -1)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 != 0)
                {
                    i1 = j2;
                } else
                {
                    i1 = l2;
                }
                i1 = Math.max(k, i1);
                if (l != 0 && layoutparams2.width == -1)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                l = mTotalLength;
                mTotalLength = Math.max(l, view2.getMeasuredHeight() + l + layoutparams2.topMargin + layoutparams2.bottomMargin + getNextLocationOffset(view2));
                f = f1;
            }
            k2++;
            l = k;
            k = i1;
            i1 = i2;
            j2 = j1;
        }
        mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
        i2 = i1;
        k2 = l;
_L11:
        l = l1;
        if (k2 == 0)
        {
            l = l1;
            if (j4 != 0x40000000)
            {
                l = k;
            }
        }
        setMeasuredDimension(ViewCompat.resolveSizeAndState(Math.max(l + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i2), l3);
        if (k1 != 0)
        {
            forceUniformWidth(i4, j);
        }
        return;
_L9:
        i3 = Math.max(k, l1);
        k2 = l;
        k = i3;
        i2 = i1;
        l1 = j1;
        if (!flag) goto _L11; else goto _L10
_L10:
        k2 = l;
        k = i3;
        i2 = i1;
        l1 = j1;
        if (k4 == 0x40000000) goto _L11; else goto _L12
_L12:
        l2 = 0;
_L14:
        k2 = l;
        k = i3;
        i2 = i1;
        l1 = j1;
        if (l2 >= i4) goto _L11; else goto _L13
_L13:
        View view3 = getVirtualChildAt(l2);
        if (view3 != null && view3.getVisibility() != 8 && ((LayoutParams)view3.getLayoutParams()).weight > 0.0F)
        {
            view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(view3.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000));
        }
        l2++;
          goto _L14
    }

    protected void onDraw(Canvas canvas)
    {
        if (mDivider == null)
        {
            return;
        }
        if (mOrientation == 1)
        {
            drawDividersVertical(canvas);
            return;
        } else
        {
            drawDividersHorizontal(canvas);
            return;
        }
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
        if (mOrientation == 1)
        {
            layoutVertical(i, j, k, l);
            return;
        } else
        {
            layoutHorizontal(i, j, k, l);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        if (mOrientation == 1)
        {
            measureVertical(i, j);
            return;
        } else
        {
            measureHorizontal(i, j);
            return;
        }
    }

    public void setBaselineAligned(boolean flag)
    {
        mBaselineAligned = flag;
    }

    public void setBaselineAlignedChildIndex(int i)
    {
        if (i < 0 || i >= getChildCount())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("base aligned child index out of range (0, ").append(getChildCount()).append(")").toString());
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
