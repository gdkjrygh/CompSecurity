// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.DeviceUtils;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayerWorkflowState, SubtitleManager, PlayScreen, 
//            PlayerUiState

public abstract class PostPlay
{
    private class FetchPostPlayForPlaybackCallback extends LoggingManagerCallback
    {

        final PostPlay this$0;

        public void onPostPlayVideosFetched(List list, int i)
        {
            boolean flag1 = false;
            super.onPostPlayVideosFetched(list, i);
            if (mContext.destroyed())
            {
                return;
            }
            if (i != 0 || list == null)
            {
                Log.w("nf_postplay", "Error loading post play data");
                mPostPlayDataExist = false;
                return;
            }
            if (Log.isLoggable("nf_postplay", 3) && list != null)
            {
                Log.d("nf_postplay", (new StringBuilder()).append("Postplay data retrieved ").append(list.size()).toString());
            }
            mPostPlayVideos = list;
            PostPlay postplay = PostPlay.this;
            boolean flag = flag1;
            if (list != null)
            {
                flag = flag1;
                if (list.size() > 0)
                {
                    flag = true;
                }
            }
            postplay.mPostPlayDataExist = flag;
            updateOnPostPlayVideosFetched(list);
        }

        public FetchPostPlayForPlaybackCallback()
        {
            this$0 = PostPlay.this;
            super("nf_postplay");
        }
    }


    private static final int DEFAULT_INTERRUPTER_TIMEOUT_IN_MS = 0x36ee80;
    private static final int DEFAULT_OFFSET = 10000;
    protected static final int INTERRUPTER_COUNT = 3;
    private static final int INTERRUPTER_VALUE_IN_MS = 0x1d4c0;
    private static final double SIXTEEN_NINE_RATIO = 1.77D;
    private static final double SIXTY_PERCENT = 0.59999999999999998D;
    protected static final String TAG = "nf_postplay";
    protected AdvancedImageView mBackground;
    protected PlayerActivity mContext;
    protected boolean mInPostPlay;
    protected int mInterrputerTimeoutOffset;
    protected View mInterrupter;
    protected View mInterrupterContinue;
    protected View mInterrupterPlayFromStart;
    protected View mInterrupterStop;
    protected View mMoreButton;
    protected int mOffset;
    private DecelerateInterpolator mPanAnimationInterpolator;
    protected View mPlayButton;
    protected View mPostPlay;
    protected boolean mPostPlayDataExist;
    protected boolean mPostPlayDismissed;
    protected View mPostPlayIgnoreTap;
    protected List mPostPlayVideos;
    protected View mStopButton;
    protected TextView mSynopsis;
    protected TextView mTitle;
    private final Runnable onInterrupterDismiss = new Runnable() {

        final PostPlay this$0;

        public void run()
        {
            Log.d("nf_postplay", "After 60 minutes of waiting for user input, stop player ui");
            if (!mContext.destroyed())
            {
                mContext.finish();
            }
        }

            
            {
                this$0 = PostPlay.this;
                super();
            }
    };
    private final Runnable onInterrupterStart = new Runnable() {

        final PostPlay this$0;

        public void run()
        {
            if (mContext.getState().noUserInteraction())
            {
                if (mContext.getScreen().getState() != PlayerUiState.Loading)
                {
                    if (mInterrupter != null)
                    {
                        Log.d("nf_postplay", "This is 3rd consecutive auto play with no user interaction, after 2 minutes start interrupter mode");
                        mContext.doPause();
                        mInterrupter.setVisibility(0);
                        mContext.getScreen().moveToState(PlayerUiState.Interrupter);
                        mContext.getHandler().postDelayed(onInterrupterDismiss, mInterrputerTimeoutOffset);
                        return;
                    } else
                    {
                        Log.w("nf_postplay", "Interrupter UI NOT found, this should not happen!");
                        return;
                    }
                } else
                {
                    Log.d("nf_postplay", "This is 3rd consecutive auto play with no user interaction, but after 2 minutes we are still loading, postpone for 2 more minutes");
                    mContext.getHandler().postDelayed(this, 0x1d4c0L);
                    return;
                }
            } else
            {
                Log.d("nf_postplay", "Interrupter process, there was user interaction in meantime. Do nothing");
                return;
            }
        }

            
            {
                this$0 = PostPlay.this;
                super();
            }
    };

    protected PostPlay(PlayerActivity playeractivity)
    {
        mPanAnimationInterpolator = new DecelerateInterpolator();
        mOffset = 10000;
        mInterrputerTimeoutOffset = 0x36ee80;
        mContext = playeractivity;
        findViewsCommon();
        findViews();
        setClickListeners();
        if (mContext.getCurrentAsset() != null && mContext.getCurrentAsset().getPostPlayVideoPlayed() >= 3 && mContext.getState().noUserInteraction())
        {
            Log.d("nf_postplay", "This is 3rd consecutive auto play with no user interaction, start interrupter timeout");
            mContext.getHandler().postDelayed(onInterrupterStart, 0x1d4c0L);
        }
    }

    public static PostPlayFactory.PostPlayType getPostPlayType(PlayerActivity playeractivity, boolean flag)
    {
        DeviceCategory devicecategory = playeractivity.getServiceManager().getDeviceCategory();
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (devicecategory == null || devicecategory == DeviceCategory.UNKNOWN || devicecategory == DeviceCategory.PHONE)
        {
            flag2 = false;
        } else
        {
            flag2 = true;
        }
        flag1 = false;
        flag3 = false;
        if (flag)
        {
            playeractivity = playeractivity.getIntent();
            flag3 = playeractivity.getBooleanExtra("extra_get_details_has_next_episode", false);
            flag = flag3;
            if (VideoType.create(playeractivity.getStringExtra("extra_get_details_video_type")) == VideoType.MOVIE)
            {
                flag1 = true;
                flag = flag3;
            }
        } else
        {
            playeractivity = playeractivity.getCurrentAsset();
            flag = flag3;
            if (playeractivity != null)
            {
                flag = playeractivity.isNextPlayableEpisode();
                if (!playeractivity.isEpisode())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
        }
        if (flag2)
        {
            if (flag1)
            {
                Log.d("nf_postplay", "RecommendationForTablet postplay layout");
                return PostPlayFactory.PostPlayType.RecommendationForTablet;
            }
            if (flag)
            {
                Log.d("nf_postplay", "EpisodesForTablet postplay layout");
                return PostPlayFactory.PostPlayType.EpisodesForTablet;
            } else
            {
                Log.d("nf_postplay", "RecommendationForTablet postplay layout");
                return PostPlayFactory.PostPlayType.RecommendationForTablet;
            }
        } else
        {
            if (flag1)
            {
                Log.d("nf_postplay", "Phone recommendation (no) postplay layout");
                return PostPlayFactory.PostPlayType.RecommendationForPhone;
            }
            if (flag)
            {
                Log.d("nf_postplay", "Phone episodes postplay layout");
                return PostPlayFactory.PostPlayType.EpisodesForPhone;
            } else
            {
                Log.d("nf_postplay", "There will be no next episode, use phone recommendation (no) postplay layout");
                return PostPlayFactory.PostPlayType.RecommendationForPhone;
            }
        }
    }

    private boolean inPostPlay(int i)
    {
        Object obj = mContext;
        if (obj != null) goto _L2; else goto _L1
_L1:
        IPlayer iplayer;
        return false;
_L2:
        int j;
        int k;
        int l;
        if ((iplayer = ((PlayerActivity) (obj)).getPlayer()) == null || (obj = ((PlayerActivity) (obj)).getCurrentAsset()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = iplayer.getDuration();
        k = ((Asset) (obj)).getEndtime() * 1000;
        if (Log.isLoggable("nf_postplay", 3))
        {
            Log.d("nf_postplay", (new StringBuilder()).append("Duration ").append(l).toString());
            Log.d("nf_postplay", (new StringBuilder()).append("Endtime ").append(k).toString());
            Log.d("nf_postplay", (new StringBuilder()).append("Current position ").append(i).toString());
        }
        if (l - k >= mOffset)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.d("nf_postplay", "End time is too close to end of play. Use default offset instead.");
        j = l - mOffset;
_L4:
        if (i > j)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        j = k;
        if (k > l)
        {
            Log.d("nf_postplay", "End time is greater than duration! Use default offset instead.");
            j = l - mOffset;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void destroy()
    {
        mContext.getHandler().removeCallbacks(onInterrupterStart);
        mContext.getHandler().removeCallbacks(onInterrupterDismiss);
    }

    protected void doTransitionFromPostPlay()
    {
    }

    protected abstract void doTransitionToPostPlay();

    public void endOfPlay()
    {
        mContext.getSubtitleManager().clear();
    }

    abstract void findViews();

    protected void findViewsCommon()
    {
        mInterrupterPlayFromStart = mContext.findViewById(0x7f070145);
        mInterrupterContinue = mContext.findViewById(0x7f070144);
        mBackground = (AdvancedImageView)mContext.findViewById(0x7f070179);
        mSynopsis = (TextView)mContext.findViewById(0x7f070177);
        mInterrupterStop = mContext.findViewById(0x7f070146);
        mPostPlayIgnoreTap = mContext.findViewById(0x7f070175);
        mMoreButton = mContext.findViewById(0x7f07016d);
        mPlayButton = mContext.findViewById(0x7f07016b);
        mStopButton = mContext.findViewById(0x7f07016c);
        mTitle = (TextView)mContext.findViewById(0x7f070176);
        mInterrupter = mContext.findViewById(0x7f070143);
        mPostPlay = mContext.findViewById(0x7f070172);
    }

    protected abstract void handlePlayNow(boolean flag);

    protected void handleStop(boolean flag)
    {
        mContext.finish();
    }

    public void init(String s)
    {
        mContext.getServiceManager().fetchPostPlayVideos(s, new FetchPostPlayForPlaybackCallback());
        mOffset = mContext.getResources().getInteger(0x7f0b0007) * 1000;
    }

    protected boolean isAutoPlayEnabled()
    {
        Object obj = mContext;
        if (obj == null)
        {
            Log.e("nf_postplay", "Activity not found! Auto postplay is NOT enabled. This should NOT happen!");
        } else
        {
            Asset asset = ((PlayerActivity) (obj)).getCurrentAsset();
            if (asset == null)
            {
                Log.e("nf_postplay", "Asset not found! Auto postplay is NOT enabled. This should NOT happen!");
                return false;
            }
            if (!asset.isAutoPlayEnabled())
            {
                Log.d("nf_postplay", "Autoplay is disabled for this title");
                return false;
            }
            obj = ((PlayerActivity) (obj)).getServiceManager();
            if (obj != null)
            {
                obj = ((ServiceManager) (obj)).getCurrentProfile();
                if (obj != null)
                {
                    if (((UserProfile) (obj)).isAutoPlayEnabled())
                    {
                        Log.d("nf_postplay", "Autoplay is enabled for this profile");
                        return true;
                    } else
                    {
                        Log.d("nf_postplay", "Autoplay is disabled for this profile");
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public boolean isInPostPlay()
    {
        return mInPostPlay;
    }

    protected boolean isPostPlayAllowed()
    {
        if (!isPostPlayEnabled())
        {
            Log.d("nf_postplay", "PostPlay is not enabled.");
            return false;
        }
        if (mPostPlayDismissed)
        {
            Log.d("nf_postplay", "PostPlay was dismissed by an user, do not start it again.");
            return false;
        } else
        {
            return true;
        }
    }

    protected boolean isPostPlayEnabled()
    {
        return mPostPlayDataExist;
    }

    void moveFromInterruptedToPlaying()
    {
        Log.d("nf_postplay", "Interrupter mode, continue");
        mContext.getScreen().clearPanel();
        mContext.doUnpause();
        mInterrupter.setVisibility(4);
        mContext.getSubtitleManager().setSubtitleVisibility(true);
    }

    void moveFromInterruptedToPlayingFromStart()
    {
        mInterrupter.setVisibility(4);
        Log.d("nf_postplay", "Interrupter mode, play from start");
        mContext.getScreen().clearPanel();
        mInterrupter.setVisibility(4);
        mContext.getSubtitleManager().setSubtitleVisibility(true);
        mContext.doSeek(0);
    }

    public void onPause()
    {
    }

    public void onResume()
    {
    }

    public void postPlayDismissed()
    {
        mPostPlayDismissed = true;
    }

    public void setBackgroundImageVisible(boolean flag)
    {
label0:
        {
            if (mBackground != null)
            {
                if (!flag)
                {
                    break label0;
                }
                mBackground.setVisibility(0);
            }
            return;
        }
        mBackground.setVisibility(4);
    }

    protected void setClickListeners()
    {
        if (mPostPlayIgnoreTap != null)
        {
            mPostPlayIgnoreTap.setOnTouchListener(new android.view.View.OnTouchListener() {

                final PostPlay this$0;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    Log.d("nf_postplay", "Hijacking tap, do nothing");
                    return true;
                }

            
            {
                this$0 = PostPlay.this;
                super();
            }
            });
        }
        if (mPlayButton != null)
        {
            mPlayButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PostPlay this$0;

                public void onClick(View view)
                {
                    handlePlayNow(false);
                }

            
            {
                this$0 = PostPlay.this;
                super();
            }
            });
        }
        if (mInterrupterContinue != null)
        {
            mInterrupterContinue.setOnClickListener(new android.view.View.OnClickListener() {

                final PostPlay this$0;

                public void onClick(View view)
                {
                    Log.d("nf_postplay", "Interrupter mode, continue");
                    moveFromInterruptedToPlaying();
                }

            
            {
                this$0 = PostPlay.this;
                super();
            }
            });
        }
        if (mInterrupterStop != null)
        {
            mInterrupterStop.setOnClickListener(new android.view.View.OnClickListener() {

                final PostPlay this$0;

                public void onClick(View view)
                {
                    Log.d("nf_postplay", "Interrupter mode, stop");
                    mContext.finish();
                }

            
            {
                this$0 = PostPlay.this;
                super();
            }
            });
        }
        if (mInterrupterPlayFromStart != null)
        {
            mInterrupterPlayFromStart.setOnClickListener(new android.view.View.OnClickListener() {

                final PostPlay this$0;

                public void onClick(View view)
                {
                    moveFromInterruptedToPlayingFromStart();
                }

            
            {
                this$0 = PostPlay.this;
                super();
            }
            });
        }
    }

    public void startBackgroundAutoPan()
    {
        while (mBackground == null || DeviceUtils.isLandscape(mContext) || mBackground.getMeasuredWidth() != 0) 
        {
            return;
        }
        mBackground.getLayoutParams().height = (int)((double)DeviceUtils.getScreenHeightInPixels(mContext) * 0.59999999999999998D);
        mBackground.getLayoutParams().width = (int)((double)mBackground.getLayoutParams().height * 1.77D);
        int i = mBackground.getLayoutParams().height;
        int j = mBackground.getLayoutParams().width;
        mBackground.animate().setDuration(mOffset).x(i - j).setInterpolator(mPanAnimationInterpolator);
    }

    void transitionFromPostPlay()
    {
        Log.d("nf_postplay", "Transition from post play execute!");
        mInPostPlay = false;
        postPlayDismissed();
        if (mPostPlay != null)
        {
            mPostPlay.setVisibility(4);
            mPostPlay.setFitsSystemWindows(false);
        }
        doTransitionFromPostPlay();
    }

    void transitionToPostPlay()
    {
        Log.d("nf_postplay", "Transition to post play execute!");
        mInPostPlay = true;
        if (mPostPlay != null)
        {
            mPostPlay.setVisibility(0);
            mPostPlay.setFitsSystemWindows(true);
        }
        doTransitionToPostPlay();
        startBackgroundAutoPan();
    }

    protected abstract void updateOnPostPlayVideosFetched(List list);

    public boolean updatePlaybackPosition(int i)
    {
        if (!isPostPlayAllowed())
        {
            return false;
        }
        boolean flag = inPostPlay(i);
        if (mInPostPlay && flag)
        {
            Log.d("nf_postplay", "Already in post play");
            return true;
        }
        if (mContext.getScreen().getState() == PlayerUiState.Interrupter)
        {
            Log.d("nf_postplay", "In Interrupter mode, do nothing");
            return false;
        }
        if (mInPostPlay && !flag)
        {
            Log.d("nf_postplay", "Transition from post play to normal");
            transitionFromPostPlay();
            return false;
        }
        if (!mInPostPlay && flag)
        {
            Log.d("nf_postplay", "Transition to post play");
            mContext.getScreen().moveToState(PlayerUiState.PostPlay);
            return true;
        } else
        {
            Log.d("nf_postplay", "Not in in post play");
            return false;
        }
    }

    public boolean wasPostPlayDismissed()
    {
        return mPostPlayDismissed;
    }

}
