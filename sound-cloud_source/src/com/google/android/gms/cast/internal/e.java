// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.cast.internal:
//            p, ApplicationStatus, j, DeviceStatus, 
//            m, h, g, i, 
//            f

public final class e extends zzj
{
    private static final class a
        implements com.google.android.gms.cast.a.a
    {

        private final Status a;
        private final ApplicationMetadata b;
        private final String c;
        private final String d;
        private final boolean e;

        public final ApplicationMetadata a()
        {
            return b;
        }

        public final String b()
        {
            return c;
        }

        public final String c()
        {
            return d;
        }

        public final boolean d()
        {
            return e;
        }

        public final Status getStatus()
        {
            return a;
        }

        public a(Status status)
        {
            this(status, null, null, null, false);
        }

        public a(Status status, ApplicationMetadata applicationmetadata, String s1, String s2, boolean flag)
        {
            a = status;
            b = applicationmetadata;
            c = s1;
            d = s2;
            e = flag;
        }
    }

    private static final class b extends n.a
    {

        final AtomicReference a;
        private final Handler b;

        private static void a(e e1, long l1, int i1)
        {
            synchronized (e.g(e1))
            {
                e1 = (com.google.android.gms.common.api.zzc.zzb)e.g(e1).remove(Long.valueOf(l1));
            }
            if (e1 != null)
            {
                e1.zzn(new Status(i1));
            }
            return;
            e1;
            map;
            JVM INSTR monitorexit ;
            throw e1;
        }

        private static boolean a(e e1, int i1)
        {
            Object obj = e.d();
            obj;
            JVM INSTR monitorenter ;
            if (e.h(e1) == null)
            {
                break MISSING_BLOCK_LABEL_39;
            }
            e.h(e1).zzn(new Status(i1));
            e.i(e1);
            return true;
            obj;
            JVM INSTR monitorexit ;
            return false;
            e1;
            obj;
            JVM INSTR monitorexit ;
            throw e1;
        }

        public final e a()
        {
            e e1 = (e)a.getAndSet(null);
            if (e1 == null)
            {
                return null;
            } else
            {
                e.a(e1);
                return e1;
            }
        }

        public final void a(int i1)
        {
            e e1 = a();
            if (e1 != null)
            {
                e.b().a("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                    Integer.valueOf(i1)
                });
                if (i1 != 0)
                {
                    e1.zzbz(2);
                    return;
                }
            }
        }

        public final void a(long l1)
        {
            e e1 = (e)a.get();
            if (e1 == null)
            {
                return;
            } else
            {
                a(e1, l1, 0);
                return;
            }
        }

        public final void a(long l1, int i1)
        {
            e e1 = (e)a.get();
            if (e1 == null)
            {
                return;
            } else
            {
                a(e1, l1, i1);
                return;
            }
        }

        public final void a(ApplicationMetadata applicationmetadata, String s1, String s2, boolean flag)
        {
            e e1 = (e)a.get();
            if (e1 == null)
            {
                return;
            }
            e.a(e1, applicationmetadata);
            e.a(e1, applicationmetadata.b);
            e.b(e1, s2);
            synchronized (e.c())
            {
                if (e.b(e1) != null)
                {
                    e.b(e1).zzn(new a(new Status(0), applicationmetadata, s1, s2, flag));
                    e.c(e1);
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
            e e1 = (e)a.get();
            if (e1 == null)
            {
                return;
            } else
            {
                e.b().a("onApplicationStatusChanged", new Object[0]);
                b.post(new h(this, e1, applicationstatus));
                return;
            }
        }

        public final void a(DeviceStatus devicestatus)
        {
            e e1 = (e)a.get();
            if (e1 == null)
            {
                return;
            } else
            {
                e.b().a("onDeviceStatusChanged", new Object[0]);
                b.post(new g(this, e1, devicestatus));
                return;
            }
        }

        public final void a(String s1, String s2)
        {
            e e1 = (e)a.get();
            if (e1 == null)
            {
                return;
            } else
            {
                e.b().a("Receive (type=text, ns=%s) %s", new Object[] {
                    s1, s2
                });
                b.post(new i(this, e1, s1, s2));
                return;
            }
        }

        public final void a(String s1, byte abyte0[])
        {
            if ((e)a.get() == null)
            {
                return;
            } else
            {
                e.b().a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] {
                    s1, Integer.valueOf(abyte0.length)
                });
                return;
            }
        }

        public final void b()
        {
            e.b().a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
        }

        public final void b(int i1)
        {
            e e1 = (e)a.get();
            if (e1 == null)
            {
                return;
            }
            synchronized (e.c())
            {
                if (e.b(e1) != null)
                {
                    e.b(e1).zzn(new a(new Status(i1)));
                    e.c(e1);
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void c(int i1)
        {
            e e1 = (e)a.get();
            if (e1 == null)
            {
                return;
            } else
            {
                a(e1, i1);
                return;
            }
        }

        public final void d(int i1)
        {
            e e1 = (e)a.get();
            if (e1 == null)
            {
                return;
            } else
            {
                a(e1, i1);
                return;
            }
        }

        public final void e(int i1)
        {
            e e1 = (e)a.get();
            if (e1 != null)
            {
                e.a(e1, null);
                e.b(e1, null);
                a(e1, i1);
                if (e.d(e1) != null)
                {
                    b.post(new f(this, e1, i1));
                    return;
                }
            }
        }

        public b(e e1)
        {
            a = new AtomicReference(e1);
            b = new Handler(e1.getLooper());
        }
    }


    public static final Object h = new Object();
    private static final p i = new p("CastClientImpl");
    private static final Object x = new Object();
    public final Map a = new HashMap();
    public String b;
    public boolean c;
    public double d;
    public final AtomicLong e = new AtomicLong(0L);
    public final Map f = new HashMap();
    public com.google.android.gms.common.api.zzc.zzb g;
    private ApplicationMetadata j;
    private final CastDevice k;
    private final com.google.android.gms.cast.a.d l;
    private final long m;
    private b n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private String t;
    private String u;
    private Bundle v;
    private com.google.android.gms.common.api.zzc.zzb w;

    public e(Context context, Looper looper, zzf zzf, CastDevice castdevice, long l1, com.google.android.gms.cast.a.d d1, 
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 10, zzf, connectioncallbacks, onconnectionfailedlistener);
        k = castdevice;
        l = d1;
        m = l1;
        e();
    }

    static ApplicationMetadata a(e e1, ApplicationMetadata applicationmetadata)
    {
        e1.j = applicationmetadata;
        return applicationmetadata;
    }

    static String a(e e1, String s1)
    {
        e1.t = s1;
        return s1;
    }

    static void a(e e1)
    {
        e1.e();
    }

    static void a(e e1, ApplicationStatus applicationstatus)
    {
        applicationstatus = applicationstatus.b;
        boolean flag;
        if (!com.google.android.gms.cast.internal.j.a(applicationstatus, e1.b))
        {
            e1.b = applicationstatus;
            flag = true;
        } else
        {
            flag = false;
        }
        i.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(e1.o)
        });
        if (e1.l != null && (flag || e1.o))
        {
            e1.l.onApplicationStatusChanged();
        }
        e1.o = false;
    }

    static void a(e e1, DeviceStatus devicestatus)
    {
        ApplicationMetadata applicationmetadata = devicestatus.e;
        if (!com.google.android.gms.cast.internal.j.a(applicationmetadata, e1.j))
        {
            e1.j = applicationmetadata;
            e1.l.onApplicationMetadataChanged(e1.j);
        }
        double d1 = devicestatus.b;
        int i1;
        boolean flag;
        boolean flag1;
        if (d1 != (0.0D / 0.0D) && Math.abs(d1 - e1.d) > 9.9999999999999995E-08D)
        {
            e1.d = d1;
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = devicestatus.c;
        if (flag1 != e1.c)
        {
            e1.c = flag1;
            flag = true;
        }
        i.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(e1.p)
        });
        if (e1.l != null && (flag || e1.p))
        {
            e1.l.onVolumeChanged();
        }
        i1 = devicestatus.d;
        if (i1 != e1.r)
        {
            e1.r = i1;
            flag = true;
        } else
        {
            flag = false;
        }
        i.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(e1.p)
        });
        if (e1.l != null && (flag || e1.p))
        {
            e1.l.onActiveInputStateChanged(e1.r);
        }
        i1 = devicestatus.f;
        if (i1 != e1.s)
        {
            e1.s = i1;
            flag = true;
        } else
        {
            flag = false;
        }
        i.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(e1.p)
        });
        if (e1.l != null && (flag || e1.p))
        {
            e1.l.onStandbyStateChanged(e1.s);
        }
        e1.p = false;
    }

    static p b()
    {
        return i;
    }

    static com.google.android.gms.common.api.zzc.zzb b(e e1)
    {
        return e1.w;
    }

    static String b(e e1, String s1)
    {
        e1.u = s1;
        return s1;
    }

    static com.google.android.gms.common.api.zzc.zzb c(e e1)
    {
        e1.w = null;
        return null;
    }

    static Object c()
    {
        return x;
    }

    static com.google.android.gms.cast.a.d d(e e1)
    {
        return e1.l;
    }

    static Object d()
    {
        return h;
    }

    static Map e(e e1)
    {
        return e1.a;
    }

    private void e()
    {
        q = false;
        r = -1;
        s = -1;
        j = null;
        b = null;
        d = 0.0D;
        c = false;
    }

    static CastDevice f(e e1)
    {
        return e1.k;
    }

    private void f()
    {
        i.a("removing all MessageReceivedCallbacks", new Object[0]);
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

    static Map g(e e1)
    {
        return e1.f;
    }

    static com.google.android.gms.common.api.zzc.zzb h(e e1)
    {
        return e1.g;
    }

    static com.google.android.gms.common.api.zzc.zzb i(e e1)
    {
        e1.g = null;
        return null;
    }

    public final void a()
        throws IllegalStateException
    {
label0:
        {
            if (q && n != null)
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

    public final void a(com.google.android.gms.common.api.zzc.zzb zzb)
    {
        synchronized (x)
        {
            if (w != null)
            {
                w.zzn(new a(new Status(2002)));
            }
            w = zzb;
        }
        return;
        zzb;
        obj;
        JVM INSTR monitorexit ;
        throw zzb;
    }

    public final void a(String s1)
        throws IllegalArgumentException, RemoteException
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        com.google.android.gms.cast.a.e e1;
        synchronized (a)
        {
            e1 = (com.google.android.gms.cast.a.e)a.remove(s1);
        }
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ((m)zzoA()).c(s1);
        return;
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        i.b("Error unregistering namespace (%s): %s", new Object[] {
            s1, illegalstateexception.getMessage()
        });
        return;
    }

    public final void disconnect()
    {
        i.a("disconnect(); ServiceListener=%s, isConnected=%b", new Object[] {
            n, Boolean.valueOf(isConnected())
        });
        b b1 = n;
        n = null;
        if (b1 == null || b1.a() == null)
        {
            i.a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        f();
        if (isConnected() || isConnecting())
        {
            ((m)zzoA()).a();
        }
        super.disconnect();
        return;
        Object obj;
        obj;
        i.b("Error while disconnecting the controller interface: %s", new Object[] {
            ((RemoteException) (obj)).getMessage()
        });
        super.disconnect();
        return;
        obj;
        super.disconnect();
        throw obj;
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        super.onConnectionFailed(connectionresult);
        f();
    }

    protected final IInterface zzV(IBinder ibinder)
    {
        return com.google.android.gms.cast.internal.m.a.a(ibinder);
    }

    protected final void zza(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        i.a("in onPostInitHandler; statusCode=%d", new Object[] {
            Integer.valueOf(i1)
        });
        int k1;
        if (i1 == 0 || i1 == 1001)
        {
            q = true;
            o = true;
            p = true;
        } else
        {
            q = false;
        }
        k1 = i1;
        if (i1 == 1001)
        {
            v = new Bundle();
            v.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            k1 = 0;
        }
        super.zza(k1, ibinder, bundle, j1);
    }

    protected final String zzfA()
    {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    protected final String zzfB()
    {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    protected final Bundle zzli()
    {
        Bundle bundle = new Bundle();
        i.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] {
            t, u
        });
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", k);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", m);
        n = new b(this);
        bundle.putParcelable("listener", new BinderWrapper(n.asBinder()));
        if (t != null)
        {
            bundle.putString("last_application_id", t);
            if (u != null)
            {
                bundle.putString("last_session_id", u);
            }
        }
        return bundle;
    }

    public final Bundle zzmw()
    {
        if (v != null)
        {
            Bundle bundle = v;
            v = null;
            return bundle;
        } else
        {
            return super.zzmw();
        }
    }

}
