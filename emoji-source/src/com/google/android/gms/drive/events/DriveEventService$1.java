// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.content.Intent;
import android.os.Binder;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.LinkedBlockingDeque;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEventService, DriveEvent

class Ii extends Binder
{

    final DriveEventService Ii;

    protected boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Log.d("DriveEventService", "onTransact");
        parcel = (DriveEvent)parcel.readParcelable(Ii.getClassLoader());
        DriveEventService.gn().add(parcel);
        Ii.startService(new Intent(Ii, Ii.getClass()));
        return true;
    }

    (DriveEventService driveeventservice)
    {
        Ii = driveeventservice;
        super();
    }
}
