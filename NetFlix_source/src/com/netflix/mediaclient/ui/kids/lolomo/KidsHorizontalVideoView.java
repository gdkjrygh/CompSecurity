// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.android.widget.VideoDetailsClickListener;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.util.gfx.ImageLoader;

public class KidsHorizontalVideoView extends RelativeLayout
    implements com.netflix.mediaclient.ui.lomo.VideoViewGroup.IVideoView
{

    private VideoDetailsClickListener clicker;
    private AdvancedImageView img;
    private PlayContext playContext;

    public KidsHorizontalVideoView(NetflixActivity netflixactivity, boolean flag)
    {
        super(netflixactivity);
        setFocusable(true);
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -1));
        playContext = PlayContext.EMPTY_CONTEXT;
        netflixactivity.getLayoutInflater().inflate(0x7f030037, this);
        img = (AdvancedImageView)findViewById(0x7f0700d2);
        img.setCornerRadius(netflixactivity.getResources().getDimensionPixelSize(0x7f0a0075));
        clicker = new VideoDetailsClickListener((NetflixActivity)getContext(), this);
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

    public void update(Video video, Trackable trackable, int i, boolean flag)
    {
        playContext = new PlayContextImp(trackable, i);
        clicker.update(this, video);
        AdvancedImageView advancedimageview;
        String s;
        com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype;
        if (video.getHorzDispUrl() == null)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        setVisibility(i);
        setContentDescription(video.getTitle());
        trackable = NetflixActivity.getImageLoader(getContext());
        advancedimageview = img;
        s = video.getHorzDispUrl();
        assettype = com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt;
        video = video.getTitle();
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        trackable.showImg(advancedimageview, s, assettype, video, false, true, i);
    }

    public volatile void update(Object obj, Trackable trackable, int i, boolean flag)
    {
        update((Video)obj, trackable, i, flag);
    }
}
