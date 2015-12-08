// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import com.fsr.tracker.StringsProvider;
import com.fsr.tracker.domain.Configuration;
import com.fsr.tracker.domain.MeasureConfiguration;

// Referenced classes of package com.fsr.tracker.app:
//            DefaultStringsProvider, TrackingContext

public abstract class TrackerListActivityBase extends ListActivity
{

    public TrackerListActivityBase()
    {
    }

    protected Configuration getConfiguration()
    {
        Configuration configuration = Configuration.defaultConfiguration(getCustomerId());
        configuration.addMeasure(MeasureConfiguration.defaultConfig("DEFAULT_MEASURE", getDefaultSurveyId(), 0));
        return configuration;
    }

    protected abstract String getCustomerId();

    protected abstract String getDefaultSurveyId();

    protected StringsProvider getStringsProvider()
    {
        return new DefaultStringsProvider();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        TrackingContext.Instance().initialize(this, getConfiguration(), getStringsProvider());
        if (bundle == null)
        {
            TrackingContext.Instance().applicationLaunched();
            TrackingContext.Instance().checkState();
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        TrackingContext.Instance().applicationLaunched();
    }
}
