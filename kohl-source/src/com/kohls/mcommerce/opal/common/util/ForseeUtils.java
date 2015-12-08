// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.util;

import android.app.Application;
import com.fsr.tracker.app.TrackingContext;
import com.fsr.tracker.domain.Configuration;
import com.fsr.tracker.domain.MeasureConfiguration;

public class ForseeUtils
{

    public ForseeUtils()
    {
    }

    public static void disableForsee()
    {
        try
        {
            if (TrackingContext.Instance() != null)
            {
                TrackingContext.stop();
            }
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            runtimeexception.printStackTrace();
        }
    }

    public static void foreseeAppExit()
    {
        try
        {
            if (TrackingContext.Instance() != null)
            {
                TrackingContext.Instance().applicationExited();
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public static void initialiseForsee(Application application, int i, int j, int k, int l, int i1, boolean flag)
    {
        Configuration configuration = Configuration.defaultConfiguration(application.getString(0x7f08021c));
        configuration.withCustomLogo("com/kohls/mcommerce/opal/kohls_forsee_logo.png");
        configuration.shouldPresentOnExit();
        MeasureConfiguration measureconfiguration = MeasureConfiguration.defaultConfig("DefaultMeasure", "android_app", 0);
        measureconfiguration.withMaxDaysSinceLaunch(i);
        measureconfiguration.withMaxLaunchCount(j);
        configuration.repeatAfterDecline(k);
        configuration.shouldRepeatSurveyAfterDays(l);
        if (i1 > 0)
        {
            configuration.repeatAfterDeclineMinutes(i1);
        }
        configuration.addMeasure(measureconfiguration);
        TrackingContext.start(application, configuration);
        if (flag)
        {
            TrackingContext.Instance().applicationLaunched();
            TrackingContext.Instance().checkState();
        }
    }
}
