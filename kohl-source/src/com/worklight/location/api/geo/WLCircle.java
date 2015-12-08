// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo;

import com.worklight.location.internal.geo.AreaVisitor;

// Referenced classes of package com.worklight.location.api.geo:
//            WLArea, WLCoordinate

public class WLCircle
    implements WLArea
{

    private final WLCoordinate center;
    private final double radius;

    public WLCircle(WLCoordinate wlcoordinate, double d)
    {
        if (wlcoordinate == null)
        {
            throw new IllegalArgumentException("center is null");
        }
        if (d < 0.0D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("radius must be non-negative, was ").append(d).toString());
        } else
        {
            center = wlcoordinate;
            radius = d;
            return;
        }
    }

    public Object accept(AreaVisitor areavisitor)
    {
        return areavisitor.visitCircle(this);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (WLCircle)obj;
            if (getCenter() == null)
            {
                if (((WLCircle) (obj)).getCenter() != null)
                {
                    return false;
                }
            } else
            if (!getCenter().equals(((WLCircle) (obj)).getCenter()))
            {
                return false;
            }
            if (getRadius() != ((WLCircle) (obj)).getRadius())
            {
                return false;
            }
        }
        return true;
    }

    public WLCoordinate getCenter()
    {
        return center;
    }

    public double getRadius()
    {
        return radius;
    }

    public int hashCode()
    {
        int i;
        if (getCenter() == null)
        {
            i = 0;
        } else
        {
            i = getCenter().hashCode();
        }
        return (int)(31D * (31D * 1.0D + (double)i) + getRadius());
    }
}
