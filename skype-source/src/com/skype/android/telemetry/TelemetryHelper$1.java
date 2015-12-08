// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.telemetry;

import com.skype.android.util.NetworkUtil;

// Referenced classes of package com.skype.android.telemetry:
//            TelemetryWriter, TelemetryHelper, RecordBuilder

final class a
    implements TelemetryWriter
{

    final TelemetryHelper a;

    public final void a(RecordBuilder recordbuilder)
    {
        recordbuilder.a("network_type", Integer.valueOf(TelemetryHelper.access$000(a).j()));
        recordbuilder.a("network_subtype", TelemetryHelper.access$000(a).k());
        recordbuilder.a("network_provider", TelemetryHelper.access$000(a).l());
    }

    (TelemetryHelper telemetryhelper)
    {
        a = telemetryhelper;
        super();
    }
}
