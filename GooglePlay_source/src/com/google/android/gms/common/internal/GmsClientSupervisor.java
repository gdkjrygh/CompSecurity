// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClientSupervisorImpl

public abstract class GmsClientSupervisor
{

    private static GmsClientSupervisor sInstance;
    private static final Object sSingletonLock = new Object();

    public GmsClientSupervisor()
    {
    }

    public static GmsClientSupervisor getInstance(Context context)
    {
        synchronized (sSingletonLock)
        {
            if (sInstance == null)
            {
                sInstance = new GmsClientSupervisorImpl(context.getApplicationContext());
            }
        }
        return sInstance;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public abstract boolean bindService(ComponentName componentname, ServiceConnection serviceconnection, String s);

    public abstract boolean bindService(String s, ServiceConnection serviceconnection, String s1);

    public abstract void unbindService(ComponentName componentname, ServiceConnection serviceconnection, String s);

    public abstract void unbindService(String s, ServiceConnection serviceconnection, String s1);

}
