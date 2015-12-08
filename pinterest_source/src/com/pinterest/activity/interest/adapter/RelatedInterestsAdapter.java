// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Interest;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.InterestGridCell;

public class RelatedInterestsAdapter extends PinterestBaseAdapter
{

    private int _cellSize;
    private int _margin;
    private int _sideMargin;

    public RelatedInterestsAdapter()
    {
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        _margin = (int)Resources.dimension(0x7f0a015f);
        _sideMargin = (int)Resources.dimension(0x7f0a015f);
        _cellSize = (int)Resources.dimension(0x7f0a01ee);
        Interest interest = (Interest)getItem(i);
        view = InterestGridCell.from(view, viewgroup.getContext());
        viewgroup = new android.widget.FrameLayout.LayoutParams(_cellSize, _cellSize);
        int j;
        if (i == 0)
        {
            j = _sideMargin;
        } else
        {
            j = 0;
        }
        if (i == getCount() - 1)
        {
            i = _sideMargin;
        } else
        {
            i = _margin;
        }
        viewgroup.setMargins(j, 0, i, 0);
        view.setWrapperLayoutParams(viewgroup);
        view.setLayoutParams(new org.lucasr.twowayview.TwoWayView.LayoutParams(-2, -2));
        view.setImageCornerRadius((int)Resources.dimension(0x7f0a00f5));
        view.setInterest(interest, Integer.valueOf(_cellSize), false);
        view.setForegroundVisibility(8);
        return view;
    }
}
