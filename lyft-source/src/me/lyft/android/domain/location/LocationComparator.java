// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.location;


// Referenced classes of package me.lyft.android.domain.location:
//            Location

public class LocationComparator
    implements me.lyft.android.rx.ReactiveProperty.EqualityComparator
{

    public LocationComparator()
    {
    }

    public volatile boolean equals(Object obj, Object obj1)
    {
        return equals((Location)obj, (Location)obj1);
    }

    public boolean equals(Location location, Location location1)
    {
        if (location == location1)
        {
            return true;
        }
        if (location == null || location1 == null)
        {
            return false;
        } else
        {
            return location.hasSameCoordinates(location1);
        }
    }
}
