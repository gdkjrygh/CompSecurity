// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.splunk.mint.network:
//            Metric

public class MonitorRegistry
{

    private Set metrics;

    public MonitorRegistry()
    {
        metrics = Collections.synchronizedSet(new HashSet());
    }

    public void add(Metric metric)
    {
        metrics.add(metric);
    }

    public ArrayList getMetricsForName(String s)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList();
        for (Iterator iterator = metrics.iterator(); iterator.hasNext(); iterator.remove())
        {
            Metric metric = (Metric)iterator.next();
            if (s.contains(metric.getName().substring(0, metric.getName().indexOf("-"))))
            {
                arraylist.add(metric);
            }
        }

        break MISSING_BLOCK_LABEL_87;
        s;
        throw s;
        this;
        JVM INSTR monitorexit ;
        return arraylist;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        Metric metric;
        for (Iterator iterator = metrics.iterator(); iterator.hasNext(); stringbuffer.append((new StringBuilder()).append(metric.getName()).append(" = ").append(metric.getValue()).append("\n").toString()))
        {
            metric = (Metric)iterator.next();
        }

        return stringbuffer.toString();
    }
}
