// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order;

import android.content.Context;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.android.sdk.core.order:
//            OrderManager

public final class OrderManager_ extends OrderManager
{

    private Context context_;

    private OrderManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static OrderManager_ getInstance_(Context context)
    {
        return new OrderManager_(context);
    }

    private void init_()
    {
        mOrderUtil = OrderUtil_.getInstance_(context_);
        mPowerApi = PowerRestClient_.getInstance_(context_);
    }

    public final void checkStoreAndPriceOrder(LabsOrder labsorder, OrderManager.CheckStoreAndPriceOrderCallback checkstoreandpriceordercallback)
    {
        a.a(new _cls4("", labsorder, checkstoreandpriceordercallback));
    }

    public final void createOrderForCarryout(String s, OrderManager.CreateCarryoutOrderCallback createcarryoutordercallback)
    {
        a.a(new _cls1("", s, createcarryoutordercallback));
    }

    public final void createOrderForDelivery(LabsAddress labsaddress, OrderManager.CreateDeliveryOrderCallback createdeliveryordercallback)
    {
        a.a(new _cls5("", labsaddress, createdeliveryordercallback));
    }

    public final void createOrderFromHistoricalOrder(LabsOrder labsorder, OrderManager.CreateReOrderCallback createreordercallback)
    {
        a.a(new _cls6("", labsorder, createreordercallback));
    }

    public final void placeOrder(LabsOrder labsorder, String s, OrderManager.PlaceOrderCallback placeordercallback)
    {
        a.a(new _cls3(labsorder, s, placeordercallback));
    }

    public final void priceOrder(LabsOrder labsorder, OrderManager.PriceOrderCallback priceordercallback)
    {
        a.a(new _cls2("", labsorder, priceordercallback));
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }







    private class _cls4 extends c
    {

        final OrderManager_ this$0;
        final OrderManager.CheckStoreAndPriceOrderCallback val$callback;
        final LabsOrder val$order;

        public void execute()
        {
            try
            {
                checkStoreAndPriceOrder(order, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls4(String s1, LabsOrder labsorder, OrderManager.CheckStoreAndPriceOrderCallback checkstoreandpriceordercallback)
        {
            this$0 = OrderManager_.this;
            order = labsorder;
            callback = checkstoreandpriceordercallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls1 extends c
    {

        final OrderManager_ this$0;
        final OrderManager.CreateCarryoutOrderCallback val$callback;
        final String val$storeId;

        public void execute()
        {
            try
            {
                createOrderForCarryout(storeId, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(String s1, String s2, OrderManager.CreateCarryoutOrderCallback createcarryoutordercallback)
        {
            this$0 = OrderManager_.this;
            storeId = s2;
            callback = createcarryoutordercallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls5 extends c
    {

        final OrderManager_ this$0;
        final OrderManager.CreateDeliveryOrderCallback val$callback;
        final LabsAddress val$deliveryAddress;

        public void execute()
        {
            try
            {
                createOrderForDelivery(deliveryAddress, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls5(String s1, LabsAddress labsaddress, OrderManager.CreateDeliveryOrderCallback createdeliveryordercallback)
        {
            this$0 = OrderManager_.this;
            deliveryAddress = labsaddress;
            callback = createdeliveryordercallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls6 extends c
    {

        final OrderManager_ this$0;
        final OrderManager.CreateReOrderCallback val$callback;
        final LabsOrder val$historicalOrder;

        public void execute()
        {
            try
            {
                createOrderFromHistoricalOrder(historicalOrder, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls6(String s1, LabsOrder labsorder, OrderManager.CreateReOrderCallback createreordercallback)
        {
            this$0 = OrderManager_.this;
            historicalOrder = labsorder;
            callback = createreordercallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls3 extends c
    {

        final OrderManager_ this$0;
        final OrderManager.PlaceOrderCallback val$callback;
        final String val$domSession;
        final LabsOrder val$placeOrderRequest;

        public void execute()
        {
            try
            {
                placeOrder(placeOrderRequest, domSession, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls3(LabsOrder labsorder, String s2, OrderManager.PlaceOrderCallback placeordercallback)
        {
            this$0 = OrderManager_.this;
            placeOrderRequest = labsorder;
            domSession = s2;
            callback = placeordercallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls2 extends c
    {

        final OrderManager_ this$0;
        final OrderManager.PriceOrderCallback val$callback;
        final LabsOrder val$newOrder;

        public void execute()
        {
            try
            {
                priceOrder(newOrder, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls2(String s1, LabsOrder labsorder, OrderManager.PriceOrderCallback priceordercallback)
        {
            this$0 = OrderManager_.this;
            newOrder = labsorder;
            callback = priceordercallback;
            super(final_s, final_i, s1);
        }
    }

}
