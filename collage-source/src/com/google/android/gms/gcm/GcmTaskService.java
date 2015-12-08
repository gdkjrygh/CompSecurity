// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.Service;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.gcm:
//            b, d

public abstract class GcmTaskService extends Service
{
    private class zza extends Thread
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


    private final Set a = new HashSet();
    private int b;

    public GcmTaskService()
    {
    }

    static void a(GcmTaskService gcmtaskservice, String s)
    {
        gcmtaskservice.a(s);
    }

    private void a(String s)
    {
        synchronized (a)
        {
            a.remove(s);
            if (a.size() == 0)
            {
                stopSelf(b);
            }
        }
        return;
        s;
        set;
        JVM INSTR monitorexit ;
        throw s;
    }

    public abstract int a(b b1);
}
