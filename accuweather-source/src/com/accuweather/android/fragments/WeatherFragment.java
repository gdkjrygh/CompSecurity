// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.accuweather.android.ias.AmazonUtilities;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.utilities.Data;

public abstract class WeatherFragment extends Fragment
{
    private class FragmentBroadcastReceiver extends BroadcastReceiver
    {

        final WeatherFragment this$0;

        public void onReceive(Context context, Intent intent)
        {
            WeatherFragment.this.onReceive(intent);
        }

        private FragmentBroadcastReceiver()
        {
            this$0 = WeatherFragment.this;
            super();
        }

    }


    public static final String BULLET = "\u2022";
    protected static final String CONTENT = "content";
    protected static final String TAG = "tag";
    protected static final String TITLE = "title";
    private FragmentBroadcastReceiver mReceiver;
    protected String mTitle;
    protected WeatherDataModel mWeatherDataModel;

    public WeatherFragment()
    {
    }

    protected Data getData()
    {
        return Data.getInstance(getActivity());
    }

    protected boolean isInitialized()
    {
        return getActivity() != null && getView() != null;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    public abstract void onReceive(Intent intent);

    public void onStart()
    {
        super.onStart();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("accuwx.intent.action.UPDATE_FRAGMENT");
        intentfilter.addAction("accuwx.intent.action.UPDATE_LOCATION_AUTOCOMPLETE");
        intentfilter.addAction("accuwx.intent.action.UPDATE_NOW_FRAGMENT");
        if (AmazonUtilities.shouldShowAmazonProducts(getActivity()))
        {
            intentfilter.addAction("accuwx.intent.action.UPDATE_AMAZON_PRODUCTS");
        }
        if (mReceiver == null)
        {
            mReceiver = new FragmentBroadcastReceiver();
        }
        getActivity().registerReceiver(mReceiver, intentfilter);
    }

    public void onStop()
    {
        super.onStop();
        getActivity().unregisterReceiver(mReceiver);
        mReceiver = null;
    }

    public void updateView()
    {
    }
}
