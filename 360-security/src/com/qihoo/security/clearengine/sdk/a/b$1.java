// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.sdk.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qihoo360.mobilesafe.support.a.f;

// Referenced classes of package com.qihoo.security.clearengine.sdk.a:
//            b

class a
    implements ServiceConnection
{

    final b a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        b.a(a, com.qihoo360.mobilesafe.support.a.a(ibinder));
        b.a(a).a(b.b(a));
        synchronized (b.a(a))
        {
            if (b.c(a))
            {
                b.a(a).notify();
                b.a(a, false);
            }
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
