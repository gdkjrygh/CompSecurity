// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.emilsjolander.components.stickylistheaders;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

class WrapperView extends ViewGroup
{

    Drawable mDivider;
    int mDividerHeight;
    View mHeader;
    View mItem;
    int mItemTop;

    public WrapperView(Context context)
    {
        super(context);
    }

    private void update(View view, View view1, Drawable drawable, int i)
    {
        if (view == null)
        {
            throw new NullPointerException("List view item must not be null.");
        }
        if (mItem != view)
        {
            removeView(mItem);
            mItem = view;
            android.view.ViewParent viewparent = view.getParent();
            if (viewparent != null && viewparent != this && (viewparent instanceof ViewGroup))
            {
                ((ViewGroup)viewparent).removeView(view);
            }
            addView(view);
        }
        if (mHeader != view1)
        {
            if (mHeader != null)
            {
                removeView(mHeader);
            }
            mHeader = view1;
            if (view1 != null)
            {
                addView(view1);
            }
        }
        if (mDivider != drawable)
        {
            mDivider = drawable;
            mDividerHeight = i;
            invalidate();
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (mHeader == null && mDivider != null)
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                canvas.clipRect(0, 0, getWidth(), mDividerHeight);
            }
            mDivider.draw(canvas);
        }
    }

    final boolean hasHeader()
    {
        return mHeader != null;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        i = getWidth();
        j = getHeight();
        if (mHeader != null)
        {
            k = mHeader.getMeasuredHeight();
            mHeader.layout(0, 0, i, k);
            mItemTop = k;
            mItem.layout(0, k, i, j);
            return;
        }
        if (mDivider != null)
        {
            mDivider.setBounds(0, 0, i, mDividerHeight);
            mItemTop = mDividerHeight;
            mItem.layout(0, mDividerHeight, i, j);
            return;
        } else
        {
            mItemTop = 0;
            mItem.layout(0, 0, i, j);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        j = android.view.View.MeasureSpec.getSize(i);
        int k = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
        if (mHeader != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = mHeader.getLayoutParams();
            if (layoutparams != null && layoutparams.height > 0)
            {
                mHeader.measure(k, android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000));
            } else
            {
                mHeader.measure(k, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            i = mHeader.getMeasuredHeight() + 0;
        } else
        if (mDivider != null)
        {
            i = mDividerHeight + 0;
        } else
        {
            i = 0;
        }
        layoutparams = mItem.getLayoutParams();
        if (layoutparams != null && layoutparams.height > 0)
        {
            mItem.measure(k, android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000));
        } else
        {
            mItem.measure(k, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(j, i + mItem.getMeasuredHeight());
    }
}
