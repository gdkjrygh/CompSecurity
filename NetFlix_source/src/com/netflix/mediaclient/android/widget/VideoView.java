// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.util.gfx.ImageLoader;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            AdvancedImageView, VideoDetailsClickListener

public class VideoView extends AdvancedImageView
    implements com.netflix.mediaclient.ui.lomo.VideoViewGroup.IVideoView
{

    public static final float LOMO_BOXART_HEIGHT_TO_WIDTH_RATIO = 1.43F;
    protected VideoDetailsClickListener clicker;
    protected PlayContext playContext;

    public VideoView(Context context)
    {
        super(context);
        init();
    }

    public VideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public VideoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        playContext = PlayContext.EMPTY_CONTEXT;
        setFocusable(true);
        clicker = new VideoDetailsClickListener((NetflixActivity)getContext(), this);
    }

    public PlayContext getPlayContext()
    {
        return playContext;
    }

    public void hide()
    {
        NetflixActivity.getImageLoader(getContext()).showImg(this, null, null, null, false, false);
        setVisibility(4);
        clicker.remove(this);
    }

    public void update(Video video, Trackable trackable, int i, boolean flag)
    {
        playContext = new PlayContextImp(trackable, i);
        String s;
        com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype;
        if (video.getBoxshotURL() == null)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        setVisibility(i);
        clicker.update(this, video);
        trackable = NetflixActivity.getImageLoader(getContext());
        s = video.getBoxshotURL();
        assettype = com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt;
        video = video.getTitle();
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        trackable.showImg(this, s, assettype, video, true, true, i);
    }

    public volatile void update(Object obj, Trackable trackable, int i, boolean flag)
    {
        update((Video)obj, trackable, i, flag);
    }
}
