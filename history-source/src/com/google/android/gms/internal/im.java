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
//            jl, is, ij, in, 
//            io, iq, jt

public final class im extends jl
{
    private static final class a
        implements com.google.android.gms.cast.Cast.ApplicationConnectionResult
    {

        private final Status Eb;
        private final ApplicationMetadata HD;
        private final String HE;
        private final boolean HF;
        private final String vZ;

        public ApplicationMetadata getApplicationMetadata()
        {
            return HD;
        }

        public String getApplicationStatus()
        {
            return HE;
        }

        public String getSessionId()
        {
            return vZ;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public boolean getWasLaunched()
        {
            return HF;
        }

        public a(Status status)
        {
            this(status, null, null, null, false);
        }

        public a(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
        {
            Eb = status;
            HD = applicationmetadata;
            HE = s;
            vZ = s1;
            HF = flag;
        }
    }

    private class b
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        final im HG;

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            im.b(HG);
        }

        private b()
        {
            HG = im.this;
            super();
        }

    }

    private class c extends ir.a
    {

        final im HG;
        private final AtomicBoolean HH;

        private boolean ah(int k)
        {
            Object obj = im.gf();
            obj;
            JVM INSTR monitorenter ;
            if (im.j(HG) == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            im.j(HG).b(new Status(k));
            im.b(HG, null);
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

        private void c(long l1, int k)
        {
            com.google.android.gms.common.api.BaseImplementation.b b1;
            synchronized (im.i(HG))
            {
                b1 = (com.google.android.gms.common.api.BaseImplementation.b)im.i(HG).remove(Long.valueOf(l1));
            }
            if (b1 != null)
            {
                b1.b(new Status(k));
            }
            return;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
        {
            if (HH.get())
            {
                return;
            }
            im.a(HG, applicationmetadata);
            im.a(HG, applicationmetadata.getApplicationId());
            im.b(HG, s1);
            synchronized (im.ge())
            {
                if (im.d(HG) != null)
                {
                    im.d(HG).b(new a(new Status(0), applicationmetadata, s, s1, flag));
                    im.a(HG, null);
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
            im.gd().b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
        }

        public void a(String s, long l1)
        {
            if (HH.get())
            {
                return;
            } else
            {
                c(l1, 0);
                return;
            }
        }

        public void a(String s, long l1, int k)
        {
            if (HH.get())
            {
                return;
            } else
            {
                c(l1, k);
                return;
            }
        }

        public void ad(int k)
        {
            if (gg())
            {
                im.gd().b("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                    Integer.valueOf(k)
                });
                if (k != 0)
                {
                    HG.aD(2);
                    return;
                }
            }
        }

        public void ae(int k)
        {
            if (HH.get())
            {
                return;
            }
            synchronized (im.ge())
            {
                if (im.d(HG) != null)
                {
                    im.d(HG).b(new a(new Status(k)));
                    im.a(HG, null);
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void af(int k)
        {
            if (HH.get())
            {
                return;
            } else
            {
                ah(k);
                return;
            }
        }

        public void ag(int k)
        {
            if (HH.get())
            {
                return;
            } else
            {
                ah(k);
                return;
            }
        }

        public void b(ij ij1)
        {
            if (HH.get())
            {
                return;
            } else
            {
                im.gd().b("onApplicationStatusChanged", new Object[0]);
                im.f(HG).post(new Runnable(this, ij1) {

                    final c HJ;
                    final ij HL;

                    public void run()
                    {
                        im.a(HJ.HG, HL);
                    }

            
            {
                HJ = c1;
                HL = ij1;
                super();
            }
                });
                return;
            }
        }

        public void b(io io1)
        {
            if (HH.get())
            {
                return;
            } else
            {
                im.gd().b("onDeviceStatusChanged", new Object[0]);
                im.f(HG).post(new Runnable(this, io1) {

                    final c HJ;
                    final io HK;

                    public void run()
                    {
                        im.a(HJ.HG, HK);
                    }

            
            {
                HJ = c1;
                HK = io1;
                super();
            }
                });
                return;
            }
        }

        public void b(String s, byte abyte0[])
        {
            if (HH.get())
            {
                return;
            } else
            {
                im.gd().b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] {
                    s, Integer.valueOf(abyte0.length)
                });
                return;
            }
        }

        public boolean gg()
        {
            if (HH.getAndSet(true))
            {
                return false;
            } else
            {
                im.c(HG);
                return true;
            }
        }

        public boolean gh()
        {
            return HH.get();
        }

        public void j(String s, String s1)
        {
            if (HH.get())
            {
                return;
            } else
            {
                im.gd().b("Receive (type=text, ns=%s) %s", new Object[] {
                    s, s1
                });
                im.f(HG).post(new Runnable(this, s, s1) {

                    final String Ft;
                    final c HJ;
                    final String HM;

                    public void run()
                    {
                        com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
                        synchronized (im.g(HJ.HG))
                        {
                            messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)im.g(HJ.HG).get(Ft);
                        }
                        if (messagereceivedcallback != null)
                        {
                            messagereceivedcallback.onMessageReceived(im.h(HJ.HG), Ft, HM);
                            return;
                        } else
                        {
                            im.gd().b("Discarded message for unknown namespace '%s'", new Object[] {
                                Ft
                            });
                            return;
                        }
                        exception;
                        map;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                HJ = c1;
                Ft = s;
                HM = s1;
                super();
            }
                });
                return;
            }
        }

        public void onApplicationDisconnected(int k)
        {
            if (!HH.get())
            {
                im.a(HG, null);
                im.b(HG, null);
                ah(k);
                if (im.e(HG) != null)
                {
                    im.f(HG).post(new Runnable(this, k) {

                        final int HI;
                        final c HJ;

                        public void run()
                        {
                            if (im.e(HJ.HG) != null)
                            {
                                im.e(HJ.HG).onApplicationDisconnected(HI);
                            }
                        }

            
            {
                HJ = c1;
                HI = k;
                super();
            }
                    });
                    return;
                }
            }
        }

        private c()
        {
            HG = im.this;
            super();
            HH = new AtomicBoolean(false);
        }

    }


    private static final Object HB = new Object();
    private static final Object HC = new Object();
    private static final is Hh = new is("CastClientImpl");
    private final com.google.android.gms.cast.Cast.Listener FD;
    private double Gp;
    private boolean Gq;
    private com.google.android.gms.common.api.BaseImplementation.b HA;
    private ApplicationMetadata Hi;
    private final CastDevice Hj;
    private final Map Hk = new HashMap();
    private final long Hl;
    private c Hm;
    private String Hn;
    private boolean Ho;
    private boolean Hp;
    private boolean Hq;
    private int Hr;
    private int Hs;
    private final AtomicLong Ht = new AtomicLong(0L);
    private String Hu;
    private String Hv;
    private Bundle Hw;
    private final Map Hx = new HashMap();
    private final b Hy = new b();
    private com.google.android.gms.common.api.BaseImplementation.b Hz;
    private final Handler mHandler;

    public im(Context context, Looper looper, CastDevice castdevice, long l1, com.google.android.gms.cast.Cast.Listener listener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, (String[])null);
        Hj = castdevice;
        FD = listener;
        Hl = l1;
        mHandler = new Handler(looper);
        fW();
        registerConnectionFailedListener(Hy);
    }

    static ApplicationMetadata a(im im1, ApplicationMetadata applicationmetadata)
    {
        im1.Hi = applicationmetadata;
        return applicationmetadata;
    }

    static com.google.android.gms.common.api.BaseImplementation.b a(im im1, com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        im1.Hz = b1;
        return b1;
    }

    static String a(im im1, String s)
    {
        im1.Hu = s;
        return s;
    }

    private void a(ij ij1)
    {
        ij1 = ij1.fT();
        boolean flag;
        if (!in.a(ij1, Hn))
        {
            Hn = ij1;
            flag = true;
        } else
        {
            flag = false;
        }
        Hh.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(Ho)
        });
        if (FD != null && (flag || Ho))
        {
            FD.onApplicationStatusChanged();
        }
        Ho = false;
    }

    static void a(im im1, ij ij1)
    {
        im1.a(ij1);
    }

    static void a(im im1, io io1)
    {
        im1.a(io1);
    }

    private void a(io io1)
    {
        ApplicationMetadata applicationmetadata = io1.getApplicationMetadata();
        if (!in.a(applicationmetadata, Hi))
        {
            Hi = applicationmetadata;
            FD.onApplicationMetadataChanged(Hi);
        }
        double d1 = io1.fZ();
        int k;
        boolean flag;
        boolean flag1;
        if (d1 != (0.0D / 0.0D) && d1 != Gp)
        {
            Gp = d1;
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = io1.gi();
        if (flag1 != Gq)
        {
            Gq = flag1;
            flag = true;
        }
        Hh.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(Hp)
        });
        if (FD != null && (flag || Hp))
        {
            FD.onVolumeChanged();
        }
        k = io1.gj();
        if (k != Hr)
        {
            Hr = k;
            flag = true;
        } else
        {
            flag = false;
        }
        Hh.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(Hp)
        });
        if (FD != null && (flag || Hp))
        {
            FD.X(Hr);
        }
        k = io1.gk();
        if (k != Hs)
        {
            Hs = k;
            flag = true;
        } else
        {
            flag = false;
        }
        Hh.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(Hp)
        });
        if (FD != null && (flag || Hp))
        {
            FD.Y(Hs);
        }
        Hp = false;
    }

    static com.google.android.gms.common.api.BaseImplementation.b b(im im1, com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        im1.HA = b1;
        return b1;
    }

    static String b(im im1, String s)
    {
        im1.Hv = s;
        return s;
    }

    static void b(im im1)
    {
        im1.ga();
    }

    private void c(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        synchronized (HB)
        {
            if (Hz != null)
            {
                Hz.b(new a(new Status(2002)));
            }
            Hz = b1;
        }
        return;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    static void c(im im1)
    {
        im1.fW();
    }

    static com.google.android.gms.common.api.BaseImplementation.b d(im im1)
    {
        return im1.Hz;
    }

    static com.google.android.gms.cast.Cast.Listener e(im im1)
    {
        return im1.FD;
    }

    private void e(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
label0:
        {
            synchronized (HC)
            {
                if (HA == null)
                {
                    break label0;
                }
                b1.b(new Status(2001));
            }
            return;
        }
        HA = b1;
        obj;
        JVM INSTR monitorexit ;
        return;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    static Handler f(im im1)
    {
        return im1.mHandler;
    }

    private void fW()
    {
        Hq = false;
        Hr = -1;
        Hs = -1;
        Hi = null;
        Hn = null;
        Gp = 0.0D;
        Gq = false;
    }

    static Map g(im im1)
    {
        return im1.Hk;
    }

    private void ga()
    {
        Hh.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (Hk)
        {
            Hk.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void gb()
        throws IllegalStateException
    {
        if (!Hq || Hm == null || Hm.gh())
        {
            throw new IllegalStateException("Not connected to a device");
        } else
        {
            return;
        }
    }

    static is gd()
    {
        return Hh;
    }

    static Object ge()
    {
        return HB;
    }

    static Object gf()
    {
        return HC;
    }

    static CastDevice h(im im1)
    {
        return im1.Hj;
    }

    static Map i(im im1)
    {
        return im1.Hx;
    }

    static com.google.android.gms.common.api.BaseImplementation.b j(im im1)
    {
        return im1.HA;
    }

    public void I(boolean flag)
        throws IllegalStateException, RemoteException
    {
        ((iq)hw()).a(flag, Gp, Gq);
    }

    protected iq L(IBinder ibinder)
    {
        return iq.a.M(ibinder);
    }

    public void a(double d1)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        if (Double.isInfinite(d1) || Double.isNaN(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d1).toString());
        } else
        {
            ((iq)hw()).a(d1, Gp, Gq);
            return;
        }
    }

    protected void a(int k, IBinder ibinder, Bundle bundle)
    {
        Hh.b("in onPostInitHandler; statusCode=%d", new Object[] {
            Integer.valueOf(k)
        });
        int i1;
        if (k == 0 || k == 1001)
        {
            Hq = true;
            Ho = true;
            Hp = true;
        } else
        {
            Hq = false;
        }
        i1 = k;
        if (k == 1001)
        {
            Hw = new Bundle();
            Hw.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i1 = 0;
        }
        super.a(i1, ibinder, bundle);
    }

    protected void a(jt jt1, jl.e e1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        Hh.b("getServiceFromBroker(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] {
            Hu, Hv
        });
        Hj.putInBundle(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", Hl);
        if (Hu != null)
        {
            bundle.putString("last_application_id", Hu);
            if (Hv != null)
            {
                bundle.putString("last_session_id", Hv);
            }
        }
        Hm = new c();
        jt1.a(e1, 0x648278, getContext().getPackageName(), Hm.asBinder(), bundle);
    }

    public void a(String s, com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        in.aF(s);
        aE(s);
        if (messagereceivedcallback != null)
        {
            synchronized (Hk)
            {
                Hk.put(s, messagereceivedcallback);
            }
            ((iq)hw()).aI(s);
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
        ((iq)hw()).a(s, launchoptions);
    }

    public void a(String s, com.google.android.gms.common.api.BaseImplementation.b b1)
        throws IllegalStateException, RemoteException
    {
        e(b1);
        ((iq)hw()).aH(s);
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
        in.aF(s);
        gb();
        long l1 = Ht.incrementAndGet();
        try
        {
            Hx.put(Long.valueOf(l1), b1);
            ((iq)hw()).a(s, s1, l1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Hx.remove(Long.valueOf(l1));
        }
        throw s;
    }

    public void a(String s, boolean flag, com.google.android.gms.common.api.BaseImplementation.b b1)
        throws IllegalStateException, RemoteException
    {
        c(b1);
        ((iq)hw()).g(s, flag);
    }

    public void aE(String s)
        throws IllegalArgumentException, RemoteException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
        synchronized (Hk)
        {
            messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)Hk.remove(s);
        }
        if (messagereceivedcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((iq)hw()).aJ(s);
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        Hh.a(illegalstateexception, "Error unregistering namespace (%s): %s", new Object[] {
            s, illegalstateexception.getMessage()
        });
        return;
    }

    public void b(String s, String s1, com.google.android.gms.common.api.BaseImplementation.b b1)
        throws IllegalStateException, RemoteException
    {
        c(b1);
        ((iq)hw()).k(s, s1);
    }

    protected String bK()
    {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    protected String bL()
    {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1)
        throws IllegalStateException, RemoteException
    {
        e(b1);
        ((iq)hw()).gl();
    }

    public void disconnect()
    {
        Hh.b("disconnect(); ServiceListener=%s, isConnected=%b", new Object[] {
            Hm, Boolean.valueOf(isConnected())
        });
        c c1 = Hm;
        Hm = null;
        if (c1 == null || !c1.gg())
        {
            Hh.b("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        ga();
        if (isConnected() || isConnecting())
        {
            ((iq)hw()).disconnect();
        }
        super.disconnect();
        return;
        Object obj;
        obj;
        Hh.a(((Throwable) (obj)), "Error while disconnecting the controller interface: %s", new Object[] {
            ((RemoteException) (obj)).getMessage()
        });
        super.disconnect();
        return;
        obj;
        super.disconnect();
        throw obj;
    }

    public Bundle fX()
    {
        if (Hw != null)
        {
            Bundle bundle = Hw;
            Hw = null;
            return bundle;
        } else
        {
            return super.fX();
        }
    }

    public void fY()
        throws IllegalStateException, RemoteException
    {
        ((iq)hw()).fY();
    }

    public double fZ()
        throws IllegalStateException
    {
        gb();
        return Gp;
    }

    public ApplicationMetadata getApplicationMetadata()
        throws IllegalStateException
    {
        gb();
        return Hi;
    }

    public String getApplicationStatus()
        throws IllegalStateException
    {
        gb();
        return Hn;
    }

    public boolean isMute()
        throws IllegalStateException
    {
        gb();
        return Gq;
    }

    protected IInterface l(IBinder ibinder)
    {
        return L(ibinder);
    }

}
