// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Sn extends Sp
{

    protected SC storyResponse;

    public Sn()
    {
    }

    public final SC a()
    {
        return storyResponse;
    }

    public final boolean b()
    {
        return storyResponse != null;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Sn))
        {
            return false;
        } else
        {
            obj = (Sn)obj;
            return (new EqualsBuilder()).append(serverInfo, ((Sn) (obj)).serverInfo).append(snapResponse, ((Sn) (obj)).snapResponse).append(storyResponse, ((Sn) (obj)).storyResponse).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(serverInfo).append(snapResponse).append(storyResponse).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
