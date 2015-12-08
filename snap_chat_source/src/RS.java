// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class RS
{

    protected Su gatewayAuthToken;
    protected String gatewayServer;

    public RS()
    {
    }

    public final Su a()
    {
        return gatewayAuthToken;
    }

    public final void a(String s)
    {
        gatewayServer = s;
    }

    public final String b()
    {
        return gatewayServer;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof RS))
        {
            return false;
        } else
        {
            obj = (RS)obj;
            return (new EqualsBuilder()).append(gatewayAuthToken, ((RS) (obj)).gatewayAuthToken).append(gatewayServer, ((RS) (obj)).gatewayServer).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(gatewayAuthToken).append(gatewayServer).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
