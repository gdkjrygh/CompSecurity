// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.ui.transition.SharedElementTransition;

// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxBaseCardView

public final class OnyxMediumCardView extends OnyxBaseCardView
    implements OnyxCardViewDefinition.HasBannerImage, OnyxCardViewDefinition.HasImagePadding, OnyxCardViewDefinition.HasPrimaryAction
{

    private OnyxCardViewDefinition.BannerImageClickListener mBannerImageClickListener;
    private FrameLayout mImageContainerView;
    private Drawable mPrimaryActionBackground;
    private OnyxCardViewDefinition.PrimaryActionClickListener mPrimaryActionClickListener;
    private Button mPrimaryActionView;

    public OnyxMediumCardView(Context context)
    {
        super(context);
    }

    public OnyxMediumCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public OnyxMediumCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void addBannerImageSharedViews(SharedElementTransition sharedelementtransition)
    {
        sharedelementtransition.addSharedLoadingImageView(mImageView, "banner", mImageUri, mImageDefaultResId);
    }

    public final void clearData()
    {
        super.clearData();
        setPrimaryActionClickable(true);
    }

    public final void onClick(View view)
    {
        if (view == mPrimaryActionView)
        {
            trackLogflowClick(view);
            mPrimaryActionClickListener.onPrimaryActionClicked();
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        mImageContainerView = (FrameLayout)findViewById(0x7f0d0070);
        mPrimaryActionView = (Button)findViewById(0x7f0d020e);
        mPrimaryActionView.setOnClickListener(this);
        mPrimaryActionBackground = mPrimaryActionView.getBackground();
    }

    public final void setBannerImageClickListener(OnyxCardViewDefinition.BannerImageClickListener bannerimageclicklistener)
    {
        mBannerImageClickListener = bannerimageclicklistener;
    }

    public final void setImagePaddingEnabled(boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams = mImageContainerView.getLayoutParams();
        Resources resources = getResources();
        if (flag)
        {
            int i = resources.getDimensionPixelSize(0x7f0c014c);
            mImageContainerView.setPadding(i, i, 0, i);
            layoutparams.width = resources.getDimensionPixelSize(0x7f0c014b) + i;
            layoutparams.height = resources.getDimensionPixelSize(0x7f0c014b) + i * 2;
        } else
        {
            mImageContainerView.setPadding(0, 0, 0, 0);
            int j = resources.getDimensionPixelSize(0x7f0c014b);
            layoutparams.height = j;
            layoutparams.width = j;
        }
        mImageContainerView.setLayoutParams(layoutparams);
    }

    public final void setPrimaryAction(int i)
    {
        mPrimaryActionView.setText(i);
    }

    public final void setPrimaryActionClickListener(OnyxCardViewDefinition.PrimaryActionClickListener primaryactionclicklistener)
    {
        mPrimaryActionClickListener = primaryactionclicklistener;
        primaryactionclicklistener.attachUiNodeToView(mPrimaryActionView, 201);
    }

    public final void setPrimaryActionClickable(boolean flag)
    {
        mPrimaryActionView.setClickable(flag);
        Drawable drawable;
        if (flag)
        {
            drawable = mPrimaryActionBackground;
        } else
        {
            drawable = null;
        }
        if (PlatformVersion.checkVersion(16))
        {
            mPrimaryActionView.setBackground(drawable);
            return;
        } else
        {
            mPrimaryActionView.setBackgroundDrawable(drawable);
            return;
        }
    }

    public final void setPrimaryActionContentDescription(int i)
    {
        String s = getContext().getString(i);
        mPrimaryActionView.setContentDescription(s);
    }
}
