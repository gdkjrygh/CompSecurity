// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.os.Bundle;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.AddressUtil;
import com.dominos.android.sdk.common.AmazonUtil;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.dialogs.StoreInfoDialog;
import com.dominos.dialogs.StoreInfoDialog_;
import com.dominos.fragments.map.GoogleMapFragment_;
import com.dominos.fragments.map.MapWebViewFragment_;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.views.ToolBarView;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, CartActivity_, MapActivity_

public class StoreProfileActivity extends BaseActivity
{

    public static final String STORE_INFO_ADDRESS = "address";
    public static final String STORE_INFO_CARRYOUT_HOURS = "carryoutHours";
    public static final String STORE_INFO_DELIVERY_HOURS = "deliveryHours";
    public static final String STORE_INFO_DIALOG = "StoreInfoDialog";
    public static final String STORE_INFO_STORE_NUMBER = "storeNumber";
    public static final String STORE_INFO_STORE_PHONE = "phone";
    Bundle mBundle;
    private LatLng mLatLng;
    LinearLayout mLoadingMapView;
    TextView mMapErrorText;
    TextView mStoreAddressText;
    TextView mStoreInfoText;
    TextView mStoreNumberText;
    ToolBarView mToolBar;

    public StoreProfileActivity()
    {
    }

    private void showMapFragment()
    {
        mLoadingMapView.setVisibility(8);
        if (AmazonUtil.isAmazonDevice())
        {
            com.dominos.fragments.map.MapWebViewFragment mapwebviewfragment = MapWebViewFragment_.builder().mAddress(mBundle.getString("address")).build();
            getSupportFragmentManager().a().a(0x7f0f00e7, mapwebviewfragment).b();
            return;
        } else
        {
            com.dominos.fragments.map.GoogleMapFragment googlemapfragment = GoogleMapFragment_.builder().mLatLng(mLatLng).mIsZoomAndGestures(true).build();
            getSupportFragmentManager().a().a(0x7f0f00e7, googlemapfragment).b();
            return;
        }
    }

    void afterView()
    {
        mToolBar.setTitle(getString(0x7f080300));
        mAnalyticsUtil.postStoreProfile(mBundle.getString("storeNumber"));
        mStoreNumberText.append(mBundle.getString("storeNumber"));
        mStoreAddressText.setText(mBundle.getString("address"));
        mStoreInfoText.setText(0x7f0802d0);
        mLatLng = AddressUtil.getLatLngFromFormattedAddress(getApplicationContext(), mBundle.getString("address"));
        if (mLatLng != null)
        {
            showMapFragment();
        } else
        {
            mLoadingMapView.setVisibility(0);
            mMapErrorText.setVisibility(0);
        }
        FontManager.applyDominosFont(this);
    }

    void carryoutButtonClicked()
    {
        mOrderManager.createOrderForCarryout(mBundle.getString("storeNumber"), new _cls1());
    }

    protected void navigateToCart()
    {
        setResult(1);
        ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
        finish();
    }

    void navigateToMapActivity()
    {
        if (mLatLng != null)
        {
            MapActivity_.intent(this).mAddress(mBundle.getString("address")).mLatLng(mLatLng).start();
        }
    }

    void storeInfoClicked()
    {
        mAnalyticsUtil.postStoreProfileInfo(mStoreNumberText.getText().toString());
        StoreInfoDialog_.builder().mBundle(mBundle).build().show(getSupportFragmentManager(), "StoreInfoDialog");
    }

    private class _cls1 extends com.dominos.android.sdk.core.order.OrderManager.CreateCarryoutOrderCallback
    {

        final StoreProfileActivity this$0;

        public void onBegin()
        {
            showLoading();
        }

        public void onCreateOrderError(RequestErrorCode requesterrorcode)
        {
            mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR);
        }

        public void onFinish()
        {
            hideLoading();
        }

        public void onOrderCreated(LabsOrder labsorder)
        {
            navigateToCart();
        }

        public void onStoreCarryoutUnavailable(String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_UNAVAILABLE, s, null);
        }

        public void onStoreClosed()
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_CLOSED);
        }

        public void onStoreOffline(String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_OFFLINE, s, null);
        }

        _cls1()
        {
            this$0 = StoreProfileActivity.this;
            super();
        }
    }

}
