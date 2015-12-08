// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class TX
{

    protected List results;

    public TX()
    {
    }

    public final List a()
    {
        return results;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof TX))
        {
            return false;
        } else
        {
            obj = (TX)obj;
            return (new EqualsBuilder()).append(results, ((TX) (obj)).results).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(results).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
