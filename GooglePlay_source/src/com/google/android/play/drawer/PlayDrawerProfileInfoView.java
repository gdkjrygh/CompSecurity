// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.drawer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.play.image.FifeImageView;

class PlayDrawerProfileInfoView extends FrameLayout
    implements android.view.View.OnClickListener, com.google.android.play.image.FifeImageView.OnLoadedListener
{

    private View mAccountInfoContainer;
    private TextView mAccountName;
    private TextView mDisplayName;
    private FifeImageView mProfileAvatarImage;
    private FifeImageView mProfileCoverImage;
    private View mSecondaryAvatarImageFrameLeft;
    private View mSecondaryAvatarImageFrameRight;
    private FifeImageView mSecondaryAvatarImageLeft;
    private FifeImageView mSecondaryAvatarImageRight;
    private ImageView mToggleAccountListButton;

    public PlayDrawerProfileInfoView(Context context)
    {
        this(context, null);
    }

    public PlayDrawerProfileInfoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    public void onClick(View view)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mProfileCoverImage = (FifeImageView)findViewById(0x7f0d030a);
        mProfileAvatarImage = (FifeImageView)findViewById(0x7f0d0069);
        mSecondaryAvatarImageFrameLeft = findViewById(0x7f0d030b);
        mSecondaryAvatarImageLeft = (FifeImageView)findViewById(0x7f0d030c);
        mSecondaryAvatarImageFrameRight = findViewById(0x7f0d030d);
        mSecondaryAvatarImageRight = (FifeImageView)findViewById(0x7f0d030e);
        mDisplayName = (TextView)findViewById(0x7f0d0310);
        mAccountName = (TextView)findViewById(0x7f0d00ee);
        mToggleAccountListButton = (ImageView)findViewById(0x7f0d0311);
        mAccountInfoContainer = findViewById(0x7f0d030f);
        mProfileAvatarImage.setOnClickListener(this);
        mSecondaryAvatarImageFrameLeft.setOnClickListener(this);
        mSecondaryAvatarImageLeft.setDuplicateParentStateEnabled(true);
        mSecondaryAvatarImageFrameRight.setOnClickListener(this);
        mSecondaryAvatarImageRight.setDuplicateParentStateEnabled(true);
    }

    public final void onLoaded$3adf1739()
    {
    }

    public final void onLoadedAndFadedIn$3ef8e495()
    {
        setBackgroundDrawable(null);
    }
}
