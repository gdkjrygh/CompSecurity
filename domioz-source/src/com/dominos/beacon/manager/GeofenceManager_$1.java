// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.manager;

import java.util.List;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.beacon.manager:
//            GeofenceManager_

class val.callback extends c
{

    final GeofenceManager_ this$0;
    final fenceCallback val$callback;
    final List val$geofenceDataList;

    public void execute()
    {
        try
        {
            GeofenceManager_.access$001(GeofenceManager_.this, val$geofenceDataList, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    fenceCallback(String s1, List list, fenceCallback fencecallback)
    {
        this$0 = final_geofencemanager_;
        val$geofenceDataList = list;
        val$callback = fencecallback;
        super(final_s, I.this, s1);
    }
}
