// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Va
{

    protected List sections;

    public Va()
    {
    }

    public final List a()
    {
        return sections;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Va))
        {
            return false;
        } else
        {
            obj = (Va)obj;
            return (new EqualsBuilder()).append(sections, ((Va) (obj)).sections).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(sections).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
