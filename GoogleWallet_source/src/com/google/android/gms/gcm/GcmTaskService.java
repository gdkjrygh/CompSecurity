// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.gcm:
//            PendingCallback, TaskParams, a

public abstract class GcmTaskService extends Service
{
    final class a extends Thread
    {

        private final com.google.android.gms.gcm.a arr;
        final GcmTaskService ars;
        private final String mTag;

        public final void run()
        {
            int i = ars.onRunTask(new TaskParams(mTag));
            arr.he(i);
            GcmTaskService.a(ars, mTag);
            return;
            Object obj;
            obj;
            Log.e("GcmTaskService", (new StringBuilder("Error reporting result of operation to scheduler for ")).append(mTag).toString());
            GcmTaskService.a(ars, mTag);
            return;
            obj;
            GcmTaskService.a(ars, mTag);
            throw obj;
        }

        a(String s, IBinder ibinder)
        {
            ars = GcmTaskService.this;
            super();
            mTag = s;
            arr = com.google.android.gms.gcm.a.a.cc(ibinder);
        }
    }


    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    private final Set arp = new HashSet();
    private int arq;

    public GcmTaskService()
    {
    }

    static void a(GcmTaskService gcmtaskservice, String s)
    {
        gcmtaskservice.cu(s);
    }

    private void cu(String s)
    {
        synchronized (arp)
        {
            arp.remove(s);
            if (arp.size() == 0)
            {
                stopSelf(arq);
            }
        }
        return;
        s;
        set;
        JVM INSTR monitorexit ;
        throw s;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public abstract int onRunTask(TaskParams taskparams);

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (!"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        String s;
        android.os.Parcelable parcelable;
        s = intent.getStringExtra("tag");
        parcelable = intent.getParcelableExtra("callback");
        if (parcelable != null && (parcelable instanceof PendingCallback)) goto _L4; else goto _L3
_L3:
        Log.e("GcmTaskService", (new StringBuilder()).append(getPackageName()).append(" ").append(s).append(": Could not process request, invalid callback.").toString());
_L6:
        return 2;
_L4:
        synchronized (arp)
        {
            arp.add(s);
            stopSelf(arq);
            arq = j;
        }
        (new a(s, ((PendingCallback)parcelable).getIBinder())).start();
        return 2;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) goto _L6; else goto _L5
_L5:
        synchronized (arp)
        {
            arq = j;
            if (arp.size() == 0)
            {
                stopSelf(arq);
            }
        }
        return 2;
        exception1;
        intent;
        JVM INSTR monitorexit ;
        throw exception1;
    }
}
