// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.microsoft.applications.telemetry:
//            ILogger, EventPriority, SemanticContext, AggregatedMetricData, 
//            AggregateType, EventProperties, AppLifecycleState, PageActionData, 
//            ActionType, RawActionType, InputDeviceType, TraceLevel, 
//            UserState, PiiKind, ISemanticContext

public class Logger
    implements ILogger
{

    private static final String LOG_TAG = com/microsoft/applications/telemetry/Logger.getSimpleName();
    private final long nativeInstance;

    protected Logger(long l)
    {
        String.format("Creating logger nativeInstance with ptr: 0x%x", new Object[] {
            Long.valueOf(l)
        });
        nativeInstance = l;
    }

    private EventPriority getEventPriority(String s)
    {
        String.format("getEventPriorityName|name: %s", new Object[] {
            s
        });
        return EventPriority.UNSPECIFIED;
    }

    protected static long getLoggerNativeInstance(Logger logger)
    {
        if (logger == null)
        {
            return 0L;
        } else
        {
            return logger.nativeInstance;
        }
    }

    private native long getSemanticContextNative(long l);

    private native void logAggregatedMetricNative(long l, String s, long l1, long l2, 
            long l3);

    private native void logAggregatedMetricPreComputedNative(long l, String s, long l1, long l2, 
            String s1, String s2, String s3, String s4, int ai[], double ad[], long al[], 
            long al1[], long l3);

    private native void logAppLifecycleNative(long l, int i, long l1);

    private native void logEventNative(long l, long l1);

    private native void logFailureInTelemetryNative(long l, String s, String s1, String s2, String s3, long l1);

    private native void logFailureNative(long l, String s, String s1, long l1);

    private native void logPageActionInTelemetryNative(long l, String s, int i, int j, int k, String s1, 
            String s2, String s3, String s4, String s5, String s6, int i1, long l1);

    private native void logPageActionNative(long l, String s, int i, long l1);

    private native void logPageViewInTelemetryNative(long l, String s, String s1, String s2, String s3, String s4, 
            long l1);

    private native void logPageViewNative(long l, String s, String s1, long l1);

    private native void logSampledMetricNative(long l, String s, double d, String s1, long l1);

    private native void logSampledMetricObservedNative(long l, String s, double d, String s1, String s2, 
            String s3, String s4, long l1);

    private native void logTraceNative(long l, int i, String s, long l1);

    private native void logUserStateNative(long l, int i, long l1, long l2);

    private native void setContextDoubleNative(long l, String s, double d);

    private native void setContextLongNative(long l, String s, long l1);

    private native void setContextStringNative(long l, String s, String s1, int i);

    private void setEventPriority(String s, EventPriority eventpriority)
    {
        String.format("setEventPriorityName|name: %s|priority: %s", new Object[] {
            s, Integer.valueOf(eventpriority.getValue())
        });
    }

    public ISemanticContext getSemanticContext()
    {
        return new SemanticContext(getSemanticContextNative(nativeInstance));
    }

    public void logAggregatedMetric(AggregatedMetricData aggregatedmetricdata, EventProperties eventproperties)
    {
        String.format("logAggregatedMetric|metricData: %s|properties: %s", new Object[] {
            aggregatedmetricdata, eventproperties
        });
        if (aggregatedmetricdata == null)
        {
            throw new IllegalArgumentException("metricData cannot be null");
        }
        int ai[] = new int[aggregatedmetricdata.aggregates.size()];
        double ad[] = new double[aggregatedmetricdata.aggregates.size()];
        long al[] = new long[aggregatedmetricdata.buckets.size()];
        long al1[] = new long[aggregatedmetricdata.buckets.size()];
        int i = 0;
        for (Iterator iterator = aggregatedmetricdata.aggregates.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            ai[i] = ((AggregateType)entry.getKey()).getValue();
            ad[i] = ((Double)entry.getValue()).doubleValue();
            i++;
        }

        i = 0;
        for (Iterator iterator1 = aggregatedmetricdata.buckets.entrySet().iterator(); iterator1.hasNext();)
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator1.next();
            al[i] = ((Long)entry1.getKey()).longValue();
            al1[i] = ((Long)entry1.getValue()).longValue();
            i++;
        }

        logAggregatedMetricPreComputedNative(nativeInstance, aggregatedmetricdata.name, aggregatedmetricdata.duration, aggregatedmetricdata.count, aggregatedmetricdata.units, aggregatedmetricdata.instanceName, aggregatedmetricdata.objectClass, aggregatedmetricdata.objectId, ai, ad, al, al1, EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logAggregatedMetric(String s, long l, long l1, EventProperties eventproperties)
    {
        String.format("logAggregatedMetric|name: %s|duration: %d|count: %d|properties: %s", new Object[] {
            s, Long.valueOf(l), Long.valueOf(l1), eventproperties
        });
        logAggregatedMetricNative(nativeInstance, s, l, l1, EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logAppLifecycle(AppLifecycleState applifecyclestate, EventProperties eventproperties)
    {
        String.format("logAppLifeCycle|appState: %d|properties: %s", new Object[] {
            Integer.valueOf(applifecyclestate.getValue()), eventproperties
        });
        logAppLifecycleNative(nativeInstance, applifecyclestate.getValue(), EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logEvent(EventProperties eventproperties)
    {
        String.format("logEvent|properties: %s", new Object[] {
            eventproperties
        });
        if (eventproperties == null)
        {
            throw new IllegalArgumentException("logEvent|cannot log a null event");
        } else
        {
            logEventNative(nativeInstance, EventProperties.getEventPropertiesNativeInstance(eventproperties));
            return;
        }
    }

    public void logFailure(String s, String s1, EventProperties eventproperties)
    {
        String.format("logFailure|signature: %s|detail: %s|properties: %s", new Object[] {
            s, s1, eventproperties
        });
        logFailureNative(nativeInstance, s, s1, EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logFailure(String s, String s1, String s2, String s3, EventProperties eventproperties)
    {
        String.format("logFailureInTelemetry|signature: %s|detail: %s|category: %s|id: %s|properties: %s", new Object[] {
            s, s1, s2, s3, eventproperties
        });
        logFailureInTelemetryNative(nativeInstance, s, s1, s2, s3, EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logPageAction(PageActionData pageactiondata, EventProperties eventproperties)
    {
        String.format("logPageActionInTelemetry|pageAction: %s|properties: %s", new Object[] {
            pageactiondata, eventproperties
        });
        logPageActionInTelemetryNative(nativeInstance, pageactiondata.pageViewId, pageactiondata.actionType.getValue(), pageactiondata.rawActionType.getValue(), pageactiondata.inputDeviceType.getValue(), pageactiondata.destinationUri, pageactiondata.targetItemId, pageactiondata.targetItemName, pageactiondata.targetItemCategory, pageactiondata.targetItemCollection, pageactiondata.targetItemLayoutContainer, pageactiondata.targetItemRank, EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logPageAction(String s, ActionType actiontype, EventProperties eventproperties)
    {
        String.format("logPageAction|pageViewId: %s|actionType: %d|properties: %s", new Object[] {
            s, Integer.valueOf(actiontype.getValue()), eventproperties
        });
        logPageActionNative(nativeInstance, s, actiontype.getValue(), EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logPageView(String s, String s1, EventProperties eventproperties)
    {
        String.format("logPageView|id: %s|pageName: %s| properties: 0x%x", new Object[] {
            s, s1, eventproperties
        });
        logPageViewNative(nativeInstance, s, s1, EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logPageView(String s, String s1, String s2, String s3, String s4, EventProperties eventproperties)
    {
        String.format("logPageViewInTelemetry|id: %s|pageName: %s|category: %s|uri: %s|referrerUri: %s|properties: %s", new Object[] {
            s, s1, s2, s3, s4, eventproperties
        });
        logPageViewInTelemetryNative(nativeInstance, s, s1, s2, s3, s4, EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logSampledMetric(String s, double d, String s1, EventProperties eventproperties)
    {
        String.format("logSampledMetric|name: %s|value: %s|units: %s|properties: %s", new Object[] {
            s, Double.valueOf(d), s1, eventproperties
        });
        logSampledMetricNative(nativeInstance, s, d, s1, EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logSampledMetric(String s, double d, String s1, String s2, String s3, String s4, 
            EventProperties eventproperties)
    {
        String.format("logSampledMetric|name: %s|value: %s|units: %s|instanceName: %s|objClass: %s|objId: %s|properties: %s", new Object[] {
            s, Double.valueOf(d), s1, s2, s3, s4, eventproperties
        });
        logSampledMetricObservedNative(nativeInstance, s, d, s1, s2, s3, s4, EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logTrace(TraceLevel tracelevel, String s, EventProperties eventproperties)
    {
        String.format("logTrace|level: %d|message: %s|properties: %s", new Object[] {
            Integer.valueOf(tracelevel.getValue()), s, eventproperties
        });
        logTraceNative(nativeInstance, tracelevel.getValue(), s, EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void logUserState(UserState userstate, long l, EventProperties eventproperties)
    {
        String.format("logUserState|state: %d|timeToLiveInMillis: %d|properties: %s", new Object[] {
            Integer.valueOf(userstate.getValue()), Long.valueOf(l), eventproperties
        });
        logUserStateNative(nativeInstance, userstate.getValue(), l, EventProperties.getEventPropertiesNativeInstance(eventproperties));
    }

    public void setContext(String s, double d)
    {
        String.format("setContext|name: %s|value: %s", new Object[] {
            s, Double.valueOf(d)
        });
        setContextDoubleNative(nativeInstance, s, d);
    }

    public void setContext(String s, long l)
    {
        String.format("setContext|name: %s|value: %d", new Object[] {
            s, Long.valueOf(l)
        });
        setContextLongNative(nativeInstance, s, l);
    }

    public void setContext(String s, String s1)
    {
        setContext(s, s1, PiiKind.NONE);
    }

    public void setContext(String s, String s1, PiiKind piikind)
    {
        String.format("setContext|name: %s|value: %s|piiKind: %s", new Object[] {
            s, s1, piikind
        });
        setContextStringNative(nativeInstance, s, s1, piikind.getValue());
    }

    public void setContext(String s, Date date)
    {
        String.format("setContext|name: %s|value: %s", new Object[] {
            s, date
        });
        long l = date.getTime();
        setContextLongNative(nativeInstance, s, l);
    }

}
