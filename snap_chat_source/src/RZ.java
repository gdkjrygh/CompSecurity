// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class RZ extends RO
{

    protected String pingId;

    public RZ()
    {
    }

    public final String a()
    {
        return pingId;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof RZ))
        {
            return false;
        } else
        {
            obj = (RZ)obj;
            return (new EqualsBuilder()).append(type, ((RZ) (obj)).type).append(id, ((RZ) (obj)).id).append(pingId, ((RZ) (obj)).pingId).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(type).append(id).append(pingId).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
