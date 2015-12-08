// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmTaskService, b, d

private class  extends Thread
{

    final GcmTaskService a;
    private final String b;
    private final d c;
    private final Bundle d;

    public void run()
    {
        int i = a.a(new b(b, d));
        c.a(i);
        GcmTaskService.a(a, b);
        return;
        Object obj;
        obj;
        Log.e("GcmTaskService", (new StringBuilder()).append("Error reporting result of operation to scheduler for ").append(b).toString());
        GcmTaskService.a(a, b);
        return;
        obj;
        GcmTaskService.a(a, b);
        throw obj;
    }
}
