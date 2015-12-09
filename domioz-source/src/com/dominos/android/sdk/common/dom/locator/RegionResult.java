// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.locator;

import java.util.ArrayList;

public class RegionResult
{

    private ArrayList regions;
    private int status;

    public RegionResult(int i)
    {
        regions = new ArrayList();
        status = i;
    }

    public ArrayList getRegions()
    {
        return regions;
    }

    public int getStatus()
    {
        return status;
    }
}
