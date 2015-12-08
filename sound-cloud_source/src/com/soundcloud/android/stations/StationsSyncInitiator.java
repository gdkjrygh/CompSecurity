// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.Context;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.sync.SyncStateManager;
import rx.b;

public class StationsSyncInitiator extends SyncInitiator
{

    public static final String TYPE = "STATIONS";

    StationsSyncInitiator(Context context, AccountOperations accountoperations, SyncStateManager syncstatemanager)
    {
        super(context, accountoperations, syncstatemanager);
    }

    b syncRecentStations()
    {
        return requestSyncObservable("STATIONS", "syncStations");
    }
}
