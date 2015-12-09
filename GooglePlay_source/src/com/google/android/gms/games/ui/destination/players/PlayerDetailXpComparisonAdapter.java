// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.internal.Asserts;
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

public final class PlayerDetailXpComparisonAdapter extends SingleItemRecyclerAdapter
{
    public static class PlayerComparisonXpData extends PlayerDetailXpPerGenreAdapter.PlayerXpData
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new PlayerComparisonXpData(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new PlayerComparisonXpData[i];
            }

        };
        final long theirXp;

        public final int compareTo(PlayerDetailXpPerGenreAdapter.PlayerXpData playerxpdata)
        {
            Asserts.checkState(playerxpdata instanceof PlayerComparisonXpData);
            playerxpdata = (PlayerComparisonXpData)playerxpdata;
            if (myXp <= ((PlayerComparisonXpData) (playerxpdata)).myXp)
            {
                if (myXp < ((PlayerComparisonXpData) (playerxpdata)).myXp)
                {
                    return 1;
                }
                if (theirXp <= ((PlayerComparisonXpData) (playerxpdata)).theirXp)
                {
                    if (theirXp < ((PlayerComparisonXpData) (playerxpdata)).theirXp)
                    {
                        return 1;
                    } else
                    {
                        return categoryName.compareTo(((PlayerComparisonXpData) (playerxpdata)).categoryName);
                    }
                }
            }
            return -1;
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((PlayerDetailXpPerGenreAdapter.PlayerXpData)obj);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof PlayerComparisonXpData)
            {
                if (this == obj)
                {
                    return true;
                }
                obj = (PlayerComparisonXpData)obj;
                if (super.equals(obj) && Objects.equal(Long.valueOf(((PlayerComparisonXpData) (obj)).theirXp), Long.valueOf(theirXp)))
                {
                    return true;
                }
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeLong(theirXp);
        }


        public PlayerComparisonXpData(long l, long l1, String s)
        {
            super(l, s);
            theirXp = l1;
        }

        private PlayerComparisonXpData(Parcel parcel)
        {
            super(parcel);
            theirXp = parcel.readLong();
        }

        PlayerComparisonXpData(Parcel parcel, byte byte0)
        {
            this(parcel);
        }
    }

    public static final class XpComparisonChartViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        private final CardView mCardView;
        private final ViewGroup mExpandedXpChartView;
        private final TextView mGenreHeader;
        boolean mHasData;
        private final TextView mHeadToHeadHeader;
        private final View mHeaderDivider;
        private final TextView mLeftHeader;
        private final View mOverlay;
        private final MetagameAvatarView mPlayerImageMeView;
        private final MetagameAvatarView mPlayerImageThemView;
        private final TextView mRightHeader;
        private final ViewGroup mXpChartView;
        private final View mXpComparisonChartContainer;
        private final View mXpComparisonLeftBarView;
        private final View mXpComparisonRightBarView;
        private final StringBuilder mXpContentDescriptionBuilder = new StringBuilder();

        private ValueAnimator getExpandCollapseAnimator(int i, int j)
        {
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                i, j
            });
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final XpComparisonChartViewHolder this$0;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
                    valueanimator = mExpandedXpChartView.getLayoutParams();
                    valueanimator.height = i;
                    mExpandedXpChartView.setLayoutParams(valueanimator);
                }

            
            {
                this$0 = XpComparisonChartViewHolder.this;
                super();
            }
            });
            return valueanimator;
        }

        public final void onClick(View view)
        {
            if (mExpandedXpChartView.getVisibility() == 8)
            {
                mExpandedXpChartView.setVisibility(0);
                if (PlatformVersion.checkVersion(11))
                {
                    int i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
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

                    final XpComparisonChartViewHolder this$0;

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
                this$0 = XpComparisonChartViewHolder.this;
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
            super.populateViews(gamesrecycleradapter, i);
            PlayerDetailXpComparisonAdapter playerdetailxpcomparisonadapter = (PlayerDetailXpComparisonAdapter)mAdapter;
            Resources resources = mContext.getResources();
            mCardView.setCardBackgroundColor(-1);
            mHeadToHeadHeader.setTextColor(playerdetailxpcomparisonadapter.mXpHeaderTextColor);
            mLeftHeader.setTextColor(playerdetailxpcomparisonadapter.mXpHeaderTextColor);
            mGenreHeader.setTextColor(playerdetailxpcomparisonadapter.mXpHeaderTextColor);
            mRightHeader.setTextColor(playerdetailxpcomparisonadapter.mXpHeaderTextColor);
            true;
            mOverlay.setBackgroundResource(0x7f0200e7);
            gamesrecycleradapter = playerdetailxpcomparisonadapter.mPlayer1;
            Player player = playerdetailxpcomparisonadapter.mPlayer2;
            mPlayerImageMeView.setData(gamesrecycleradapter);
            mPlayerImageThemView.setData(player);
            i = 1;
            int j = 1;
            if (gamesrecycleradapter.getLevelInfo() != null)
            {
                i = gamesrecycleradapter.getLevelInfo().mCurrentLevel.mLevelNumber;
            }
            if (player.getLevelInfo() != null)
            {
                j = player.getLevelInfo().mCurrentLevel.mLevelNumber;
            }
            mXpComparisonLeftBarView.setBackgroundColor(UiUtils.getLevelColor(resources, i));
            mXpComparisonRightBarView.setBackgroundColor(UiUtils.getLevelColor(resources, j));
            float f = 0.17F + ((float)i / (float)(i + j)) * 0.66F;
            gamesrecycleradapter = (android.widget.LinearLayout.LayoutParams)mXpComparisonLeftBarView.getLayoutParams();
            gamesrecycleradapter.weight = f;
            mXpComparisonLeftBarView.setLayoutParams(gamesrecycleradapter);
            gamesrecycleradapter = (android.widget.LinearLayout.LayoutParams)mXpComparisonRightBarView.getLayoutParams();
            gamesrecycleradapter.weight = 1.0F - f;
            mXpComparisonRightBarView.setLayoutParams(gamesrecycleradapter);
            mXpContentDescriptionBuilder.setLength(0);
            if (!mHasData)
            {
                Object obj2 = playerdetailxpcomparisonadapter.mPlayer1;
                Object obj = playerdetailxpcomparisonadapter.mPlayer2;
                int l = playerdetailxpcomparisonadapter.mRowLimit;
                gamesrecycleradapter = playerdetailxpcomparisonadapter.mXpDataList;
                LayoutInflater layoutinflater = ((mXpComparisonLeftBarView) (playerdetailxpcomparisonadapter)).mXpComparisonLeftBarView;
                obj2 = ((Player) (obj2)).getLevelInfo();
                int k;
                int j1;
                int k1;
                if (obj2 != null)
                {
                    i = UiUtils.getLevelColor(resources, ((PlayerLevelInfo) (obj2)).mCurrentLevel.mLevelNumber);
                } else
                {
                    i = UiUtils.getLevelColor(resources, 1);
                }
                obj = ((Player) (obj)).getLevelInfo();
                if (obj != null)
                {
                    k = UiUtils.getLevelColor(resources, ((PlayerLevelInfo) (obj)).mCurrentLevel.mLevelNumber);
                } else
                {
                    k = UiUtils.getLevelColor(resources, 1);
                }
                if (l == 0)
                {
                    j1 = gamesrecycleradapter.size();
                } else
                {
                    j1 = Math.min(gamesrecycleradapter.size(), l);
                }
                obj2 = gamesrecycleradapter.iterator();
                k1 = 0;
                while (((Iterator) (obj2)).hasNext()) 
                {
                    Object obj1;
                    View view;
                    PlayerDetailXpPerGenreAdapter.PlayerXpData playerxpdata;
                    NumberFormat numberformat;
                    TextView textview;
                    PlayerDetailXpComparisonAdapter playerdetailxpcomparisonadapter1;
                    TextView textview1;
                    int i1;
                    long l2;
                    long l3;
                    if (k1 < j1)
                    {
                        gamesrecycleradapter = mXpChartView;
                    } else
                    {
                        gamesrecycleradapter = mExpandedXpChartView;
                    }
                    playerxpdata = (PlayerDetailXpPerGenreAdapter.PlayerXpData)((Iterator) (obj2)).next();
                    playerdetailxpcomparisonadapter1 = (PlayerDetailXpComparisonAdapter)mAdapter;
                    numberformat = NumberFormat.getInstance(Locale.getDefault());
                    view = layoutinflater.inflate(0x7f04006d, null, false);
                    obj1 = (TextView)view.findViewById(0x7f0d018a);
                    ((TextView) (obj1)).setText(playerxpdata.categoryName);
                    ((TextView) (obj1)).setTextColor(playerdetailxpcomparisonadapter1.mGenreTextColor);
                    l = resources.getColor(0x7f0b0060);
                    i1 = resources.getColor(0x7f0b0060);
                    textview1 = (TextView)view.findViewById(0x7f0d018b);
                    textview = (TextView)view.findViewById(0x7f0d0189);
                    l2 = playerxpdata.myXp;
                    l3 = ((PlayerComparisonXpData)playerxpdata).theirXp;
                    if (l3 > l2)
                    {
                        textview1.setTypeface(textview1.getTypeface(), 1);
                        int l1 = k;
                        i1 = l;
                        l = l1;
                    } else
                    if (l3 < l2)
                    {
                        textview.setTypeface(textview.getTypeface(), 1);
                        l = i1;
                        i1 = i;
                    } else
                    {
                        int i2 = l;
                        l = i1;
                        i1 = i2;
                    }
                    if (TextUtils.isEmpty(playerdetailxpcomparisonadapter1.mPlayer2.getPlayerId()))
                    {
                        obj1 = mContext.getString(0x7f10012d);
                    } else
                    {
                        obj1 = numberformat.format(l3);
                    }
                    textview1.setText(((CharSequence) (obj1)));
                    textview1.setTextColor(l);
                    if (TextUtils.isEmpty(playerdetailxpcomparisonadapter1.mPlayer1.getPlayerId()))
                    {
                        obj1 = mContext.getString(0x7f10012d);
                    } else
                    {
                        obj1 = numberformat.format(l2);
                    }
                    textview.setText(((CharSequence) (obj1)));
                    textview.setTextColor(i1);
                    obj1 = view.getResources().getString(0x7f100121, new Object[] {
                        playerxpdata.categoryName, numberformat.format(l2), numberformat.format(l3)
                    });
                    view.setContentDescription(((CharSequence) (obj1)));
                    mXpContentDescriptionBuilder.append(((String) (obj1)));
                    gamesrecycleradapter.addView(view);
                    k1++;
                }
                mHasData = true;
            }
            gamesrecycleradapter = mContext.getString(0x7f10011f, new Object[] {
                UiUtils.getPlayerLevelContentDescription(mContext, playerdetailxpcomparisonadapter.mPlayer1), playerdetailxpcomparisonadapter.mPlayer2.getDisplayName(), UiUtils.getPlayerLevelContentDescription(mContext, playerdetailxpcomparisonadapter.mPlayer2), mXpContentDescriptionBuilder.toString()
            });
            mOverlay.setContentDescription(gamesrecycleradapter);
        }


        public XpComparisonChartViewHolder(View view)
        {
            super(view);
            mXpChartView = (ViewGroup)view.findViewById(0x7f0d0184);
            mXpComparisonChartContainer = view.findViewById(0x7f0d0182);
            mHeaderDivider = view.findViewById(0x7f0d0180);
            mHeadToHeadHeader = (TextView)view.findViewById(0x7f0d0183);
            mLeftHeader = (TextView)view.findViewById(0x7f0d0189);
            mGenreHeader = (TextView)view.findViewById(0x7f0d018a);
            mRightHeader = (TextView)view.findViewById(0x7f0d018b);
            mExpandedXpChartView = (ViewGroup)view.findViewById(0x7f0d0185);
            mExpandedXpChartView.setVisibility(8);
            mOverlay = view.findViewById(0x7f0d0072);
            mOverlay.setOnClickListener(this);
            mXpComparisonLeftBarView = view.findViewById(0x7f0d017f);
            mXpComparisonRightBarView = view.findViewById(0x7f0d0181);
            mPlayerImageMeView = (MetagameAvatarView)view.findViewById(0x7f0d0186);
            mPlayerImageMeView.setAvatarElevationResId(0x7f0c0106);
            UiUtils.setSmallMetagameAvatarSizes(mPlayerImageMeView);
            mPlayerImageThemView = (MetagameAvatarView)view.findViewById(0x7f0d0187);
            mPlayerImageThemView.setAvatarElevationResId(0x7f0c0106);
            UiUtils.setSmallMetagameAvatarSizes(mPlayerImageThemView);
            mCardView = (CardView)view.findViewById(0x7f0d017d);
            float f = mContext.getResources().getDimension(0x7f0c029f);
            view.findViewById(0x7f0d017c).getLayoutParams().height = (int)(f / 4F);
            view = view.findViewById(0x7f0d017e);
            view.getLayoutParams().height = (int)(f / 2.0F);
            ((android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams()).setMargins(0, 0, 0, (int)(f / 4F));
        }
    }


    private final int mBackgroundColor = -1;
    private final boolean mEnableFocusHighlight = true;
    private final int mGenreTextColor;
    Player mPlayer1;
    Player mPlayer2;
    int mRowLimit;
    ArrayList mXpDataList;
    private final int mXpHeaderTextColor;

    public PlayerDetailXpComparisonAdapter(Context context)
    {
        super(context, false);
        context = mContext.getResources();
        mXpHeaderTextColor = context.getColor(0x7f0b00de);
        mGenreTextColor = context.getColor(0x7f0b0060);
    }

    public final int getItemViewType()
    {
        return 0x7f04006b;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new XpComparisonChartViewHolder(mInflater.inflate(0x7f04006b, viewgroup, false));
    }









}
