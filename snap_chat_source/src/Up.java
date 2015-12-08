// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Up
{

    protected Boolean couldSave;
    protected String message;
    protected String passwordStrength;

    public Up()
    {
    }

    public final Up a(String s)
    {
        passwordStrength = s;
        return this;
    }

    public final String a()
    {
        return passwordStrength;
    }

    public final Up b(String s)
    {
        message = s;
        return this;
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
        if (!(obj instanceof Up))
        {
            return false;
        } else
        {
            obj = (Up)obj;
            return (new EqualsBuilder()).append(passwordStrength, ((Up) (obj)).passwordStrength).append(message, ((Up) (obj)).message).append(couldSave, ((Up) (obj)).couldSave).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(passwordStrength).append(message).append(couldSave).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
