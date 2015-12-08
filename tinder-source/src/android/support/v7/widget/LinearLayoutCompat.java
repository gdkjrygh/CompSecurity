// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.f;
import android.support.v4.view.x;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.internal.widget.ViewUtils;
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

        public LayoutParams(int i, int j, float f1)
        {
            super(i, j);
            gravity = -1;
            weight = f1;
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

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            gravity = -1;
            weight = layoutparams.weight;
            gravity = layoutparams.gravity;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            gravity = -1;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            gravity = -1;
        }
    }

    public static interface OrientationMode
        extends Annotation
    {
    }


    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
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
                    k = view.getRight();
                    k = layoutparams.rightMargin + k;
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
                    j = view1.getRight();
                    j = layoutparams1.rightMargin + j;
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
                j = view1.getBottom();
                j = layoutparams1.bottomMargin + j;
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
        int j;
        if (getChildCount() <= mBaselineAlignedChildIndex)
        {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        view = getChildAt(mBaselineAlignedChildIndex);
        j = view.getBaseline();
        if (j != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mBaselineAlignedChildIndex != 0)
        {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = mBaselineChildTop;
        if (mOrientation != 1) goto _L6; else goto _L5
_L5:
        int k = mGravity & 0x70;
        if (k == 48) goto _L6; else goto _L7
_L7:
        k;
        JVM INSTR lookupswitch 2: default 132
    //                   16: 170
    //                   80: 147;
           goto _L6 _L8 _L9
_L6:
        return ((LayoutParams)view.getLayoutParams()).topMargin + i + j;
_L9:
        i = getBottom() - getTop() - getPaddingBottom() - mTotalLength;
        continue; /* Loop/switch isn't completed */
_L8:
        i += (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - mTotalLength) / 2;
        if (true) goto _L6; else goto _L10
_L10:
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
        if ((mShowDividers & 2) == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i--;
        do
        {
            if (i < 0)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            if (getChildAt(i).getVisibility() != 8)
            {
                break;
            }
            i--;
        } while (true);
        if (true) goto _L3; else goto _L6
_L6:
        return false;
        return false;
    }

    public boolean isBaselineAligned()
    {
        return mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled()
    {
        return mUseLargestChild;
    }

    void layoutHorizontal(int i, int j, int k, int l)
    {
        int ai[];
        int ai1[];
        int k1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        boolean flag;
        boolean flag1;
        flag = ViewUtils.isLayoutRtl(this);
        k1 = getPaddingTop();
        i2 = l - j;
        j2 = getPaddingBottom();
        k2 = getPaddingBottom();
        l2 = getVirtualChildCount();
        j = mGravity;
        i3 = mGravity;
        flag1 = mBaselineAligned;
        ai = mMaxAscent;
        ai1 = mMaxDescent;
        f.a(j & 0x800007, x.h(this));
        JVM INSTR lookupswitch 2: default 104
    //                   1: 190
    //                   5: 173;
           goto _L1 _L2 _L3
_L1:
        i = getPaddingLeft();
_L9:
        View view;
        LayoutParams layoutparams;
        int i1;
        int j1;
        int l1;
        int j3;
        int k3;
        int l3;
        if (flag)
        {
            l = -1;
            i1 = l2 - 1;
        } else
        {
            l = 1;
            i1 = 0;
        }
        j = 0;
        k = i;
_L8:
        if (j >= l2) goto _L5; else goto _L4
_L4:
        j3 = i1 + l * j;
        view = getVirtualChildAt(j3);
        if (view != null) goto _L7; else goto _L6
_L6:
        k += measureNullChild(j3);
        i = j;
_L14:
        j = i + 1;
          goto _L8
_L3:
        i = (getPaddingLeft() + k) - i - mTotalLength;
          goto _L9
_L2:
        i = getPaddingLeft() + (k - i - mTotalLength) / 2;
          goto _L9
_L7:
        if (view.getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_524;
        }
        k3 = view.getMeasuredWidth();
        l3 = view.getMeasuredHeight();
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (flag1 && layoutparams.height != -1)
        {
            j1 = view.getBaseline();
        } else
        {
            j1 = -1;
        }
        l1 = layoutparams.gravity;
        i = l1;
        if (l1 < 0)
        {
            i = i3 & 0x70;
        }
        i & 0x70;
        JVM INSTR lookupswitch 3: default 324
    //                   16: 435
    //                   48: 402
    //                   80: 467;
           goto _L10 _L11 _L12 _L13
_L13:
        break MISSING_BLOCK_LABEL_467;
_L10:
        i = k1;
_L15:
        if (hasDividerBeforeChildAt(j3))
        {
            k = mDividerWidth + k;
        }
        k += layoutparams.leftMargin;
        setChildFrame(view, k + getLocationOffset(view), i, k3, l3);
        k += layoutparams.rightMargin + k3 + getNextLocationOffset(view);
        i = getChildrenSkipCount(view, j3) + j;
          goto _L14
_L12:
        l1 = k1 + layoutparams.topMargin;
        i = l1;
        if (j1 != -1)
        {
            i = l1 + (ai[1] - j1);
        }
          goto _L15
_L11:
        i = ((i2 - k1 - k2 - l3) / 2 + k1 + layoutparams.topMargin) - layoutparams.bottomMargin;
          goto _L15
        l1 = i2 - j2 - l3 - layoutparams.bottomMargin;
        i = l1;
        if (j1 != -1)
        {
            i = view.getMeasuredHeight();
            i = l1 - (ai1[2] - (i - j1));
        }
          goto _L15
_L5:
        return;
        i = j;
          goto _L14
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
    //                   16: 134
    //                   80: 116;
           goto _L1 _L2 _L3
_L1:
        i = getPaddingTop();
_L15:
        k = 0;
        j = i;
        i = k;
_L7:
        View view;
        if (i >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        view = getVirtualChildAt(i);
        if (view != null) goto _L5; else goto _L4
_L4:
        j += measureNullChild(i);
_L9:
        i++;
        if (true) goto _L7; else goto _L6
_L3:
        i = (getPaddingTop() + l) - j - mTotalLength;
        continue; /* Loop/switch isn't completed */
_L2:
        i = getPaddingTop() + (l - j - mTotalLength) / 2;
        continue; /* Loop/switch isn't completed */
_L5:
        if (view.getVisibility() == 8) goto _L9; else goto _L8
_L8:
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
        f.a(k, x.h(this)) & 7;
        JVM INSTR lookupswitch 2: default 248
    //                   1: 330
    //                   5: 362;
           goto _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_362;
_L10:
        k = i1 + layoutparams.leftMargin;
_L13:
        if (hasDividerBeforeChildAt(i))
        {
            j = mDividerHeight + j;
        }
        j += layoutparams.topMargin;
        setChildFrame(view, k, j + getLocationOffset(view), k2, l2);
        j += layoutparams.bottomMargin + l2 + getNextLocationOffset(view);
        i = getChildrenSkipCount(view, i) + i;
          goto _L9
_L11:
        k = ((j1 - i1 - l1 - k2) / 2 + i1 + layoutparams.leftMargin) - layoutparams.rightMargin;
          goto _L13
        k = j1 - k1 - k2 - layoutparams.rightMargin;
          goto _L13
_L6:
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    void measureChildBeforeLayout(View view, int i, int j, int k, int l, int i1)
    {
        measureChildWithMargins(view, j, k, l, i1);
    }

    void measureHorizontal(int i, int j)
    {
        float f1;
        int ai[];
        int ai1[];
        View view1;
        int k;
        int l;
        int i1;
        int j1;
        boolean flag;
        int k1;
        int l1;
        int i2;
        int j2;
        int i3;
        int j4;
        boolean flag1;
        int j5;
        int j6;
        int k6;
        int l6;
        boolean flag2;
        boolean flag3;
        mTotalLength = 0;
        j1 = 0;
        i1 = 0;
        k = 0;
        k1 = 0;
        l = 1;
        f1 = 0.0F;
        j6 = getVirtualChildCount();
        l6 = android.view.View.MeasureSpec.getMode(i);
        k6 = android.view.View.MeasureSpec.getMode(j);
        flag = false;
        i2 = 0;
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
        if (l6 == 0x40000000)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l1 = 0x80000000;
        j4 = 0;
        if (j4 >= j6) goto _L2; else goto _L1
_L1:
        view1 = getVirtualChildAt(j4);
        if (view1 != null) goto _L4; else goto _L3
_L3:
        mTotalLength = mTotalLength + measureNullChild(j4);
        j5 = j1;
        i3 = i1;
        j2 = k;
        j1 = k1;
        i1 = l;
        l = i2;
        k = l1;
_L6:
        j4++;
        l1 = k;
        i2 = l;
        l = i1;
        k1 = j1;
        k = j2;
        i1 = i3;
        j1 = j5;
        break MISSING_BLOCK_LABEL_156;
_L4:
        if (view1.getVisibility() == 8)
        {
            break; /* Loop/switch isn't completed */
        }
        if (hasDividerBeforeChildAt(j4))
        {
            mTotalLength = mTotalLength + mDividerWidth;
        }
        LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
        f1 += layoutparams.weight;
        if (l6 == 0x40000000 && layoutparams.width == 0 && layoutparams.weight > 0.0F)
        {
            int i7;
            if (flag1)
            {
                mTotalLength = mTotalLength + (layoutparams.leftMargin + layoutparams.rightMargin);
            } else
            {
                j2 = mTotalLength;
                mTotalLength = Math.max(j2, layoutparams.leftMargin + j2 + layoutparams.rightMargin);
            }
            if (flag2)
            {
                j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                view1.measure(j2, j2);
                j2 = i2;
                i3 = l1;
            } else
            {
                j2 = 1;
                i3 = l1;
            }
        } else
        {
            i3 = 0x80000000;
            j2 = i3;
            if (layoutparams.width == 0)
            {
                j2 = i3;
                if (layoutparams.weight > 0.0F)
                {
                    j2 = 0;
                    layoutparams.width = -2;
                }
            }
            if (f1 == 0.0F)
            {
                i3 = mTotalLength;
            } else
            {
                i3 = 0;
            }
            measureChildBeforeLayout(view1, j4, i, i3, j, 0);
            if (j2 != 0x80000000)
            {
                layoutparams.width = j2;
            }
            j5 = view1.getMeasuredWidth();
            if (flag1)
            {
                mTotalLength = mTotalLength + (layoutparams.leftMargin + j5 + layoutparams.rightMargin + getNextLocationOffset(view1));
            } else
            {
                j2 = mTotalLength;
                mTotalLength = Math.max(j2, j2 + j5 + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view1));
            }
            i3 = l1;
            j2 = i2;
            if (flag3)
            {
                i3 = Math.max(j5, l1);
                j2 = i2;
            }
        }
        l1 = 0;
        if (k6 != 0x40000000 && layoutparams.height == -1)
        {
            flag = true;
            l1 = 1;
        }
        i2 = layoutparams.topMargin;
        i2 = layoutparams.bottomMargin + i2;
        j5 = view1.getMeasuredHeight() + i2;
        i1 = ViewUtils.combineMeasuredStates(i1, x.l(view1));
        if (flag2)
        {
            i7 = view1.getBaseline();
            if (i7 != -1)
            {
                int i6;
                if (layoutparams.gravity < 0)
                {
                    i6 = mGravity;
                } else
                {
                    i6 = layoutparams.gravity;
                }
                i6 = ((i6 & 0x70) >> 4 & -2) >> 1;
                ai[i6] = Math.max(ai[i6], i7);
                ai1[i6] = Math.max(ai1[i6], j5 - i7);
            }
        }
        j1 = Math.max(j1, j5);
        if (l != 0 && layoutparams.height == -1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (layoutparams.weight > 0.0F)
        {
            if (l1 == 0)
            {
                i2 = j5;
            }
            j5 = Math.max(k1, i2);
            k1 = k;
            k = i3;
            i2 = j1;
            l1 = i1;
            j1 = j5;
            i1 = l;
            l = j2;
        } else
        {
            if (l1 == 0)
            {
                i2 = j5;
            }
            i2 = Math.max(k, i2);
            l1 = l;
            k = i3;
            i3 = i1;
            l = j2;
            j2 = j1;
            i1 = l1;
            j1 = k1;
            k1 = i2;
            l1 = i3;
            i2 = j2;
        }
_L10:
        j4 += getChildrenSkipCount(view1, j4);
        j2 = k1;
        i3 = l1;
        j5 = i2;
        if (true) goto _L6; else goto _L5
_L2:
        if (mTotalLength > 0 && hasDividerBeforeChildAt(j6))
        {
            mTotalLength = mTotalLength + mDividerWidth;
        }
        float f2;
        View view;
        View view3;
        LayoutParams layoutparams2;
        int k2;
        int l3;
        int i5;
        int k5;
        if (ai[1] != -1 || ai[0] != -1 || ai[2] != -1 || ai[3] != -1)
        {
            k2 = Math.max(j1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
        } else
        {
            k2 = j1;
        }
        if (flag3 && (l6 == 0x80000000 || l6 == 0))
        {
            mTotalLength = 0;
            j1 = 0;
            while (j1 < j6) 
            {
                View view2 = getVirtualChildAt(j1);
                if (view2 == null)
                {
                    mTotalLength = mTotalLength + measureNullChild(j1);
                } else
                if (view2.getVisibility() == 8)
                {
                    j1 = getChildrenSkipCount(view2, j1) + j1;
                } else
                {
                    LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
                    if (flag1)
                    {
                        int j3 = mTotalLength;
                        int k4 = layoutparams1.leftMargin;
                        mTotalLength = layoutparams1.rightMargin + (k4 + l1) + getNextLocationOffset(view2) + j3;
                    } else
                    {
                        int k3 = mTotalLength;
                        int l4 = layoutparams1.leftMargin;
                        mTotalLength = Math.max(k3, layoutparams1.rightMargin + (k3 + l1 + l4) + getNextLocationOffset(view2));
                    }
                }
                j1++;
            }
        }
        mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
        k5 = x.a(Math.max(mTotalLength, getSuggestedMinimumWidth()), i, 0);
        l3 = (0xffffff & k5) - mTotalLength;
        if (i2 == 0 && (l3 == 0 || f1 <= 0.0F)) goto _L8; else goto _L7
_L7:
label0:
        {
            if (mWeightSum > 0.0F)
            {
                f1 = mWeightSum;
            }
            ai[3] = -1;
            ai[2] = -1;
            ai[1] = -1;
            ai[0] = -1;
            ai1[3] = -1;
            ai1[2] = -1;
            ai1[1] = -1;
            ai1[0] = -1;
            j1 = -1;
            mTotalLength = 0;
            k1 = k;
            k = i1;
            i2 = 0;
            i1 = k1;
            k1 = l3;
            while (i2 < j6) 
            {
                view3 = getVirtualChildAt(i2);
                if (view3 != null && view3.getVisibility() != 8)
                {
                    layoutparams2 = (LayoutParams)view3.getLayoutParams();
                    f2 = layoutparams2.weight;
                    if (f2 > 0.0F)
                    {
                        k2 = (int)(((float)k1 * f2) / f1);
                        i5 = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom() + layoutparams2.topMargin + layoutparams2.bottomMargin, layoutparams2.height);
                        if (layoutparams2.width != 0 || l6 != 0x40000000)
                        {
                            l3 = k2 + view3.getMeasuredWidth();
                            l1 = l3;
                            if (l3 < 0)
                            {
                                l1 = 0;
                            }
                        } else
                        if (k2 > 0)
                        {
                            l1 = k2;
                        } else
                        {
                            l1 = 0;
                        }
                        view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000), i5);
                        k = ViewUtils.combineMeasuredStates(k, x.l(view3) & 0xff000000);
                        f1 -= f2;
                        l1 = k1 - k2;
                        k1 = k;
                        k = l1;
                    } else
                    {
                        l1 = k;
                        k = k1;
                        k1 = l1;
                    }
                    if (flag1)
                    {
                        mTotalLength = mTotalLength + (view3.getMeasuredWidth() + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view3));
                    } else
                    {
                        l1 = mTotalLength;
                        mTotalLength = Math.max(l1, view3.getMeasuredWidth() + l1 + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view3));
                    }
                    if (k6 != 0x40000000 && layoutparams2.height == -1)
                    {
                        l1 = 1;
                    } else
                    {
                        l1 = 0;
                    }
                    i5 = layoutparams2.topMargin + layoutparams2.bottomMargin;
                    l3 = view3.getMeasuredHeight() + i5;
                    k2 = Math.max(j1, l3);
                    if (l1 != 0)
                    {
                        j1 = i5;
                    } else
                    {
                        j1 = l3;
                    }
                    j1 = Math.max(i1, j1);
                    if (l != 0 && layoutparams2.height == -1)
                    {
                        l = 1;
                    } else
                    {
                        l = 0;
                    }
                    if (flag2)
                    {
                        l1 = view3.getBaseline();
                        if (l1 != -1)
                        {
                            if (layoutparams2.gravity < 0)
                            {
                                i1 = mGravity;
                            } else
                            {
                                i1 = layoutparams2.gravity;
                            }
                            i1 = ((i1 & 0x70) >> 4 & -2) >> 1;
                            ai[i1] = Math.max(ai[i1], l1);
                            ai1[i1] = Math.max(ai1[i1], l3 - l1);
                        }
                    }
                    l1 = k1;
                    k1 = l;
                    i1 = k2;
                    l = l1;
                } else
                {
                    k2 = l;
                    l = k;
                    l1 = j1;
                    k = k1;
                    k1 = k2;
                    j1 = i1;
                    i1 = l1;
                }
                k2 = i2 + 1;
                l1 = k1;
                i2 = i1;
                k1 = k;
                k = l;
                l = l1;
                i1 = j1;
                j1 = i2;
                i2 = k2;
            }
            mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
            if (ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
            {
                k1 = j1;
                if (ai[3] == -1)
                {
                    break label0;
                }
            }
            k1 = Math.max(j1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
        }
        j1 = l;
        l = k;
        k = k1;
        k1 = j1;
        j1 = k;
        k = i1;
_L9:
        if (k1 != 0 || k6 == 0x40000000)
        {
            k = j1;
        }
        setMeasuredDimension(0xff000000 & l | k5, x.a(Math.max(k + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j, l << 16));
        if (flag)
        {
            forceUniformHeight(j6, i);
        }
        return;
_L8:
        j1 = Math.max(k, k1);
        if (flag3 && l6 != 0x40000000)
        {
            for (k = 0; k < j6; k++)
            {
                view = getVirtualChildAt(k);
                if (view != null && view.getVisibility() != 8 && ((LayoutParams)view.getLayoutParams()).weight > 0.0F)
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
                }
            }

        }
        k = j1;
        j1 = k2;
        k1 = l;
        l = i1;
        if (true) goto _L9; else goto _L5
_L5:
        int l5 = l1;
        l1 = l;
        int l2 = k;
        l = i2;
        i2 = i1;
        int i4 = j1;
        k = l5;
        i1 = l1;
        j1 = k1;
        k1 = l2;
        l1 = i2;
        i2 = i4;
          goto _L10
    }

    int measureNullChild(int i)
    {
        return 0;
    }

    void measureVertical(int i, int j)
    {
        float f1;
        int k;
        int l;
        int i1;
        int j1;
        boolean flag;
        int k1;
        int i2;
        int j2;
        int i4;
        int l5;
        int i6;
        int j6;
        int k6;
        boolean flag1;
        mTotalLength = 0;
        i1 = 0;
        l = 0;
        k = 0;
        k1 = 0;
        j1 = 1;
        f1 = 0.0F;
        l5 = getVirtualChildCount();
        i6 = android.view.View.MeasureSpec.getMode(i);
        j6 = android.view.View.MeasureSpec.getMode(j);
        flag = false;
        j2 = 0;
        k6 = mBaselineAlignedChildIndex;
        flag1 = mUseLargestChild;
        i2 = 0x80000000;
        i4 = 0;
_L5:
        if (i4 >= l5) goto _L2; else goto _L1
_L1:
        View view = getVirtualChildAt(i4);
        if (view != null) goto _L4; else goto _L3
_L3:
        int l1;
        int k2;
        int l4;
        mTotalLength = mTotalLength + measureNullChild(i4);
        l4 = i1;
        l1 = l;
        k2 = k;
        l = k1;
        i1 = j1;
        k = i2;
_L10:
        i4++;
        i2 = k;
        j1 = i1;
        k1 = l;
        k = k2;
        l = l1;
        i1 = l4;
          goto _L5
_L4:
        LayoutParams layoutparams;
        if (view.getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_1711;
        }
        if (hasDividerBeforeChildAt(i4))
        {
            mTotalLength = mTotalLength + mDividerHeight;
        }
        layoutparams = (LayoutParams)view.getLayoutParams();
        f1 += layoutparams.weight;
        if (j6 != 0x40000000 || layoutparams.height != 0 || layoutparams.weight <= 0.0F) goto _L7; else goto _L6
_L6:
        l1 = mTotalLength;
        mTotalLength = Math.max(l1, layoutparams.topMargin + l1 + layoutparams.bottomMargin);
        l1 = 1;
        k2 = i2;
_L9:
        if (k6 >= 0 && k6 == i4 + 1)
        {
            mBaselineChildTop = mTotalLength;
        }
        if (i4 < k6 && layoutparams.weight > 0.0F)
        {
            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        }
        break; /* Loop/switch isn't completed */
_L7:
        k2 = 0x80000000;
        l1 = k2;
        if (layoutparams.height == 0)
        {
            l1 = k2;
            if (layoutparams.weight > 0.0F)
            {
                l1 = 0;
                layoutparams.height = -2;
            }
        }
        if (f1 == 0.0F)
        {
            k2 = mTotalLength;
        } else
        {
            k2 = 0;
        }
        measureChildBeforeLayout(view, i4, i, 0, j, k2);
        if (l1 != 0x80000000)
        {
            layoutparams.height = l1;
        }
        l4 = view.getMeasuredHeight();
        l1 = mTotalLength;
        mTotalLength = Math.max(l1, l1 + l4 + layoutparams.topMargin + layoutparams.bottomMargin + getNextLocationOffset(view));
        k2 = i2;
        l1 = j2;
        if (flag1)
        {
            k2 = Math.max(l4, i2);
            l1 = j2;
        }
        if (true) goto _L9; else goto _L8
_L8:
        j2 = 0;
        if (i6 != 0x40000000 && layoutparams.width == -1)
        {
            flag = true;
            j2 = 1;
        }
        i2 = layoutparams.leftMargin;
        l4 = layoutparams.rightMargin + i2;
        int k5 = view.getMeasuredWidth() + l4;
        i1 = Math.max(i1, k5);
        i2 = ViewUtils.combineMeasuredStates(l, x.l(view));
        if (j1 != 0 && layoutparams.width == -1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (layoutparams.weight > 0.0F)
        {
            if (j2 == 0)
            {
                l4 = k5;
            }
            j1 = Math.max(k1, l4);
            k1 = k;
            k = k2;
            k2 = i2;
            j2 = l1;
            i2 = i1;
            l1 = k2;
            i1 = l;
            l = j2;
        } else
        {
            if (j2 == 0)
            {
                l4 = k5;
            }
            j2 = Math.max(k, l4);
            j1 = l;
            k = k2;
            l = l1;
            k2 = i1;
            i1 = j1;
            j1 = k1;
            k1 = j2;
            l1 = i2;
            i2 = k2;
        }
_L11:
        i4 += getChildrenSkipCount(view, i4);
        j2 = l;
        l = j1;
        k2 = k1;
        l4 = i2;
          goto _L10
_L2:
        if (mTotalLength > 0 && hasDividerBeforeChildAt(l5))
        {
            mTotalLength = mTotalLength + mDividerHeight;
        }
        if (flag1 && (j6 == 0x80000000 || j6 == 0))
        {
            mTotalLength = 0;
            l1 = 0;
            while (l1 < l5) 
            {
                View view1 = getVirtualChildAt(l1);
                if (view1 == null)
                {
                    mTotalLength = mTotalLength + measureNullChild(l1);
                } else
                if (view1.getVisibility() == 8)
                {
                    l1 = getChildrenSkipCount(view1, l1) + l1;
                } else
                {
                    LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                    int l2 = mTotalLength;
                    int j4 = layoutparams1.topMargin;
                    mTotalLength = Math.max(l2, layoutparams1.bottomMargin + (l2 + i2 + j4) + getNextLocationOffset(view1));
                }
                l1++;
            }
        }
        mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
        int k4 = x.a(Math.max(mTotalLength, getSuggestedMinimumHeight()), j, 0);
        int i3 = (0xffffff & k4) - mTotalLength;
        if (j2 != 0 || i3 != 0 && f1 > 0.0F)
        {
            if (mWeightSum > 0.0F)
            {
                f1 = mWeightSum;
            }
            mTotalLength = 0;
            k1 = j1;
            l1 = k;
            k = l;
            i2 = 0;
            j2 = i3;
            j1 = i1;
            l = l1;
            i1 = k1;
            k1 = j2;
            while (i2 < l5) 
            {
                View view2 = getVirtualChildAt(i2);
                if (view2.getVisibility() != 8)
                {
                    LayoutParams layoutparams2 = (LayoutParams)view2.getLayoutParams();
                    float f2 = layoutparams2.weight;
                    int k3;
                    if (f2 > 0.0F)
                    {
                        j2 = (int)(((float)k1 * f2) / f1);
                        int i5 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutparams2.leftMargin + layoutparams2.rightMargin, layoutparams2.width);
                        if (layoutparams2.height != 0 || j6 != 0x40000000)
                        {
                            int j3 = j2 + view2.getMeasuredHeight();
                            l1 = j3;
                            if (j3 < 0)
                            {
                                l1 = 0;
                            }
                        } else
                        if (j2 > 0)
                        {
                            l1 = j2;
                        } else
                        {
                            l1 = 0;
                        }
                        view2.measure(i5, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
                        k = ViewUtils.combineMeasuredStates(k, x.l(view2) & 0xffffff00);
                        l1 = k1 - j2;
                        k1 = k;
                        f1 -= f2;
                        k = l1;
                    } else
                    {
                        l1 = k;
                        k = k1;
                        k1 = l1;
                    }
                    j2 = layoutparams2.leftMargin + layoutparams2.rightMargin;
                    k3 = view2.getMeasuredWidth() + j2;
                    l1 = Math.max(j1, k3);
                    if (i6 != 0x40000000 && layoutparams2.width == -1)
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                    if (j1 != 0)
                    {
                        j1 = j2;
                    } else
                    {
                        j1 = k3;
                    }
                    j1 = Math.max(l, j1);
                    if (i1 != 0 && layoutparams2.width == -1)
                    {
                        l = 1;
                    } else
                    {
                        l = 0;
                    }
                    i1 = mTotalLength;
                    j2 = view2.getMeasuredHeight();
                    k3 = layoutparams2.topMargin;
                    mTotalLength = Math.max(i1, layoutparams2.bottomMargin + (j2 + i1 + k3) + getNextLocationOffset(view2));
                    i1 = j1;
                    j1 = l;
                    l = l1;
                } else
                {
                    l1 = i1;
                    i1 = l;
                    l = j1;
                    j1 = k;
                    k = k1;
                    k1 = j1;
                    j1 = l1;
                }
                j2 = i2 + 1;
                l1 = i1;
                i1 = k1;
                i2 = l;
                k1 = k;
                k = i1;
                i1 = j1;
                l = l1;
                j1 = i2;
                i2 = j2;
            }
            mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
            k1 = k;
            k = j1;
            j1 = k1;
            k1 = i1;
            i1 = k;
            k = l;
        } else
        {
            k1 = Math.max(k, k1);
            if (flag1 && j6 != 0x40000000)
            {
                for (k = 0; k < l5; k++)
                {
                    view2 = getVirtualChildAt(k);
                    if (view2 != null && view2.getVisibility() != 8 && ((LayoutParams)view2.getLayoutParams()).weight > 0.0F)
                    {
                        view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000));
                    }
                }

            }
            k = k1;
            k1 = j1;
            j1 = l;
        }
        if (k1 != 0 || i6 == 0x40000000)
        {
            k = i1;
        }
        setMeasuredDimension(x.a(Math.max(k + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, j1), k4);
        if (flag)
        {
            forceUniformWidth(l5, j);
        }
        return;
        int l3 = i2;
        l1 = k;
        int j5 = j2;
        i2 = l;
        j2 = i1;
        k = l3;
        l = j5;
        i1 = j1;
        j1 = k1;
        k1 = l1;
        l1 = i2;
        i2 = j2;
          goto _L11
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

    public void onMeasure(int i, int j)
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
            if ((0x800007 & i) == 0)
            {
                i = 0x800003 | i;
            }
            int j = i;
            if ((i & 0x70) == 0)
            {
                j = i | 0x30;
            }
            mGravity = j;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i)
    {
        i &= 0x800007;
        if ((mGravity & 0x800007) != i)
        {
            mGravity = i | mGravity & 0xff7ffff8;
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
            mGravity = i | mGravity & 0xffffff8f;
            requestLayout();
        }
    }

    public void setWeightSum(float f1)
    {
        mWeightSum = Math.max(0.0F, f1);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }
}
