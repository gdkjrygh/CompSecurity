// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package com.soundcloud.android.sync:
//            LegacySyncJob, ApiSyncerFactory, SyncStateManager

static class syncStateManager
{

    private final ApiSyncerFactory apiSyncerFactory;
    private final Context context;
    private final SyncStateManager syncStateManager;

    LegacySyncJob create(Uri uri, String s, boolean flag)
    {
        return new LegacySyncJob(context, uri, s, flag, apiSyncerFactory, syncStateManager);
    }

    (Context context1, ApiSyncerFactory apisyncerfactory, SyncStateManager syncstatemanager)
    {
        context = context1;
        apiSyncerFactory = apisyncerfactory;
        syncStateManager = syncstatemanager;
    }
}
