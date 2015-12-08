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

final class jwj extends jwv
{

    final AtomicReference a;
    private final Handler b;

    public jwj(jwh jwh1)
    {
        a = new AtomicReference(jwh1);
        b = new Handler(((kbo) (jwh1)).g);
    }

    private static void a(jwh jwh1, long l, int i)
    {
        synchronized (jwh.f(jwh1))
        {
            jwh1 = (jzc)jwh.f(jwh1).remove(Long.valueOf(l));
        }
        if (jwh1 != null)
        {
            jwh1.a(new Status(i));
        }
        return;
        jwh1;
        map;
        JVM INSTR monitorexit ;
        throw jwh1;
    }

    private static boolean a(jwh jwh1, int i)
    {
        Object obj = jwh.i();
        obj;
        JVM INSTR monitorenter ;
        if (jwh.g(jwh1) == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        jwh.g(jwh1).a(new Status(i));
        jwh.b(jwh1, null);
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        jwh1;
        obj;
        JVM INSTR monitorexit ;
        throw jwh1;
    }

    public final jwh a()
    {
        jwh jwh1 = (jwh)a.getAndSet(null);
        if (jwh1 == null)
        {
            return null;
        } else
        {
            jwh.a(jwh1);
            return jwh1;
        }
    }

    public final void a(int i)
    {
        jwh jwh1 = a();
        if (jwh1 != null)
        {
            jwh.g().a("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                Integer.valueOf(i)
            });
            if (i != 0)
            {
                jwh1.a(2);
                return;
            }
        }
    }

    public final void a(long l)
    {
        jwh jwh1 = (jwh)a.get();
        if (jwh1 == null)
        {
            return;
        } else
        {
            a(jwh1, l, 0);
            return;
        }
    }

    public final void a(long l, int i)
    {
        jwh jwh1 = (jwh)a.get();
        if (jwh1 == null)
        {
            return;
        } else
        {
            a(jwh1, l, i);
            return;
        }
    }

    public final void a(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
    {
        jwh jwh1 = (jwh)a.get();
        if (jwh1 == null)
        {
            return;
        }
        jwh.a(jwh1, applicationmetadata);
        jwh.a(jwh1, applicationmetadata.b);
        jwh.b(jwh1, s1);
        synchronized (jwh.h())
        {
            if (jwh.b(jwh1) != null)
            {
                jwh.b(jwh1).a(new jwi(new Status(0), applicationmetadata, s, s1, flag));
                jwh.a(jwh1, null);
            }
        }
        return;
        applicationmetadata;
        obj;
        JVM INSTR monitorexit ;
        throw applicationmetadata;
    }

    public final void a(ApplicationStatus applicationstatus)
    {
        jwh jwh1 = (jwh)a.get();
        if (jwh1 == null)
        {
            return;
        } else
        {
            jwh.g().a("onApplicationStatusChanged", new Object[0]);
            b.post(new jwm(this, jwh1, applicationstatus));
            return;
        }
    }

    public final void a(DeviceStatus devicestatus)
    {
        jwh jwh1 = (jwh)a.get();
        if (jwh1 == null)
        {
            return;
        } else
        {
            jwh.g().a("onDeviceStatusChanged", new Object[0]);
            b.post(new jwl(this, jwh1, devicestatus));
            return;
        }
    }

    public final void a(String s, String s1)
    {
        jwh jwh1 = (jwh)a.get();
        if (jwh1 == null)
        {
            return;
        } else
        {
            jwh.g().a("Receive (type=text, ns=%s) %s", new Object[] {
                s, s1
            });
            b.post(new jwn(this, jwh1, s, s1));
            return;
        }
    }

    public final void a(String s, byte abyte0[])
    {
        if ((jwh)a.get() == null)
        {
            return;
        } else
        {
            jwh.g().a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] {
                s, Integer.valueOf(abyte0.length)
            });
            return;
        }
    }

    public final void b()
    {
        jwh.g().a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    public final void b(int i)
    {
        jwh jwh1 = (jwh)a.get();
        if (jwh1 == null)
        {
            return;
        }
        synchronized (jwh.h())
        {
            if (jwh.b(jwh1) != null)
            {
                jwh.b(jwh1).a(new jwi(new Status(i)));
                jwh.a(jwh1, null);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c(int i)
    {
        jwh jwh1 = (jwh)a.get();
        if (jwh1 == null)
        {
            return;
        } else
        {
            a(jwh1, i);
            return;
        }
    }

    public final void d(int i)
    {
        jwh jwh1 = (jwh)a.get();
        if (jwh1 == null)
        {
            return;
        } else
        {
            a(jwh1, i);
            return;
        }
    }

    public final void e(int i)
    {
        jwh jwh1 = (jwh)a.get();
        if (jwh1 != null)
        {
            jwh.a(jwh1, null);
            jwh.b(jwh1, null);
            a(jwh1, i);
            if (jwh.c(jwh1) != null)
            {
                b.post(new jwk(this, jwh1, i));
                return;
            }
        }
    }
}
