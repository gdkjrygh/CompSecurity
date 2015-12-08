// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleGeoResponseDTO

public class GoogleDirectionsResponseDTO extends GoogleGeoResponseDTO
{

    List routes;
    private String status;

    public GoogleDirectionsResponseDTO()
    {
        routes = new ArrayList();
    }

    public List getRoutes()
    {
        return routes;
    }

    public String getStatus()
    {
        return status;
    }
}
