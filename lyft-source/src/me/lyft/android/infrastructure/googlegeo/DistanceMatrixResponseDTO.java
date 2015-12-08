// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import java.util.ArrayList;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleGeoResponseDTO

public class DistanceMatrixResponseDTO extends GoogleGeoResponseDTO
{

    public static final String OK = "OK";
    public static final String OVER_QUERY_LIMIT = "OVER_QUERY_LIMIT";
    public ArrayList rows;
    public String status;

    public DistanceMatrixResponseDTO()
    {
        rows = new ArrayList();
    }

    public ArrayList getRows()
    {
        return rows;
    }

    public String getStatus()
    {
        return status;
    }
}
