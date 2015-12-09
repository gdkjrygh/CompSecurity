// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;

public class KidsCharacterView extends RelativeLayout
    implements com.netflix.mediaclient.ui.lomo.VideoViewGroup.IVideoView
{

    private static final String TAG = "KidsCharacterView";
    private AdvancedImageView img;
    private PlayContext playContext;

    public KidsCharacterView(Context context, boolean flag)
    {
        super(context);
        setFocusable(true);
        int i = KidsUtils.computeCharacterViewSize((NetflixActivity)getContext(), flag);
        setLayoutParams(new android.widget.AbsListView.LayoutParams(i, i));
        playContext = PlayContext.EMPTY_CONTEXT;
        context = (NetflixActivity)getContext();
        context.getLayoutInflater().inflate(0x7f030032, this);
        img = (AdvancedImageView)findViewById(0x7f0700c2);
        img.setCornerRadius(getResources().getDimensionPixelSize(0x7f0a0075));
        flag = KidsUtils.isKidsWithUpDownScrolling(context);
        Log.v("KidsCharacterView", (new StringBuilder()).append("Setting padding, isSkidmark: ").append(flag).toString());
        if (flag)
        {
            img.setPadding(AndroidUtils.dipToPixels(context, 0), AndroidUtils.dipToPixels(context, 2), AndroidUtils.dipToPixels(context, 4), AndroidUtils.dipToPixels(context, 6));
            setPadding(0, 0, getResources().getDimensionPixelSize(0x7f0a007e), getResources().getDimensionPixelSize(0x7f0a007f));
            return;
        } else
        {
            img.setPadding(AndroidUtils.dipToPixels(context, 0), AndroidUtils.dipToPixels(context, 2), AndroidUtils.dipToPixels(context, 1), AndroidUtils.dipToPixels(context, 6));
            return;
        }
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

    public void update(final Video video, Trackable trackable, int i, boolean flag)
    {
        if (Log.isLoggable("KidsCharacterView", 2))
        {
            Log.v("KidsCharacterView", (new StringBuilder()).append("Updating for video: ").append(video.toString()).toString());
        }
        playContext = new PlayContextImp(trackable, i);
        setVisibility(0);
        trackable = NetflixActivity.getImageLoader(getContext());
        AdvancedImageView advancedimageview = img;
        String s = video.getSquareUrl();
        com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype = com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.bif;
        String s1 = video.getTitle();
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        trackable.showImg(advancedimageview, s, assettype, s1, false, true, i);
        setOnClickListener(new android.view.View.OnClickListener() {

            final KidsCharacterView this$0;
            final Video val$video;

            public void onClick(View view)
            {
                DetailsActivity.show((NetflixActivity)getContext(), video, playContext);
            }

            
            {
                this$0 = KidsCharacterView.this;
                video = video1;
                super();
            }
        });
    }

    public volatile void update(Object obj, Trackable trackable, int i, boolean flag)
    {
        update((Video)obj, trackable, i, flag);
    }

}
