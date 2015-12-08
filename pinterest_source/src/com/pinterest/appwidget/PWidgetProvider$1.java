// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.appwidget;

import com.pinterest.activity.notifications.NotificationCount;
import com.pinterest.api.ApiResponse;
import com.pinterest.reporting.CrashReporting;

// Referenced classes of package com.pinterest.appwidget:
//            PWidgetProvider, PWidgetHelper

class sponseHandler extends com.pinterest.api.remote.tionUnseenCountResponseHandler
{

    final PWidgetProvider this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        try
        {
            int i = NotificationCount.getTotalUnseenCount();
            if (i != PWidgetProvider.access$000())
            {
                int _tmp = PWidgetProvider.access$002(i);
                PWidgetHelper.notifyWidgetStateChange(PWidgetProvider.access$100(PWidgetProvider.this), PWidgetProvider.access$000());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ApiResponse apiresponse)
        {
            CrashReporting.a(apiresponse);
        }
    }

    icationCount()
    {
        this$0 = PWidgetProvider.this;
        super();
    }
}
