// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.dbprocessor.impl;

import android.app.IntentService;
import android.content.Intent;
import android.os.PowerManager;
import android.os.Process;
import faf;
import fai;
import java.util.concurrent.TimeUnit;
import olm;

// Referenced classes of package com.google.android.apps.photos.dbprocessor.impl:
//            DatabaseProcessorReceiver

public final class DatabaseProcessorService extends IntentService
{

    private static final long a;

    public DatabaseProcessorService()
    {
        super("DatabaseProcessorService");
    }

    protected final void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        Object obj;
        Process.setThreadPriority(10);
        obj = ((PowerManager)getSystemService("power")).newWakeLock(1, "DatabaseProcessorService");
        ((android.os.PowerManager.WakeLock) (obj)).acquire(a);
        DatabaseProcessorReceiver.a(intent);
        (new faf(this, (fai)olm.a(this, fai))).a(a);
        ((android.os.PowerManager.WakeLock) (obj)).release();
        return;
        obj;
        DatabaseProcessorReceiver.a(intent);
        throw obj;
        intent;
        ((android.os.PowerManager.WakeLock) (obj)).release();
        throw intent;
    }

    static 
    {
        a = TimeUnit.MINUTES.toMillis(10L);
    }
}
