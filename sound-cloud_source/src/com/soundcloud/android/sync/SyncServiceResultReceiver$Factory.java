// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.Context;
import android.content.SyncResult;
import com.soundcloud.android.stream.SoundStreamSyncOperations;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncServiceResultReceiver, SyncStateManager

public static class syncStateManager
{

    private final Context context;
    private final SoundStreamSyncOperations soundStreamSyncOps;
    private final SyncStateManager syncStateManager;

    public SyncServiceResultReceiver create(SyncResult syncresult, Listener listener)
    {
        return new SyncServiceResultReceiver(context, soundStreamSyncOps, syncStateManager, syncresult, listener, null);
    }

    public Listener(Context context1, SoundStreamSyncOperations soundstreamsyncoperations, SyncStateManager syncstatemanager)
    {
        context = context1;
        soundStreamSyncOps = soundstreamsyncoperations;
        syncStateManager = syncstatemanager;
    }
}
