// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Rc
{

    protected List coordinates;
    protected String id;

    public Rc()
    {
    }

    public final String a()
    {
        return id;
    }

    public final List b()
    {
        return coordinates;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Rc))
        {
            return false;
        } else
        {
            obj = (Rc)obj;
            return (new EqualsBuilder()).append(id, ((Rc) (obj)).id).append(coordinates, ((Rc) (obj)).coordinates).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(id).append(coordinates).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
