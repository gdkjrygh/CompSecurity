// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo;

import com.worklight.location.internal.AbstractPosition;
import java.util.Date;

// Referenced classes of package com.worklight.location.api.geo:
//            WLCoordinate

public class WLGeoPosition extends AbstractPosition
{

    private final WLCoordinate coordinate;

    protected WLGeoPosition()
    {
        coordinate = null;
    }

    public WLGeoPosition(WLCoordinate wlcoordinate, long l)
    {
        super(l);
        if (wlcoordinate == null)
        {
            throw new IllegalArgumentException("coordinate is null");
        } else
        {
            coordinate = wlcoordinate;
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!super.equals(obj))
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (WLGeoPosition)obj;
        if (coordinate != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WLGeoPosition) (obj)).coordinate == null) goto _L1; else goto _L3
_L3:
        return false;
        if (coordinate.equals(((WLGeoPosition) (obj)).coordinate)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public WLCoordinate getCoordinate()
    {
        return coordinate;
    }

    public int hashCode()
    {
        int j = super.hashCode();
        int i;
        if (coordinate == null)
        {
            i = 0;
        } else
        {
            i = coordinate.hashCode();
        }
        return j * 31 + i;
    }

    public String toString()
    {
        return (new StringBuilder()).append(new Date(getTimestamp().longValue())).append(" : ").append(coordinate.toString()).toString();
    }
}
