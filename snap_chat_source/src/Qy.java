// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Qy extends RO
{

    protected Rl header;
    protected Boolean retried;

    public Qy()
    {
    }

    public final void a(Rl rl)
    {
        header = rl;
    }

    public final void a(Boolean boolean1)
    {
        retried = boolean1;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Qy))
        {
            return false;
        } else
        {
            obj = (Qy)obj;
            return (new EqualsBuilder()).append(type, ((Qy) (obj)).type).append(id, ((Qy) (obj)).id).append(header, ((Qy) (obj)).header).append(retried, ((Qy) (obj)).retried).isEquals();
        }
    }

    public final Rl h()
    {
        return header;
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(type).append(id).append(header).append(retried).toHashCode();
    }

    public final Boolean i()
    {
        return retried;
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
