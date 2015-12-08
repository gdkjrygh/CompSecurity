// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.appwidget;

import android.os.Handler;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.appwidget:
//            StackRemoteViewsFactory, PWidgetHelper

class nit> extends FeedApiResponseHandler
{

    final StackRemoteViewsFactory this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        PLog.info((new StringBuilder("FeedApiResponseHandler.onFailure, retry: ")).append(StackRemoteViewsFactory.access$300()).toString(), new Object[0]);
        if (StackRemoteViewsFactory.access$300() < 3)
        {
            StackRemoteViewsFactory.access$308();
            StackRemoteViewsFactory.access$500(StackRemoteViewsFactory.this).postDelayed(StackRemoteViewsFactory.access$400(StackRemoteViewsFactory.this), 5000L);
            return;
        } else
        {
            PWidgetHelper.notifyWidgetStateChange(StackRemoteViewsFactory.access$100(StackRemoteViewsFactory.this), -1, 1);
            return;
        }
    }

    public void onFinish()
    {
        StackRemoteViewsFactory.loading = false;
    }

    public void onStart()
    {
        StackRemoteViewsFactory.loading = true;
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        reset(pinterestjsonobject);
        PLog.info((new StringBuilder("onGridLoad.onSuccess feed count: ")).append(StackRemoteViewsFactory.access$000(StackRemoteViewsFactory.this).getCount()).toString(), new Object[0]);
        if (StackRemoteViewsFactory.access$000(StackRemoteViewsFactory.this).getCount() == 0)
        {
            PWidgetHelper.notifyWidgetStateChange(StackRemoteViewsFactory.access$100(StackRemoteViewsFactory.this), -1, 1);
            return;
        } else
        {
            clearRetry();
            StackRemoteViewsFactory.access$200(StackRemoteViewsFactory.this);
            return;
        }
    }

    ()
    {
        this$0 = StackRemoteViewsFactory.this;
        super();
    }
}
