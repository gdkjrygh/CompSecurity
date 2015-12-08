// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.accuweather.android.fragments.VideoDetailsFragment;
import com.accuweather.android.models.VideoModel;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import java.util.List;

// Referenced classes of package com.accuweather.android:
//            WeatherActivity

public class VideoDetailsActivity extends WeatherActivity
    implements com.accuweather.android.fragments.VideoDetailsFragment.IVideoDetailsFragmentListener, com.accuweather.android.adapters.VideoFragmentAdapter.IVideoFragmentAdapterListener
{

    private VideoDetailsFragment mVideoFragment;

    public VideoDetailsActivity()
    {
    }

    private void init(int i)
    {
        mVideoFragment = (VideoDetailsFragment)getSupportFragmentManager().findFragmentById(R.id.video_fragment);
        mVideoFragment.setUrl(((VideoModel)getData().getCurrentlyViewedWeatherDataModel().getVideos().get(i)).getUrl());
    }

    private void initActionBar()
    {
        LocationModel locationmodel = getData().getLocationFromKey(getData().getCurrentlyViewedWeatherDataModel().getLocationKey());
        ActionBar actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_gradient));
        actionbar.setTitle(getString(R.string.Videos));
        actionbar.setSubtitle(locationmodel.getAliasedName());
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayUseLogoEnabled(false);
        actionbar.setIcon(R.drawable.ic_actionbar_video);
    }

    protected boolean isLockedInPortraitMode()
    {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Logger.i(this);
        setContentView(R.layout.video_activity);
        init(getIntent().getIntExtra("start_index", 0));
    }

    public void onDestroy()
    {
        super.onDestroy();
        Logger.i(this);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
        }
        return super.onMenuItemSelected(i, menuitem);
    }

    public void onPause()
    {
        super.onPause();
        Logger.i(this);
    }

    public void onPrimaryItem(int i)
    {
    }

    public void onResume()
    {
        super.onResume();
        Logger.i(this);
    }

    public void onStart()
    {
        super.onStart();
        Logger.i(this);
        init(getIntent().getIntExtra("start_index", 0));
        initActionBar();
    }

    public void onStop()
    {
        super.onStop();
        Logger.i(this);
    }

    public void onVideoCompleted()
    {
        finish();
    }

    protected boolean shouldShowBannerAds()
    {
        return false;
    }
}
