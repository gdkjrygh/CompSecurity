// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.servicemgr.CWVideo;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;

public class KidsHorizontalCwView extends RelativeLayout
    implements com.netflix.mediaclient.ui.lomo.VideoViewGroup.IVideoView
{

    private static final String TAG = "KidsHorizontalCwView";
    private AdvancedImageView img;
    private PlayContext playContext;
    private TextView title;

    public KidsHorizontalCwView(Context context, boolean flag)
    {
        super(context);
        setFocusable(true);
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, KidsUtils.computeHorizontalRowHeight((NetflixActivity)getContext(), flag)));
        playContext = PlayContext.EMPTY_CONTEXT;
        ((Activity)getContext()).getLayoutInflater().inflate(0x7f030036, this);
        title = (TextView)findViewById(0x7f0700d1);
        img = (AdvancedImageView)findViewById(0x7f0700cf);
        img.setCornerRadius(getResources().getDimensionPixelSize(0x7f0a0075));
    }

    public PlayContext getPlayContext()
    {
        return playContext;
    }

    public void hide()
    {
        NetflixActivity.getImageLoader(getContext()).showImg(img, null, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.bif, null, false, false);
        setVisibility(4);
    }

    public void update(final CWVideo video, Trackable trackable, int i, boolean flag)
    {
        if (Log.isLoggable("KidsHorizontalCwView", 2))
        {
            Log.v("KidsHorizontalCwView", (new StringBuilder()).append("Updating for video: ").append(video.toString()).toString());
        }
        playContext = new PlayContextImp(trackable, i);
        setVisibility(0);
        trackable = String.format(getResources().getString(0x7f0c0143), new Object[] {
            video.getTitle()
        });
        setContentDescription(trackable);
        ImageLoader imageloader;
        AdvancedImageView advancedimageview;
        String s;
        com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype;
        if (VideoType.SHOW.equals(video.getType()))
        {
            title.setText(getContext().getString(0x7f0c0182, new Object[] {
                video.getTitle(), Integer.valueOf(video.getCurrentSeasonNumber()), Integer.valueOf(video.getCurrentEpisodeNumber())
            }));
        } else
        {
            title.setText(video.getTitle());
        }
        imageloader = NetflixActivity.getImageLoader(getContext());
        advancedimageview = img;
        s = video.getInterestingUrl();
        assettype = com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.bif;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        imageloader.showImg(advancedimageview, s, assettype, trackable, false, true, i);
        setOnClickListener(new android.view.View.OnClickListener() {

            final KidsHorizontalCwView this$0;
            final CWVideo val$video;

            public void onClick(View view)
            {
                PlaybackLauncher.startPlaybackAfterPIN((NetflixActivity)getContext(), video, playContext);
            }

            
            {
                this$0 = KidsHorizontalCwView.this;
                video = cwvideo;
                super();
            }
        });
    }

    public volatile void update(Object obj, Trackable trackable, int i, boolean flag)
    {
        update((CWVideo)obj, trackable, i, flag);
    }

}
