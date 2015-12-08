// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Tm extends Qd
{

    protected Map receipts;

    public Tm()
    {
    }

    public final Tm a(Map map)
    {
        receipts = map;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Tm))
        {
            return false;
        } else
        {
            obj = (Tm)obj;
            return (new EqualsBuilder()).append(timestamp, ((Tm) (obj)).timestamp).append(reqToken, ((Tm) (obj)).reqToken).append(username, ((Tm) (obj)).username).append(receipts, ((Tm) (obj)).receipts).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(receipts).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
