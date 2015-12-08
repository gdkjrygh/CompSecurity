// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.SharedElementCallback;
import android.support.v4.view.ViewCompat;
import android.transition.ArcMotion;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.LoadingStateAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationGamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.transition.LevelViewSharedTransition;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import com.google.android.play.animation.PlayInterpolators;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.transition.BaseTransitionListener;
import com.google.android.play.transition.CircularExpando;
import com.google.android.play.transition.PlayTransitionUtil;
import com.google.android.play.transition.Scale;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            PlayerDetailProfileBannerAdapter

public abstract class PlayerDetailBaseFragment extends DestinationGamesHeaderRecyclerViewFragment
    implements LoggablePage, com.google.android.gms.games.ui.destination.games.ContinuePlayingAdapter.ContinuePlayingEventListener, PlayerDetailProfileBannerAdapter.ProfileBannerEventListener, com.google.android.play.headerlist.PlayHeaderListLayout.LayoutListener
{

    protected boolean mAnimateLevelProgress;
    private View mBackgroundColorOverlay;
    protected PlayerDetailProfileBannerAdapter mBannerAdapter;
    private PlayerDetailProfileBannerAdapter.ProfileBannerViewHolder mBannerHolder;
    protected String mCurrentAccountName;
    private double mDurationDevMultiplier;
    private long mEnterDuration;
    private boolean mIsComparison;
    private boolean mIsInSharedElemTransition;
    private boolean mIsSharedTransitionEntering;
    protected LatencyLogger mLatencyLogger;
    protected LoadingStateAdapter mLoadingStateAdapter;
    protected Player mMainPlayer;
    protected Player mMePlayer;
    private boolean mMustAnimateLevel;
    private long mReturnDuration;
    private boolean mTopOfScreen;
    protected boolean mViewDestroyed;

    public PlayerDetailBaseFragment(boolean flag)
    {
        mTopOfScreen = true;
        mIsSharedTransitionEntering = true;
        mDurationDevMultiplier = 1.0D;
        mMustAnimateLevel = false;
        mAnimateLevelProgress = true;
        mIsInSharedElemTransition = false;
        mIsComparison = flag;
    }

    private void setBackgroundOverlayColor()
    {
        if (mBackgroundColorOverlay == null || mMainPlayer == null || !isAttachedToParent() || ((GamesFragmentActivity) (mParent)).mIsPlusEnabled && mMainPlayer.getLevelInfo() == null)
        {
            return;
        }
        int i;
        if (mMainPlayer.getLevelInfo() == null)
        {
            i = 1;
        } else
        {
            i = mMainPlayer.getLevelInfo().mCurrentLevel.mLevelNumber;
        }
        setBackgroundOverlayColor(i);
    }

    private void setBackgroundOverlayColor(int i)
    {
        if (i <= 0)
        {
            return;
        }
        boolean flag;
        if (mBackgroundColorOverlay != null && isAttachedToParent())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        i = UiUtils.getLevelColorForBackground(getResources(), i);
        mBackgroundColorOverlay.setBackgroundColor(i);
    }

    public final void addBackgroundView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = layoutinflater.inflate(0x7f040064, viewgroup, false);
        viewgroup.addView(layoutinflater);
        if (PlatformVersion.checkVersion(21))
        {
            ((ViewGroup)layoutinflater).setTransitionGroup(true);
        }
        mBackgroundColorOverlay = layoutinflater.findViewById(0x7f0d0171);
        setBackgroundOverlayColor();
    }

    public final void addHeroView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = viewgroup.getContext();
        mBannerAdapter = new PlayerDetailProfileBannerAdapter(super.mActivity, mIsComparison, this);
        Object obj = mBannerAdapter;
        mBannerAdapter.getItemViewType(0);
        mBannerHolder = (PlayerDetailProfileBannerAdapter.ProfileBannerViewHolder)((SingleItemRecyclerAdapter) (obj)).onCreateItemViewHolder(viewgroup);
        mBannerAdapter.onBindViewHolder(mBannerHolder, 0);
        mBannerHolder.itemView.setVisibility(8);
        mBannerAdapter.registerAdapterDataObserver(new android.support.v7.widget.RecyclerView.AdapterDataObserver() {

            final PlayerDetailBaseFragment this$0;

            public final void onChanged()
            {
                mBannerAdapter.onBindViewHolder(mBannerHolder, 0);
            }

            public final void onItemRangeChanged(int i, int j)
            {
                onChanged();
            }

            public final void onItemRangeInserted(int i, int j)
            {
                mBannerHolder.itemView.setVisibility(0);
                onChanged();
            }

            public final void onItemRangeRemoved(int i, int j)
            {
                mBannerHolder.itemView.setVisibility(8);
            }

            
            {
                this$0 = PlayerDetailBaseFragment.this;
                super();
            }
        });
        viewgroup.addView(mBannerHolder.itemView);
        obj = (android.widget.FrameLayout.LayoutParams)viewgroup.getLayoutParams();
        obj.width = -1;
        viewgroup.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        viewgroup = (android.widget.FrameLayout.LayoutParams)mBannerHolder.itemView.getLayoutParams();
        viewgroup.setMargins(0, super.getHeaderHeight(layoutinflater), 0, 0);
        mBannerHolder.itemView.setLayoutParams(viewgroup);
    }

    public final boolean alwaysUseFloatingBackground()
    {
        return false;
    }

    protected void createAdapters()
    {
        Object obj = getResources();
        int i;
        int j;
        int k;
        int l;
        if (PlatformVersion.checkVersion(11))
        {
            Asserts.checkNotNull(mBannerAdapter);
        } else
        {
            mBannerAdapter = new PlayerDetailProfileBannerAdapter(mParent, mIsComparison, this);
        }
        mLoadingStateAdapter = new LoadingStateAdapter(mParent);
        mLoadingStateAdapter.setVisible(false);
        i = ((Resources) (obj)).getDimensionPixelSize(0x7f0c01a4);
        j = ((Resources) (obj)).getDimensionPixelSize(0x7f0c01a3);
        k = ((Resources) (obj)).getDimensionPixelSize(0x7f0c01ab);
        l = mPlayHeaderListLayout.mToolbarHeight;
        obj = mLoadingStateAdapter;
        obj.mTopPadding = (j - i - l) + k;
        ((LoadingStateAdapter) (obj)).notifySingleItemChanged();
    }

    public final int getHeaderHeight(Context context)
    {
        int j = super.getHeaderHeight(context);
        int i;
        if (PlatformVersion.checkVersion(11))
        {
            i = getResources().getDimensionPixelSize(0x7f0c01a4);
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public final int getToolbarTitleMode()
    {
        return 0;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    protected abstract void loadData(GoogleApiClient googleapiclient);

    public void onActivityCreated(final Bundle levelView)
    {
        super.onActivityCreated(levelView);
        Object obj = mParent;
        byte byte0;
        if (mIsComparison)
        {
            byte0 = 4;
        } else
        {
            byte0 = 3;
        }
        mLatencyLogger = LatencyLogger.createDestAppLatencyLogger(((Context) (obj)), byte0);
        createAdapters();
        if (mIsComparison)
        {
            mMainPlayer = (Player)mParent.getIntent().getParcelableExtra("com.google.android.gms.games.OTHER_PLAYER");
        } else
        {
            mMainPlayer = (Player)mParent.getIntent().getParcelableExtra("com.google.android.gms.games.PLAYER");
        }
        onMainPlayerChanged();
        mParent.setActionBarAlpha(0);
        mPlayHeaderListLayout.mLayoutListener = this;
        obj = new SharedElementTransition(mParent.getIntent());
        if (levelView == null && ((SharedElementTransition) (obj)).mAnimation == 3)
        {
            levelView = mBannerAdapter;
            levelView.mTransition = ((SharedElementTransition) (obj));
            levelView.onNewData();
            setBackgroundOverlayColor(MetagameAvatarView.getAvatarLevel(((SharedElementTransition) (obj))));
            if (PlatformVersion.checkVersion(21))
            {
                mIsInSharedElemTransition = true;
                PlayTransitionUtil.setHeaderListLayoutClipChildren$72cb25e2(mPlayHeaderListLayout);
                mParent.getWindow().setAllowEnterTransitionOverlap(true);
                mEnterDuration = Math.round(mDurationDevMultiplier * 450D);
                mReturnDuration = Math.round(mDurationDevMultiplier * 450D);
                mAnimateLevelProgress = false;
            }
            if (PlatformVersion.checkVersion(21))
            {
                levelView = mBannerHolder.mAvatarView;
                Object obj2 = levelView.getImageView();
                levelView = levelView.getLevelView();
                ((View) (obj2)).setTransitionName("avatar");
                Object obj1 = (new Scale(true)).addTarget(((View) (obj2)));
                ((Transition) (obj1)).setPathMotion(new ArcMotion());
                ((Transition) (obj1)).setDuration(mEnterDuration);
                obj2 = (new Scale(false)).addTarget(((View) (obj2)));
                ((Transition) (obj2)).setPathMotion(new ArcMotion());
                ((Transition) (obj2)).setDuration(mReturnDuration);
                levelView.setTransitionName("level");
                final ViewGroup listView = (new LevelViewSharedTransition(true)).addTarget(levelView);
                final ViewGroup heroContainerView = (new LevelViewSharedTransition(false)).addTarget(levelView);
                obj1 = PlayTransitionUtil.aggregate(new Transition[] {
                    obj1, listView
                }).setInterpolator(PlayInterpolators.fastOutSlowIn(mParent));
                mParent.getWindow().setSharedElementEnterTransition(((Transition) (obj1)));
                obj2 = PlayTransitionUtil.aggregate(new Transition[] {
                    obj2, heroContainerView
                }).setInterpolator(PlayInterpolators.fastOutSlowIn(mParent));
                mParent.getWindow().setSharedElementReturnTransition(((Transition) (obj2)));
                heroContainerView = (ViewGroup)mPlayHeaderListLayout.findViewById(0x7f0d031a);
                listView = (ViewGroup)mPlayHeaderListLayout.findViewById(0x102000a);
                obj2 = mParent;
                heroContainerView = new SharedElementCallback() {

                    final PlayerDetailBaseFragment this$0;
                    final ViewGroup val$heroContainerView;
                    final TextView val$levelView;
                    final ViewGroup val$listView;

                    public final void onSharedElementStart$70d861b8(List list)
                    {
                        Object obj3 = heroContainerView.findViewById(0x7f0d01f2);
                        if (mIsSharedTransitionEntering && obj3 != null)
                        {
                            mIsSharedTransitionEntering;
                            listView.setTransitionGroup(true);
                            heroContainerView.setTransitionGroup(true);
                            obj3 = CircularExpando.windowTransition(
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = PlayerDetailBaseFragment.this;
                heroContainerView = viewgroup;
                listView = viewgroup1;
                levelView = textview;
                super();
            }
                };
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    ((Activity) (obj2)).setEnterSharedElementCallback(new SharedElementCallbackImpl(new SharedElementCallback21Impl(heroContainerView)));
                }
                ((Transition) (obj1)).addListener(new BaseTransitionListener() {

                    final PlayerDetailBaseFragment this$0;
                    final TextView val$levelView;

                    public final void onTransitionEnd(Transition transition)
                    {
                        if (!isAttachedToParent())
                        {
                            return;
                        }
                        if (mMustAnimateLevel)
                        {
                            levelView.setAlpha(1.0F);
                            transition = new AnimatorSet();
                            transition.playTogether(new Animator[] {
                                ObjectAnimator.ofFloat(levelView, "scaleX", new float[] {
                                    0.0F, 1.0F
                                }), ObjectAnimator.ofFloat(levelView, "scaleY", new float[] {
                                    0.0F, 1.0F
                                })
                            });
                            transition.setInterpolator(new OvershootInterpolator());
                            transition.setDuration(mEnterDuration);
                            transition.start();
                        }
                        if (!mAnimateLevelProgress)
                        {
                            mBannerHolder.mAvatarView.startLevelProgressAnimation(getResources().getInteger(0x7f0e001d), false);
                            mAnimateLevelProgress = true;
                        }
                        mLatencyLogger.logEvents(new int[] {
                            3, 4
                        });
                    }

            
            {
                this$0 = PlayerDetailBaseFragment.this;
                levelView = textview;
                super();
            }
                });
            }
        }
        if (mIsInSharedElemTransition)
        {
            mLatencyLogger.ensureStarted(new int[0]);
            return;
        } else
        {
            mLatencyLogger.ensureStarted(new int[] {
                3, 4
            });
            return;
        }
    }

    public final void onContinuePlayingClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view)
    {
        mParent.logClickEvent(1100, view);
        PowerUpUtils.viewGameDetail(mParent, gamefirstparty, sharedelementtransition);
    }

    public final void onContinuePlayingPlayButtonClicked(GameFirstParty gamefirstparty, View view)
    {
        com.google.android.gms.games.snapshot.SnapshotMetadata snapshotmetadata = gamefirstparty.getSnapshot();
        if (snapshotmetadata != null)
        {
            mParent.logClickEvent(1152, view);
            UiUtils.launchGameForSnapshot(mParent, mCurrentAccountName, gamefirstparty.getGame(), snapshotmetadata);
            return;
        } else
        {
            mParent.logClickEvent(1148, view);
            UiUtils.launchGame(mParent, gamefirstparty.getGame(), null);
            return;
        }
    }

    public final void onContinuePlayingShareIconClicked(String s, String s1, View view)
    {
        mParent.logClickEvent(1141, view);
        mParent.shareGame(s, s1);
    }

    public final void onDestroyView()
    {
        mViewDestroyed = true;
        super.onDestroyView();
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        mMePlayer = Games.Players.getCurrentPlayer(googleapiclient);
        mLatencyLogger.onConnected(googleapiclient);
        if (mMePlayer == null)
        {
            GamesLog.w("PDBFragment", "We don't have a current player, something went wrong. Finishing the activity");
            mParent.finish();
            return;
        }
        if (!mIsComparison)
        {
            mMainPlayer = mMePlayer;
            onMainPlayerChanged();
        }
        mCurrentAccountName = Games.getCurrentAccountName(googleapiclient);
        if (mCurrentAccountName == null)
        {
            GamesLog.w("PDBFragment", "We don't have a current account name, something went wrong. Finishing the activity");
            mParent.finish();
            return;
        } else
        {
            loadData(googleapiclient);
            return;
        }
    }

    protected final void onMainPlayerChanged()
    {
        if (mMainPlayer == null)
        {
            return;
        } else
        {
            mParent.setTitle(mMainPlayer.getDisplayName());
            PlayerDetailProfileBannerAdapter playerdetailprofilebanneradapter = mBannerAdapter;
            playerdetailprofilebanneradapter.mPlayer = (Player)mMainPlayer.freeze();
            playerdetailprofilebanneradapter.mTransition = null;
            playerdetailprofilebanneradapter.onNewData();
            setBackgroundOverlayColor();
            return;
        }
    }

    public final void onPlayHeaderListLayoutChanged()
    {
        float f = mPlayHeaderListLayout.getVisibleHeaderHeight();
        float f1 = getHeaderHeight(mParent);
        android.support.v7.widget.RecyclerView recyclerview = super.mRecyclerView;
        if (PlatformVersion.checkVersion(21))
        {
            Resources resources = mParent.getResources();
            Window window = mParent.getWindow();
            int i = resources.getColor(0x7f0b0259);
            int j = resources.getColor(0x7f0b0253);
            if (mTopOfScreen && f == 0.0F)
            {
                mTopOfScreen = false;
            }
            if (!ViewCompat.canScrollVertically(recyclerview, -1))
            {
                mTopOfScreen = true;
            } else
            if (!mTopOfScreen)
            {
                if (f > 0.0F)
                {
                    window.setStatusBarColor(UiUtils.interpolateColor(i, j, 1.0F - f / f1));
                } else
                {
                    window.setStatusBarColor(j);
                }
            }
        }
        if (!ViewCompat.canScrollVertically(recyclerview, -1))
        {
            mBannerAdapter.setAlpha(1.0F);
            return;
        } else
        {
            f = (f - (float)mPlayHeaderListLayout.mToolbarHeight) / (f1 - (float)mPlayHeaderListLayout.mToolbarHeight);
            mBannerAdapter.setAlpha(Math.min(f, 1.0F));
            return;
        }
    }

    public void onProfileBannerEditCirclesClicked()
    {
    }

    public void onProfileBannerGplusClicked()
    {
    }

    public final void onResume()
    {
        super.onResume();
        logPageView(getLogger());
    }

    public final void onStop()
    {
        mLatencyLogger.logEvents(new int[] {
            6
        });
        super.onStop();
    }



/*
    static boolean access$002$1fd666c8(PlayerDetailBaseFragment playerdetailbasefragment)
    {
        playerdetailbasefragment.mIsSharedTransitionEntering = false;
        return false;
    }

*/










/*
    static boolean access$702$1fd666c8(PlayerDetailBaseFragment playerdetailbasefragment)
    {
        playerdetailbasefragment.mMustAnimateLevel = true;
        return true;
    }

*/


}
