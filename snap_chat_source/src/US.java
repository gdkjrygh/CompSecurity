// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class US
{

    protected List userSegments;

    public US()
    {
    }

    public final List a()
    {
        return userSegments;
    }

    public final boolean b()
    {
        return userSegments != null;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof US))
        {
            return false;
        } else
        {
            obj = (US)obj;
            return (new EqualsBuilder()).append(userSegments, ((US) (obj)).userSegments).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(userSegments).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
