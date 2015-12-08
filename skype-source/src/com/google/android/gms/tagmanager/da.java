// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.tagmanager:
//            b, d, ak, a

final class da
    implements com.google.android.gms.tagmanager.b
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(String s);

        public abstract String b();
    }

    private final class b extends Handler
    {

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                ak.a("Don't know how to handle this message.");
                return;

            case 1: // '\001'
                message = ((Message) (message.obj));
                break;
            }
        }
    }


    private final Looper a;
    private com.google.android.gms.tagmanager.a b;
    private com.google.android.gms.tagmanager.a c;
    private Status d;
    private b e;
    private a f;
    private boolean g;
    private d h;

    public da(Status status)
    {
        d = status;
        a = null;
    }

    public da(d d1, Looper looper, com.google.android.gms.tagmanager.a a1, a a2)
    {
        h = d1;
        if (looper == null)
        {
            looper = Looper.getMainLooper();
        }
        a = looper;
        b = a1;
        f = a2;
        d = Status.a;
        d1.a(this);
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!g) goto _L2; else goto _L1
_L1:
        ak.a("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        g = true;
        h.b(this);
        b.c();
        b = null;
        c = null;
        f = null;
        e = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = g;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b.e(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public final com.google.android.gms.tagmanager.a b()
    {
        com.google.android.gms.tagmanager.a a1 = null;
        this;
        JVM INSTR monitorenter ;
        if (!g) goto _L2; else goto _L1
_L1:
        ak.a("ContainerHolder is released.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return a1;
_L2:
        if (c != null)
        {
            b = c;
            c = null;
        }
        a1 = b;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void b(String s)
    {
        if (g)
        {
            ak.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            f.a(s);
            return;
        }
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!g) goto _L2; else goto _L1
_L1:
        ak.a("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f.a();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final String d()
    {
        if (g)
        {
            ak.a("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return b.a();
        }
    }

    final String e()
    {
        if (g)
        {
            ak.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return f.b();
        }
    }

    public final Status getStatus()
    {
        return d;
    }
}
