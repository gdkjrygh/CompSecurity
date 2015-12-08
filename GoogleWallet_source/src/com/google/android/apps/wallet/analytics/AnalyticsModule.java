// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import android.app.Application;
import com.google.android.apps.common.csi.lib.Configuration;
import com.google.android.apps.common.csi.lib.Reporter;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            SerializedReporter

public class AnalyticsModule
{

    public AnalyticsModule()
    {
    }

    static Reporter getReporter(Executor executor, String s)
    {
        System.setProperty("http.agent", s);
        s = (new Configuration()).setServiceName("wallet_mobile").setBatchSize(10);
        return new SerializedReporter(s.getSender(), executor, s.getCsiServer(), s.getServiceName(), String.valueOf(s.getCsiVersion()), s.getBufferLimit(), s.getRetryLimit());
    }

    static Tracker getTracker(Application application)
    {
        application = GoogleAnalytics.getInstance(application).newTracker("UA-22847105-2");
        application.enableExceptionReporting(true);
        return application;
    }
}
