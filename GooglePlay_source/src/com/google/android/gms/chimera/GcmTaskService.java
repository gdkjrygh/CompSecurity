// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.gcm.INetworkTaskCallback;
import com.google.android.gms.gcm.PendingCallback;
import com.google.android.gms.gcm.TaskParams;
import java.util.HashSet;
import java.util.Set;

public abstract class GcmTaskService extends Service
{
    private final class TaskThread extends Thread
    {

        private final INetworkTaskCallback mCallback;
        private final Bundle mExtras;
        private final String mTag;
        final GcmTaskService this$0;

        public final void run()
        {
            int i;
            Process.setThreadPriority(10);
            i = onRunTask(new TaskParams(mTag, mExtras));
            mCallback.taskFinished(i);
            GcmTaskService.access$000(GcmTaskService.this, mTag);
            return;
            Object obj;
            obj;
            Log.e("GcmTaskService", (new StringBuilder("Error reporting result of operation to scheduler for ")).append(mTag).toString());
            GcmTaskService.access$000(GcmTaskService.this, mTag);
            return;
            obj;
            GcmTaskService.access$000(GcmTaskService.this, mTag);
            throw obj;
        }

        TaskThread(String s, IBinder ibinder, Bundle bundle)
        {
            this$0 = GcmTaskService.this;
            super();
            mTag = s;
            mCallback = com.google.android.gms.gcm.INetworkTaskCallback.Stub.asInterface(ibinder);
            mExtras = bundle;
        }
    }


    private int mLatestStartId;
    private final Set mStartedTasks = new HashSet();

    public GcmTaskService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public abstract int onRunTask(TaskParams taskparams);

    public int onStartCommand(Intent intent, int i, int j)
    {
        intent.setExtrasClassLoader(com/google/android/gms/gcm/PendingCallback.getClassLoader());
        if (!"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        String s;
        android.os.Parcelable parcelable;
        Bundle bundle;
        s = intent.getStringExtra("tag");
        parcelable = intent.getParcelableExtra("callback");
        bundle = (Bundle)intent.getParcelableExtra("extras");
        if (parcelable != null && (parcelable instanceof PendingCallback)) goto _L4; else goto _L3
_L3:
        Log.e("GcmTaskService", (new StringBuilder()).append(getPackageName()).append(" ").append(s).append(": Could not process request, invalid callback.").toString());
_L6:
        return 2;
_L4:
        synchronized (mStartedTasks)
        {
            mStartedTasks.add(s);
            stopSelf(mLatestStartId);
            mLatestStartId = j;
        }
        (new TaskThread(s, ((PendingCallback)parcelable).mBinder, bundle)).start();
        return 2;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) goto _L6; else goto _L5
_L5:
        synchronized (mStartedTasks)
        {
            mLatestStartId = j;
            if (mStartedTasks.size() == 0)
            {
                stopSelf(mLatestStartId);
            }
        }
        return 2;
        exception1;
        intent;
        JVM INSTR monitorexit ;
        throw exception1;
    }


/*
    static void access$000(GcmTaskService gcmtaskservice, String s)
    {
        synchronized (gcmtaskservice.mStartedTasks)
        {
            gcmtaskservice.mStartedTasks.remove(s);
            if (gcmtaskservice.mStartedTasks.size() == 0)
            {
                gcmtaskservice.stopSelf(gcmtaskservice.mLatestStartId);
            }
        }
        return;
        gcmtaskservice;
        set;
        JVM INSTR monitorexit ;
        throw gcmtaskservice;
    }

*/
}
