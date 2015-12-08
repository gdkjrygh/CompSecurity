// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.accuweather.android.adapters.AlertsListAdapter;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import java.util.List;

public class AlertsFragment extends ListFragment
{

    private AlertsListAdapter mAdapter;
    private List mAlertModels;
    private Context mContext;
    private ListView mListView;

    public AlertsFragment()
    {
    }

    private Data getData()
    {
        return Data.getInstance(getActivity());
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mListView.setAdapter(mAdapter);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Logger.i(this, "oncreate alertsfragment");
        mAlertModels = getData().getCurrentlyViewedWeatherDataModel().getAlerts();
        mAdapter = new AlertsListAdapter(getActivity(), 0x102000a, mAlertModels);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Logger.i(this, "oncreateview alertsfragment");
        layoutinflater = layoutinflater.inflate(com.accuweather.android.R.layout.alerts_list, viewgroup, false);
        mListView = (ListView)layoutinflater.findViewById(0x102000a);
        return layoutinflater;
    }

    public void setAlerts(Context context, List list)
    {
        Logger.i(this, "setAlerts()");
        mAlertModels = list;
        mContext = context;
    }
}
