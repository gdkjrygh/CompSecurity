// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.tagmanager:
//            b, s, a, I, 
//            g

final class X
    implements com.google.android.gms.tagmanager.b
{
    public static interface a
    {

        public abstract String a();
    }

    private final class b extends Handler
    {

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                s.a();
                return;

            case 1: // '\001'
                message = ((Message) (message.obj));
                break;
            }
        }
    }


    a a;
    boolean b;
    private com.google.android.gms.tagmanager.a c;
    private com.google.android.gms.tagmanager.a d;
    private Status e;
    private b f;
    private g g;

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (b)
        {
            s.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c.a().a(s1);
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    final String b()
    {
        if (b)
        {
            s.a();
            return "";
        } else
        {
            return c.a;
        }
    }

    final void c()
    {
        if (b)
        {
            s.a();
        }
    }

    public final Status getStatus()
    {
        return e;
    }

    public final void release()
    {
        this;
        JVM INSTR monitorenter ;
        if (!b) goto _L2; else goto _L1
_L1:
        s.a();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b = true;
        g.b.remove(this);
        c.b = null;
        c = null;
        d = null;
        a = null;
        f = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
