// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import java.util.ArrayList;
import me.lyft.android.common.AddressUtils;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleGeometryDTO

public class GooglePlacesSearchResultDTO
{

    private String formattedAddress;
    private GoogleGeometryDTO geometry;
    private String name;
    private String placeId;
    private ArrayList types;
    private String vicinity;

    public GooglePlacesSearchResultDTO()
    {
        types = new ArrayList();
    }

    public String getFormattedAddress()
    {
        return formattedAddress;
    }

    public GoogleGeometryDTO getGeometry()
    {
        return geometry;
    }

    public String getName()
    {
        return name;
    }

    public String getPlaceId()
    {
        return placeId;
    }

    public String getShortAddress()
    {
        return AddressUtils.getShortAddress(getVicinityOrFormattedAddress());
    }

    public String getStreetAddress()
    {
        return AddressUtils.getStreetAddress(getVicinityOrFormattedAddress());
    }

    public ArrayList getTypes()
    {
        return types;
    }

    public String getVicinity()
    {
        return vicinity;
    }

    public String getVicinityOrFormattedAddress()
    {
        if (Strings.isNullOrEmpty(getVicinity()))
        {
            return getFormattedAddress();
        } else
        {
            return getVicinity();
        }
    }
}
