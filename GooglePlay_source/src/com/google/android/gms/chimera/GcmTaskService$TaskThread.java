// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.gcm.INetworkTaskCallback;
import com.google.android.gms.gcm.TaskParams;

// Referenced classes of package com.google.android.gms.chimera:
//            GcmTaskService

private final class mExtras extends Thread
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

    (String s, IBinder ibinder, Bundle bundle)
    {
        this$0 = GcmTaskService.this;
        super();
        mTag = s;
        mCallback = com.google.android.gms.gcm.asInterface(ibinder);
        mExtras = bundle;
    }
}
