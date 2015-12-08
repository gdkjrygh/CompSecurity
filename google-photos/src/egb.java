// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.photos.autobackup.sync.SyncAutoBackupStateReceiver;
import java.util.List;

final class egb
    implements hdq
{

    private final Context a;

    public egb(Context context)
    {
        a = context;
    }

    public final void a(List list)
    {
        if (list.isEmpty())
        {
            return;
        } else
        {
            list = new Intent(a, com/google/android/apps/photos/autobackup/sync/SyncAutoBackupStateReceiver);
            list.setAction("com.google.android.apps.photos.autobackup.sync.SYNC_STATE");
            list.setPackage(a.getPackageName());
            a.sendBroadcast(list);
            return;
        }
    }
}
