// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.autobackup.sync;

import android.content.Context;
import android.content.Intent;
import ez;

// Referenced classes of package com.google.android.apps.photos.autobackup.sync:
//            SyncAutoBackupStateService

public final class SyncAutoBackupStateReceiver extends ez
{

    public SyncAutoBackupStateReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        a(context, new Intent(context, com/google/android/apps/photos/autobackup/sync/SyncAutoBackupStateService));
    }
}
