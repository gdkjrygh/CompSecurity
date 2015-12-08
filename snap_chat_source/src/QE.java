// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class QE extends Qd
{

    protected String applicationId;
    protected String deviceToken;
    protected String type;

    public QE()
    {
    }

    public final QE a(String s)
    {
        type = s;
        return this;
    }

    public final QE b(String s)
    {
        deviceToken = s;
        return this;
    }

    public final QE c(String s)
    {
        applicationId = s;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof QE))
        {
            return false;
        } else
        {
            obj = (QE)obj;
            return (new EqualsBuilder()).append(timestamp, ((QE) (obj)).timestamp).append(reqToken, ((QE) (obj)).reqToken).append(username, ((QE) (obj)).username).append(type, ((QE) (obj)).type).append(deviceToken, ((QE) (obj)).deviceToken).append(applicationId, ((QE) (obj)).applicationId).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(type).append(deviceToken).append(applicationId).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
