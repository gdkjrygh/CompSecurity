// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import java.util.Date;

// Referenced classes of package com.microsoft.applications.telemetry:
//            ISemanticContext, AggregatedMetricData, EventProperties, AppLifecycleState, 
//            PageActionData, ActionType, TraceLevel, UserState, 
//            PiiKind

public interface ILogger
{

    public abstract ISemanticContext getSemanticContext();

    public abstract void logAggregatedMetric(AggregatedMetricData aggregatedmetricdata, EventProperties eventproperties);

    public abstract void logAggregatedMetric(String s, long l, long l1, EventProperties eventproperties);

    public abstract void logAppLifecycle(AppLifecycleState applifecyclestate, EventProperties eventproperties);

    public abstract void logEvent(EventProperties eventproperties);

    public abstract void logFailure(String s, String s1, EventProperties eventproperties);

    public abstract void logFailure(String s, String s1, String s2, String s3, EventProperties eventproperties);

    public abstract void logPageAction(PageActionData pageactiondata, EventProperties eventproperties);

    public abstract void logPageAction(String s, ActionType actiontype, EventProperties eventproperties);

    public abstract void logPageView(String s, String s1, EventProperties eventproperties);

    public abstract void logPageView(String s, String s1, String s2, String s3, String s4, EventProperties eventproperties);

    public abstract void logSampledMetric(String s, double d, String s1, EventProperties eventproperties);

    public abstract void logSampledMetric(String s, double d, String s1, String s2, String s3, String s4, 
            EventProperties eventproperties);

    public abstract void logTrace(TraceLevel tracelevel, String s, EventProperties eventproperties);

    public abstract void logUserState(UserState userstate, long l, EventProperties eventproperties);

    public abstract void setContext(String s, double d);

    public abstract void setContext(String s, long l);

    public abstract void setContext(String s, String s1);

    public abstract void setContext(String s, String s1, PiiKind piikind);

    public abstract void setContext(String s, Date date);
}
