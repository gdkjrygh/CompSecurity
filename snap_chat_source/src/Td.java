// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Td extends Qd
{

    protected QP settings;

    public Td()
    {
    }

    public final Td a(QP qp)
    {
        settings = qp;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Td))
        {
            return false;
        } else
        {
            obj = (Td)obj;
            return (new EqualsBuilder()).append(timestamp, ((Td) (obj)).timestamp).append(reqToken, ((Td) (obj)).reqToken).append(username, ((Td) (obj)).username).append(settings, ((Td) (obj)).settings).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(settings).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
