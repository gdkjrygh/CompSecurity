// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import java.util.ArrayList;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleGeoResponseDTO

public class GooglePlacesSearchResponseDTO extends GoogleGeoResponseDTO
{

    public static final String ZERO_RESULTS = "ZERO_RESULTS";
    ArrayList results;
    private String status;

    public GooglePlacesSearchResponseDTO()
    {
        results = new ArrayList();
    }

    public ArrayList getResults()
    {
        return results;
    }

    public String getStatus()
    {
        return status;
    }
}
