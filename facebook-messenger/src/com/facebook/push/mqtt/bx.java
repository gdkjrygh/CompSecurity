// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.common.executors.a;
import com.facebook.debug.log.b;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.push.mqtt:
//            bz, k, bw, MqttPushService, 
//            j

public class bx
{

    private static final Class a = com/facebook/push/mqtt/bx;
    private final Context b;
    private final a c;
    private final com.facebook.common.time.a d;
    private final bz e = new bz(this, null);
    private long f;
    private j g;
    private boolean h;
    private boolean i;
    private List j;

    public bx(Context context, a a1, com.facebook.common.time.a a2)
    {
        f = 10000L;
        j = hq.a();
        b = context;
        c = a1;
        d = a2;
    }

    private void a(IBinder ibinder)
    {
        this;
        JVM INSTR monitorenter ;
        g = com.facebook.push.mqtt.k.a(ibinder);
        i = false;
        for (ibinder = j.iterator(); ibinder.hasNext(); ((bw)ibinder.next()).a(g)) { }
        break MISSING_BLOCK_LABEL_58;
        ibinder;
        throw ibinder;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
    }

    static void a(bx bx1)
    {
        bx1.d();
    }

    static void a(bx bx1, IBinder ibinder)
    {
        bx1.a(ibinder);
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        c.b();
        flag = h;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Intent intent;
        intent = new Intent(b, com/facebook/push/mqtt/MqttPushService);
        i = true;
        if (!b.bindService(intent, e, 1))
        {
            throw new RuntimeException("Failed to bind to service");
        }
        break MISSING_BLOCK_LABEL_83;
        Object obj;
        obj;
        i = false;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        long l;
        long l1;
        h = true;
        l = d.a();
        l1 = f + l;
        l = l1 - d.a();
_L3:
        flag = i;
        if (!flag || l <= 0L)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        wait(l);
        l = d.a();
        l = l1 - l;
          goto _L3
        obj;
        Thread.currentThread().interrupt();
        throw new RuntimeException(((Throwable) (obj)));
        i = false;
          goto _L1
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = h;
        if (!flag) goto _L2; else goto _L1
_L1:
        b.unbindService(e);
_L3:
        h = false;
        g = null;
_L2:
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((bw)iterator.next()).a(null)) { }
        break MISSING_BLOCK_LABEL_85;
        Object obj;
        obj;
        throw obj;
        obj;
        com.facebook.debug.log.b.e(a, "Exception unbinding", ((Throwable) (obj)));
          goto _L3
        this;
        JVM INSTR monitorexit ;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        g = null;
        i = false;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((bw)iterator.next()).a(null)) { }
        break MISSING_BLOCK_LABEL_52;
        Exception exception;
        exception;
        throw exception;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
    }

    public bw a()
    {
        this;
        JVM INSTR monitorenter ;
        bw bw1;
        c.b();
        b();
        bw1 = new bw(this);
        bw1.a(g);
        this;
        JVM INSTR monitorexit ;
        return bw1;
        Exception exception;
        exception;
        throw exception;
    }

    void a(bw bw1)
    {
        this;
        JVM INSTR monitorenter ;
        c.b();
        j.remove(bw1);
        if (j.isEmpty())
        {
            c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        bw1;
        throw bw1;
    }

}
