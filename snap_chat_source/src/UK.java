// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class UK
{

    protected List response;

    public UK()
    {
    }

    public final List a()
    {
        return response;
    }

    public final boolean b()
    {
        return response != null;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof UK))
        {
            return false;
        } else
        {
            obj = (UK)obj;
            return (new EqualsBuilder()).append(response, ((UK) (obj)).response).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(response).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
