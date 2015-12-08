// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.android.gms.internal:
//            hb, gn, ge, gi, 
//            gj, gl, gm, hi

public final class gh extends hb
{
    private static final class a
        implements com.google.android.gms.cast.Cast.ApplicationConnectionResult
    {

        private final ApplicationMetadata Ci;
        private final String Cj;
        private final boolean Ck;
        private final String rR;
        private final Status yz;

        public ApplicationMetadata getApplicationMetadata()
        {
            return Ci;
        }

        public String getApplicationStatus()
        {
            return Cj;
        }

        public String getSessionId()
        {
            return rR;
        }

        public Status getStatus()
        {
            return yz;
        }

        public boolean getWasLaunched()
        {
            return Ck;
        }

        public a(Status status)
        {
            this(status, null, null, null, false);
        }

        public a(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
        {
            yz = status;
            Ci = applicationmetadata;
            Cj = s;
            rR = s1;
            Ck = flag;
        }
    }

    private class b
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        final gh Cc;

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            gh.j(Cc);
        }

        private b()
        {
            Cc = gh.this;
            super();
        }

    }


    private static final gn BG = new gn("CastClientImpl");
    private static final Object Ca = new Object();
    private static final Object Cb = new Object();
    private double AP;
    private boolean AQ;
    private final com.google.android.gms.cast.Cast.Listener Ae;
    private ApplicationMetadata BH;
    private final CastDevice BI;
    private final gm BJ = new gm.a() {

        final gh Cc;

        private boolean X(int k)
        {
            Object obj = gh.em();
            obj;
            JVM INSTR monitorenter ;
            if (gh.i(Cc) == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            gh.i(Cc).a(new Status(k));
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

        private void b(long l1, int k)
        {
            com.google.android.gms.common.api.a.d d1;
            synchronized (gh.h(Cc))
            {
                d1 = (com.google.android.gms.common.api.a.d)gh.h(Cc).remove(Long.valueOf(l1));
            }
            if (d1 != null)
            {
                d1.a(new Status(k));
            }
            return;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void T(int k)
        {
            gh.ek().b("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                Integer.valueOf(k)
            });
            gh.a(Cc, false);
            gh.b(Cc).set(false);
            gh.a(Cc, null);
            if (k != 0)
            {
                Cc.an(2);
            }
        }

        public void U(int k)
        {
            synchronized (gh.el())
            {
                if (gh.c(Cc) != null)
                {
                    gh.c(Cc).a(new a(new Status(k)));
                    gh.a(Cc, null);
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void V(int k)
        {
            X(k);
        }

        public void W(int k)
        {
            X(k);
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
                    gh.c(Cc).a(new a(new Status(0), applicationmetadata, s, s1, flag));
                    gh.a(Cc, null);
                }
            }
            return;
            applicationmetadata;
            obj;
            JVM INSTR monitorexit ;
            throw applicationmetadata;
        }

        public void a(String s, double d1, boolean flag)
        {
            gh.ek().b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
        }

        public void a(String s, long l1)
        {
            b(l1, 0);
        }

        public void a(String s, long l1, int k)
        {
            b(l1, k);
        }

        public void b(ge ge1)
        {
            gh.ek().b("onApplicationStatusChanged", new Object[0]);
            gh.e(Cc).post(new Runnable(this, ge1) {

                final _cls1 Ce;
                final ge Cg;

                public void run()
                {
                    gh.a(Ce.Cc, Cg);
                }

            
            {
                Ce = _pcls1;
                Cg = ge1;
                super();
            }
            });
        }

        public void b(gj gj1)
        {
            gh.ek().b("onDeviceStatusChanged", new Object[0]);
            gh.e(Cc).post(new Runnable(this, gj1) {

                final _cls1 Ce;
                final gj Cf;

                public void run()
                {
                    gh.a(Ce.Cc, Cf);
                }

            
            {
                Ce = _pcls1;
                Cf = gj1;
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
            gh.e(Cc).post(new Runnable(this, s, s1) {

                final _cls1 Ce;
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
                Ce = _pcls1;
                zU = s;
                Ch = s1;
                super();
            }
            });
        }

        public void onApplicationDisconnected(int k)
        {
            gh.a(Cc, null);
            gh.b(Cc, null);
            X(k);
            if (gh.d(Cc) != null)
            {
                gh.e(Cc).post(new Runnable(this, k) {

                    final int Cd;
                    final _cls1 Ce;

                    public void run()
                    {
                        if (gh.d(Ce.Cc) != null)
                        {
                            gh.d(Ce.Cc).onApplicationDisconnected(Cd);
                        }
                    }

            
            {
                Ce = _pcls1;
                Cd = k;
                super();
            }
                });
            }
        }

            
            {
                Cc = gh.this;
                super();
            }
    };
    private final Map BK = new HashMap();
    private final long BL;
    private String BM;
    private boolean BN;
    private boolean BO;
    private boolean BP;
    private AtomicBoolean BQ;
    private int BR;
    private final AtomicLong BS = new AtomicLong(0L);
    private String BT;
    private String BU;
    private Bundle BV;
    private Map BW;
    private b BX;
    private com.google.android.gms.common.api.a.d BY;
    private com.google.android.gms.common.api.a.d BZ;
    private final Handler mHandler;

    public gh(Context context, Looper looper, CastDevice castdevice, long l, com.google.android.gms.cast.Cast.Listener listener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, (String[])null);
        BI = castdevice;
        Ae = listener;
        BL = l;
        mHandler = new Handler(looper);
        BP = false;
        BR = -1;
        BH = null;
        BM = null;
        BQ = new AtomicBoolean(false);
        AP = 0.0D;
        AQ = false;
        BW = new HashMap();
        BX = new b();
        registerConnectionFailedListener(BX);
    }

    static ApplicationMetadata a(gh gh1, ApplicationMetadata applicationmetadata)
    {
        gh1.BH = applicationmetadata;
        return applicationmetadata;
    }

    static com.google.android.gms.common.api.a.d a(gh gh1, com.google.android.gms.common.api.a.d d1)
    {
        gh1.BY = d1;
        return d1;
    }

    static String a(gh gh1, String s)
    {
        gh1.BT = s;
        return s;
    }

    private void a(ge ge1)
    {
        ge1 = ge1.ec();
        boolean flag;
        if (!gi.a(ge1, BM))
        {
            BM = ge1;
            flag = true;
        } else
        {
            flag = false;
        }
        BG.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(BN)
        });
        if (Ae != null && (flag || BN))
        {
            Ae.onApplicationStatusChanged();
        }
        BN = false;
    }

    static void a(gh gh1, ge ge1)
    {
        gh1.a(ge1);
    }

    static void a(gh gh1, gj gj1)
    {
        gh1.a(gj1);
    }

    private void a(gj gj1)
    {
        double d1 = gj1.eh();
        int k;
        boolean flag;
        boolean flag1;
        if (d1 != (0.0D / 0.0D) && d1 != AP)
        {
            AP = d1;
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = gj1.en();
        if (flag1 != AQ)
        {
            AQ = flag1;
            flag = true;
        }
        BG.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(BO)
        });
        if (Ae != null && (flag || BO))
        {
            Ae.onVolumeChanged();
        }
        k = gj1.eo();
        if (k != BR)
        {
            BR = k;
            flag = true;
        } else
        {
            flag = false;
        }
        BG.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(BO)
        });
        if (Ae != null && (flag || BO))
        {
            Ae.O(BR);
        }
        BO = false;
    }

    static boolean a(gh gh1, boolean flag)
    {
        gh1.BP = flag;
        return flag;
    }

    static com.google.android.gms.common.api.a.d b(gh gh1, com.google.android.gms.common.api.a.d d1)
    {
        gh1.BZ = d1;
        return d1;
    }

    static String b(gh gh1, String s)
    {
        gh1.BU = s;
        return s;
    }

    static AtomicBoolean b(gh gh1)
    {
        return gh1.BQ;
    }

    static com.google.android.gms.common.api.a.d c(gh gh1)
    {
        return gh1.BY;
    }

    private void c(com.google.android.gms.common.api.a.d d1)
    {
        synchronized (Ca)
        {
            if (BY != null)
            {
                BY.a(new a(new Status(2002)));
            }
            BY = d1;
        }
        return;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    static com.google.android.gms.cast.Cast.Listener d(gh gh1)
    {
        return gh1.Ae;
    }

    static Handler e(gh gh1)
    {
        return gh1.mHandler;
    }

    private void e(com.google.android.gms.common.api.a.d d1)
    {
label0:
        {
            synchronized (Cb)
            {
                if (BZ == null)
                {
                    break label0;
                }
                d1.a(new Status(2001));
            }
            return;
        }
        BZ = d1;
        obj;
        JVM INSTR monitorexit ;
        return;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    private void ei()
    {
        BG.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (BK)
        {
            BK.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void ej()
        throws IllegalStateException
    {
        if (!BP || BQ.get())
        {
            throw new IllegalStateException("Not connected to a device");
        } else
        {
            return;
        }
    }

    static gn ek()
    {
        return BG;
    }

    static Object el()
    {
        return Ca;
    }

    static Object em()
    {
        return Cb;
    }

    static Map f(gh gh1)
    {
        return gh1.BK;
    }

    static CastDevice g(gh gh1)
    {
        return gh1.BI;
    }

    static Map h(gh gh1)
    {
        return gh1.BW;
    }

    static com.google.android.gms.common.api.a.d i(gh gh1)
    {
        return gh1.BZ;
    }

    static void j(gh gh1)
    {
        gh1.ei();
    }

    protected gl G(IBinder ibinder)
    {
        return gl.a.H(ibinder);
    }

    public void a(double d1)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        if (Double.isInfinite(d1) || Double.isNaN(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d1).toString());
        } else
        {
            ((gl)ft()).a(d1, AP, AQ);
            return;
        }
    }

    protected void a(int k, IBinder ibinder, Bundle bundle)
    {
        BG.b("in onPostInitHandler; statusCode=%d", new Object[] {
            Integer.valueOf(k)
        });
        int l;
        if (k == 0 || k == 1001)
        {
            BP = true;
            BN = true;
            BO = true;
        } else
        {
            BP = false;
        }
        l = k;
        if (k == 1001)
        {
            BV = new Bundle();
            BV.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            l = 0;
        }
        super.a(l, ibinder, bundle);
    }

    protected void a(hi hi1, hb.e e1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        BG.b("getServiceFromBroker(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] {
            BT, BU
        });
        BI.putInBundle(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", BL);
        if (BT != null)
        {
            bundle.putString("last_application_id", BT);
            if (BU != null)
            {
                bundle.putString("last_session_id", BU);
            }
        }
        hi1.a(e1, 0x4da6e8, getContext().getPackageName(), BJ.asBinder(), bundle);
    }

    public void a(String s, com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        gi.ak(s);
        aj(s);
        if (messagereceivedcallback != null)
        {
            synchronized (BK)
            {
                BK.put(s, messagereceivedcallback);
            }
            ((gl)ft()).an(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(String s, LaunchOptions launchoptions, com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        c(d1);
        ((gl)ft()).a(s, launchoptions);
    }

    public void a(String s, com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        e(d1);
        ((gl)ft()).am(s);
    }

    public void a(String s, String s1, com.google.android.gms.common.api.a.d d1)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (s1.length() > 0x10000)
        {
            throw new IllegalArgumentException("Message exceeds maximum size");
        } else
        {
            gi.ak(s);
            ej();
            long l = BS.incrementAndGet();
            ((gl)ft()).a(s, s1, l);
            BW.put(Long.valueOf(l), d1);
            return;
        }
    }

    public void a(String s, boolean flag, com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        c(d1);
        ((gl)ft()).e(s, flag);
    }

    public void aj(String s)
        throws IllegalArgumentException, RemoteException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
        synchronized (BK)
        {
            messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)BK.remove(s);
        }
        if (messagereceivedcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((gl)ft()).ao(s);
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        BG.a(illegalstateexception, "Error unregistering namespace (%s): %s", new Object[] {
            s, illegalstateexception.getMessage()
        });
        return;
    }

    public void b(String s, String s1, com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        c(d1);
        ((gl)ft()).h(s, s1);
    }

    protected String bu()
    {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    protected String bv()
    {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    public void d(com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        e(d1);
        ((gl)ft()).ep();
    }

    public void disconnect()
    {
        BG.b("disconnect(); mDisconnecting=%b, isConnected=%b", new Object[] {
            Boolean.valueOf(BQ.get()), Boolean.valueOf(isConnected())
        });
        if (BQ.getAndSet(true))
        {
            BG.b("mDisconnecting is set, so short-circuiting", new Object[0]);
            return;
        }
        ei();
        if (isConnected() || isConnecting())
        {
            ((gl)ft()).disconnect();
        }
        super.disconnect();
        return;
        Object obj;
        obj;
        BG.a(((Throwable) (obj)), "Error while disconnecting the controller interface: %s", new Object[] {
            ((RemoteException) (obj)).getMessage()
        });
        super.disconnect();
        return;
        obj;
        super.disconnect();
        throw obj;
    }

    public Bundle ef()
    {
        if (BV != null)
        {
            Bundle bundle = BV;
            BV = null;
            return bundle;
        } else
        {
            return super.ef();
        }
    }

    public void eg()
        throws IllegalStateException, RemoteException
    {
        ((gl)ft()).eg();
    }

    public double eh()
        throws IllegalStateException
    {
        ej();
        return AP;
    }

    public ApplicationMetadata getApplicationMetadata()
        throws IllegalStateException
    {
        ej();
        return BH;
    }

    public String getApplicationStatus()
        throws IllegalStateException
    {
        ej();
        return BM;
    }

    public boolean isMute()
        throws IllegalStateException
    {
        ej();
        return AQ;
    }

    protected IInterface x(IBinder ibinder)
    {
        return G(ibinder);
    }

    public void y(boolean flag)
        throws IllegalStateException, RemoteException
    {
        ((gl)ft()).a(flag, AP, AQ);
    }

}
