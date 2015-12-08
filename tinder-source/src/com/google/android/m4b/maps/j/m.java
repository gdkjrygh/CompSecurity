// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.j:
//            x

public final class m
    implements android.os.Handler.Callback
{
    public static interface a
    {

        public abstract boolean e();
    }


    public final a a;
    public final ArrayList b = new ArrayList();
    public ArrayList c;
    public final ArrayList d = new ArrayList();
    public volatile boolean e;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g;
    public final Handler h;
    public final Object i = new Object();

    public m(Looper looper, a a1)
    {
        c = new ArrayList();
        e = false;
        g = false;
        a = a1;
        h = new Handler(looper, this);
    }

    public final void a()
    {
        e = false;
        f.incrementAndGet();
    }

    public final void a(com.google.android.m4b.maps.h.d.b b1)
    {
        x.a(b1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!b.contains(b1))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        String s = String.valueOf(b1);
        Log.w("GmsClientEvents", (new StringBuilder(String.valueOf(s).length() + 62)).append("registerConnectionCallbacks(): listener ").append(s).append(" is already registered").toString());
_L2:
        if (a.e())
        {
            h.sendMessage(h.obtainMessage(1, b1));
        }
        return;
        b.add(b1);
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void a(com.google.android.m4b.maps.h.d.d d1)
    {
        x.a(d1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!d.contains(d1))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        d1 = String.valueOf(d1);
        Log.w("GmsClientEvents", (new StringBuilder(String.valueOf(d1).length() + 67)).append("registerConnectionFailedListener(): listener ").append(d1).append(" is already registered").toString());
_L2:
        return;
        d.add(d1);
        if (true) goto _L2; else goto _L1
_L1:
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            com.google.android.m4b.maps.h.d.b b1 = (com.google.android.m4b.maps.h.d.b)message.obj;
            synchronized (i)
            {
                if (e && a.e() && b.contains(b1))
                {
                    b1.a(null);
                }
            }
            return true;
        } else
        {
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
            return false;
        }
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
