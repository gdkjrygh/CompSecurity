// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.framework.view.activity.AccountActivity;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithoutSlider;
import com.kohls.mcommerce.opal.framework.view.activity.BeautyOperations;
import com.kohls.mcommerce.opal.framework.view.activity.EULAActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ForgotPasswordActivity;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.KohlsChargeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.UpdateAccountActivity;
import com.kohls.mcommerce.opal.framework.view.activity.visualSearch.FragmentVisualSearch;
import com.kohls.mcommerce.opal.framework.view.fragment.productdetails.ProductDetailsFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentHelper;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.loyalty.LoyaltyEnrollmentActivity;
import com.kohls.mcommerce.opal.loyalty.LoyaltyGuestFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyListActivity;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.MyRegistryActivity;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.AboutRegistryFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.AddAddressFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.AddressFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.BabyRegistryFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.CelebrationRegistryFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.CreateListFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.CreateRegistryFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.ListBudgetFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.ListCreateConfirmationFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.ListDetailFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.ListEditFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.ListFilterFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.ListLandingFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.ListReminderFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.ListSearchFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.ListSearchResultFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.ListSearchUserListsFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.LnRMyListsFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.LnRMyRegistryFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistryAddCategoryFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistryAdvanceSearchFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistryCategoryDetailFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistryCategoryFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistryConfirmationFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistryDetailFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistryFilterFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistryLandingFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistrySearchFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistrySearchResultFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistrySearchUserListsFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistrySettingFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistrySettingsMsgPromocodeFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistrySettingsRegistrantFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistrySettingsSpecialDayFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.WeddingRegistryFragment;
import com.kohls.mcommerce.opal.wallet.fragment.MainActivity;
import java.lang.ref.WeakReference;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.fragment:
//            AccountFragment, BigDataFragment, ConfirmPasswordFragment, ForgotPasswordFragment, 
//            EULAFragment, FeatureBrandWebFragment, FilterProductMatrixFragment, GWPConfigurationFragment, 
//            HelpAndContactUsFragment, HomeFragment, KohlsChargeFragment, BrowserFragment, 
//            SearchFragment, LoyaltyEnrollmentConfirmationFragment, Yes2YouRewardsFragment, ManageAccountFragment, 
//            OrderTrackingStatusFragment, ProductMatrixFragment, RatingReviewDetailsFragment, RatingReviewListFragment, 
//            WriteAReviewFragment, SignInInfoFragment, SocialFeedFragment, StoreLocatorFragment, 
//            ResetMyPasswordFragment, WebViewFragment

public class FragmentFactory
{

    private static Bundle mLastInvokedPMPBundle;

    public FragmentFactory()
    {
    }

    public static void addRegistryDetailFragment(Activity activity, Bundle bundle, RegistryDetailFragment registrydetailfragment)
    {
        FragmentHelper.addFragmentWithDefaultAnimation(new WeakReference(activity), registrydetailfragment, bundle, FragmentOnScreen.REGISTRY_DETAIL.toString());
    }

    public static void attachAccountParentFragment(AccountActivity accountactivity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(accountactivity), new AccountFragment(), bundle, "tag-account");
    }

    public static void attachAddAddressFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new AddAddressFragment(), bundle, "add address frag");
    }

    public static AddressFragment attachAddressFragment(Activity activity, Bundle bundle)
    {
        AddressFragment addressfragment = new AddressFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), addressfragment, bundle, "address frag");
        return addressfragment;
    }

    public static void attachBabyConfirmationFragment(Activity activity, Bundle bundle)
    {
        RegistryConfirmationFragment registryconfirmationfragment = new RegistryConfirmationFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), registryconfirmationfragment, bundle, "manageRegistry");
    }

    public static void attachBabyRegistryFragment(Activity activity, Bundle bundle)
    {
        BabyRegistryFragment babyregistryfragment = new BabyRegistryFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), babyregistryfragment, bundle, null);
    }

    public static void attachBigDataFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new BigDataFragment(), bundle, null);
    }

    public static void attachCelebrationRegistryFragment(Activity activity, Bundle bundle)
    {
        CelebrationRegistryFragment celebrationregistryfragment = new CelebrationRegistryFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), celebrationregistryfragment, bundle, null);
    }

    public static void attachConfirmPasswordFragment(UpdateAccountActivity updateaccountactivity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(updateaccountactivity), new ConfirmPasswordFragment(), bundle, "tag-confirm-password");
    }

    public static void attachCreateListConfirmationFragment(Activity activity, Bundle bundle)
    {
        ListCreateConfirmationFragment listcreateconfirmationfragment = new ListCreateConfirmationFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), listcreateconfirmationfragment, bundle, null);
    }

    public static void attachCreateListFragment(Activity activity, Bundle bundle)
    {
        CreateListFragment createlistfragment = new CreateListFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), createlistfragment, bundle, null);
    }

    public static void attachCreateProfileConfirmationFragment(ForgotPasswordActivity forgotpasswordactivity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(forgotpasswordactivity), new ForgotPasswordFragment(), bundle, null);
    }

    public static void attachCreateRegistryFragment(Activity activity, Bundle bundle)
    {
        CreateRegistryFragment createregistryfragment = new CreateRegistryFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), createregistryfragment, bundle, null);
    }

    public static void attachEulaFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((EULAActivity)activity), new EULAFragment(), null, "tag-eula");
    }

    public static void attachFeatureBrandWebFragment(Activity activity, Bundle bundle, FragmentOnScreen fragmentonscreen)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new FeatureBrandWebFragment(), bundle, null);
    }

    public static void attachFilterFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new FilterProductMatrixFragment(), bundle, null);
    }

    public static void attachForgotPasswordFragment(ForgotPasswordActivity forgotpasswordactivity, Bundle bundle)
    {
        ForgotPasswordFragment forgotpasswordfragment = new ForgotPasswordFragment();
        forgotpasswordfragment.setOnPasswordChangedListener(forgotpasswordactivity);
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(forgotpasswordactivity), forgotpasswordfragment, bundle, null);
    }

    public static void attachGWPConfigurationFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new GWPConfigurationFragment(), bundle, null);
    }

    public static void attachHelpAndContactUsFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new HelpAndContactUsFragment(), bundle, null);
    }

    public static void attachHomeFragment(Activity activity, Bundle bundle, boolean flag)
    {
        bundle = new HomeFragment();
        if (flag)
        {
            FragmentHelper.replaceFragmentOnBackPress(new WeakReference(activity), bundle, null, null);
            return;
        } else
        {
            FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), bundle, null, "tag-home");
            return;
        }
    }

    public static void attachKohlsChargeFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new KohlsChargeFragment(), bundle, null);
    }

    public static void attachKohlsChargeFragment(KohlsChargeActivity kohlschargeactivity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference(kohlschargeactivity), new KohlsChargeFragment(), bundle);
    }

    public static void attachListBudgetFragment(Activity activity, Bundle bundle)
    {
        ListBudgetFragment listbudgetfragment = new ListBudgetFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), listbudgetfragment, bundle, null);
    }

    public static void attachListDetailFragment(Activity activity, Bundle bundle)
    {
        ListDetailFragment listdetailfragment = new ListDetailFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), listdetailfragment, bundle, null);
    }

    public static void attachListEditFragment(Activity activity, Bundle bundle)
    {
        ListEditFragment listeditfragment = new ListEditFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), listeditfragment, bundle, null);
    }

    public static void attachListFilterFragment(Activity activity, Bundle bundle)
    {
        ListFilterFragment listfilterfragment = new ListFilterFragment();
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference(activity), listfilterfragment, bundle);
    }

    public static void attachListFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new BrowserFragment(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getListUrl()), bundle, "tag-list");
    }

    public static void attachListLandingFragment(Activity activity, Bundle bundle, boolean flag)
    {
        bundle = new ListLandingFragment();
        if (flag)
        {
            FragmentHelper.replaceFragmentOnBackPress(new WeakReference(activity), bundle, null, null);
            return;
        } else
        {
            FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), bundle, null, null);
            return;
        }
    }

    public static void attachListProductSearchFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.addFragmentWithNoAnimation(new WeakReference((MyListActivity)activity), new SearchFragment(), bundle);
    }

    public static void attachListReminderFragment(Activity activity, Bundle bundle)
    {
        ListReminderFragment listreminderfragment = new ListReminderFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), listreminderfragment, bundle, null);
    }

    public static void attachListSearchFragment(Activity activity, Bundle bundle)
    {
        WeakReference weakreference = null;
        if (!(activity instanceof HomeActivity)) goto _L2; else goto _L1
_L1:
        weakreference = new WeakReference((HomeActivity)activity);
_L4:
        FragmentHelper.addFragmentWithNoAnimation(weakreference, new ListSearchFragment(), bundle);
        return;
_L2:
        if (activity instanceof MyListActivity)
        {
            weakreference = new WeakReference((MyListActivity)activity);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void attachListSearchResultFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference((MyListActivity)activity), new ListSearchResultFragment(), bundle);
    }

    public static void attachLoyaltyEnrolledConfirmationFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new LoyaltyEnrollmentConfirmationFragment(), bundle, null);
    }

    public static void attachLoyaltyFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new Yes2YouRewardsFragment(), bundle, "tag-fragment-loyalty");
    }

    public static void attachManageAccountFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new ManageAccountFragment(), bundle, null);
    }

    public static void attachManageRegistryFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new LnRMyRegistryFragment(), bundle, FragmentOnScreen.MANAGE_REGISTRY.toString());
    }

    public static void attachMyListsFragment(Activity activity, Bundle bundle)
    {
        bundle = new LnRMyListsFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), bundle, null, null);
    }

    public static void attachMyRegistrySearchFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference((MyRegistryActivity)activity), new RegistrySearchFragment(), bundle);
    }

    public static void attachNewListFragment(Activity activity, Bundle bundle)
    {
        String s = (new StringBuilder()).append("?section=list&listid=").append(BeautyOperations.newListId).append("&isFromSearch=true").toString();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new BrowserFragment((new StringBuilder()).append(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getListUrl()).append(s).toString()), bundle, "qrcode");
    }

    public static void attachOrderTrackStatusFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((BaseActivityWithoutSlider)activity), new OrderTrackingStatusFragment(), bundle, "tag-order-track-status");
    }

    public static void attachProductDetailsFragment(Activity activity, Bundle bundle, ProductDetailsFragment productdetailsfragment)
    {
        FragmentHelper.replaceFragmentWithStateLoss(new WeakReference(activity), productdetailsfragment, bundle);
    }

    public static void attachProductMatrixFragment(Activity activity, Bundle bundle, FragmentOnScreen fragmentonscreen)
    {
        if (bundle != null)
        {
            mLastInvokedPMPBundle = bundle;
        }
        bundle = new ProductMatrixFragment();
        if (fragmentonscreen == FragmentOnScreen.HOME)
        {
            FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), bundle, mLastInvokedPMPBundle, null);
        }
        if (fragmentonscreen == FragmentOnScreen.REGISTRY_LANDING)
        {
            FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), bundle, mLastInvokedPMPBundle, null);
        } else
        {
            if (fragmentonscreen == FragmentOnScreen.PRODUCT_MATRIX)
            {
                FragmentHelper.replaceFragmentWithFadeOutAnimation(new WeakReference((HomeActivity)activity), bundle, mLastInvokedPMPBundle, null);
                return;
            }
            if (fragmentonscreen == FragmentOnScreen.FILTER)
            {
                FragmentHelper.replaceFragmentOnBackPress(new WeakReference(activity), bundle, mLastInvokedPMPBundle, null);
                return;
            }
            if (fragmentonscreen == null)
            {
                FragmentHelper.replaceFragmentOnBackPress(new WeakReference(activity), bundle, mLastInvokedPMPBundle, null);
                return;
            }
        }
    }

    public static void attachRatingReviewDetailsFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new RatingReviewDetailsFragment(), bundle, null);
    }

    public static void attachRatingReviewListFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new RatingReviewListFragment(), bundle, null);
    }

    public static void attachRatingReviewWriteFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new WriteAReviewFragment(), bundle, null);
    }

    public static void attachRegistryAddCategoryFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new RegistryAddCategoryFragment(), bundle, FragmentOnScreen.REGISTRY_ADD_CATEGORY_FRAGMENT.toString());
    }

    public static void attachRegistryAdvanceSearchFragment(Activity activity, Bundle bundle)
    {
        RegistryAdvanceSearchFragment registryadvancesearchfragment = new RegistryAdvanceSearchFragment();
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference(activity), registryadvancesearchfragment, bundle);
    }

    public static void attachRegistryCategoryDetailFragment(Activity activity, Bundle bundle, RegistryCategoryDetailFragment registrycategorydetailfragment)
    {
        FragmentHelper.addFragmentWithNoAnimation(new WeakReference(activity), registrycategorydetailfragment, bundle, FragmentOnScreen.REGISTRY_CATEGORY_DETAIL.toString());
    }

    public static void attachRegistryCategoryFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference(activity), new RegistryCategoryFragment(), bundle);
    }

    public static void attachRegistryDetailFragment(Activity activity, Bundle bundle, RegistryDetailFragment registrydetailfragment)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), registrydetailfragment, bundle, FragmentOnScreen.REGISTRY_DETAIL.toString());
    }

    public static void attachRegistryFilterFragment(Activity activity, Bundle bundle)
    {
        RegistryFilterFragment registryfilterfragment = new RegistryFilterFragment();
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference(activity), registryfilterfragment, bundle);
    }

    public static void attachRegistryFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new BrowserFragment(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getRegistryUrl()), bundle, "tag-registry");
    }

    public static void attachRegistryLandingFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new RegistryLandingFragment(), bundle, "reg landing frag");
    }

    public static void attachRegistryProductSearchFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference((BaseActivityWithoutSlider)activity), new SearchFragment(), bundle);
    }

    public static void attachRegistrySearchFragment(Activity activity, Bundle bundle, String s)
    {
        FragmentHelper.addFragmentWithNoAnimation(new WeakReference(activity), new RegistrySearchFragment(), bundle, s);
    }

    public static void attachRegistrySearchResultFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference((MyRegistryActivity)activity), new RegistrySearchResultFragment(), bundle);
    }

    public static void attachRegistrySettingFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference(activity), new RegistrySettingFragment(), bundle);
    }

    public static void attachRewardsGuestFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new LoyaltyGuestFragment(), bundle, null);
    }

    public static void attachRewardsSignupFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new LoyaltyEnrollmentActivity(), bundle, null);
    }

    public static void attachSearchFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.addFragmentWithNoAnimation(new WeakReference((HomeActivity)activity), new SearchFragment(), bundle);
    }

    public static void attachSearchUserListsFragment(Activity activity, Bundle bundle)
    {
        ListSearchUserListsFragment listsearchuserlistsfragment = new ListSearchUserListsFragment();
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference(activity), listsearchuserlistsfragment, bundle);
    }

    public static void attachSearchUserResultRegistryFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference((MyRegistryActivity)activity), new RegistrySearchUserListsFragment(), bundle);
    }

    public static void attachSignInfoFragment(UpdateAccountActivity updateaccountactivity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(updateaccountactivity), new SignInInfoFragment(), null, "tag-sign-in-info");
    }

    public static void attachSocialFeedFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new SocialFeedFragment(), bundle, "tag-#KOHLS");
    }

    public static void attachStoreLocatorFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new StoreLocatorFragment(), null, null);
    }

    public static void attachUpdatePasswordFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((UpdateAccountActivity)activity), new ResetMyPasswordFragment(), null, "tag-reset-password");
    }

    public static void attachVisualSearchFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.addFragmentWithNoAnimation(new WeakReference(activity), new FragmentVisualSearch(), bundle);
    }

    public static void attachWalletFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference((HomeActivity)activity), new MainActivity(), bundle, null);
    }

    public static void attachWebViewFragment(Activity activity, Bundle bundle, String s, String s1)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new WebViewFragment(s, s1), bundle, null);
    }

    public static void attachWeddingAboutFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), new AboutRegistryFragment(), bundle, null);
    }

    public static void attachWeddingRegistryFragment(Activity activity, Bundle bundle)
    {
        WeddingRegistryFragment weddingregistryfragment = new WeddingRegistryFragment();
        FragmentHelper.replaceFragmentWithDefaultAnimation(new WeakReference(activity), weddingregistryfragment, bundle, null);
    }

    public static void attachtRegSettingsMsgPromocodeFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference(activity), new RegistrySettingsMsgPromocodeFragment(), bundle);
    }

    public static void attachtRegSettingsRegistrantsFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference(activity), new RegistrySettingsRegistrantFragment(), bundle);
    }

    public static void attachtRegSettingsSpecialDayFragment(Activity activity, Bundle bundle)
    {
        FragmentHelper.replaceFragmentWithNoAnimation(new WeakReference(activity), new RegistrySettingsSpecialDayFragment(), bundle);
    }

    public static void removeRegistryDetailFragment(Activity activity, Bundle bundle, RegistryDetailFragment registrydetailfragment)
    {
        if (activity != null && !activity.isFinishing())
        {
            activity = activity.getFragmentManager().beginTransaction();
            activity.remove(registrydetailfragment);
            activity.commit();
        }
    }
}
