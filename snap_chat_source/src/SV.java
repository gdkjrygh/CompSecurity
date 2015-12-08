// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SV
{

    protected SU unviewed;
    protected SU viewed;

    public SV()
    {
    }

    public final SU a()
    {
        return unviewed;
    }

    public final SU b()
    {
        return viewed;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof SV))
        {
            return false;
        } else
        {
            obj = (SV)obj;
            return (new EqualsBuilder()).append(unviewed, ((SV) (obj)).unviewed).append(viewed, ((SV) (obj)).viewed).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(unviewed).append(viewed).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
