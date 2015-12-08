// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.kohls.mcommerce.opal.common.app.KohlsActivityLifecycleCallbacks;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithoutSlider;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.helper.ScanHelper;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentHelper;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.error.ErrorHelper;
import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPO;
import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPropertiesPO;
import com.kohls.mcommerce.opal.modules.lnr.common.po.ShipmentAddressPO;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.CreateOrUpdateRegistryControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.listener.ActivityResultCallback;
import com.kohls.mcommerce.opal.modules.lnr.framework.listener.AddressActionListner;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.AddressFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistryCategoryDetailFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistryDetailFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO;
import com.kohls.mcommerce.opal.modules.lnr.helper.registry.RegistryDashboardValueGenerator;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity:
//            RegistrySettingActivity

public class MyRegistryActivity extends BaseActivityWithoutSlider
    implements AddressActionListner
{
    public static final class RegistryScreenType extends Enum
    {

        private static final RegistryScreenType $VALUES[];
        public static final RegistryScreenType CREATE_BABY_REG;
        public static final RegistryScreenType CREATE_CELEB_REGISTRY;
        public static final RegistryScreenType CREATE_REGISTRY;
        public static final RegistryScreenType CREATE_WEDDING_REGISTRY;
        public static final RegistryScreenType MANAGE_REGISTRY;
        public static final RegistryScreenType REGISTRY_ADVANCE_SEARCH;
        public static final RegistryScreenType REGISTRY_DETAIL_PAGE;
        public static final RegistryScreenType REGISTRY_FILTER;
        public static final RegistryScreenType SEARCH_RESULT_REGISTRY;
        public static final RegistryScreenType WEDDING_REGISTRY_ABOUT;

        public static RegistryScreenType valueOf(String s)
        {
            return (RegistryScreenType)Enum.valueOf(com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/MyRegistryActivity$RegistryScreenType, s);
        }

        public static RegistryScreenType[] values()
        {
            return (RegistryScreenType[])$VALUES.clone();
        }

        static 
        {
            CREATE_REGISTRY = new RegistryScreenType("CREATE_REGISTRY", 0);
            CREATE_WEDDING_REGISTRY = new RegistryScreenType("CREATE_WEDDING_REGISTRY", 1);
            MANAGE_REGISTRY = new RegistryScreenType("MANAGE_REGISTRY", 2);
            WEDDING_REGISTRY_ABOUT = new RegistryScreenType("WEDDING_REGISTRY_ABOUT", 3);
            SEARCH_RESULT_REGISTRY = new RegistryScreenType("SEARCH_RESULT_REGISTRY", 4);
            REGISTRY_FILTER = new RegistryScreenType("REGISTRY_FILTER", 5);
            REGISTRY_DETAIL_PAGE = new RegistryScreenType("REGISTRY_DETAIL_PAGE", 6);
            CREATE_BABY_REG = new RegistryScreenType("CREATE_BABY_REG", 7);
            CREATE_CELEB_REGISTRY = new RegistryScreenType("CREATE_CELEB_REGISTRY", 8);
            REGISTRY_ADVANCE_SEARCH = new RegistryScreenType("REGISTRY_ADVANCE_SEARCH", 9);
            $VALUES = (new RegistryScreenType[] {
                CREATE_REGISTRY, CREATE_WEDDING_REGISTRY, MANAGE_REGISTRY, WEDDING_REGISTRY_ABOUT, SEARCH_RESULT_REGISTRY, REGISTRY_FILTER, REGISTRY_DETAIL_PAGE, CREATE_BABY_REG, CREATE_CELEB_REGISTRY, REGISTRY_ADVANCE_SEARCH
            });
        }

        private RegistryScreenType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String LOG_TAG = "MyRegistryActivity";
    private Bundle filterBundle;
    private Map findRegistryResultsGroup;
    private boolean isFromPDP;
    private ActivityResultCallback mActivityResultCallback;
    private AddressFragment mAddressFragment;
    private Bundle mBundle;
    private CreateOrUpdateRegistryControllerImpl mCreateRegistryController;
    private FragmentOnScreen mFragmentOnScreen;
    private FragmentOnScreen mOriginatedFromFrag;
    private int mPrevFrag;
    private FragmentOnScreen mPrevFragOnScreen;
    private long mRegId;
    private RegistryCategoryDetailFragment mRegistryCategoryDetailFragment;
    private LinkedHashMap mRegistryCategoryList;
    private RegistryDashboardValueGenerator mRegistryDashboardValuesObject;
    private RegistryDetailFragment mRegistryDetailFragment;
    private RegistryPO mRegistryPO;
    private String mRegistrySearchString;
    private ScanHelper mScanHelper;
    private com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address mSelectedAddress;
    private List mShippingAddresses;
    private String mTitle;

    public MyRegistryActivity()
    {
        isFromPDP = false;
        mRegistrySearchString = "";
    }

    private void onDoneBtnClick()
    {
        ShipmentAddressPO shipmentaddresspo = new ShipmentAddressPO();
        if (mSelectedAddress != null)
        {
            shipmentaddresspo.setID(mSelectedAddress.getID());
            shipmentaddresspo.setFirstName(mSelectedAddress.getFirstName());
            shipmentaddresspo.setLastName(mSelectedAddress.getLastName());
            shipmentaddresspo.setPostalCode(mSelectedAddress.getPostalCode());
            shipmentaddresspo.setPhoneNumber(mSelectedAddress.getPhoneNumber());
            shipmentaddresspo.setAddr1(mSelectedAddress.getAddr1());
            shipmentaddresspo.setAddr2(mSelectedAddress.getAddr2());
            shipmentaddresspo.setCity(mSelectedAddress.getCity());
            shipmentaddresspo.setState(mSelectedAddress.getState());
            shipmentaddresspo.setCountryCode(mSelectedAddress.getCountryCode());
        }
        com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPO.RProperties rproperties = mRegistryPO.getRegistryProperties();
        rproperties.getProperties().setCity(mSelectedAddress.getCity());
        rproperties.getProperties().setState(mSelectedAddress.getState());
        rproperties.setShipmentAddress(shipmentaddresspo);
        mRegistryPO.setRegistryProperties(rproperties);
        mCreateRegistryController = (CreateOrUpdateRegistryControllerImpl)ControllerFactory.getCreateRegistryController(null, new WeakReference(this));
        if (!UtilityMethods.isNetworkConnected(this))
        {
            Toast.makeText(this, getResources().getString(0x7f0803cd), 0).show();
            return;
        }
        if (mAddressFragment != null && mAddressFragment.isVisible() && !mAddressFragment.isRemoving())
        {
            mAddressFragment.showHideProgress(true);
        }
        mCreateRegistryController.createRegistry(mRegistryPO);
    }

    public void addRegistryDetailFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        mRegistryDetailFragment = new RegistryDetailFragment();
        FragmentFactory.addRegistryDetailFragment(this, bundle, mRegistryDetailFragment);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_DETAIL;
    }

    public void attachAddAddressFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachAddAddressFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.ADD_ADDRESS_FRAGMENT;
    }

    public void attachAddressSelectionFragment(Bundle bundle)
    {
        if (bundle != null)
        {
            mRegistryPO = (RegistryPO)bundle.getSerializable("registry po");
        }
        mPrevFragOnScreen = mFragmentOnScreen;
        AddressFragment addressfragment = new AddressFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(this), addressfragment, bundle, "address frag");
        mAddressFragment = addressfragment;
        mFragmentOnScreen = FragmentOnScreen.ADDRESS_FRAGMENT;
    }

    public void attachBabyRegistryFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachBabyRegistryFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.BABY_REGISTRY;
    }

    public void attachCelebrationRegistryFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachCelebrationRegistryFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.CELEBRATION_REGISTRY;
    }

    public void attachCreateRegistryFragment(Bundle bundle)
    {
        if (bundle != null)
        {
            setFromPDP(bundle.getBoolean("isCreateNewRegistryPDP", false));
        }
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachCreateRegistryFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.CREATE_REGISTRY;
    }

    public void attachDefaultContent()
    {
        Intent intent = getIntent();
        RegistryScreenType registryscreentype = (RegistryScreenType)intent.getSerializableExtra("ScreenToOpen");
        if (registryscreentype == RegistryScreenType.CREATE_REGISTRY)
        {
            attachCreateRegistryFragment(getIntent().getExtras());
        } else
        {
            if (registryscreentype == RegistryScreenType.MANAGE_REGISTRY)
            {
                attachManagRegistryFragment(null);
                return;
            }
            if (registryscreentype.equals("open_product_matrix"))
            {
                intent = new Intent();
                intent.setClass(this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
                intent.putExtra("open_screen_key", "open_product_matrix");
                intent.putExtras(intent.getExtras());
                intent.putExtra("originated from which fragment", "originated from product search");
                startActivity(intent);
                return;
            }
            if (registryscreentype == RegistryScreenType.SEARCH_RESULT_REGISTRY)
            {
                attachRegistrySearchResultFragment(getIntent().getExtras());
                return;
            }
            if (registryscreentype == RegistryScreenType.CREATE_WEDDING_REGISTRY)
            {
                attachWeddingRegistryFragment(getIntent().getExtras());
                return;
            }
            if (registryscreentype == RegistryScreenType.CREATE_BABY_REG)
            {
                attachBabyRegistryFragment(getIntent().getExtras());
                return;
            }
            if (registryscreentype == RegistryScreenType.CREATE_CELEB_REGISTRY)
            {
                attachCelebrationRegistryFragment(getIntent().getExtras());
                return;
            }
            if (registryscreentype == RegistryScreenType.REGISTRY_FILTER)
            {
                attachRegistryFilterFragment(getFilterBundle());
                return;
            }
            if (registryscreentype == RegistryScreenType.REGISTRY_DETAIL_PAGE)
            {
                attachRegistryDetailFragment(intent.getExtras());
                return;
            }
            if (registryscreentype == RegistryScreenType.REGISTRY_ADVANCE_SEARCH)
            {
                attachRegistryAdvanceSearchFragment(getIntent().getExtras());
                return;
            }
        }
    }

    public void attachManagRegistryFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachManageRegistryFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.MANAGE_REGISTRY;
    }

    public void attachRegistryAdvanceSearchFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachRegistryAdvanceSearchFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_ADVANCE_SEARCH;
    }

    public void attachRegistryCategoryDetailFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        mRegistryCategoryDetailFragment = new RegistryCategoryDetailFragment();
        FragmentFactory.attachRegistryCategoryDetailFragment(this, bundle, mRegistryCategoryDetailFragment);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_CATEGORY_DETAIL;
    }

    public void attachRegistryConfirmationFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachBabyConfirmationFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_CONFIRMATION;
    }

    public void attachRegistryDetailFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        mRegistryDetailFragment = new RegistryDetailFragment();
        FragmentFactory.attachRegistryDetailFragment(this, bundle, mRegistryDetailFragment);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_DETAIL;
    }

    public void attachRegistryFilterFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachRegistryFilterFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_FILTER;
    }

    public void attachRegistrySearchFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachMyRegistrySearchFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_SEARCH;
    }

    public void attachRegistrySearchResultFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachRegistrySearchResultFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_SEARCH_RESULT;
    }

    public void attachSearchFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachRegistryProductSearchFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_PRODUCT_SEARCH;
    }

    public void attachSearchUserRegistryResultFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachSearchUserResultRegistryFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.REGISTRY_SEARCH_USER_RESULT;
    }

    public void attachVisualSearchFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachVisualSearchFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.VISUAL_SEARCH;
    }

    public void attachWeddingRegistryFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        FragmentFactory.attachWeddingRegistryFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.WEDDING_REGISTRY;
    }

    public String getActionBarTitle()
    {
        return mTitle;
    }

    public Bundle getBundle()
    {
        return mBundle;
    }

    public Bundle getFilterBundle()
    {
        return filterBundle;
    }

    public Map getFindRegistryResultsGroup()
    {
        return findRegistryResultsGroup;
    }

    public FragmentOnScreen getFragmentOnScreen()
    {
        return mFragmentOnScreen;
    }

    protected int getLayoutId()
    {
        return 0x7f030001;
    }

    public FragmentOnScreen getOriginatedFrom()
    {
        return mOriginatedFromFrag;
    }

    public long getRegId()
    {
        return mRegId;
    }

    public LinkedHashMap getRegistryCategoryList()
    {
        return mRegistryCategoryList;
    }

    public RegistryDashboardValueGenerator getRegistryDashboardValueObject()
    {
        return mRegistryDashboardValuesObject;
    }

    public RegistryPO getRegistryPO()
    {
        return mRegistryPO;
    }

    public String getRegistrySearchKeyword()
    {
        return mRegistrySearchString;
    }

    public String getSelectedShippingId()
    {
        return null;
    }

    public List getShippingAddresses()
    {
        return mShippingAddresses;
    }

    public void goToHome()
    {
        Intent intent = new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
        intent.setFlags(0x4000000);
        startActivity(intent);
        finish();
    }

    public void goToRegistryLandingFragment()
    {
        Intent intent = new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
        intent.setFlags(0x4000000);
        intent.putExtra("open_screen_key", "open_my_registry_landing_screen");
        startActivity(intent);
        finish();
    }

    protected void initializeViews(Bundle bundle)
    {
        mScanHelper = new ScanHelper(this);
        mPrevFrag = bundle.getInt("originated from");
        attachDefaultContent();
    }

    public boolean isFromPDP()
    {
        return isFromPDP;
    }

    public boolean isScanCallWithRegistryId(int i, int j, Intent intent)
    {
        if ((i == 2 || i == 1004) && j == -1 && intent.hasExtra("SCAN_DATA"))
        {
            intent = (HashMap)intent.getExtras().getSerializable("SCAN_DATA");
            if (!intent.containsKey("SCAN_PMP_ID") && !intent.containsKey("SCAN_PRODUCT_REVIEW") && !intent.containsKey("SCAN_PMP_BARCODE_SEARCH_ID") && intent.get("SCAN_PDP_QR") == null && intent.get("SCAN_PDP_BARCODE") != null)
            {
                return true;
            }
        }
        return false;
    }

    public void onActionBarBack()
    {
        if (mOriginatedFromFrag == FragmentOnScreen.CELEBRATION_REGISTRY)
        {
            attachCelebrationRegistryFragment(getBundle());
            return;
        }
        if (mOriginatedFromFrag == FragmentOnScreen.BABY_REGISTRY)
        {
            attachBabyRegistryFragment(getBundle());
            return;
        }
        if (mOriginatedFromFrag == FragmentOnScreen.WEDDING_REGISTRY)
        {
            attachWeddingRegistryFragment(getBundle());
            return;
        } else
        {
            attachCreateRegistryFragment(null);
            return;
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 7001) goto _L2; else goto _L1
_L1:
        if (intent == null || !intent.hasExtra("show_screen_on_result")) goto _L4; else goto _L3
_L3:
        intent = FragmentOnScreen.values()[intent.getIntExtra("show_screen_on_result", 0)];
        static class _cls1
        {

            static final int $SwitchMap$com$kohls$mcommerce$opal$framework$view$fragment$utility$FragmentOnScreen[];

            static 
            {
                $SwitchMap$com$kohls$mcommerce$opal$framework$view$fragment$utility$FragmentOnScreen = new int[FragmentOnScreen.values().length];
                try
                {
                    $SwitchMap$com$kohls$mcommerce$opal$framework$view$fragment$utility$FragmentOnScreen[FragmentOnScreen.BABY_REGISTRY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$kohls$mcommerce$opal$framework$view$fragment$utility$FragmentOnScreen[FragmentOnScreen.CELEBRATION_REGISTRY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$kohls$mcommerce$opal$framework$view$fragment$utility$FragmentOnScreen[FragmentOnScreen.WEDDING_REGISTRY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen[intent.ordinal()];
        JVM INSTR tableswitch 1 3: default 68
    //                   1 69
    //                   2 75
    //                   3 81;
           goto _L4 _L5 _L6 _L7
_L4:
        return;
_L5:
        attachBabyRegistryFragment(null);
        return;
_L6:
        attachCelebrationRegistryFragment(null);
        return;
_L7:
        attachWeddingRegistryFragment(null);
        return;
_L2:
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (intent != null && intent.hasExtra("SCAN_DATA"))
        {
            HashMap hashmap = (HashMap)intent.getExtras().getSerializable("SCAN_DATA");
            if (hashmap.containsKey("SCAN_FIND_REGISTRY_ID"))
            {
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
            } else
            if (isScanCallWithRegistryId(i, j, intent))
            {
                if (mActivityResultCallback != null)
                {
                    popSearchFragmentIfVisible();
                    mActivityResultCallback.onActivityResultCallback(i, j, intent);
                    return;
                } else
                {
                    mScanHelper.handleScanResult(i, j, intent);
                    return;
                }
            } else
            {
                mScanHelper.handleScanResult(i, j, intent);
                return;
            }
        }
        if (true) goto _L4; else goto _L8
_L8:
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
                Logger.debug("MyRegistryActivity", "Going to process camera image");
                intent = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "KohlsVisualSearchCamera.jpg");
                Bundle bundle = new Bundle();
                bundle.putString("KohlsVisualSearchDataFile", intent.getAbsolutePath());
                attachVisualSearchFragment(bundle);
                return;
            } else
            {
                Logger.debug("MyRegistryActivity", "Media not accessible, Image search WON'T work");
                return;
            }
        }
        if (true) goto _L4; else goto _L9
_L9:
        if (i == 116)
        {
            KohlsActivityLifecycleCallbacks kohlsactivitylifecyclecallbacks = KohlsPhoneApplication.getInstance().getKohlsActivityLifecycleCallbacks();
            if (kohlsactivitylifecyclecallbacks != null)
            {
                kohlsactivitylifecyclecallbacks.setInteractionCounterToReset(true);
            }
            if (j == -1 && intent != null && intent.getDataString() != null)
            {
                Logger.debug("MyRegistryActivity", "Going to process gallery image");
                Bundle bundle1 = new Bundle();
                bundle1.putString("KohlsVisualSearchDataUri", intent.getDataString());
                attachVisualSearchFragment(bundle1);
                return;
            }
        } else
        {
            mScanHelper.handleScanResult(i, j, intent);
            return;
        }
        if (true) goto _L4; else goto _L10
_L10:
    }

    public void onAddressSelected(com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address address)
    {
        mSelectedAddress = address;
        onDoneBtnClick();
    }

    public void onBackPressed()
    {
        if (mFragmentOnScreen != FragmentOnScreen.CELEBRATION_REGISTRY && mFragmentOnScreen != FragmentOnScreen.BABY_REGISTRY && mFragmentOnScreen != FragmentOnScreen.WEDDING_REGISTRY || mPrevFrag != 1004) goto _L2; else goto _L1
_L1:
        finish();
_L4:
        return;
_L2:
        if (mFragmentOnScreen == FragmentOnScreen.CELEBRATION_REGISTRY || mFragmentOnScreen == FragmentOnScreen.BABY_REGISTRY || mFragmentOnScreen == FragmentOnScreen.WEDDING_REGISTRY)
        {
            attachCreateRegistryFragment(null);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.ADDRESS_FRAGMENT && mPrevFragOnScreen == FragmentOnScreen.CELEBRATION_REGISTRY)
        {
            attachCelebrationRegistryFragment(mBundle);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.ADDRESS_FRAGMENT && mPrevFragOnScreen == FragmentOnScreen.BABY_REGISTRY)
        {
            attachBabyRegistryFragment(mBundle);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.ADDRESS_FRAGMENT && mPrevFragOnScreen == FragmentOnScreen.WEDDING_REGISTRY)
        {
            attachWeddingRegistryFragment(mBundle);
            return;
        }
        if (mFragmentOnScreen != FragmentOnScreen.ADD_ADDRESS_FRAGMENT)
        {
            break; /* Loop/switch isn't completed */
        }
        BaseFragment basefragment = FragmentHelper.getFragmentonTop(new WeakReference(this));
        if (basefragment != null)
        {
            basefragment.onBackPress();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_PRODUCT_SEARCH)
        {
            popSearchFragmentIfVisible();
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_CONFIRMATION)
        {
            BaseFragment basefragment1 = FragmentHelper.getFragmentonTop(new WeakReference(this));
            if (basefragment1 != null)
            {
                basefragment1.onBackPress();
                return;
            }
        } else
        {
            if (mFragmentOnScreen == FragmentOnScreen.CREATE_REGISTRY)
            {
                int i = -1;
                if (mBundle != null)
                {
                    i = mBundle.getInt("origin_of_fragment_manage_registry", -1);
                }
                if (i > -1 && FragmentOnScreen.values()[i] == FragmentOnScreen.MANAGE_REGISTRY)
                {
                    attachManagRegistryFragment(null);
                    return;
                } else
                {
                    super.onBackPressed();
                    return;
                }
            }
            if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_DETAIL)
            {
                int k = -1;
                int j = -1;
                if (mBundle != null)
                {
                    k = mBundle.getInt("origin_from_fragment_find_registry_user", -1);
                    j = mBundle.getInt("origin_of_fragment", -1);
                }
                if (k > -1 && FragmentOnScreen.values()[k] == FragmentOnScreen.REGISTRY_SEARCH_USER_RESULT)
                {
                    attachSearchUserRegistryResultFragment(mBundle);
                    return;
                }
                if (j > -1 && (FragmentOnScreen.values()[j] == FragmentOnScreen.HOME || FragmentOnScreen.values()[j] == FragmentOnScreen.ABOUT_REGISTRY_FRAGMENT || FragmentOnScreen.values()[j] == FragmentOnScreen.REGISTRY_SEARCH_USER_RESULT))
                {
                    finish();
                    return;
                } else
                {
                    attachManagRegistryFragment(null);
                    return;
                }
            }
            if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_FILTER)
            {
                attachRegistrySearchResultFragment(getFilterBundle());
                return;
            }
            if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_SEARCH_USER_RESULT)
            {
                attachRegistrySearchResultFragment(getFilterBundle());
                return;
            }
            if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_SEARCH_RESULT)
            {
                finish();
                return;
            }
            if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_ADVANCE_SEARCH)
            {
                if (mPrevFragOnScreen == FragmentOnScreen.REGISTRY_SEARCH_RESULT)
                {
                    attachRegistrySearchResultFragment(null);
                    return;
                } else
                {
                    finish();
                    return;
                }
            }
            if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_CATEGORY_DETAIL)
            {
                removeRegistryCategoryDetailFragment();
                return;
            } else
            {
                super.onBackPressed();
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void openRegistrySettings(Bundle bundle)
    {
        Intent intent = new Intent(this, com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/RegistrySettingActivity);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }

    public void performSignOut()
    {
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().setUserSignInStatus(false);
        attachCreateRegistryFragment(null);
        UtilityMethods.openAccountActivity(this, true, true);
    }

    public void popRegistrySearchFragmentIfVisible()
    {
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_SEARCH)
        {
            getFragmentManager().popBackStack();
            mFragmentOnScreen = mPrevFragOnScreen;
            mPrevFragOnScreen = null;
        }
    }

    public void popSearchFragmentIfVisible()
    {
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_PRODUCT_SEARCH)
        {
            getFragmentManager().popBackStack();
            mFragmentOnScreen = mPrevFragOnScreen;
            mPrevFragOnScreen = null;
            UtilityMethods.hideKeyboard(this, getCurrentFocus());
            if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_CONFIRMATION)
            {
                finish();
            }
        }
    }

    public void popVisualSearchFragmentIfVisible()
    {
        if (mFragmentOnScreen == FragmentOnScreen.VISUAL_SEARCH)
        {
            getFragmentManager().popBackStack();
            mFragmentOnScreen = mPrevFragOnScreen;
            mPrevFragOnScreen = null;
        }
    }

    public void removeRegistryCategoryDetailFragment()
    {
        if (mFragmentOnScreen == FragmentOnScreen.REGISTRY_CATEGORY_DETAIL)
        {
            getFragmentManager().beginTransaction().remove(mRegistryCategoryDetailFragment).commit();
            mFragmentOnScreen = mPrevFragOnScreen;
            mPrevFragOnScreen = null;
        }
    }

    public void removeRegistryDetailFragment(Bundle bundle)
    {
        mPrevFragOnScreen = mFragmentOnScreen;
        mRegistryDetailFragment = new RegistryDetailFragment();
        FragmentFactory.removeRegistryDetailFragment(this, bundle, mRegistryDetailFragment);
    }

    public void setActionBarParams(android.view.View.OnClickListener onclicklistener)
    {
        if (mOriginatedFromFrag != FragmentOnScreen.WEDDING_REGISTRY) goto _L2; else goto _L1
_L1:
        mTitle = getString(0x7f08038f);
_L4:
        getActionBarHelper().showActionBarForCreateRegistry(mTitle);
        getActionBarHelper().getBackButtonView().setOnClickListener(onclicklistener);
        return;
_L2:
        if (mOriginatedFromFrag == FragmentOnScreen.BABY_REGISTRY)
        {
            mTitle = getString(0x7f080295);
        } else
        if (mOriginatedFromFrag == FragmentOnScreen.CELEBRATION_REGISTRY)
        {
            mTitle = getString(0x7f0802a4);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setActivityResultCallback(ActivityResultCallback activityresultcallback)
    {
        mActivityResultCallback = activityresultcallback;
    }

    public void setBundle(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.putString("last_visited_fragment", "");
            mBundle = bundle;
        }
    }

    public void setFilterBundle(Bundle bundle)
    {
        filterBundle = bundle;
    }

    public void setFindRegistryResultsGroup(Map map)
    {
        findRegistryResultsGroup = map;
    }

    public void setFromPDP(boolean flag)
    {
        isFromPDP = flag;
    }

    public void setOriginatedFrom(FragmentOnScreen fragmentonscreen)
    {
        mOriginatedFromFrag = fragmentonscreen;
    }

    public void setRegId(long l)
    {
        mRegId = l;
    }

    public void setRegistryCategoryList(LinkedHashMap linkedhashmap)
    {
        mRegistryCategoryList = linkedhashmap;
    }

    public void setRegistryDashboardValueObject(RegistryDashboardValueGenerator registrydashboardvaluegenerator)
    {
        mRegistryDashboardValuesObject = registrydashboardvaluegenerator;
    }

    public void setRegistryPO(RegistryPO registrypo)
    {
        mRegistryPO = registrypo;
    }

    public void setRegistrySearchKeyword(String s)
    {
        mRegistrySearchString = s;
    }

    public void setShippingAddresses(List list)
    {
        mShippingAddresses = list;
    }

    protected void updateActionBarViews()
    {
    }

    public void updateViewsOnFailure(Object obj)
    {
label0:
        {
label1:
            {
                mAddressFragment.showHideProgress(false);
                if (!(obj instanceof Error))
                {
                    break label0;
                }
                if (!ErrorHelper.isApplicationManagable((Error)obj))
                {
                    obj = (Error)obj;
                    if (!((Error) (obj)).getMessage().equals(""))
                    {
                        break label1;
                    }
                    Toast.makeText(this, getResources().getString(0x7f0803be), 0).show();
                }
                return;
            }
            Toast.makeText(this, ((Error) (obj)).getMessage(), 0).show();
            return;
        }
        Log.e("updateViewsOnFailure", obj.toString());
        ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
    }

    public void updateViewsOnSuccess(Object obj)
    {
        if (!(obj instanceof MyRegistryVO)) goto _L2; else goto _L1
_L1:
        obj = (MyRegistryVO)obj;
        ((MyRegistryVO) (obj)).getResponseCode();
        JVM INSTR tableswitch 0 0: default 36
    //                   0 58;
           goto _L3 _L4
_L3:
        ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
_L5:
        mAddressFragment.showHideProgress(false);
        return;
_L4:
        obj = ((MyRegistryVO) (obj)).getWishList();
        if (obj != null)
        {
            getBundle().putLong("registry_id", ((com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList) (obj)).getListId());
            attachRegistryConfirmationFragment(getBundle());
        } else
        {
            ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
        }
        if (true) goto _L5; else goto _L2
_L2:
        ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
        return;
    }
}
