// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.widget:
//            MetagameAvatarViewBase, LevelProgressViewHC

public final class MetagameAvatarView extends MetagameAvatarViewBase
{
    private static final class Measurements
    {

        public final int height;
        public final int imageSize;
        public final int outlineSize;
        public final int width;

        public Measurements(int i, int j, int k, int l)
        {
            outlineSize = Math.min(j - l, i);
            width = outlineSize;
            height = outlineSize + l;
            imageSize = outlineSize - k * 2;
        }
    }


    private float mAvatarElevation;
    private FrameLayout mLevelProgressContainer;
    private LevelProgressViewHC mLevelProgressView;
    private int mOutlineStrokeWidth;
    private View mOutlineView;
    private int mShadowStrokeWidth;

    public MetagameAvatarView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MetagameAvatarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        attributeset = getResources();
        mShadowStrokeWidth = attributeset.getDimensionPixelSize(0x7f0c010c);
        mOutlineStrokeWidth = attributeset.getDimensionPixelSize(0x7f0c0100);
        mAvatarElevation = -1F;
        GamesFragmentActivity.getGamesLayoutInflater(context).inflate(0x7f04009c, this, true);
        onContentsInflated();
    }

    public static int getAvatarLevel(SharedElementTransition sharedelementtransition)
    {
        sharedelementtransition = (Bundle)sharedelementtransition.mSharedViewInfo.getParcelable((new StringBuilder()).append("level").append(";bundle").toString());
        if (sharedelementtransition == null)
        {
            return 0;
        } else
        {
            return sharedelementtransition.getInt("level", 0);
        }
    }

    public final void addSharedViews(SharedElementTransition sharedelementtransition)
    {
        sharedelementtransition.addSharedLoadingImageView(mImageView, "avatar", mImageUri, 0x7f0200db);
        sharedelementtransition.addSharedTextView(mLevelView, "level");
        Bundle bundle = new Bundle();
        bundle.putInt("level", mLevel);
        sharedelementtransition.mSharedViewInfo.putParcelable((new StringBuilder()).append("level").append(";bundle").toString(), bundle);
    }

    public final LoadingImageView getImageView()
    {
        return mImageView;
    }

    public final TextView getLevelView()
    {
        return mLevelView;
    }

    public final void initSharedViews(SharedElementTransition sharedelementtransition)
    {
        setLevelData(getAvatarLevel(sharedelementtransition));
        sharedelementtransition.initSharedView(mImageView, "avatar");
        sharedelementtransition.initSharedView(mLevelView, "level");
    }

    protected final void onContentsInflated()
    {
        super.onContentsInflated();
        mOutlineView = findViewById(0x7f0d01f2);
        mLevelProgressView = null;
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        Measurements measurements = new Measurements(k - i, l - j, mOutlineStrokeWidth, mShadowStrokeWidth);
        i = (k - i) / 2;
        mCircleBounds.left = i - measurements.outlineSize / 2;
        mCircleBounds.top = 0;
        mCircleBounds.right = mCircleBounds.left + measurements.outlineSize;
        mCircleBounds.bottom = mCircleBounds.top + measurements.outlineSize;
        i = mCircleBounds.top;
        j = mShadowStrokeWidth;
        k = mCircleBounds.bottom;
        l = mShadowStrokeWidth;
        mOutlineView.layout(mCircleBounds.left, mCircleBounds.top, mCircleBounds.right, mCircleBounds.bottom);
        mShadowView.layout(mCircleBounds.left, i + j, mCircleBounds.right, k + l);
        if (mLevelProgressView != null)
        {
            mLevelProgressContainer.layout(mCircleBounds.left, mCircleBounds.top, mCircleBounds.right, mCircleBounds.bottom);
        }
        i = mCircleBounds.left + mOutlineStrokeWidth;
        j = mCircleBounds.top + mOutlineStrokeWidth;
        mImageView.layout(i, j, measurements.imageSize + i, measurements.imageSize + j);
        mLevelView.layout(mCircleBounds.right - mLevelView.getMeasuredWidth() - mLevelXOffset, mCircleBounds.bottom - mLevelView.getMeasuredHeight() - mLevelYOffset, mCircleBounds.right - mLevelXOffset, mCircleBounds.bottom - mLevelYOffset);
    }

    protected final void onMeasure(int i, int j)
    {
        int k;
        int l;
        super.onMeasure(i, j);
        l = getMeasuredWidth();
        k = getMeasuredHeight();
        if (i != 0) goto _L2; else goto _L1
_L1:
        i = k - mShadowStrokeWidth;
_L4:
        Measurements measurements = new Measurements(i, k, mOutlineStrokeWidth, mShadowStrokeWidth);
        setMeasuredDimension(measurements.width, measurements.height);
        i = android.view.View.MeasureSpec.makeMeasureSpec(measurements.outlineSize, 0x40000000);
        mShadowView.measure(i, i);
        mOutlineView.measure(i, i);
        if (mLevelProgressView != null)
        {
            mLevelProgressContainer.measure(i, i);
        }
        i = android.view.View.MeasureSpec.makeMeasureSpec(measurements.imageSize, 0x40000000);
        mImageView.measure(i, i);
        i = measurements.outlineSize;
        setLevelOffsets(i, ((float)(i - mOutlineStrokeWidth) * 0.5F) / (float)i);
        return;
_L2:
        i = l;
        if (j == 0)
        {
            k = l + mShadowStrokeWidth;
            i = l;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void setAvatarElevationResId(int i)
    {
        mAvatarElevation = getResources().getDimension(i);
        if (PlatformVersion.checkVersion(21))
        {
            if (mAvatarElevation > 0.0F)
            {
                mShadowView.setVisibility(4);
                mOutlineView.setElevation(mAvatarElevation);
                if (mLevelProgressContainer != null)
                {
                    mLevelProgressContainer.setElevation(mAvatarElevation);
                }
                mImageView.setElevation(mAvatarElevation);
                mLevelView.setElevation(mAvatarElevation);
                return;
            } else
            {
                mShadowView.setVisibility(0);
                mOutlineView.setElevation(0.0F);
                mImageView.setElevation(0.0F);
                return;
            }
        } else
        {
            mShadowView.setVisibility(0);
            return;
        }
    }

    public final void setLevelBackgroundColor(int i)
    {
        super.setLevelBackgroundColor(i);
        if (mLevelProgressView != null)
        {
            LevelProgressViewHC levelprogressviewhc = mLevelProgressView;
            levelprogressviewhc.mPaint.setColor(i);
            levelprogressviewhc.invalidate();
        }
    }

    public final void setOutlineStrokeWidth(int i)
    {
        if (i != mOutlineStrokeWidth)
        {
            mOutlineStrokeWidth = i;
            invalidate();
            if (mLevelProgressView != null)
            {
                mLevelProgressView.setStrokeWidth(mOutlineStrokeWidth);
            }
        }
    }

    public final void setOutlineStrokeWidthResId(int i)
    {
        setOutlineStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public final void setShadowStrokeWidth(int i)
    {
        if (i != mShadowStrokeWidth)
        {
            mShadowStrokeWidth = i;
            invalidate();
        }
    }

    public final void setShadowStrokeWidthResId(int i)
    {
        setShadowStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public final void setupLevelProgressView(PlayerLevelInfo playerlevelinfo)
    {
        if (PlatformVersion.checkVersion(11))
        {
            mLevelProgressContainer = (FrameLayout)findViewById(0x7f0d01f3);
            mLevelProgressView = new LevelProgressViewHC(getContext());
            mLevelProgressView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            mLevelProgressContainer.addView(mLevelProgressView);
            LevelProgressViewHC levelprogressviewhc = mLevelProgressView;
            PlayerLevel playerlevel = playerlevelinfo.mCurrentLevel;
            if (playerlevel != null)
            {
                levelprogressviewhc.mPaint = new Paint();
                levelprogressviewhc.mPaint.setAntiAlias(true);
                levelprogressviewhc.mPaint.setColor(UiUtils.getLevelColor(levelprogressviewhc.getResources(), playerlevel.mLevelNumber));
                levelprogressviewhc.mPaint.setStyle(android.graphics.Paint.Style.STROKE);
                levelprogressviewhc.mPaint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
                if (playerlevelinfo.mNextLevel != playerlevel)
                {
                    levelprogressviewhc.mLevelProgress = (float)(playerlevelinfo.mCurrentXpTotal - playerlevel.mMinXp) / (float)(playerlevel.mMaxXp - playerlevel.mMinXp);
                } else
                {
                    levelprogressviewhc.mLevelProgress = 1.0F;
                }
            }
            levelprogressviewhc.mAnimationValue = 0.0F;
            mLevelProgressView.setStrokeWidth(mOutlineStrokeWidth);
            if (PlatformVersion.checkVersion(21) && mAvatarElevation > 0.0F)
            {
                mLevelProgressContainer.setElevation(mAvatarElevation);
            }
        }
    }

    public final void startLevelProgressAnimation(long l, boolean flag)
    {
        if (mLevelProgressView != null)
        {
            LevelProgressViewHC levelprogressviewhc = mLevelProgressView;
            if (flag)
            {
                levelprogressviewhc.mLevelProgress = 1.0F;
            }
            ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            valueanimator.addUpdateListener(levelprogressviewhc);
            valueanimator.setDuration(l);
            (new Handler(Looper.getMainLooper())).post(new LevelProgressViewHC._cls1(levelprogressviewhc, valueanimator));
            levelprogressviewhc.setVisibility(0);
        }
    }
}
