// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.util:
//            z

static final class it>
    implements Runnable
{

    final Intent a;
    final Object b;

    public void run()
    {
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcastSync(a);
        synchronized (b)
        {
            b.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    nt(Intent intent, Object obj)
    {
        a = intent;
        b = obj;
        super();
    }
}
