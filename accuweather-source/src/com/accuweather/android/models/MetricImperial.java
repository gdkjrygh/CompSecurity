// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models:
//            Measurement

public class MetricImperial
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Measurement Imperial;
    private Measurement Metric;

    public MetricImperial()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (MetricImperial)obj;
        if (Imperial == null)
        {
            if (((MetricImperial) (obj)).Imperial != null)
            {
                return false;
            }
        } else
        if (!Imperial.equals(((MetricImperial) (obj)).Imperial))
        {
            return false;
        }
        if (Metric != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((MetricImperial) (obj)).Metric == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Metric.equals(((MetricImperial) (obj)).Metric)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Measurement getImperial()
    {
        return Imperial;
    }

    public Measurement getMetric()
    {
        return Metric;
    }

    public String getUnit(boolean flag)
    {
        if (flag)
        {
            if (getMetric() != null)
            {
                return getMetric().getUnit();
            } else
            {
                return "";
            }
        }
        if (getImperial() != null)
        {
            return getImperial().getUnit();
        } else
        {
            return "";
        }
    }

    public Double getValue(boolean flag)
    {
        Double double1 = null;
        if (flag)
        {
            if (getMetric() != null)
            {
                double1 = getMetric().getValue();
            }
        } else
        if (getImperial() != null)
        {
            return getImperial().getValue();
        }
        return double1;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (Imperial == null)
        {
            i = 0;
        } else
        {
            i = Imperial.hashCode();
        }
        if (Metric != null)
        {
            j = Metric.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void setImperial(Measurement measurement)
    {
        Imperial = measurement;
    }

    public void setMetric(Measurement measurement)
    {
        Metric = measurement;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MetricImperial [Metric=").append(Metric).append(", Imperial=").append(Imperial).append("]").toString();
    }
}
