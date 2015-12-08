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
    final conOrderListCallback val$callback;

    public void execute()
    {
        try
        {
            BeaconManager_.access$401(BeaconManager_.this, val$beacon, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    conOrderListCallback(String s1, Beacon beacon1, conOrderListCallback conorderlistcallback)
    {
        this$0 = final_beaconmanager_;
        val$beacon = beacon1;
        val$callback = conorderlistcallback;
        super(final_s, I.this, s1);
    }
}
