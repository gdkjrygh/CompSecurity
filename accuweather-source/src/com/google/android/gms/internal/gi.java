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
//            hc, go, gf, gj, 
//            gk, gm, gn, hj

public final class gi extends hc
{
    private static final class a
        implements com.google.android.gms.cast.Cast.ApplicationConnectionResult
    {

        private final ApplicationMetadata Cf;
        private final String Cg;
        private final boolean Ch;
        private final String rO;
        private final Status yw;

        public ApplicationMetadata getApplicationMetadata()
        {
            return Cf;
        }

        public String getApplicationStatus()
        {
            return Cg;
        }

        public String getSessionId()
        {
            return rO;
        }

        public Status getStatus()
        {
            return yw;
        }

        public boolean getWasLaunched()
        {
            return Ch;
        }

        public a(Status status)
        {
            this(status, null, null, null, false);
        }

        public a(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
        {
            yw = status;
            Cf = applicationmetadata;
            Cg = s;
            rO = s1;
            Ch = flag;
        }
    }

    private class b
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        final gi BZ;

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            gi.j(BZ);
        }

        private b()
        {
            BZ = gi.this;
            super();
        }

    }


    private static final go BD = new go("CastClientImpl");
    private static final Object BX = new Object();
    private static final Object BY = new Object();
    private double AM;
    private boolean AN;
    private final com.google.android.gms.cast.Cast.Listener Ab;
    private ApplicationMetadata BE;
    private final CastDevice BF;
    private final gn BG = new gn.a() {

        final gi BZ;

        private boolean X(int k)
        {
            Object obj = gi.eh();
            obj;
            JVM INSTR monitorenter ;
            if (gi.i(BZ) == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            gi.i(BZ).a(new Status(k));
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

        private void b(long l1, int k)
        {
            com.google.android.gms.common.api.a.d d1;
            synchronized (gi.h(BZ))
            {
                d1 = (com.google.android.gms.common.api.a.d)gi.h(BZ).remove(Long.valueOf(l1));
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
            gi.ef().b("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                Integer.valueOf(k)
            });
            gi.a(BZ, false);
            gi.b(BZ).set(false);
            gi.a(BZ, null);
            if (k != 0)
            {
                BZ.an(2);
            }
        }

        public void U(int k)
        {
            synchronized (gi.eg())
            {
                if (gi.c(BZ) != null)
                {
                    gi.c(BZ).a(new a(new Status(k)));
                    gi.a(BZ, null);
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
            gi.a(BZ, applicationmetadata);
            gi.a(BZ, applicationmetadata.getApplicationId());
            gi.b(BZ, s1);
            synchronized (gi.eg())
            {
                if (gi.c(BZ) != null)
                {
                    gi.c(BZ).a(new a(new Status(0), applicationmetadata, s, s1, flag));
                    gi.a(BZ, null);
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
            gi.ef().b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
        }

        public void a(String s, long l1)
        {
            b(l1, 0);
        }

        public void a(String s, long l1, int k)
        {
            b(l1, k);
        }

        public void b(gf gf1)
        {
            gi.ef().b("onApplicationStatusChanged", new Object[0]);
            gi.e(BZ).post(new Runnable(this, gf1) {

                final _cls1 Cb;
                final gf Cd;

                public void run()
                {
                    gi.a(Cb.BZ, Cd);
                }

            
            {
                Cb = _pcls1;
                Cd = gf1;
                super();
            }
            });
        }

        public void b(gk gk1)
        {
            gi.ef().b("onDeviceStatusChanged", new Object[0]);
            gi.e(BZ).post(new Runnable(this, gk1) {

                final _cls1 Cb;
                final gk Cc;

                public void run()
                {
                    gi.a(Cb.BZ, Cc);
                }

            
            {
                Cb = _pcls1;
                Cc = gk1;
                super();
            }
            });
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
            gi.e(BZ).post(new Runnable(this, s, s1) {

                final _cls1 Cb;
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
                Cb = _pcls1;
                zR = s;
                Ce = s1;
                super();
            }
            });
        }

        public void onApplicationDisconnected(int k)
        {
            gi.a(BZ, null);
            gi.b(BZ, null);
            X(k);
            if (gi.d(BZ) != null)
            {
                gi.e(BZ).post(new Runnable(this, k) {

                    final int Ca;
                    final _cls1 Cb;

                    public void run()
                    {
                        if (gi.d(Cb.BZ) != null)
                        {
                            gi.d(Cb.BZ).onApplicationDisconnected(Ca);
                        }
                    }

            
            {
                Cb = _pcls1;
                Ca = k;
                super();
            }
                });
            }
        }

            
            {
                BZ = gi.this;
                super();
            }
    };
    private final Map BH = new HashMap();
    private final long BI;
    private String BJ;
    private boolean BK;
    private boolean BL;
    private boolean BM;
    private AtomicBoolean BN;
    private int BO;
    private final AtomicLong BP = new AtomicLong(0L);
    private String BQ;
    private String BR;
    private Bundle BS;
    private Map BT;
    private b BU;
    private com.google.android.gms.common.api.a.d BV;
    private com.google.android.gms.common.api.a.d BW;
    private final Handler mHandler;

    public gi(Context context, Looper looper, CastDevice castdevice, long l, com.google.android.gms.cast.Cast.Listener listener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, (String[])null);
        BF = castdevice;
        Ab = listener;
        BI = l;
        mHandler = new Handler(looper);
        BM = false;
        BO = -1;
        BE = null;
        BJ = null;
        BN = new AtomicBoolean(false);
        AM = 0.0D;
        AN = false;
        BT = new HashMap();
        BU = new b();
        registerConnectionFailedListener(BU);
    }

    static ApplicationMetadata a(gi gi1, ApplicationMetadata applicationmetadata)
    {
        gi1.BE = applicationmetadata;
        return applicationmetadata;
    }

    static com.google.android.gms.common.api.a.d a(gi gi1, com.google.android.gms.common.api.a.d d1)
    {
        gi1.BV = d1;
        return d1;
    }

    static String a(gi gi1, String s)
    {
        gi1.BQ = s;
        return s;
    }

    private void a(gf gf1)
    {
        gf1 = gf1.dX();
        boolean flag;
        if (!gj.a(gf1, BJ))
        {
            BJ = gf1;
            flag = true;
        } else
        {
            flag = false;
        }
        BD.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(BK)
        });
        if (Ab != null && (flag || BK))
        {
            Ab.onApplicationStatusChanged();
        }
        BK = false;
    }

    static void a(gi gi1, gf gf1)
    {
        gi1.a(gf1);
    }

    static void a(gi gi1, gk gk1)
    {
        gi1.a(gk1);
    }

    private void a(gk gk1)
    {
        double d1 = gk1.ec();
        int k;
        boolean flag;
        boolean flag1;
        if (d1 != (0.0D / 0.0D) && d1 != AM)
        {
            AM = d1;
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = gk1.ei();
        if (flag1 != AN)
        {
            AN = flag1;
            flag = true;
        }
        BD.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(BL)
        });
        if (Ab != null && (flag || BL))
        {
            Ab.onVolumeChanged();
        }
        k = gk1.ej();
        if (k != BO)
        {
            BO = k;
            flag = true;
        } else
        {
            flag = false;
        }
        BD.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(BL)
        });
        if (Ab != null && (flag || BL))
        {
            Ab.O(BO);
        }
        BL = false;
    }

    static boolean a(gi gi1, boolean flag)
    {
        gi1.BM = flag;
        return flag;
    }

    static com.google.android.gms.common.api.a.d b(gi gi1, com.google.android.gms.common.api.a.d d1)
    {
        gi1.BW = d1;
        return d1;
    }

    static String b(gi gi1, String s)
    {
        gi1.BR = s;
        return s;
    }

    static AtomicBoolean b(gi gi1)
    {
        return gi1.BN;
    }

    static com.google.android.gms.common.api.a.d c(gi gi1)
    {
        return gi1.BV;
    }

    private void c(com.google.android.gms.common.api.a.d d1)
    {
        synchronized (BX)
        {
            if (BV != null)
            {
                BV.a(new a(new Status(2002)));
            }
            BV = d1;
        }
        return;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    static com.google.android.gms.cast.Cast.Listener d(gi gi1)
    {
        return gi1.Ab;
    }

    static Handler e(gi gi1)
    {
        return gi1.mHandler;
    }

    private void e(com.google.android.gms.common.api.a.d d1)
    {
label0:
        {
            synchronized (BY)
            {
                if (BW == null)
                {
                    break label0;
                }
                d1.a(new Status(2001));
            }
            return;
        }
        BW = d1;
        obj;
        JVM INSTR monitorexit ;
        return;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    private void ed()
    {
        BD.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (BH)
        {
            BH.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void ee()
        throws IllegalStateException
    {
        if (!BM || BN.get())
        {
            throw new IllegalStateException("Not connected to a device");
        } else
        {
            return;
        }
    }

    static go ef()
    {
        return BD;
    }

    static Object eg()
    {
        return BX;
    }

    static Object eh()
    {
        return BY;
    }

    static Map f(gi gi1)
    {
        return gi1.BH;
    }

    static CastDevice g(gi gi1)
    {
        return gi1.BF;
    }

    static Map h(gi gi1)
    {
        return gi1.BT;
    }

    static com.google.android.gms.common.api.a.d i(gi gi1)
    {
        return gi1.BW;
    }

    static void j(gi gi1)
    {
        gi1.ed();
    }

    protected gm G(IBinder ibinder)
    {
        return gm.a.H(ibinder);
    }

    public void a(double d1)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        if (Double.isInfinite(d1) || Double.isNaN(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d1).toString());
        } else
        {
            ((gm)fo()).a(d1, AM, AN);
            return;
        }
    }

    protected void a(int k, IBinder ibinder, Bundle bundle)
    {
        BD.b("in onPostInitHandler; statusCode=%d", new Object[] {
            Integer.valueOf(k)
        });
        int l;
        if (k == 0 || k == 1001)
        {
            BM = true;
            BK = true;
            BL = true;
        } else
        {
            BM = false;
        }
        l = k;
        if (k == 1001)
        {
            BS = new Bundle();
            BS.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            l = 0;
        }
        super.a(l, ibinder, bundle);
    }

    protected void a(hj hj1, hc.e e1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        BD.b("getServiceFromBroker(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] {
            BQ, BR
        });
        BF.putInBundle(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", BI);
        if (BQ != null)
        {
            bundle.putString("last_application_id", BQ);
            if (BR != null)
            {
                bundle.putString("last_session_id", BR);
            }
        }
        hj1.a(e1, 0x4d7808, getContext().getPackageName(), BG.asBinder(), bundle);
    }

    public void a(String s, com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        gj.ak(s);
        aj(s);
        if (messagereceivedcallback != null)
        {
            synchronized (BH)
            {
                BH.put(s, messagereceivedcallback);
            }
            ((gm)fo()).an(s);
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
        ((gm)fo()).a(s, launchoptions);
    }

    public void a(String s, com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        e(d1);
        ((gm)fo()).am(s);
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
            gj.ak(s);
            ee();
            long l = BP.incrementAndGet();
            ((gm)fo()).a(s, s1, l);
            BT.put(Long.valueOf(l), d1);
            return;
        }
    }

    public void a(String s, boolean flag, com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        c(d1);
        ((gm)fo()).e(s, flag);
    }

    public void aj(String s)
        throws IllegalArgumentException, RemoteException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
        synchronized (BH)
        {
            messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)BH.remove(s);
        }
        if (messagereceivedcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((gm)fo()).ao(s);
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        BD.a(illegalstateexception, "Error unregistering namespace (%s): %s", new Object[] {
            s, illegalstateexception.getMessage()
        });
        return;
    }

    public void b(String s, String s1, com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        c(d1);
        ((gm)fo()).h(s, s1);
    }

    protected String bp()
    {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    protected String bq()
    {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    public void d(com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        e(d1);
        ((gm)fo()).ek();
    }

    public void disconnect()
    {
        BD.b("disconnect(); mDisconnecting=%b, isConnected=%b", new Object[] {
            Boolean.valueOf(BN.get()), Boolean.valueOf(isConnected())
        });
        if (BN.getAndSet(true))
        {
            BD.b("mDisconnecting is set, so short-circuiting", new Object[0]);
            return;
        }
        ed();
        if (isConnected() || isConnecting())
        {
            ((gm)fo()).disconnect();
        }
        super.disconnect();
        return;
        Object obj;
        obj;
        BD.a(((Throwable) (obj)), "Error while disconnecting the controller interface: %s", new Object[] {
            ((RemoteException) (obj)).getMessage()
        });
        super.disconnect();
        return;
        obj;
        super.disconnect();
        throw obj;
    }

    public Bundle ea()
    {
        if (BS != null)
        {
            Bundle bundle = BS;
            BS = null;
            return bundle;
        } else
        {
            return super.ea();
        }
    }

    public void eb()
        throws IllegalStateException, RemoteException
    {
        ((gm)fo()).eb();
    }

    public double ec()
        throws IllegalStateException
    {
        ee();
        return AM;
    }

    public ApplicationMetadata getApplicationMetadata()
        throws IllegalStateException
    {
        ee();
        return BE;
    }

    public String getApplicationStatus()
        throws IllegalStateException
    {
        ee();
        return BJ;
    }

    public boolean isMute()
        throws IllegalStateException
    {
        ee();
        return AN;
    }

    protected IInterface x(IBinder ibinder)
    {
        return G(ibinder);
    }

    public void y(boolean flag)
        throws IllegalStateException, RemoteException
    {
        ((gm)fo()).a(flag, AM, AN);
    }

}
