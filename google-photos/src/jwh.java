// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class jwh extends kbo
{

    private static final Object B = new Object();
    private static final Object C = new Object();
    private static final jwx k = new jwx("CastClientImpl");
    private jzc A;
    public final Map a = new HashMap();
    public boolean b;
    public double c;
    public final AtomicLong d = new AtomicLong(0L);
    public final Map e = new HashMap();
    private ApplicationMetadata l;
    private final CastDevice m;
    private final juo n;
    private final long o;
    private jwj p;
    private String q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private String w;
    private String x;
    private Bundle y;
    private jzc z;

    public jwh(Context context, Looper looper, kax kax, CastDevice castdevice, long l1, juo juo, 
            jyq jyq, jys jys)
    {
        super(context, looper, 10, kax, jyq, jys);
        m = castdevice;
        n = juo;
        o = l1;
        q();
    }

    static ApplicationMetadata a(jwh jwh1, ApplicationMetadata applicationmetadata)
    {
        jwh1.l = applicationmetadata;
        return applicationmetadata;
    }

    static String a(jwh jwh1, String s1)
    {
        jwh1.w = s1;
        return s1;
    }

    static jzc a(jwh jwh1, jzc jzc1)
    {
        jwh1.z = null;
        return null;
    }

    static void a(jwh jwh1)
    {
        jwh1.q();
    }

    static void a(jwh jwh1, ApplicationStatus applicationstatus)
    {
        applicationstatus = applicationstatus.b;
        boolean flag;
        if (!jwo.a(applicationstatus, jwh1.q))
        {
            jwh1.q = applicationstatus;
            flag = true;
        } else
        {
            flag = false;
        }
        k.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(jwh1.r)
        });
        jwh1.r = false;
    }

    static void a(jwh jwh1, DeviceStatus devicestatus)
    {
        ApplicationMetadata applicationmetadata = devicestatus.e;
        if (!jwo.a(applicationmetadata, jwh1.l))
        {
            jwh1.l = applicationmetadata;
        }
        double d1 = devicestatus.b;
        int j;
        boolean flag;
        boolean flag1;
        if (d1 != (0.0D / 0.0D) && Math.abs(d1 - jwh1.c) > 9.9999999999999995E-08D)
        {
            jwh1.c = d1;
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = devicestatus.c;
        if (flag1 != jwh1.b)
        {
            jwh1.b = flag1;
            flag = true;
        }
        k.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(jwh1.s)
        });
        j = devicestatus.d;
        if (j != jwh1.u)
        {
            jwh1.u = j;
            flag = true;
        } else
        {
            flag = false;
        }
        k.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(jwh1.s)
        });
        j = devicestatus.f;
        if (j != jwh1.v)
        {
            jwh1.v = j;
            flag = true;
        } else
        {
            flag = false;
        }
        k.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(jwh1.s)
        });
        jwh1.s = false;
    }

    static String b(jwh jwh1, String s1)
    {
        jwh1.x = s1;
        return s1;
    }

    static jzc b(jwh jwh1)
    {
        return jwh1.z;
    }

    static jzc b(jwh jwh1, jzc jzc1)
    {
        jwh1.A = null;
        return null;
    }

    static juo c(jwh jwh1)
    {
        return jwh1.n;
    }

    static Map d(jwh jwh1)
    {
        return jwh1.a;
    }

    static CastDevice e(jwh jwh1)
    {
        return jwh1.m;
    }

    static Map f(jwh jwh1)
    {
        return jwh1.e;
    }

    static jwx g()
    {
        return k;
    }

    static jzc g(jwh jwh1)
    {
        return jwh1.A;
    }

    static Object h()
    {
        return B;
    }

    static Object i()
    {
        return C;
    }

    private void q()
    {
        t = false;
        u = -1;
        v = -1;
        l = null;
        q = null;
        c = 0.0D;
        b = false;
    }

    private void r()
    {
        k.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (a)
        {
            a.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return jws.a(ibinder);
    }

    public final void a()
    {
        k.a("disconnect(); ServiceListener=%s, isConnected=%b", new Object[] {
            p, Boolean.valueOf(j())
        });
        jwj jwj1 = p;
        p = null;
        if (jwj1 == null || jwj1.a() == null)
        {
            k.a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        r();
        if (j() || m())
        {
            ((jwr)o()).a();
        }
        super.a();
        return;
        Object obj;
        obj;
        k.a(((Throwable) (obj)), "Error while disconnecting the controller interface: %s", new Object[] {
            ((RemoteException) (obj)).getMessage()
        });
        super.a();
        return;
        obj;
        super.a();
        throw obj;
    }

    protected final void a(int j, IBinder ibinder, Bundle bundle, int i1)
    {
        k.a("in onPostInitHandler; statusCode=%d", new Object[] {
            Integer.valueOf(j)
        });
        int j1;
        if (j == 0 || j == 1001)
        {
            t = true;
            r = true;
            s = true;
        } else
        {
            t = false;
        }
        j1 = j;
        if (j == 1001)
        {
            y = new Bundle();
            y.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            j1 = 0;
        }
        super.a(j1, ibinder, bundle, i1);
    }

    public final void a(ConnectionResult connectionresult)
    {
        super.a(connectionresult);
        r();
    }

    public final void a(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        jup jup1;
        synchronized (a)
        {
            jup1 = (jup)a.remove(s1);
        }
        if (jup1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((jwr)o()).c(s1);
        return;
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        k.a(illegalstateexception, "Error unregistering namespace (%s): %s", new Object[] {
            s1, illegalstateexception.getMessage()
        });
        return;
    }

    public void a(jzc jzc1)
    {
        synchronized (B)
        {
            if (z != null)
            {
                z.a(new jwi(new Status(2002)));
            }
            z = jzc1;
        }
        return;
        jzc1;
        obj;
        JVM INSTR monitorexit ;
        throw jzc1;
    }

    public final Bundle b()
    {
        if (y != null)
        {
            Bundle bundle = y;
            y = null;
            return bundle;
        } else
        {
            return super.b();
        }
    }

    protected final String c()
    {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    protected final String d()
    {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    protected final Bundle e()
    {
        Bundle bundle = new Bundle();
        k.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] {
            w, x
        });
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", m);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", o);
        p = new jwj(this);
        bundle.putParcelable("listener", new BinderWrapper(p.asBinder()));
        if (w != null)
        {
            bundle.putString("last_application_id", w);
            if (x != null)
            {
                bundle.putString("last_session_id", x);
            }
        }
        return bundle;
    }

    public void f()
    {
label0:
        {
            if (t && p != null)
            {
                boolean flag;
                if (p.a.get() == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            throw new IllegalStateException("Not connected to a device");
        }
    }

}
