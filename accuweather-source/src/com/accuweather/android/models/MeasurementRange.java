// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models:
//            Measurement

public class MeasurementRange
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Measurement Average;
    private Measurement Maximum;
    private Measurement Minimum;

    public MeasurementRange()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof MeasurementRange))
            {
                return false;
            }
            obj = (MeasurementRange)obj;
            if (Average == null ? ((MeasurementRange) (obj)).Average != null : !Average.equals(((MeasurementRange) (obj)).Average))
            {
                return false;
            }
            if (Maximum == null ? ((MeasurementRange) (obj)).Maximum != null : !Maximum.equals(((MeasurementRange) (obj)).Maximum))
            {
                return false;
            }
            if (Minimum == null ? ((MeasurementRange) (obj)).Minimum != null : !Minimum.equals(((MeasurementRange) (obj)).Minimum))
            {
                return false;
            }
        }
        return true;
    }

    public Measurement getAverage()
    {
        return Average;
    }

    public Measurement getMaximum()
    {
        return Maximum;
    }

    public Measurement getMinimum()
    {
        return Minimum;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (Minimum != null)
        {
            i = Minimum.hashCode();
        } else
        {
            i = 0;
        }
        if (Maximum != null)
        {
            j = Maximum.hashCode();
        } else
        {
            j = 0;
        }
        if (Average != null)
        {
            k = Average.hashCode();
        }
        return (i * 31 + j) * 31 + k;
    }

    public void setAverage(Measurement measurement)
    {
        Average = measurement;
    }

    public void setMaximum(Measurement measurement)
    {
        Maximum = measurement;
    }

    public void setMinimum(Measurement measurement)
    {
        Minimum = measurement;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MeasurementRange{Minimum=").append(Minimum).append(", Maximum=").append(Maximum).append(", Average=").append(Average).append('}').toString();
    }
}
