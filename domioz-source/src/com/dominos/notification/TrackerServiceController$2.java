// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.notification;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerResult;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import com.google.a.b.ar;

// Referenced classes of package com.dominos.notification:
//            TrackerServiceController

class lback extends PowerRestCallback
{

    final TrackerServiceController this$0;
    final ackerServiceCallback val$trackerServiceCallback;

    public void onError(Exception exception, String s)
    {
        val$trackerServiceCallback.onFailure();
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
                if (TrackerServiceController.access$100(TrackerServiceController.this) != null)
                {
                    if (trackerresult.getOrderStatuses().isEmpty())
                    {
                        LogUtil.e(TrackerServiceController.access$200(TrackerServiceController.this), "Code 0: Order list is empty", new Object[0]);
                        val$trackerServiceCallback.onFailure();
                        return;
                    } else
                    {
                        LogUtil.d(TrackerServiceController.access$200(TrackerServiceController.this), (new StringBuilder("Updated: ")).append(((TrackerOrderStatus)trackerresult.getOrderStatuses().get(0)).getOrderStatus()).toString(), new Object[0]);
                        LogUtil.d(TrackerServiceController.access$200(TrackerServiceController.this), "Code 1: Normal run", new Object[0]);
                        val$trackerServiceCallback.onSuccess(s, 0);
                        return;
                    }
                }
            } else
            {
                LogUtil.e(TrackerServiceController.access$200(TrackerServiceController.this), "Code 4: Something went wrong", new Object[0]);
                val$trackerServiceCallback.onFailure();
                return;
            }
        }
    }

    ackerServiceCallback()
    {
        this$0 = final_trackerservicecontroller;
        val$trackerServiceCallback = ackerServiceCallback.this;
        super();
    }
}
