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
//            gi, go, gf, gk

class Ca
    implements Runnable
{

    final int Ca;
    final Ca Cb;

    public void run()
    {
        if (gi.d(Cb.) != null)
        {
            gi.d(Cb.).onApplicationDisconnected(Ca);
        }
    }

    nit>(nit> nit>, int i)
    {
        Cb = nit>;
        Ca = i;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/gi$1

/* anonymous class */
    class gi._cls1 extends gn.a
    {

        final gi BZ;

        private boolean X(int i)
        {
            Object obj = gi.eh();
            obj;
            JVM INSTR monitorenter ;
            if (gi.i(BZ) == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            gi.i(BZ).a(new Status(i));
            gi.b(BZ, null);
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
            com.google.android.gms.common.api.a.d d;
            synchronized (gi.h(BZ))
            {
                d = (com.google.android.gms.common.api.a.d)gi.h(BZ).remove(Long.valueOf(l));
            }
            if (d != null)
            {
                d.a(new Status(i));
            }
            return;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void T(int i)
        {
            gi.ef().b("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                Integer.valueOf(i)
            });
            gi.a(BZ, false);
            gi.b(BZ).set(false);
            gi.a(BZ, null);
            if (i != 0)
            {
                BZ.an(2);
            }
        }

        public void U(int i)
        {
            synchronized (gi.eg())
            {
                if (gi.c(BZ) != null)
                {
                    gi.c(BZ).a(new gi.a(new Status(i)));
                    gi.a(BZ, null);
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
            gi.a(BZ, applicationmetadata);
            gi.a(BZ, applicationmetadata.getApplicationId());
            gi.b(BZ, s1);
            synchronized (gi.eg())
            {
                if (gi.c(BZ) != null)
                {
                    gi.c(BZ).a(new gi.a(new Status(0), applicationmetadata, s, s1, flag));
                    gi.a(BZ, null);
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
            gi.ef().b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
        }

        public void a(String s, long l)
        {
            b(l, 0);
        }

        public void a(String s, long l, int i)
        {
            b(l, i);
        }

        public void b(gf gf)
        {
            gi.ef().b("onApplicationStatusChanged", new Object[0]);
            gi.e(BZ).post(new gi._cls1._cls3(gf));
        }

        public void b(gk gk)
        {
            gi.ef().b("onDeviceStatusChanged", new Object[0]);
            gi.e(BZ).post(new gi._cls1._cls2(gk));
        }

        public void b(String s, byte abyte0[])
        {
            gi.ef().b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] {
                s, Integer.valueOf(abyte0.length)
            });
        }

        public void g(String s, String s1)
        {
            gi.ef().b("Receive (type=text, ns=%s) %s", new Object[] {
                s, s1
            });
            gi.e(BZ).post(new gi._cls1._cls4(s, s1));
        }

        public void onApplicationDisconnected(int i)
        {
            gi.a(BZ, null);
            gi.b(BZ, null);
            X(i);
            if (gi.d(BZ) != null)
            {
                gi.e(BZ).post(new gi._cls1._cls1(this, i));
            }
        }

            
            {
                BZ = gi1;
                super();
            }

        // Unreferenced inner class com/google/android/gms/internal/gi$1$2

/* anonymous class */
        class gi._cls1._cls2
            implements Runnable
        {

            final gi._cls1 Cb;
            final gk Cc;

            public void run()
            {
                gi.a(Cb.BZ, Cc);
            }

                    
                    {
                        Cb = gi._cls1.this;
                        Cc = gk;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/gi$1$3

/* anonymous class */
        class gi._cls1._cls3
            implements Runnable
        {

            final gi._cls1 Cb;
            final gf Cd;

            public void run()
            {
                gi.a(Cb.BZ, Cd);
            }

                    
                    {
                        Cb = gi._cls1.this;
                        Cd = gf;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/gi$1$4

/* anonymous class */
        class gi._cls1._cls4
            implements Runnable
        {

            final gi._cls1 Cb;
            final String Ce;
            final String zR;

            public void run()
            {
                com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
                synchronized (gi.f(Cb.BZ))
                {
                    messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)gi.f(Cb.BZ).get(zR);
                }
                if (messagereceivedcallback != null)
                {
                    messagereceivedcallback.onMessageReceived(gi.g(Cb.BZ), zR, Ce);
                    return;
                } else
                {
                    gi.ef().b("Discarded message for unknown namespace '%s'", new Object[] {
                        zR
                    });
                    return;
                }
                exception;
                map;
                JVM INSTR monitorexit ;
                throw exception;
            }

                    
                    {
                        Cb = gi._cls1.this;
                        zR = s;
                        Ce = s1;
                        super();
                    }
        }

    }

}
