// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.location;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import me.lyft.android.utils.RandomExtensions;

// Referenced classes of package me.lyft.android.infrastructure.lyft.location:
//            NullLocationDTO, LocationDTO

public class LocationHistory
{

    private int historySize;
    private List locations;

    public LocationHistory(int i)
    {
        locations = Collections.synchronizedList(new ArrayList());
        historySize = i;
    }

    public void add(LocationDTO locationdto)
    {
        int i = locations.size();
        if (i >= historySize)
        {
            locations.remove(RandomExtensions.generateRandom(i - 1));
        }
        locations.add(locationdto);
    }

    public List getCopy()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(locations);
        return arraylist;
    }

    public LocationDTO getLastLocation()
    {
        if (locations.isEmpty())
        {
            return NullLocationDTO.getInstance();
        } else
        {
            return (LocationDTO)locations.get(locations.size() - 1);
        }
    }

    public void removeAll(Collection collection)
    {
        locations.removeAll(collection);
    }
}
