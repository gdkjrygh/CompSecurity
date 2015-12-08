// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import java.util.HashMap;
import java.util.Map;

public class AggregatedMetricData
{

    public Map aggregates;
    public Map buckets;
    public final long count;
    public final long duration;
    public String instanceName;
    public final String name;
    public String objectClass;
    public String objectId;
    public String units;

    public AggregatedMetricData(String s, long l, long l1)
    {
        units = "";
        instanceName = "";
        objectClass = "";
        objectId = "";
        aggregates = new HashMap();
        buckets = new HashMap();
        name = s;
        duration = l;
        count = l1;
    }
}
