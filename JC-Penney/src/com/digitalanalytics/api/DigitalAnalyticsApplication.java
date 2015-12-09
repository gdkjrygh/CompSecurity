// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digitalanalytics.api;

import android.app.Application;

// Referenced classes of package com.digitalanalytics.api:
//            DigitalAnalytics

public class DigitalAnalyticsApplication extends Application
{

    public DigitalAnalyticsApplication()
    {
    }

    public final void onCreate()
    {
        DigitalAnalytics.startup(this);
        super.onCreate();
    }

    public final void onTerminate()
    {
        DigitalAnalytics.shutdown();
        super.onTerminate();
    }
}
