// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import com.skype.telemetry.event.TelemetryEvent;

// Referenced classes of package com.skype.android.analytics:
//            ExperimentEvent, ExperimentTag

public class ExperimentTelemetryEvent extends TelemetryEvent
{

    public ExperimentTelemetryEvent(ExperimentEvent experimentevent, ExperimentTag experimenttag)
    {
        super((new StringBuilder()).append(experimentevent.name()).append('_').append(experimenttag.name()).toString());
    }
}
