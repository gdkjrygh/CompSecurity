// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.util.gfx.ImageLoader;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsDetailsActivity

public class KidsEpisodeViewGroup extends RelativeLayout
{

    private AdvancedImageView img;
    private TextView title;

    public KidsEpisodeViewGroup(Context context)
    {
        super(context);
        init();
    }

    public KidsEpisodeViewGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public KidsEpisodeViewGroup(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030034, this, true);
        img = (AdvancedImageView)findViewById(0x7f0700cc);
        img.setCornerRadius(getResources().getDimensionPixelSize(0x7f0a0075));
        title = (TextView)findViewById(0x7f0700cd);
    }

    public void update(final EpisodeDetails episode)
    {
        String s = getResources().getString(0x7f0c0181, new Object[] {
            Integer.valueOf(episode.getSeasonNumber()), Integer.valueOf(episode.getEpisodeNumber()), episode.getTitle()
        });
        title.setText(s);
        NetflixActivity.getImageLoader(getContext()).showImg(img, episode.getHorzDispUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, s, false, true);
        setOnClickListener(new android.view.View.OnClickListener() {

            final KidsEpisodeViewGroup this$0;
            final EpisodeDetails val$episode;

            public void onClick(View view)
            {
                view = (KidsDetailsActivity)getContext();
                PlaybackLauncher.startPlaybackAfterPIN(view, episode, view.getPlayContext());
            }

            
            {
                this$0 = KidsEpisodeViewGroup.this;
                episode = episodedetails;
                super();
            }
        });
    }
}
