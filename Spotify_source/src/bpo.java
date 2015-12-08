// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

final class bpo extends bpw
{

    final AtomicReference a;
    private final Handler b;

    public bpo(bpm bpm1)
    {
        a = new AtomicReference(bpm1);
        b = new Handler(((bsc) (bpm1)).g);
    }

    private static void a(bpm bpm1, long l, int i)
    {
        synchronized (bpm.g(bpm1))
        {
            bpm1 = (clv)bpm.g(bpm1).remove(Long.valueOf(l));
        }
        if (bpm1 != null)
        {
            bpm1.a(new Status(i));
        }
        return;
        bpm1;
        map;
        JVM INSTR monitorexit ;
        throw bpm1;
    }

    private static boolean e()
    {
        synchronized (bpm.i())
        {
            bpm.j();
        }
        return false;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final bpm a()
    {
        bpm bpm1 = (bpm)a.getAndSet(null);
        if (bpm1 == null)
        {
            return null;
        } else
        {
            bpm.a(bpm1);
            return bpm1;
        }
    }

    public final void a(int i)
    {
        bpm bpm1 = a();
        if (bpm1 != null)
        {
            bpm.g().a("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                Integer.valueOf(i)
            });
            if (i != 0)
            {
                bpm1.a(2);
                return;
            }
        }
    }

    public final void a(long l)
    {
        bpm bpm1 = (bpm)a.get();
        if (bpm1 == null)
        {
            return;
        } else
        {
            a(bpm1, l, 0);
            return;
        }
    }

    public final void a(long l, int i)
    {
        bpm bpm1 = (bpm)a.get();
        if (bpm1 == null)
        {
            return;
        } else
        {
            a(bpm1, l, i);
            return;
        }
    }

    public final void a(ApplicationMetadata applicationmetadata, String s, boolean flag)
    {
        bpm bpm1 = (bpm)a.get();
        if (bpm1 == null)
        {
            return;
        }
        bpm.a(bpm1, applicationmetadata);
        bpm.a(bpm1, applicationmetadata.b);
        bpm.b(bpm1, s);
        synchronized (bpm.h())
        {
            if (bpm.b(bpm1) != null)
            {
                bpm.b(bpm1).a(new bpn(new Status(0), applicationmetadata, flag));
                bpm.c(bpm1);
            }
        }
        return;
        applicationmetadata;
        s;
        JVM INSTR monitorexit ;
        throw applicationmetadata;
    }

    public final void a(ApplicationStatus applicationstatus)
    {
        bpm bpm1 = (bpm)a.get();
        if (bpm1 == null)
        {
            return;
        } else
        {
            bpm.g().a("onApplicationStatusChanged", new Object[0]);
            b.post(new Runnable(bpm1, applicationstatus) {

                private bpm a;
                private ApplicationStatus b;

                public final void run()
                {
                    bpm.a(a, b);
                }

            
            {
                a = bpm1;
                b = applicationstatus;
                super();
            }
            });
            return;
        }
    }

    public final void a(DeviceStatus devicestatus)
    {
        bpm bpm1 = (bpm)a.get();
        if (bpm1 == null)
        {
            return;
        } else
        {
            bpm.g().a("onDeviceStatusChanged", new Object[0]);
            b.post(new Runnable(bpm1, devicestatus) {

                private bpm a;
                private DeviceStatus b;

                public final void run()
                {
                    bpm.a(a, b);
                }

            
            {
                a = bpm1;
                b = devicestatus;
                super();
            }
            });
            return;
        }
    }

    public final void a(String s, String s1)
    {
        bpm bpm1 = (bpm)a.get();
        if (bpm1 == null)
        {
            return;
        } else
        {
            bpm.g().a("Receive (type=text, ns=%s) %s", new Object[] {
                s, s1
            });
            b.post(new Runnable(bpm1, s, s1) {

                private bpm a;
                private String b;
                private String c;

                public final void run()
                {
                    boo boo1;
                    synchronized (bpm.e(a))
                    {
                        boo1 = (boo)bpm.e(a).get(b);
                    }
                    if (boo1 != null)
                    {
                        boo1.a(bpm.f(a), c);
                        return;
                    } else
                    {
                        bpm.g().a("Discarded message for unknown namespace '%s'", new Object[] {
                            b
                        });
                        return;
                    }
                    exception;
                    map;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                a = bpm1;
                b = s;
                c = s1;
                super();
            }
            });
            return;
        }
    }

    public final void a(String s, byte abyte0[])
    {
        if ((bpm)a.get() == null)
        {
            return;
        } else
        {
            bpm.g().a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] {
                s, Integer.valueOf(abyte0.length)
            });
            return;
        }
    }

    public final void b()
    {
        if ((bpm)a.get() == null)
        {
            return;
        } else
        {
            e();
            return;
        }
    }

    public final void b(int i)
    {
        bpm bpm1 = (bpm)a.get();
        if (bpm1 == null)
        {
            return;
        }
        synchronized (bpm.h())
        {
            if (bpm.b(bpm1) != null)
            {
                bpm.b(bpm1).a(new bpn(new Status(i)));
                bpm.c(bpm1);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        if ((bpm)a.get() == null)
        {
            return;
        } else
        {
            e();
            return;
        }
    }

    public final void c(int i)
    {
        bpm bpm1 = (bpm)a.get();
        if (bpm1 != null)
        {
            bpm.a(bpm1, null);
            bpm.b(bpm1, null);
            e();
            if (bpm.d(bpm1) != null)
            {
                b.post(new Runnable(bpm1, i) {

                    private bpm a;
                    private int b;

                    public final void run()
                    {
                        if (bpm.d(a) != null)
                        {
                            bpm.d(a).a(b);
                        }
                    }

            
            {
                a = bpm1;
                b = i;
                super();
            }
                });
                return;
            }
        }
    }

    public final void d()
    {
        bpm.g().a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }
}
