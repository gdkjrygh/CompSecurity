// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{
    public static interface OnAttachListener
    {

        public abstract void onAttachedFromWindow();

        public abstract void onDetachedFromWindow();
    }


    private OnAttachListener mAttachListener;
    private final Rect mDecorPadding;
    private TypedValue mFixedHeightMajor;
    private TypedValue mFixedHeightMinor;
    private TypedValue mFixedWidthMajor;
    private TypedValue mFixedWidthMinor;
    private TypedValue mMinWidthMajor;
    private TypedValue mMinWidthMinor;

    public ContentFrameLayout(Context context)
    {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mDecorPadding = new Rect();
    }

    public void dispatchFitSystemWindows(Rect rect)
    {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor()
    {
        if (mFixedHeightMajor == null)
        {
            mFixedHeightMajor = new TypedValue();
        }
        return mFixedHeightMajor;
    }

    public TypedValue getFixedHeightMinor()
    {
        if (mFixedHeightMinor == null)
        {
            mFixedHeightMinor = new TypedValue();
        }
        return mFixedHeightMinor;
    }

    public TypedValue getFixedWidthMajor()
    {
        if (mFixedWidthMajor == null)
        {
            mFixedWidthMajor = new TypedValue();
        }
        return mFixedWidthMajor;
    }

    public TypedValue getFixedWidthMinor()
    {
        if (mFixedWidthMinor == null)
        {
            mFixedWidthMinor = new TypedValue();
        }
        return mFixedWidthMinor;
    }

    public TypedValue getMinWidthMajor()
    {
        if (mMinWidthMajor == null)
        {
            mMinWidthMajor = new TypedValue();
        }
        return mMinWidthMajor;
    }

    public TypedValue getMinWidthMinor()
    {
        if (mMinWidthMinor == null)
        {
            mMinWidthMinor = new TypedValue();
        }
        return mMinWidthMinor;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (mAttachListener != null)
        {
            mAttachListener.onAttachedFromWindow();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mAttachListener != null)
        {
            mAttachListener.onDetachedFromWindow();
        }
    }

    protected void onMeasure(int i, int j)
    {
        TypedValue typedvalue;
        DisplayMetrics displaymetrics;
        int k;
        boolean flag1;
        int l;
        boolean flag2;
        flag2 = false;
        displaymetrics = getContext().getResources().getDisplayMetrics();
        boolean flag;
        int i1;
        int j1;
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = android.view.View.MeasureSpec.getMode(i);
        j1 = android.view.View.MeasureSpec.getMode(j);
        if (i1 != 0x80000000) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            typedvalue = mFixedWidthMinor;
        } else
        {
            typedvalue = mFixedWidthMajor;
        }
        if (typedvalue == null || typedvalue.type == 0) goto _L2; else goto _L3
_L3:
        if (typedvalue.type == 5)
        {
            k = (int)typedvalue.getDimension(displaymetrics);
        } else
        if (typedvalue.type == 6)
        {
            k = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
        } else
        {
            k = 0;
        }
        if (k <= 0) goto _L2; else goto _L4
_L4:
        l = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k - (mDecorPadding.left + mDecorPadding.right), android.view.View.MeasureSpec.getSize(i)), 0x40000000);
        flag1 = true;
_L11:
        k = j;
        if (j1 == 0x80000000)
        {
            if (flag)
            {
                typedvalue = mFixedHeightMajor;
            } else
            {
                typedvalue = mFixedHeightMinor;
            }
            k = j;
            if (typedvalue != null)
            {
                k = j;
                if (typedvalue.type != 0)
                {
                    if (typedvalue.type == 5)
                    {
                        i = (int)typedvalue.getDimension(displaymetrics);
                    } else
                    if (typedvalue.type == 6)
                    {
                        i = (int)typedvalue.getFraction(displaymetrics.heightPixels, displaymetrics.heightPixels);
                    } else
                    {
                        i = 0;
                    }
                    k = j;
                    if (i > 0)
                    {
                        k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(i - (mDecorPadding.top + mDecorPadding.bottom), android.view.View.MeasureSpec.getSize(j)), 0x40000000);
                    }
                }
            }
        }
        super.onMeasure(l, k);
        j1 = getMeasuredWidth();
        l = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
        if (flag1 || i1 != 0x80000000) goto _L6; else goto _L5
_L5:
        if (flag)
        {
            typedvalue = mMinWidthMinor;
        } else
        {
            typedvalue = mMinWidthMajor;
        }
        if (typedvalue == null || typedvalue.type == 0) goto _L6; else goto _L7
_L7:
        if (typedvalue.type == 5)
        {
            i = (int)typedvalue.getDimension(displaymetrics);
        } else
        if (typedvalue.type == 6)
        {
            i = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
        } else
        {
            i = 0;
        }
        j = i;
        if (i > 0)
        {
            j = i - (mDecorPadding.left + mDecorPadding.right);
        }
        if (j1 >= j) goto _L6; else goto _L8
_L8:
        i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
        j = 1;
_L9:
        if (j != 0)
        {
            super.onMeasure(i, k);
        }
        return;
_L6:
        i = l;
        j = ((flag2) ? 1 : 0);
        if (true) goto _L9; else goto _L2
_L2:
        flag1 = false;
        l = i;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void setAttachListener(OnAttachListener onattachlistener)
    {
        mAttachListener = onattachlistener;
    }

    public void setDecorPadding(int i, int j, int k, int l)
    {
        mDecorPadding.set(i, j, k, l);
        if (ViewCompat.isLaidOut(this))
        {
            requestLayout();
        }
    }
}
