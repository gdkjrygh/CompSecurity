// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPTag;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class LPTag
    implements ILPTag
{

    private String asString;
    private Integer hashCode;
    private final String name;

    public LPTag(String s)
    {
        name = s;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof LPTag))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        } else
        {
            obj = (LPTag)obj;
            return (new EqualsBuilder()).append(getName(), ((LPTag) (obj)).getName()).isEquals();
        }
    }

    public String getName()
    {
        return name;
    }

    public int hashCode()
    {
        if (hashCode == null)
        {
            hashCode = Integer.valueOf((new HashCodeBuilder()).append(name).toHashCode());
        }
        return hashCode.intValue();
    }

    public String toString()
    {
        if (asString == null)
        {
            asString = (new ToStringBuilder(this)).append(name).toString();
        }
        return asString;
    }
}
