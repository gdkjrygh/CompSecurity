// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class QB
{

    protected Boolean isDelta;

    public QB()
    {
    }

    public final Boolean a()
    {
        return isDelta;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof QB))
        {
            return false;
        } else
        {
            obj = (QB)obj;
            return (new EqualsBuilder()).append(isDelta, ((QB) (obj)).isDelta).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(isDelta).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
