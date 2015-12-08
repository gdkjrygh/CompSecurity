// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.po.MenuCategory;
import com.kohls.mcommerce.opal.common.ui.components.SlidingUpViewHelper;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.controller.iface.ICategoryController;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithSlider;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.adapter.NavigationDrawerAdapter;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.wallet.activity.WalletActivity;
import com.kohls.mcommerce.opal.wl.HybridScreen;
import com.kohls.mcommerce.opal.wl.WLActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.fragment:
//            BaseFragment

public class HamburgerListFragment extends BaseFragment
    implements android.widget.AdapterView.OnItemClickListener, android.os.Handler.Callback
{

    public static final String TAG = com/kohls/mcommerce/opal/framework/view/fragment/HamburgerListFragment.getName();
    private static List mNavigationPath = new ArrayList();
    private ICategoryController mCategoryController;
    public NavigationDrawerAdapter mDrawerAdapter;
    private ListView mDrawerList;
    private boolean mIsPMPInitialized;
    private String mParrentCategory;
    private MenuCategory mSelectedCategory;
    private ArrayList menuArraryList;

    public HamburgerListFragment()
    {
        mParrentCategory = "";
    }

    public static void addNavigationPath(String s)
    {
        if (mNavigationPath.size() > 0)
        {
            mNavigationPath.add("|");
        }
        mNavigationPath.add(s);
    }

    private void attachAccountFragment()
    {
        ((HomeActivity)getActivity()).attachAccountFragment(null);
    }

    private void attachGuestFragment()
    {
        ((HomeActivity)getActivity()).attachLoyaltyGuestFragment(null);
    }

    private void attachLoyaltyFragment()
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
        {
            ((HomeActivity)getActivity()).attachLoyaltyFragment(null);
        }
    }

    private void attachRewardFragment()
    {
        ((HomeActivity)getActivity()).attachLoyaltySignupFragment(null);
    }

    private void attachWalletFragment()
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
        {
            ((HomeActivity)getActivity()).attachWalletFragment(null);
        }
    }

    public static String getNavigationPath()
    {
        return Arrays.toString(mNavigationPath.toArray());
    }

    private void handleDataSetChanged(ArrayList arraylist)
    {
        mDrawerAdapter.setListofCategories(arraylist);
        mDrawerAdapter.notifyDataSetChanged();
    }

    public static void removeNavigationPath(String s)
    {
        for (int i = mNavigationPath.size() - 1; i == 0; i--)
        {
            if (!s.equals(mNavigationPath.get(i)))
            {
                mNavigationPath.remove(i);
            }
        }

    }

    private void showBopusDialog()
    {
        Dialog dialog = new Dialog(getActivity());
        dialog.setTitle("Bopus Feature");
        dialog.setContentView(0x7f030028);
        dialog.getWindow().getAttributes().windowAnimations = 0x7f0f000e;
        Button button = (Button)dialog.getWindow().findViewById(0x7f0d0162);
        if (Boolean.parseBoolean(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().isFeatureBOPUSEnabled()))
        {
            button.setText("Disable Bopus");
        } else
        {
            button.setText("Enable Bopus");
        }
        button.setOnClickListener(new _cls6(button));
        dialog.show();
    }

    private void showDebugSettingsDialog()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle("Change CMS Home Page Campaign");
        builder.setMessage("Enter CMS Campaign");
        EditText edittext = new EditText(getActivity());
        edittext.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        builder.setView(edittext);
        builder.setPositiveButton("YES", new _cls1(edittext));
        builder.setNegativeButton("Set the Default", new _cls2());
        builder.show();
    }

    private void showOmnichannelSettings()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle("Omnichannel bag Debug");
        builder.setMessage("Enable or Disable Omnichannel bag");
        Button button = new Button(getActivity());
        button.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        if (!KohlsPhoneApplication.getInstance().getKohlsPref().wantOmnichannelFlagOverride())
        {
            button.setText("Start Omnichannel debug");
        } else
        {
            button.setText("Stop Omnichannel debug");
        }
        button.setOnClickListener(new _cls3(button));
        builder.setView(button);
        builder.setPositiveButton("true", new _cls4());
        builder.setNegativeButton("false", new _cls5());
        builder.show();
    }

    public ArrayList getMenuArraryList()
    {
        return menuArraryList;
    }

    public boolean handleMessage(Message message)
    {
        return false;
    }

    protected void initializeAttributes()
    {
    }

    protected void initializeController()
    {
        mCategoryController = ControllerFactory.getCategoryController(getActivity(), new WeakReference(this));
    }

    protected void initializeViews(Bundle bundle)
    {
        mDrawerList = (ListView)getActivity().findViewById(0x7f0d04af);
    }

    protected int intializaLayoutId()
    {
        return 0x7f0300b9;
    }

    protected void loadContent()
    {
        mDrawerAdapter = new NavigationDrawerAdapter(getActivity(), 0x7f0d022d, mCategoryController.getRootCategory());
        mDrawerList.setAdapter(mDrawerAdapter);
        mDrawerList.setOnItemClickListener(this);
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ((ProgressBar)view.findViewById(0x7f0d022e)).setVisibility(0);
        ((HomeActivity)getActivity()).getActionBarHelper().showShoppinBagIcon();
        ((HomeActivity)getActivity()).attachActionItemListener();
        mSelectedCategory = (MenuCategory)mDrawerAdapter.getListofCategories().get(i);
        ((HomeActivity)getActivity()).getActionBarHelper().showShoppingBagCount();
        if (mSelectedCategory != null && mSelectedCategory.getCatCode() == 1000)
        {
            ((HomeActivity)getActivity()).getSlidingViewHelper().disableSlidingLayout();
            ((BaseActivityWithSlider)getActivity()).getActionBarHelper().showActionBarWithShoppingBag(null);
            ((HomeActivity)getActivity()).attachHomeFragment(null, true);
            reSetMenuArraryList();
            handleDataSetChanged(mCategoryController.getRootCategory());
            if (mDrawerAdapter.getRootLevelItem() == 0)
            {
                ((HomeActivity)getActivity()).hideSlider();
            }
            loadContent();
        } else
        if (mSelectedCategory != null && mSelectedCategory.isHasChild())
        {
            mParrentCategory = mSelectedCategory.getName();
            menuArraryList = mCategoryController.getCategoriesForMenu(mSelectedCategory, null, null);
        } else
        if (mSelectedCategory != null)
        {
            menuArraryList = mCategoryController.getCategoriesForMenu(mSelectedCategory, null, null);
            handleDataSetChanged(menuArraryList);
        }
        if (mSelectedCategory.getResourcePath().contains(getResources().getString(0x7f080444)))
        {
            adapterview = null;
            if (!mSelectedCategory.isHasChild())
            {
                adapterview = mSelectedCategory.getResourcePath().substring(mSelectedCategory.getResourcePath().lastIndexOf("/") + 1);
            }
            view = new Bundle();
            view.putString("key_parrent_category", mParrentCategory);
            view.putString("key_page_title", mSelectedCategory.getName());
            StringBuilder stringbuilder = new StringBuilder();
            if (mSelectedCategory.isHasChild())
            {
                view.putBoolean("key_is_from_category", true);
                if (menuArraryList.size() > 2)
                {
                    for (i = 2; i < menuArraryList.size(); i++)
                    {
                        stringbuilder.append(((MenuCategory)menuArraryList.get(i)).getName());
                        stringbuilder.append(" ");
                    }

                }
                if (menuArraryList.size() > 2)
                {
                    view.putString("key_category", stringbuilder.toString().trim());
                } else
                {
                    view.putString("key_category", mSelectedCategory.getName());
                }
            } else
            {
                view.putString("key_category_id", adapterview);
            }
            ((HomeActivity)getActivity()).attachProductMatrixFragment(((HomeActivity)getActivity()).getFragmentOnScreen(), view);
        }
        if (mSelectedCategory.getCatCode() == 1014)
        {
            adapterview = mSelectedCategory.getResourcePath();
            view = mSelectedCategory.getName();
            Bundle bundle = new Bundle();
            bundle.putString("key_page_title", view);
            if (adapterview.contains("kohls.com"))
            {
                bundle.putString("KEY_URL", adapterview);
                ((HomeActivity)getActivity()).attachFeatureBrandWebFragment(((HomeActivity)getActivity()).getFragmentOnScreen(), bundle);
            } else
            {
                bundle.putString("key_category_id", adapterview);
                bundle.putBoolean("key_is_for_featured_brand", true);
                ((HomeActivity)getActivity()).attachProductMatrixFragment(((HomeActivity)getActivity()).getFragmentOnScreen(), bundle);
            }
        }
        if (mSelectedCategory != null && !mSelectedCategory.isHasChild())
        {
            ((HomeActivity)getActivity()).getSlidingViewHelper().disableSlidingLayout();
            if (mSelectedCategory.getCatCode() == 1008)
            {
                ((HomeActivity)getActivity()).attachStoreLocatorFragment(null);
            } else
            if (mSelectedCategory != null && mSelectedCategory.getCatCode() == 1004)
            {
                if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && KohlsPhoneApplication.getInstance().getAuthenticationUtils().checkUserSessionValid())
                {
                    attachAccountFragment();
                } else
                {
                    UtilityMethods.openAccountActivity(getActivity(), true, true);
                }
            } else
            if (mSelectedCategory != null && mSelectedCategory.getCatCode() == 1009)
            {
                if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && KohlsPhoneApplication.getInstance().getAuthenticationUtils().checkUserSessionValid())
                {
                    adapterview = new Intent();
                    adapterview.setClass(getActivity(), com/kohls/mcommerce/opal/wl/WLActivity);
                    adapterview.putExtra("screenToLoad", HybridScreen.ORDER_HISTORY);
                    getActivity().startActivity(adapterview);
                } else
                {
                    UtilityMethods.openOrderTrackStatusActivity(getActivity());
                }
            } else
            if (mSelectedCategory.getCatCode() == 1010)
            {
                ((HomeActivity)getActivity()).attachKohlsChargeFragment(null);
            } else
            if (mSelectedCategory.getCatCode() == 1012)
            {
                ((HomeActivity)getActivity()).attachHelpAndContactUsFragment(null);
            } else
            if (mSelectedCategory.getCatCode() == 1005)
            {
                ((HomeActivity)getActivity()).attachListFragment(null, false);
            } else
            if (mSelectedCategory.getCatCode() == 1006)
            {
                adapterview = new Bundle();
                ((HomeActivity)getActivity()).attachRegistryLandingFragment(adapterview);
            } else
            if (mSelectedCategory.getCatCode() == 1007)
            {
                ((HomeActivity)getActivity()).attachWebProdutModulesFragment(null, KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getTodaysDealsUrl(), "Deals and Coupns");
            } else
            if (mSelectedCategory.getCatCode() == 1011)
            {
                ((HomeActivity)getActivity()).getSlidingViewHelper().enableSlidingLayout();
                AnalyticsHelper.sendAnalyticsForInStoreTools();
            } else
            if (mSelectedCategory.getCatCode() == 1015)
            {
                showDebugSettingsDialog();
            } else
            if (mSelectedCategory != null && mSelectedCategory.getCatCode() == 1002)
            {
                if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getUserAccessTokenFromPref()))
                {
                    attachWalletFragment();
                } else
                {
                    startActivity(new Intent(getActivity(), com/kohls/mcommerce/opal/wallet/activity/WalletActivity));
                }
            } else
            if (mSelectedCategory != null && mSelectedCategory.getCatCode() == 1003)
            {
                if (TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getUserAccessTokenFromPref()))
                {
                    attachGuestFragment();
                } else
                if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()))
                {
                    attachLoyaltyFragment();
                } else
                {
                    attachRewardFragment();
                }
            } else
            if (mSelectedCategory.getCatCode() == 1017)
            {
                showOmnichannelSettings();
            } else
            if (mSelectedCategory != null && mSelectedCategory.getCatCode() == 1016)
            {
                showBopusDialog();
            }
            ((HomeActivity)getActivity()).hideSlider();
        }
    }

    public void reSetMenuArraryList()
    {
        menuArraryList = null;
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
        if (mCategoryController.getSelectedCategory() == mSelectedCategory)
        {
            handleDataSetChanged(mCategoryController.getCategoriesForMenu(mSelectedCategory, null, (ArrayList)obj));
        }
    }


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}

}
