// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.session;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.infrastructure.device.IDevice;

// Referenced classes of package me.lyft.android.analytics.session:
//            IAnalyticsSession, AnalyticsSessionInfo

public class AnalyticsSession
    implements IAnalyticsSession
{

    private static final long INACTIVITY_THRESHOLD_MS;
    private AnalyticsSessionInfo analyticsSessionInfo;
    private final IDevice device;
    private final ILyftPreferences lyftPreferences;

    public AnalyticsSession(ILyftPreferences ilyftpreferences, IDevice idevice)
    {
        lyftPreferences = ilyftpreferences;
        device = idevice;
        analyticsSessionInfo = ilyftpreferences.getAnalyticsSession();
    }

    private void createSession()
    {
        analyticsSessionInfo = new AnalyticsSessionInfo(UUID.randomUUID().toString(), device.getElapsedRealtime());
        lyftPreferences.setAnalyticsSession(analyticsSessionInfo);
    }

    private void postActivity()
    {
        long l = device.getElapsedRealtime();
        if (l - analyticsSessionInfo.getLastActivity() > INACTIVITY_THRESHOLD_MS)
        {
            analyticsSessionInfo.setSessionId(UUID.randomUUID().toString());
        }
        analyticsSessionInfo.setLastActivity(l);
        lyftPreferences.setAnalyticsSession(analyticsSessionInfo);
    }

    public String getSessionId(boolean flag)
    {
        if (analyticsSessionInfo != null) goto _L2; else goto _L1
_L1:
        createSession();
_L4:
        return analyticsSessionInfo.getSessionId();
_L2:
        if (flag)
        {
            postActivity();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        INACTIVITY_THRESHOLD_MS = TimeUnit.MINUTES.toMillis(30L);
    }
}
