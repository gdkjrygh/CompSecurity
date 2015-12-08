// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Ul
{

    protected List nearbySnapchatters;
    protected Long pollingIntervalMillis;

    public Ul()
    {
        pollingIntervalMillis = Long.valueOf(1000L);
    }

    public final Long a()
    {
        return pollingIntervalMillis;
    }

    public final List b()
    {
        return nearbySnapchatters;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Ul))
        {
            return false;
        } else
        {
            obj = (Ul)obj;
            return (new EqualsBuilder()).append(pollingIntervalMillis, ((Ul) (obj)).pollingIntervalMillis).append(nearbySnapchatters, ((Ul) (obj)).nearbySnapchatters).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(pollingIntervalMillis).append(nearbySnapchatters).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
