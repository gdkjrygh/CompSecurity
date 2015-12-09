// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class PlayCardThumbnail extends FrameLayout
{

    private final int mAppThumbnailPadding;
    private final int mOriginalPaddingBottom;
    private final int mOriginalPaddingLeft;
    private final int mOriginalPaddingRight;
    private final int mOriginalPaddingTop;
    private ImageView mThumbnail;
    private final int mThumbnailId;

    public PlayCardThumbnail(Context context)
    {
        this(context, null);
    }

    public PlayCardThumbnail(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, com.google.android.play.R.styleable.PlayCardThumbnail);
        mThumbnailId = context.getResourceId(0, 0x7f0d02f6);
        mAppThumbnailPadding = context.getDimensionPixelSize(1, 0);
        context.recycle();
        mOriginalPaddingLeft = getPaddingLeft();
        mOriginalPaddingTop = getPaddingTop();
        mOriginalPaddingRight = getPaddingRight();
        mOriginalPaddingBottom = getPaddingBottom();
    }

    public int getBaseline()
    {
        return getPaddingTop() + mThumbnail.getMeasuredHeight();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mThumbnail = (ImageView)findViewById(mThumbnailId);
    }
}
