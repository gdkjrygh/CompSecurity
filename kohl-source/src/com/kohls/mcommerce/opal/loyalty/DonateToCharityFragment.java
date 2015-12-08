// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.analytics.utils.enums.ScreenNames;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.wallet.asynctask.CharityAsyncTask;
import com.kohls.mcommerce.opal.wallet.manager.DataActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.AllCharityResponse;

public class DonateToCharityFragment extends Fragment
    implements DataActionListener
{

    private CharityListAdapter mAdapter;
    private ListView mCharityListView;
    private String mListPosition;
    private View mParentView;
    private BroadcastReceiver mUpdateUIReceiver;

    public DonateToCharityFragment()
    {
        mUpdateUIReceiver = new _cls1();
    }

    private void setUpActionBar()
    {
        ActionBar actionbar = getActivity().getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(getResources().getString(0x7f080512));
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.show();
        }
    }

    private void setupView(Object obj)
    {
        ((ProgressBar)mParentView.findViewById(0x7f0d0118)).setVisibility(8);
        mCharityListView.setVisibility(0);
        obj = (AllCharityResponse)obj;
        if (obj == null)
        {
            return;
        }
    /* block-local class not found */
    class CharityListAdapter {}

        mAdapter = new CharityListAdapter(((AllCharityResponse) (obj)), getActivity());
        mCharityListView.setHeaderDividersEnabled(true);
        mCharityListView.setFooterDividersEnabled(true);
        if (getArguments() != null)
        {
            mListPosition = getArguments().getString("position");
        }
        mCharityListView.setAdapter(mAdapter);
        mParentView.findViewById(0x7f0d003f).setVisibility(0);
        mParentView.findViewById(0x7f0d00d8).setVisibility(0);
        mCharityListView.setOnItemClickListener(new _cls2(((AllCharityResponse) (obj))));
    }

    public void onActionPerformed(Object obj)
    {
        setupView(obj);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mParentView = layoutinflater.inflate(0x7f030070, viewgroup, false);
        mCharityListView = (ListView)mParentView.findViewById(0x7f0d027b);
        ((ProgressBar)mParentView.findViewById(0x7f0d0118)).setVisibility(0);
        ListenerManager.getInstance().registerListener(this, "charitydata");
        (new CharityAsyncTask(getActivity())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        setUpActionBar();
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(mUpdateUIReceiver, new IntentFilter("signin_page"));
        return mParentView;
    }

    public void onDestroy()
    {
        super.onDestroy();
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(mUpdateUIReceiver);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ListenerManager.getInstance().unRegisterListener("charitydata", this);
    }

    public void onResume()
    {
        if (getArguments() != null)
        {
            mListPosition = getArguments().getString("position");
            if (mAdapter != null)
            {
                mAdapter.notifyDataSetChanged();
            }
        }
        super.onResume();
    }

    public void onStart()
    {
        super.onStart();
        AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_DONATE_LANDING_PAGE);
    }



/*
    static String access$002(DonateToCharityFragment donatetocharityfragment, String s)
    {
        donatetocharityfragment.mListPosition = s;
        return s;
    }

*/

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
