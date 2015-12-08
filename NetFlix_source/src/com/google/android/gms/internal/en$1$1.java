// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            en, er

class zv
    implements Runnable
{

    final int zv;
    final zv zw;

    public void run()
    {
        if (en.c(zw.) != null)
        {
            en.c(zw.).onApplicationDisconnected(zv);
        }
    }

    nit>(nit> nit>, int i)
    {
        zw = nit>;
        zv = i;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/en$1

/* anonymous class */
    class en._cls1 extends eq.a
    {

        final en zu;

        private boolean D(int i)
        {
            Object obj = en.dN();
            obj;
            JVM INSTR monitorenter ;
            if (en.h(zu) == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            en.h(zu).b(new Status(i));
            en.b(zu, null);
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
            com.google.android.gms.common.api.a.d d1;
            synchronized (en.g(zu))
            {
                d1 = (com.google.android.gms.common.api.a.d)en.g(zu).remove(Long.valueOf(l));
            }
            if (d1 != null)
            {
                d1.b(new Status(i));
            }
            return;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void A(int i)
        {
            synchronized (en.dM())
            {
                if (en.b(zu) != null)
                {
                    en.b(zu).b(new en.a(new Status(i)));
                    en.a(zu, null);
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void B(int i)
        {
            D(i);
        }

        public void C(int i)
        {
            D(i);
        }

        public void a(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
        {
            en.a(zu, applicationmetadata);
            en.a(zu, applicationmetadata.getApplicationId());
            en.b(zu, s1);
            synchronized (en.dM())
            {
                if (en.b(zu) != null)
                {
                    en.b(zu).b(new en.a(new Status(0), applicationmetadata, s, s1, flag));
                    en.a(zu, null);
                }
            }
            return;
            applicationmetadata;
            obj;
            JVM INSTR monitorexit ;
            throw applicationmetadata;
        }

        public void a(String s, long l)
        {
            b(l, 0);
        }

        public void a(String s, long l, int i)
        {
            b(l, i);
        }

        public void b(String s, double d1, boolean flag)
        {
            en.d(zu).post(new en._cls1._cls2(s, d1, flag));
        }

        public void b(String s, byte abyte0[])
        {
            en.dL().b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] {
                s, Integer.valueOf(abyte0.length)
            });
        }

        public void d(String s, String s1)
        {
            en.dL().b("Receive (type=text, ns=%s) %s", new Object[] {
                s, s1
            });
            en.d(zu).post(new en._cls1._cls3(s, s1));
        }

        public void onApplicationDisconnected(int i)
        {
            en.a(zu, null);
            en.b(zu, null);
            while (D(i) || en.c(zu) == null) 
            {
                return;
            }
            en.d(zu).post(new en._cls1._cls1(this, i));
        }

        public void z(int i)
        {
            en.dL().b("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                Integer.valueOf(i)
            });
            en.a(zu, false);
            en.a(zu, null);
            if (i != 0)
            {
                zu.N(2);
            }
        }

            
            {
                zu = en1;
                super();
            }

        // Unreferenced inner class com/google/android/gms/internal/en$1$2

/* anonymous class */
        class en._cls1._cls2
            implements Runnable
        {

            final double yQ;
            final boolean yR;
            final en._cls1 zw;
            final String zx;

            public void run()
            {
                en.a(zw.zu, zx, yQ, yR);
            }

                    
                    {
                        zw = en._cls1.this;
                        zx = s;
                        yQ = d1;
                        yR = flag;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/en$1$3

/* anonymous class */
        class en._cls1._cls3
            implements Runnable
        {

            final String xN;
            final en._cls1 zw;
            final String zy;

            public void run()
            {
                com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
                synchronized (en.e(zw.zu))
                {
                    messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)en.e(zw.zu).get(xN);
                }
                if (messagereceivedcallback != null)
                {
                    messagereceivedcallback.onMessageReceived(en.f(zw.zu), xN, zy);
                    return;
                } else
                {
                    en.dL().b("Discarded message for unknown namespace '%s'", new Object[] {
                        xN
                    });
                    return;
                }
                exception;
                map;
                JVM INSTR monitorexit ;
                throw exception;
            }

                    
                    {
                        zw = en._cls1.this;
                        xN = s;
                        zy = s1;
                        super();
                    }
        }

    }

}
