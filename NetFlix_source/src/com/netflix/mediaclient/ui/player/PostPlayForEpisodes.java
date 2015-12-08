// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.servicemgr.InterestingVideoDetails;
import com.netflix.mediaclient.servicemgr.PostPlayVideo;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlay, PlayerActivity

public class PostPlayForEpisodes extends PostPlay
{

    private boolean mAutoPlayEnabled;
    protected View mAutoPlayView;
    protected TextView mInfoTitleView;
    protected AdvancedImageView mPlayButtonImage;
    private int mTimer;
    protected int mTimerValue;
    protected TextView mTimerView;
    private final Runnable onEverySecond = new Runnable() {

        final PostPlayForEpisodes this$0;

        public void run()
        {
            if (!mInPostPlay || mContext.destroyed())
            {
                Log.d("nf_postplay", "post play timer exit or activity is destroyed");
                return;
            }
            int i = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = PostPlayForEpisodes.this;
                super();
            }
    };

    PostPlayForEpisodes(PlayerActivity playeractivity)
    {
        super(playeractivity);
        mAutoPlayEnabled = true;
        init();
    }

    private void init()
    {
        mTimerValue = mContext.getResources().getInteger(0x7f0b0007);
        mAutoPlayEnabled = isAutoPlayEnabled();
        if (Log.isLoggable("nf_postplay", 3))
        {
            Log.d("nf_postplay", (new StringBuilder()).append("PostPlayForEpisodes:: timer max value ").append(mTimerValue).toString());
        }
        if (!mAutoPlayEnabled && mTimerView != null)
        {
            ViewUtils.setVisibility(mAutoPlayView, com.netflix.mediaclient.util.ViewUtils.Visibility.INVISIBLE);
        }
        initInfoContainer();
        initButtons();
    }

    public void destroy()
    {
        super.destroy();
        if (mAutoPlayEnabled)
        {
            mContext.getHandler().removeCallbacks(onEverySecond);
        }
    }

    protected void doTransitionToPostPlay()
    {
        if (mAutoPlayEnabled)
        {
            Log.d("nf_postplay", "Auto play is enabled");
            mTimer = mTimerValue;
            mContext.getHandler().postDelayed(onEverySecond, 1000L);
            return;
        } else
        {
            Log.d("nf_postplay", "Auto play is disabled");
            return;
        }
    }

    public void endOfPlay()
    {
        super.endOfPlay();
        setBackgroundImageVisible(true);
    }

    protected void findViews()
    {
        mPlayButtonImage = (AdvancedImageView)mContext.findViewById(0x7f07017a);
        mInfoTitleView = (TextView)mContext.findViewById(0x7f07016f);
        mAutoPlayView = mContext.findViewById(0x7f07016e);
        mTimerView = (TextView)mContext.findViewById(0x7f070170);
    }

    protected void handlePlayNow(boolean flag)
    {
        if (mContext.destroyed())
        {
            Log.d("nf_postplay", "Activity is alredy destroyed, ignore play now!");
        } else
        {
            Log.d("nf_postplay", "Play NEXT episode!");
            PostPlayVideo postplayvideo = (PostPlayVideo)mPostPlayVideos.get(0);
            if (postplayvideo != null)
            {
                PlayContextImp playcontextimp = new PlayContextImp(postplayvideo.getPostPlayRequestId(), postplayvideo.getPostPlayTrackId(), 0, 0);
                mContext.playNextVideo(postplayvideo, playcontextimp, flag);
                return;
            }
        }
    }

    protected void initButtons()
    {
        if (mPlayButton != null)
        {
            mPlayButton.setVisibility(0);
        }
        if (mStopButton != null)
        {
            mStopButton.setVisibility(8);
        }
        if (mMoreButton != null)
        {
            mMoreButton.setVisibility(8);
        }
    }

    protected void initInfoContainer()
    {
        if (mInfoTitleView != null)
        {
            mInfoTitleView.setText(mContext.getResources().getText(0x7f0c01be));
        }
        if (mTimerView != null)
        {
            mTimerView.setVisibility(0);
        }
        if (mBackground != null)
        {
            mBackground.setVisibility(4);
        }
    }

    public void onPause()
    {
        if (mAutoPlayEnabled)
        {
            mContext.getHandler().removeCallbacks(onEverySecond);
        }
    }

    public void onResume()
    {
        if (mInPostPlay && mAutoPlayEnabled)
        {
            mContext.getHandler().removeCallbacks(onEverySecond);
            mContext.getHandler().post(onEverySecond);
        }
    }

    protected void onTimerEnd()
    {
        mPlayButton.setEnabled(false);
        handlePlayNow(true);
    }

    public void postPlayDismissed()
    {
        super.postPlayDismissed();
        if (mAutoPlayEnabled)
        {
            mContext.getHandler().removeCallbacks(onEverySecond);
        }
    }

    protected void updateOnPostPlayVideosFetched(List list)
    {
        Log.d("nf_postplay", "updateOnPostPlayVideosFetched start");
        if (list == null || list.size() < 1)
        {
            Log.e("nf_postplay", "We do not have any data! Do nothing!");
            return;
        }
        list = (PostPlayVideo)list.get(0);
        if (list == null)
        {
            Log.e("nf_postplay", "We do not have any data! Do nothing!");
            return;
        } else
        {
            updateViews(list);
            return;
        }
    }

    protected void updateViews(InterestingVideoDetails interestingvideodetails)
    {
        String s;
        String s1;
        String s2;
        String s3;
        s1 = interestingvideodetails.getTitle();
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        s1 = interestingvideodetails.getStoryUrl();
        s2 = interestingvideodetails.getInterestingUrl();
        s3 = mContext.getResources().getString(0x7f0c01c1, new Object[] {
            s
        });
        if (mBackground == null) goto _L2; else goto _L1
_L1:
        if (StringUtils.isEmpty(s1) || !mContext.isTablet()) goto _L4; else goto _L3
_L3:
        NetflixActivity.getImageLoader(mContext).showImg(mBackground, s1, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.merchStill, s3, true, true, 1);
_L2:
        if (!StringUtils.isEmpty(s2) && mPlayButtonImage != null)
        {
            NetflixActivity.getImageLoader(mContext).showImg(mPlayButtonImage, s2, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.merchStill, s3, true, true, 1);
        }
        s = mContext.getResources().getString(0x7f0c01c4, new Object[] {
            Integer.valueOf(interestingvideodetails.getSeasonNumber()), Integer.valueOf(interestingvideodetails.getEpisodeNumber()), s
        });
        if (Log.isLoggable("nf_postplay", 3))
        {
            Log.d("nf_postplay", (new StringBuilder()).append("Title: ").append(s).toString());
        }
        if (mTitle != null)
        {
            mTitle.setText(s);
        }
        if (mSynopsis != null && mSynopsis.getVisibility() == 0 && interestingvideodetails.getSynopsis() != null)
        {
            mSynopsis.setText(interestingvideodetails.getSynopsis());
        }
        if (Log.isLoggable("nf_postplay", 3))
        {
            Log.d("nf_postplay", (new StringBuilder()).append("Synopsis: ").append(interestingvideodetails.getSynopsis()).toString());
        }
        return;
_L4:
        if (!StringUtils.isEmpty(s2) && !mContext.isTablet())
        {
            NetflixActivity.getImageLoader(mContext).showImg(mBackground, s2, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.merchStill, s3, true, true, 1);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }



/*
    static int access$010(PostPlayForEpisodes postplayforepisodes)
    {
        int i = postplayforepisodes.mTimer;
        postplayforepisodes.mTimer = i - 1;
        return i;
    }

*/
}
