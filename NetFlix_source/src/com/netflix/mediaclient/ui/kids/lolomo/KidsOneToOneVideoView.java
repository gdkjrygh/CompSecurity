// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.app.Activity;
import android.content.Context;
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

public class KidsOneToOneVideoView extends RelativeLayout
    implements com.netflix.mediaclient.ui.lomo.VideoViewGroup.IVideoView
{

    private VideoDetailsClickListener clicker;
    private AdvancedImageView mainImage;
    private PlayContext playContext;
    private AdvancedImageView tvCard;

    public KidsOneToOneVideoView(Context context, boolean flag)
    {
        super(context);
        ((Activity)context).getLayoutInflater().inflate(0x7f030039, this);
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -1));
        mainImage = (AdvancedImageView)findViewById(0x7f0700d7);
        mainImage.setCornerRadius(context.getResources().getDimensionPixelSize(0x7f0a0075));
        mainImage.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        tvCard = (AdvancedImageView)findViewById(0x7f0700d9);
        tvCard.setPressedStateHandlerEnabled(false);
        mainImage.setFocusable(true);
        tvCard.setFocusable(true);
        clicker = new VideoDetailsClickListener((NetflixActivity)getContext(), this);
    }

    public PlayContext getPlayContext()
    {
        return playContext;
    }

    public void hide()
    {
        NetflixActivity.getImageLoader(getContext()).showImg(mainImage, null, null, null, false, false);
        NetflixActivity.getImageLoader(getContext()).showImg(tvCard, null, null, null, false, false);
        setVisibility(4);
        clicker.remove(this);
    }

    public void update(Video video, Trackable trackable, int i, boolean flag)
    {
        playContext = new PlayContextImp(trackable, i);
        clicker.update(this, video);
        setVisibility(0);
        setContentDescription(video.getTitle());
        trackable = NetflixActivity.getImageLoader(getContext());
        AdvancedImageView advancedimageview = mainImage;
        String s = video.getSquareUrl();
        com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype = com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt;
        String s1 = video.getTitle();
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        trackable.showImg(advancedimageview, s, assettype, s1, false, true, i);
        trackable = NetflixActivity.getImageLoader(getContext());
        advancedimageview = tvCard;
        s = video.getTvCardUrl();
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
