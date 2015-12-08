// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.android.widget.VideoDetailsClickListener;
import com.netflix.mediaclient.servicemgr.CWVideo;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.util.gfx.ImageLoader;

public class CwView extends RelativeLayout
    implements VideoViewGroup.IVideoView
{

    public static final float CW_IMG_HEIGHT_TO_WIDTH_RATIO = 0.5625F;
    private static final String TAG = "CwView";
    private VideoDetailsClickListener clicker;
    private AdvancedImageView img;
    private ImageView info;
    private PlayContext playContext;
    private ProgressBar progress;
    private TextView title;

    public CwView(Context context)
    {
        super(context);
        init();
    }

    public CwView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public CwView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        setFocusable(true);
        playContext = PlayContext.EMPTY_CONTEXT;
        NetflixActivity netflixactivity = (NetflixActivity)getContext();
        netflixactivity.getLayoutInflater().inflate(0x7f030028, this);
        title = (TextView)findViewById(0x7f07008e);
        img = (AdvancedImageView)findViewById(0x7f07008b);
        progress = (ProgressBar)findViewById(0x7f070090);
        info = (ImageView)findViewById(0x7f07008f);
        clicker = new VideoDetailsClickListener(netflixactivity, this);
    }

    public PlayContext getPlayContext()
    {
        return playContext;
    }

    public void hide()
    {
        NetflixActivity.getImageLoader(getContext()).showImg(img, null, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.bif, null, false, false);
        setVisibility(4);
        clicker.remove(this);
    }

    public void setInfoViewId(int i)
    {
        info.setId(i);
    }

    public void update(final CWVideo video, Trackable trackable, int i, boolean flag)
    {
        if (Log.isLoggable("CwView", 2))
        {
            Log.v("CwView", (new StringBuilder()).append("Updating for video: ").append(video.toString()).toString());
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
        s = video.getStillUrl();
        assettype = com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.bif;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        imageloader.showImg(advancedimageview, s, assettype, trackable, true, true, i);
        if (video.getRuntime() > 0)
        {
            i = (video.getPlayableBookmarkPosition() * 100) / video.getRuntime();
        } else
        {
            i = 0;
        }
        progress.setProgress(i);
        setOnClickListener(new android.view.View.OnClickListener() {

            final CwView this$0;
            final CWVideo val$video;

            public void onClick(View view)
            {
                PlaybackLauncher.startPlaybackAfterPIN((NetflixActivity)getContext(), video, playContext);
            }

            
            {
                this$0 = CwView.this;
                video = cwvideo;
                super();
            }
        });
        info.setContentDescription(String.format(getResources().getString(0x7f0c016d), new Object[] {
            video.getTitle()
        }));
        clicker.update(info, video);
    }

    public volatile void update(Object obj, Trackable trackable, int i, boolean flag)
    {
        update((CWVideo)obj, trackable, i, flag);
    }

}
