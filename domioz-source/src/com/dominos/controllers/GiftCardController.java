// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.app.Activity;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.dominos.android.sdk.core.giftcard.GiftCardManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.controllers.interfaces.IAddGiftCardActivity;
import com.dominos.controllers.interfaces.IDominosView;
import com.dominos.controllers.interfaces.IDominosViewController;
import java.util.ArrayList;

public class GiftCardController
    implements IDominosViewController
{

    private static final String TAG = com/dominos/controllers/GiftCardController.getName();
    private GiftCardManager mGiftCardManager;
    MobileSession mMobileSession;
    private OrderManager mOrderManager;
    private NumberUtil numberUtil;
    PowerRestClient powerApi;
    private IAddGiftCardActivity view;

    public GiftCardController()
    {
        numberUtil = new NumberUtil();
    }

    private boolean checkForCorrectNumberLength(GiftCard giftcard)
    {
        return giftcard.getFullCardNumber().length() < 19 || giftcard.getPin().length() < 4;
    }

    private boolean checkIfAmountIsMoreThanBalance(GiftCard giftcard, double d)
    {
        return giftcard.getBalance() < d;
    }

    private boolean checkIfCardIsDuplicate(GiftCard giftcard)
    {
        ArrayList arraylist = mGiftCardManager.getTempGiftCardList();
        if (arraylist != null && arraylist.size() > 0)
        {
            GiftCard giftcard1 = (GiftCard)mGiftCardManager.getTempGiftCardList().get(0);
            return giftcard1 != null && giftcard.equals(giftcard1);
        } else
        {
            return false;
        }
    }

    private boolean checkifAmountsAreMoreThanOrderPrice(GiftCard giftcard, double d)
    {
        return mGiftCardManager.getOtherCardAmount(giftcard) + d > mOrderManager.getOrder().getPrice();
    }

    private boolean orderIsCovered()
    {
        return Double.compare(mGiftCardManager.getRemainingTempBalance(mOrderManager.getOrder()), 0.0D) == 0;
    }

    public boolean anyErrorsExist(GiftCard giftcard)
    {
        if (checkForCorrectNumberLength(giftcard))
        {
            view.showAlertDialog(3);
            return true;
        }
        if (checkIfCardIsDuplicate(giftcard))
        {
            view.showAlertDialog(7);
            return true;
        } else
        {
            return false;
        }
    }

    public void deleteGiftCard(GiftCard giftcard)
    {
        mGiftCardManager.removeGiftCard(giftcard);
        mGiftCardManager.saveGiftCardList();
        view.removeGiftCards();
    }

    public void dispose()
    {
    }

    public void getBalance(GiftCard giftcard)
    {
        if (anyErrorsExist(giftcard))
        {
            return;
        } else
        {
            powerApi.giftCardBalanceInquiry(giftcard, new _cls1());
            return;
        }
    }

    public void onAfterInject()
    {
        mGiftCardManager = (GiftCardManager)mMobileSession.getManager("gift_card_manager");
        mOrderManager = (OrderManager)mMobileSession.getManager("order_manager");
    }

    public IDominosViewController setView(IDominosView idominosview)
    {
        view = (IAddGiftCardActivity)idominosview;
        return this;
    }

    public void setupFonts()
    {
        FontManager.applyDominosFont((Activity)view);
    }

    public void updateGiftCard(GiftCard giftcard, String s)
    {
        int i = mGiftCardManager.getTempGiftCardList().indexOf(giftcard);
        giftcard = (GiftCard)mGiftCardManager.getTempGiftCardList().get(i);
        double d = Double.parseDouble(s.replaceAll("\\$", ""));
        if (checkIfAmountIsMoreThanBalance(giftcard, d))
        {
            view.showAlertDialog(8);
            return;
        }
        if (checkifAmountsAreMoreThanOrderPrice(giftcard, d))
        {
            view.showAlertDialog(9);
            return;
        }
        giftcard.setAmount(d);
        if (orderIsCovered())
        {
            view.updateViews();
            return;
        } else
        {
            view.showAlertDialog(11);
            return;
        }
    }








    private class _cls1 extends PowerRestCallback
    {

        final GiftCardController this$0;

        public void onBegin()
        {
            super.onBegin();
            class _cls1
                implements Runnable
            {

                final _cls1 this$1;

                public void run()
                {
                    view.showProgressSpinner();
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            view.getActivity().runOnUiThread(new _cls1());
        }

        public void onError(Exception exception, String s)
        {
            if (App.isDebugMode())
            {
                Log.d(GiftCardController.TAG, (new StringBuilder("on error ")).append(s).toString());
            }
            class _cls2
                implements Runnable
            {

                final _cls1 this$1;

                public void run()
                {
                    view.dismissProgressSpinner();
                }

                _cls2()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            view.getActivity().runOnUiThread(new _cls2());
            view.showToast(0);
        }

        public void onFinish()
        {
            super.onFinish();
            class _cls3
                implements Runnable
            {

                final _cls1 this$1;

                public void run()
                {
                    view.dismissProgressSpinner();
                }

                _cls3()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            view.getActivity().runOnUiThread(new _cls3());
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            if (App.isDebugMode())
            {
                Log.d(GiftCardController.TAG, (new StringBuilder("response from server ")).append(s).toString());
            }
            s = (GiftCard)(new r()).a(com/dominos/android/sdk/common/dom/order/GiftCard, new GiftCardDeserializer()).f().a(s, com/dominos/android/sdk/common/dom/order/GiftCard);
            if (s.getStatus() != 0)
            {
                view.showAlertDialog(10);
                return;
            }
            double d;
            double d1;
            if (s.getBalance() > mOrderManager.getOrder().getPrice())
            {
                d = mOrderManager.getOrder().getPrice();
            } else
            {
                d = s.getBalance();
            }
            d1 = mGiftCardManager.getOtherCardAmount(s);
            s.setAmount(numberUtil.doubleToFormattedDouble(Double.valueOf(d - d1)));
            mGiftCardManager.addGiftCard(s);
            if (orderIsCovered())
            {
                view.updateViews();
                return;
            } else
            {
                view.showAlertDialog(11);
                return;
            }
        }

        _cls1()
        {
            this$0 = GiftCardController.this;
            super();
        }
    }

}
