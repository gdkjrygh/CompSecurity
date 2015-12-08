// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Ur
{

    protected String message;
    protected Boolean success;

    public Ur()
    {
    }

    public final Ur a(Boolean boolean1)
    {
        success = boolean1;
        return this;
    }

    public final Ur a(String s)
    {
        message = s;
        return this;
    }

    public final Boolean a()
    {
        return success;
    }

    public final String b()
    {
        return message;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Ur))
        {
            return false;
        } else
        {
            obj = (Ur)obj;
            return (new EqualsBuilder()).append(success, ((Ur) (obj)).success).append(message, ((Ur) (obj)).message).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(success).append(message).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
