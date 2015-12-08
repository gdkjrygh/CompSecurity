// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import io.fabric.sdk.android.services.events.EventsStorage;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEventTransform

class SessionAnalyticsFilesManager extends EventsFilesManager
{

    private AnalyticsSettingsData g;

    SessionAnalyticsFilesManager(Context context, SessionEventTransform sessioneventtransform, CurrentTimeProvider currenttimeprovider, EventsStorage eventsstorage)
    {
        super(context, sessioneventtransform, currenttimeprovider, eventsstorage, 100);
    }

    protected String a()
    {
        UUID uuid = UUID.randomUUID();
        return (new StringBuilder()).append("sa").append("_").append(uuid.toString()).append("_").append(c.a()).append(".tap").toString();
    }

    void a(AnalyticsSettingsData analyticssettingsdata)
    {
        g = analyticssettingsdata;
    }

    protected int b()
    {
        if (g == null)
        {
            return super.b();
        } else
        {
            return g.e;
        }
    }

    protected int c()
    {
        if (g == null)
        {
            return super.c();
        } else
        {
            return g.c;
        }
    }
}
