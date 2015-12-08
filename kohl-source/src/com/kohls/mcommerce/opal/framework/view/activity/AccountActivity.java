// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.fragment.CreateProfileConfirmationFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentHelper;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider, ScanHelpActivity, ScanActivity

public class AccountActivity extends BaseActivityWithoutSlider
{

    private boolean mIsAccountConfirmationScreenVisible;
    private boolean mIsAccountScreenVisible;
    private com.kohls.mcommerce.opal.framework.controller.impl.CreateProfileControllerImpl.ScannerListener mScannerListener;
    private String onBackHybridDisplysUnsecurePage;
    boolean showManageAccountFragment;
    FragmentOnScreen showTargetFragment;

    public AccountActivity()
    {
    }

    public void attachCreateProfileConfirmationFragment(Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(this), new CreateProfileConfirmationFragment(), bundle, null);
    }

    protected int getLayoutId()
    {
        return 0x7f030001;
    }

    protected void initializeViews(Bundle bundle)
    {
        String s;
        Bundle bundle1;
        bundle1 = getIntent().getExtras();
        FragmentFactory.attachAccountParentFragment(this, bundle1);
        setAccountScreenVisibility(true);
        s = getResources().getString(0x7f080127);
        bundle = s;
        if (bundle1 == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        showManageAccountFragment = bundle1.getBoolean("show_manage_account_screen");
        onBackHybridDisplysUnsecurePage = bundle1.getString("show_unsecure_page_account");
        flag = bundle1.getBoolean("show_create_account");
        showTargetFragment = FragmentOnScreen.values()[bundle1.getInt("show_screen_on_result")];
        if (!bundle1.getBoolean("show_guest_signin")) goto _L4; else goto _L3
_L3:
        bundle = getResources().getString(0x7f08051c);
_L2:
        getActionBarHelper().showActionBarWithDetail(bundle);
        getActionBarHelper().hideShoppinBagIcon();
        getActionBarHelper().hideShoppingBagCount();
        return;
_L4:
        bundle = s;
        if (!flag)
        {
            bundle = getResources().getString(0x7f0804d5);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public boolean isAccountConfirmationScreenVisible()
    {
        return mIsAccountConfirmationScreenVisible;
    }

    public boolean isAccountScreenVisible()
    {
        return mIsAccountScreenVisible;
    }

    public boolean isManageAccScreenshouldbeShown()
    {
        return showManageAccountFragment;
    }

    public boolean isTargetFragmentShouldbeShown()
    {
        return showTargetFragment.ordinal() > 0;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 2) goto _L2; else goto _L1
_L1:
        if (intent == null) goto _L4; else goto _L3
_L3:
        if (j != -1 || !intent.hasExtra("SCAN_DATA")) goto _L6; else goto _L5
_L5:
        if (!UtilityMethods.isNetworkConnected(this)) goto _L8; else goto _L7
_L7:
        intent = (HashMap)intent.getExtras().getSerializable("SCAN_DATA");
        if (intent.size() > 0 && mScannerListener != null)
        {
            mScannerListener.scanDone((String)intent.get("SCAN_LOYALTY_ID"));
            setScannerListener(null);
        }
_L4:
        return;
_L8:
        showScanErrorDialog(getString(0x7f0803be));
        return;
_L6:
        if (j == 2)
        {
            showScanErrorDialog(getString(0x7f0804a7));
            AnalyticsHelper.sendAnalyticsOnScanFail();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((i == 3 || i == 4) && j == 2)
        {
            showScanErrorDialog(getString(0x7f08044c));
            AnalyticsHelper.sendAnalyticsOnScanFail();
            return;
        }
        if (true) goto _L4; else goto _L9
_L9:
    }

    public void onBackPressed()
    {
        getActionBarHelper().showShoppinBagIcon();
        getActionBarHelper().showShoppingBagCount();
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(onBackHybridDisplysUnsecurePage) && onBackHybridDisplysUnsecurePage.equals("show_unsecure_page_account"))
        {
            setResult(0, intent);
        } else
        if (showTargetFragment.ordinal() > 0)
        {
            intent.putExtra("show_screen_on_result", showTargetFragment.ordinal());
        } else
        {
            if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
            {
                if (showManageAccountFragment)
                {
                    intent.putExtra("ATTACH_MANAGE_ACCOUNT_FRAGMENT", "ATTACH_MANAGE_ACCOUNT_FRAGMENT");
                } else
                {
                    intent.putExtra("CLOSE_ACTIVITY_ONLY", "CLOSE_ACTIVITY_ONLY");
                }
            } else
            {
                intent.putExtra("CLOSE_ACTIVITY_ONLY", "CLOSE_ACTIVITY_ONLY");
            }
            setResult(-1, intent);
        }
        super.onBackPressed();
    }

    public void seAccountConfirmationScreenVisible(boolean flag)
    {
        mIsAccountConfirmationScreenVisible = flag;
    }

    public void setAccountScreenVisibility(boolean flag)
    {
        mIsAccountScreenVisible = flag;
    }

    public void setScannerListener(com.kohls.mcommerce.opal.framework.controller.impl.CreateProfileControllerImpl.ScannerListener scannerlistener)
    {
        mScannerListener = scannerlistener;
    }

    public void showScanErrorDialog(String s)
    {
        UtilityMethods.getAlertDialog(this, s, getString(0x7f0804a3), getString(0x7f0800c7), new android.content.DialogInterface.OnClickListener() {

            final AccountActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    startScan(1002);
                }
            }

            
            {
                this$0 = AccountActivity.this;
                super();
            }
        }).show();
    }

    public void startScan(int i)
    {
        Intent intent;
        if (KohlsPhoneApplication.getInstance().getKohlsPref().isFirstScan())
        {
            intent = new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/ScanHelpActivity);
            intent.putExtra("scan_request", i);
        } else
        {
            intent = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/ScanActivity);
            intent.setAction("com.google.zxing.client.android.SCAN");
            intent.putExtra("SCAN_FORMATS", getResources().getStringArray(0x7f0a0018));
            intent.putExtra("SAVE_HISTORY", false);
            intent.putExtra("scan_request", i);
            DisplayMetrics displaymetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            i = displaymetrics.heightPixels;
            int j = displaymetrics.widthPixels;
            intent.putExtra("SCAN_WIDTH", (double)i * 0.59999999999999998D);
            intent.putExtra("SCAN_HEIGHT", (double)j * 0.59999999999999998D);
        }
        startActivityForResult(intent, 2);
    }

    protected void updateActionBarViews()
    {
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    protected void updateViewsOnSuccess(Object obj)
    {
    }
}
