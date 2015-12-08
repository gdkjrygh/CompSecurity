// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.components.CustomSearchView;
import com.kohls.mcommerce.opal.common.ui.components.SlidingUpViewHelper;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenController;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenListener;
import com.kohls.mcommerce.opal.framework.controller.impl.HomeController;
import com.kohls.mcommerce.opal.framework.controller.impl.LoyaltyControllerImpl;
import com.kohls.mcommerce.opal.framework.listener.HamburgerCloseListener;
import com.kohls.mcommerce.opal.framework.listener.ListItemClickListener;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithSlider;
import com.kohls.mcommerce.opal.framework.view.activity.CollectionsActivity;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ProductDetailsActivity;
import com.kohls.mcommerce.opal.framework.view.adapter.ImageViewPagerAdapter;
import com.kohls.mcommerce.opal.framework.view.adapter.SixUpAdapter;
import com.kohls.mcommerce.opal.framework.view.component.image.ZoomOutPageTransformer;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.framework.vo.CMSResponseVO;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.helper.cache.image.LoadImageTask;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.error.ErrorHelper;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.wallet.manager.ActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.util.PointsIndicatorSeekBar;
import com.kohls.mcommerce.opal.wallet.util.RewardCache;
import com.viewpagerindicator.CirclePageIndicator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.fragment:
//            BaseFragment, HamburgerListFragment

public class HomeFragment extends BaseFragment
    implements ListItemClickListener, ActionListener, IRefreshTokenListener, HamburgerCloseListener
{

    public static String TAG = com/kohls/mcommerce/opal/framework/view/fragment/HomeFragment.getName();
    private ImageView mBrandFeature_1;
    private ImageView mBrandFeature_2;
    private LinearLayout mCMSLayout;
    protected CirclePageIndicator mCirclePageIndicator;
    private CMSResponseVO mCmsResponseVo;
    private TextView mCurrentPointTxtView;
    private boolean mHamburgerOpened;
    public HomeController mHomeController;
    protected ImageViewPagerAdapter mImageAdapter;
    protected ViewPager mImageGalleryPager;
    private String mItemUrlForBigData;
    private RelativeLayout mLoyalityMeter;
    private LinearLayout mLoyaltyContainer;
    private LoyaltyControllerImpl mLoyaltyControllerImpl;
    private LoyaltyMeterUILoadertask mLoyaltyMeterLodertask;
    private TextView mMaxPointTxtView;
    private TextView mMinPointTxtView;
    private PointsIndicatorSeekBar mPointsIndicatorBar;
    private ProgressBar mProgressBar;
    private LinearLayout mProgressBarLayout;
    private ImageView mPromoModule_1;
    private ImageView mPromoModule_2;
    private ImageView mRecomendation;
    private LoyaltyProfileResponse mRewardData;
    private TextView mRewardsText;
    private ImageView mScanIcon;
    private CustomSearchView mSearchViewIcon;
    private GridView mSixSpotGridView;
    private ImageView mSixSpotHeader;
    private LinearLayout mViewPagerCMS;

    public HomeFragment()
    {
        mCmsResponseVo = null;
    }

    private void display6UpSpot(List list)
    {
        list = fetchSortedSixSoptData(list);
        list = new SixUpAdapter(new WeakReference(getActivity()), list);
        mSixSpotGridView.setAdapter(list);
        list.notifyDataSetChanged();
    }

    private void displayLoyalty(com.kohls.mcommerce.opal.framework.vo.CMSResponseVO.Payload.Entries entries)
    {
        ArrayList arraylist = new ArrayList();
        mViewPagerCMS.setVisibility(8);
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref().isEmpty() || KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref() == null || !KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
        {
            mLoyaltyContainer.setVisibility(8);
            mViewPagerCMS.setVisibility(0);
            com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Payload.Product.Image image = new com.kohls.mcommerce.opal.framework.vo.ProductDetailVO.Payload.Product.Image();
            image.setURL(entries.getFileUrl());
            arraylist.add(image);
            mImageAdapter.setImageResizeNeeded(false);
            mImageAdapter.setImagesList(arraylist);
            mImageAdapter.notifyDataSetChanged();
        }
    }

    private List fetchSortedSixSoptData(List list)
    {
        Collections.sort(list);
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
label0:
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            Iterator iterator = mCmsResponseVo.getPayload().getEntries().iterator();
            com.kohls.mcommerce.opal.framework.vo.CMSResponseVO.Payload.Entries entries;
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                entries = (com.kohls.mcommerce.opal.framework.vo.CMSResponseVO.Payload.Entries)iterator.next();
            } while (entries.getProperties() == null || entries.getProperties().getModuleName() == null || !s.equalsIgnoreCase(entries.getProperties().getModuleName()));
            arraylist.add(entries);
        } while (true);
        return arraylist;
    }

    private void hideProgressBar()
    {
        mProgressBarLayout.setVisibility(8);
    }

    private void loadImage(ImageView imageview, String s)
    {
        LoadImageTask.getInstance().loadImage(s, imageview, 0, 0);
    }

    private void openPDP(String s)
    {
        Intent intent = new Intent();
        if (s.startsWith("c"))
        {
            intent.setClass(getActivity(), com/kohls/mcommerce/opal/framework/view/activity/CollectionsActivity);
        } else
        {
            intent.setClass(getActivity(), com/kohls/mcommerce/opal/framework/view/activity/ProductDetailsActivity);
            intent.putExtra("from", "Home");
        }
        intent.putExtra("key_category_id", s);
        getActivity().startActivity(intent);
        getActivity().overridePendingTransition(0x7f05000b, 0x7f05000a);
    }

    private void openPDPOrPMP(String s)
    {
        int i = s.indexOf("title=");
        String s1 = "";
        if (i != -1)
        {
            s1 = s.substring(i + 6, s.length()).replace("%20", " ");
        }
        if (s.contains("subcategory.html?id="))
        {
            String s2 = s.substring(s.indexOf("=") + 1, s.length());
            s = s2;
            if (s2.contains("&"))
            {
                s = s2.substring(0, s2.indexOf("&"));
            }
            openPMP(s, s1);
            return;
        }
        if (s.contains("department.html?id="))
        {
            String s3 = s.substring(s.indexOf("=") + 1, s.length());
            s = s3;
            if (s3.contains("&"))
            {
                s = s3.substring(0, s3.indexOf("&"));
            }
            openPMP(s, s1);
            return;
        }
        if (s.contains("CN="))
        {
            openPDP(s.substring(s.indexOf("CN=") + 3, s.length()));
            return;
        } else
        {
            ((HomeActivity)getActivity()).attachWebProdutModulesFragment(null, s, null);
            return;
        }
    }

    private void openPMP(String s)
    {
        if (s.length() > 0)
        {
            Object obj = s;
            if (s.contains("%20"))
            {
                obj = s.replaceAll("%20", " ");
            }
            s = new Bundle();
            s.putBoolean("key_is_from_search", true);
            s.putString("key_search_keyword", ((String) (obj)));
            s.putString("key_page_title", ((String) (obj)));
            obj = (HomeActivity)getActivity();
            if (obj != null)
            {
                ((HomeActivity) (obj)).attachProductMatrixFragment(FragmentOnScreen.HOME, s);
            }
        }
    }

    private void openPMP(String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("key_page_title", s1);
        bundle.putString("key_category_id", s);
        ((HomeActivity)getActivity()).attachProductMatrixFragment(((HomeActivity)getActivity()).getFragmentOnScreen(), bundle);
    }

    private void openWebPage(String s)
    {
        Iterator iterator = mCmsResponseVo.getPayload().getEntries().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.kohls.mcommerce.opal.framework.vo.CMSResponseVO.Payload.Entries entries = (com.kohls.mcommerce.opal.framework.vo.CMSResponseVO.Payload.Entries)iterator.next();
            if (!s.equalsIgnoreCase(entries.getProperties().getModuleName()))
            {
                continue;
            }
            if (s.equalsIgnoreCase("Recommendation"))
            {
                s = entries.getProperties().getTarget_Recommendation_Signed();
            } else
            {
                s = entries.getItemUrl();
            }
            if (!UtilityMethods.checkAndLaunchPDPOrPMP(s, getActivity()))
            {
                ((HomeActivity)getActivity()).attachWebProdutModulesFragment(null, s, null);
            }
            break;
        } while (true);
    }

    private void setClickListenerOnBrandFeature_1()
    {
        mBrandFeature_1.setOnClickListener(new _cls7());
    }

    private void setClickListenerOnBrandFeature_2()
    {
        mBrandFeature_2.setOnClickListener(new _cls8());
    }

    private void setClickListenerOnRecomendation()
    {
        mRecomendation.setOnClickListener(new _cls6());
    }

    private void setClickListenerOnScanIcon()
    {
        mScanIcon.setOnClickListener(new _cls3());
    }

    private void setClickListnerOnProductModule_1()
    {
        mPromoModule_1.setOnClickListener(new _cls4());
    }

    private void setClickListnerOnProductModule_2()
    {
        mPromoModule_2.setOnClickListener(new _cls5());
    }

    private void showCMSLayout()
    {
        mCMSLayout.setVisibility(0);
    }

    public void displayHomePage()
    {
        hideProgressBar();
        ArrayList arraylist = new ArrayList();
        if (mCmsResponseVo != null && mCmsResponseVo.getPayload() != null && mCmsResponseVo.getPayload().getEntries() != null)
        {
            showCMSLayout();
            Iterator iterator = mCmsResponseVo.getPayload().getEntries().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.kohls.mcommerce.opal.framework.vo.CMSResponseVO.Payload.Entries entries = (com.kohls.mcommerce.opal.framework.vo.CMSResponseVO.Payload.Entries)iterator.next();
                if (entries.getProperties() != null && entries.getProperties().getModuleName() != null)
                {
                    if (entries.getProperties().getModuleName().equalsIgnoreCase("Loyalty"))
                    {
                        displayLoyalty(entries);
                    } else
                    if (entries.getProperties().getModuleName().contains("6UpBrandHeader"))
                    {
                        loadImage(mSixSpotHeader, entries.getFileUrl());
                    } else
                    if (entries.getProperties().getModuleName().contains("6UpSpot"))
                    {
                        arraylist.add(entries.getProperties().getModuleName());
                    } else
                    if (entries.getProperties().getModuleName().equalsIgnoreCase("PromotionModule1"))
                    {
                        loadImage(mPromoModule_1, entries.getFileUrl());
                    } else
                    if (entries.getProperties().getModuleName().equalsIgnoreCase("PromotionModule2"))
                    {
                        loadImage(mPromoModule_2, entries.getFileUrl());
                    } else
                    if (entries.getProperties().getModuleName().equalsIgnoreCase("BrandFeature1"))
                    {
                        loadImage(mBrandFeature_1, entries.getFileUrl());
                    } else
                    if (entries.getProperties().getModuleName().equalsIgnoreCase("BrandFeature2"))
                    {
                        loadImage(mBrandFeature_2, entries.getFileUrl());
                    } else
                    if (entries.getProperties().getModuleName().equalsIgnoreCase("Recommendation"))
                    {
                        mItemUrlForBigData = entries.getItemUrl();
                        loadImage(mRecomendation, entries.getFileUrl());
                    }
                }
            } while (true);
            display6UpSpot(arraylist);
        }
    }

    protected void initializeAttributes()
    {
    }

    protected void initializeController()
    {
        mHomeController = (HomeController)ControllerFactory.getHomeController(new WeakReference(this));
    }

    protected void initializeViews(Bundle bundle)
    {
        mProgressBarLayout = (LinearLayout)getFragmentView().findViewById(0x7f0d0357);
        mCMSLayout = (LinearLayout)getFragmentView().findViewById(0x7f0d0358);
        mViewPagerCMS = (LinearLayout)getFragmentView().findViewById(0x7f0d035a);
        mImageGalleryPager = (ViewPager)getFragmentView().findViewById(0x7f0d035b);
        mLoyaltyContainer = (LinearLayout)getFragmentView().findViewById(0x7f0d0359);
        mCirclePageIndicator = (CirclePageIndicator)getFragmentView().findViewById(0x7f0d035c);
        mSixSpotGridView = (GridView)getFragmentView().findViewById(0x7f0d035e);
        mPromoModule_1 = (ImageView)getFragmentView().findViewById(0x7f0d035f);
        mPromoModule_2 = (ImageView)getFragmentView().findViewById(0x7f0d0363);
        mBrandFeature_1 = (ImageView)getFragmentView().findViewById(0x7f0d0360);
        mBrandFeature_2 = (ImageView)getFragmentView().findViewById(0x7f0d0361);
        mRecomendation = (ImageView)getFragmentView().findViewById(0x7f0d0362);
        mSixSpotHeader = (ImageView)getFragmentView().findViewById(0x7f0d035d);
        mProgressBar = (ProgressBar)mLoyaltyContainer.findViewById(0x7f0d0497);
        mLoyalityMeter = (RelativeLayout)mLoyaltyContainer.findViewById(0x7f0d0498);
        mPointsIndicatorBar = (PointsIndicatorSeekBar)mLoyaltyContainer.findViewById(0x7f0d049a);
        mPointsIndicatorBar.setMax(100);
        mPointsIndicatorBar.setThumb(getActivity().getResources().getDrawable(0x7f0201b2));
        mPointsIndicatorBar.setOnTouchListener(new _cls1());
        mCurrentPointTxtView = (TextView)mLoyaltyContainer.findViewById(0x7f0d0499);
        mMinPointTxtView = (TextView)mLoyaltyContainer.findViewById(0x7f0d04c5);
        mMaxPointTxtView = (TextView)mLoyaltyContainer.findViewById(0x7f0d04c6);
        mRewardsText = (TextView)mLoyaltyContainer.findViewById(0x7f0d0496);
        mImageAdapter = new ImageViewPagerAdapter(getActivity(), false, false, this);
        mImageGalleryPager.setPageTransformer(true, new ZoomOutPageTransformer());
        mImageGalleryPager.setAdapter(mImageAdapter);
        mCirclePageIndicator.setViewPager(mImageGalleryPager);
        mScanIcon = (ImageView)getFragmentView().findViewById(0x7f0d0406);
        mSearchViewIcon = (CustomSearchView)getFragmentView().findViewById(0x7f0d066d);
        mSearchViewIcon.setClickable(true);
        ((BaseActivityWithSlider)getActivity()).getActionBarHelper().showActionBarWithShoppingBag(getResources().getString(0x7f08001b));
        mSearchViewIcon.setOnClickListener(new _cls2());
        ((HomeActivity)getActivity()).getSlidingViewHelper().setSearchView(mSearchViewIcon);
        setClickListenerOnScanIcon();
        setClickListnerOnProductModule_1();
        setClickListnerOnProductModule_2();
        setClickListenerOnRecomendation();
        setClickListenerOnBrandFeature_1();
        setClickListenerOnBrandFeature_2();
    }

    protected int intializaLayoutId()
    {
        return 0x7f03008d;
    }

    protected void loadContent()
    {
        mHomeController.getCMSData(KohlsPhoneApplication.getInstance().getKohlsPref().getCMSPageName());
        ListenerManager.getInstance().registerListener(this, "onlyreward");
    }

    public void onActionPerformed()
    {
        try
        {
            mRewardData = RewardCache.get(KohlsPhoneApplication.getInstance());
            if (mRewardData != null && mRewardData.isSuccess())
            {
    /* block-local class not found */
    class LoyaltyMeterUILoadertask {}

                mLoyaltyMeterLodertask = new LoyaltyMeterUILoadertask();
                mLoyaltyMeterLodertask.execute(new Context[] {
                    getActivity()
                });
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
    }

    public void onClickItem(int i)
    {
label0:
        {
            if (i == 0 && (KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref().isEmpty() || KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref() == null || !KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn()))
            {
                if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getUserAccessTokenFromPref()))
                {
                    break label0;
                }
                ((HomeActivity)getActivity()).attachLoyaltyGuestFragment(null);
            }
            return;
        }
        if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()))
        {
            ((HomeActivity)getActivity()).attachLoyaltyFragment(null);
            return;
        } else
        {
            ((HomeActivity)getActivity()).attachLoyaltySignupFragment(null);
            return;
        }
    }

    public void onHamburgerMenuClose()
    {
        if (mHamburgerOpened)
        {
            AnalyticsHelper.sendAnalyticsForHomePage();
            mHamburgerOpened = false;
        }
    }

    public void onHamburgerMenuOpened()
    {
        mHamburgerOpened = true;
    }

    public void onPause()
    {
        super.onPause();
        if (mLoyaltyMeterLodertask != null)
        {
            mLoyaltyMeterLodertask.cancel(true);
        }
    }

    public void onRefreshTokenFailure()
    {
    }

    public void onRefreshTokenSuccess()
    {
    }

    public void onResume()
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().checkUserSessionValid())
        {
            ControllerFactory.getRefreshTokenController().checkAndRefreshToken(this);
        }
        if (KohlsPhoneApplication.getInstance().isAppBackground() && !KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref().isEmpty())
        {
            if (mLoyaltyContainer != null && mLoyaltyContainer.getVisibility() == 8)
            {
                mLoyaltyContainer.setVisibility(0);
            }
            mLoyaltyControllerImpl = new LoyaltyControllerImpl(new WeakReference(this));
            mLoyaltyControllerImpl.loadLoyaltyMeterTask();
        }
        ((BaseActivityWithSlider)getActivity()).getMenuFragment().reSetMenuArraryList();
        super.onResume();
    }

    public void onStart()
    {
        super.onStart();
        AnalyticsHelper.sendAnalyticsForHomePage();
        if (getActivity() instanceof BaseActivityWithSlider)
        {
            ((BaseActivityWithSlider)getActivity()).setHamburgerCloseListener(this);
        }
    }

    public void onStop()
    {
        super.onStop();
        if (getActivity() instanceof BaseActivityWithSlider)
        {
            ((BaseActivityWithSlider)getActivity()).removeHamburgerCloseListener();
        }
    }

    public void updateViewsOnFailure(Object obj)
    {
        if ((obj instanceof Error) && !ErrorHelper.isApplicationManagable((Error)obj))
        {
            ToastUtility.showCustomToast(getActivity().getActionBar().getHeight(), ((Error)obj).getMessage());
        }
        hideProgressBar();
        mCmsResponseVo = null;
    }

    public void updateViewsOnSuccess(Object obj)
    {
        if (obj instanceof CMSResponseVO)
        {
            mCmsResponseVo = (CMSResponseVO)obj;
            displayHomePage();
        }
    }

















    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
