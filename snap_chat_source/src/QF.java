// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class QF extends RO
{

    public QF()
    {
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof QF))
        {
            return false;
        } else
        {
            obj = (QF)obj;
            return (new EqualsBuilder()).append(type, ((QF) (obj)).type).append(id, ((QF) (obj)).id).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(type).append(id).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
