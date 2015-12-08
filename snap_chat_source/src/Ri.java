// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Ri extends Qd
{

    protected String shared;
    protected List snaps;

    public Ri()
    {
    }

    public final Ri a(String s)
    {
        shared = s;
        return this;
    }

    public final Ri a(List list)
    {
        snaps = list;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Ri))
        {
            return false;
        } else
        {
            obj = (Ri)obj;
            return (new EqualsBuilder()).append(timestamp, ((Ri) (obj)).timestamp).append(reqToken, ((Ri) (obj)).reqToken).append(username, ((Ri) (obj)).username).append(shared, ((Ri) (obj)).shared).append(snaps, ((Ri) (obj)).snaps).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(shared).append(snaps).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
