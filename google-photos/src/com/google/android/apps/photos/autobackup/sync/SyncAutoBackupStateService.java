// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.autobackup.sync;

import android.app.IntentService;
import android.content.Intent;
import ega;
import java.util.Iterator;
import java.util.List;
import mmv;
import mmy;
import noy;
import noz;
import olm;

// Referenced classes of package com.google.android.apps.photos.autobackup.sync:
//            SyncAutoBackupStateReceiver

public final class SyncAutoBackupStateService extends IntentService
{

    public SyncAutoBackupStateService()
    {
        super("SyncAutoBackupStateService");
    }

    protected final void onHandleIntent(Intent intent)
    {
        android.content.Context context;
        noz noz1;
        noz noz2;
        ega ega1;
        Iterator iterator;
        long l;
        context = getApplicationContext();
        noz1 = noz.a(context, 3, "SyncAutoBackupService", new String[0]);
        noz2 = noz.a(context, "SyncAutoBackupService", new String[0]);
        l = noy.a();
        ega1 = (ega)olm.a(context, ega);
        iterator = ((mmv)olm.a(context, mmv)).a(new String[] {
            "logged_in"
        }).iterator();
_L1:
        int i;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_141;
        }
        i = ((Integer)iterator.next()).intValue();
        ega1.a(context, i, 30);
          goto _L1
        mmy mmy1;
        mmy1;
        if (!noz2.a()) goto _L1; else goto _L2
_L2:
        noy.a(i);
          goto _L1
        Exception exception;
        exception;
        SyncAutoBackupStateReceiver.a(intent);
        throw exception;
        if (noz1.a())
        {
            noy.a("duration", l);
        }
        SyncAutoBackupStateReceiver.a(intent);
        return;
    }
}
