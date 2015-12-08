// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.google.android.play.layout:
//            PlaySeparatorLayout

public class PlayCardSnippet extends PlaySeparatorLayout
{

    private final int mAvatarLargeSize;
    private final int mAvatarRegularSize;
    private int mAvatarSize;
    private int mMode;
    private ImageView mSnippetAvatar;
    private TextView mSnippetText;
    private final int mTextLargeSize;
    private final int mTextRegularSize;

    public PlayCardSnippet(Context context)
    {
        this(context, null);
    }

    public PlayCardSnippet(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.getResources();
        mAvatarRegularSize = context.getDimensionPixelSize(0x7f0c02cb);
        mAvatarLargeSize = context.getDimensionPixelSize(0x7f0c02ca);
        mTextRegularSize = context.getDimensionPixelSize(0x7f0c0337);
        mTextLargeSize = context.getDimensionPixelSize(0x7f0c0336);
        mMode = 0;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mSnippetText = (TextView)findViewById(0x7f0d0302);
        mSnippetAvatar = (ImageView)findViewById(0x7f0d0301);
        mAvatarSize = mAvatarRegularSize;
        mSnippetText.setTextSize(0, mTextRegularSize);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int j1 = getHeight();
        int k1 = getPaddingTop();
        i = mSnippetText.getMeasuredHeight();
        j = mSnippetText.getMeasuredWidth();
        if (mSnippetAvatar.getVisibility() == 8)
        {
            k = k1 + (j1 - i - k1) / 2;
            mSnippetText.layout(0, k, j + 0, k + i);
            return;
        }
        l = mSnippetAvatar.getMeasuredHeight();
        int i1 = mSnippetAvatar.getMeasuredWidth();
        k = i1 + 0 + ((android.view.ViewGroup.MarginLayoutParams)mSnippetAvatar.getLayoutParams()).rightMargin;
        if (l > i)
        {
            int l1 = k1 + (j1 - l - k1) / 2;
            mSnippetAvatar.layout(0, l1, i1 + 0, l1 + l);
            l = k1 + (j1 - i - k1) / 2;
            mSnippetText.layout(k, l, k + j, l + i);
            return;
        } else
        {
            j1 = k1 + (j1 - i - k1) / 2;
            mSnippetAvatar.layout(0, j1, i1 + 0, j1 + l);
            mSnippetText.layout(k, j1, k + j, j1 + i);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        j = android.view.View.MeasureSpec.getSize(i);
        int k = j - getPaddingLeft() - getPaddingRight();
        if (mSnippetAvatar.getVisibility() == 8)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = k + 0;
        } else
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mSnippetAvatar.getLayoutParams();
            i = android.view.View.MeasureSpec.makeMeasureSpec(mAvatarSize, 0x40000000);
            mSnippetAvatar.measure(i, i);
            i = k - (mAvatarSize + marginlayoutparams.rightMargin + 0);
        }
        mSnippetText.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), 0);
        i = Math.max(mAvatarSize, mSnippetText.getMeasuredHeight());
        setMeasuredDimension(j, getPaddingTop() + i + getPaddingBottom());
    }
}
