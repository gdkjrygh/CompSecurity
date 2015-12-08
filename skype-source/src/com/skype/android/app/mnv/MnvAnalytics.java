// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;

public class MnvAnalytics
{

    private Analytics analytics;
    private EcsConfiguration ecsConfiguration;

    public MnvAnalytics(Analytics analytics1, EcsConfiguration ecsconfiguration)
    {
        analytics = analytics1;
        ecsConfiguration = ecsconfiguration;
    }

    public String getUserType(UserPreferences userpreferences)
    {
        if (userpreferences.isNewUser())
        {
            return "New user";
        } else
        {
            return "Existing user";
        }
    }

    public void onAnalytics(AnalyticsEvent analyticsevent, AnalyticsParameterContainer analyticsparametercontainer)
    {
        analytics.a(analyticsevent, analyticsparametercontainer);
    }

    public void report(AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void report(String s, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.k, s);
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void report(String s, String s1, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.k, s);
        analyticsparametercontainer.a(AnalyticsParameter.o, s1);
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void report(String s, String s1, String s2, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.k, s);
        analyticsparametercontainer.a(AnalyticsParameter.m, s1);
        analyticsparametercontainer.a(AnalyticsParameter.l, s2);
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void reportCompleted(String s, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.s, s);
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void reportMnvEnabled(String s, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.t, s);
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void reportPreCheckSkip(String s, String s1, String s2, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.k, s);
        analyticsparametercontainer.a(AnalyticsParameter.m, s1);
        analyticsparametercontainer.a(AnalyticsParameter.v, s2);
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void reportServerError(String s, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.q, s);
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void reportServerError(String s, String s1, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.q, s);
        analyticsparametercontainer.a(AnalyticsParameter.b, s1);
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void reportServerError(String s, String s1, String s2, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.q, s);
        analyticsparametercontainer.a(AnalyticsParameter.b, s1);
        analyticsparametercontainer.a(AnalyticsParameter.r, s2);
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void reportServerErrorDeviceDetail(String s, String s1, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.q, s);
        analyticsparametercontainer.a(AnalyticsParameter.r, s1);
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void reportSuccessCount(String s, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.u, s);
        analyticsparametercontainer.a(AnalyticsParameter.p, ecsConfiguration.getETag());
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void reportWithReferrerAndDeviceInfo(String s, String s1, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.b, s);
        analyticsparametercontainer.a(AnalyticsParameter.e, s1);
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }

    public void reportWithValue(String s, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.b, s);
        onAnalytics(analyticsevent, analyticsparametercontainer);
    }
}
