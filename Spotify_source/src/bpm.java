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

public final class bpm extends bsc
{

    private static final bpy j = new bpy("CastClientImpl", (byte)0);
    private static final Object y = new Object();
    private static final Object z = new Object();
    public final Map a = new HashMap();
    public boolean b;
    public double c;
    public final AtomicLong d = new AtomicLong(0L);
    public final Map e = new HashMap();
    private ApplicationMetadata k;
    private final CastDevice l;
    private final bon m;
    private bpo n;
    private String o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private String u;
    private String v;
    private Bundle w;
    private clv x;

    public bpm(Context context, Looper looper, bry bry, CastDevice castdevice, bon bon1, bqw bqw, bqx bqx)
    {
        super(context, looper, 10, bry, bqw, bqx);
        l = castdevice;
        m = bon1;
        q();
    }

    static ApplicationMetadata a(bpm bpm1, ApplicationMetadata applicationmetadata)
    {
        bpm1.k = applicationmetadata;
        return applicationmetadata;
    }

    static String a(bpm bpm1, String s1)
    {
        bpm1.u = s1;
        return s1;
    }

    static void a(bpm bpm1)
    {
        bpm1.q();
    }

    static void a(bpm bpm1, ApplicationStatus applicationstatus)
    {
        applicationstatus = applicationstatus.b;
        boolean flag;
        if (!bpp.a(applicationstatus, bpm1.o))
        {
            bpm1.o = applicationstatus;
            flag = true;
        } else
        {
            flag = false;
        }
        j.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(bpm1.p)
        });
        bpm1.p = false;
    }

    static void a(bpm bpm1, DeviceStatus devicestatus)
    {
        ApplicationMetadata applicationmetadata = devicestatus.e;
        if (!bpp.a(applicationmetadata, bpm1.k))
        {
            bpm1.k = applicationmetadata;
            bpm1.m.a(bpm1.k);
        }
        double d1 = devicestatus.b;
        int i1;
        boolean flag;
        boolean flag1;
        if (d1 != (0.0D / 0.0D) && Math.abs(d1 - bpm1.c) > 9.9999999999999995E-08D)
        {
            bpm1.c = d1;
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = devicestatus.c;
        if (flag1 != bpm1.b)
        {
            bpm1.b = flag1;
            flag = true;
        }
        j.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(bpm1.q)
        });
        if (bpm1.m != null && (flag || bpm1.q))
        {
            bpm1.m.a();
        }
        i1 = devicestatus.d;
        if (i1 != bpm1.s)
        {
            bpm1.s = i1;
            flag = true;
        } else
        {
            flag = false;
        }
        j.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(bpm1.q)
        });
        i1 = devicestatus.f;
        if (i1 != bpm1.t)
        {
            bpm1.t = i1;
            flag = true;
        } else
        {
            flag = false;
        }
        j.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(bpm1.q)
        });
        bpm1.q = false;
    }

    static clv b(bpm bpm1)
    {
        return bpm1.x;
    }

    static String b(bpm bpm1, String s1)
    {
        bpm1.v = s1;
        return s1;
    }

    static clv c(bpm bpm1)
    {
        bpm1.x = null;
        return null;
    }

    static bon d(bpm bpm1)
    {
        return bpm1.m;
    }

    static Map e(bpm bpm1)
    {
        return bpm1.a;
    }

    static CastDevice f(bpm bpm1)
    {
        return bpm1.l;
    }

    static bpy g()
    {
        return j;
    }

    static Map g(bpm bpm1)
    {
        return bpm1.e;
    }

    static Object h()
    {
        return y;
    }

    static Object i()
    {
        return z;
    }

    static clv j()
    {
        return null;
    }

    private void q()
    {
        r = false;
        s = -1;
        t = -1;
        k = null;
        o = null;
        c = 0.0D;
        b = false;
    }

    private void r()
    {
        j.a("removing all MessageReceivedCallbacks", new Object[0]);
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
        return bpt.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    protected final void a(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        j.a("in onPostInitHandler; statusCode=%d", new Object[] {
            Integer.valueOf(i1)
        });
        int k1;
        if (i1 == 0 || i1 == 1001)
        {
            r = true;
            p = true;
            q = true;
        } else
        {
            r = false;
        }
        k1 = i1;
        if (i1 == 1001)
        {
            w = new Bundle();
            w.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            k1 = 0;
        }
        super.a(k1, ibinder, bundle, j1);
    }

    public final void a(clv clv1)
    {
        synchronized (y)
        {
            if (x != null)
            {
                x.a(new bpn(new Status(2002)));
            }
            x = clv1;
        }
        return;
        clv1;
        obj;
        JVM INSTR monitorexit ;
        throw clv1;
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
        boo boo1;
        synchronized (a)
        {
            boo1 = (boo)a.remove(s1);
        }
        if (boo1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((bps)p()).c(s1);
        return;
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        j.a(illegalstateexception, "Error unregistering namespace (%s): %s", new Object[] {
            s1, illegalstateexception.getMessage()
        });
        return;
    }

    protected final String b()
    {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    public final void c()
    {
        j.a("disconnect(); ServiceListener=%s, isConnected=%b", new Object[] {
            n, Boolean.valueOf(k())
        });
        bpo bpo1 = n;
        n = null;
        if (bpo1 == null || bpo1.a() == null)
        {
            j.a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        r();
        ((bps)p()).a();
        super.c();
        return;
        Object obj;
        obj;
_L2:
        j.a(((Throwable) (obj)), "Error while disconnecting the controller interface: %s", new Object[] {
            ((Exception) (obj)).getMessage()
        });
        super.c();
        return;
        obj;
        super.c();
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Bundle e()
    {
        Bundle bundle = new Bundle();
        j.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] {
            u, v
        });
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", l);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        n = new bpo(this);
        bundle.putParcelable("listener", new BinderWrapper(n.asBinder()));
        if (u != null)
        {
            bundle.putString("last_application_id", u);
            if (v != null)
            {
                bundle.putString("last_session_id", v);
            }
        }
        return bundle;
    }

    public final void f()
    {
label0:
        {
            if (r && n != null)
            {
                boolean flag;
                if (n.a.get() == null)
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

    public final Bundle l_()
    {
        if (w != null)
        {
            Bundle bundle = w;
            w = null;
            return bundle;
        } else
        {
            return super.l_();
        }
    }

}
