// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.ui.components;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.location.Location;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.iface.IGeoLocation;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.helper.GeoLocationHelper;
import com.kohls.mcommerce.opal.framework.view.component.views.BottomBarDrawer;
import com.kohls.mcommerce.opal.framework.view.component.views.GothamBookTextView;
import com.kohls.mcommerce.opal.framework.view.component.views.iface.BottomBarDrawerListener;
import com.kohls.mcommerce.opal.framework.vo.ErrorVO;
import com.kohls.mcommerce.opal.framework.vo.IValueObject;
import com.kohls.mcommerce.opal.framework.vo.RecommendationsVO;
import com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO;
import com.kohls.mcommerce.opal.helper.adapter.listener.IAdapterListener;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;

public class SlidingUpViewHelper
    implements BottomBarDrawerListener, IAdapterListener
{

    private IGeoLocation geoLocationListner;
    private int mActionBarAnimOffset;
    private int mActionBarHeight;
    private Activity mActivity;
    private BottomBarDrawer mBottomBarDrawer;
    private android.view.View.OnClickListener mClickListener;
    private GeoLocationHelper mGeoLocationHelper;
    private ImageView mImgListRewardToggle;
    private boolean mIsActionBarHidden;
    private boolean mIsExpanded;
    private LinearLayout mProgressBar;
    private ProgressBar mRecommendationProgressBar;
    private LinearLayout mRecommendationsLayout;
    private RecommendationsVO mRecommendationsVO;
    private GridView mRecommendedGridView;
    private View mSearchView;
    private String mToggleText;
    private TextView mTxtListRewardToggle;
    private com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store mUserStore;
    private TextView mWelcomeHeader;
    private TextView mWelcomeMessage;
    private String storeNum;

    public SlidingUpViewHelper(BottomBarDrawer bottombardrawer, Activity activity, int i)
    {
        mClickListener = new _cls1();
        geoLocationListner = new _cls5();
        mBottomBarDrawer = bottombardrawer;
        mActivity = activity;
        mActionBarHeight = i;
        mActionBarAnimOffset = mActionBarHeight + (int)UtilityMethods.convertDpToPixel(50F, mActivity);
    }

    private void getRecommendations(String s, String s1)
    {
        mRecommendationsLayout.setVisibility(0);
        mRecommendationProgressBar.setVisibility(0);
        mRecommendedGridView.setVisibility(8);
        com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store = (new PreferenceHelper(mActivity)).getUserStore();
        String s2 = s;
        if (s == null)
        {
            s2 = s;
            if (store != null)
            {
                s2 = store.getStoreNum();
            }
        }
        s = s1;
        if (s1 == null)
        {
            s = s1;
            try
            {
                if (mGeoLocationHelper != null)
                {
                    s = mGeoLocationHelper.populateZipCode();
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = s1;
            }
        }
        UtilityMethods.getRecommendations(null, s2, "toptrending", "4", s, this);
    }

    private void getStore(Location location)
    {
        visibleProgressBar();
        UtilityMethods.getStores(location, this);
    }

    private void getStoreLocation(Location location)
    {
        if (mUserStore != null && mUserStore.getAddress() != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (location == null) goto _L2; else goto _L1
_L1:
        getStore(location);
_L4:
        return;
_L2:
        if (mGeoLocationHelper == null) goto _L4; else goto _L3
_L3:
        getStore(mGeoLocationHelper.getCurrentLocation());
        return;
        getRecommendations(mUserStore.getStoreNum(), mUserStore.getAddress().getPostalCode());
        return;
    }

    private void hideProgressBar()
    {
        if (mProgressBar != null)
        {
            mProgressBar.setVisibility(8);
        }
    }

    private void hideWelcomeMessage()
    {
        mWelcomeHeader.setVisibility(8);
        mWelcomeMessage.setVisibility(8);
    }

    private void setActionBarTranslation(float f)
    {
        int j = mActionBarHeight;
        ViewGroup viewgroup = (ViewGroup)mActivity.findViewById(0x1020002).getParent();
        Logger.debug("Slider", viewgroup.toString());
        int k = viewgroup.getChildCount();
        int i = 0;
        while (i < k) 
        {
            View view = viewgroup.getChildAt(i);
            if (view.getId() != 0x1020002)
            {
                if (f <= (float)(-j))
                {
                    view.setVisibility(8);
                } else
                {
                    Logger.debug("Slider", (new StringBuilder()).append("parallax : ").append(f).toString());
                    view.setVisibility(0);
                    view.setTranslationY(f);
                }
            }
            i++;
        }
    }

    private void setListRewardImage()
    {
        SpannableString spannablestring;
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && !TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()))
        {
            mImgListRewardToggle.setImageResource(0x7f02015a);
            mToggleText = mActivity.getResources().getString(0x7f080240);
        } else
        {
            mImgListRewardToggle.setImageResource(0x7f0201f0);
            mToggleText = mActivity.getResources().getString(0x7f08023d);
        }
        spannablestring = new SpannableString(mToggleText);
        spannablestring.setSpan(new UnderlineSpan(), 0, spannablestring.length(), 0);
        mTxtListRewardToggle.setText(spannablestring);
    }

    private void setStoreAddress(com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store.Address address)
    {
        GothamBookTextView gothambooktextview = (GothamBookTextView)mActivity.findViewById(0x7f0d0377);
        mActivity.findViewById(0x7f0d0375).setVisibility(0);
        hideProgressBar();
        mActivity.runOnUiThread(new _cls4(address, gothambooktextview));
    }

    private void setUserStore()
    {
        GothamBookTextView gothambooktextview = (GothamBookTextView)mActivity.findViewById(0x7f0d0377);
        mUserStore = KohlsPhoneApplication.getInstance().getKohlsPref().getUserStore();
        StringBuilder stringbuilder = new StringBuilder();
        if (mUserStore != null && mUserStore.getAddress() != null)
        {
            mActivity.findViewById(0x7f0d0375).setVisibility(0);
            hideProgressBar();
            String s1 = mUserStore.getAddress().getAddr1();
            String s = s1;
            if (TextUtils.isEmpty(s1))
            {
                s = mUserStore.getAddress().getAddr2();
            }
            stringbuilder.append(s);
            stringbuilder.append("\n");
            stringbuilder.append(mUserStore.getAddress().getCity());
            stringbuilder.append(", ");
            stringbuilder.append(mUserStore.getAddress().getState());
            stringbuilder.append(", ");
            stringbuilder.append(mUserStore.getAddress().getPostalCode());
            gothambooktextview.setText(stringbuilder.toString());
            mWelcomeMessage.setText((new StringBuilder()).append(mUserStore.getAddress().getCity()).append(", ").append(mUserStore.getAddress().getState()).toString());
            visisbleWelcomeMessage();
        }
    }

    private void showMyLists()
    {
        mIsExpanded = false;
        ((HomeActivity)mActivity).attachListFragment(null, false);
        mBottomBarDrawer.hide();
    }

    private void showStoreDetails(String s)
    {
        if (s != null)
        {
            UtilityMethods.openWebViewActivity(mActivity, "http://kohls.shoplocal.com/Kohls/Entry/LandingContent?storeid=2490958&sneakpeek=N&listingid=0", "");
        } else
        {
            s = (new PreferenceHelper(mActivity)).getUserStore();
            if (s != null && s.getStoreNum() != null)
            {
                UtilityMethods.openWebViewActivity(mActivity, "http://kohls.shoplocal.com/Kohls/Entry/LandingContent?storeid=2490958&sneakpeek=N&listingid=0", "");
                return;
            }
        }
    }

    private void showStoreLocator()
    {
        ((HomeActivity)mActivity).attachStoreLocatorFragment(null);
        mBottomBarDrawer.hide();
    }

    private void toggleSearchView(boolean flag)
    {
label0:
        {
            if (mSearchView != null)
            {
                if (!flag)
                {
                    break label0;
                }
                mSearchView.setVisibility(0);
            }
            return;
        }
        mSearchView.setVisibility(8);
    }

    private void visibleProgressBar()
    {
        if (mProgressBar != null)
        {
            mProgressBar.setVisibility(0);
        }
    }

    private void visisbleWelcomeMessage()
    {
        mWelcomeHeader.setVisibility(0);
        mWelcomeMessage.setVisibility(0);
    }

    public void disableSlidingLayout()
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setDigbyNotification(false, null);
        mBottomBarDrawer.hide();
        mIsExpanded = false;
    }

    public void enableSlidingLayout()
    {
        mActivity.findViewById(0x7f0d0379).setOnClickListener(mClickListener);
        mActivity.findViewById(0x7f0d0375).setOnClickListener(mClickListener);
        mActivity.findViewById(0x7f0d036f).setOnClickListener(mClickListener);
        mActivity.findViewById(0x7f0d0373).setOnClickListener(mClickListener);
        mActivity.findViewById(0x7f0d036e).setOnClickListener(mClickListener);
        mRecommendationProgressBar = (ProgressBar)mActivity.findViewById(0x7f0d037b);
        mRecommendedGridView = (GridView)mActivity.findViewById(0x7f0d037c);
        mImgListRewardToggle = (ImageView)mActivity.findViewById(0x7f0d0371);
        mImgListRewardToggle.setOnClickListener(mClickListener);
        mTxtListRewardToggle = (TextView)mActivity.findViewById(0x7f0d0372);
        setListRewardImage();
        mRecommendationsLayout = (LinearLayout)mActivity.findViewById(0x7f0d037a);
        mBottomBarDrawer.setDrawerListener(this);
        mProgressBar = (LinearLayout)mActivity.findViewById(0x7f0d0378);
        mWelcomeHeader = (TextView)mActivity.findViewById(0x7f0d036c);
        mWelcomeMessage = (TextView)mActivity.findViewById(0x7f0d036d);
        hideWelcomeMessage();
        if (KohlsPhoneApplication.getInstance().getKohlsPref().getLocationFromGeofence() == null)
        {
            setUserStore();
            mGeoLocationHelper = new GeoLocationHelper(new WeakReference(mActivity), geoLocationListner);
            mGeoLocationHelper.initializeComponent();
        } else
        {
            getStoreLocation(KohlsPhoneApplication.getInstance().getKohlsPref().getLocationFromGeofence());
        }
        mActionBarAnimOffset = mActionBarHeight + (int)UtilityMethods.convertDpToPixel(50F, mActivity);
        mActionBarAnimOffset = mBottomBarDrawer.getExpandedHeightofDrawer() - mActionBarAnimOffset;
        mBottomBarDrawer.show();
        mBottomBarDrawer.expand();
        mIsExpanded = true;
        UtilityMethods.setApptentiveScreen(mActivity, "instore");
    }

    public Error getPayloadError(IValueObject ivalueobject)
    {
        if (ivalueobject instanceof RecommendationsVO)
        {
            if (mRecommendationsVO != null && mRecommendationsVO.getErrors() != null && mRecommendationsVO.getErrors().size() > 0)
            {
                return new Error(((com.kohls.mcommerce.opal.framework.vo.RecommendationsVO.Error)mRecommendationsVO.getErrors().get(0)).getCode(), ((com.kohls.mcommerce.opal.framework.vo.RecommendationsVO.Error)mRecommendationsVO.getErrors().get(0)).getMessage(), com.kohls.mcommerce.opal.helper.error.Error.ErrorType.ADAPTER_PAYLOAD);
            }
        } else
        if (ivalueobject instanceof StoreLocatorVO)
        {
            ivalueobject = (StoreLocatorVO)ivalueobject;
            if (ivalueobject != null && ivalueobject.getErrors() != null && ivalueobject.getErrors().size() > 0)
            {
                Logger.debug("Slider:SLVO", ((ErrorVO)ivalueobject.getErrors().get(0)).getMessage());
            }
        }
        return null;
    }

    public void initSlidingUpLayout()
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        mActivity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i = (int)UtilityMethods.convertDpToPixel(20F, mActivity);
        int j = displaymetrics.heightPixels;
        mBottomBarDrawer.setExpandedHeightOfDrawer(j - i);
    }

    public boolean isSliderExpanded()
    {
        return mIsExpanded;
    }

    public void onCollapsing()
    {
        if (mIsActionBarHidden)
        {
            toggleSearchView(true);
            mActivity.getActionBar().show();
        }
    }

    public void onExpanding()
    {
        toggleSearchView(false);
        mIsActionBarHidden = true;
        mActivity.getActionBar().hide();
    }

    public void onFailure(Error error)
    {
        mActivity.runOnUiThread(new _cls3(error));
    }

    public void onHidden()
    {
        mIsActionBarHidden = true;
        toggleSearchView(true);
        mActivity.getActionBar().show();
    }

    public void onMoving(int i)
    {
        if (i >= mActionBarAnimOffset)
        {
            mIsActionBarHidden = true;
            toggleSearchView(false);
            mActivity.getActionBar().hide();
        } else
        if (mIsActionBarHidden)
        {
            mIsActionBarHidden = false;
            toggleSearchView(true);
            mActivity.getActionBar().show();
            return;
        }
    }

    public void onSuccess(IValueObject ivalueobject)
    {
        mActivity.runOnUiThread(new _cls2(ivalueobject));
    }

    public void setSearchView(View view)
    {
        mSearchView = view;
    }





/*
    static String access$102(SlidingUpViewHelper slidingupviewhelper, String s)
    {
        slidingupviewhelper.storeNum = s;
        return s;
    }

*/
















/*
    static RecommendationsVO access$702(SlidingUpViewHelper slidingupviewhelper, RecommendationsVO recommendationsvo)
    {
        slidingupviewhelper.mRecommendationsVO = recommendationsvo;
        return recommendationsvo;
    }

*/



    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}

}
