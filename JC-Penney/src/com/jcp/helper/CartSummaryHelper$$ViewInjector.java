// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.jcp.helper:
//            CartSummaryHelper, a, f, g, 
//            h, i, j, k, 
//            l, m, b, c, 
//            d, e

public class 
    implements butterknife.or
{

    public void inject(butterknife.or or, CartSummaryHelper cartsummaryhelper, Object obj)
    {
        cartsummaryhelper.mSubtotalHeader = (TextView)or.ader((View)or.iew(obj, 0x7f0e016c, "field 'mSubtotalHeader'"), 0x7f0e016c, "field 'mSubtotalHeader'");
        cartsummaryhelper.mSubtotalTextView = (TextView)or.xtView((View)or.iew(obj, 0x7f0e016d, "field 'mSubtotalTextView'"), 0x7f0e016d, "field 'mSubtotalTextView'");
        cartsummaryhelper.mOrderTotalTextView = (TextView)or.TextView((View)or.iew(obj, 0x7f0e0180, "field 'mOrderTotalTextView'"), 0x7f0e0180, "field 'mOrderTotalTextView'");
        cartsummaryhelper.mYouSavedHeader = (TextView)or.ader((View)or.iew(obj, 0x7f0e0181, "field 'mYouSavedHeader'"), 0x7f0e0181, "field 'mYouSavedHeader'");
        cartsummaryhelper.mYouSavedTextView = (TextView)or.xtView((View)or.iew(obj, 0x7f0e0182, "field 'mYouSavedTextView'"), 0x7f0e0182, "field 'mYouSavedTextView'");
        cartsummaryhelper.mEstimateShipToAddressHeaderView = (TextView)or.ipToAddressHeaderView((View)or.iew(obj, 0x7f0e0172, "field 'mEstimateShipToAddressHeaderView'"), 0x7f0e0172, "field 'mEstimateShipToAddressHeaderView'");
        View view = (View)or.iew(obj, 0x7f0e0173, "field 'mEstimateShipToAddressQuestionMark' and method 'estimateShipAddressHeader'");
        cartsummaryhelper.mEstimateShipToAddressQuestionMark = (ImageView)or.ipToAddressQuestionMark(view, 0x7f0e0173, "field 'mEstimateShipToAddressQuestionMark'");
        view.setOnClickListener(new a(this, cartsummaryhelper));
        cartsummaryhelper.tvEstimateShipToAddress = (TextView)or.hipToAddress((View)or.iew(obj, 0x7f0e0174, "field 'tvEstimateShipToAddress'"), 0x7f0e0174, "field 'tvEstimateShipToAddress'");
        cartsummaryhelper.mEstimateShipToStoreHeaderView = (TextView)or.ipToStoreHeaderView((View)or.iew(obj, 0x7f0e0175, "field 'mEstimateShipToStoreHeaderView'"), 0x7f0e0175, "field 'mEstimateShipToStoreHeaderView'");
        view = (View)or.iew(obj, 0x7f0e0176, "field 'mEstimateShipToStoreQuestionMark' and method 'estimateShipStoreHeader'");
        cartsummaryhelper.mEstimateShipToStoreQuestionMark = (ImageView)or.ipToStoreQuestionMark(view, 0x7f0e0176, "field 'mEstimateShipToStoreQuestionMark'");
        view.setOnClickListener(new f(this, cartsummaryhelper));
        cartsummaryhelper.tvEstimateShipToStore = (TextView)or.hipToStore((View)or.iew(obj, 0x7f0e0177, "field 'tvEstimateShipToStore'"), 0x7f0e0177, "field 'tvEstimateShipToStore'");
        cartsummaryhelper.mEstimateSameDayPickUpLayout = (RelativeLayout)or.meDayPickUpLayout((View)or.iew(obj, 0x7f0e0178, "field 'mEstimateSameDayPickUpLayout'"), 0x7f0e0178, "field 'mEstimateSameDayPickUpLayout'");
        cartsummaryhelper.tvSameDayPickUpPrice = (TextView)or.ckUpPrice((View)or.iew(obj, 0x7f0e017a, "field 'tvSameDayPickUpPrice'"), 0x7f0e017a, "field 'tvSameDayPickUpPrice'");
        cartsummaryhelper.mSeperator = (View)or.iew(obj, 0x7f0e010d, "field 'mSeperator'");
        cartsummaryhelper.mCouponLayout = (RelativeLayout)or.ut((View)or.iew(obj, 0x7f0e0108, "field 'mCouponLayout'"), 0x7f0e0108, "field 'mCouponLayout'");
        cartsummaryhelper.mRewardsLayout = (RelativeLayout)or.out((View)or.iew(obj, 0x7f0e0114, "field 'mRewardsLayout'"), 0x7f0e0114, "field 'mRewardsLayout'");
        cartsummaryhelper.mInvalidCouponsText = (TextView)or.ponsText((View)or.iew(obj, 0x7f0e0112, "field 'mInvalidCouponsText'"), 0x7f0e0112, "field 'mInvalidCouponsText'");
        cartsummaryhelper.mCouponsListView = (ListView)or.tView((View)or.iew(obj, 0x7f0e010b, "field 'mCouponsListView'"), 0x7f0e010b, "field 'mCouponsListView'");
        cartsummaryhelper.mRewardsListView = (ListView)or.tView((View)or.iew(obj, 0x7f0e0116, "field 'mRewardsListView'"), 0x7f0e0116, "field 'mRewardsListView'");
        cartsummaryhelper.mCouponsCountDescTxt = (TextView)or.ntDescTxt((View)or.iew(obj, 0x7f0e010a, "field 'mCouponsCountDescTxt'"), 0x7f0e010a, "field 'mCouponsCountDescTxt'");
        cartsummaryhelper.mInvalidRewardText = (TextView)or.ardText((View)or.iew(obj, 0x7f0e011c, "field 'mInvalidRewardText'"), 0x7f0e011c, "field 'mInvalidRewardText'");
        view = (View)or.iew(obj, 0x7f0e0119, "field 'mRewardsnextBtn' and method 'applyReward'");
        cartsummaryhelper.mRewardsnextBtn = (TextView)or.tBtn(view, 0x7f0e0119, "field 'mRewardsnextBtn'");
        view.setOnClickListener(new g(this, cartsummaryhelper));
        view = (View)or.iew(obj, 0x7f0e011b, "field 'mRewardapplyBtn' and method 'applySerialReward'");
        cartsummaryhelper.mRewardapplyBtn = (TextView)or.yBtn(view, 0x7f0e011b, "field 'mRewardapplyBtn'");
        view.setOnClickListener(new h(this, cartsummaryhelper));
        cartsummaryhelper.mCouponDiscount = (TextView)or.ount((View)or.iew(obj, 0x7f0e016f, "field 'mCouponDiscount'"), 0x7f0e016f, "field 'mCouponDiscount'");
        cartsummaryhelper.mTotalCouponDiscount = (TextView)or.nDiscount((View)or.iew(obj, 0x7f0e016e, "field 'mTotalCouponDiscount'"), 0x7f0e016e, "field 'mTotalCouponDiscount'");
        cartsummaryhelper.mTotalRewardDiscount = (TextView)or.dDiscount((View)or.iew(obj, 0x7f0e0170, "field 'mTotalRewardDiscount'"), 0x7f0e0170, "field 'mTotalRewardDiscount'");
        cartsummaryhelper.mRewardTotalDiscount = (TextView)or.lDiscount((View)or.iew(obj, 0x7f0e0171, "field 'mRewardTotalDiscount'"), 0x7f0e0171, "field 'mRewardTotalDiscount'");
        cartsummaryhelper.mCouponmax = (TextView)or.iew((View)or.iew(obj, 0x7f0e010c, "field 'mCouponmax'"), 0x7f0e010c, "field 'mCouponmax'");
        cartsummaryhelper.mRewardsmax = (TextView)or.((View)or.iew(obj, 0x7f0e0117, "field 'mRewardsmax'"), 0x7f0e0117, "field 'mRewardsmax'");
        view = (View)or.iew(obj, 0x7f0e010f, "field 'mCouponCodeButton' and method 'applyCoupon'");
        cartsummaryhelper.mCouponCodeButton = (TextView)or.Button(view, 0x7f0e010f, "field 'mCouponCodeButton'");
        view.setOnClickListener(new i(this, cartsummaryhelper));
        view = (View)or.iew(obj, 0x7f0e0111, "field 'mCouponSerialCodeButton' and method 'applyCoupon'");
        cartsummaryhelper.mCouponSerialCodeButton = (TextView)or.alCodeButton(view, 0x7f0e0111, "field 'mCouponSerialCodeButton'");
        view.setOnClickListener(new j(this, cartsummaryhelper));
        view = (View)or.iew(obj, 0x7f0e0113, "field 'mFindCouponsText' and method 'findCoupons'");
        cartsummaryhelper.mFindCouponsText = (TextView)or.sText(view, 0x7f0e0113, "field 'mFindCouponsText'");
        view.setOnClickListener(new k(this, cartsummaryhelper));
        cartsummaryhelper.mCouponCodeEditText = (EditText)or.EditText((View)or.iew(obj, 0x7f0e010e, "field 'mCouponCodeEditText'"), 0x7f0e010e, "field 'mCouponCodeEditText'");
        cartsummaryhelper.mCouponSerialCodeEditText = (EditText)or.alCodeEditText((View)or.iew(obj, 0x7f0e0110, "field 'mCouponSerialCodeEditText'"), 0x7f0e0110, "field 'mCouponSerialCodeEditText'");
        cartsummaryhelper.mRewardEditText = (EditText)or.Text((View)or.iew(obj, 0x7f0e0118, "field 'mRewardEditText'"), 0x7f0e0118, "field 'mRewardEditText'");
        cartsummaryhelper.mRewardSerialCodeEditText = (EditText)or.alCodeEditText((View)or.iew(obj, 0x7f0e011a, "field 'mRewardSerialCodeEditText'"), 0x7f0e011a, "field 'mRewardSerialCodeEditText'");
        cartsummaryhelper.availableRewardsLayout = (LinearLayout)or.wardsLayout((View)or.iew(obj, 0x7f0e04d2, "field 'availableRewardsLayout'"), 0x7f0e04d2, "field 'availableRewardsLayout'");
        cartsummaryhelper.availableRewardsCount = (TextView)or.wardsCount((View)or.iew(obj, 0x7f0e04ce, "field 'availableRewardsCount'"), 0x7f0e04ce, "field 'availableRewardsCount'");
        cartsummaryhelper.mEstimateTaxHeader = (TextView)or.xHeader((View)or.iew(obj, 0x7f0e017b, "field 'mEstimateTaxHeader'"), 0x7f0e017b, "field 'mEstimateTaxHeader'");
        cartsummaryhelper.mEstimateTaxTextView = (TextView)or.xTextView((View)or.iew(obj, 0x7f0e017c, "field 'mEstimateTaxTextView'"), 0x7f0e017c, "field 'mEstimateTaxTextView'");
        ((View)or.iew(obj, 0x7f0e04d0, "method 'onAvailableRewardsClicked'")).setOnClickListener(new l(this, cartsummaryhelper, or));
        ((View)or.iew(obj, 0x7f0e018c, "method 'onPrivacyClicked'")).setOnClickListener(new m(this, cartsummaryhelper));
        ((View)or.iew(obj, 0x7f0e018e, "method 'onCAPrivacyClicked'")).setOnClickListener(new b(this, cartsummaryhelper));
        ((View)or.iew(obj, 0x7f0e0184, "method 'checkOut'")).setOnClickListener(new c(this, cartsummaryhelper));
        ((View)or.iew(obj, 0x7f0e018b, "method 'paypalCheckOut'")).setOnClickListener(new d(this, cartsummaryhelper));
        ((View)or.iew(obj, 0x7f0e03eb, "method 'rewardsConnectOrEnroll'")).setOnClickListener(new e(this, cartsummaryhelper));
    }

    public volatile void inject(butterknife.or or, Object obj, Object obj1)
    {
        inject(or, (CartSummaryHelper)obj, obj1);
    }

    public void reset(CartSummaryHelper cartsummaryhelper)
    {
        cartsummaryhelper.mSubtotalHeader = null;
        cartsummaryhelper.mSubtotalTextView = null;
        cartsummaryhelper.mOrderTotalTextView = null;
        cartsummaryhelper.mYouSavedHeader = null;
        cartsummaryhelper.mYouSavedTextView = null;
        cartsummaryhelper.mEstimateShipToAddressHeaderView = null;
        cartsummaryhelper.mEstimateShipToAddressQuestionMark = null;
        cartsummaryhelper.tvEstimateShipToAddress = null;
        cartsummaryhelper.mEstimateShipToStoreHeaderView = null;
        cartsummaryhelper.mEstimateShipToStoreQuestionMark = null;
        cartsummaryhelper.tvEstimateShipToStore = null;
        cartsummaryhelper.mEstimateSameDayPickUpLayout = null;
        cartsummaryhelper.tvSameDayPickUpPrice = null;
        cartsummaryhelper.mSeperator = null;
        cartsummaryhelper.mCouponLayout = null;
        cartsummaryhelper.mRewardsLayout = null;
        cartsummaryhelper.mInvalidCouponsText = null;
        cartsummaryhelper.mCouponsListView = null;
        cartsummaryhelper.mRewardsListView = null;
        cartsummaryhelper.mCouponsCountDescTxt = null;
        cartsummaryhelper.mInvalidRewardText = null;
        cartsummaryhelper.mRewardsnextBtn = null;
        cartsummaryhelper.mRewardapplyBtn = null;
        cartsummaryhelper.mCouponDiscount = null;
        cartsummaryhelper.mTotalCouponDiscount = null;
        cartsummaryhelper.mTotalRewardDiscount = null;
        cartsummaryhelper.mRewardTotalDiscount = null;
        cartsummaryhelper.mCouponmax = null;
        cartsummaryhelper.mRewardsmax = null;
        cartsummaryhelper.mCouponCodeButton = null;
        cartsummaryhelper.mCouponSerialCodeButton = null;
        cartsummaryhelper.mFindCouponsText = null;
        cartsummaryhelper.mCouponCodeEditText = null;
        cartsummaryhelper.mCouponSerialCodeEditText = null;
        cartsummaryhelper.mRewardEditText = null;
        cartsummaryhelper.mRewardSerialCodeEditText = null;
        cartsummaryhelper.availableRewardsLayout = null;
        cartsummaryhelper.availableRewardsCount = null;
        cartsummaryhelper.mEstimateTaxHeader = null;
        cartsummaryhelper.mEstimateTaxTextView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((CartSummaryHelper)obj);
    }

    public ()
    {
    }
}
