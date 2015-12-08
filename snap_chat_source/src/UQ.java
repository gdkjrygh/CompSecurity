// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class UQ
{

    protected Boolean exists;
    protected QS friend;
    protected Boolean logged;
    protected Boolean throttled;

    public UQ()
    {
    }

    public final Boolean a()
    {
        return exists;
    }

    public final Boolean b()
    {
        return throttled;
    }

    public final Boolean c()
    {
        return logged;
    }

    public final QS d()
    {
        return friend;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof UQ))
        {
            return false;
        } else
        {
            obj = (UQ)obj;
            return (new EqualsBuilder()).append(exists, ((UQ) (obj)).exists).append(throttled, ((UQ) (obj)).throttled).append(logged, ((UQ) (obj)).logged).append(friend, ((UQ) (obj)).friend).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(exists).append(throttled).append(logged).append(friend).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
