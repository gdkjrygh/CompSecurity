// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.Session;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.wallet.adapter.WalletAdapter;
import com.kohls.mcommerce.opal.wallet.asynctask.GetAllWalletDataTask;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public abstract class BaseWalletFragment extends Fragment
{

    private WalletAdapter mAdapter;
    protected BroadcastReceiver mKohlscashDeletedReceiver;
    protected BroadcastReceiver mOffersDeletedReceiver;
    private View mProgressbarContainer;
    protected BroadcastReceiver mUpdateUIReceiver;

    public BaseWalletFragment()
    {
        mUpdateUIReceiver = new BroadcastReceiver() {

            final BaseWalletFragment this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (getActivity() != null) goto _L2; else goto _L1
_L1:
                return;
_L2:
                if (Appconfig.map.get(context = intent.getStringExtra("notificationID")) != null) goto _L1; else goto _L3
_L3:
                Appconfig.map.put(context, context);
                if (TextUtils.isEmpty(intent.getStringExtra("createwallet")) || !intent.getStringExtra("createwallet").equalsIgnoreCase("createwallet")) goto _L5; else goto _L4
_L4:
                if (TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref()) || Appconfig.isSignInShown) goto _L1; else goto _L6
_L6:
                int i;
                if (mAdapter != null && mAdapter.walletData != null && mAdapter.getCount() > 0)
                {
                    mAdapter.walletData.clear();
                    mAdapter.notifyDataSetChanged();
                }
                i = intent.getIntExtra("position", -1);
                if (i < 0) goto _L8; else goto _L7
_L7:
                if (i != Constants.POSITION_OF_CASH_TAB_IN_WALLET) goto _L10; else goto _L9
_L9:
            /* block-local class not found */
            class _cls1 {}

                (new Handler()).postDelayed(new _cls1(), 1000L);
_L8:
                loadWalletData(true);
                return;
_L10:
            /* block-local class not found */
            class _cls2 {}

            /* block-local class not found */
            class _cls3 {}

                if (i == Constants.POSITION_OF_OFFERS_TAB_IN_WALLET)
                {
                    (new Handler()).postDelayed(new _cls2(), 1000L);
                } else
                if (i == Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET)
                {
                    (new Handler()).postDelayed(new _cls3(), 1000L);
                }
                if (true) goto _L8; else goto _L5
_L5:
                context = getActivity().getApplicationContext();
                getActivity().finish();
                context = new Intent(context, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
                context.putExtra("open_screen_key", "open_my_wallet");
                startActivity(context);
                return;
            }

            
            {
                this$0 = BaseWalletFragment.this;
                super();
            }
        };
        mKohlscashDeletedReceiver = new BroadcastReceiver() {

            final BaseWalletFragment this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (getActivity() == null)
                {
                    return;
                } else
                {
                    loadModifiedData();
                    return;
                }
            }

            
            {
                this$0 = BaseWalletFragment.this;
                super();
            }
        };
        mOffersDeletedReceiver = new BroadcastReceiver() {

            final BaseWalletFragment this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (getActivity() == null)
                {
                    return;
                } else
                {
                    loadModifiedData();
                    return;
                }
            }

            
            {
                this$0 = BaseWalletFragment.this;
                super();
            }
        };
    }

    protected abstract View doOnCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle);

    public Date getCustomDate(String s, String s1)
        throws ParseException
    {
        try
        {
            s1 = new SimpleDateFormat(s1);
            s1.setLenient(true);
            s = s1.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    protected abstract View getProgressbarContainer();

    protected boolean isUserEnrolledToLoyalty()
    {
        return !TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref());
    }

    public void loadModifiedData()
    {
        if (getProgressbarContainer() != null)
        {
            mProgressbarContainer = getProgressbarContainer();
            if (mProgressbarContainer.getVisibility() != 0)
            {
                mProgressbarContainer.setVisibility(0);
            }
        }
        setupView();
    }

    public void loadWalletData(boolean flag)
    {
        if (getProgressbarContainer() != null && flag)
        {
            mProgressbarContainer = getProgressbarContainer();
            if (mProgressbarContainer.getVisibility() != 0)
            {
                mProgressbarContainer.setVisibility(0);
            }
        }
        (new GetAllWalletDataTask(getActivity(), true)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1)
        {
            Session.getActiveSession().onActivityResult(getActivity(), i, j, intent);
            loadWalletData(true);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(mUpdateUIReceiver);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(mUpdateUIReceiver, new IntentFilter("signin_page"));
        return doOnCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroyView()
    {
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(mUpdateUIReceiver);
        super.onDestroyView();
    }

    public void onResume()
    {
        super.onResume();
        if (Constants.KOHLCASH_MODIFIED)
        {
            LocalBroadcastManager.getInstance(getActivity().getApplicationContext()).sendBroadcast(new Intent("kohlscash_deleted"));
            Constants.KOHLCASH_MODIFIED = false;
        } else
        {
            if (Constants.OFFERS_MODIFIED)
            {
                LocalBroadcastManager.getInstance(getActivity().getApplicationContext()).sendBroadcast(new Intent("offers_deleted"));
                Constants.OFFERS_MODIFIED = false;
                return;
            }
            if (Constants.GIFT_CARD_MODIFIED)
            {
                LocalBroadcastManager.getInstance(getActivity().getApplicationContext()).sendBroadcast(new Intent("giftcard_deleted"));
                Constants.GIFT_CARD_MODIFIED = false;
                return;
            }
        }
    }

    public abstract void setupView();

}
