// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo;

import com.worklight.location.internal.geo.AreaVisitor;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.worklight.location.api.geo:
//            WLArea, WLCoordinate

public class WLPolygon
    implements WLArea
{

    private final List coordinates;
    public final int length;

    public WLPolygon(List list)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("coordinates was null");
        }
        if (list.isEmpty())
        {
            throw new IllegalArgumentException("coordinates list was empty");
        } else
        {
            coordinates = new ArrayList(list);
            length = list.size();
            return;
        }
    }

    public Object accept(AreaVisitor areavisitor)
    {
        return areavisitor.visitPolygon(this);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (WLPolygon)obj;
        if (coordinates != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WLPolygon) (obj)).coordinates == null) goto _L1; else goto _L3
_L3:
        return false;
        if (coordinates.equals(((WLPolygon) (obj)).coordinates)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public WLCoordinate get(int i)
    {
        return (WLCoordinate)coordinates.get(i);
    }

    public List getCoordinates()
    {
        return new ArrayList(coordinates);
    }

    public int hashCode()
    {
        int i;
        if (coordinates == null)
        {
            i = 0;
        } else
        {
            i = coordinates.hashCode();
        }
        return i + 31;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WLPolygon: ").append(coordinates).toString();
    }
}
