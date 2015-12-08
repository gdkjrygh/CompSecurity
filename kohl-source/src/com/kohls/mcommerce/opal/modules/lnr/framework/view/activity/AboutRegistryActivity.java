// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.analytics.utils.enums.ProductFindingMethod;
import com.analytics.utils.enums.ScreenNames;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithoutSlider;
import com.kohls.mcommerce.opal.framework.view.activity.helper.ScanHelper;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentHelper;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistrySearchFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistrySearchResultFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;

// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity:
//            MyRegistryActivity

public class AboutRegistryActivity extends BaseActivityWithoutSlider
    implements android.view.View.OnClickListener
{

    public static final int ABOUT_REG_SCREEN = 1004;
    public static final int REGISTRY_SEARCH_FRAGMENT = 1001;
    public static final int REGISTRY_SEARCH_RESULT_FRAGMENT = 1002;
    public static final int REQUEST_CODE_FOR_FIND_REG = 1003;
    private BaseFragment mCurrentFragment;
    private FragmentOnScreen mFragmentOnScreen;
    private FragmentOnScreen mPrevFragOnScreen;
    private ScanHelper mScanHelper;

    public AboutRegistryActivity()
    {
    }

    private void getRegistry(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("origin_of_fragment", FragmentOnScreen.ABOUT_REGISTRY_FRAGMENT.ordinal());
        bundle.putString("registry_id", s);
        startMyRegistryActivity(MyRegistryActivity.RegistryScreenType.REGISTRY_DETAIL_PAGE, bundle);
    }

    public void attachRegistrySearchFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachRegistrySearchFragment(this, bundle, "reg search frag");
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_SEARCH;
    }

    protected int getLayoutId()
    {
        return 0x7f030000;
    }

    protected void initializeViews(Bundle bundle)
    {
        mScanHelper = new ScanHelper(this);
        if (getIntent() == null || getIntent().getExtras() == null) goto _L2; else goto _L1
_L1:
        int i = getIntent().getExtras().getInt("about_type");
        if (i != 1003) goto _L4; else goto _L3
_L3:
        getActionBarHelper().showActionBarForCreateRegistry(getString(0x7f080337));
        AnalyticsHelper.sendAnalyticsTrackStateForLnR(ScreenNames.REGISTRY_BABY_LANDING, ProductFindingMethod.REGISTRY, "non-search", "registry|baby", null, null, null);
_L2:
        getActionBarHelper().getBackButtonView().setOnClickListener(this);
        return;
_L4:
        if (i == 1001)
        {
            getActionBarHelper().showActionBarForCreateRegistry(getString(0x7f080338));
            AnalyticsHelper.sendAnalyticsTrackStateForLnR(ScreenNames.REGISTRY_CELEBRATION_LANDING, ProductFindingMethod.REGISTRY, "non-search", "registry|celebrations", null, null, null);
        } else
        if (i == 1002)
        {
            getActionBarHelper().showActionBarForCreateRegistry(getString(0x7f080339));
            AnalyticsHelper.sendAnalyticsTrackStateForLnR(ScreenNames.REGISTRY_WEDDING_LANDING, ProductFindingMethod.REGISTRY, "non-search", "registry|wedding", null, null, null);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void launchFragment(Bundle bundle, int i)
    {
        if (i == 1001)
        {
            mPrevFragOnScreen = mFragmentOnScreen;
            mCurrentFragment = new RegistrySearchFragment();
            FragmentHelper.addFragmentWithNoAnimation(new WeakReference(this), mCurrentFragment, bundle);
            mFragmentOnScreen = FragmentOnScreen.REGISTRY_SEARCH;
        } else
        if (i == 1002)
        {
            mPrevFragOnScreen = mFragmentOnScreen;
            mCurrentFragment = new RegistrySearchResultFragment();
            FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference(this), mCurrentFragment, bundle);
            mFragmentOnScreen = FragmentOnScreen.REGISTRY_SEARCH_RESULT;
            return;
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            super.onActivityResult(i, j, intent);
            if (i == 2)
            {
                if (j != 0)
                {
                    removeCurrentFragment();
                }
                if (intent != null && intent.getExtras() != null)
                {
                    HashMap hashmap = (HashMap)intent.getExtras().getSerializable("SCAN_DATA");
                    if (hashmap == null || !hashmap.containsKey("SCAN_FIND_REGISTRY_ID") || hashmap.get("SCAN_FIND_REGISTRY_ID") == null || "".equals(hashmap.get("SCAN_FIND_REGISTRY_ID")))
                    {
                        break label0;
                    }
                    getRegistry((String)hashmap.get("SCAN_FIND_REGISTRY_ID"));
                }
            }
            return;
        }
        mScanHelper.handleScanResult(i, j, intent);
    }

    public void onClick(View view)
    {
        finish();
    }

    public void removeCurrentFragment()
    {
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_SEARCH)
        {
            getFragmentManager().popBackStack();
            mFragmentOnScreen = mPrevFragOnScreen;
            mPrevFragOnScreen = null;
        }
    }

    public void startMyRegistryActivity(MyRegistryActivity.RegistryScreenType registryscreentype, Bundle bundle)
    {
        Intent intent = new Intent(this, com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/MyRegistryActivity);
        intent.putExtra("ScreenToOpen", registryscreentype);
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    protected void updateActionBarViews()
    {
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }
}
