// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.m;
import android.view.Window;
import android.widget.TextView;
import com.dominos.android.sdk.common.DeviceCapabilities;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.LocalizationUtil;
import com.dominos.utils.AnalyticsUtil;

public class StoreInfoDialog extends m
{

    AnalyticsUtil mAnalyticsUtil;
    Bundle mBundle;
    TextView mCallStore;
    TextView mCarryOutHours;
    TextView mDeliveryHours;
    DeviceCapabilities mDeviceCapabilities;
    private StoreInfoDialogClickListener mListener;
    TextView mStoreAddress;
    TextView mStoreNumber;
    TextView mTitleText;

    public StoreInfoDialog()
    {
    }

    void afterViews()
    {
        mTitleText.setText(getString(0x7f080300));
        mStoreNumber.append(mBundle.getString("storeNumber"));
        mStoreAddress.setText(mBundle.getString("address"));
        mDeliveryHours.setText(LocalizationUtil.translateDayName(mBundle.getString("deliveryHours")));
        mCarryOutHours.setText(LocalizationUtil.translateDayName(mBundle.getString("carryoutHours")));
        mAnalyticsUtil.postStoreDetails(mBundle.getString("storeNumber"));
        if (!mDeviceCapabilities.hasTelephonyCapabilities())
        {
            mCallStore.setVisibility(8);
        }
        FontManager.applyDominosFont(getActivity(), getView());
    }

    void callStoreClicked()
    {
        startActivity(new Intent("android.intent.action.CALL", Uri.parse((new StringBuilder("tel:")).append(mBundle.getString("phone")).toString())));
        mAnalyticsUtil.postStoreProfileCallStore(mBundle.getString("storeNumber"));
    }

    void gotItButtonClicked()
    {
        mAnalyticsUtil.postStoreProfileGotIt(mStoreNumber.getText().toString());
        dismiss();
        if (mListener != null)
        {
            mListener.onAlertDismissed();
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.requestWindowFeature(1);
        bundle.getWindow().setBackgroundDrawableResource(0x7f0e009e);
        return bundle;
    }

    public void setStoreInfoDialogClickListener(StoreInfoDialogClickListener storeinfodialogclicklistener)
    {
        mListener = storeinfodialogclicklistener;
    }

    private class StoreInfoDialogClickListener
    {

        public abstract void onAlertDismissed();
    }

}
