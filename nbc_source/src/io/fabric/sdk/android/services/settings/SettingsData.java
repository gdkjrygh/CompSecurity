// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;


// Referenced classes of package io.fabric.sdk.android.services.settings:
//            AnalyticsSettingsData, AppSettingsData, BetaSettingsData, FeaturesSettingsData, 
//            PromptSettingsData, SessionSettingsData

public class SettingsData
{

    public final AnalyticsSettingsData analyticsSettingsData;
    public final AppSettingsData appData;
    public final BetaSettingsData betaSettingsData;
    public final int cacheDuration;
    public final long expiresAtMillis;
    public final FeaturesSettingsData featuresData;
    public final PromptSettingsData promptData;
    public final SessionSettingsData sessionData;
    public final int settingsVersion;

    public SettingsData(long l, AppSettingsData appsettingsdata, SessionSettingsData sessionsettingsdata, PromptSettingsData promptsettingsdata, FeaturesSettingsData featuressettingsdata, AnalyticsSettingsData analyticssettingsdata, 
            BetaSettingsData betasettingsdata, int i, int j)
    {
        expiresAtMillis = l;
        appData = appsettingsdata;
        sessionData = sessionsettingsdata;
        promptData = promptsettingsdata;
        featuresData = featuressettingsdata;
        settingsVersion = i;
        cacheDuration = j;
        analyticsSettingsData = analyticssettingsdata;
        betaSettingsData = betasettingsdata;
    }

    public boolean isExpired(long l)
    {
        return expiresAtMillis < l;
    }
}
