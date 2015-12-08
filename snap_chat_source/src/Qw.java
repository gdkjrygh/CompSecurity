// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Qw
{

    protected Su messagingAuth;

    public Qw()
    {
    }

    public final Su a()
    {
        return messagingAuth;
    }

    public final boolean b()
    {
        return messagingAuth != null;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Qw))
        {
            return false;
        } else
        {
            obj = (Qw)obj;
            return (new EqualsBuilder()).append(messagingAuth, ((Qw) (obj)).messagingAuth).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(messagingAuth).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
