// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.io.Serializable;

// Referenced classes of package com.facebook:
//            AppEventsLogger

public class FacebookTimeSpentData
    implements Serializable
{

    public static final String a = com/facebook/AppEventsLogger.getCanonicalName();
    private static final long b[] = {
        0x493e0L, 0xdbba0L, 0x1b7740L, 0x36ee80L, 0x1499700L, 0x2932e00L, 0x5265c00L, 0xa4cb800L, 0xf731400L, 0x240c8400L, 
        0x48190800L, 0x6c258c00L, 0x90321000L, 0x134fd9000L, 0x1cf7c5800L, 0x269fb2000L, 0x30479e800L, 0x39ef8b000L, 0x757b12c00L
    };
    private static final long serialVersionUID = 1L;
    public String firstOpenSourceApplication;
    public int interruptionCount;
    public boolean isAppActive;
    public boolean isWarmLaunch;
    public long lastActivateEventLoggedTime;
    public long lastResumeTime;
    public long lastSuspendTime;
    public long millisecondsSpentInSession;

    public FacebookTimeSpentData()
    {
        a();
    }

    private FacebookTimeSpentData(long l, long l1, long l2, int i, 
            String s)
    {
        a();
        lastResumeTime = l;
        lastSuspendTime = l1;
        millisecondsSpentInSession = l2;
        interruptionCount = i;
        firstOpenSourceApplication = s;
    }

    FacebookTimeSpentData(long l, long l1, long l2, int i, 
            String s, byte byte0)
    {
        this(l, l1, l2, i, s);
    }

    public static int a(long l)
    {
        int i;
        for (i = 0; i < 19 && b[i] < l; i++) { }
        return i;
    }

    private Object writeReplace()
    {
        return new SerializationProxyV2(lastResumeTime, lastSuspendTime, millisecondsSpentInSession, interruptionCount, firstOpenSourceApplication);
    }

    public final void a()
    {
        isAppActive = false;
        lastResumeTime = -1L;
        lastSuspendTime = -1L;
        interruptionCount = 0;
        millisecondsSpentInSession = 0L;
    }


    private class SerializationProxyV2
        implements Serializable
    {

        private static final long serialVersionUID = 6L;
        private final String firstOpenSourceApplication;
        private final int interruptionCount;
        private final long lastResumeTime;
        private final long lastSuspendTime;
        private final long millisecondsSpentInSession;

        private Object readResolve()
        {
            return new FacebookTimeSpentData(lastResumeTime, lastSuspendTime, millisecondsSpentInSession, interruptionCount, firstOpenSourceApplication, (byte)0);
        }

        SerializationProxyV2(long l, long l1, long l2, int i, 
                String s)
        {
            lastResumeTime = l;
            lastSuspendTime = l1;
            millisecondsSpentInSession = l2;
            interruptionCount = i;
            firstOpenSourceApplication = s;
        }
    }

}
