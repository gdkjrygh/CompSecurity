// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.text.TextUtils;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.concurrent.ListenableCompletableFuture;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil

public static class  extends ListenableCompletableFuture
{

    static int uiCacheDownloadCount = 0;
    long startTime;

    public static void reportUiCacheCount(Analytics analytics)
    {
        if (uiCacheDownloadCount != 0)
        {
            AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
            analyticsparametercontainer.a(AnalyticsParameter.M, Integer.valueOf(uiCacheDownloadCount));
            uiCacheDownloadCount = 0;
            analytics.a(AnalyticsEvent.cW, analyticsparametercontainer);
        }
    }

    public void incrementUiCacheDownload()
    {
        uiCacheDownloadCount++;
    }

    public void reportEvents(AnalyticsEvent analyticsevent, String s, String s1, String s2, String s3, String s4, Analytics analytics)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.m, s);
        analyticsparametercontainer.a(AnalyticsParameter.I, s1);
        s = AnalyticsParameter.J;
        boolean flag;
        if (!TextUtils.isEmpty(s2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        analyticsparametercontainer.a(s, String.valueOf(flag));
        analyticsparametercontainer.a(AnalyticsParameter.K, s3);
        analyticsparametercontainer.a(AnalyticsParameter.L, s4);
        analyticsparametercontainer.a(AnalyticsParameter.s, Analytics.g(System.currentTimeMillis() - startTime));
        analytics.a(analyticsevent, analyticsparametercontainer);
    }

    protected void startTelemetry(long l)
    {
        startTime = l;
    }


    public ()
    {
    }
}
