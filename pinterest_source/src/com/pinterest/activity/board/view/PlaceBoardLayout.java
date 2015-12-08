// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.view.MapViewGroup;

public class PlaceBoardLayout extends MapViewGroup
{

    private View _headerVw;
    private boolean _useLibraryStyle;

    public PlaceBoardLayout(Context context)
    {
        this(context, null, 0);
    }

    public PlaceBoardLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlaceBoardLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void animateTopMargin()
    {
        final int targetMargin = getDefaultPinGridTopPosition();
        final android.widget.LinearLayout.LayoutParams lp = (android.widget.LinearLayout.LayoutParams)_headerVw.getLayoutParams();
        final int currentTopMargin = lp.topMargin;
        if (currentTopMargin != targetMargin)
        {
            lp = new _cls1();
            lp.setDuration(300L);
            _headerVw.startAnimation(lp);
        }
    }

    private int getDefaultPinGridTopPosition()
    {
        if (isMapShown())
        {
            return (int)(0.25D * (double)getVerticalDragRange());
        } else
        {
            return 0;
        }
    }

    protected int calculateVerticalDragRange()
    {
        int j = getHeight() - _headerVw.getBottom() - _gridVw.getPaddingTop();
        int i = j;
        if (_useLibraryStyle)
        {
            i = j + getResources().getDimensionPixelSize(0x7f0a0147);
        }
        return i;
    }

    protected int getViewBottomBound()
    {
        return getHeight() - _headerVw.getHeight() - _headerVw.getPaddingBottom();
    }

    protected boolean isUserTouchingMap(float f)
    {
        return f < (float)(_gridVw.getTop() + _gridVw.getPaddingTop() + _headerVw.getTop()) && _gridVw.getScrollY() < _gridVw.getTop() + _headerVw.getTop();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        _headerVw = _gridVw.findViewById(0x7f0f0090);
        if (Experiments.x())
        {
            _useLibraryStyle = true;
        }
    }

    protected void onMapVisibilityChanged()
    {
        if (!_useLibraryStyle)
        {
            animateTopMargin();
        }
        super.onMapVisibilityChanged();
    }

    protected boolean shouldLayout()
    {
        if (_headerVw == null)
        {
            _headerVw = _gridVw.findViewById(0x7f0f0090);
        }
        return super.shouldLayout() && _headerVw != null;
    }


    private class _cls1 extends Animation
    {

        final PlaceBoardLayout this$0;
        final int val$currentTopMargin;
        final android.widget.LinearLayout.LayoutParams val$lp;
        final int val$targetMargin;

        protected void applyTransformation(float f, Transformation transformation)
        {
            int i = targetMargin;
            int j = currentTopMargin;
            transformation = lp;
            float f1 = currentTopMargin;
            transformation.topMargin = (int)((float)(i - j) * f + f1);
            _headerVw.setLayoutParams(lp);
        }

        _cls1()
        {
            this$0 = PlaceBoardLayout.this;
            targetMargin = i;
            currentTopMargin = j;
            lp = layoutparams;
            super();
        }
    }

}
