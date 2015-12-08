// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.internal.GamesLog;

public final class GamesDialogBuilder extends android.support.v7.app.AlertDialog.Builder
{

    private LoadingImageView mBannerImageView;
    private View mTitleContainer;
    private TextView mTitleTextView;

    public GamesDialogBuilder(Context context)
    {
        super(context, 0x7f1100a4);
        context = LayoutInflater.from(super.P.mContext).inflate(0x7f040076, null);
        mTitleContainer = context.findViewById(0x7f0d01a2);
        mTitleTextView = (TextView)context.findViewById(0x7f0d00bb);
        mBannerImageView = (LoadingImageView)context.findViewById(0x7f0d006a);
        super.setCustomTitle(context);
    }

    public final GamesDialogBuilder setBannerImage$2f921217()
    {
        mBannerImageView.setImageResource(0x7f02013a);
        mBannerImageView.setVisibility(0);
        return this;
    }

    public final GamesDialogBuilder setBannerImageAspectRatioAdjust$3479e5f3()
    {
        mBannerImageView.setImageAspectRatioAdjust(2, 3.310345F);
        return this;
    }

    public final volatile android.support.v7.app.AlertDialog.Builder setCustomTitle(View view)
    {
        GamesLog.w("GamesDialogBuilder", "GamesDialogBuilder uses a default title view and cannot be overridden.");
        return this;
    }

    public final volatile android.support.v7.app.AlertDialog.Builder setIcon(Drawable drawable)
    {
        GamesLog.w("GamesDialogBuilder", "GamesDialogBuilder uses a default icon and cannot be overridden.");
        return this;
    }

    public final volatile android.support.v7.app.AlertDialog.Builder setTitle(CharSequence charsequence)
    {
        return setTitle(charsequence);
    }

    public final GamesDialogBuilder setTitle(int i)
    {
        mTitleTextView.setText(i);
        mTitleContainer.setVisibility(0);
        return this;
    }

    public final GamesDialogBuilder setTitle(CharSequence charsequence)
    {
        mTitleTextView.setText(charsequence);
        mTitleContainer.setVisibility(0);
        return this;
    }
}
