// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Rq
{

    protected String urlServerJson;

    public Rq()
    {
    }

    public final String a()
    {
        return urlServerJson;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Rq))
        {
            return false;
        } else
        {
            obj = (Rq)obj;
            return (new EqualsBuilder()).append(urlServerJson, ((Rq) (obj)).urlServerJson).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(urlServerJson).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
