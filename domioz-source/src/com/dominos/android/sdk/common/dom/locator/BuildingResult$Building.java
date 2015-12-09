// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.locator;


public class buildingName
{

    private int buildingId;
    private String buildingName;

    public int getBuildingId()
    {
        return buildingId;
    }

    public String getBuildingName()
    {
        return buildingName;
    }

    public String toString()
    {
        return buildingName;
    }

    public (int i, String s)
    {
        buildingId = i;
        buildingName = s;
    }
}
