// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.telemetry.TelemetryConfiguration;
import com.skype.telemetry.provider.AriaTelemetryProvider;
import com.skype.telemetry.provider.FlurryTelemetryProvider;

public class SkypeTelemetryConfiguration
    implements TelemetryConfiguration
{

    private final EcsConfiguration a;

    public SkypeTelemetryConfiguration(EcsConfiguration ecsconfiguration)
    {
        a = ecsconfiguration;
    }

    public final boolean a(Class class1)
    {
        if (class1 == com/skype/telemetry/provider/AriaTelemetryProvider)
        {
            return a.getTelemetryProviderAriaEnabled();
        }
        if (class1 == com/skype/telemetry/provider/FlurryTelemetryProvider)
        {
            return a.getTelemetryProviderFlurryEnabled();
        } else
        {
            return false;
        }
    }
}
