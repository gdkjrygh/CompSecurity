// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qihoo360.mobilesafe.support.a.f;
import com.qihoo360.mobilesafe.support.a.i;

// Referenced classes of package com.qihoo360.mobilesafe.support:
//            a

class b
    implements ServiceConnection
{

    private final Object a[];
    private final i b;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = com.qihoo360.mobilesafe.support.a.a(ibinder);
        ibinder = new f();
        ibinder.a(componentname);
        a[0] = ibinder;
        synchronized (b)
        {
            b.a();
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

    a(Object aobj[], i j)
    {
        a = aobj;
        b = j;
        super();
    }
}
