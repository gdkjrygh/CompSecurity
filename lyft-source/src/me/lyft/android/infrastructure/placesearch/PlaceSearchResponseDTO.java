// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.placesearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package me.lyft.android.infrastructure.placesearch:
//            PlaceSearchResultItemDTO

public class PlaceSearchResponseDTO
{

    public final List places;

    public PlaceSearchResponseDTO(List list)
    {
        places = list;
    }

    public List toDomainLocations()
    {
        if (places == null || places.size() <= 0)
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList(places.size());
        for (Iterator iterator = places.iterator(); iterator.hasNext(); arraylist.add(((PlaceSearchResultItemDTO)iterator.next()).toDomainLocation())) { }
        return arraylist;
    }
}
