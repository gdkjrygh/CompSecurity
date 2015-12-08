// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.app.Activity;
import android.util.Log;
import com.dominos.App;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.dominos.android.sdk.core.giftcard.GiftCardManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.json.GiftCardDeserializer;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import com.dominos.controllers.interfaces.IAddGiftCardActivity;
import com.google.b.k;
import com.google.b.r;

// Referenced classes of package com.dominos.controllers:
//            GiftCardController

class RestCallback extends PowerRestCallback
{

    final GiftCardController this$0;

    public void onBegin()
    {
        super.onBegin();
        class _cls1
            implements Runnable
        {

            final GiftCardController._cls1 this$1;

            public void run()
            {
                GiftCardController.access$000(this$0).showProgressSpinner();
            }

            _cls1()
            {
                this$1 = GiftCardController._cls1.this;
                super();
            }
        }

        GiftCardController.access$000(GiftCardController.this).getActivity().runOnUiThread(new _cls1());
    }

    public void onError(Exception exception, String s)
    {
        if (App.isDebugMode())
        {
            Log.d(GiftCardController.access$100(), (new StringBuilder("on error ")).append(s).toString());
        }
        class _cls2
            implements Runnable
        {

            final GiftCardController._cls1 this$1;

            public void run()
            {
                GiftCardController.access$000(this$0).dismissProgressSpinner();
            }

            _cls2()
            {
                this$1 = GiftCardController._cls1.this;
                super();
            }
        }

        GiftCardController.access$000(GiftCardController.this).getActivity().runOnUiThread(new _cls2());
        GiftCardController.access$000(GiftCardController.this).showToast(0);
    }

    public void onFinish()
    {
        super.onFinish();
        class _cls3
            implements Runnable
        {

            final GiftCardController._cls1 this$1;

            public void run()
            {
                GiftCardController.access$000(this$0).dismissProgressSpinner();
            }

            _cls3()
            {
                this$1 = GiftCardController._cls1.this;
                super();
            }
        }

        GiftCardController.access$000(GiftCardController.this).getActivity().runOnUiThread(new _cls3());
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        if (App.isDebugMode())
        {
            Log.d(GiftCardController.access$100(), (new StringBuilder("response from server ")).append(s).toString());
        }
        s = (GiftCard)(new r()).a(com/dominos/android/sdk/common/dom/order/GiftCard, new GiftCardDeserializer()).f().a(s, com/dominos/android/sdk/common/dom/order/GiftCard);
        if (s.getStatus() != 0)
        {
            GiftCardController.access$000(GiftCardController.this).showAlertDialog(10);
            return;
        }
        double d;
        double d1;
        if (s.getBalance() > GiftCardController.access$200(GiftCardController.this).getOrder().getPrice())
        {
            d = GiftCardController.access$200(GiftCardController.this).getOrder().getPrice();
        } else
        {
            d = s.getBalance();
        }
        d1 = GiftCardController.access$300(GiftCardController.this).getOtherCardAmount(s);
        s.setAmount(GiftCardController.access$400(GiftCardController.this).doubleToFormattedDouble(Double.valueOf(d - d1)));
        GiftCardController.access$300(GiftCardController.this).addGiftCard(s);
        if (GiftCardController.access$500(GiftCardController.this))
        {
            GiftCardController.access$000(GiftCardController.this).updateViews();
            return;
        } else
        {
            GiftCardController.access$000(GiftCardController.this).showAlertDialog(11);
            return;
        }
    }

    dManager()
    {
        this$0 = GiftCardController.this;
        super();
    }
}
