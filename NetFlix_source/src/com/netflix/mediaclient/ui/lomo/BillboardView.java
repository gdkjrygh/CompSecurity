// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.android.widget.VideoDetailsClickListener;
import com.netflix.mediaclient.service.webclient.model.BillboardDetails;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;

public class BillboardView extends RelativeLayout
    implements VideoViewGroup.IVideoView
{

    private static final String TAG = "BillboardView";
    private VideoDetailsClickListener detailsListener;
    private TextView info;
    private View infoButton;
    private View infoViewGroup;
    private boolean isTablet;
    private TextView label;
    private View playButton;
    private PlayContext playContext;
    private View shadowOverlay;
    private View shadowOverlayGradient;
    private boolean showArtworkOnly;
    private AdvancedImageView storyArt;
    private TextView synopsis;
    private AdvancedImageView tvCard;

    public BillboardView(Context context)
    {
        super(context);
        playContext = PlayContext.EMPTY_CONTEXT;
        isTablet = true;
        init();
    }

    public BillboardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        playContext = PlayContext.EMPTY_CONTEXT;
        isTablet = true;
        init();
    }

    public BillboardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        playContext = PlayContext.EMPTY_CONTEXT;
        isTablet = true;
        init();
    }

    private void init()
    {
        setFocusable(true);
        NetflixActivity netflixactivity = (NetflixActivity)getContext();
        detailsListener = new VideoDetailsClickListener(netflixactivity, this);
        netflixactivity.getLayoutInflater().inflate(0x7f03001a, this);
        if (netflixactivity.getServiceManager() != null)
        {
            isTablet = netflixactivity.getServiceManager().isTablet();
        }
        showArtworkOnly = shouldShowArtworkOnly(netflixactivity);
        if (Log.isLoggable("BillboardView", 2))
        {
            Log.v("BillboardView", (new StringBuilder()).append("isTablet: ").append(isTablet).append(", showArtworkOnly: ").append(showArtworkOnly).toString());
        }
        infoViewGroup = findViewById(0x7f07006e);
        label = (TextView)findViewById(0x7f07006f);
        info = (TextView)findViewById(0x7f070071);
        synopsis = (TextView)findViewById(0x7f070072);
        tvCard = (AdvancedImageView)findViewById(0x7f070070);
        storyArt = (AdvancedImageView)findViewById(0x7f07006b);
        int i;
        if (showArtworkOnly)
        {
            i = 0;
        } else
        {
            i = DeviceUtils.getScreenWidthInPixels(netflixactivity) / 3;
        }
        storyArt.setPadding(i, 0, 0, 0);
        shadowOverlay = findViewById(0x7f07006c);
        ((android.widget.RelativeLayout.LayoutParams)shadowOverlay.getLayoutParams()).width = i;
        shadowOverlayGradient = findViewById(0x7f07006d);
        ((android.widget.RelativeLayout.LayoutParams)shadowOverlayGradient.getLayoutParams()).leftMargin = i;
        playButton = findViewById(0x7f070074);
        infoButton = findViewById(0x7f070075);
        updateViewVisibility();
        getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final BillboardView this$0;

            public void onGlobalLayout()
            {
                if (!((NetflixActivity)getContext()).destroyed())
                {
                    if (Log.isLoggable("BillboardView", 2))
                    {
                        Log.v("BillboardView", (new StringBuilder()).append("vg height: ").append(infoViewGroup.getHeight()).append(", h: ").append(getHeight()).toString());
                    }
                    if (getHeight() > 0 && infoViewGroup.getHeight() >= getHeight())
                    {
                        Log.d("BillboardView", "Info view group is larger than view height - hiding some text");
                        label.setVisibility(8);
                        info.setVisibility(8);
                    }
                    if (getHeight() > 0)
                    {
                        ViewUtils.removeGlobalLayoutListener(BillboardView.this, this);
                        return;
                    }
                }
            }

            
            {
                this$0 = BillboardView.this;
                super();
            }
        });
    }

    public static boolean shouldShowArtworkOnly(NetflixActivity netflixactivity)
    {
        boolean flag = true;
        if (netflixactivity.getServiceManager() != null)
        {
            flag = netflixactivity.getServiceManager().isTablet();
        }
        return !flag && DeviceUtils.isPortrait(netflixactivity);
    }

    private void updateViewVisibility()
    {
        boolean flag = false;
        Object obj = infoViewGroup;
        int i;
        if (showArtworkOnly)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        obj = shadowOverlay;
        if (showArtworkOnly)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        obj = shadowOverlayGradient;
        if (showArtworkOnly)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        storyArt.setVisibility(0);
        obj = label;
        if (isTablet)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = synopsis;
        if (isTablet)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((TextView) (obj)).setVisibility(i);
    }

    public PlayContext getPlayContext()
    {
        return playContext;
    }

    public void hide()
    {
        NetflixActivity.getImageLoader(getContext()).showImg(tvCard, null, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, null, false, false);
        NetflixActivity.getImageLoader(getContext()).showImg(storyArt, null, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.merchStill, null, false, false);
        setVisibility(4);
        detailsListener.remove(storyArt);
    }

    public void update(final BillboardDetails video, Trackable trackable, int i, boolean flag)
    {
        final ServiceManager serviceMan = ((NetflixActivity)getContext()).getServiceManager();
        playContext = new PlayContextImp(trackable, i);
        if (Log.isLoggable("BillboardView", 2))
        {
            Log.v("BillboardView", (new StringBuilder()).append("updating billboard, title: ").append(video.getTitle()).append(", story url: ").append(video.getStoryUrl()).toString());
        }
        setVisibility(0);
        trackable = String.format(getResources().getString(0x7f0c0143), new Object[] {
            video.getTitle()
        });
        setContentDescription(trackable);
        if (showArtworkOnly)
        {
            storyArt.setPressedStateHandlerEnabled(true);
            detailsListener.update(storyArt, video);
            NetflixActivity.getImageLoader(getContext()).showImg(storyArt, video.getHorzDispUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.merchStill, trackable, true, true, 1);
        } else
        {
            storyArt.setPressedStateHandlerEnabled(false);
            detailsListener.remove(storyArt);
            NetflixActivity.getImageLoader(getContext()).showImg(storyArt, video.getStoryUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.merchStill, trackable, true, true, 1);
            NetflixActivity.getImageLoader(getContext()).showImg(tvCard, video.getTvCardUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, trackable, false, true, 1);
            TextView textview = info;
            if (video.getType() == VideoType.MOVIE)
            {
                trackable = StringUtils.getBasicInfoString(getContext(), video);
            } else
            {
                trackable = StringUtils.getBasicInfoString(getContext(), video);
            }
            textview.setText(trackable);
            synopsis.setText(video.getSynopsis());
            playButton.setOnClickListener(new android.view.View.OnClickListener() {

                final BillboardView this$0;
                final ServiceManager val$serviceMan;
                final BillboardDetails val$video;

                public void onClick(View view)
                {
                    if (serviceMan != null && serviceMan.isReady())
                    {
                        serviceMan.logBillboardActivity(video, com.netflix.mediaclient.service.browse.BrowseAgent.BillboardActivityType.ACTION);
                    }
                    PlaybackLauncher.getDetailsAndStartPlayback((NetflixActivity)getContext(), video, playContext);
                }

            
            {
                this$0 = BillboardView.this;
                serviceMan = servicemanager;
                video = billboarddetails;
                super();
            }
            });
            infoButton.setOnClickListener(new android.view.View.OnClickListener() {

                final BillboardView this$0;
                final ServiceManager val$serviceMan;
                final BillboardDetails val$video;

                public void onClick(View view)
                {
                    if (serviceMan != null && serviceMan.isReady())
                    {
                        serviceMan.logBillboardActivity(video, com.netflix.mediaclient.service.browse.BrowseAgent.BillboardActivityType.ACTION);
                    }
                    DetailsActivity.show((NetflixActivity)getContext(), video, playContext);
                }

            
            {
                this$0 = BillboardView.this;
                serviceMan = servicemanager;
                video = billboarddetails;
                super();
            }
            });
        }
        if (serviceMan != null && serviceMan.isReady())
        {
            Log.v("BillboardView", (new StringBuilder()).append("Loggin billboard impression for video: ").append(video.getId()).toString());
            serviceMan.logBillboardActivity(video, com.netflix.mediaclient.service.browse.BrowseAgent.BillboardActivityType.IMPRESSION);
        }
    }

    public volatile void update(Object obj, Trackable trackable, int i, boolean flag)
    {
        update((BillboardDetails)obj, trackable, i, flag);
    }




}
