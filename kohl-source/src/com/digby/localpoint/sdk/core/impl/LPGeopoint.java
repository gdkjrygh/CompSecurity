// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPGeopoint;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class LPGeopoint
    implements ILPGeopoint
{

    private String asString;
    private Integer hashCode;
    private final double latitude;
    private final double longitude;

    public LPGeopoint(double d, double d1)
    {
        latitude = d;
        longitude = d1;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof LPGeopoint))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        } else
        {
            obj = (LPGeopoint)obj;
            return (new EqualsBuilder()).append(latitude, ((LPGeopoint) (obj)).latitude).append(longitude, ((LPGeopoint) (obj)).longitude).isEquals();
        }
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public int hashCode()
    {
        if (hashCode == null)
        {
            hashCode = Integer.valueOf((new HashCodeBuilder()).append(latitude).append(longitude).toHashCode());
        }
        return hashCode.intValue();
    }

    public String toString()
    {
        if (asString == null)
        {
            asString = (new ToStringBuilder(this)).append(latitude).append(longitude).toString();
        }
        return asString;
    }
}
