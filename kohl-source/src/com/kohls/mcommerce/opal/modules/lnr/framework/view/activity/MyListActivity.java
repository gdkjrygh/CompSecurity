// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import com.kohls.mcommerce.opal.common.app.KohlsActivityLifecycleCallbacks;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithoutSlider;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.helper.ScanHelper;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.modules.lnr.framework.listener.ActivityResultCallback;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.ListDetailVO;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MyListActivity extends BaseActivityWithoutSlider
{
    public static final class ScreenType extends Enum
    {

        private static final ScreenType $VALUES[];
        public static final ScreenType CREATE_LIST;
        public static final ScreenType LIST_SEARCH_RESULT;
        public static final ScreenType MY_LIST;

        public static ScreenType valueOf(String s)
        {
            return (ScreenType)Enum.valueOf(com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/MyListActivity$ScreenType, s);
        }

        public static ScreenType[] values()
        {
            return (ScreenType[])$VALUES.clone();
        }

        static 
        {
            CREATE_LIST = new ScreenType("CREATE_LIST", 0);
            MY_LIST = new ScreenType("MY_LIST", 1);
            LIST_SEARCH_RESULT = new ScreenType("LIST_SEARCH_RESULT", 2);
            $VALUES = (new ScreenType[] {
                CREATE_LIST, MY_LIST, LIST_SEARCH_RESULT
            });
        }

        private ScreenType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String LOG_TAG = "MyListActivity";
    private Map findListResultsGroup;
    private boolean isFromPDP;
    private ActivityResultCallback mActivityResultCallback;
    private Bundle mBundle;
    private FragmentOnScreen mFragmentOnScreen;
    private boolean mIsDataRefreshReqd;
    private boolean mIsInListView;
    private ListDetailVO mListDetailVO;
    private Bundle mListSearchFilterBundle;
    private String mListSearchString;
    private FragmentOnScreen mPrevFragOnScreenForSearch;
    private FragmentOnScreen mPrevToPrevFragOnScreen;
    private ScanHelper mScanHelper;

    public MyListActivity()
    {
        mIsInListView = true;
        isFromPDP = false;
    }

    private void attachDefaultContent(Bundle bundle)
    {
        ScreenType screentype = (ScreenType)getIntent().getSerializableExtra("ScreenToOpen");
        if (screentype == ScreenType.CREATE_LIST)
        {
            if (bundle != null)
            {
                setFromPDP(bundle.getBoolean("isCreateNewListPDP", false));
            }
            attachCreateListFragment(bundle);
        } else
        {
            if (screentype == ScreenType.MY_LIST)
            {
                attachMyListsFragment(null);
                return;
            }
            if (screentype.equals("open_product_matrix"))
            {
                bundle = new Intent();
                bundle.setClass(this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
                bundle.putExtra("open_screen_key", "open_product_matrix");
                bundle.putExtras(bundle.getExtras());
                bundle.putExtra("originated from which fragment", "originated from product search");
                startActivity(bundle);
                return;
            }
            if (screentype == ScreenType.LIST_SEARCH_RESULT)
            {
                attachListSearchResultFragment(getIntent().getExtras());
                return;
            }
        }
    }

    public void attachCreateListConfirmationFragment(Bundle bundle)
    {
        if (mFragmentOnScreen == FragmentOnScreen.CREATE_LIST)
        {
            mPrevToPrevFragOnScreen = mPrevFragOnScreenForSearch;
        }
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachCreateListConfirmationFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.CREATE_LIST_CONFIRMATION;
    }

    public void attachCreateListFragment(Bundle bundle)
    {
        mPrevToPrevFragOnScreen = mPrevFragOnScreenForSearch;
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachCreateListFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.CREATE_LIST;
    }

    public void attachListBudgetFragment(Bundle bundle)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachListBudgetFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.LIST_BUDGET;
    }

    public void attachListDetailFragment(Bundle bundle)
    {
        setIsInListView(true);
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachListDetailFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.LIST_DETAIL;
    }

    public void attachListEditFragment(Bundle bundle)
    {
        mPrevToPrevFragOnScreen = mPrevFragOnScreenForSearch;
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachListEditFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.LIST_EDIT;
    }

    public void attachListFilterFragment(Bundle bundle)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachListFilterFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.LIST_FILTER;
    }

    public void attachListReminderFragment(Bundle bundle)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachListReminderFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.LIST_REMINDER;
    }

    public void attachListSearchFragment(Bundle bundle)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachListSearchFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.LIST_SEARCH;
    }

    public void attachListSearchResultFragment(Bundle bundle)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachListSearchResultFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.LIST_SEARCH_RESULT;
    }

    public void attachMyListsFragment(Bundle bundle)
    {
        mPrevToPrevFragOnScreen = mPrevFragOnScreenForSearch;
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachMyListsFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.MY_LISTS;
    }

    public void attachSearchFragment(Bundle bundle)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachListProductSearchFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.LIST_PRODUCT_SEARCH;
    }

    public void attachSearchUserListsFragment(Bundle bundle)
    {
        mPrevToPrevFragOnScreen = mPrevFragOnScreenForSearch;
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachSearchUserListsFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.LIST_SEARCH_USER_LISTS;
    }

    public void attachVisualSearchFragment(Bundle bundle)
    {
        mPrevFragOnScreenForSearch = mFragmentOnScreen;
        FragmentFactory.attachVisualSearchFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.VISUAL_SEARCH;
    }

    public Bundle getBundle()
    {
        return mBundle;
    }

    public Map getFindListResultsGroup()
    {
        return findListResultsGroup;
    }

    public FragmentOnScreen getFragmentOnScreen()
    {
        return mFragmentOnScreen;
    }

    protected int getLayoutId()
    {
        return 0x7f030001;
    }

    public ListDetailVO getListDetailVO()
    {
        return mListDetailVO;
    }

    public Bundle getListSearchFilterBundle()
    {
        return mListSearchFilterBundle;
    }

    public String getListSearchKeyword()
    {
        return mListSearchString;
    }

    public boolean goBackToMyList()
    {
        return mPrevFragOnScreenForSearch == FragmentOnScreen.MY_LISTS && mFragmentOnScreen == FragmentOnScreen.CREATE_LIST;
    }

    public void goToHome()
    {
        Intent intent = new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
        intent.setFlags(0x4000000);
        startActivity(intent);
        finish();
    }

    protected void initializeViews(Bundle bundle)
    {
        mScanHelper = new ScanHelper(this);
        attachDefaultContent(bundle);
    }

    public boolean isFromPDP()
    {
        return isFromPDP;
    }

    public boolean isInListView()
    {
        return mIsInListView;
    }

    public boolean isIsDataRefreshReqd()
    {
        return mIsDataRefreshReqd;
    }

    public boolean isScanCallWithRegistryId(HashMap hashmap)
    {
        return hashmap != null && !hashmap.containsKey("SCAN_PMP_ID") && !hashmap.containsKey("SCAN_PRODUCT_REVIEW") && !hashmap.containsKey("SCAN_PMP_BARCODE_SEARCH_ID") && hashmap.get("SCAN_PDP_QR") == null && hashmap.get("SCAN_PDP_BARCODE") != null;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i != 2) goto _L2; else goto _L1
_L1:
        if (intent == null || !intent.hasExtra("SCAN_DATA")) goto _L4; else goto _L3
_L3:
        if (!isScanCallWithRegistryId((HashMap)intent.getExtras().getSerializable("SCAN_DATA"))) goto _L6; else goto _L5
_L5:
        if (mActivityResultCallback == null) goto _L8; else goto _L7
_L7:
        popSearchFragmentIfVisible();
        mActivityResultCallback.onActivityResultCallback(i, j, intent);
_L4:
        return;
_L8:
        mScanHelper.handleScanResult(i, j, intent);
        return;
_L6:
        mScanHelper.handleScanResult(i, j, intent);
        return;
_L2:
        if (i != 115)
        {
            continue; /* Loop/switch isn't completed */
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
                Logger.debug("MyListActivity", "Going to process camera image");
                intent = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "KohlsVisualSearchCamera.jpg");
                Bundle bundle = new Bundle();
                bundle.putString("KohlsVisualSearchDataFile", intent.getAbsolutePath());
                attachVisualSearchFragment(bundle);
                return;
            } else
            {
                Logger.debug("MyListActivity", "Media not accessible, Image search WON'T work");
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (i != 116) goto _L4; else goto _L9
_L9:
        KohlsActivityLifecycleCallbacks kohlsactivitylifecyclecallbacks = KohlsPhoneApplication.getInstance().getKohlsActivityLifecycleCallbacks();
        if (kohlsactivitylifecyclecallbacks != null)
        {
            kohlsactivitylifecyclecallbacks.setInteractionCounterToReset(true);
        }
        if (j == -1 && intent != null && intent.getDataString() != null)
        {
            Logger.debug("MyListActivity", "Going to process gallery image");
            Bundle bundle1 = new Bundle();
            bundle1.putString("KohlsVisualSearchDataUri", intent.getDataString());
            attachVisualSearchFragment(bundle1);
            return;
        }
        if (true) goto _L4; else goto _L10
_L10:
    }

    public void onBackPressed()
    {
        if (mFragmentOnScreen == FragmentOnScreen.LIST_BUDGET)
        {
            if (mBundle.getString("origin_of_fragment", "").equals("origin_of_fragment_edit_list"))
            {
                attachListEditFragment(mBundle);
                return;
            }
            if (mBundle.getString("origin_of_fragment", "").equals("origin_of_fragment_ldp"))
            {
                attachListDetailFragment(mBundle);
                return;
            } else
            {
                attachCreateListConfirmationFragment(mBundle);
                return;
            }
        }
        if (mFragmentOnScreen == FragmentOnScreen.CREATE_LIST && mPrevFragOnScreenForSearch == FragmentOnScreen.MY_LISTS)
        {
            attachMyListsFragment(null);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.CREATE_LIST_CONFIRMATION && mPrevToPrevFragOnScreen == FragmentOnScreen.MY_LISTS)
        {
            attachMyListsFragment(null);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.LIST_REMINDER)
        {
            if (mBundle.getString("origin_of_fragment", "").equals("origin_of_fragment_edit_list"))
            {
                attachListEditFragment(mBundle);
                return;
            }
            if (mBundle.getString("origin_of_fragment", "").equals("origin_of_fragment_ldp"))
            {
                attachListDetailFragment(mBundle);
                return;
            } else
            {
                attachCreateListConfirmationFragment(mBundle);
                return;
            }
        }
        if (mFragmentOnScreen == FragmentOnScreen.LIST_EDIT)
        {
            attachListDetailFragment(mBundle);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.LIST_DETAIL)
        {
            if (mBundle.getString("origin of ldp", "").equals("origin_of_fragment_search_user_list"))
            {
                attachSearchUserListsFragment(mBundle);
                return;
            } else
            {
                attachMyListsFragment(null);
                mListDetailVO = null;
                return;
            }
        }
        if (mFragmentOnScreen == FragmentOnScreen.LIST_PRODUCT_SEARCH)
        {
            popSearchFragmentIfVisible();
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.LIST_FILTER)
        {
            attachListSearchResultFragment(mListSearchFilterBundle);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.LIST_SEARCH_USER_LISTS)
        {
            attachListSearchResultFragment(mListSearchFilterBundle);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.LIST_SEARCH_RESULT)
        {
            finish();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        finish();
        super.onRestoreInstanceState(bundle);
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

    public void popSearchFragmentIfVisible()
    {
        if (mFragmentOnScreen == FragmentOnScreen.LIST_PRODUCT_SEARCH)
        {
            getFragmentManager().popBackStack();
            mFragmentOnScreen = mPrevFragOnScreenForSearch;
            mPrevFragOnScreenForSearch = null;
            UtilityMethods.hideKeyboard(this, getCurrentFocus());
            if (mFragmentOnScreen == FragmentOnScreen.CREATE_LIST_CONFIRMATION)
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
            mFragmentOnScreen = mPrevFragOnScreenForSearch;
            mPrevFragOnScreenForSearch = null;
        }
    }

    public void setActivityResultCallback(ActivityResultCallback activityresultcallback)
    {
        mActivityResultCallback = activityresultcallback;
    }

    public void setBundle(Bundle bundle)
    {
        bundle.putString("last_visited_fragment", "");
        mBundle = bundle;
    }

    public void setFindListResultsGroup(Map map)
    {
        findListResultsGroup = map;
    }

    public void setFromPDP(boolean flag)
    {
        isFromPDP = flag;
    }

    public void setIsDataRefreshReqd(boolean flag)
    {
        mIsDataRefreshReqd = flag;
    }

    public void setIsInListView(boolean flag)
    {
        mIsInListView = flag;
    }

    public void setListDetailVO(ListDetailVO listdetailvo)
    {
        mListDetailVO = listdetailvo;
    }

    public void setListSearchFilterBundle(Bundle bundle)
    {
        mListSearchFilterBundle = bundle;
    }

    public void setListSearchKeyword(String s)
    {
        mListSearchString = s;
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
