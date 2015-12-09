// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public final class PlayerDetailXpPerGenreAdapter extends SingleItemRecyclerAdapter
{
    public static class PlayerXpData
        implements Parcelable, Comparable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new PlayerXpData(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new PlayerXpData[i];
            }

        };
        final String categoryName;
        final long myXp;

        public int compareTo(PlayerXpData playerxpdata)
        {
            if (myXp > playerxpdata.myXp)
            {
                return -1;
            }
            if (myXp < playerxpdata.myXp)
            {
                return 1;
            } else
            {
                return categoryName.compareTo(playerxpdata.categoryName);
            }
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((PlayerXpData)obj);
        }

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof PlayerXpData)
            {
                if (this == obj)
                {
                    return true;
                }
                obj = (PlayerXpData)obj;
                if (Objects.equal(Long.valueOf(((PlayerXpData) (obj)).myXp), Long.valueOf(myXp)) && Objects.equal(((PlayerXpData) (obj)).categoryName, categoryName))
                {
                    return true;
                }
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeLong(myXp);
            parcel.writeString(categoryName);
        }


        public PlayerXpData(long l, String s)
        {
            myXp = l;
            categoryName = s;
        }

        protected PlayerXpData(Parcel parcel)
        {
            myXp = parcel.readLong();
            categoryName = parcel.readString();
        }
    }

    public static final class XpChartViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        private boolean mAnimateLevelProgress;
        private final ViewGroup mExpandedXpChartView;
        private Animator mFirstAnimator;
        boolean mHasData;
        private BarExpandAnimatorUpdateListener mLastListener;
        private final View mLeftBarView;
        private final ViewGroup mLevelProgressView;
        private final TextView mLevelTextView;
        private final View mOverlay;
        private final View mRightBarView;
        private final View mXpChartBackgroundView;
        private final ViewGroup mXpChartView;
        private final StringBuilder mXpContentDescriptionBuilder = new StringBuilder();
        private final TextView mXpGenreHeader;
        private final TextView mXpProgressView;

        private ValueAnimator getExpandCollapseAnimator(int i, int j)
        {
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                i, j
            });
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final XpChartViewHolder this$0;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
                    valueanimator = mExpandedXpChartView.getLayoutParams();
                    valueanimator.height = i;
                    mExpandedXpChartView.setLayoutParams(valueanimator);
                }

            
            {
                this$0 = XpChartViewHolder.this;
                super();
            }
            });
            return valueanimator;
        }

        private void setupProgressBar(Resources resources, float f, int i, View view, View view1)
        {
            view.setBackgroundColor(i);
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view1.getLayoutParams();
            layoutparams.weight = 1.0F - f;
            view1.setLayoutParams(layoutparams);
            float f1 = f;
            if (PlatformVersion.checkVersion(11))
            {
                float f2 = 0.0F;
                long l = resources.getInteger(0x7f0e001d);
                resources = ValueAnimator.ofFloat(new float[] {
                    0.0F, f
                });
                resources.addUpdateListener(new BarExpandAnimatorUpdateListener(view, view1, resources));
                resources.setDuration(l);
                f1 = f2;
                if (mFirstAnimator == null)
                {
                    mFirstAnimator = resources;
                    f1 = f2;
                }
            }
            resources = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
            resources.weight = f1;
            view.setLayoutParams(resources);
        }

        public final void onClick(View view)
        {
            int i;
            if (mExpandedXpChartView.getVisibility() != 8)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0)
            {
                mExpandedXpChartView.setVisibility(0);
                if (PlatformVersion.checkVersion(11))
                {
                    i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    int j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    mExpandedXpChartView.measure(i, j);
                    getExpandCollapseAnimator(0, mExpandedXpChartView.getMeasuredHeight()).start();
                }
                return;
            }
            if (PlatformVersion.checkVersion(11))
            {
                view = getExpandCollapseAnimator(mExpandedXpChartView.getHeight(), 0);
                view.addListener(new android.animation.Animator.AnimatorListener() {

                    final XpChartViewHolder this$0;

                    public final void onAnimationCancel(Animator animator)
                    {
                    }

                    public final void onAnimationEnd(Animator animator)
                    {
                        mExpandedXpChartView.setVisibility(8);
                    }

                    public final void onAnimationRepeat(Animator animator)
                    {
                    }

                    public final void onAnimationStart(Animator animator)
                    {
                    }

            
            {
                this$0 = XpChartViewHolder.this;
                super();
            }
                });
                view.start();
                return;
            } else
            {
                mExpandedXpChartView.setVisibility(8);
                return;
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            Object obj;
            Resources resources;
            super.populateViews(gamesrecycleradapter, i);
            obj = (PlayerDetailXpPerGenreAdapter)mAdapter;
            resources = mContext.getResources();
            mXpChartBackgroundView.setBackgroundColor(-1);
            mXpGenreHeader.setTextColor(((PlayerDetailXpPerGenreAdapter) (obj)).mXpHeaderTextColor);
            mXpProgressView.setTextColor(((PlayerDetailXpPerGenreAdapter) (obj)).mXpProgressTextColor);
            mRightBarView.setBackgroundColor(((PlayerDetailXpPerGenreAdapter) (obj)).mUnfilledProgressBarColor);
            true;
            mOverlay.setBackgroundResource(0x7f0200e7);
            mXpContentDescriptionBuilder.setLength(0);
            if (mHasData) goto _L2; else goto _L1
_L1:
            int k;
            long l2;
            long l3;
            Object obj3 = ((PlayerDetailXpPerGenreAdapter) (obj)).mPlayer;
            k = ((PlayerDetailXpPerGenreAdapter) (obj)).mRowLimit;
            gamesrecycleradapter = ((PlayerDetailXpPerGenreAdapter) (obj)).mXpDataList;
            LayoutInflater layoutinflater = 
// JavaClassFileOutputException: get_constant: invalid tag




/*
        static BarExpandAnimatorUpdateListener access$1202(XpChartViewHolder xpchartviewholder, BarExpandAnimatorUpdateListener barexpandanimatorupdatelistener)
        {
            xpchartviewholder.mLastListener = barexpandanimatorupdatelistener;
            return barexpandanimatorupdatelistener;
        }

*/

        public XpChartViewHolder(View view, boolean flag)
        {
            super(view);
            mXpChartBackgroundView = view.findViewById(0x7f0d0178);
            mXpGenreHeader = (TextView)view.findViewById(0x7f0d017a);
            mXpChartView = (ViewGroup)view.findViewById(0x7f0d0179);
            mExpandedXpChartView = (ViewGroup)view.findViewById(0x7f0d017b);
            mExpandedXpChartView.setVisibility(8);
            mLevelTextView = (TextView)view.findViewById(0x7f0d0250);
            mXpProgressView = (TextView)view.findViewById(0x7f0d0251);
            mLevelProgressView = (ViewGroup)view.findViewById(0x7f0d024d);
            mLeftBarView = mLevelProgressView.findViewById(0x7f0d024e);
            mRightBarView = mLevelProgressView.findViewById(0x7f0d024f);
            mOverlay = view.findViewById(0x7f0d0072);
            mOverlay.setOnClickListener(this);
            mAnimateLevelProgress = flag;
        }
    }

    private final class XpChartViewHolder.BarExpandAnimatorUpdateListener
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private final View mLeftBar;
        private Animator mNextAnimator;
        private final View mRightBar;
        private boolean mStartedNext;
        final XpChartViewHolder this$0;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mLeftBar.getLayoutParams();
            layoutparams.weight = f;
            mLeftBar.setLayoutParams(layoutparams);
            layoutparams = (android.widget.LinearLayout.LayoutParams)mRightBar.getLayoutParams();
            layoutparams.weight = 1.0F - f;
            mRightBar.setLayoutParams(layoutparams);
            if (mNextAnimator != null && !mStartedNext && (float)valueanimator.getCurrentPlayTime() > 0.5F * (float)valueanimator.getDuration())
            {
                mStartedNext = true;
                mNextAnimator.start();
            }
        }

        public XpChartViewHolder.BarExpandAnimatorUpdateListener(View view, View view1, Animator animator)
        {
            this$0 = XpChartViewHolder.this;
            super();
            mLeftBar = view;
            mRightBar = view1;
            mNextAnimator = null;
            mStartedNext = false;
            if (mLastListener != null)
            {
                mLastListener.mNextAnimator = animator;
            }
            mLastListener = this;
        }
    }


    boolean mAnimateLevelProgress;
    private final int mBackgroundColor = -1;
    MetagameAvatarView mBannerAvatarView;
    private final boolean mEnableFocusHighlight = true;
    private final int mGenreTextColor;
    Player mPlayer;
    int mRowLimit;
    private final int mUnfilledProgressBarColor;
    ArrayList mXpDataList;
    private final int mXpHeaderTextColor;
    private final int mXpProgressTextColor;

    public PlayerDetailXpPerGenreAdapter(Context context)
    {
        SingleItemRecyclerAdapter(context, false);
        context = mContext.getResources();
        mXpHeaderTextColor = context.getColor(0x7f0b00de);
        mGenreTextColor = context.getColor(0x7f0b0060);
        mXpProgressTextColor = context.getColor(0x7f0b00df);
        mUnfilledProgressBarColor = context.getColor(0x7f0b00b8);
    }

    public final int getItemViewType()
    {
        return 0x7f0400bf;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new XpChartViewHolder(mInflater.inflate(0x7f0400bf, viewgroup, false), mAnimateLevelProgress);
    }











}
