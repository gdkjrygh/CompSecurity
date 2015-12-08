// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.common.async.IntervalRunner;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonObject;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.analytics:
//            PerfIntervalCallback

class  extends BaseApiResponseHandler
{

    final PerfIntervalCallback a;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        if (apiresponse.getCode() == 15)
        {
            PLog.log(PerfIntervalCallback.c(a), "Submitting: FATAL PERF BATCH: %s", new Object[] {
                String.valueOf(apiresponse)
            });
            PerfIntervalCallback.g(a);
            if (ApplicationInfo.isNonProduction())
            {
                PinterestJsonObject pinterestjsonobject = apiresponse.getDeveloperError();
                if (pinterestjsonobject != null)
                {
                    apiresponse = pinterestjsonobject.a("message", "");
                    throwable = apiresponse;
                    if (StringUtils.isBlank(apiresponse))
                    {
                        throwable = String.valueOf(pinterestjsonobject);
                    }
                    throwable = (new StringBuilder()).append("BatchPerformanceAPI: ").append(String.valueOf(throwable)).toString();
                } else
                {
                    throwable = (new StringBuilder()).append("BatchPerformanceAPI: ").append("Failure! See logs for details.").toString();
                }
                Application.showDebugErrorToast(throwable);
            }
        } else
        {
            PLog.log(PerfIntervalCallback.c(a), "Submitting: FAILED %s", new Object[] {
                apiresponse.getMessageDisplay()
            });
        }
        IntervalRunner.instance().addCallback(PerfIntervalCallback.f(a));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        PLog.log(PerfIntervalCallback.c(a), "Submitting: Success", new Object[0]);
        PerfIntervalCallback.g(a);
        IntervalRunner.instance().addCallback(PerfIntervalCallback.f(a));
    }

    (PerfIntervalCallback perfintervalcallback)
    {
        a = perfintervalcallback;
        super();
    }
}
