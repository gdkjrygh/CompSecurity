// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.samsungtv;

import android.app.Dialog;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.dominos.MobileSession;
import com.dominos.fragments.ContractDialogFragment;
import com.dominos.utils.AnalyticsUtil;
import com.samsung.multiscreen.device.Device;
import java.util.ArrayList;

// Referenced classes of package com.dominos.samsungtv:
//            SamsungDevicesPopUpListAdapter

public class SamsungDevicesDialog extends ContractDialogFragment
{

    public static final String FRAGMENT_TAG = "samsungDevicesDialog";
    AnalyticsUtil mAnalyticsUtil;
    ImageView mArrowImage;
    ImageView mButtonImage;
    ArrayList mDeviceList;
    ListView mDeviceListView;
    boolean mFirstTime;
    RelativeLayout mLayout;
    MobileSession mMobileSession;
    SamsungDevicesPopUpListAdapter mSamsungDevicesPopUpListAdapter;

    public SamsungDevicesDialog()
    {
    }

    public void afterViews()
    {
        if (mFirstTime)
        {
            Object obj = new android.graphics.BitmapFactory.Options();
            obj.inSampleSize = 2;
            obj.inJustDecodeBounds = false;
            obj = BitmapFactory.decodeResource(getActivity().getResources(), 0x7f020155, ((android.graphics.BitmapFactory.Options) (obj)));
            mArrowImage.setImageBitmap(((android.graphics.Bitmap) (obj)));
            mButtonImage.setVisibility(0);
            mArrowImage.setVisibility(0);
        }
        ColorDrawable colordrawable = new ColorDrawable(0xff000000);
        colordrawable.setAlpha(150);
        getDialog().getWindow().setBackgroundDrawable(colordrawable);
        mDeviceListView.setAdapter(mSamsungDevicesPopUpListAdapter);
        mSamsungDevicesPopUpListAdapter.updateDeviceList(mDeviceList);
        mAnalyticsUtil.postSamsungTvMultiviewPrompt();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(2, 0x7f0b000f);
        setCancelable(true);
    }

    public void onDeviceListItemClick(Device device)
    {
        mAnalyticsUtil.postSamsungTvListItemClicked();
        ((SamsungDevicesDialogListener)getContract()).onDeviceItemSelected(device);
    }

    public void onLayoutClick()
    {
        dismiss();
    }

    private class SamsungDevicesDialogListener
    {

        public abstract void onDeviceItemSelected(Device device);
    }

}
