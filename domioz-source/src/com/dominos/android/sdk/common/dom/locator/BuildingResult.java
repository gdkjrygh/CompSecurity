// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.locator;

import java.util.ArrayList;

public class BuildingResult
{

    private ArrayList buildings;
    private int siteId;
    private int status;

    public BuildingResult(int i, int j)
    {
        buildings = new ArrayList();
        status = i;
        siteId = j;
    }

    public ArrayList getBuildings()
    {
        return buildings;
    }

    public int getSiteId()
    {
        return siteId;
    }

    public int getStatus()
    {
        return status;
    }
}
