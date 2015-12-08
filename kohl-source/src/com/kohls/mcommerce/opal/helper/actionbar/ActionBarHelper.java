// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.actionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.FontUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.AccountActivity;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentHelper;
import java.lang.ref.WeakReference;

public class ActionBarHelper
{

    public static final int ACTION_ITEM_CREATE_LIST_BUTTON = 16;
    public static final int ACTION_ITEM_DETAIL = 4;
    public static final int ACTION_ITEM_DONE_BUTTON = 15;
    public static final int ACTION_ITEM_EDIT_ITEM = 9;
    public static final int ACTION_ITEM_EDIT_LIST_BUTTON = 17;
    public static final int ACTION_ITEM_ERROR_ACTIVITY = 8;
    public static final int ACTION_ITEM_EULA = 12;
    public static final int ACTION_ITEM_GWP_CONFIGURATION = 18;
    public static final int ACTION_ITEM_LIST = 2;
    public static final int ACTION_ITEM_MAP = 3;
    public static final int ACTION_ITEM_PRODUCT_DETAIL = 5;
    public static final int ACTION_ITEM_RATING_REVIEW = 10;
    public static final int ACTION_ITEM_SCREEN_SCAN_HELP = 14;
    public static final int ACTION_ITEM_SCREEN_SOCIAL_FOLLOW = 19;
    public static final int ACTION_ITEM_SCREEN_TITLE_ONLY = 13;
    public static final int ACTION_ITEM_SHOPPING_BAG = 1;
    public static final int ACTION_ITEM_SIGNIN_NEWPROFILE = 6;
    public static final int ACTION_ITEM_UPDATE_ACCOUNT = 11;
    public static final int ACTION_ITEM_WEBVIEW_ACTIVITY = 7;
    public static final int ACTION_ITEM_WITHOUT_SHOPPING_BAG = 20;
    private ActionBar mActionBar;
    private Activity mActivity;
    private ImageView mAppImageView;
    private TextView mAppTitleTextView;
    private ImageView mExtraItemView;
    private TextView mExtraText;
    private FrameLayout mImageandText;
    private ImageView mItemView;
    private TextView mItemViewCount;
    private LinearLayout mLeftView;
    private LinearLayout mListIconLayout;
    private ImageView mListImageView;
    private TextView mTitleTextView;

    public ActionBarHelper(Activity activity, ActionBar actionbar)
    {
        mActivity = activity;
        mActionBar = actionbar;
    }

    private void finishAccountActitiy()
    {
        Intent intent = new Intent();
        intent.setFlags(0x4000000);
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
        {
            boolean flag = ((AccountActivity)mActivity).isManageAccScreenshouldbeShown();
            boolean flag1 = ((AccountActivity)mActivity).isTargetFragmentShouldbeShown();
            if (flag)
            {
                intent.putExtra("ATTACH_MANAGE_ACCOUNT_FRAGMENT", "ATTACH_MANAGE_ACCOUNT_FRAGMENT");
            } else
            if (flag1)
            {
                intent.putExtra("show_screen_on_result", flag1);
            } else
            {
                intent.putExtra("CLOSE_ACTIVITY_ONLY", "CLOSE_ACTIVITY_ONLY");
            }
        } else
        {
            intent.putExtra("CLOSE_ACTIVITY_ONLY", "CLOSE_ACTIVITY_ONLY");
        }
        mActivity.setResult(-1, intent);
        mActivity.finish();
    }

    private Fragment getFragmentByTag()
    {
        Fragment fragment = mActivity.getFragmentManager().findFragmentByTag("tag-confirm-password");
        if (fragment != null)
        {
            return fragment;
        } else
        {
            return mActivity.getFragmentManager().findFragmentByTag("tag-reset-password");
        }
    }

    private boolean isHomeOrEULAFragmentOnTop()
    {
        com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment basefragment = FragmentHelper.getFragmentonTop(new WeakReference(mActivity));
        return basefragment != null && !TextUtils.isEmpty(basefragment.getTag()) && (basefragment.getTag() == "tag-home" || basefragment.getTag() == "tag-eula");
    }

    private void showActionBarForSlider(String s, int i, boolean flag, boolean flag1, boolean flag2, int j)
    {
        UtilityMethods.hideKeyboard(mActivity, mListIconLayout);
        getExtraTextView().setVisibility(8);
        if (flag && !TextUtils.isEmpty(s))
        {
            mTitleTextView.setVisibility(0);
            mTitleTextView.setText(s);
            mTitleTextView.setOnClickListener(new _cls2(i));
        } else
        {
            mTitleTextView.setVisibility(8);
        }
        if (flag1)
        {
            mAppImageView.setVisibility(0);
        } else
        {
            mAppImageView.setVisibility(8);
        }
        mActionBar.setDisplayOptions(16);
        if (j != 0)
        {
            mListImageView.setImageDrawable(mActivity.getResources().getDrawable(j));
            if (j == 0x7f020137)
            {
                mTitleTextView.setPadding(20, 0, 0, 0);
            } else
            {
                mTitleTextView.setPadding(0, 0, 0, 0);
            }
            mListIconLayout.setOnClickListener(new _cls3(i, flag2));
        } else
        {
            mListImageView.setVisibility(8);
        }
        mImageandText.setVisibility(0);
        mItemView.setVisibility(0);
        i;
        JVM INSTR tableswitch 1 16: default 240
    //                   1 296
    //                   2 477
    //                   3 565
    //                   4 653
    //                   5 674
    //                   6 240
    //                   7 240
    //                   8 240
    //                   9 731
    //                   10 240
    //                   11 240
    //                   12 240
    //                   13 240
    //                   14 240
    //                   15 353
    //                   16 419;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L1 _L1 _L7 _L1 _L1 _L1 _L1 _L1 _L8 _L9
_L1:
        updateRightIcon(i);
        return;
_L2:
        mItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f0201b8));
        s = (android.widget.RelativeLayout.LayoutParams)mImageandText.getLayoutParams();
        s.addRule(11);
        mImageandText.setLayoutParams(s);
        mExtraItemView.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L8:
        mItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f020143));
        s = (android.widget.RelativeLayout.LayoutParams)mImageandText.getLayoutParams();
        s.addRule(11);
        mImageandText.setLayoutParams(s);
        mItemViewCount.setVisibility(8);
        mExtraItemView.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L9:
        mImageandText.setVisibility(8);
        mItemViewCount.setVisibility(8);
        mExtraItemView.setVisibility(8);
        mExtraText.setVisibility(0);
        mExtraText.setText(mActivity.getResources().getString(0x7f080310));
        continue; /* Loop/switch isn't completed */
_L3:
        mItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f0201b8));
        s = (android.widget.RelativeLayout.LayoutParams)mImageandText.getLayoutParams();
        mItemView.setVisibility(8);
        mImageandText.setVisibility(8);
        mExtraItemView.setVisibility(0);
        mExtraItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f020139));
        mExtraItemView.setLayoutParams(s);
        continue; /* Loop/switch isn't completed */
_L4:
        mItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f0201b8));
        s = (android.widget.RelativeLayout.LayoutParams)mImageandText.getLayoutParams();
        mImageandText.setVisibility(8);
        mItemView.setVisibility(8);
        mExtraItemView.setVisibility(0);
        mExtraItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f020155));
        mExtraItemView.setLayoutParams(s);
        continue; /* Loop/switch isn't completed */
_L5:
        mImageandText.setVisibility(8);
        mExtraItemView.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L6:
        mItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f0201b8));
        s = (android.widget.RelativeLayout.LayoutParams)mImageandText.getLayoutParams();
        s.addRule(11);
        mImageandText.setLayoutParams(s);
        mExtraItemView.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L7:
        mItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f0201b8));
        s = (android.widget.RelativeLayout.LayoutParams)mImageandText.getLayoutParams();
        s.addRule(11);
        mImageandText.setLayoutParams(s);
        mExtraItemView.setVisibility(8);
        if (true) goto _L1; else goto _L10
_L10:
    }

    private void updateRightIcon(int i)
    {
        switch (i)
        {
        default:
            if (mItemView.getVisibility() == 0 && UtilityMethods.getShopingBagItemsCount() > 0)
            {
                mItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f0200b6));
                updateShopingBagCount();
            }
            break;

        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
            break;
        }
    }

    public void ShowActionBarWithBackArrowForClosingAccountActivity(String s)
    {
        showActionBarForSlider(s, 6, true, false, true, 0x7f02002c);
    }

    public ImageView getAppImageView()
    {
        return mAppImageView;
    }

    public LinearLayout getBackButtonView()
    {
        return mListIconLayout;
    }

    public View getExtraItemView()
    {
        return mExtraItemView;
    }

    public TextView getExtraTextView()
    {
        return mExtraText;
    }

    public View getItemView()
    {
        return mItemView;
    }

    public TextView getItemViewCountView()
    {
        return mItemViewCount;
    }

    public TextView getTitleTextView()
    {
        return mTitleTextView;
    }

    public void hideShoppinBagIcon()
    {
        mItemView.setVisibility(8);
        hideShoppingBagCount();
    }

    public void hideShoppingBagCount()
    {
        mItemViewCount.setVisibility(8);
    }

    public void initActionBarWithCustomView()
    {
        mActionBar.setIcon(0x7f020137);
        mActionBar.setCustomView(0x7f0300b5);
        View view = mActionBar.getCustomView();
        mListIconLayout = (LinearLayout)view.findViewById(0x7f0d049c);
        mLeftView = (LinearLayout)view.findViewById(0x7f0d049d);
        mListImageView = (ImageView)view.findViewById(0x7f0d049e);
        mTitleTextView = (TextView)view.findViewById(0x7f0d049f);
        mAppImageView = (ImageView)view.findViewById(0x7f0d04a0);
        mAppTitleTextView = (TextView)view.findViewById(0x7f0d04a1);
        mImageandText = (FrameLayout)view.findViewById(0x7f0d04a2);
        mItemView = (ImageView)view.findViewById(0x7f0d04a3);
        mItemViewCount = (TextView)view.findViewById(0x7f0d04a4);
        mExtraItemView = (ImageView)view.findViewById(0x7f0d04a5);
        mExtraText = (TextView)view.findViewById(0x7f0d04a6);
        mTitleTextView.setTypeface(FontUtils.loadTypeFace(mActivity, "Gotham-Book.otf"));
        mItemView = (ImageView)view.findViewById(0x7f0d04a3);
        mExtraItemView = (ImageView)view.findViewById(0x7f0d04a5);
        mItemViewCount = (TextView)view.findViewById(0x7f0d04a4);
        mAppImageView = (ImageView)view.findViewById(0x7f0d04a0);
        mListIconLayout = (LinearLayout)view.findViewById(0x7f0d049c);
        mImageandText = (FrameLayout)view.findViewById(0x7f0d04a2);
        mExtraText = (TextView)view.findViewById(0x7f0d04a6);
        mAppImageView.setOnClickListener(new _cls1());
    }

    public void showActionBarForCreateList(String s)
    {
        ShowActionBarWithBackArrowForClosingAccountActivity(s);
        mImageandText.setVisibility(4);
    }

    public void showActionBarForCreateListConfirm(String s)
    {
        showActionBarForSlider("", 15, true, false, false, 0x7f02002c);
        mListIconLayout.setVisibility(4);
        mAppTitleTextView.setVisibility(0);
        mAppTitleTextView.setText(s);
    }

    public void showActionBarForCreateRegistry(String s)
    {
        ShowActionBarWithBackArrowForClosingAccountActivity(s);
        mListIconLayout.setVisibility(0);
        mAppTitleTextView.setVisibility(4);
        mImageandText.setVisibility(4);
    }

    public void showActionBarForCreateRegistryConfirm(String s)
    {
        showActionBarForSlider("", 15, true, false, false, 0x7f02002c);
        mListIconLayout.setVisibility(4);
        mAppTitleTextView.setVisibility(0);
        mAppTitleTextView.setText(s);
    }

    public void showActionBarForEULA(String s)
    {
        showActionBarForSlider("", 12, false, true, true, 0);
        hideShoppingBagCount();
        mImageandText.setVisibility(8);
    }

    public void showActionBarForErrorActivity()
    {
        showActionBarForSlider("", 8, false, true, true, 0);
        hideShoppingBagCount();
        mImageandText.setVisibility(8);
    }

    public void showActionBarForFAQWebViewActivity()
    {
        showActionBarForSlider("", 1, true, true, true, 0x7f02002c);
        mImageandText.setVisibility(0);
    }

    public void showActionBarForFilterPMP(String s)
    {
        showActionBarForSlider(s, 13, true, false, false, 0x7f02002c);
        getExtraTextView().setText(mActivity.getResources().getString(0x7f0801d3));
        getExtraTextView().setVisibility(0);
        hideShoppinBagIcon();
        hideShoppingBagCount();
    }

    public void showActionBarForGWPConfigurationScreen(String s)
    {
        showActionBarForSlider(s, 18, true, false, true, 0x7f02002c);
        hideShoppinBagIcon();
        hideShoppingBagCount();
    }

    public void showActionBarForHybridScreens(String s)
    {
        showActionBarForSlider(s, 1, true, true, true, 0x7f02002c);
    }

    public void showActionBarForListDetail(String s)
    {
        showActionBarForSlider(s, 1, true, false, true, 0x7f02002c);
        mListIconLayout.setVisibility(0);
        mAppTitleTextView.setVisibility(4);
    }

    public void showActionBarForListEdit(String s)
    {
        ShowActionBarWithBackArrowForClosingAccountActivity(s);
        mListIconLayout.setVisibility(0);
        mAppTitleTextView.setVisibility(4);
        mImageandText.setVisibility(4);
    }

    public void showActionBarForMyList(String s)
    {
        showActionBarForSlider(s, 16, true, false, true, 0x7f02002c);
        mListIconLayout.setVisibility(0);
        mAppTitleTextView.setVisibility(4);
    }

    public void showActionBarForRatingReviewScreens(String s)
    {
        showActionBarForSlider(s, 10, true, false, true, 0x7f02002c);
        hideShoppinBagIcon();
    }

    public void showActionBarForRegistrySettingsScreens(String s)
    {
        ShowActionBarWithBackArrowForClosingAccountActivity(s);
        mListIconLayout.setVisibility(0);
        mAppTitleTextView.setVisibility(4);
        mImageandText.setVisibility(4);
    }

    public void showActionBarForScanHelp(String s)
    {
        showActionBarForSlider(s, 14, true, false, false, 0x7f02002c);
        hideShoppinBagIcon();
        hideShoppingBagCount();
    }

    public void showActionBarForSearchUserLists(String s)
    {
        ShowActionBarWithBackArrowForClosingAccountActivity(s);
        mImageandText.setVisibility(4);
    }

    public void showActionBarForSetListBudget(String s)
    {
        ShowActionBarWithBackArrowForClosingAccountActivity(s);
        mListIconLayout.setVisibility(0);
        mAppTitleTextView.setVisibility(4);
        mImageandText.setVisibility(4);
    }

    public void showActionBarForSetListReminder(String s)
    {
        ShowActionBarWithBackArrowForClosingAccountActivity(s);
        mListIconLayout.setVisibility(0);
        mAppTitleTextView.setVisibility(4);
        mImageandText.setVisibility(4);
    }

    public void showActionBarForSocial(String s)
    {
        showActionBarForSlider(s, 19, true, false, false, 0x7f02002c);
        hideShoppinBagIcon();
        hideShoppingBagCount();
    }

    public void showActionBarForUpdateAccount(String s)
    {
        showActionBarForSlider(s, 11, true, false, true, 0x7f02002c);
    }

    public void showActionBarForUpdateStore(String s)
    {
        showActionBarForSlider(s, 20, true, false, true, 0x7f02002c);
        hideShoppinBagIcon();
        hideShoppingBagCount();
    }

    public void showActionBarForWebViewActivity()
    {
        showActionBarForSlider("", 7, false, true, true, 0x7f02002c);
        mImageandText.setVisibility(8);
    }

    public void showActionBarForWebViewString(String s)
    {
        showActionBarForSlider(s, 7, true, false, true, 0x7f02002c);
        mImageandText.setVisibility(8);
    }

    public void showActionBarForYes2YouInviteFriendScreen(String s)
    {
        showActionBarForSlider(s, 14, true, false, true, 0x7f02002c);
    }

    public void showActionBarWithDetail(String s)
    {
        showActionBarForSlider(s, 4, true, false, true, 0x7f02002c);
    }

    public void showActionBarWithEditItem()
    {
        showActionBarForSlider(mActivity.getResources().getString(0x7f0801d8), 9, true, true, true, 0x7f02002c);
        mItemView.setOnClickListener(new _cls4());
    }

    public void showActionBarWithFIS(String s)
    {
        showActionBarForSlider(s, 1, true, false, true, 0x7f02002c);
    }

    public void showActionBarWithList(String s)
    {
        showActionBarForSlider(s, 2, true, false, false, 0x7f020137);
    }

    public void showActionBarWithMap(String s)
    {
        showActionBarForSlider(s, 3, true, false, false, 0x7f020137);
    }

    public void showActionBarWithProductDetail()
    {
        showActionBarForSlider("", 5, false, true, true, 0x7f02002c);
    }

    public void showActionBarWithScreenTitleOnly(String s)
    {
        showActionBarForSlider(s, 13, true, false, false, 0x7f020137);
    }

    public void showActionBarWithShoppingBag(String s)
    {
        showActionBarForSlider(s, 1, false, true, false, 0x7f020137);
    }

    public void showCrossIcon()
    {
        mItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f020109));
    }

    public void showShoppinBagIcon()
    {
        mItemView.setVisibility(0);
    }

    public void showShoppingBagCount()
    {
        mItemViewCount.setVisibility(0);
    }

    public void updateShopingBagCount()
    {
        updateShopingBagCountAndVisibility(true);
    }

    public void updateShopingBagCountAndVisibility(boolean flag)
    {
        int i = UtilityMethods.getShopingBagItemsCount();
        if (i > 0)
        {
            mItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f0200b6));
            mItemViewCount.setText(String.valueOf(i));
            if (flag)
            {
                mItemViewCount.setVisibility(0);
            }
        } else
        {
            mItemView.setImageDrawable(mActivity.getResources().getDrawable(0x7f0201b8));
            if (flag)
            {
                mItemViewCount.setVisibility(8);
                return;
            }
        }
    }






    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls4 {}

}
