// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Sp
{

    protected Sr serverInfo;
    protected SC snapResponse;

    public Sp()
    {
    }

    public final Sr c()
    {
        return serverInfo;
    }

    public final SC d()
    {
        return snapResponse;
    }

    public final boolean e()
    {
        return snapResponse != null;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Sp))
        {
            return false;
        } else
        {
            obj = (Sp)obj;
            return (new EqualsBuilder()).append(serverInfo, ((Sp) (obj)).serverInfo).append(snapResponse, ((Sp) (obj)).snapResponse).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(serverInfo).append(snapResponse).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
