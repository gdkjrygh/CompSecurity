// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal:
//            gh, gn, ge, gj

class <init> extends <init>
{

    final gh Cc;

    private boolean X(int i)
    {
        Object obj = gh.em();
        obj;
        JVM INSTR monitorenter ;
        if (gh.i(Cc) == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        gh.i(Cc).(new Status(i));
        gh.b(Cc, null);
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void b(long l, int i)
    {
        com.google.android.gms.common.api. ;
        synchronized (gh.h(Cc))
        {
             = (com.google.android.gms.common.api.)gh.h(Cc).remove(Long.valueOf(l));
        }
        if ( != null)
        {
            .(new Status(i));
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void T(int i)
    {
        gh.ek().b("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
            Integer.valueOf(i)
        });
        gh.a(Cc, false);
        gh.b(Cc).set(false);
        gh.a(Cc, null);
        if (i != 0)
        {
            Cc.an(2);
        }
    }

    public void U(int i)
    {
        synchronized (gh.el())
        {
            if (gh.c(Cc) != null)
            {
                gh.c(Cc).(new <init>(new Status(i)));
                gh.a(Cc, null);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void V(int i)
    {
        X(i);
    }

    public void W(int i)
    {
        X(i);
    }

    public void a(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
    {
        gh.a(Cc, applicationmetadata);
        gh.a(Cc, applicationmetadata.getApplicationId());
        gh.b(Cc, s1);
        synchronized (gh.el())
        {
            if (gh.c(Cc) != null)
            {
                gh.c(Cc).(new <init>(new Status(0), applicationmetadata, s, s1, flag));
                gh.a(Cc, null);
            }
        }
        return;
        applicationmetadata;
        obj;
        JVM INSTR monitorexit ;
        throw applicationmetadata;
    }

    public void a(String s, double d, boolean flag)
    {
        gh.ek().b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    public void a(String s, long l)
    {
        b(l, 0);
    }

    public void a(String s, long l, int i)
    {
        b(l, i);
    }

    public void b(ge ge)
    {
        gh.ek().b("onApplicationStatusChanged", new Object[0]);
        gh.e(Cc).post(new Runnable(ge) {

            final gh._cls1 Ce;
            final ge Cg;

            public void run()
            {
                gh.a(Ce.Cc, Cg);
            }

            
            {
                Ce = gh._cls1.this;
                Cg = ge;
                super();
            }
        });
    }

    public void b(gj gj)
    {
        gh.ek().b("onDeviceStatusChanged", new Object[0]);
        gh.e(Cc).post(new Runnable(gj) {

            final gh._cls1 Ce;
            final gj Cf;

            public void run()
            {
                gh.a(Ce.Cc, Cf);
            }

            
            {
                Ce = gh._cls1.this;
                Cf = gj;
                super();
            }
        });
    }

    public void b(String s, byte abyte0[])
    {
        gh.ek().b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] {
            s, Integer.valueOf(abyte0.length)
        });
    }

    public void g(String s, String s1)
    {
        gh.ek().b("Receive (type=text, ns=%s) %s", new Object[] {
            s, s1
        });
        gh.e(Cc).post(new Runnable(s, s1) {

            final gh._cls1 Ce;
            final String Ch;
            final String zU;

            public void run()
            {
                com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
                synchronized (gh.f(Ce.Cc))
                {
                    messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)gh.f(Ce.Cc).get(zU);
                }
                if (messagereceivedcallback != null)
                {
                    messagereceivedcallback.onMessageReceived(gh.g(Ce.Cc), zU, Ch);
                    return;
                } else
                {
                    gh.ek().b("Discarded message for unknown namespace '%s'", new Object[] {
                        zU
                    });
                    return;
                }
                exception;
                map;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                Ce = gh._cls1.this;
                zU = s;
                Ch = s1;
                super();
            }
        });
    }

    public void onApplicationDisconnected(int i)
    {
        gh.a(Cc, null);
        gh.b(Cc, null);
        X(i);
        if (gh.d(Cc) != null)
        {
            gh.e(Cc).post(new Runnable(i) {

                final int Cd;
                final gh._cls1 Ce;

                public void run()
                {
                    if (gh.d(Ce.Cc) != null)
                    {
                        gh.d(Ce.Cc).onApplicationDisconnected(Cd);
                    }
                }

            
            {
                Ce = gh._cls1.this;
                Cd = i;
                super();
            }
            });
        }
    }

    _cls4.Ch(gh gh1)
    {
        Cc = gh1;
        super();
    }
}
