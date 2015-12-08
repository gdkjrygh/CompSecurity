// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class GridDividerDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration
{

    private static final int ATTRS[] = {
        0x1010214
    };
    private Drawable mDivider;
    private int mInsets;

    public GridDividerDecoration(Context context)
    {
        TypedArray typedarray = context.obtainStyledAttributes(ATTRS);
        mDivider = typedarray.getDrawable(0);
        typedarray.recycle();
        mInsets = context.getResources().getDimensionPixelSize(0x7f09006f);
    }

    public void drawHorizontal(Canvas canvas, RecyclerView recyclerview)
    {
        int j = recyclerview.getPaddingTop();
        int k = recyclerview.getHeight();
        int l = recyclerview.getPaddingBottom();
        int i1 = recyclerview.getChildCount();
        for (int i = 0; i < i1; i++)
        {
            View view = recyclerview.getChildAt(i);
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
            int j1 = view.getRight() + layoutparams.rightMargin + mInsets;
            int k1 = mDivider.getIntrinsicWidth();
            mDivider.setBounds(j1, j, j1 + k1, k - l);
            mDivider.draw(canvas);
        }

    }

    public void drawVertical(Canvas canvas, RecyclerView recyclerview)
    {
        if (recyclerview.getChildCount() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k = recyclerview.getPaddingLeft();
        int l = recyclerview.getWidth();
        int i1 = recyclerview.getPaddingRight();
        View view = recyclerview.getChildAt(0);
        if (view.getHeight() != 0)
        {
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
            int j = view.getBottom() + layoutparams.bottomMargin + mInsets;
            int i = j + mDivider.getIntrinsicHeight();
            int j1 = recyclerview.getHeight();
            int k1 = recyclerview.getPaddingBottom();
            while (i < j1 - k1) 
            {
                mDivider.setBounds(k, j, l - i1, i);
                mDivider.draw(canvas);
                j += mInsets + layoutparams.topMargin + view.getHeight() + layoutparams.bottomMargin + mInsets;
                i = j + mDivider.getIntrinsicHeight();
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void getItemOffsets(Rect rect, int i, RecyclerView recyclerview)
    {
        rect.set(mInsets, mInsets, mInsets, mInsets);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
    {
    }

}
