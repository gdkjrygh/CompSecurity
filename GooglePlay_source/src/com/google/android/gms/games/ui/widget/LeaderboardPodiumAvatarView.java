// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.widget:
//            MetagameAvatarViewBase, HexagonShape

public final class LeaderboardPodiumAvatarView extends MetagameAvatarViewBase
{

    private Drawable mFigLeavesDrawable;
    private float mFigLeavesRatio;
    private View mFigLeavesView;
    private int mFigPadding;
    private View mLevelOutlineView;
    private int mLevelShapeOutlineSize;
    public int mMaxSize;

    public LeaderboardPodiumAvatarView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LeaderboardPodiumAvatarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        attributeset = getResources();
        mLevelShapeOutlineSize = attributeset.getDimensionPixelSize(0x7f0c0103);
        mFigPadding = attributeset.getDimensionPixelSize(0x7f0c0101);
        GamesFragmentActivity.getGamesLayoutInflater(context).inflate(0x7f04008d, this, true);
        onContentsInflated();
    }

    protected final void onContentsInflated()
    {
        super.onContentsInflated();
        mImageView.setCircleCropEnabled(true);
        mFigLeavesView = findViewById(0x7f0d01c1);
        mLevelOutlineView = findViewById(0x7f0d01c2);
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = l - j;
        l = k - i;
        mCircleBounds.left = l / 2 - j / 2;
        mCircleBounds.top = 0;
        mCircleBounds.right = l / 2 + j / 2;
        mCircleBounds.bottom = j;
        mImageView.layout((l / 2 - j / 2) + mFigPadding, mFigPadding, (l / 2 + j / 2) - mFigPadding, j - mFigPadding);
        float f = (float)l / mFigLeavesRatio;
        mFigLeavesView.layout(l / 2 - j / 2, j - (int)f, l / 2 + j / 2, j);
        i = l - mLevelView.getMeasuredWidth() - mLevelXOffset;
        k = j - mLevelView.getMeasuredHeight() - mLevelYOffset;
        l -= mLevelXOffset;
        j -= mLevelYOffset;
        mLevelOutlineView.layout(i - mLevelShapeOutlineSize, k - mLevelShapeOutlineSize, mLevelShapeOutlineSize + l, mLevelShapeOutlineSize + j);
        mLevelView.layout(i, k, l, j);
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = Math.min(getMeasuredHeight(), mMaxSize);
        if (android.view.View.MeasureSpec.getMode(j) == 0)
        {
            i = Math.min(getMeasuredWidth(), mMaxSize);
            setMeasuredDimension(i, i);
        }
        j = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        int k = j - mFigPadding * 2;
        mImageView.measure(k, k);
        mFigLeavesView.measure(j, j);
        setLevelOffsets(i, ((float)(i - mFigPadding) * 0.5F) / (float)i);
        mLevelOutlineView.measure(0, 0);
    }

    public final void setData(Player player, int i)
    {
        mImageView.loadUri$3329f911(player.getHiResImageUri(), 0x7f0200db, true);
        int j = -1;
        player = player.getLevelInfo();
        if (player != null)
        {
            j = ((PlayerLevelInfo) (player)).mCurrentLevel.mLevelNumber;
        }
        setLevelData(j);
        mFigLeavesDrawable = getResources().getDrawable(i);
        float f = mFigLeavesDrawable.getIntrinsicHeight();
        mFigLeavesRatio = (float)mFigLeavesDrawable.getIntrinsicWidth() / f;
        if (PlatformVersion.checkVersion(16))
        {
            mFigLeavesView.setBackground(mFigLeavesDrawable);
            return;
        } else
        {
            mFigLeavesView.setBackgroundDrawable(mFigLeavesDrawable);
            return;
        }
    }

    protected final void setLevelData(int i)
    {
        if (i > 0)
        {
            mLevelView.setVisibility(0);
            mLevelView.setText(String.valueOf(i));
            ShapeDrawable shapedrawable = new ShapeDrawable(new HexagonShape());
            shapedrawable.getPaint().setColor(-1);
            ShapeDrawable shapedrawable1 = new ShapeDrawable(new HexagonShape());
            shapedrawable1.getPaint().setColor(UiUtils.getLevelColor(getResources(), i));
            if (PlatformVersion.checkVersion(16))
            {
                mLevelOutlineView.setBackground(shapedrawable);
                mLevelView.setBackground(shapedrawable1);
                return;
            } else
            {
                mLevelOutlineView.setBackgroundDrawable(shapedrawable);
                mLevelView.setBackgroundDrawable(shapedrawable1);
                return;
            }
        } else
        {
            mLevelOutlineView.setVisibility(8);
            mLevelView.setVisibility(8);
            return;
        }
    }
}
