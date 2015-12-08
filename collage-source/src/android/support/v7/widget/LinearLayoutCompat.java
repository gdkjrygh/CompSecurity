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
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v7.widget:
//            TintTypedArray, ViewUtils

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

        public LayoutParams(int i, int j, float f)
        {
            super(i, j);
            gravity = -1;
            weight = f;
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
        GravityCompat.getAbsoluteGravity(j & 0x800007, ViewCompat.getLayoutDirection(this));
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
        GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(this)) & 7;
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
        mTotalLength = 0;
        int i1 = 0;
        int l = 0;
        int l1 = 0;
        int j2 = 0;
        int k = 1;
        float f = 0.0F;
        int l5 = getVirtualChildCount();
        int j6 = android.view.View.MeasureSpec.getMode(i);
        int i6 = android.view.View.MeasureSpec.getMode(j);
        int i2 = 0;
        int k1 = 0;
        if (mMaxAscent == null || mMaxDescent == null)
        {
            mMaxAscent = new int[4];
            mMaxDescent = new int[4];
        }
        int ai[] = mMaxAscent;
        int ai1[] = mMaxDescent;
        ai[3] = -1;
        ai[2] = -1;
        ai[1] = -1;
        ai[0] = -1;
        ai1[3] = -1;
        ai1[2] = -1;
        ai1[1] = -1;
        ai1[0] = -1;
        boolean flag1 = mBaselineAligned;
        boolean flag2 = mUseLargestChild;
        int j1;
        int k2;
        boolean flag;
        if (j6 == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = 0x80000000;
        k2 = 0;
        while (k2 < l5) 
        {
            View view1 = getVirtualChildAt(k2);
            int i3;
            int i4;
            if (view1 == null)
            {
                mTotalLength = mTotalLength + measureNullChild(k2);
                int l2 = j1;
                int l3 = k1;
                k1 = i1;
                j1 = l;
                i1 = k;
                l = l3;
                k = l2;
            } else
            if (view1.getVisibility() == 8)
            {
                int l4 = k2 + getChildrenSkipCount(view1, k2);
                k2 = j1;
                int j4 = k1;
                j1 = k;
                k1 = l;
                int j3 = i1;
                k = k2;
                l = j4;
                k2 = l4;
                i1 = j1;
                j1 = k1;
                k1 = j3;
            } else
            {
                if (hasDividerBeforeChildAt(k2))
                {
                    mTotalLength = mTotalLength + mDividerWidth;
                }
                LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
                f += layoutparams.weight;
                int k3;
                int k4;
                int i5;
                if (j6 == 0x40000000 && layoutparams.width == 0 && layoutparams.weight > 0.0F)
                {
                    int j5;
                    int k5;
                    if (flag)
                    {
                        mTotalLength = mTotalLength + (layoutparams.leftMargin + layoutparams.rightMargin);
                    } else
                    {
                        k3 = mTotalLength;
                        mTotalLength = Math.max(k3, layoutparams.leftMargin + k3 + layoutparams.rightMargin);
                    }
                    if (flag1)
                    {
                        k3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        view1.measure(k3, k3);
                        k4 = k1;
                        k3 = j1;
                    } else
                    {
                        k4 = 1;
                        k3 = j1;
                    }
                } else
                {
                    k4 = 0x80000000;
                    k3 = k4;
                    if (layoutparams.width == 0)
                    {
                        k3 = k4;
                        if (layoutparams.weight > 0.0F)
                        {
                            k3 = 0;
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
                    measureChildBeforeLayout(view1, k2, i, k4, j, 0);
                    if (k3 != 0x80000000)
                    {
                        layoutparams.width = k3;
                    }
                    i5 = view1.getMeasuredWidth();
                    if (flag)
                    {
                        mTotalLength = mTotalLength + (layoutparams.leftMargin + i5 + layoutparams.rightMargin + getNextLocationOffset(view1));
                    } else
                    {
                        k3 = mTotalLength;
                        mTotalLength = Math.max(k3, k3 + i5 + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view1));
                    }
                    k3 = j1;
                    k4 = k1;
                    if (flag2)
                    {
                        k3 = Math.max(i5, j1);
                        k4 = k1;
                    }
                }
                k1 = 0;
                float f1;
                View view;
                if (i6 != 0x40000000 && layoutparams.height == -1)
                {
                    j1 = 1;
                    k1 = 1;
                } else
                {
                    j1 = i2;
                }
                i2 = layoutparams.topMargin;
                i2 = layoutparams.bottomMargin + i2;
                i5 = view1.getMeasuredHeight() + i2;
                j5 = ViewUtils.combineMeasuredStates(l, ViewCompat.getMeasuredState(view1));
                if (flag1)
                {
                    k5 = view1.getBaseline();
                    if (k5 != -1)
                    {
                        if (layoutparams.gravity < 0)
                        {
                            l = mGravity;
                        } else
                        {
                            l = layoutparams.gravity;
                        }
                        l = ((l & 0x70) >> 4 & -2) >> 1;
                        ai[l] = Math.max(ai[l], k5);
                        ai1[l] = Math.max(ai1[l], i5 - k5);
                    }
                }
                k5 = Math.max(i1, i5);
                if (k != 0 && layoutparams.height == -1)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (layoutparams.weight > 0.0F)
                {
                    if (k1 == 0)
                    {
                        i2 = i5;
                    }
                    l = Math.max(j2, i2);
                    k = l1;
                } else
                {
                    if (k1 == 0)
                    {
                        i2 = i5;
                    }
                    k = Math.max(l1, i2);
                    l = j2;
                }
                k2 += getChildrenSkipCount(view1, k2);
                j2 = l;
                l1 = k;
                k1 = k5;
                k = k3;
                k3 = j5;
                i2 = j1;
                l = k4;
                j1 = k3;
            }
            k2++;
            i3 = j1;
            i4 = k1;
            j1 = k;
            k1 = l;
            k = i1;
            l = i3;
            i1 = i4;
        }
        if (mTotalLength > 0 && hasDividerBeforeChildAt(l5))
        {
            mTotalLength = mTotalLength + mDividerWidth;
        }
        if (ai[1] != -1 || ai[0] != -1 || ai[2] != -1 || ai[3] != -1)
        {
            k2 = Math.max(i1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
        } else
        {
            k2 = i1;
        }
        if (flag2 && (j6 == 0x80000000 || j6 == 0))
        {
            mTotalLength = 0;
            i1 = 0;
            while (i1 < l5) 
            {
                view1 = getVirtualChildAt(i1);
                if (view1 == null)
                {
                    mTotalLength = mTotalLength + measureNullChild(i1);
                } else
                if (view1.getVisibility() == 8)
                {
                    i1 = getChildrenSkipCount(view1, i1) + i1;
                } else
                {
                    layoutparams = (LayoutParams)view1.getLayoutParams();
                    if (flag)
                    {
                        k3 = mTotalLength;
                        k4 = layoutparams.leftMargin;
                        mTotalLength = layoutparams.rightMargin + (k4 + j1) + getNextLocationOffset(view1) + k3;
                    } else
                    {
                        k3 = mTotalLength;
                        k4 = layoutparams.leftMargin;
                        mTotalLength = Math.max(k3, layoutparams.rightMargin + (k3 + j1 + k4) + getNextLocationOffset(view1));
                    }
                }
                i1++;
            }
        }
        mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
        i5 = ViewCompat.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumWidth()), i, 0);
        i1 = (0xffffff & i5) - mTotalLength;
        if (k1 == 0 && (i1 == 0 || f <= 0.0F)) goto _L2; else goto _L1
_L1:
label0:
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
            mTotalLength = 0;
            k2 = 0;
            j2 = l1;
            k1 = l;
            j1 = i1;
            i1 = -1;
            l1 = k2;
            l = j2;
            while (l1 < l5) 
            {
                view1 = getVirtualChildAt(l1);
                if (view1 != null)
                {
                    if (view1.getVisibility() == 8)
                    {
                        j2 = j1;
                        j1 = i1;
                        i1 = l;
                        l = k;
                        k = j2;
                    } else
                    {
                        layoutparams = (LayoutParams)view1.getLayoutParams();
                        f1 = layoutparams.weight;
                        if (f1 > 0.0F)
                        {
                            k2 = (int)(((float)j1 * f1) / f);
                            j2 = j1 - k2;
                            k3 = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom() + layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height);
                            if (layoutparams.width != 0 || j6 != 0x40000000)
                            {
                                k2 += view1.getMeasuredWidth();
                                j1 = k2;
                                if (k2 < 0)
                                {
                                    j1 = 0;
                                }
                                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), k3);
                            } else
                            {
                                if (k2 > 0)
                                {
                                    j1 = k2;
                                } else
                                {
                                    j1 = 0;
                                }
                                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), k3);
                            }
                            k1 = ViewUtils.combineMeasuredStates(k1, ViewCompat.getMeasuredState(view1) & 0xff000000);
                            f -= f1;
                            j1 = j2;
                        }
                        if (flag)
                        {
                            mTotalLength = mTotalLength + (view1.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view1));
                        } else
                        {
                            j2 = mTotalLength;
                            mTotalLength = Math.max(j2, view1.getMeasuredWidth() + j2 + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view1));
                        }
                        if (i6 != 0x40000000 && layoutparams.height == -1)
                        {
                            j2 = 1;
                        } else
                        {
                            j2 = 0;
                        }
                        k4 = layoutparams.topMargin + layoutparams.bottomMargin;
                        k3 = view1.getMeasuredHeight() + k4;
                        k2 = Math.max(i1, k3);
                        if (j2 != 0)
                        {
                            i1 = k4;
                        } else
                        {
                            i1 = k3;
                        }
                        i1 = Math.max(l, i1);
                        if (k != 0 && layoutparams.height == -1)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        if (flag1)
                        {
                            j2 = view1.getBaseline();
                            if (j2 != -1)
                            {
                                if (layoutparams.gravity < 0)
                                {
                                    l = mGravity;
                                } else
                                {
                                    l = layoutparams.gravity;
                                }
                                l = ((l & 0x70) >> 4 & -2) >> 1;
                                ai[l] = Math.max(ai[l], j2);
                                ai1[l] = Math.max(ai1[l], k3 - j2);
                            }
                        }
                        l = k;
                        k = j1;
                        j1 = k2;
                    }
                } else
                {
                    j2 = j1;
                    j1 = i1;
                    i1 = l;
                    l = k;
                    k = j2;
                }
                j2 = l1 + 1;
                l1 = j1;
                j1 = k;
                k = l;
                l = i1;
                i1 = l1;
                l1 = j2;
            }
            mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
            if (ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
            {
                j1 = i1;
                if (ai[3] == -1)
                {
                    break label0;
                }
            }
            j1 = Math.max(i1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
        }
        i1 = k;
        k = k1;
        k1 = i1;
        i1 = l;
_L4:
        if (k1 != 0 || i6 == 0x40000000)
        {
            i1 = j1;
        }
        setMeasuredDimension(0xff000000 & k | i5, ViewCompat.resolveSizeAndState(Math.max(i1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j, k << 16));
        if (i2 != 0)
        {
            forceUniformHeight(l5, i);
        }
        return;
_L2:
        k1 = Math.max(l1, j2);
        if (flag2 && j6 != 0x40000000)
        {
            i1 = 0;
            do
            {
                if (i1 >= l5)
                {
                    break;
                }
                view = getVirtualChildAt(i1);
                if (view != null && view.getVisibility() != 8 && ((LayoutParams)view.getLayoutParams()).weight > 0.0F)
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
                }
                i1++;
            } while (true);
        }
        i1 = k1;
        j1 = k2;
        k1 = k;
        k = l;
        if (true) goto _L4; else goto _L3
_L3:
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
        int l5;
        int i6;
        int j6;
        int k6;
        boolean flag;
        mTotalLength = 0;
        l = 0;
        k = 0;
        l1 = 0;
        k2 = 0;
        i1 = 1;
        f = 0.0F;
        l5 = getVirtualChildCount();
        i6 = android.view.View.MeasureSpec.getMode(i);
        j6 = android.view.View.MeasureSpec.getMode(j);
        j2 = 0;
        k1 = 0;
        k6 = mBaselineAlignedChildIndex;
        flag = mUseLargestChild;
        j1 = 0x80000000;
        i2 = 0;
_L2:
        View view;
        if (i2 >= l5)
        {
            break MISSING_BLOCK_LABEL_732;
        }
        view = getVirtualChildAt(i2);
        if (view != null)
        {
            break; /* Loop/switch isn't completed */
        }
        mTotalLength = mTotalLength + measureNullChild(i2);
        int l2 = j1;
        int l3 = k1;
        k1 = l;
        j1 = k;
        l = l3;
        k = l2;
_L3:
        i2++;
        int i3 = j1;
        int i4 = k1;
        j1 = k;
        k1 = l;
        k = i3;
        l = i4;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (view.getVisibility() != 8)
            {
                break label0;
            }
            int j4 = i2 + getChildrenSkipCount(view, i2);
            i2 = j1;
            int j3 = k1;
            j1 = k;
            k1 = l;
            k = i2;
            l = j3;
            i2 = j4;
        }
          goto _L3
        LayoutParams layoutparams;
        if (hasDividerBeforeChildAt(i2))
        {
            mTotalLength = mTotalLength + mDividerHeight;
        }
        layoutparams = (LayoutParams)view.getLayoutParams();
        f += layoutparams.weight;
        if (j6 != 0x40000000 || layoutparams.height != 0 || layoutparams.weight <= 0.0F) goto _L5; else goto _L4
_L4:
        int k3;
        int k4;
        k1 = mTotalLength;
        mTotalLength = Math.max(k1, layoutparams.topMargin + k1 + layoutparams.bottomMargin);
        k4 = 1;
        k3 = j1;
_L7:
        if (k6 >= 0 && k6 == i2 + 1)
        {
            mBaselineChildTop = mTotalLength;
        }
        if (i2 < k6 && layoutparams.weight > 0.0F)
        {
            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        }
        break; /* Loop/switch isn't completed */
_L5:
        k4 = 0x80000000;
        k3 = k4;
        if (layoutparams.height == 0)
        {
            k3 = k4;
            if (layoutparams.weight > 0.0F)
            {
                k3 = 0;
                layoutparams.height = -2;
            }
        }
        int l4;
        if (f == 0.0F)
        {
            k4 = mTotalLength;
        } else
        {
            k4 = 0;
        }
        measureChildBeforeLayout(view, i2, i, 0, j, k4);
        if (k3 != 0x80000000)
        {
            layoutparams.height = k3;
        }
        l4 = view.getMeasuredHeight();
        k3 = mTotalLength;
        mTotalLength = Math.max(k3, k3 + l4 + layoutparams.topMargin + layoutparams.bottomMargin + getNextLocationOffset(view));
        k3 = j1;
        k4 = k1;
        if (flag)
        {
            k3 = Math.max(l4, j1);
            k4 = k1;
        }
        if (true) goto _L7; else goto _L6
_L6:
        k1 = 0;
        float f1;
        int i5;
        int j5;
        int k5;
        if (i6 != 0x40000000 && layoutparams.width == -1)
        {
            j1 = 1;
            k1 = 1;
        } else
        {
            j1 = j2;
        }
        j2 = layoutparams.leftMargin;
        j2 = layoutparams.rightMargin + j2;
        i5 = view.getMeasuredWidth() + j2;
        k5 = Math.max(l, i5);
        j5 = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(view));
        if (i1 != 0 && layoutparams.width == -1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (layoutparams.weight > 0.0F)
        {
            if (k1 == 0)
            {
                j2 = i5;
            }
            l = Math.max(k2, j2);
            k = l1;
        } else
        {
            if (k1 == 0)
            {
                j2 = i5;
            }
            k = Math.max(l1, j2);
            l = k2;
        }
        i2 += getChildrenSkipCount(view, i2);
        k2 = l;
        l1 = k;
        k1 = k5;
        k = k3;
        k3 = j5;
        j2 = j1;
        l = k4;
        j1 = k3;
          goto _L3
label1:
        {
            {
                if (mTotalLength > 0 && hasDividerBeforeChildAt(l5))
                {
                    mTotalLength = mTotalLength + mDividerHeight;
                }
                if (flag && (j6 == 0x80000000 || j6 == 0))
                {
                    mTotalLength = 0;
                    i2 = 0;
                    while (i2 < l5) 
                    {
                        view = getVirtualChildAt(i2);
                        if (view == null)
                        {
                            mTotalLength = mTotalLength + measureNullChild(i2);
                        } else
                        if (view.getVisibility() == 8)
                        {
                            i2 = getChildrenSkipCount(view, i2) + i2;
                        } else
                        {
                            layoutparams = (LayoutParams)view.getLayoutParams();
                            k3 = mTotalLength;
                            k4 = layoutparams.topMargin;
                            mTotalLength = Math.max(k3, layoutparams.bottomMargin + (k3 + j1 + k4) + getNextLocationOffset(view));
                        }
                        i2++;
                    }
                }
                mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
                k4 = ViewCompat.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumHeight()), j, 0);
                i2 = (0xffffff & k4) - mTotalLength;
                if (k1 == 0 && (i2 == 0 || f <= 0.0F))
                {
                    break label1;
                }
                if (mWeightSum > 0.0F)
                {
                    f = mWeightSum;
                }
                mTotalLength = 0;
                j1 = 0;
                k1 = i1;
                i1 = l1;
                l1 = i2;
                i2 = j1;
                j1 = l;
                l = k1;
                k1 = l1;
                while (i2 < l5) 
                {
                    view = getVirtualChildAt(i2);
                    if (view.getVisibility() == 8)
                    {
                        l1 = i1;
                        i1 = j1;
                        j1 = l1;
                    } else
                    {
                        layoutparams = (LayoutParams)view.getLayoutParams();
                        f1 = layoutparams.weight;
                        if (f1 > 0.0F)
                        {
                            k2 = (int)(((float)k1 * f1) / f);
                            i5 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width);
                            if (layoutparams.height != 0 || j6 != 0x40000000)
                            {
                                k3 = k2 + view.getMeasuredHeight();
                                l1 = k3;
                                if (k3 < 0)
                                {
                                    l1 = 0;
                                }
                                view.measure(i5, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
                            } else
                            {
                                if (k2 > 0)
                                {
                                    l1 = k2;
                                } else
                                {
                                    l1 = 0;
                                }
                                view.measure(i5, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
                            }
                            k = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(view) & 0xffffff00);
                            l1 = k1 - k2;
                            k1 = k;
                            f -= f1;
                            k = l1;
                        } else
                        {
                            l1 = k;
                            k = k1;
                            k1 = l1;
                        }
                        k2 = layoutparams.leftMargin + layoutparams.rightMargin;
                        k3 = view.getMeasuredWidth() + k2;
                        l1 = Math.max(j1, k3);
                        if (i6 != 0x40000000 && layoutparams.width == -1)
                        {
                            j1 = 1;
                        } else
                        {
                            j1 = 0;
                        }
                        if (j1 != 0)
                        {
                            j1 = k2;
                        } else
                        {
                            j1 = k3;
                        }
                        j1 = Math.max(i1, j1);
                        if (l != 0 && layoutparams.width == -1)
                        {
                            l = 1;
                        } else
                        {
                            l = 0;
                        }
                        i1 = mTotalLength;
                        k2 = view.getMeasuredHeight();
                        k3 = layoutparams.topMargin;
                        mTotalLength = Math.max(i1, layoutparams.bottomMargin + (k2 + i1 + k3) + getNextLocationOffset(view));
                        i1 = l1;
                        l1 = k;
                        k = k1;
                        k1 = l1;
                    }
                    i2++;
                    l1 = i1;
                    i1 = j1;
                    j1 = l1;
                }
                mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
                k1 = l;
                l = i1;
                i1 = k1;
            }
            if (i1 != 0 || i6 == 0x40000000)
            {
                l = j1;
            }
            setMeasuredDimension(ViewCompat.resolveSizeAndState(Math.max(l + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, k), k4);
            if (j2 != 0)
            {
                forceUniformWidth(l5, j);
            }
            return;
        }
        l1 = Math.max(l1, k2);
        if (flag && j6 != 0x40000000)
        {
            k1 = 0;
            do
            {
                if (k1 >= l5)
                {
                    break;
                }
                view = getVirtualChildAt(k1);
                if (view != null && view.getVisibility() != 8 && ((LayoutParams)view.getLayoutParams()).weight > 0.0F)
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
                }
                k1++;
            } while (true);
        }
        j1 = l1;
        k1 = l;
        l = j1;
        j1 = k1;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_1476;
        }
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

    public void setWeightSum(float f)
    {
        mWeightSum = Math.max(0.0F, f);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }
}
