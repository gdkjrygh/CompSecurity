// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.board;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import butterknife.ButterKnife;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.ui.imageview.NonRoundWebImageView;

public class BoardCropCoverView extends FrameLayout
{

    private static final float COVER_RATIO = 0.667F;
    private String _apiTag;
    private int _coverHeight;
    private int _coverWidth;
    HorizontalScrollView _horizontalScrollView;
    NonRoundWebImageView _imageView;
    View _maskBottom;
    View _maskTop;
    ScrollView _scrollView;
    View _spacerBottom;
    View _spacerTop;

    public BoardCropCoverView(Context context)
    {
        this(context, null);
    }

    public BoardCropCoverView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BoardCropCoverView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f0301bf, this);
        ButterKnife.a(this);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        i = _scrollView.getMeasuredHeight();
        j = _scrollView.getChildAt(0).getMeasuredHeight();
        _scrollView.scrollTo(0, (j - i) / 2);
        i = _horizontalScrollView.getMeasuredWidth();
        j = _horizontalScrollView.getChildAt(0).getMeasuredWidth();
        _horizontalScrollView.scrollTo((j - i) / 2, 0);
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        int i1 = getPaddingTop();
        _coverWidth = k;
        _coverHeight = (int)((float)_coverWidth * 0.667F);
        k = (l - i1 - _coverHeight) / 2;
        _maskTop.getLayoutParams().height = k;
        _maskBottom.getLayoutParams().height = k;
        _spacerTop.getLayoutParams().height = k;
        _spacerBottom.getLayoutParams().height = k;
        Drawable drawable = _imageView.getDrawable();
        if (drawable != null)
        {
            float f = (float)drawable.getIntrinsicHeight() / (float)drawable.getIntrinsicWidth();
            if (f >= 0.667F)
            {
                _imageView.getLayoutParams().height = (int)(f * (float)_coverWidth);
            } else
            {
                _imageView.getLayoutParams().height = _coverHeight;
            }
        }
        super.onMeasure(i, j);
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setImageUrl(String s)
    {
        _imageView.loadUrl(s);
    }

    public void submit(String s, String s1, ApiResponseHandler apiresponsehandler)
    {
        BoardApi.a(s, s1, (float)_imageView.getMeasuredHeight() / (float)_imageView.getDrawable().getIntrinsicHeight(), _horizontalScrollView.getScrollX(), _scrollView.getScrollY(), _coverWidth, _coverHeight, apiresponsehandler, _apiTag);
    }
}
