// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import java.util.ArrayList;
import java.util.List;

public class GoogleRouteDTO
{

    List legs;
    private OverviewPolyLine overviewPolyline;
    private String summary;

    public GoogleRouteDTO()
    {
        legs = new ArrayList();
    }

    public List getLegs()
    {
        return legs;
    }

    public OverviewPolyLine getOverviewPolyline()
    {
        return overviewPolyline;
    }

    public String getSummary()
    {
        return summary;
    }
}
