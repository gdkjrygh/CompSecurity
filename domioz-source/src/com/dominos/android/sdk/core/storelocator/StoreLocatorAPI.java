// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.storelocator;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.dom.locator.LocatorResult;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.data.http.power.PowerRestClient;

public class StoreLocatorAPI
{

    PowerRestClient mPower;

    public StoreLocatorAPI()
    {
    }

    public LocatorResult getStores(LabsAddress labsaddress)
    {
        String s = labsaddress.getStreet();
        labsaddress = labsaddress.getCityRegionLine();
        return mPower.locateStores(s, labsaddress);
    }

    public LocatorResult getStoresByBuilding(LabsAddress labsaddress)
    {
        int i;
        try
        {
            i = Integer.parseInt(labsaddress.getBuildingId());
        }
        // Misplaced declaration of an exception variable
        catch (LabsAddress labsaddress)
        {
            LogUtil.e("Error With BuildingId", labsaddress.getMessage(), labsaddress, new Object[0]);
            return null;
        }
        return mPower.getStores(i, labsaddress.getUnitNumber());
    }
}
