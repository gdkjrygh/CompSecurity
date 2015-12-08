// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Ro extends Qd
{

    protected Rn errorMessage;

    public Ro()
    {
    }

    public final Ro a(Rn rn)
    {
        errorMessage = rn;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Ro))
        {
            return false;
        } else
        {
            obj = (Ro)obj;
            return (new EqualsBuilder()).append(timestamp, ((Ro) (obj)).timestamp).append(reqToken, ((Ro) (obj)).reqToken).append(username, ((Ro) (obj)).username).append(errorMessage, ((Ro) (obj)).errorMessage).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(errorMessage).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
