// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.manager;

import com.dominos.beacon.model.Beacon;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.beacon.manager:
//            BeaconManager_

class val.callback extends c
{

    final BeaconManager_ this$0;
    final Beacon val$beacon;
    final conCheckInCallback val$callback;
    final com.dominos.beacon.model.er val$order;

    public void execute()
    {
        try
        {
            BeaconManager_.access$601(BeaconManager_.this, val$order, val$beacon, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    conCheckInCallback(com.dominos.beacon.model.er er, Beacon beacon1, conCheckInCallback concheckincallback)
    {
        this$0 = final_beaconmanager_;
        val$order = er;
        val$beacon = beacon1;
        val$callback = concheckincallback;
        super(final_s, final_i, String.this);
    }
}
