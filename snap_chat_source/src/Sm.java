// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Sm
{

    protected Boolean saved;
    protected Integer version;

    public Sm()
    {
    }

    public final Boolean a()
    {
        return saved;
    }

    public final Integer b()
    {
        return version;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Sm))
        {
            return false;
        } else
        {
            obj = (Sm)obj;
            return (new EqualsBuilder()).append(saved, ((Sm) (obj)).saved).append(version, ((Sm) (obj)).version).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(saved).append(version).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
