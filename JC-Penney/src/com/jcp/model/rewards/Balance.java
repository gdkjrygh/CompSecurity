// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.rewards;


public class Balance
{

    private Integer certificates;
    private Integer perks;
    private Integer points;
    private Integer pointsAway;

    public Balance()
    {
    }

    public Integer getCertificates()
    {
        return certificates;
    }

    public Integer getPerks()
    {
        return perks;
    }

    public Integer getPoints()
    {
        return points;
    }

    public Integer getPointsAway()
    {
        return pointsAway;
    }

    public void setCertificates(Integer integer)
    {
        certificates = integer;
    }

    public void setPerks(Integer integer)
    {
        perks = integer;
    }

    public void setPoints(Integer integer)
    {
        points = integer;
    }

    public void setPointsAway(Integer integer)
    {
        pointsAway = integer;
    }
}
