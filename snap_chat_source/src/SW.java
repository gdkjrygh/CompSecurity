// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class SW
{

    protected String id;
    protected Integer screenshotCount;
    protected Long timestamp;

    public SW()
    {
    }

    public final SW a(Integer integer)
    {
        screenshotCount = integer;
        return this;
    }

    public final SW a(Long long1)
    {
        timestamp = long1;
        return this;
    }

    public final SW a(String s)
    {
        id = s;
        return this;
    }

    public final String a()
    {
        return id;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof SW))
        {
            return false;
        } else
        {
            obj = (SW)obj;
            return (new EqualsBuilder()).append(id, ((SW) (obj)).id).append(timestamp, ((SW) (obj)).timestamp).append(screenshotCount, ((SW) (obj)).screenshotCount).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(id).append(timestamp).append(screenshotCount).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
