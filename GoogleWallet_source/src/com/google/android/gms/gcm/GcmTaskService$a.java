// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmTaskService, TaskParams, a

final class arr extends Thread
{

    private final a arr;
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

    (GcmTaskService gcmtaskservice, String s, IBinder ibinder)
    {
        ars = gcmtaskservice;
        super();
        mTag = s;
        arr = arr(ibinder);
    }
}
