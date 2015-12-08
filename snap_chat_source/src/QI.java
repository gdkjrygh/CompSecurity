// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class QI
{

    protected Long autoRefreshDelayInMilli;
    protected Float autoRefreshMessageXLandscape;
    protected Float autoRefreshMessageXPortrait;
    protected Float autoRefreshMessageYLandscape;
    protected Float autoRefreshMessageYPortrait;

    public QI()
    {
    }

    public final Long a()
    {
        return autoRefreshDelayInMilli;
    }

    public final Float b()
    {
        return autoRefreshMessageXPortrait;
    }

    public final Float c()
    {
        return autoRefreshMessageYPortrait;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof QI))
        {
            return false;
        } else
        {
            obj = (QI)obj;
            return (new EqualsBuilder()).append(autoRefreshDelayInMilli, ((QI) (obj)).autoRefreshDelayInMilli).append(autoRefreshMessageXPortrait, ((QI) (obj)).autoRefreshMessageXPortrait).append(autoRefreshMessageXLandscape, ((QI) (obj)).autoRefreshMessageXLandscape).append(autoRefreshMessageYPortrait, ((QI) (obj)).autoRefreshMessageYPortrait).append(autoRefreshMessageYLandscape, ((QI) (obj)).autoRefreshMessageYLandscape).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(autoRefreshDelayInMilli).append(autoRefreshMessageXPortrait).append(autoRefreshMessageXLandscape).append(autoRefreshMessageYPortrait).append(autoRefreshMessageYLandscape).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
