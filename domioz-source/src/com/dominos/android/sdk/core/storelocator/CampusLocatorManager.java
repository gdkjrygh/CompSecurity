// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.storelocator;

import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.core.models.LabsAddress;

// Referenced classes of package com.dominos.android.sdk.core.storelocator:
//            CampusLocatorAPI

public class CampusLocatorManager extends Manager
{

    CampusLocatorAPI mCampusLocatorAPI;

    public CampusLocatorManager()
    {
    }

    public void getBuilding(int i, GetCampusLocationCallback getcampuslocationcallback)
    {
        mCampusLocatorAPI.getBuildings(i, getcampuslocationcallback);
    }

    public String getName()
    {
        return "campus_locator_manager";
    }

    public void getRegions(GetCampusLocationCallback getcampuslocationcallback)
    {
        mCampusLocatorAPI.getRegions(getcampuslocationcallback);
    }

    public void getSavedCampusLoction(LabsAddress labsaddress, GetCampusLocationCallback getcampuslocationcallback)
    {
        mCampusLocatorAPI.getSavedCampusLocation(labsaddress, getcampuslocationcallback);
    }

    public void getSites(String s, GetCampusLocationCallback getcampuslocationcallback)
    {
        mCampusLocatorAPI.getSites(s, getcampuslocationcallback);
    }

    protected void onSessionSet()
    {
    }
}
