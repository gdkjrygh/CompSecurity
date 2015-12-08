// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ServiceManagerUtils;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.details.DetailsActivity;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlayForEpisodes, PlayerActivity

public final class PostPlayForMDX extends PostPlayForEpisodes
{
    private class FetchPostPlayForPlaybackCallback extends LoggingManagerCallback
    {

        final PostPlayForMDX this$0;

        public void onEpisodeDetailsFetched(EpisodeDetails episodedetails, int i)
        {
            super.onEpisodeDetailsFetched(episodedetails, i);
            if (i == 0 && episodedetails != null)
            {
                episodeDetails = episodedetails;
                updateViews(episodedetails);
                setMDXTargetName();
                transitionToPostPlay();
            }
        }

        public FetchPostPlayForPlaybackCallback()
        {
            this$0 = PostPlayForMDX.this;
            super("nf_postplay");
        }
    }


    private EpisodeDetails episodeDetails;
    private TextView mTargetNameView;

    PostPlayForMDX(PlayerActivity playeractivity)
    {
        super(playeractivity);
    }

    private Intent createIntent(String s)
    {
        if (mContext != null)
        {
            ServiceManager servicemanager = mContext.getServiceManager();
            if (servicemanager != null && ServiceManagerUtils.isMdxAgentAvailable(servicemanager))
            {
                return com.netflix.mediaclient.service.mdx.MdxAgent.Utils.createIntent(mContext, s, servicemanager.getMdx().getCurrentTarget());
            }
        }
        return null;
    }

    private void setMDXTargetName()
    {
        if (mTargetNameView != null)
        {
            Object obj = mContext.getServiceManager();
            if (obj != null && ServiceManagerUtils.isMdxAgentAvailable(((ServiceManager) (obj))))
            {
                obj = ServiceManagerUtils.getCurrentDeviceFriendlyName(((ServiceManager) (obj)));
                mTargetNameView.setText(((CharSequence) (obj)));
                if (mTargetNameView != null)
                {
                    mTargetNameView.setVisibility(0);
                }
                if (mBackground != null)
                {
                    mBackground.setVisibility(0);
                }
            }
        }
    }

    protected void findViews()
    {
        mTargetNameView = (TextView)mContext.findViewById(0x7f070171);
        mInfoTitleView = (TextView)mContext.findViewById(0x7f07016f);
    }

    public void handleInfoButtonPress()
    {
        if (hasVideos() && episodeDetails != null)
        {
            DetailsActivity.showEpisodeDetails(mContext, episodeDetails.getParentId(), episodeDetails.getId(), PlayContext.NFLX_MDX_CONTEXT);
        }
    }

    protected void handlePlayNow(boolean flag)
    {
        if (episodeDetails != null && mContext != null)
        {
            Asset asset = Asset.create(episodeDetails, PlayContext.DFLT_MDX_CONTEXT, PlayerActivity.PIN_VERIFIED.booleanValue());
            com.netflix.mediaclient.service.mdx.MdxAgent.Utils.playVideo(mContext, asset, true);
        }
        if (mContext != null)
        {
            mContext.finish();
        }
    }

    public void handleStop()
    {
        if (mContext != null)
        {
            mContext.startService(createIntent("com.netflix.mediaclient.intent.action.MDX_STOP"));
            mContext.finish();
        }
    }

    public boolean hasVideos()
    {
        return episodeDetails != null;
    }

    public void init(String s)
    {
        mTimerValue = mContext.getResources().getInteger(0x7f0b0008);
        mOffset = mTimerValue * 1000;
        if (!TextUtils.isEmpty(s) && mContext != null && mContext.getServiceManager() != null)
        {
            mContext.getServiceManager().fetchEpisodeDetails(s, new FetchPostPlayForPlaybackCallback());
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
            mStopButton.setVisibility(0);
        }
        if (mMoreButton != null)
        {
            mMoreButton.setVisibility(0);
        }
    }

    protected void initInfoContainer()
    {
        if (mInfoTitleView != null)
        {
            mInfoTitleView.setText(mContext.getResources().getText(0x7f0c01bf));
        }
        if (mTimerView != null)
        {
            mTimerView.setVisibility(8);
        }
    }

    protected boolean isAutoPlayEnabled()
    {
        return true;
    }

    protected void onTimerEnd()
    {
        mPlayButton.setEnabled(false);
        if (mContext != null)
        {
            mContext.finish();
        }
    }

    protected void setClickListeners()
    {
        super.setClickListeners();
        if (mStopButton != null)
        {
            mStopButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PostPlayForMDX this$0;

                public void onClick(View view)
                {
                    handleStop();
                }

            
            {
                this$0 = PostPlayForMDX.this;
                super();
            }
            });
        }
        if (mMoreButton != null)
        {
            mMoreButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PostPlayForMDX this$0;

                public void onClick(View view)
                {
                    handleInfoButtonPress();
                }

            
            {
                this$0 = PostPlayForMDX.this;
                super();
            }
            });
        }
    }


/*
    static EpisodeDetails access$002(PostPlayForMDX postplayformdx, EpisodeDetails episodedetails)
    {
        postplayformdx.episodeDetails = episodedetails;
        return episodedetails;
    }

*/

}
