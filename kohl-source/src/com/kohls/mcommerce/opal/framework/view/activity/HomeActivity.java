// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import com.analytics.AnalyticsMain;
import com.analytics.utils.enums.TimedActions;
import com.apptentive.android.sdk.Apptentive;
import com.digby.localpoint.sdk.core.impl.LPLocalpointService;
import com.fsr.tracker.app.TrackingContext;
import com.fsr.tracker.domain.Configuration;
import com.fsr.tracker.domain.MeasureConfiguration;
import com.kohls.mcommerce.opal.common.app.KohlsActivityLifecycleCallbacks;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.components.SlidingUpViewHelper;
import com.kohls.mcommerce.opal.common.ui.components.UpgradeDialog;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.common.value.CommonValues;
import com.kohls.mcommerce.opal.framework.controller.iface.IGeoLocation;
import com.kohls.mcommerce.opal.framework.view.activity.helper.GeoLocationHelper;
import com.kohls.mcommerce.opal.framework.view.activity.helper.ScanHelper;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.framework.view.fragment.HomeFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.Yes2YouRewardsFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentHelper;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.modules.lnr.framework.listener.ActivityResultCallback;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyListActivity;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyRegistryActivity;
import com.kohls.mcommerce.opal.notifications.NotificationController;
import com.kohls.mcommerce.opal.wallet.util.Dialog;
import com.kohls.mcommerce.opal.wallet.util.KohlsError;
import com.kohls.mcommerce.opal.wl.HybridScreen;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithSlider, EULAActivity, BeautyOperations

public class HomeActivity extends BaseActivityWithSlider
{
    public static interface IBackPressed
    {

        public abstract void backPressed();
    }


    private static final String LOG_TAG = "HomeActivity";
    private static boolean mAskedForLocationAccess;
    private IBackPressed backPressed;
    Bundle bundle;
    private UpgradeDialog dialog;
    private IGeoLocation geoLocationListner;
    private boolean isOmnitureCallMadeForRegistryLanding;
    private HashMap mActiveDimension;
    private Activity mActivity;
    private ActivityResultCallback mActivityResultCallback;
    private FragmentOnScreen mFragmentOnScreen;
    private GeoLocationHelper mGeoLocationHelper;
    private AlertDialog mLocationDialog;
    private NotificationController mNotificationController;
    private String mOriginFragment;
    private FragmentOnScreen mPrevFragOnScreenForSearch;
    private ScanHelper mScanHelper;

    public HomeActivity()
    {
        dialog = null;
        mOriginFragment = "";
        isOmnitureCallMadeForRegistryLanding = false;
        geoLocationListner = new IGeoLocation() {

            final HomeActivity this$0;

            public void onConnected()
            {
                KohlsPhoneApplication.getInstance().getAnalytics().sendLocation(mGeoLocationHelper.getCurrentLocation());
            }

            public void onConnectionFailed()
            {
            }

            
            {
                this$0 = HomeActivity.this;
                super();
            }
        };
    }

    private void attachDefaultContent()
    {
        if (!KohlsPhoneApplication.getInstance().getKohlsPref().isEulaAccepted())
        {
            startEULAActivity();
        } else
        {
            Intent intent = getIntent();
            String s = intent.getStringExtra("open_screen_key");
            if (TextUtils.isEmpty(s))
            {
                attachHomeFragment(null, false);
                return;
            }
            if (s.equals("open_store_locator"))
            {
                attachStoreLocatorFragment(null);
                return;
            }
            if (s.equals("open_product_matrix"))
            {
                attachProductMatrixFromScanResult(intent.getExtras());
                return;
            }
            if (s.equals("open_account"))
            {
                attachAccountFragment(null);
                return;
            }
            if (s.equals("open_my_lists"))
            {
                attachListFragment(null, true);
                return;
            }
            if (s.equals("open_my_registry"))
            {
                attachRegistryFragment(null);
                return;
            }
            if (s.equals("open_my_wallet"))
            {
                attachWalletFragment(null);
                return;
            }
            if (s.equals("open_my_loyalty"))
            {
                attachLoyaltyFragment(null);
                return;
            }
            if (s.equals("open_my_enrollment"))
            {
                attachLoyaltySignupFragment(null);
                return;
            }
            if (s.equals("open pmp"))
            {
                attachProductMatrixFragment(null, getIntent().getExtras());
                return;
            }
            if (s.equals("qrcode"))
            {
                attachNewListFragment(null);
                return;
            }
            if (s.equals("qrcode"))
            {
                attachNewListFragment(null);
                return;
            }
        }
    }

    private void attachGuestFragment()
    {
        attachLoyaltyGuestFragment(null);
    }

    private void attachHomeScreenFragments(FragmentOnScreen fragmentonscreen)
    {
        static class _cls4
        {

            static final int $SwitchMap$com$kohls$mcommerce$opal$framework$view$fragment$utility$FragmentOnScreen[];

            static 
            {
                $SwitchMap$com$kohls$mcommerce$opal$framework$view$fragment$utility$FragmentOnScreen = new int[FragmentOnScreen.values().length];
                try
                {
                    $SwitchMap$com$kohls$mcommerce$opal$framework$view$fragment$utility$FragmentOnScreen[FragmentOnScreen.REGISTRY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$kohls$mcommerce$opal$framework$view$fragment$utility$FragmentOnScreen[FragmentOnScreen.LISTS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen[fragmentonscreen.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            attachRegistryFragment(null);
            return;

        case 2: // '\002'
            attachListFragment(null, false);
            break;
        }
    }

    private void attachLoyaltyFragment()
    {
        attachLoyaltyFragment(null);
    }

    private void attachProductMatrixFromScanResult(Bundle bundle1)
    {
        if (mPrevFragOnScreenForSearch != null)
        {
            attachProductMatrixFragment(mPrevFragOnScreenForSearch, bundle1);
            return;
        } else
        {
            attachProductMatrixFragment(FragmentOnScreen.HOME, bundle1);
            return;
        }
    }

    private void attachRewardFragment()
    {
        attachLoyaltySignupFragment(null);
    }

    private void disableDigby()
    {
        LPLocalpointService.getInstance(KohlsPhoneApplication.getContext()).stop();
    }

    private void initNotifications()
    {
    }

    private void initialiseDigby()
    {
        if (UtilityMethods.isLocationServiceEnabled())
        {
            LPLocalpointService.getInstance(KohlsPhoneApplication.getContext()).start();
        } else
        if (!mAskedForLocationAccess)
        {
            mAskedForLocationAccess = true;
            showLocationSettings();
            return;
        }
    }

    private void initialiseGeolocationTrackingForOmniture()
    {
        if (UtilityMethods.isLocationServiceEnabled())
        {
            mGeoLocationHelper = new GeoLocationHelper(new WeakReference(this), geoLocationListner);
            mGeoLocationHelper.initializeComponent();
        } else
        if (!mAskedForLocationAccess)
        {
            mAskedForLocationAccess = true;
            showLocationSettings();
            return;
        }
    }

    private void showLocationSettings()
    {
        Object obj = getString(0x7f080110);
        if (mLocationDialog == null || !mLocationDialog.isShowing())
        {
            obj = UtilityMethods.getAlertDialog(this, ((String) (obj)), getString(0x7f080111), getString(0x7f0800c7), new android.content.DialogInterface.OnClickListener() {

                final HomeActivity this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    if (i == -1)
                    {
                        dialoginterface = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                        startActivity(dialoginterface);
                        return;
                    } else
                    {
                        dialoginterface.dismiss();
                        return;
                    }
                }

            
            {
                this$0 = HomeActivity.this;
                super();
            }
            });
            if (!isFinishing())
            {
                mLocationDialog = ((android.app.AlertDialog.Builder) (obj)).create();
                mLocationDialog.show();
            }
        }
    }

    private void startEULAActivity()
    {
        startActivityForResult(new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/EULAActivity), 111);
    }

    public void attachAccountFragment(Bundle bundle1)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachManageAccountFragment(this, null);
        mFragmentOnScreen = FragmentOnScreen.ACCOUNT;
    }

    public void attachActionItemListener()
    {
        getActionBarHelper().getItemView().setOnClickListener(new android.view.View.OnClickListener() {

            final HomeActivity this$0;

            public void onClick(View view)
            {
                UtilityMethods.openHybridScreen(HomeActivity.this, HybridScreen.SHOPPINGBAG);
            }

            
            {
                this$0 = HomeActivity.this;
                super();
            }
        });
    }

    public void attachBigDataFragment(Bundle bundle1)
    {
        popSearchFragmentIfVisible();
        FragmentFactory.attachBigDataFragment(this, null);
        mFragmentOnScreen = FragmentOnScreen.BIG_DATA;
    }

    public void attachEnrollLoyaltyFragment()
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachRewardsSignupFragment(this, null);
        mFragmentOnScreen = FragmentOnScreen.ACCOUNT;
    }

    public void attachFeatureBrandWebFragment(FragmentOnScreen fragmentonscreen, Bundle bundle1)
    {
        popSearchFragmentIfVisible();
        FragmentFactory.attachFeatureBrandWebFragment(this, bundle1, fragmentonscreen);
        mFragmentOnScreen = FragmentOnScreen.PRODUCT_MATRIX;
    }

    public void attachFilterFragment(Bundle bundle1)
    {
        FragmentFactory.attachFilterFragment(this, bundle1);
        mFragmentOnScreen = FragmentOnScreen.FILTER;
    }

    public void attachHelpAndContactUsFragment(Bundle bundle1)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachHelpAndContactUsFragment(this, null);
        mFragmentOnScreen = FragmentOnScreen.HELP_AND_CONTACT_US;
    }

    public void attachHomeFragment(Bundle bundle1, boolean flag)
    {
        if (mFragmentOnScreen != FragmentOnScreen.HOME)
        {
            getActionBarHelper().showShoppinBagIcon();
            getActionBarHelper().showShoppingBagCount();
            FragmentFactory.attachHomeFragment(this, null, flag);
            mFragmentOnScreen = FragmentOnScreen.HOME;
        }
    }

    public void attachKohlsChargeFragment(Bundle bundle1)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachKohlsChargeFragment(this, null);
        mFragmentOnScreen = FragmentOnScreen.ACCOUNT;
    }

    public void attachListFragment(Bundle bundle1, boolean flag)
    {
        mFragmentOnScreen = FragmentOnScreen.LISTS;
        FragmentFactory.attachListLandingFragment(this, bundle1, flag);
    }

    public void attachListSearchFragment(Bundle bundle1)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachListSearchFragment(this, bundle1);
        mFragmentOnScreen = FragmentOnScreen.LIST_SEARCH;
    }

    public void attachLoyaltyConfirmationFragment(Bundle bundle1)
    {
        updateActionBarViews();
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachLoyaltyEnrolledConfirmationFragment(this, bundle1);
        mFragmentOnScreen = FragmentOnScreen.REWARDS_NOT_ENROLLED;
    }

    public void attachLoyaltyFragment(Bundle bundle1)
    {
        updateActionBarViews();
        if (mFragmentOnScreen != FragmentOnScreen.LOYALTY)
        {
            mPrevFragOnScreenForSearch = mFragmentOnScreen;
            FragmentFactory.attachLoyaltyFragment(this, null);
            mFragmentOnScreen = FragmentOnScreen.LOYALTY;
        }
    }

    public void attachLoyaltyGuestFragment(Bundle bundle1)
    {
        updateActionBarViews();
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachRewardsGuestFragment(this, null);
        mFragmentOnScreen = FragmentOnScreen.GUEST_REWARD_FRAGMENT;
    }

    public void attachLoyaltySignupFragment(Bundle bundle1)
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils() != null && TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getUserAccessTokenFromPref()))
        {
            updateActionBarViews();
            attachGuestFragment();
            return;
        }
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils() != null && !TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()))
        {
            attachLoyaltyFragment();
            return;
        } else
        {
            attachEnrollLoyaltyFragment();
            return;
        }
    }

    public void attachNewListFragment(Bundle bundle1)
    {
        popSearchFragmentIfVisible();
        FragmentFactory.attachNewListFragment(this, bundle1);
        mFragmentOnScreen = FragmentOnScreen.LISTS;
    }

    public void attachProductMatrixFragment(FragmentOnScreen fragmentonscreen, Bundle bundle1)
    {
        updateActionBarViews();
        popSearchFragmentIfVisible();
        FragmentFactory.attachProductMatrixFragment(this, bundle1, fragmentonscreen);
        mFragmentOnScreen = FragmentOnScreen.PRODUCT_MATRIX;
    }

    public void attachRegistryFragment(Bundle bundle1)
    {
        popSearchFragmentIfVisible();
        mFragmentOnScreen = FragmentOnScreen.REGISTRY;
        FragmentFactory.attachRegistryFragment(this, bundle1);
    }

    public void attachRegistryLandingFragment(Bundle bundle1)
    {
        popSearchFragmentIfVisible();
        FragmentFactory.attachRegistryLandingFragment(this, bundle1);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_LANDING;
    }

    public void attachRegistrySearchFragment(Bundle bundle1)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachRegistrySearchFragment(this, bundle1, null);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_SEARCH;
    }

    public void attachSearchFragment(Bundle bundle1)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachSearchFragment(this, bundle1);
        mFragmentOnScreen = FragmentOnScreen.SEARCH;
    }

    public void attachStoreLocatorFragment(Bundle bundle1)
    {
        popSearchFragmentIfVisible();
        getActionBarHelper().hideShoppinBagIcon();
        getActionBarHelper().hideShoppingBagCount();
        FragmentFactory.attachStoreLocatorFragment(this, bundle1);
        mFragmentOnScreen = FragmentOnScreen.STORE_LOCATOR;
    }

    public void attachVisualSearchFragment(Bundle bundle1)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachVisualSearchFragment(this, bundle1);
        mFragmentOnScreen = FragmentOnScreen.VISUAL_SEARCH;
    }

    public void attachWalletFragment(Bundle bundle1)
    {
        if (mFragmentOnScreen != FragmentOnScreen.WALLET)
        {
            mPrevFragOnScreenForSearch = mFragmentOnScreen;
            FragmentFactory.attachWalletFragment(this, null);
            mFragmentOnScreen = FragmentOnScreen.WALLET;
        }
    }

    public void attachWebProdutModulesFragment(Bundle bundle1, String s, String s1)
    {
        if (!TextUtils.isEmpty(s))
        {
            mPrevFragOnScreenForSearch = mFragmentOnScreen;
            FragmentFactory.attachWebViewFragment(this, bundle1, s, s1);
            mFragmentOnScreen = FragmentOnScreen.WEB_PRODUCT_MODULE_FRAGMENT;
        }
    }

    public HashMap getActiveDimension()
    {
        return mActiveDimension;
    }

    public ActionBarHelper getActivityActionBarHelper()
    {
        return getActionBarHelper();
    }

    public ActivityResultCallback getActivityResultCallback()
    {
        return mActivityResultCallback;
    }

    public FragmentOnScreen getFragmentOnScreen()
    {
        return mFragmentOnScreen;
    }

    public FragmentOnScreen getPreviousFragmentOnScreenForSearch()
    {
        return mPrevFragOnScreenForSearch;
    }

    public ScanHelper getScanHelper()
    {
        return mScanHelper;
    }

    public void initContent()
    {
        mScanHelper = new ScanHelper(this);
        attachDefaultContent();
        attachActionItemListener();
    }

    public boolean isOmnitureCallMadeForRegistryLanding()
    {
        return isOmnitureCallMadeForRegistryLanding;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 200 && KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
        {
            (new BeautyOperations(mActivity)).getListAndAddItemsInNewList();
        }
        if (j != 7005) goto _L2; else goto _L1
_L1:
        UtilityMethods.openAccountActivity(this, true, true);
_L4:
        return;
_L2:
        if (j == 7005)
        {
            Dialog.showDialog("Kohl's", getResources().getString(0x7f08024a), this, "OK", null, false, false);
            return;
        }
        if (i != 7001)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() || !KohlsPhoneApplication.getInstance().getAuthenticationUtils().checkUserSessionValid())
        {
            attachHomeScreenFragments(mFragmentOnScreen);
            return;
        }
        if (intent != null && intent.hasExtra("ATTACH_MANAGE_ACCOUNT_FRAGMENT"))
        {
            attachAccountFragment(null);
            return;
        }
        if (intent != null && intent.hasExtra("CLOSE_ACTIVITY_ONLY"))
        {
            attachHomeScreenFragments(mFragmentOnScreen);
            return;
        }
        if (intent != null && intent.hasExtra("show_screen_on_result"))
        {
            intent = FragmentOnScreen.values()[intent.getIntExtra("show_screen_on_result", 0)];
            attachHomeScreenFragments(mFragmentOnScreen);
            if (intent == FragmentOnScreen.CREATE_LIST)
            {
                startMyListActivity(com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyListActivity.ScreenType.CREATE_LIST, null);
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i == 111)
        {
            if (!KohlsPhoneApplication.getInstance().getKohlsPref().isEulaAccepted())
            {
                finish();
                return;
            } else
            {
                attachHomeFragment(null, false);
                return;
            }
        }
        if (i != 112)
        {
            break; /* Loop/switch isn't completed */
        }
        intent = FragmentHelper.getFragmentonTop(new WeakReference(this));
        if (intent.getTag() == "tag-home")
        {
            ((HomeFragment)intent).displayHomePage();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (i != 115)
        {
            break; /* Loop/switch isn't completed */
        }
        intent = KohlsPhoneApplication.getInstance().getKohlsActivityLifecycleCallbacks();
        if (intent != null)
        {
            intent.setInteractionCounterToReset(true);
        }
        if (j == -1)
        {
            if (Environment.getExternalStorageState().equalsIgnoreCase("mounted"))
            {
                Logger.debug("HomeActivity", "Going to process camera image");
                intent = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "KohlsVisualSearchCamera.jpg");
                Bundle bundle1 = new Bundle();
                bundle1.putString("KohlsVisualSearchDataFile", intent.getAbsolutePath());
                attachVisualSearchFragment(bundle1);
                return;
            } else
            {
                Logger.debug("HomeActivity", "Media not accessible, Image search WON'T work");
                return;
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (i != 116)
        {
            break; /* Loop/switch isn't completed */
        }
        KohlsActivityLifecycleCallbacks kohlsactivitylifecyclecallbacks = KohlsPhoneApplication.getInstance().getKohlsActivityLifecycleCallbacks();
        if (kohlsactivitylifecyclecallbacks != null)
        {
            kohlsactivitylifecyclecallbacks.setInteractionCounterToReset(true);
        }
        if (j == -1 && intent != null && intent.getDataString() != null)
        {
            Logger.debug("HomeActivity", "Going to process gallery image");
            Bundle bundle2 = new Bundle();
            bundle2.putString("KohlsVisualSearchDataUri", intent.getDataString());
            attachVisualSearchFragment(bundle2);
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
        if (i != 115)
        {
            break; /* Loop/switch isn't completed */
        }
        intent = KohlsPhoneApplication.getInstance().getKohlsActivityLifecycleCallbacks();
        if (intent != null)
        {
            intent.setInteractionCounterToReset(true);
        }
        if (j == -1)
        {
            if (Environment.getExternalStorageState().equalsIgnoreCase("mounted"))
            {
                Logger.debug("HomeActivity", "Going to process camera image");
                intent = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "KohlsVisualSearchCamera.jpg");
                Bundle bundle3 = new Bundle();
                bundle3.putString("KohlsVisualSearchDataFile", intent.getAbsolutePath());
                attachVisualSearchFragment(bundle3);
                return;
            } else
            {
                Logger.debug("HomeActivity", "Media not accessible, Image search WON'T work");
                return;
            }
        }
        if (true) goto _L4; else goto _L8
_L8:
        if (i != 116)
        {
            break; /* Loop/switch isn't completed */
        }
        KohlsActivityLifecycleCallbacks kohlsactivitylifecyclecallbacks1 = KohlsPhoneApplication.getInstance().getKohlsActivityLifecycleCallbacks();
        if (kohlsactivitylifecyclecallbacks1 != null)
        {
            kohlsactivitylifecyclecallbacks1.setInteractionCounterToReset(true);
        }
        if (j == -1 && intent != null && intent.getDataString() != null)
        {
            Logger.debug("HomeActivity", "Going to process gallery image");
            Bundle bundle4 = new Bundle();
            bundle4.putString("KohlsVisualSearchDataUri", intent.getDataString());
            attachVisualSearchFragment(bundle4);
            return;
        }
        if (true) goto _L4; else goto _L9
_L9:
        if (i != 64207 && i != 64208 && i != 64210 && i != 64211)
        {
            break; /* Loop/switch isn't completed */
        }
        BaseFragment basefragment = FragmentHelper.getFragmentonTop(new WeakReference(this));
        if (basefragment != null && basefragment.getTag().equalsIgnoreCase("tag-fragment-loyalty") && (basefragment instanceof Yes2YouRewardsFragment))
        {
            basefragment.onActivityResult(i, j, intent);
            return;
        }
        if (true) goto _L4; else goto _L10
_L10:
        if (intent == null || intent.getExtras() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        HashMap hashmap = (HashMap)intent.getExtras().getSerializable("SCAN_DATA");
        if (hashmap != null && hashmap.containsKey("SCAN_FIND_REGISTRY_ID") && hashmap.get("SCAN_FIND_REGISTRY_ID") != null && !"".equals(hashmap.get("SCAN_FIND_REGISTRY_ID")))
        {
            if (mActivityResultCallback != null)
            {
                mActivityResultCallback.onActivityResultCallback(i, j, intent);
                return;
            }
        } else
        {
            mScanHelper.handleScanResult(i, j, intent);
            return;
        }
        if (true) goto _L4; else goto _L11
_L11:
        if (intent == null) goto _L4; else goto _L12
_L12:
        mScanHelper.handleScanResult(i, j, intent);
        return;
    }

    public void onBackPressed()
    {
        if (!getSlidingViewHelper().isSliderExpanded()) goto _L2; else goto _L1
_L1:
        getSlidingViewHelper().disableSlidingLayout();
_L4:
        return;
_L2:
        boolean flag;
        boolean flag1 = false;
        if (mFragmentOnScreen != FragmentOnScreen.LISTS && mFragmentOnScreen != FragmentOnScreen.REGISTRY_LANDING)
        {
            flag = flag1;
            if (mFragmentOnScreen != FragmentOnScreen.WEB_PRODUCT_MODULE_FRAGMENT)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        BaseFragment basefragment = FragmentHelper.getFragmentonTop(new WeakReference(this));
        flag = flag1;
        if (basefragment != null)
        {
            flag = basefragment.onBackPress();
        }
        if (flag) goto _L4; else goto _L3
_L3:
        if (mFragmentOnScreen == FragmentOnScreen.STORE_LOCATOR || mFragmentOnScreen == FragmentOnScreen.PRODUCT_MATRIX || mFragmentOnScreen == FragmentOnScreen.HELP_AND_CONTACT_US || mFragmentOnScreen == FragmentOnScreen.BIG_DATA || mFragmentOnScreen == FragmentOnScreen.LISTS || mFragmentOnScreen == FragmentOnScreen.REGISTRY || mFragmentOnScreen == FragmentOnScreen.HELP_AND_CONTACT_US || mFragmentOnScreen == FragmentOnScreen.BIG_DATA || mFragmentOnScreen == FragmentOnScreen.REWARDS_NOT_ENROLLED || mFragmentOnScreen == FragmentOnScreen.REGISTRY_LANDING || mFragmentOnScreen == FragmentOnScreen.WALLET || mFragmentOnScreen == FragmentOnScreen.LOYALTY || mFragmentOnScreen == FragmentOnScreen.REWARDS_NOT_ENROLLED || mFragmentOnScreen == FragmentOnScreen.GUEST_REWARD_FRAGMENT || mFragmentOnScreen == FragmentOnScreen.REWARD_CONFIRMATION || mFragmentOnScreen == FragmentOnScreen.WEB_PRODUCT_MODULE_FRAGMENT)
        {
            if (mOriginFragment != null && (mOriginFragment.equals("originated from product search") || mOriginFragment.equals("about screens")))
            {
                finish();
                return;
            }
            if (mOriginFragment != null && mOriginFragment.equals("origin from reg lan"))
            {
                attachRegistryLandingFragment(new Bundle());
                return;
            } else
            {
                FragmentFactory.attachHomeFragment(this, null, true);
                mFragmentOnScreen = FragmentOnScreen.HOME;
                getActionBarHelper().showShoppinBagIcon();
                getActionBarHelper().showShoppingBagCount();
                return;
            }
        }
        if (mFragmentOnScreen == FragmentOnScreen.FILTER)
        {
            FragmentFactory.attachProductMatrixFragment(this, null, mFragmentOnScreen);
            mFragmentOnScreen = FragmentOnScreen.FILTER;
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.SEARCH)
        {
            popSearchFragmentIfVisible();
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.LIST_SEARCH)
        {
            popListSearchFragmentIfVisible();
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_SEARCH)
        {
            popRegistrySearchFragmentIfVisible();
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.ACCOUNT)
        {
            getActionBarHelper().showShoppinBagIcon();
            getActionBarHelper().showShoppingBagCount();
            attachHomeFragment(null, true);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.VISUAL_SEARCH)
        {
            popVisualSearchFragmentIfVisible();
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void onCreate(Bundle bundle1)
    {
        super.onCreate(bundle1);
        Logger.debug("HomeActivity", "onCreate()");
        mActivity = this;
        KohlsPhoneApplication.getInstance().setClientConnect(false);
        KohlsPhoneApplication.getInstance().setAuthenticationUtils();
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            mOriginFragment = bundle.getString("originated from which fragment");
        }
        dialog = new UpgradeDialog(this);
        KohlsPhoneApplication.getInstance().getConfigurationUtils().validateVersion(dialog, this);
        mAskedForLocationAccess = false;
        KohlsPhoneApplication.getInstance().getConfigurationUtils().initialiseForsee(true);
        KohlsError.getInstance().load(this, null);
        KohlsPhoneApplication.getInstance().getAnalytics().sendTimedActionStart(TimedActions.TIME_TO_PRODUCT_VIEW);
        initialiseGeolocationTrackingForOmniture();
        if (CommonValues.getInstance().isEnableForseeFeedback())
        {
            bundle1 = Configuration.defaultConfiguration(getString(0x7f08021c));
            TrackingContext.start(getApplication(), bundle1);
            if (TrackingContext.Instance() != null)
            {
                TrackingContext.Instance().setTrackerEventListener(this);
            }
        }
        KohlsPhoneApplication.getInstance().getKohlsPref().setFlagForOmnitureListLanding(false);
    }

    protected void onDestroy()
    {
        KohlsPhoneApplication.getInstance().getConfigurationUtils().notifyExitForesee();
        Logger.debug("HomeActivity", "onDestroy()");
        mAskedForLocationAccess = false;
        super.onDestroy();
    }

    public void onInviteAccepted(MeasureConfiguration measureconfiguration)
    {
    }

    public void onInviteDeclined(MeasureConfiguration measureconfiguration)
    {
    }

    public void onInvitePresented(MeasureConfiguration measureconfiguration)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setForseeSurveyFlag();
    }

    protected void onPause()
    {
        super.onPause();
        ToastUtility.hideAllCustomToast();
    }

    protected void onResume()
    {
        super.onResume();
        Logger.debug("HomeActivity", "onResume()");
        if (KohlsPhoneApplication.getInstance().getKohlsPref().isGeoFenceBroken())
        {
            getSlidingViewHelper().enableSlidingLayout();
        } else
        {
            getSlidingViewHelper().disableSlidingLayout();
        }
        if (KohlsPhoneApplication.getInstance().getConfigurationUtils().isUpgradeNeeded() && dialog.getAlertDialog() != null)
        {
            dialog.getAlertDialog().dismiss();
            KohlsPhoneApplication.getInstance().getConfigurationUtils().validateVersion(dialog, this);
        }
    }

    public void onSamplingCheckCompleted(MeasureConfiguration measureconfiguration, boolean flag)
    {
    }

    protected void onStart()
    {
        super.onStart();
        Logger.debug("HomeActivity", "onStart()");
        if (bundle == null)
        {
            bundle = getIntent().getExtras();
        }
        if (CommonValues.getInstance().isEnableDigby())
        {
            initialiseDigby();
        } else
        {
            disableDigby();
        }
        updateActionBarViews();
        Apptentive.onStart(this);
    }

    protected void onStop()
    {
        Apptentive.onStop(this);
        Logger.debug("HomeActivity", "onStop()");
        super.onStop();
    }

    public void onSurveyAborted(MeasureConfiguration measureconfiguration)
    {
    }

    public void onSurveyCompleted(MeasureConfiguration measureconfiguration)
    {
    }

    public void popListSearchFragmentIfVisible()
    {
        if (mFragmentOnScreen == FragmentOnScreen.LIST_SEARCH)
        {
            getFragmentManager().popBackStack();
            mFragmentOnScreen = mPrevFragOnScreenForSearch;
            mPrevFragOnScreenForSearch = null;
        }
    }

    public void popRegistrySearchFragmentIfVisible()
    {
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_SEARCH)
        {
            getFragmentManager().popBackStack();
            mFragmentOnScreen = mPrevFragOnScreenForSearch;
            mPrevFragOnScreenForSearch = null;
        }
    }

    public void popSearchFragmentIfVisible()
    {
        if (mFragmentOnScreen == FragmentOnScreen.SEARCH)
        {
            getFragmentManager().popBackStack();
            mFragmentOnScreen = mPrevFragOnScreenForSearch;
            mPrevFragOnScreenForSearch = null;
        }
    }

    public void popVisualSearchFragmentIfVisible()
    {
        if (mFragmentOnScreen == FragmentOnScreen.VISUAL_SEARCH)
        {
            getFragmentManager().popBackStack();
            mFragmentOnScreen = mPrevFragOnScreenForSearch;
            mPrevFragOnScreenForSearch = null;
        }
    }

    public void setActiveDimension(List list)
    {
        if (list != null)
        {
            HashMap hashmap = new HashMap();
            for (list = list.iterator(); list.hasNext();)
            {
                com.kohls.mcommerce.opal.framework.vo.ProductMatrixVO.Payload.ActiveDimension activedimension = (com.kohls.mcommerce.opal.framework.vo.ProductMatrixVO.Payload.ActiveDimension)list.next();
                Object obj = activedimension.getActiveDimensionValues();
                if (obj != null && ((List) (obj)).size() > 0)
                {
                    obj = ((List) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        Object obj1 = (com.kohls.mcommerce.opal.framework.vo.ProductMatrixVO.Payload.ActiveDimension.ActiveDimensionValue)((Iterator) (obj)).next();
                        if (obj1 != null)
                        {
                            obj1 = ((com.kohls.mcommerce.opal.framework.vo.ProductMatrixVO.Payload.ActiveDimension.ActiveDimensionValue) (obj1)).getName();
                            String s = activedimension.getName();
                            if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(((CharSequence) (obj1))))
                            {
                                hashmap.put((new StringBuilder()).append(((String) (obj1))).append("_").append(s).toString(), s);
                            }
                        }
                    }
                }
            }

            mActiveDimension = hashmap;
        }
    }

    public void setActivityResultCallback(ActivityResultCallback activityresultcallback)
    {
        setOmnitureCallMadeForRegistryLanding(true);
        mActivityResultCallback = activityresultcallback;
    }

    public void setListenerBackPressed(IBackPressed ibackpressed)
    {
        if (backPressed == null)
        {
            backPressed = ibackpressed;
        }
    }

    public void setOmnitureCallMadeForRegistryLanding(boolean flag)
    {
        isOmnitureCallMadeForRegistryLanding = flag;
    }

    public void setOriginFragment(String s)
    {
        mOriginFragment = s;
    }

    public void startMyListActivity(com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyListActivity.ScreenType screentype, Bundle bundle1)
    {
        Intent intent = new Intent(this, com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/MyListActivity);
        intent.putExtra("ScreenToOpen", screentype);
        if (bundle1 != null)
        {
            intent.putExtras(bundle1);
        }
        startActivity(intent);
    }

    public void startMyRegistryActivity(com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyRegistryActivity.RegistryScreenType registryscreentype, Bundle bundle1)
    {
        Intent intent = new Intent(this, com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/MyRegistryActivity);
        intent.putExtra("ScreenToOpen", registryscreentype);
        if (bundle1 != null)
        {
            intent.putExtras(bundle1);
        }
        startActivity(intent);
    }

    protected void updateActionBarViews()
    {
        getActionBarHelper().showActionBarWithShoppingBag(null);
    }

}
