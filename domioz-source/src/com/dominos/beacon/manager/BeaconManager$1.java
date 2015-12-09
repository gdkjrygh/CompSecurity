// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.manager;

import com.dominos.beacon.model.Beacon;

// Referenced classes of package com.dominos.beacon.manager:
//            BeaconManager

class val.beacon
    implements com.dominos.loader.r.SetupLoadCallback
{

    final BeaconManager this$0;
    final Beacon val$beacon;

    public void onSetupFailure(int i, String s)
    {
    }

    public void onSetupSuccess()
    {
        loadOrder(val$beacon);
    }

    oadCallback()
    {
        this$0 = final_beaconmanager;
        val$beacon = Beacon.this;
        super();
    }
}
