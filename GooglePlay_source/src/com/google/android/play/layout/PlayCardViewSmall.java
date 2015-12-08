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
//            PlayCardViewBase, PlayCardThumbnail, PlayTextView, PlayCardLabelView, 
//            PlayCardSnippet

public class PlayCardViewSmall extends PlayCardViewBase
{

    protected View mAdLabelContainer;
    private int mMode;
    protected View mRatingBadgeContainer;
    private final int mTextContentHeight;
    private int mVerticalBump;
    private final int mVerticalBumpLimit;

    public PlayCardViewSmall(Context context)
    {
        this(context, null);
    }

    public PlayCardViewSmall(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mMode = -1;
        context = context.getResources();
        mTextContentHeight = context.getDimensionPixelSize(0x7f0c0334);
        mVerticalBumpLimit = context.getDimensionPixelSize(0x7f0c02bb);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mRatingBadgeContainer = findViewById(0x7f0d02ff);
        mAdLabelContainer = findViewById(0x7f0d02f1);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int j1 = getPaddingLeft();
        int k1 = getPaddingRight();
        k = getPaddingTop();
        l = getPaddingBottom();
        int l1 = getWidth();
        int i1 = getHeight();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)mThumbnail.getLayoutParams();
        i = mThumbnail.getMeasuredHeight();
        mThumbnail.layout(marginlayoutparams1.leftMargin + j1, marginlayoutparams1.topMargin + k, marginlayoutparams1.leftMargin + j1 + mThumbnail.getMeasuredWidth(), marginlayoutparams1.topMargin + k + i);
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams2 = (android.view.ViewGroup.MarginLayoutParams)mTitle.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams3 = (android.view.ViewGroup.MarginLayoutParams)mSubtitle.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams4 = (android.view.ViewGroup.MarginLayoutParams)mRatingBadgeContainer.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams5 = (android.view.ViewGroup.MarginLayoutParams)mLabel.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams6;
        int j2;
        int k2;
        int i3;
        int j3;
        int k3;
        if (mOverflow != null)
        {
            marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mOverflow.getLayoutParams();
        } else
        {
            marginlayoutparams = null;
        }
        marginlayoutparams6 = (android.view.ViewGroup.MarginLayoutParams)mSnippet2.getLayoutParams();
        if (mAdLabelContainer != null && mAdLabelContainer.getVisibility() != 8)
        {
            j = (k + i) - mThumbnail.getPaddingTop() - mAdLabelContainer.getMeasuredHeight();
            int i2 = mThumbnail.getPaddingLeft() + j1 + marginlayoutparams1.leftMargin;
            mAdLabelContainer.layout(i2, j, mAdLabelContainer.getMeasuredWidth() + i2, mAdLabelContainer.getMeasuredHeight() + j);
        }
        j = k + i + marginlayoutparams2.topMargin + mVerticalBump;
        j2 = j1 + marginlayoutparams2.leftMargin;
        k2 = mTitle.getMeasuredHeight();
        mTitle.layout(j2, j, mTitle.getMeasuredWidth() + j2, j + k2);
        if (mOverflow != null && mOverflow.getVisibility() != 8)
        {
            i = j + marginlayoutparams.topMargin;
            int l2 = l1 - k1 - marginlayoutparams.rightMargin;
            mOverflow.layout(l2 - mOverflow.getMeasuredWidth(), i, l2, mOverflow.getMeasuredHeight() + i);
        }
        i3 = Math.max(mVerticalBump, 0);
        j3 = mLabel.getMeasuredHeight();
        if (mMode == 0)
        {
            i = i1 - l - marginlayoutparams5.bottomMargin - j3 - mVerticalBump;
        } else
        {
            i = mTitle.getBottom() + marginlayoutparams5.topMargin + i3;
        }
        k3 = l1 - k1 - marginlayoutparams5.rightMargin;
        mLabel.layout(k3 - mLabel.getMeasuredWidth(), i, k3, i + j3);
        if (mSubtitle.getVisibility() != 8)
        {
            if (mMode == 0)
            {
                j = j + k2 + marginlayoutparams2.bottomMargin + marginlayoutparams3.topMargin + i3;
            } else
            {
                j = (mLabel.getBaseline() + i) - mSubtitle.getBaseline();
            }
            mSubtitle.layout(j2, j, mSubtitle.getMeasuredWidth() + j2, mSubtitle.getMeasuredHeight() + j);
        }
        if (mRatingBadgeContainer.getVisibility() != 8)
        {
            i = (mLabel.getBaseline() + i) - mRatingBadgeContainer.getBaseline();
            j = j1 + marginlayoutparams4.leftMargin;
            mRatingBadgeContainer.layout(j, i, mRatingBadgeContainer.getMeasuredWidth() + j, mRatingBadgeContainer.getMeasuredHeight() + i);
        }
        if (mSnippet2.getVisibility() != 8)
        {
            i = i1 - l - marginlayoutparams6.bottomMargin - mVerticalBump;
            j = j1 + marginlayoutparams6.leftMargin;
            mSnippet2.layout(j, i - mSnippet2.getMeasuredHeight(), mSnippet2.getMeasuredWidth() + j, i);
        }
        j = mLoadingIndicator.getMeasuredWidth();
        i = mLoadingIndicator.getMeasuredHeight();
        j = j1 + (l1 - j1 - k1 - j) / 2;
        i = k + (i1 - k - l - i) / 2;
        mLoadingIndicator.layout(j, i, mLoadingIndicator.getMeasuredWidth() + j, mLoadingIndicator.getMeasuredHeight() + i);
        recomputeOverflowAreaIfNeeded();
    }

    protected void onMeasure(int i, int j)
    {
        measureThumbnailSpanningWidth(i);
        int l = android.view.View.MeasureSpec.getSize(i);
        i = getPaddingLeft();
        int k = getPaddingRight();
        int i1 = getPaddingTop();
        int j1 = getPaddingBottom();
        int k1 = l - i - k;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mThumbnail.getLayoutParams();
        i = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        k = marginlayoutparams.height;
        int l1 = Math.max(mTextContentHeight, k1 / 2);
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams1;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams2;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams3;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams4;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams5;
        if (i != 0x40000000 || j <= 0)
        {
            j = k + i1 + l1 + j1;
        }
        i = k1 - marginlayoutparams.leftMargin - marginlayoutparams.rightMargin;
        mThumbnail.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.height, 0x40000000));
        marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)mTitle.getLayoutParams();
        marginlayoutparams2 = (android.view.ViewGroup.MarginLayoutParams)mSubtitle.getLayoutParams();
        marginlayoutparams3 = (android.view.ViewGroup.MarginLayoutParams)mLabel.getLayoutParams();
        marginlayoutparams4 = (android.view.ViewGroup.MarginLayoutParams)mRatingBadgeContainer.getLayoutParams();
        marginlayoutparams5 = (android.view.ViewGroup.MarginLayoutParams)mSnippet2.getLayoutParams();
        if (mAdLabelContainer != null)
        {
            if (mAdLabel != null && mAdLabel.getVisibility() != 8)
            {
                mAdLabelContainer.setVisibility(0);
                k = mThumbnail.getPaddingLeft();
                l1 = mThumbnail.getPaddingRight();
                mAdLabelContainer.measure(android.view.View.MeasureSpec.makeMeasureSpec(i - k - l1, 0x80000000), 0);
            } else
            {
                mAdLabelContainer.setVisibility(8);
            }
        }
        i = marginlayoutparams3.leftMargin;
        k = marginlayoutparams3.rightMargin;
        mLabel.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 - i - k, 0x80000000), 0);
        i = mLabel.getMeasuredWidth() + marginlayoutparams3.leftMargin + marginlayoutparams3.rightMargin;
        if (mOverflow != null)
        {
            mOverflow.measure(0, 0);
        }
        k = marginlayoutparams1.leftMargin;
        l1 = marginlayoutparams1.rightMargin;
        mTitle.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 - k - l1, 0x40000000), 0);
        if (mLoadingIndicator.getVisibility() != 0)
        {
            k = Math.max(0, k1 - i - marginlayoutparams4.leftMargin - marginlayoutparams4.rightMargin);
            mRatingBadgeContainer.measure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x80000000), 0);
            if (mSubtitle.getVisibility() != 8)
            {
                if (mMode == 0)
                {
                    i = k1 - marginlayoutparams2.leftMargin - marginlayoutparams2.rightMargin;
                } else
                {
                    i = k1 - marginlayoutparams2.leftMargin - i;
                }
                k = i;
                if (i < 0)
                {
                    k = 0;
                }
                mSubtitle.measure(0, 0);
                if (mSubtitle.getMeasuredWidth() > k)
                {
                    mSubtitle.measure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), 0);
                }
            }
            if (mSnippet2.getVisibility() != 8)
            {
                i = marginlayoutparams5.leftMargin;
                k = marginlayoutparams5.rightMargin;
                mSnippet2.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 - i - k, 0x40000000), 0x40000000);
            }
            k = marginlayoutparams1.topMargin + mTitle.getMeasuredHeight() + marginlayoutparams1.bottomMargin + marginlayoutparams2.topMargin + mSubtitle.getMeasuredHeight() + marginlayoutparams2.bottomMargin;
            if (mMode == 0)
            {
                i = k + (marginlayoutparams3.topMargin + mLabel.getMeasuredHeight() + marginlayoutparams3.bottomMargin);
            } else
            {
                i = k;
                if (mSnippet2.getVisibility() != 8)
                {
                    i = k + (marginlayoutparams5.topMargin + mSnippet2.getMeasuredHeight() + marginlayoutparams5.bottomMargin);
                }
            }
            i = j - i1 - j1 - marginlayoutparams.height - i;
            if (i <= 0)
            {
                i /= 2;
            } else
            {
                i = Math.min(i / 4, mVerticalBumpLimit);
            }
            mVerticalBump = i;
        } else
        {
            mVerticalBump = 0;
        }
        mLoadingIndicator.measure(0, 0);
        setMeasuredDimension(l, j);
    }
}
