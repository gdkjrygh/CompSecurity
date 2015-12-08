// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class QU
{

    protected List users;

    public QU()
    {
    }

    public final List a()
    {
        return users;
    }

    public final boolean b()
    {
        return users != null;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof QU))
        {
            return false;
        } else
        {
            obj = (QU)obj;
            return (new EqualsBuilder()).append(users, ((QU) (obj)).users).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(users).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
