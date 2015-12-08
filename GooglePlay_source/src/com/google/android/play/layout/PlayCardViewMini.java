// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.google.android.play.layout:
//            PlayCardViewBase, PlayCardThumbnail, PlayTextView, StarRatingBar, 
//            PlayCardLabelView

public class PlayCardViewMini extends PlayCardViewBase
{

    protected View mAdLabelContainer;
    private int mCurrTitleMaxLines;
    private final int mLabelThreshold;
    private final int mTextContentHeight;
    private int mVerticalOverlap;

    public PlayCardViewMini(Context context)
    {
        this(context, null);
    }

    public PlayCardViewMini(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.getResources();
        mTextContentHeight = context.getDimensionPixelSize(0x7f0c0306);
        mLabelThreshold = context.getDimensionPixelSize(0x7f0c0307);
        mCurrTitleMaxLines = 2;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mAdLabelContainer = findViewById(0x7f0d02f1);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        l = getPaddingLeft();
        int i1 = getPaddingRight();
        i = getPaddingTop();
        j = getPaddingBottom();
        int j1 = getWidth();
        k = getHeight();
        int k1 = mThumbnail.getMeasuredHeight();
        mThumbnail.layout(l, i, mThumbnail.getMeasuredWidth() + l, i + k1);
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)mTitle.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams2 = (android.view.ViewGroup.MarginLayoutParams)mSubtitle.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams3 = (android.view.ViewGroup.MarginLayoutParams)mRatingBar.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams4 = (android.view.ViewGroup.MarginLayoutParams)mLabel.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams5 = (android.view.ViewGroup.MarginLayoutParams)mOverflow.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams;
        int i2;
        int l2;
        int i3;
        if (mAdLabelContainer != null)
        {
            marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mAdLabelContainer.getLayoutParams();
        } else
        {
            marginlayoutparams = null;
        }
        if (mAdLabelContainer != null && mAdLabelContainer.getVisibility() != 8)
        {
            int l1 = (i + k1) - mThumbnail.getPaddingTop() - mAdLabelContainer.getMeasuredHeight();
            int k2 = mThumbnail.getPaddingLeft() + l + marginlayoutparams.leftMargin;
            mAdLabelContainer.layout(k2, l1, mAdLabelContainer.getMeasuredWidth() + k2, mAdLabelContainer.getMeasuredHeight() + l1);
        }
        i2 = (i + k1 + marginlayoutparams1.topMargin) - mVerticalOverlap;
        k1 = l + marginlayoutparams1.leftMargin;
        mTitle.layout(k1, i2, mTitle.getMeasuredWidth() + k1, mTitle.getMeasuredHeight() + i2);
        l2 = i2 + marginlayoutparams5.topMargin;
        i3 = j1 - i1 - marginlayoutparams5.rightMargin;
        mOverflow.layout(i3 - mOverflow.getMeasuredWidth(), l2, i3, mOverflow.getMeasuredHeight() + l2);
        l2 = (k - j - marginlayoutparams4.bottomMargin) + mVerticalOverlap;
        i3 = j1 - i1 - marginlayoutparams4.rightMargin;
        mLabel.layout(i3 - mLabel.getMeasuredWidth(), l2 - mLabel.getMeasuredHeight(), i3, l2);
        if (mSubtitle.getVisibility() != 8)
        {
            if (mTitle.getLineCount() == 1)
            {
                i2 = mTitle.getMeasuredHeight() + i2 + marginlayoutparams1.bottomMargin + marginlayoutparams2.topMargin;
                mSubtitle.layout(k1, i2, mSubtitle.getMeasuredWidth() + k1, mSubtitle.getMeasuredHeight() + i2);
            } else
            {
                int j2 = ((l2 - mLabel.getMeasuredHeight()) + mLabel.getBaseline()) - mSubtitle.getBaseline();
                mSubtitle.layout(k1, j2, mSubtitle.getMeasuredWidth() + k1, mSubtitle.getMeasuredHeight() + j2);
            }
        }
        if (mRatingBar.getVisibility() != 8)
        {
            k1 = (mLabel.getTop() + mLabel.getBaseline()) - mRatingBar.getBaseline();
            i2 = l + marginlayoutparams3.leftMargin;
            mRatingBar.layout(i2, k1, mRatingBar.getMeasuredWidth() + i2, mRatingBar.getMeasuredHeight() + k1);
        }
        i2 = mLoadingIndicator.getMeasuredWidth();
        k1 = mLoadingIndicator.getMeasuredHeight();
        l += (j1 - l - i1 - i2) / 2;
        i += (k - i - j - k1) / 2;
        mLoadingIndicator.layout(l, i, mLoadingIndicator.getMeasuredWidth() + l, mLoadingIndicator.getMeasuredHeight() + i);
        recomputeOverflowAreaIfNeeded();
    }

    protected void onMeasure(int i, int j)
    {
        measureThumbnailSpanningWidth(i);
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mThumbnail.getLayoutParams();
        int l = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        int k = marginlayoutparams.height + mTextContentHeight + getPaddingTop() + getPaddingBottom();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams1;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams2;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams3;
        int k1;
        int i2;
        if (l != 0x40000000 || j <= 0)
        {
            j = k;
        }
        l = android.view.View.MeasureSpec.getSize(i);
        mVerticalOverlap = Math.max(0, (k - j) / 3);
        k = l - getPaddingLeft() - getPaddingRight();
        i = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
        mThumbnail.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.height, 0x40000000));
        marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mTitle.getLayoutParams();
        marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)mSubtitle.getLayoutParams();
        marginlayoutparams2 = (android.view.ViewGroup.MarginLayoutParams)mRatingBar.getLayoutParams();
        marginlayoutparams3 = (android.view.ViewGroup.MarginLayoutParams)mLabel.getLayoutParams();
        if (mAdLabelContainer != null)
        {
            if (mAdLabel != null && mAdLabel.getVisibility() != 8)
            {
                mAdLabelContainer.setVisibility(0);
                i = mThumbnail.getPaddingLeft();
                int i1 = mThumbnail.getPaddingRight();
                mAdLabelContainer.measure(android.view.View.MeasureSpec.makeMeasureSpec(k - i - i1, 0x80000000), 0);
            } else
            {
                mAdLabelContainer.setVisibility(8);
            }
        }
        if (l >= mLabelThreshold)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && mLabel.getVisibility() != 8)
        {
            i = marginlayoutparams3.leftMargin;
            int j1 = marginlayoutparams3.rightMargin;
            mLabel.measure(android.view.View.MeasureSpec.makeMeasureSpec(k - i - j1, 0x80000000), 0);
        } else
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0x40000000);
            mLabel.measure(i, 0);
        }
        i = mLabel.getMeasuredWidth() + marginlayoutparams3.leftMargin + marginlayoutparams3.rightMargin;
        mOverflow.measure(0, 0);
        k1 = marginlayoutparams.leftMargin;
        i2 = marginlayoutparams.rightMargin;
        mTitle.measure(android.view.View.MeasureSpec.makeMeasureSpec(k - k1 - i2, 0x40000000), 0);
        if (mLoadingIndicator.getVisibility() != 0)
        {
            if (mSubtitle.getVisibility() != 0)
            {
                if (mRatingBar.getVisibility() == 0)
                {
                    mRatingBar.measure(0, 0);
                    int l1 = mRatingBar.getMeasuredWidth();
                    if (marginlayoutparams2.leftMargin + l1 + marginlayoutparams2.rightMargin + i > k)
                    {
                        i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0x40000000);
                        mRatingBar.measure(i, i);
                    }
                }
            } else
            {
                if (mTitle.getLineCount() == 1 || mLabel.getVisibility() != 0)
                {
                    i = k - marginlayoutparams1.leftMargin - marginlayoutparams1.rightMargin;
                } else
                {
                    i = k - marginlayoutparams1.leftMargin - i;
                }
                if ((double)i < 0.29999999999999999D * (double)k)
                {
                    mSubtitle.setVisibility(4);
                } else
                {
                    mSubtitle.setVisibility(0);
                    mSubtitle.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), 0);
                }
            }
        }
        mLoadingIndicator.measure(0, 0);
        setMeasuredDimension(l, j);
    }
}
