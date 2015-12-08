// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.timehop.stickyheadersrecyclerview.rendering;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.timehop.stickyheadersrecyclerview.calculation.DimensionCalculator;
import com.timehop.stickyheadersrecyclerview.util.OrientationProvider;

public class HeaderRenderer
{

    private final DimensionCalculator mDimensionCalculator;
    private final OrientationProvider mOrientationProvider;

    public HeaderRenderer(OrientationProvider orientationprovider)
    {
        this(orientationprovider, new DimensionCalculator());
    }

    private HeaderRenderer(OrientationProvider orientationprovider, DimensionCalculator dimensioncalculator)
    {
        mOrientationProvider = orientationprovider;
        mDimensionCalculator = dimensioncalculator;
    }

    private Rect getClipRectForHeader(RecyclerView recyclerview, View view)
    {
        view = mDimensionCalculator.getMargins(view);
        if (mOrientationProvider.getOrientation(recyclerview) == 1)
        {
            return new Rect(recyclerview.getPaddingLeft(), recyclerview.getPaddingTop(), recyclerview.getWidth() - recyclerview.getPaddingRight() - ((Rect) (view)).right, recyclerview.getHeight() - recyclerview.getPaddingBottom());
        } else
        {
            return new Rect(recyclerview.getPaddingLeft(), recyclerview.getPaddingTop(), recyclerview.getWidth() - recyclerview.getPaddingRight(), recyclerview.getHeight() - recyclerview.getPaddingBottom() - ((Rect) (view)).bottom);
        }
    }

    public void drawHeader(RecyclerView recyclerview, Canvas canvas, View view, Rect rect)
    {
        canvas.save();
        if (recyclerview.getLayoutManager().getClipToPadding())
        {
            canvas.clipRect(getClipRectForHeader(recyclerview, view));
        }
        canvas.translate(rect.left, rect.top);
        view.draw(canvas);
        canvas.restore();
    }
}
