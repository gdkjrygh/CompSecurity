// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.config.GservicesValue;

// Referenced classes of package com.google.android.gms.games.service:
//            GamesSyncAdapter

public final class PlayGamesSyncServiceNotification extends Service
{

    private static GamesSyncAdapter sSyncAdapter = null;
    private static final Object sSyncAdapterLock = new Object();

    public PlayGamesSyncServiceNotification()
    {
    }

    public final IBinder onBind(Intent intent)
    {
        return sSyncAdapter.getSyncAdapterBinder();
    }

    public final void onCreate()
    {
        GservicesValue.init(getApplicationContext());
        synchronized (sSyncAdapterLock)
        {
            if (sSyncAdapter == null)
            {
                sSyncAdapter = new GamesSyncAdapter(getApplicationContext());
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
