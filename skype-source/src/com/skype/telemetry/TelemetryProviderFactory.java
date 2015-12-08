// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.telemetry;

import java.util.HashMap;

// Referenced classes of package com.skype.telemetry:
//            TelemetryConfiguration

public interface TelemetryProviderFactory
{

    public abstract TelemetryConfiguration createConfiguration();

    public abstract HashMap createProviders();
}
