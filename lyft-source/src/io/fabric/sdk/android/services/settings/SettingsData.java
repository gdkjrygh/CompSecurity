// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;


// Referenced classes of package io.fabric.sdk.android.services.settings:
//            AppSettingsData, SessionSettingsData, PromptSettingsData, FeaturesSettingsData, 
//            AnalyticsSettingsData, BetaSettingsData

public class SettingsData
{

    public final AppSettingsData a;
    public final SessionSettingsData b;
    public final PromptSettingsData c;
    public final FeaturesSettingsData d;
    public final AnalyticsSettingsData e;
    public final BetaSettingsData f;
    public final long g;
    public final int h;
    public final int i;

    public SettingsData(long l, AppSettingsData appsettingsdata, SessionSettingsData sessionsettingsdata, PromptSettingsData promptsettingsdata, FeaturesSettingsData featuressettingsdata, AnalyticsSettingsData analyticssettingsdata, 
            BetaSettingsData betasettingsdata, int j, int k)
    {
        g = l;
        a = appsettingsdata;
        b = sessionsettingsdata;
        c = promptsettingsdata;
        d = featuressettingsdata;
        h = j;
        i = k;
        e = analyticssettingsdata;
        f = betasettingsdata;
    }

    public boolean a(long l)
    {
        return g < l;
    }
}
