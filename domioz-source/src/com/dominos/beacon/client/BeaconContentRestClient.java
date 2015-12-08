// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.client;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.beacon.data.http.BeaconContentInterface;
import com.dominos.beacon.model.BeaconConfig;

public class BeaconContentRestClient
{

    private static final String TAG = com/dominos/beacon/client/BeaconContentRestClient.getSimpleName();
    BeaconContentInterface mBeaconContentInterface;

    public BeaconContentRestClient()
    {
    }

    public BeaconConfig getBeaconConfiguration(String s)
    {
        try
        {
            s = mBeaconContentInterface.getBeaconConfiguration(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e(TAG, s.getMessage(), new Object[0]);
            return null;
        }
        return s;
    }

}
