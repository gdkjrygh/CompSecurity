// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.analytics.utils.enums.ScreenNames;
import com.facebook.Settings;
import com.facebook.widget.LikeView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenController;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenListener;
import com.kohls.mcommerce.opal.framework.listener.HamburgerCloseListener;
import com.kohls.mcommerce.opal.framework.view.activity.ActivitySocialFollow;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithSlider;
import com.kohls.mcommerce.opal.framework.view.activity.Yes2YouInviteFriendActivity;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.loyalty.CMSDataRetriver;
import com.kohls.mcommerce.opal.loyalty.RewardsAddressActivity;
import com.kohls.mcommerce.opal.loyalty.SharePointsActivity;
import com.kohls.mcommerce.opal.wallet.asynctask.GetLoyaltyDataTask;
import com.kohls.mcommerce.opal.wallet.fragment.DisplayActivityList;
import com.kohls.mcommerce.opal.wallet.fragment.LinkActivity;
import com.kohls.mcommerce.opal.wallet.fragment.ProgramDetailLinkActivity;
import com.kohls.mcommerce.opal.wallet.manager.ActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.Customer;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import com.kohls.mcommerce.opal.wallet.util.CustomTypeFace;
import com.kohls.mcommerce.opal.wallet.util.DateUtils;
import com.kohls.mcommerce.opal.wallet.util.PointsIndicatorUtil;
import com.kohls.mcommerce.opal.wallet.util.RewardCache;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.fragment:
//            BaseFragment

public class Yes2YouRewardsFragment extends BaseFragment
    implements ActionListener, IRefreshTokenListener, HamburgerCloseListener
{

    private static final String EVENT_FOLLOW_FACEBOOK = "Facebook_Follow";
    private static final String EVENT_FOLLOW_GOOGLE = "GooglePlus_Follow";
    private static final String EVENT_FOLLOW_INSTAGRAM = "Instagram_Follow";
    private static final String EVENT_FOLLOW_PINTEREST = "Pinterest_Follow";
    private static final String EVENT_FOLLOW_TWITTER = "Twitter_Follow";
    private static final String EVENT_FOLLOW_YOUTUBE = "Youtube_Follow";
    public static final String INTENT_EXTRA_IS_FOLLOWED = "IsFollowed";
    private static final String LOG_TAG = "Yes2YouRewardsFragment";
    private static final String OMNITURE_FOLLOW_FACEBOOK = "Facebook";
    private static final String OMNITURE_FOLLOW_GOOGLE = "GooglePlus";
    private static final String OMNITURE_FOLLOW_INSTAGRAM = "Instagram";
    private static final String OMNITURE_FOLLOW_PINTEREST = "Pinterest";
    private static final String OMNITURE_FOLLOW_TWITTER = "Twitter";
    private static final String OMNITURE_FOLLOW_YOUTUBE = "Youtube";
    private static final String TWITTER_HANDLE = "kohls";
    private static final String URL_FACEBOOK = "https://www.facebook.com/kohls";
    private static final String URL_GOOGLE = "https://plus.google.com/u/0/+kohls/posts";
    private static final String URL_INSTAGRAM = "https://instagram.com/kohls/";
    private static final String URL_PINTEREST = "https://www.pinterest.com/kohls/pins/follow/";
    private static final String URL_TWITTER = "https://twitter.com/Kohls";
    private static final String URL_YOUTUBE = "https://www.youtube.com/user/Kohls";
    private boolean isFacebookFollowedTriggered;
    private CMSDataRetriver mCmsDataRetriver;
    private boolean mHamburgerOpened;
    private LikeView mLikeView;
    private BroadcastReceiver mLikeViewBroadcastReceiver;
    private int mLinkClicked;
    private LoyaltyProfileResponse mRewardData;

    public Yes2YouRewardsFragment()
    {
        mLinkClicked = -1;
        mLikeView = null;
        isFacebookFollowedTriggered = false;
        mLikeViewBroadcastReceiver = new _cls1();
    }

    private void addButton(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        LinearLayout linearlayout = getRowLayout(i);
        ImageButton imagebutton = new ImageButton(getActivity());
        imagebutton.setPadding(i1, 0, j1, 0);
        imagebutton.setLayoutParams(new android.widget.LinearLayout.LayoutParams(k, l));
        imagebutton.setBackgroundColor(getResources().getColor(0x7f0c00f5));
        imagebutton.setImageResource(k1);
        imagebutton.setId(k1);
        if (linearlayout.getChildCount() <= j)
        {
            linearlayout.addView(imagebutton);
            imagebutton.setOnClickListener(new _cls3());
        }
    }

    private LikeView addFacebook(int i, int j, int k, int l, int i1, int j1)
    {
        Settings.sdkInitialize(getActivity());
        LinearLayout linearlayout = getRowLayout(i);
        LikeView likeview = new LikeView(getActivity());
        likeview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(k, l));
        likeview.setLikeViewStyle(com.facebook.widget.LikeView.Style.BUTTON);
        if (likeview != null && likeview.getChildCount() > 0)
        {
            Object obj = (LinearLayout)likeview.getChildAt(0);
            if (obj != null && ((LinearLayout) (obj)).getChildCount() > 0)
            {
                obj = (Button)((LinearLayout) (obj)).getChildAt(0);
                if (obj != null)
                {
                    ((Button) (obj)).setGravity(17);
                    ((Button) (obj)).setWidth(k);
                    ((Button) (obj)).setHeight(l);
                }
            }
        }
        likeview.setObjectId("https://www.facebook.com/kohls?fref=ts");
        likeview.setPadding(i1, 0, j1, 0);
        if (linearlayout.getChildCount() > j);
        return likeview;
    }

    private void followKohlsOnTwitter()
    {
        Logger.debug("Yes2YouRewardsFragment", "followKohlsOnTwitter START");
        Intent intent = new Intent(getActivity(), com/kohls/mcommerce/opal/framework/view/activity/ActivitySocialFollow);
        intent.putExtra("LaunchMode", 1);
        startActivity(intent);
        Logger.debug("Yes2YouRewardsFragment", "followKohlsOnTwitter END");
    }

    private void getData()
    {
        (new GetLoyaltyDataTask(getActivity())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        ListenerManager.getInstance().registerListener(this, "onlyreward");
        mLinkClicked = 3;
        mCmsDataRetriver = new CMSDataRetriver(getActivity());
        mCmsDataRetriver.getCMSAdapterValues();
        ListenerManager.getInstance().registerListener(this, "activitylink");
    }

    private LinearLayout getRowLayout(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return (LinearLayout)getFragmentView().findViewById(0x7f0d00be);

        case 1: // '\001'
            return (LinearLayout)getFragmentView().findViewById(0x7f0d00bf);

        case 2: // '\002'
            return (LinearLayout)getFragmentView().findViewById(0x7f0d00c0);
        }
    }

    private void setupViewForPage()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        android.graphics.Typeface typeface;
        android.graphics.Typeface typeface1;
        TextView textview;
        TextView textview1;
        TextView textview2;
        TextView textview3;
        TextView textview4;
        Button button;
        Button button1;
        Resources resources;
        TextView textview5;
        TextView textview6;
        TextView textview7;
        TextView textview8;
        resources = getResources();
        typeface = WalletFontCache.getGothamBook(getActivity().getApplicationContext());
        typeface1 = WalletFontCache.getGothamBold(getActivity().getApplicationContext());
        obj = (RelativeLayout)getFragmentView().findViewById(0x7f0d00b1);
        textview8 = (TextView)getFragmentView().findViewById(0x7f0d00b3);
        textview6 = (TextView)getFragmentView().findViewById(0x7f0d00b4);
        textview7 = (TextView)getFragmentView().findViewById(0x7f0d00b5);
        textview5 = (TextView)getFragmentView().findViewById(0x7f0d00b6);
        textview = (TextView)getFragmentView().findViewById(0x7f0d00ba);
        textview4 = (TextView)getFragmentView().findViewById(0x7f0d00bc);
        textview1 = (TextView)getFragmentView().findViewById(0x7f0d00c9);
        textview2 = (TextView)getFragmentView().findViewById(0x7f0d00c7);
        textview3 = (TextView)getFragmentView().findViewById(0x7f0d00c8);
        button = (Button)getFragmentView().findViewById(0x7f0d00c3);
        button1 = (Button)getFragmentView().findViewById(0x7f0d00c2);
        obj1 = (Button)getFragmentView().findViewById(0x7f0d00c4);
        int i = 1;
        Customer customer;
        button.setTypeface(typeface1);
        ((Button) (obj1)).setTypeface(typeface1);
        textview2.setLinkTextColor(getResources().getColor(0x7f0c006c));
        textview2.setOnClickListener(this);
        textview2.setClickable(true);
        textview1.setLinkTextColor(getResources().getColor(0x7f0c006c));
        textview1.setOnClickListener(this);
        textview1.setClickable(true);
        textview3.setLinkTextColor(getResources().getColor(0x7f0c006c));
        textview3.setOnClickListener(this);
        textview3.setClickable(true);
        textview7.setOnClickListener(this);
        textview7.setClickable(true);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        ((Button) (obj1)).setOnClickListener(this);
        ((RelativeLayout) (obj)).setVisibility(0);
        obj1 = (new StringBuilder()).append(resources.getString(0x7f080192)).append(" ").toString();
        customer = mRewardData.getProfile().getCustomerName();
        obj = obj1;
        if (customer == null)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        obj = obj1;
        if (!TextUtils.isEmpty(DateUtils.convertStringToTitleCase(customer.getFirstName())))
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append(DateUtils.convertStringToTitleCase(customer.getFirstName())).append("!").toString();
        }
        boolean flag;
        textview8.setText(((CharSequence) (obj)));
        obj = mRewardData.getProfile().getLoyaltyId();
        flag = TextUtils.isEmpty(mRewardData.getProfile().getLoyaltyId());
        if (flag) goto _L2; else goto _L1
_L1:
        obj1 = (new StringBuilder()).append(((String) (obj)).substring(0, 4)).append("  ").append(((String) (obj)).substring(4, 8)).append("  ").append(((String) (obj)).substring(8)).toString();
        obj = obj1;
_L13:
        obj = (new StringBuilder()).append(resources.getString(0x7f080493)).append(" ").append(((String) (obj))).toString();
        int j = getResources().getString(0x7f080493).length();
        obj1 = new SpannableString(((CharSequence) (obj)));
        ((SpannableString) (obj1)).setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001e), 0, j, 0);
        ((SpannableString) (obj1)).setSpan(new CustomTypeFace(typeface), 0, j, 0);
        ((SpannableString) (obj1)).setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f002f), j, ((String) (obj)).length(), 0);
        ((SpannableString) (obj1)).setSpan(new CustomTypeFace(typeface1), j, ((String) (obj)).length(), 0);
        textview6.setText(((CharSequence) (obj1)));
_L2:
        textview7.setText(Html.fromHtml((new StringBuilder()).append("<u>").append(getResources().getString(0x7f080541)).append("</u>").toString()));
        if (!TextUtils.isEmpty(mRewardData.getProfile().getEarningPeriod())) goto _L4; else goto _L3
_L3:
        textview5.setVisibility(8);
_L14:
        obj = mRewardData.getProfile().getPointBalance();
        Exception exception;
        int j1;
        int j3;
        int k3;
        int l3;
        int j4;
        int k4;
        int k5;
        int l5;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        boolean flag11;
        boolean flag12;
        boolean flag13;
        boolean flag14;
        boolean flag15;
        if (!mRewardData.getProfile().isDonationEligibilityFlag() || TextUtils.isEmpty(((CharSequence) (obj))) || Integer.parseInt(((String) (obj))) <= 0)
        {
            i = 0;
        }
        obj = resources.getString(0x7f0804c2);
        if (i == 0) goto _L6; else goto _L5
_L5:
        obj1 = (new StringBuilder()).append("\n").append(resources.getString(0x7f0804c4)).append(" ").append(mRewardData.getProfile().getPointBalance()).append(" ").append(resources.getString(0x7f08043a)).append(" ").append(resources.getString(0x7f0804c3)).toString();
        obj = (new StringBuilder()).append(((String) (obj))).append(((String) (obj1))).toString();
        i = ((String) (obj)).indexOf(getResources().getString(0x7f0804c4));
        int k = ((String) (obj)).indexOf(mRewardData.getProfile().getPointBalance());
        int k1 = ((String) (obj)).indexOf(resources.getString(0x7f0804c3));
        obj1 = new SpannableString(((CharSequence) (obj)));
        ((SpannableString) (obj1)).setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001d), 0, i, 0);
        ((SpannableString) (obj1)).setSpan(new CustomTypeFace(typeface1), 0, i, 0);
        ((SpannableString) (obj1)).setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001e), i, k, 0);
        ((SpannableString) (obj1)).setSpan(new CustomTypeFace(typeface), i, k, 0);
        ((SpannableString) (obj1)).setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001d), k, k1, 0);
        ((SpannableString) (obj1)).setSpan(new CustomTypeFace(typeface1), k, k1, 0);
        ((SpannableString) (obj1)).setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001e), k1, ((String) (obj)).length(), 0);
        ((SpannableString) (obj1)).setSpan(new CustomTypeFace(typeface), k1, ((String) (obj)).length(), 0);
        button1.setText(((CharSequence) (obj1)));
        button1.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(0x7f0201d2), null);
_L15:
        if ((mRewardData.getProfile().getTransactions() == null || mRewardData.getProfile().getTransactions().size() <= 0) && (mRewardData.getProfile().getRewards() == null || mRewardData.getProfile().getRewards().size() <= 0)) goto _L8; else goto _L7
_L7:
        button.setClickable(true);
        button.setEnabled(true);
        button1.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(0x7f0201d2), null);
_L16:
        if (!TextUtils.isEmpty(mRewardData.getProfile().getLifeTimePoints()))
        {
            textview4.setText(mRewardData.getProfile().getLifeTimePoints());
        }
        if (TextUtils.isEmpty(mRewardData.getProfile().getPointBalance()))
        {
            mRewardData.getProfile().setPointBalance("0");
            mRewardData.getProfile().setPointThreshold("0");
        }
        if (!TextUtils.isEmpty(mRewardData.getProfile().getPointThreshold()) && !TextUtils.isEmpty(mRewardData.getProfile().getPointBalance()))
        {
            i = PointsIndicatorUtil.getThresholdPoints(Integer.parseInt(mRewardData.getProfile().getPointThreshold()), Integer.parseInt(mRewardData.getProfile().getPointBalance()));
            int l = Integer.parseInt(mRewardData.getProfile().getPointBalance());
            obj = (TextView)getFragmentView().findViewById(0x7f0d00b8);
            obj1 = (new StringBuilder()).append(getResources().getString(0x7f0803c4)).append(" ").append(i - l).append(" ").append(getResources().getString(0x7f0803c9)).append(" ").append(getResources().getString(0x7f0803c5)).toString();
            i = getResources().getString(0x7f0803c4).length();
            l = ((String) (obj1)).indexOf(getResources().getString(0x7f0803c5));
            SpannableString spannablestring2 = new SpannableString(((CharSequence) (obj1)));
            spannablestring2.setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001d), 0, i, 0);
            spannablestring2.setSpan(new CustomTypeFace(typeface), 0, i, 0);
            spannablestring2.setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001d), i, l, 0);
            spannablestring2.setSpan(new CustomTypeFace(typeface1), i, l, 0);
            spannablestring2.setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001d), l, ((String) (obj1)).length(), 0);
            spannablestring2.setSpan(new CustomTypeFace(typeface), l, ((String) (obj1)).length(), 0);
            ((TextView) (obj)).setText(spannablestring2);
            textview.setText(mRewardData.getProfile().getPointBalance());
            (new PointsIndicatorUtil()).setPointsIndicatorBar(getActivity(), Integer.parseInt(mRewardData.getProfile().getPointBalance()));
        }
        textview3.setText(Html.fromHtml((new StringBuilder()).append("<u>").append(getResources().getString(0x7f0801ff)).append("</u>").toString()));
        textview2.setText(Html.fromHtml((new StringBuilder()).append("<u>").append(getResources().getString(0x7f080450)).append("</u>").toString()));
        textview1.setText(Html.fromHtml((new StringBuilder()).append("<u>").append(getResources().getString(0x7f0804fd)).append("</u>").toString()));
        ((ProgressBar)getFragmentView().findViewById(0x7f0d0118)).setVisibility(4);
        obj = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig();
        flag14 = false;
        flag = false;
        flag11 = false;
        flag1 = false;
        flag7 = false;
        flag2 = false;
        flag12 = false;
        flag3 = false;
        flag15 = false;
        flag13 = false;
        flag4 = false;
        flag8 = false;
        flag5 = false;
        flag9 = false;
        flag6 = false;
        flag10 = flag15;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_2097;
        }
        if (((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagReferFriend() != null)
        {
            flag = Boolean.parseBoolean(((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagReferFriend());
        }
        if (((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagSocial() != null)
        {
            flag1 = Boolean.parseBoolean(((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagSocial());
        }
        if (((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagFacebook() != null)
        {
            flag2 = Boolean.parseBoolean(((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagFacebook());
        }
        if (((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagTwitter() != null)
        {
            flag3 = Boolean.parseBoolean(((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagTwitter());
        }
        if (((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagYouTube() != null)
        {
            flag4 = Boolean.parseBoolean(((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagYouTube());
        }
        if (((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagGooglePlus() != null)
        {
            flag5 = Boolean.parseBoolean(((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagGooglePlus());
        }
        if (((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagInstagram() != null)
        {
            flag6 = Boolean.parseBoolean(((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagInstagram());
        }
        flag7 = flag2;
        flag8 = flag5;
        flag9 = flag6;
        flag10 = flag15;
        flag11 = flag1;
        flag12 = flag3;
        flag13 = flag4;
        flag14 = flag;
        if (((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagPinterest() == null)
        {
            break MISSING_BLOCK_LABEL_2097;
        }
        flag10 = Boolean.parseBoolean(((com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config) (obj)).getKillSwitchFlagPinterest());
        flag14 = flag;
        flag13 = flag4;
        flag12 = flag3;
        flag11 = flag1;
        flag9 = flag6;
        flag8 = flag5;
        flag7 = flag2;
        Logger.debug("Yes2YouRewardsFragment", (new StringBuilder()).append("killSwitchInviteFriend = ").append(flag14).toString());
        Logger.debug("Yes2YouRewardsFragment", (new StringBuilder()).append("killSwitchFlagSocial = ").append(flag11).toString());
        Logger.debug("Yes2YouRewardsFragment", (new StringBuilder()).append("killSwitchFlagFacebook = ").append(flag7).toString());
        Logger.debug("Yes2YouRewardsFragment", (new StringBuilder()).append("killSwitchFlagTwitter = ").append(flag12).toString());
        Logger.debug("Yes2YouRewardsFragment", (new StringBuilder()).append("killSwitchFlagPinterest = ").append(flag10).toString());
        Logger.debug("Yes2YouRewardsFragment", (new StringBuilder()).append("killSwitchFlagYouTube = ").append(flag13).toString());
        Logger.debug("Yes2YouRewardsFragment", (new StringBuilder()).append("killSwitchFlagGooglePlus = ").append(flag8).toString());
        Logger.debug("Yes2YouRewardsFragment", (new StringBuilder()).append("killSwitchFlagInstagram = ").append(flag9).toString());
        obj = (Button)getFragmentView().findViewById(0x7f0d00c1);
        if (!flag14) goto _L10; else goto _L9
_L9:
        Logger.debug("Yes2YouRewardsFragment", "Invite friend feature is KILLED");
        ((Button) (obj)).setVisibility(8);
_L17:
        if (!flag11) goto _L12; else goto _L11
_L11:
        Logger.debug("Yes2YouRewardsFragment", "Social feature is KILLED");
        getFragmentView().findViewById(0x7f0d00bd).setVisibility(8);
_L21:
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
          goto _L13
_L4:
        textview5.setVisibility(0);
        exception = mRewardData.getProfile().getEarningPeriod().toUpperCase();
        obj = exception;
        if (exception.length() >= 3)
        {
            obj = exception.substring(0, 3);
        }
        obj = (new StringBuilder()).append(resources.getString(0x7f0801d6)).append(" ").append(((String) (obj))).toString();
        int i1 = resources.getString(0x7f0801d6).length() + " ".length();
        exception = new SpannableString(((CharSequence) (obj)));
        exception.setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001e), 0, i1, 0);
        exception.setSpan(new CustomTypeFace(typeface1), i1, ((String) (obj)).length(), 0);
        exception.setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001e), i1, ((String) (obj)).length(), 0);
        exception.setSpan(new CustomTypeFace(typeface), 0, i1, 0);
        textview5.setText(exception);
          goto _L14
        obj;
        throw obj;
_L6:
        SpannableString spannablestring = new SpannableString(((CharSequence) (obj)));
        spannablestring.setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001d), 0, ((String) (obj)).length(), 0);
        spannablestring.setSpan(new CustomTypeFace(typeface1), 0, ((String) (obj)).length(), 0);
        button1.setText(spannablestring);
        button1.setEnabled(false);
        button1.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          goto _L15
_L8:
        button.setClickable(false);
        button.setEnabled(false);
        button.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          goto _L16
_L10:
        Logger.debug("Yes2YouRewardsFragment", "Inite friend feature is ACTIVE");
        ((Button) (obj)).setVisibility(0);
        ((Button) (obj)).setOnClickListener(this);
        String s = getString(0x7f08025a);
        String s1 = getString(0x7f080259);
        String s2 = (new StringBuilder()).append(s).append("\n").append(s1).toString();
        SpannableString spannablestring1 = new SpannableString(s2);
        spannablestring1.setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001d), 0, s.length(), 0);
        spannablestring1.setSpan(new CustomTypeFace(typeface1), 0, s.length(), 0);
        spannablestring1.setSpan(new TextAppearanceSpan(getActivity(), 0x7f0f001e), s2.indexOf(s1), s2.length(), 0);
        spannablestring1.setSpan(new CustomTypeFace(typeface), s2.indexOf(s1), s2.length(), 0);
        ((Button) (obj)).setText(spannablestring1);
          goto _L17
_L12:
        Logger.debug("Yes2YouRewardsFragment", "Social feature is ACTIVE");
        getFragmentView().findViewById(0x7f0d00bd).setVisibility(0);
        obj = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
        k5 = ((DisplayMetrics) (obj)).widthPixels / 2;
        l5 = (int)(30F * ((DisplayMetrics) (obj)).density);
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int i4;
        int l4;
        int i5;
        int j5;
        if (flag7)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (flag8)
        {
            j1 = 0;
        } else
        {
            j1 = 1;
        }
        if (flag9)
        {
            l1 = 0;
        } else
        {
            l1 = 1;
        }
        if (flag10)
        {
            i2 = 0;
        } else
        {
            i2 = 1;
        }
        if (flag12)
        {
            j2 = 0;
        } else
        {
            j2 = 1;
        }
        if (flag13)
        {
            k2 = 0;
        } else
        {
            k2 = 1;
        }
        l1 = i + j1 + l1 + i2 + j2 + k2;
        Logger.debug("Yes2YouRewardsFragment", (new StringBuilder()).append("numberOfEnabledSocialChannels = ").append(l1).toString());
        if (l1 <= 0) goto _L19; else goto _L18
_L18:
        j1 = l1 / 2;
        i = j1;
        if (l1 % 2 > 0)
        {
            i = j1 + 1;
        }
        Logger.debug("Yes2YouRewardsFragment", (new StringBuilder()).append("numberOfRowsRequired = ").append(i).toString());
        i3 = 0;
        i2 = 0;
        j2 = 0;
        l1 = 0;
        k2 = 0;
        l2 = 0;
        j1 = 0;
_L38:
        if (j1 >= i) goto _L21; else goto _L20
_L20:
        getRowLayout(j1).setVisibility(0);
        j3 = 0;
_L37:
        if (j3 >= 2) goto _L23; else goto _L22
_L22:
        k3 = (int)(10F * ((DisplayMetrics) (obj)).density);
        l3 = (int)(10F * ((DisplayMetrics) (obj)).density);
        if (j3 == 0)
        {
            j4 = k3 * 2;
            k4 = l3;
        } else
        {
            j4 = k3;
            k4 = l3;
            if (j3 == 1)
            {
                k4 = l3 * 2;
                j4 = k3;
            }
        }
        if (flag7 || i3 != 0) goto _L25; else goto _L24
_L24:
        mLikeView = addFacebook(j1, j3, k5, l5, j4, k4);
        addButton(j1, j3, k5, l5, j4, k4, 0x7f02003b);
        k3 = 1;
        Logger.debug("Yes2YouRewardsFragment", "Facebook button is shown");
        l3 = l2;
        i4 = k2;
        l4 = j2;
        i5 = i2;
        j5 = l1;
          goto _L26
_L25:
        if (flag12 || i2 != 0) goto _L28; else goto _L27
_L27:
        addButton(j1, j3, k5, l5, j4, k4, 0x7f020041);
        i5 = 1;
        Logger.debug("Yes2YouRewardsFragment", "Twitter button is shown");
        k3 = i3;
        l3 = l2;
        i4 = k2;
        l4 = j2;
        j5 = l1;
          goto _L26
_L28:
        if (flag10 || j2 != 0) goto _L30; else goto _L29
_L29:
        addButton(j1, j3, k5, l5, j4, k4, 0x7f02003e);
        l4 = 1;
        Logger.debug("Yes2YouRewardsFragment", "Pinterest button is shown");
        k3 = i3;
        l3 = l2;
        i4 = k2;
        i5 = i2;
        j5 = l1;
          goto _L26
_L30:
        if (flag13 || l1 != 0) goto _L32; else goto _L31
_L31:
        addButton(j1, j3, k5, l5, j4, k4, 0x7f020042);
        j5 = 1;
        Logger.debug("Yes2YouRewardsFragment", "Youtube button is shown");
        k3 = i3;
        l3 = l2;
        i4 = k2;
        l4 = j2;
        i5 = i2;
          goto _L26
_L32:
        if (flag9 || k2 != 0) goto _L34; else goto _L33
_L33:
        addButton(j1, j3, k5, l5, j4, k4, 0x7f02003d);
        i4 = 1;
        Logger.debug("Yes2YouRewardsFragment", "Instagram button is shown");
        k3 = i3;
        l3 = l2;
        l4 = j2;
        i5 = i2;
        j5 = l1;
          goto _L26
_L34:
        k3 = i3;
        l3 = l2;
        i4 = k2;
        l4 = j2;
        i5 = i2;
        j5 = l1;
        if (flag8) goto _L26; else goto _L35
_L35:
        k3 = i3;
        l3 = l2;
        i4 = k2;
        l4 = j2;
        i5 = i2;
        j5 = l1;
        if (l2 != 0) goto _L26; else goto _L36
_L36:
        addButton(j1, j3, k5, l5, j4, k4, 0x7f02003c);
        l3 = 1;
        Logger.debug("Yes2YouRewardsFragment", "GooglePlus button is shown");
        k3 = i3;
        i4 = k2;
        l4 = j2;
        i5 = i2;
        j5 = l1;
          goto _L26
_L19:
        Logger.debug("Yes2YouRewardsFragment", "None of social channels are active");
        getFragmentView().findViewById(0x7f0d00bd).setVisibility(8);
          goto _L21
_L26:
        j3++;
        i3 = k3;
        l2 = l3;
        k2 = i4;
        j2 = l4;
        i2 = i5;
        l1 = j5;
          goto _L37
_L23:
        j1++;
          goto _L38
    }

    protected void initializeAttributes()
    {
        if (getActivity() instanceof BaseActivityWithSlider)
        {
            ((BaseActivityWithSlider)getActivity()).setHamburgerCloseListener(this);
        }
    }

    protected void initializeController()
    {
    }

    protected void initializeViews(Bundle bundle)
    {
    }

    protected int intializaLayoutId()
    {
        return 0x7f030016;
    }

    protected void loadContent()
    {
        ControllerFactory.getRefreshTokenController().checkAndRefreshToken(this);
        UtilityMethods.setApptentiveScreen(getActivity(), "loyalty");
    }

    public void onActionPerformed()
    {
        if (mLinkClicked == 3 || mLinkClicked == -1)
        {
            if (getActivity() != null)
            {
                mRewardData = RewardCache.get(KohlsPhoneApplication.getInstance());
                if (mRewardData != null && mRewardData.getProfile() != null && mRewardData.isSuccess())
                {
                    setupViewForPage();
                }
            }
            ((ProgressBar)getFragmentView().findViewById(0x7f0d0118)).setVisibility(4);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        Logger.debug("Yes2YouRewardsFragment", "onActivityResult() START");
        if (i != 64211) goto _L2; else goto _L1
_L1:
        ControllerFactory.getRefreshTokenController().checkAndRefreshToken(this);
_L4:
        Logger.debug("Yes2YouRewardsFragment", "onActivityResult() END");
        return;
_L2:
        if (i == 64207)
        {
            LikeView likeview = mLikeView;
            LikeView.handleOnActivityResult(getActivity(), i, j, intent);
        } else
        if (i == 64208)
        {
            Logger.debug("Yes2YouRewardsFragment", "Pinterest");
            boolean flag = false;
            if (intent != null)
            {
                flag = intent.getBooleanExtra("IsFollowed", false);
            } else
            {
                Logger.debug("Yes2YouRewardsFragment", "Intent is null, DEBUG it");
            }
            if (!flag);
        } else
        if (j == -1)
        {
            (new GetLoyaltyDataTask(getActivity())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 8: default 80
    //                   2131558581: 460
    //                   2131558593: 620
    //                   2131558594: 530
    //                   2131558595: 483
    //                   2131558596: 508
    //                   2131558599: 313
    //                   2131558600: 81
    //                   2131558601: 197;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return;
_L8:
        mLinkClicked = 0;
        ((TextView)getFragmentView().findViewById(0x7f0d00c8)).setClickable(false);
        view = mCmsDataRetriver.getPropertiesFromLoyaltyHelpVO();
        if (view != null)
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.putExtra("linkurl", view.getFaq());
            intent.putExtra("pagetitle", getResources().getString(0x7f080200));
            intent.setClass(getActivity(), com/kohls/mcommerce/opal/wallet/fragment/LinkActivity);
            startActivity(intent);
            AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_FAQ);
        }
        ((TextView)getFragmentView().findViewById(0x7f0d00c8)).setClickable(true);
        return;
_L9:
        mLinkClicked = 1;
        ((TextView)getFragmentView().findViewById(0x7f0d00c9)).setClickable(true);
        view = mCmsDataRetriver.getPropertiesFromLoyaltyHelpVO();
        if (view != null)
        {
            Intent intent1 = new Intent("android.intent.action.VIEW");
            intent1.putExtra("linkurl", view.getTerms_and_conditions());
            intent1.putExtra("pagetitle", getResources().getString(0x7f08051a));
            intent1.setClass(getActivity(), com/kohls/mcommerce/opal/wallet/fragment/LinkActivity);
            startActivity(intent1);
            AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_TERMS_CONDITIONS);
        }
        ((TextView)getFragmentView().findViewById(0x7f0d00c9)).setClickable(false);
        return;
_L7:
        mLinkClicked = 2;
        ((TextView)getFragmentView().findViewById(0x7f0d00c7)).setClickable(false);
        view = mCmsDataRetriver.getPropertiesFromLoyaltyHelpVO();
        if (view != null)
        {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            if (!TextUtils.isEmpty(view.getProgram_details_image()))
            {
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setProgramDetailsHeader(view.getProgram_details_image());
            }
            if (!TextUtils.isEmpty(view.getProgram_details_content()))
            {
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setProgramDetailsContent(view.getProgram_details_content());
            }
            intent2.putExtra("pagetitle", getString(0x7f080452));
            intent2.setClass(getActivity(), com/kohls/mcommerce/opal/wallet/fragment/ProgramDetailLinkActivity);
            startActivity(intent2);
        }
        AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_PROGRAM_DETAILS);
        ((TextView)getFragmentView().findViewById(0x7f0d00c7)).setClickable(true);
        return;
_L2:
        (new Handler()).postDelayed(new _cls2(), 100L);
        return;
_L5:
        startActivity(new Intent(getActivity().getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/DisplayActivityList));
        AnalyticsHelper.sendAnalyticsForRewardsActivity();
        return;
_L6:
        startActivity(new Intent(getActivity().getApplicationContext(), com/kohls/mcommerce/opal/loyalty/RewardsAddressActivity));
        return;
_L4:
        Object obj = null;
        view = obj;
        if (mRewardData != null)
        {
            view = obj;
            if (mRewardData.getProfile() != null)
            {
                view = mRewardData.getProfile().getPointBalance();
            }
        }
        if (!TextUtils.isEmpty(view) && Integer.parseInt(view) > 0)
        {
            view = new Intent(getActivity().getApplicationContext(), com/kohls/mcommerce/opal/loyalty/SharePointsActivity);
            view.putExtra("point_balance", mRewardData.getProfile().getPointBalance());
            startActivity(view);
            return;
        }
          goto _L1
_L3:
        view = new Intent(getActivity().getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/Yes2YouInviteFriendActivity);
        view.putExtra("point_balance", mRewardData.getProfile().getPointBalance());
        startActivity(view);
        return;
    }

    public void onHamburgerMenuClose()
    {
        if (mHamburgerOpened)
        {
            AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_LANDING_PAGE);
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
        getActivity().unregisterReceiver(mLikeViewBroadcastReceiver);
    }

    public void onRefreshTokenFailure()
    {
        if (getActivity() != null)
        {
            UtilityMethods.openAccountActivity(getActivity(), true, false);
        }
    }

    public void onRefreshTokenSuccess()
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && !TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletHash()))
        {
            if (getActivity() != null)
            {
                mRewardData = RewardCache.get(KohlsPhoneApplication.getInstance());
                if (mRewardData != null && mRewardData.getProfile() != null && mRewardData.isSuccess())
                {
                    setupViewForPage();
                    ((ProgressBar)getFragmentView().findViewById(0x7f0d0118)).setVisibility(4);
                }
            }
            getData();
        } else
        if (getActivity() != null)
        {
            UtilityMethods.openAccountActivity(getActivity(), true, false);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        IntentFilter intentfilter = new IntentFilter("com.kohls.fb.isLiked");
        getActivity().registerReceiver(mLikeViewBroadcastReceiver, intentfilter);
    }

    public void onStart()
    {
        super.onStart();
        AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_LANDING_PAGE);
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }



/*
    static boolean access$002(Yes2YouRewardsFragment yes2yourewardsfragment, boolean flag)
    {
        yes2yourewardsfragment.isFacebookFollowedTriggered = flag;
        return flag;
    }

*/

    // Unreferenced inner class com/kohls/mcommerce/opal/framework/view/fragment/Yes2YouRewardsFragment$BackgroundTask
    /* block-local class not found */
    class BackgroundTask {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/view/fragment/Yes2YouRewardsFragment$BackgroundTaskInput
    /* block-local class not found */
    class BackgroundTaskInput {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}

}
