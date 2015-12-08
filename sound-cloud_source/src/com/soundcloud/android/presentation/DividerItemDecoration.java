// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class DividerItemDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration
{

    private Drawable divider;
    private int thickness;

    public DividerItemDecoration(Drawable drawable, int i)
    {
        divider = drawable;
        thickness = i;
    }

    private void drawHorizontal(Canvas canvas, RecyclerView recyclerview)
    {
        int j = recyclerview.getPaddingTop();
        int k = recyclerview.getHeight();
        int l = recyclerview.getPaddingBottom();
        int i1 = recyclerview.getChildCount();
        for (int i = 1; i < i1; i++)
        {
            View view = recyclerview.getChildAt(i);
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
            int j1 = thickness;
            int k1 = view.getLeft() - layoutparams.leftMargin;
            divider.setBounds(k1, j, k1 + j1, k - l);
            divider.draw(canvas);
        }

    }

    private void drawVertical(Canvas canvas, RecyclerView recyclerview)
    {
        int j = recyclerview.getPaddingLeft();
        int k = recyclerview.getWidth();
        int l = recyclerview.getPaddingRight();
        int i1 = recyclerview.getChildCount();
        int i = 0;
        while (i < i1) 
        {
            View view = recyclerview.getChildAt(i);
            int k1 = (int)view.getTranslationY();
            boolean flag;
            if (k1 != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (shouldRenderDivider(i, flag))
            {
                android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
                int j1 = thickness;
                k1 = (view.getTop() + k1) - layoutparams.topMargin;
                divider.setBounds(j, k1, k - l, k1 + j1);
                divider.draw(canvas);
            }
            i++;
        }
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

    private boolean shouldRenderDivider(int i, boolean flag)
    {
        return i > 0 || flag;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
    {
        if (divider == null)
        {
            super.onDrawOver(canvas, recyclerview, state);
            return;
        }
        if (getOrientation(recyclerview) == 1)
        {
            drawVertical(canvas, recyclerview);
            return;
        } else
        {
            drawHorizontal(canvas, recyclerview);
            return;
        }
    }
}
