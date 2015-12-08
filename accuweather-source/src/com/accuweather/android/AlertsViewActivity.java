// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.accuweather.android.fragments.AlertsFragment;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;

public class AlertsViewActivity extends SherlockFragmentActivity
{

    private Context mContext;

    public AlertsViewActivity()
    {
    }

    private Data getData()
    {
        return Data.getInstance(getApplication());
    }

    private void init()
    {
        ((AlertsFragment)getSupportFragmentManager().findFragmentById(R.id.alert_fragment)).setAlerts(mContext, getData().getCurrentlyViewedWeatherDataModel().getAlerts());
    }

    private void initActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_gradient));
        actionbar.setTitle(getString(R.string.WeatherAlert).toUpperCase(getResources().getConfiguration().locale));
        actionbar.setSubtitle(getData().getCurrentlyViewedWeatherDataModel().getCityName());
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayUseLogoEnabled(true);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.alerts_container);
        mContext = this;
        init();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            Logger.i(this);
            getData().clearTaskQueue();
            finish();
        }
        return super.onMenuItemSelected(i, menuitem);
    }

    public void onPause()
    {
        super.onPause();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onStart()
    {
        super.onStart();
        initActionBar();
    }

    public void onStop()
    {
        super.onStop();
    }
}
