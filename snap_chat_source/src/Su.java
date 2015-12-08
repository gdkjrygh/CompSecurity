// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Su
{

    protected String mac;
    protected String payload;

    public Su()
    {
    }

    public final String a()
    {
        return payload;
    }

    public final String b()
    {
        return mac;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Su))
        {
            return false;
        } else
        {
            obj = (Su)obj;
            return (new EqualsBuilder()).append(payload, ((Su) (obj)).payload).append(mac, ((Su) (obj)).mac).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(payload).append(mac).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
