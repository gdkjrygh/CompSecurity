// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.notification;

import android.content.Context;
import com.dominos.App;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.core.Ts;
import com.dominos.android.sdk.common.dom.tracker.OrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.google.a.b.ar;
import java.util.Iterator;

public class TrackerServiceController
{

    private final String TAG = com/dominos/notification/TrackerServiceController.getName();
    App app;
    private String extension;
    boolean isCanceled;
    private TrackerOrderStatus newerOrderStatus;
    private String orderID;
    private String orderKey;
    private String phone;
    private PowerRestClient powerRestClient;
    private String storeID;

    TrackerServiceController(Context context)
    {
        orderKey = null;
        isCanceled = false;
        powerRestClient = PowerRestClient_.getInstance_(context);
    }

    private int findOrderLocation(ar ar1)
    {
label0:
        {
            {
                int j = 0;
                int i = -1;
                if (orderID != null || ar1.size() <= 0)
                {
                    break label0;
                }
                Object obj = null;
                Iterator iterator = ar1.iterator();
                ar1 = obj;
                while (iterator.hasNext()) 
                {
                    TrackerOrderStatus trackerorderstatus = (TrackerOrderStatus)iterator.next();
                    Object obj1 = ar1;
                    if (ar1 == null)
                    {
                        obj1 = trackerorderstatus.getMakeTime();
                        newerOrderStatus = trackerorderstatus;
                    }
                    int k;
                    if (((Ts) (obj1)).before(trackerorderstatus.getMakeTime()) && trackerorderstatus.getOrderStatus() != OrderStatus.FUTURE)
                    {
                        ar1 = trackerorderstatus.getMakeTime();
                        newerOrderStatus = trackerorderstatus;
                        i = j;
                    } else
                    {
                        ar1 = ((ar) (obj1));
                    }
                    j++;
                }
                orderID = newerOrderStatus.getOrderId();
                storeID = newerOrderStatus.getStoreId();
                j = i;
            }
            return j;
        }
        ar1 = ar1.iterator();
        k = 0;
        do
        {
            j = i;
            if (!ar1.hasNext())
            {
                continue;
            }
            obj1 = (TrackerOrderStatus)ar1.next();
            if (((TrackerOrderStatus) (obj1)).getOrderId().contentEquals(orderID) && storeID.contentEquals(((TrackerOrderStatus) (obj1)).getStoreId()))
            {
                LogUtil.d((new StringBuilder()).append(TAG).append(" CHOSEN").toString(), ((TrackerOrderStatus) (obj1)).getOrderId(), new Object[0]);
                return k;
            }
            k++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_141;
_L1:
    }

    private void trackOrderByOrderID(final TrackerServiceCallback trackerServiceCallback)
    {
        powerRestClient.trackOrder(storeID, orderKey, new _cls2());
    }

    private void trackOrderByPhone(final TrackerServiceCallback trackerServiceCallback)
    {
        powerRestClient.trackOrderByPhone(phone, extension, new _cls1());
    }

    public void cancel()
    {
        isCanceled = true;
    }

    public void getTrackerStatus(TrackerServiceCallback trackerservicecallback)
    {
        if (orderKey != null)
        {
            trackOrderByOrderID(trackerservicecallback);
            return;
        } else
        {
            trackOrderByPhone(trackerservicecallback);
            return;
        }
    }

    public void setOrderInfo(String s, String s1, String s2, String s3)
    {
        orderKey = null;
        phone = s;
        extension = s1;
        orderID = s2;
        storeID = s3;
        newerOrderStatus = null;
    }




/*
    static String access$102(TrackerServiceController trackerservicecontroller, String s)
    {
        trackerservicecontroller.orderKey = s;
        return s;
    }

*/


    private class _cls2 extends PowerRestCallback
    {

        final TrackerServiceController this$0;
        final TrackerServiceCallback val$trackerServiceCallback;

        public void onError(Exception exception, String s)
        {
            trackerServiceCallback.onFailure();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            if (!isCanceled)
            {
                TrackerResult trackerresult = TrackerResult.from(s);
                if (trackerresult != null)
                {
                    if (orderKey != null)
                    {
                        if (trackerresult.getOrderStatuses().isEmpty())
                        {
                            LogUtil.e(TAG, "Code 0: Order list is empty", new Object[0]);
                            trackerServiceCallback.onFailure();
                            return;
                        } else
                        {
                            LogUtil.d(TAG, (new StringBuilder("Updated: ")).append(((TrackerOrderStatus)trackerresult.getOrderStatuses().get(0)).getOrderStatus()).toString(), new Object[0]);
                            LogUtil.d(TAG, "Code 1: Normal run", new Object[0]);
                            trackerServiceCallback.onSuccess(s, 0);
                            return;
                        }
                    }
                } else
                {
                    LogUtil.e(TAG, "Code 4: Something went wrong", new Object[0]);
                    trackerServiceCallback.onFailure();
                    return;
                }
            }
        }

        _cls2()
        {
            this$0 = TrackerServiceController.this;
            trackerServiceCallback = trackerservicecallback;
            super();
        }

        private class TrackerServiceCallback
        {

            public abstract void onFailure();

            public abstract void onSuccess(String s, int i);
        }

    }


    private class _cls1 extends PowerRestCallback
    {

        final TrackerServiceController this$0;
        final TrackerServiceCallback val$trackerServiceCallback;

        public void onError(Exception exception, String s)
        {
            trackerServiceCallback.onFailure();
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            TrackerResult trackerresult = TrackerResult.from(s);
            int i;
            if (trackerresult.getOrderStatuses().size() > 0)
            {
                i = findOrderLocation(trackerresult.getOrderStatuses());
            } else
            {
                i = -1;
            }
            if (i >= 0)
            {
                orderKey = ((TrackerOrderStatus)trackerresult.getOrderStatuses().get(i)).getOrderKey();
                LogUtil.d(TAG, (new StringBuilder("Code 2: index was found normally. Index is ")).append(i).toString(), new Object[0]);
            } else
            {
                LogUtil.d(TAG, "Code 3: Order not located. Index is -1", new Object[0]);
            }
            trackerServiceCallback.onSuccess(s, i);
        }

        _cls1()
        {
            this$0 = TrackerServiceController.this;
            trackerServiceCallback = trackerservicecallback;
            super();
        }
    }

}
