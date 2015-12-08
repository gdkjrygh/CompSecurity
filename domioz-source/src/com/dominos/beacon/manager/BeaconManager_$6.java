// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.manager;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.beacon.manager:
//            BeaconManager_

class val.callback extends c
{

    final BeaconManager_ this$0;
    final conCheckInCallback val$callback;

    public void execute()
    {
        try
        {
            BeaconManager_.access$501(BeaconManager_.this, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    conCheckInCallback(int i, String s1, conCheckInCallback concheckincallback)
    {
        this$0 = final_beaconmanager_;
        val$callback = concheckincallback;
        super(String.this, i, s1);
    }
}
