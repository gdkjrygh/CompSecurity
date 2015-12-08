// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

public class DividerItemDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration
{

    private Context mCtx;
    private Drawable mDivider;
    private boolean mHasHeader;
    private int mLeftMargin;

    public DividerItemDecoration(Context context, Drawable drawable)
    {
        mLeftMargin = 0;
        mHasHeader = false;
        mCtx = context;
        mDivider = drawable;
    }

    public DividerItemDecoration(Context context, Drawable drawable, boolean flag)
    {
        mLeftMargin = 0;
        mHasHeader = false;
        mCtx = context;
        mDivider = drawable;
        mHasHeader = flag;
    }

    public DividerItemDecoration(Context context, AttributeSet attributeset)
    {
        mLeftMargin = 0;
        mHasHeader = false;
        attributeset = context.obtainStyledAttributes(attributeset, new int[] {
            0x1010214
        });
        mDivider = attributeset.getDrawable(0);
        attributeset.recycle();
        mCtx = context;
    }

    private int getOrientation(RecyclerView recyclerview)
    {
        if (recyclerview.getLayoutManager() instanceof LinearLayoutManager)
        {
            return ((LinearLayoutManager)recyclerview.getLayoutManager()).getOrientation();
        } else
        {
            throw new IllegalStateException("DividerItemDecoration can only be used with a LinearLayoutManager.");
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
    {
        super.getItemOffsets(rect, view, recyclerview, state);
        while (mDivider == null || recyclerview.getChildAdapterPosition(view) <= 0 || !isDecorated(view, recyclerview)) 
        {
            return;
        }
        if (getOrientation(recyclerview) == 1)
        {
            rect.top = mDivider.getIntrinsicHeight();
            return;
        } else
        {
            rect.left = mDivider.getIntrinsicWidth();
            return;
        }
    }

    public boolean isDecorated(View view, RecyclerView recyclerview)
    {
        while (!mHasHeader || recyclerview.getChildAdapterPosition(view) >= 2) 
        {
            return true;
        }
        return false;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
    {
        if (mDivider != null) goto _L2; else goto _L1
_L1:
        super.onDrawOver(canvas, recyclerview, state);
_L4:
        return;
_L2:
        if (getOrientation(recyclerview) != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = recyclerview.getPaddingLeft();
        int i1 = recyclerview.getWidth();
        int k1 = recyclerview.getPaddingRight();
        int i2 = recyclerview.getChildCount();
        int i = 1;
        while (i < i2) 
        {
            state = recyclerview.getChildAt(i);
            if (isDecorated(state, recyclerview))
            {
                android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)state.getLayoutParams();
                int k2 = mDivider.getIntrinsicHeight();
                int i3 = state.getTop() - layoutparams.topMargin;
                mDivider.setBounds(mLeftMargin + k, i3, i1 - k1, i3 + k2);
                mDivider.draw(canvas);
            }
            i++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        int l = recyclerview.getPaddingTop();
        int j1 = recyclerview.getHeight();
        int l1 = recyclerview.getPaddingBottom();
        int j2 = recyclerview.getChildCount();
        int j = 1;
        while (j < j2) 
        {
            state = recyclerview.getChildAt(j);
            if (isDecorated(state, recyclerview))
            {
                android.support.v7.widget.RecyclerView.LayoutParams layoutparams1 = (android.support.v7.widget.RecyclerView.LayoutParams)state.getLayoutParams();
                int l2 = mDivider.getIntrinsicWidth();
                int j3 = state.getLeft() - layoutparams1.leftMargin;
                mDivider.setBounds(j3, l, j3 + l2, j1 - l1);
                mDivider.draw(canvas);
            }
            j++;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void setLeftMargin(int i)
    {
        mLeftMargin = mCtx.getResources().getDimensionPixelSize(i);
    }
}
