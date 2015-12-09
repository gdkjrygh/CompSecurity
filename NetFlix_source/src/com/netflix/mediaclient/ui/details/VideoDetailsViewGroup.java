// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.servicemgr.FriendProfile;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.common.PlayContextProvider;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            NetflixRatingBar

public class VideoDetailsViewGroup extends LinearLayout
{
    public static interface DetailsStringProvider
    {

        public abstract CharSequence getBasicInfoString();

        public abstract CharSequence getCreatorsText();

        public abstract CharSequence getStarringText();
    }


    private static final String TAG = "VideoDetailsViewGroup";
    private View actionBarDummyView;
    private Button addToMyList;
    private TextView basicInfo;
    private TextView creators;
    private Drawable hdDrawable;
    private int hdDrawablePadding;
    private AdvancedImageView horzDispImg;
    private ViewGroup imgGroup;
    private NetflixRatingBar ratingBar;
    private LinearLayout socialGroup;
    private TextView socialTitle;
    private TextView starring;
    private TextView synopsis;
    private TextView title;

    public VideoDetailsViewGroup(Context context)
    {
        super(context);
        init();
    }

    public VideoDetailsViewGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public VideoDetailsViewGroup(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private Drawable buildHdDrawable()
    {
        Drawable drawable = getResources().getDrawable(0x7f0200bf);
        double d;
        if (drawable.getIntrinsicHeight() > 0)
        {
            d = (basicInfo.getHeight() * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight();
        } else
        {
            d = (double)basicInfo.getHeight() * 1.3D;
        }
        drawable.setBounds(new Rect(0, 0, (int)(float)d, basicInfo.getHeight()));
        return drawable;
    }

    private int getHdDrawablePadding()
    {
        return getResources().getDimensionPixelSize(0x7f0a002c);
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030087, this, true);
        setOrientation(1);
        actionBarDummyView = ViewUtils.createActionBarDummyView((NetflixActivity)getContext());
        addView(actionBarDummyView, 0);
        imgGroup = (ViewGroup)findViewById(0x7f0701a8);
        horzDispImg = (AdvancedImageView)findViewById(0x7f0701a1);
        ratingBar = (NetflixRatingBar)findViewById(0x7f07017e);
        title = (TextView)findViewById(0x7f0701aa);
        basicInfo = (TextView)findViewById(0x7f07017d);
        synopsis = (TextView)findViewById(0x7f0701a5);
        starring = (TextView)findViewById(0x7f0701a6);
        creators = (TextView)findViewById(0x7f0701a7);
        addToMyList = (Button)findViewById(0x7f0701a2);
        addToMyList.setEnabled(false);
        socialGroup = (LinearLayout)findViewById(0x7f0701a4);
        socialTitle = (TextView)findViewById(0x7f0701a3);
        hdDrawablePadding = getHdDrawablePadding();
        setImgLayoutListener();
    }

    private boolean isDeviceHd(Activity activity)
    {
        return ((NetflixActivity)activity).getServiceManager() != null && ((NetflixActivity)activity).getServiceManager().isDeviceHd();
    }

    private void setHdIcon()
    {
        basicInfo.setCompoundDrawablePadding(hdDrawablePadding);
        basicInfo.setCompoundDrawables(null, null, hdDrawable, null);
    }

    private void setImgLayoutListener()
    {
        getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final VideoDetailsViewGroup this$0;

            public void onGlobalLayout()
            {
                ViewUtils.removeGlobalLayoutListener(VideoDetailsViewGroup.this, this);
                Log.v("VideoDetailsViewGroup", (new StringBuilder()).append("img group width: ").append(imgGroup.getWidth()).append(", height: ").append(imgGroup.getHeight()).toString());
                android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)horzDispImg.getLayoutParams();
                layoutparams.height = (int)((float)imgGroup.getWidth() * 0.5625F);
                horzDispImg.setLayoutParams(layoutparams);
            }

            
            {
                this$0 = VideoDetailsViewGroup.this;
                super();
            }
        });
    }

    private void updateSocialGroup(VideoDetails videodetails)
    {
        videodetails = videodetails.getFacebookFriends();
        Object obj;
        boolean flag;
        byte byte0;
        if (videodetails == null || videodetails.size() <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = socialGroup;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((LinearLayout) (obj)).setVisibility(byte0);
        obj = socialTitle;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((TextView) (obj)).setVisibility(byte0);
        if (flag)
        {
            Log.v("VideoDetailsViewGroup", "No friends available for this detail view");
        } else
        {
            socialTitle.setText(getResources().getQuantityString(0x7f0e0001, videodetails.size(), new Object[] {
                Integer.valueOf(videodetails.size())
            }));
            int i = getResources().getDimensionPixelOffset(0x7f0a0055);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(i, i);
            i = getResources().getDimensionPixelOffset(0x7f0a0056);
            layoutparams.topMargin = i;
            layoutparams.bottomMargin = i;
            i /= 2;
            layoutparams.leftMargin = i;
            layoutparams.rightMargin = i;
            socialGroup.removeAllViews();
            int j = Math.min(videodetails.size(), 9);
            i = 0;
            while (i < j) 
            {
                FriendProfile friendprofile = (FriendProfile)videodetails.get(i);
                Log.v("VideoDetailsViewGroup", (new StringBuilder()).append("Updating img for friend: ").append(friendprofile.getFirstName()).append(", url: ").append(friendprofile.getImageUrl()).toString());
                AdvancedImageView advancedimageview = new AdvancedImageView(getContext());
                advancedimageview.setAdjustViewBounds(true);
                advancedimageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                socialGroup.addView(advancedimageview, layoutparams);
                NetflixActivity.getImageLoader(getContext()).showImg(advancedimageview, friendprofile.getImageUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.profileAvatar, friendprofile.getFullName(), false, true);
                i++;
            }
        }
    }

    public TextView getAddToMyListButton()
    {
        return addToMyList;
    }

    public void refreshImagesIfNecessary()
    {
        if (horzDispImg != null)
        {
            horzDispImg.refreshImageIfNecessary();
        }
    }

    public void removeActionBarDummyView()
    {
        if (actionBarDummyView != null)
        {
            removeView(actionBarDummyView);
            actionBarDummyView = null;
        }
    }

    public void updateDetails(final VideoDetails details, DetailsStringProvider detailsstringprovider)
    {
        final NetflixActivity activity = (NetflixActivity)getContext();
        Object obj = String.format(getResources().getString(0x7f0c0143), new Object[] {
            details.getTitle()
        });
        NetflixActivity.getImageLoader(activity).showImg(horzDispImg, details.getHorzDispUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, ((String) (obj)), true, true);
        horzDispImg.requestFocus();
        horzDispImg.setOnClickListener(new android.view.View.OnClickListener() {

            final VideoDetailsViewGroup this$0;
            final NetflixActivity val$activity;
            final VideoDetails val$details;

            public void onClick(View view)
            {
                PlaybackLauncher.startPlaybackAfterPIN(activity, details, ((PlayContextProvider)activity).getPlayContext());
            }

            
            {
                this$0 = VideoDetailsViewGroup.this;
                activity = netflixactivity;
                details = videodetails;
                super();
            }
        });
        title.setText(details.getTitle());
        basicInfo.setText(detailsstringprovider.getBasicInfoString());
        if (isDeviceHd(activity) && details.isVideoHd())
        {
            if (hdDrawable == null)
            {
                hdDrawable = buildHdDrawable();
            }
            setHdIcon();
        }
        ratingBar.setDetails(details);
        activity = details.getSynopsis();
        obj = synopsis;
        if (StringUtils.isEmpty(activity))
        {
            activity = "";
        } else
        {
            activity = Html.fromHtml(details.getSynopsis());
        }
        ((TextView) (obj)).setText(activity);
        starring.setText(detailsstringprovider.getStarringText());
        if (StringUtils.isNotEmpty(details.getCreators()))
        {
            creators.setText(detailsstringprovider.getCreatorsText());
            creators.setVisibility(0);
        } else
        {
            creators.setVisibility(8);
        }
        updateSocialGroup(details);
    }


}
