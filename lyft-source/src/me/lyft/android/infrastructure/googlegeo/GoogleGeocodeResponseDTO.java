// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleGeoResponseDTO, GoogleGeocodeResultDTO

public class GoogleGeocodeResponseDTO extends GoogleGeoResponseDTO
{

    public static final String BICYCLE_ROUTE = "Bicycle Route";
    public static final String OVER_QUERY_LIMIT = "OVER_QUERY_LIMIT";
    public static final String ZERO_RESULTS = "ZERO_RESULTS";
    List results;
    private String status;

    public GoogleGeocodeResponseDTO()
    {
        results = new ArrayList();
    }

    public GoogleGeocodeResultDTO getBestAddress()
    {
        Object obj = getResults();
        if (((List) (obj)).size() > 0)
        {
            GoogleGeocodeResultDTO googlegeocoderesultdto = (GoogleGeocodeResultDTO)((List) (obj)).get(0);
            if (googlegeocoderesultdto.formattedAddress.contains("Bicycle Route") && ((List) (obj)).size() > 1)
            {
                obj = (GoogleGeocodeResultDTO)((List) (obj)).get(1);
                if (((GoogleGeocodeResultDTO) (obj)).hasStreetNumber())
                {
                    return ((GoogleGeocodeResultDTO) (obj));
                }
            }
            return googlegeocoderesultdto;
        } else
        {
            return null;
        }
    }

    public List getResults()
    {
        return results;
    }

    public String getStatus()
    {
        return status;
    }
}
