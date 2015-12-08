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
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.android.gms.internal:
//            ip, ig, ik, il, 
//            in

public final class ij extends e
{
    private static final class a
        implements com.google.android.gms.cast.Cast.ApplicationConnectionResult
    {

        private final Status CM;
        private final ApplicationMetadata GN;
        private final String GO;
        private final boolean GP;
        private final String vL;

        public ApplicationMetadata getApplicationMetadata()
        {
            return GN;
        }

        public String getApplicationStatus()
        {
            return GO;
        }

        public String getSessionId()
        {
            return vL;
        }

        public Status getStatus()
        {
            return CM;
        }

        public boolean getWasLaunched()
        {
            return GP;
        }

        public a(Status status)
        {
            this(status, null, null, null, false);
        }

        public a(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
        {
            CM = status;
            GN = applicationmetadata;
            GO = s;
            vL = s1;
            GP = flag;
        }
    }

    private class b
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        final ij GQ;

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            ij.b(GQ);
        }

        private b()
        {
            GQ = ij.this;
            super();
        }

    }

    private class c extends io.a
    {

        final ij GQ;
        private AtomicBoolean GR;

        private boolean ag(int i1)
        {
            Object obj = ij.fJ();
            obj;
            JVM INSTR monitorenter ;
            if (ij.j(GQ) == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            ij.j(GQ).b(new Status(i1));
            ij.b(GQ, null);
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

        private void c(long l1, int i1)
        {
            com.google.android.gms.common.api.BaseImplementation.b b1;
            synchronized (ij.i(GQ))
            {
                b1 = (com.google.android.gms.common.api.BaseImplementation.b)ij.i(GQ).remove(Long.valueOf(l1));
            }
            if (b1 != null)
            {
                b1.b(new Status(i1));
            }
            return;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
        {
            if (GR.get())
            {
                return;
            }
            ij.a(GQ, applicationmetadata);
            ij.a(GQ, applicationmetadata.getApplicationId());
            ij.b(GQ, s1);
            synchronized (ij.fI())
            {
                if (ij.d(GQ) != null)
                {
                    ij.d(GQ).b(new a(new Status(0), applicationmetadata, s, s1, flag));
                    ij.a(GQ, null);
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
            ij.fH().b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
        }

        public void a(String s, long l1)
        {
            if (GR.get())
            {
                return;
            } else
            {
                c(l1, 0);
                return;
            }
        }

        public void a(String s, long l1, int i1)
        {
            if (GR.get())
            {
                return;
            } else
            {
                c(l1, i1);
                return;
            }
        }

        public void ac(int i1)
        {
            if (fK())
            {
                ij.fH().b("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                    Integer.valueOf(i1)
                });
                if (i1 != 0)
                {
                    GQ.aA(2);
                    return;
                }
            }
        }

        public void ad(int i1)
        {
            if (GR.get())
            {
                return;
            }
            synchronized (ij.fI())
            {
                if (ij.d(GQ) != null)
                {
                    ij.d(GQ).b(new a(new Status(i1)));
                    ij.a(GQ, null);
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void ae(int i1)
        {
            if (GR.get())
            {
                return;
            } else
            {
                ag(i1);
                return;
            }
        }

        public void af(int i1)
        {
            if (GR.get())
            {
                return;
            } else
            {
                ag(i1);
                return;
            }
        }

        public void b(ig ig1)
        {
            if (GR.get())
            {
                return;
            } else
            {
                ij.fH().b("onApplicationStatusChanged", new Object[0]);
                ij.f(GQ).post(new Runnable(this, ig1) {

                    final c GT;
                    final ig GV;

                    public void run()
                    {
                        ij.a(GT.GQ, GV);
                    }

            
            {
                GT = c1;
                GV = ig1;
                super();
            }
                });
                return;
            }
        }

        public void b(il il1)
        {
            if (GR.get())
            {
                return;
            } else
            {
                ij.fH().b("onDeviceStatusChanged", new Object[0]);
                ij.f(GQ).post(new Runnable(this, il1) {

                    final c GT;
                    final il GU;

                    public void run()
                    {
                        ij.a(GT.GQ, GU);
                    }

            
            {
                GT = c1;
                GU = il1;
                super();
            }
                });
                return;
            }
        }

        public void b(String s, byte abyte0[])
        {
            if (GR.get())
            {
                return;
            } else
            {
                ij.fH().b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] {
                    s, Integer.valueOf(abyte0.length)
                });
                return;
            }
        }

        public boolean fK()
        {
            if (GR.getAndSet(true))
            {
                return false;
            } else
            {
                ij.c(GQ);
                return true;
            }
        }

        public boolean fL()
        {
            return GR.get();
        }

        public void k(String s, String s1)
        {
            if (GR.get())
            {
                return;
            } else
            {
                ij.fH().b("Receive (type=text, ns=%s) %s", new Object[] {
                    s, s1
                });
                ij.f(GQ).post(new Runnable(this, s, s1) {

                    final String EE;
                    final c GT;
                    final String GW;

                    public void run()
                    {
                        com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
                        synchronized (ij.g(GT.GQ))
                        {
                            messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)ij.g(GT.GQ).get(EE);
                        }
                        if (messagereceivedcallback != null)
                        {
                            messagereceivedcallback.onMessageReceived(ij.h(GT.GQ), EE, GW);
                            return;
                        } else
                        {
                            ij.fH().b("Discarded message for unknown namespace '%s'", new Object[] {
                                EE
                            });
                            return;
                        }
                        exception;
                        map;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                GT = c1;
                EE = s;
                GW = s1;
                super();
            }
                });
                return;
            }
        }

        public void onApplicationDisconnected(int i1)
        {
            if (!GR.get())
            {
                ij.a(GQ, null);
                ij.b(GQ, null);
                ag(i1);
                if (com.google.android.gms.internal.ij.e(GQ) != null)
                {
                    ij.f(GQ).post(new Runnable(this, i1) {

                        final int GS;
                        final c GT;

                        public void run()
                        {
                            if (com.google.android.gms.internal.ij.e(GT.GQ) != null)
                            {
                                com.google.android.gms.internal.ij.e(GT.GQ).onApplicationDisconnected(GS);
                            }
                        }

            
            {
                GT = c1;
                GS = k;
                super();
            }
                    });
                    return;
                }
            }
        }

        private c()
        {
            GQ = ij.this;
            super();
            GR = new AtomicBoolean(false);
        }

    }


    private static final Object GL = new Object();
    private static final Object GM = new Object();
    private static final ip Gr = new ip("CastClientImpl");
    private final com.google.android.gms.cast.Cast.Listener EO;
    private double FA;
    private boolean FB;
    private boolean GA;
    private int GB;
    private int GC;
    private final AtomicLong GD = new AtomicLong(0L);
    private String GE;
    private String GF;
    private Bundle GG;
    private Map GH;
    private b GI;
    private com.google.android.gms.common.api.BaseImplementation.b GJ;
    private com.google.android.gms.common.api.BaseImplementation.b GK;
    private ApplicationMetadata Gs;
    private final CastDevice Gt;
    private final Map Gu = new HashMap();
    private final long Gv;
    private c Gw;
    private String Gx;
    private boolean Gy;
    private boolean Gz;
    private final Handler mHandler;

    public ij(Context context, Looper looper, CastDevice castdevice, long l1, com.google.android.gms.cast.Cast.Listener listener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, (String[])null);
        Gt = castdevice;
        EO = listener;
        Gv = l1;
        mHandler = new Handler(looper);
        GH = new HashMap();
        fB();
        GI = new b();
        registerConnectionFailedListener(GI);
    }

    static ApplicationMetadata a(ij ij1, ApplicationMetadata applicationmetadata)
    {
        ij1.Gs = applicationmetadata;
        return applicationmetadata;
    }

    static com.google.android.gms.common.api.BaseImplementation.b a(ij ij1, com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        ij1.GJ = b1;
        return b1;
    }

    static String a(ij ij1, String s)
    {
        ij1.GE = s;
        return s;
    }

    private void a(ig ig1)
    {
        ig1 = ig1.fy();
        boolean flag;
        if (!ik.a(ig1, Gx))
        {
            Gx = ig1;
            flag = true;
        } else
        {
            flag = false;
        }
        Gr.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(Gy)
        });
        if (EO != null && (flag || Gy))
        {
            EO.onApplicationStatusChanged();
        }
        Gy = false;
    }

    static void a(ij ij1, ig ig1)
    {
        ij1.a(ig1);
    }

    static void a(ij ij1, il il1)
    {
        ij1.a(il1);
    }

    private void a(il il1)
    {
        Gs = il1.getApplicationMetadata();
        double d1 = il1.fE();
        int k;
        boolean flag;
        boolean flag1;
        if (d1 != (0.0D / 0.0D) && d1 != FA)
        {
            FA = d1;
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = il1.fM();
        if (flag1 != FB)
        {
            FB = flag1;
            flag = true;
        }
        Gr.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(Gz)
        });
        if (EO != null && (flag || Gz))
        {
            EO.onVolumeChanged();
        }
        k = il1.fN();
        if (k != GB)
        {
            GB = k;
            flag = true;
        } else
        {
            flag = false;
        }
        Gr.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(Gz)
        });
        if (EO != null && (flag || Gz))
        {
            EO.W(GB);
        }
        k = il1.fO();
        if (k != GC)
        {
            GC = k;
            flag = true;
        } else
        {
            flag = false;
        }
        Gr.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(Gz)
        });
        if (EO != null && (flag || Gz))
        {
            EO.X(GC);
        }
        Gz = false;
    }

    static com.google.android.gms.common.api.BaseImplementation.b b(ij ij1, com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        ij1.GK = b1;
        return b1;
    }

    static String b(ij ij1, String s)
    {
        ij1.GF = s;
        return s;
    }

    static void b(ij ij1)
    {
        ij1.fF();
    }

    private void c(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        synchronized (GL)
        {
            if (GJ != null)
            {
                GJ.b(new a(new Status(2002)));
            }
            GJ = b1;
        }
        return;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    static void c(ij ij1)
    {
        ij1.fB();
    }

    static com.google.android.gms.common.api.BaseImplementation.b d(ij ij1)
    {
        return ij1.GJ;
    }

    static com.google.android.gms.cast.Cast.Listener e(ij ij1)
    {
        return ij1.EO;
    }

    private void e(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
label0:
        {
            synchronized (GM)
            {
                if (GK == null)
                {
                    break label0;
                }
                b1.b(new Status(2001));
            }
            return;
        }
        GK = b1;
        obj;
        JVM INSTR monitorexit ;
        return;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    static Handler f(ij ij1)
    {
        return ij1.mHandler;
    }

    private void fB()
    {
        GA = false;
        GB = -1;
        GC = -1;
        Gs = null;
        Gx = null;
        FA = 0.0D;
        FB = false;
    }

    private void fF()
    {
        Gr.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (Gu)
        {
            Gu.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void fG()
        throws IllegalStateException
    {
        if (!GA || Gw == null || Gw.fL())
        {
            throw new IllegalStateException("Not connected to a device");
        } else
        {
            return;
        }
    }

    static ip fH()
    {
        return Gr;
    }

    static Object fI()
    {
        return GL;
    }

    static Object fJ()
    {
        return GM;
    }

    static Map g(ij ij1)
    {
        return ij1.Gu;
    }

    static CastDevice h(ij ij1)
    {
        return ij1.Gt;
    }

    static Map i(ij ij1)
    {
        return ij1.GH;
    }

    static com.google.android.gms.common.api.BaseImplementation.b j(ij ij1)
    {
        return ij1.GK;
    }

    public void G(boolean flag)
        throws IllegalStateException, RemoteException
    {
        ((in)gS()).a(flag, FA, FB);
    }

    protected in L(IBinder ibinder)
    {
        return in.a.M(ibinder);
    }

    public void a(double d1)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        if (Double.isInfinite(d1) || Double.isNaN(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d1).toString());
        } else
        {
            ((in)gS()).a(d1, FA, FB);
            return;
        }
    }

    protected void a(int k, IBinder ibinder, Bundle bundle)
    {
        Gr.b("in onPostInitHandler; statusCode=%d", new Object[] {
            Integer.valueOf(k)
        });
        int i1;
        if (k == 0 || k == 1001)
        {
            GA = true;
            Gy = true;
            Gz = true;
        } else
        {
            GA = false;
        }
        i1 = k;
        if (k == 1001)
        {
            GG = new Bundle();
            GG.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i1 = 0;
        }
        super.a(i1, ibinder, bundle);
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        Gr.b("getServiceFromBroker(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] {
            GE, GF
        });
        Gt.putInBundle(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", Gv);
        if (GE != null)
        {
            bundle.putString("last_application_id", GE);
            if (GF != null)
            {
                bundle.putString("last_session_id", GF);
            }
        }
        Gw = new c();
        l1.a(e1, 0x5e2978, getContext().getPackageName(), Gw.asBinder(), bundle);
    }

    public void a(String s, com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        ik.aF(s);
        aE(s);
        if (messagereceivedcallback != null)
        {
            synchronized (Gu)
            {
                Gu.put(s, messagereceivedcallback);
            }
            ((in)gS()).aI(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(String s, LaunchOptions launchoptions, com.google.android.gms.common.api.BaseImplementation.b b1)
        throws IllegalStateException, RemoteException
    {
        c(b1);
        ((in)gS()).a(s, launchoptions);
    }

    public void a(String s, com.google.android.gms.common.api.BaseImplementation.b b1)
        throws IllegalStateException, RemoteException
    {
        e(b1);
        ((in)gS()).aH(s);
    }

    public void a(String s, String s1, com.google.android.gms.common.api.BaseImplementation.b b1)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (s1.length() > 0x10000)
        {
            throw new IllegalArgumentException("Message exceeds maximum size");
        }
        ik.aF(s);
        fG();
        long l1 = GD.incrementAndGet();
        try
        {
            GH.put(Long.valueOf(l1), b1);
            ((in)gS()).a(s, s1, l1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GH.remove(Long.valueOf(l1));
        }
        throw s;
    }

    public void a(String s, boolean flag, com.google.android.gms.common.api.BaseImplementation.b b1)
        throws IllegalStateException, RemoteException
    {
        c(b1);
        ((in)gS()).f(s, flag);
    }

    public void aE(String s)
        throws IllegalArgumentException, RemoteException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
        synchronized (Gu)
        {
            messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)Gu.remove(s);
        }
        if (messagereceivedcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((in)gS()).aJ(s);
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        Gr.a(illegalstateexception, "Error unregistering namespace (%s): %s", new Object[] {
            s, illegalstateexception.getMessage()
        });
        return;
    }

    public void b(String s, String s1, com.google.android.gms.common.api.BaseImplementation.b b1)
        throws IllegalStateException, RemoteException
    {
        c(b1);
        ((in)gS()).l(s, s1);
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1)
        throws IllegalStateException, RemoteException
    {
        e(b1);
        ((in)gS()).fP();
    }

    public void disconnect()
    {
        Gr.b("disconnect(); ServiceListener=%s, isConnected=%b", new Object[] {
            Gw, Boolean.valueOf(isConnected())
        });
        c c1 = Gw;
        Gw = null;
        if (c1 == null || !c1.fK())
        {
            Gr.b("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        fF();
        if (isConnected() || isConnecting())
        {
            ((in)gS()).disconnect();
        }
        super.disconnect();
        return;
        Object obj;
        obj;
        Gr.a(((Throwable) (obj)), "Error while disconnecting the controller interface: %s", new Object[] {
            ((RemoteException) (obj)).getMessage()
        });
        super.disconnect();
        return;
        obj;
        super.disconnect();
        throw obj;
    }

    public Bundle fC()
    {
        if (GG != null)
        {
            Bundle bundle = GG;
            GG = null;
            return bundle;
        } else
        {
            return super.fC();
        }
    }

    public void fD()
        throws IllegalStateException, RemoteException
    {
        ((in)gS()).fD();
    }

    public double fE()
        throws IllegalStateException
    {
        fG();
        return FA;
    }

    public ApplicationMetadata getApplicationMetadata()
        throws IllegalStateException
    {
        fG();
        return Gs;
    }

    public String getApplicationStatus()
        throws IllegalStateException
    {
        fG();
        return Gx;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public boolean isMute()
        throws IllegalStateException
    {
        fG();
        return FB;
    }

    protected IInterface j(IBinder ibinder)
    {
        return L(ibinder);
    }

}
