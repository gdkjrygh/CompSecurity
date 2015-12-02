// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import com.qihoo.security.booster.b;
import com.qihoo.security.opti.a.a;
import java.util.List;

// Referenced classes of package com.qihoo.security.app:
//            a

private class b extends b
    implements ServiceConnection
{

    final com.qihoo.security.app.a a;

    public void a(List list)
    {
        synchronized (a.a)
        {
            a.a.a = list;
        }
        obj = com.qihoo.security.opti.a.a.a(list);
        synchronized (a.a)
        {
            if (a.a.a != null)
            {
                a.a.b = ((java.util.Map) (obj));
                a.a.c = SystemClock.elapsedRealtime();
                obj = Message.obtain(com.qihoo.security.app.a.b(a), 0, a.a);
                com.qihoo.security.app.a.b(a).sendMessage(((Message) (obj)));
            }
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a_(int i, int j)
    {
        Message message = Message.obtain(com.qihoo.security.app.a.b(a), 1, i, j);
        com.qihoo.security.app.a.b(a).sendMessage(message);
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = Message.obtain(com.qihoo.security.app.a.a(a), 1, ibinder);
        com.qihoo.security.app.a.a(a).sendMessage(componentname);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        com.qihoo.security.app.a.a(a).sendEmptyMessage(2);
    }

    me(com.qihoo.security.app.a a1)
    {
        a = a1;
        super(com.qihoo.security.app.a.a(a1));
    }
}
