// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls.recycleview;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class HorizontalDividerDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration
{

    private Drawable dividerDrawable;

    public HorizontalDividerDecoration(Drawable drawable)
    {
        dividerDrawable = drawable;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
    {
        int j = recyclerview.getPaddingLeft();
        int k = recyclerview.getWidth();
        int l = recyclerview.getPaddingRight();
        int i1 = recyclerview.getChildCount();
        for (int i = 0; i < i1 - 1; i++)
        {
            state = recyclerview.getChildAt(i);
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)state.getLayoutParams();
            int j1 = state.getBottom();
            j1 = layoutparams.bottomMargin + j1;
            int k1 = dividerDrawable.getIntrinsicHeight();
            dividerDrawable.setBounds(j, j1, k - l, k1 + j1);
            dividerDrawable.draw(canvas);
        }

    }
}
