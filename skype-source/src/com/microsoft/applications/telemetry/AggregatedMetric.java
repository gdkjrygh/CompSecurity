// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import android.util.Log;

// Referenced classes of package com.microsoft.applications.telemetry:
//            EventProperties, Logger

public class AggregatedMetric
{

    private static final String LOG_TAG = com/microsoft/applications/telemetry/AggregatedMetric.getSimpleName();
    private final long nativeInstance;

    public AggregatedMetric(String s, String s1, int i, EventProperties eventproperties, Logger logger)
    {
        String.format("AggregatedMetric|name: %s|units: %s|intervalInSec: %d|properties: %s|logger: %s", new Object[] {
            s, s1, Integer.valueOf(i), eventproperties, logger
        });
        nativeInstance = createAggregatedMetricNative(s, s1, i, EventProperties.getEventPropertiesNativeInstance(eventproperties), Logger.getLoggerNativeInstance(logger));
        if (nativeInstance == 0L)
        {
            Log.wtf(LOG_TAG, "Error initializing metric aggregator. Null aggregator returned from native code.");
        }
    }

    public AggregatedMetric(String s, String s1, int i, String s2, String s3, String s4, EventProperties eventproperties, 
            Logger logger)
    {
        String.format("AggregatedMetric|name: %s|units: %s|intervalInSec: %d|instanceName: %s|objectClass: %s|objectId: %s|properties: %s", new Object[] {
            s, s1, Integer.valueOf(i), s2, s3, s4, eventproperties
        });
        nativeInstance = createAggregatedMetricForObjectNative(s, s1, i, s2, s3, s4, EventProperties.getEventPropertiesNativeInstance(eventproperties), Logger.getLoggerNativeInstance(logger));
        if (nativeInstance == 0L)
        {
            Log.wtf(LOG_TAG, "Error initializing metric aggregator. Null aggregator returned from native code.");
        }
    }

    private native long createAggregatedMetricForObjectNative(String s, String s1, int i, String s2, String s3, String s4, long l, long l1);

    private native long createAggregatedMetricNative(String s, String s1, int i, long l, long l1);

    private native void destroyAggregatedMetricNative(long l);

    private native void pushMetricNative(long l, double d);

    public void finalize()
        throws Throwable
    {
        String.format("destroyNative: 0x%x", new Object[] {
            Long.valueOf(nativeInstance)
        });
        destroyAggregatedMetricNative(nativeInstance);
        super.finalize();
    }

    protected long getInstance()
    {
        return nativeInstance;
    }

    public void pushMetric(double d)
    {
        String.format("pushMetric: %s", new Object[] {
            Double.valueOf(d)
        });
        pushMetricNative(nativeInstance, d);
    }

    public String toString()
    {
        return String.format("0x%x", new Object[] {
            Long.valueOf(nativeInstance)
        });
    }

}
