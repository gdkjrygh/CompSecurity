// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.common.PlayContextProvider;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.TimeUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;

public class KidsDetailsViewGroup extends LinearLayout
{

    private static final String TAG = "KidsDetailsViewGroup";
    private AdvancedImageView img;
    private ViewGroup imgGroup;
    private View imgOverlay;
    private TextView imgTitle;
    private TextView info;
    private ViewGroup infoGroup;
    private TextView rating;
    private TextView synopsis;

    public KidsDetailsViewGroup(Context context)
    {
        super(context);
        init();
    }

    public KidsDetailsViewGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public KidsDetailsViewGroup(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030033, this, true);
        setOrientation(1);
        setBackgroundColor(getContext().getResources().getColor(0x7f090073));
        imgGroup = (ViewGroup)findViewById(0x7f0700c3);
        imgGroup.getLayoutParams().height = DeviceUtils.getScreenWidthInPixels(getContext());
        int i = getResources().getDimensionPixelSize(0x7f0a0075);
        img = (AdvancedImageView)findViewById(0x7f0700c5);
        img.setCornerRadius(i);
        imgOverlay = findViewById(0x7f0700c6);
        imgTitle = (TextView)findViewById(0x7f0700c7);
        infoGroup = (ViewGroup)findViewById(0x7f0700c8);
        rating = (TextView)findViewById(0x7f0700c9);
        info = (TextView)findViewById(0x7f0700ca);
        synopsis = (TextView)findViewById(0x7f0700cb);
    }

    private static void setTextAndVisibility(TextView textview, String s)
    {
        textview.setText(s);
        byte byte0;
        if (StringUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    private void updateSharedDetails(final VideoDetails details)
    {
        Log.v("KidsDetailsViewGroup", (new StringBuilder()).append("Updating details for video: ").append(details.getTitle()).toString());
        infoGroup.setVisibility(0);
        imgOverlay.setVisibility(8);
        imgTitle.setVisibility(8);
        rating.setText(details.getCertification());
        setTextAndVisibility(synopsis, details.getSynopsis());
        NetflixActivity.getImageLoader(getContext()).showImg(img, details.getSquareUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, details.getTitle(), false, true);
        img.setOnClickListener(new android.view.View.OnClickListener() {

            final KidsDetailsViewGroup this$0;
            final VideoDetails val$details;

            public void onClick(View view)
            {
                view = (NetflixActivity)getContext();
                PlaybackLauncher.startPlaybackAfterPIN(view, details, ((PlayContextProvider)view).getPlayContext());
            }

            
            {
                this$0 = KidsDetailsViewGroup.this;
                details = videodetails;
                super();
            }
        });
    }

    public void updateDetails(final KidsCharacterDetails details)
    {
        Log.v("KidsDetailsViewGroup", (new StringBuilder()).append("Updating details for character: ").append(details.getTitle()).toString());
        infoGroup.setVisibility(8);
        imgOverlay.setVisibility(0);
        imgTitle.setVisibility(0);
        imgTitle.setText(details.getPlayableTitle());
        setTextAndVisibility(synopsis, details.getCharacterSynopsis());
        NetflixActivity.getImageLoader(getContext()).showImg(img, details.getWatchNextDispUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, details.getTitle(), false, true);
        img.setOnClickListener(new android.view.View.OnClickListener() {

            final KidsDetailsViewGroup this$0;
            final KidsCharacterDetails val$details;

            public void onClick(View view)
            {
                view = (NetflixActivity)getContext();
                PlaybackLauncher.startPlaybackAfterPIN(view, details, ((PlayContextProvider)view).getPlayContext());
            }

            
            {
                this$0 = KidsDetailsViewGroup.this;
                details = kidscharacterdetails;
                super();
            }
        });
    }

    public void updateDetails(MovieDetails moviedetails)
    {
        updateSharedDetails(moviedetails);
        info.setText(String.format(getResources().getString(0x7f0c0059), new Object[] {
            Integer.valueOf(TimeUtils.convertSecondsToMinutes(moviedetails.getRuntime()))
        }));
    }

    public void updateDetails(ShowDetails showdetails)
    {
        updateSharedDetails(showdetails);
        info.setText(String.format(getResources().getString(0x7f0c0056), new Object[] {
            Integer.valueOf(showdetails.getNumOfEpisodes())
        }));
    }
}
