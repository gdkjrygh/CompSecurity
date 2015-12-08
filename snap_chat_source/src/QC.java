// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class QC
{

    protected Double lat;
    protected Double longValue;

    public QC()
    {
    }

    public final Double a()
    {
        return lat;
    }

    public final Double b()
    {
        return longValue;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof QC))
        {
            return false;
        } else
        {
            obj = (QC)obj;
            return (new EqualsBuilder()).append(lat, ((QC) (obj)).lat).append(longValue, ((QC) (obj)).longValue).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(lat).append(longValue).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
