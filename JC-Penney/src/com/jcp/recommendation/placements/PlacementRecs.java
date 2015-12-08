// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.recommendation.placements;

import java.util.List;

public class PlacementRecs
{

    private List placements;
    private String status;

    public PlacementRecs()
    {
    }

    public List getPlacements()
    {
        return placements;
    }

    public String getStatus()
    {
        return status;
    }

    public void setPlacements(List list)
    {
        placements = list;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public String toString()
    {
        return String.format("ClassPojo [placements = %s, status = %s]", new Object[] {
            placements, status
        });
    }
}
