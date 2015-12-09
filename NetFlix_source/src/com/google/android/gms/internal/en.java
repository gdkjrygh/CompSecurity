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
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.android.gms.internal:
//            ff, er, eo, ep, 
//            eq, fm

public final class en extends ff
{
    private static final class a
        implements com.google.android.gms.cast.Cast.ApplicationConnectionResult
    {

        private final String qL;
        private final Status wJ;
        private final String zA;
        private final boolean zB;
        private final ApplicationMetadata zz;

        public ApplicationMetadata getApplicationMetadata()
        {
            return zz;
        }

        public String getApplicationStatus()
        {
            return zA;
        }

        public String getSessionId()
        {
            return qL;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public boolean getWasLaunched()
        {
            return zB;
        }

        public a(Status status)
        {
            this(status, null, null, null, false);
        }

        public a(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
        {
            wJ = status;
            zz = applicationmetadata;
            zA = s;
            qL = s1;
            zB = flag;
        }
    }

    private class b
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        final en zu;

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            en.i(zu);
        }

        private b()
        {
            zu = en.this;
            super();
        }

    }


    private static final er zb = new er("CastClientImpl");
    private static final Object zs = new Object();
    private static final Object zt = new Object();
    private final Handler mHandler;
    private final com.google.android.gms.cast.Cast.Listener xX;
    private double yC;
    private boolean yD;
    private ApplicationMetadata zc;
    private final CastDevice zd;
    private final eq ze = new eq.a() {

        final en zu;

        private boolean D(int j)
        {
            Object obj = en.dN();
            obj;
            JVM INSTR monitorenter ;
            if (en.h(zu) == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            en.h(zu).b(new Status(j));
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

        private void b(long l1, int j)
        {
            com.google.android.gms.common.api.a.d d1;
            synchronized (en.g(zu))
            {
                d1 = (com.google.android.gms.common.api.a.d)en.g(zu).remove(Long.valueOf(l1));
            }
            if (d1 != null)
            {
                d1.b(new Status(j));
            }
            return;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void A(int j)
        {
            synchronized (en.dM())
            {
                if (en.b(zu) != null)
                {
                    en.b(zu).b(new a(new Status(j)));
                    en.a(zu, null);
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void B(int j)
        {
            D(j);
        }

        public void C(int j)
        {
            D(j);
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
                    en.b(zu).b(new a(new Status(0), applicationmetadata, s, s1, flag));
                    en.a(zu, null);
                }
            }
            return;
            applicationmetadata;
            obj;
            JVM INSTR monitorexit ;
            throw applicationmetadata;
        }

        public void a(String s, long l1)
        {
            b(l1, 0);
        }

        public void a(String s, long l1, int j)
        {
            b(l1, j);
        }

        public void b(String s, double d1, boolean flag)
        {
            en.d(zu).post(new Runnable(this, s, d1, flag) {

                final double yQ;
                final boolean yR;
                final _cls1 zw;
                final String zx;

                public void run()
                {
                    en.a(zw.zu, zx, yQ, yR);
                }

            
            {
                zw = _pcls1;
                zx = s;
                yQ = d1;
                yR = flag;
                super();
            }
            });
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
            en.d(zu).post(new Runnable(this, s, s1) {

                final String xN;
                final _cls1 zw;
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
                zw = _pcls1;
                xN = s;
                zy = s1;
                super();
            }
            });
        }

        public void onApplicationDisconnected(int j)
        {
            en.a(zu, null);
            en.b(zu, null);
            while (D(j) || en.c(zu) == null) 
            {
                return;
            }
            en.d(zu).post(new Runnable(this, j) {

                final int zv;
                final _cls1 zw;

                public void run()
                {
                    if (en.c(zw.zu) != null)
                    {
                        en.c(zw.zu).onApplicationDisconnected(zv);
                    }
                }

            
            {
                zw = _pcls1;
                zv = j;
                super();
            }
            });
        }

        public void z(int j)
        {
            en.dL().b("ICastDeviceControllerListener.onDisconnected: %d", new Object[] {
                Integer.valueOf(j)
            });
            en.a(zu, false);
            en.a(zu, null);
            if (j != 0)
            {
                zu.N(2);
            }
        }

            
            {
                zu = en.this;
                super();
            }
    };
    private final Map zf = new HashMap();
    private final long zg;
    private String zh;
    private boolean zi;
    private boolean zj;
    private final AtomicLong zk = new AtomicLong(0L);
    private String zl;
    private String zm;
    private Bundle zn;
    private Map zo;
    private b zp;
    private com.google.android.gms.common.api.a.d zq;
    private com.google.android.gms.common.api.a.d zr;

    public en(Context context, Looper looper, CastDevice castdevice, long l, com.google.android.gms.cast.Cast.Listener listener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, (String[])null);
        zd = castdevice;
        xX = listener;
        zg = l;
        mHandler = new Handler(looper);
        zj = false;
        zc = null;
        zh = null;
        yC = 0.0D;
        yD = false;
        zo = new HashMap();
        zp = new b();
        registerConnectionFailedListener(zp);
    }

    static ApplicationMetadata a(en en1, ApplicationMetadata applicationmetadata)
    {
        en1.zc = applicationmetadata;
        return applicationmetadata;
    }

    static com.google.android.gms.common.api.a.d a(en en1, com.google.android.gms.common.api.a.d d1)
    {
        en1.zq = d1;
        return d1;
    }

    static String a(en en1, String s)
    {
        en1.zl = s;
        return s;
    }

    static void a(en en1, String s, double d1, boolean flag)
    {
        en1.a(s, d1, flag);
    }

    private void a(String s, double d1, boolean flag)
    {
        boolean flag1;
        boolean flag2;
        if (!eo.a(s, zh))
        {
            zh = s;
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (xX != null && (flag1 || zi))
        {
            xX.onApplicationStatusChanged();
        }
        if (d1 != yC)
        {
            yC = d1;
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag != yD)
        {
            yD = flag;
            flag2 = true;
        }
        zb.b("hasChange=%b, mFirstStatusUpdate=%b", new Object[] {
            Boolean.valueOf(flag2), Boolean.valueOf(zi)
        });
        if (xX != null && (flag2 || zi))
        {
            xX.onVolumeChanged();
        }
        zi = false;
    }

    static boolean a(en en1, boolean flag)
    {
        en1.zj = flag;
        return flag;
    }

    static com.google.android.gms.common.api.a.d b(en en1)
    {
        return en1.zq;
    }

    static com.google.android.gms.common.api.a.d b(en en1, com.google.android.gms.common.api.a.d d1)
    {
        en1.zr = d1;
        return d1;
    }

    static String b(en en1, String s)
    {
        en1.zm = s;
        return s;
    }

    static com.google.android.gms.cast.Cast.Listener c(en en1)
    {
        return en1.xX;
    }

    static Handler d(en en1)
    {
        return en1.mHandler;
    }

    private void d(com.google.android.gms.common.api.a.d d1)
    {
        synchronized (zs)
        {
            if (zq != null)
            {
                zq.b(new a(new Status(2002)));
            }
            zq = d1;
        }
        return;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    private void dJ()
    {
        zb.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (zf)
        {
            zf.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void dK()
        throws IllegalStateException
    {
        if (!zj)
        {
            throw new IllegalStateException("not connected to a device");
        } else
        {
            return;
        }
    }

    static er dL()
    {
        return zb;
    }

    static Object dM()
    {
        return zs;
    }

    static Object dN()
    {
        return zt;
    }

    static Map e(en en1)
    {
        return en1.zf;
    }

    static CastDevice f(en en1)
    {
        return en1.zd;
    }

    private void f(com.google.android.gms.common.api.a.d d1)
    {
label0:
        {
            synchronized (zt)
            {
                if (zr == null)
                {
                    break label0;
                }
                d1.b(new Status(2001));
            }
            return;
        }
        zr = d1;
        obj;
        JVM INSTR monitorexit ;
        return;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    static Map g(en en1)
    {
        return en1.zo;
    }

    static com.google.android.gms.common.api.a.d h(en en1)
    {
        return en1.zr;
    }

    static void i(en en1)
    {
        en1.dJ();
    }

    public void V(String s)
        throws IllegalArgumentException, RemoteException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback;
        synchronized (zf)
        {
            messagereceivedcallback = (com.google.android.gms.cast.Cast.MessageReceivedCallback)zf.remove(s);
        }
        if (messagereceivedcallback == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ((ep)eM()).aa(s);
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        zb.a(illegalstateexception, "Error unregistering namespace (%s): %s", new Object[] {
            s, illegalstateexception.getMessage()
        });
        return;
    }

    public void a(double d1)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        if (Double.isInfinite(d1) || Double.isNaN(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d1).toString());
        } else
        {
            ((ep)eM()).a(d1, yC, yD);
            return;
        }
    }

    protected void a(int j, IBinder ibinder, Bundle bundle)
    {
        int k;
        if (j == 0 || j == 1001)
        {
            zj = true;
            zi = true;
        } else
        {
            zj = false;
        }
        k = j;
        if (j == 1001)
        {
            zn = new Bundle();
            zn.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            k = 0;
        }
        super.a(k, ibinder, bundle);
    }

    protected void a(fm fm1, ff.e e1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        zb.b("getServiceFromBroker(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] {
            zl, zm
        });
        zd.putInBundle(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", zg);
        if (zl != null)
        {
            bundle.putString("last_application_id", zl);
            if (zm != null)
            {
                bundle.putString("last_session_id", zm);
            }
        }
        fm1.a(e1, 0x43eea0, getContext().getPackageName(), ze.asBinder(), bundle);
    }

    public void a(String s, com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback)
        throws IllegalArgumentException, IllegalStateException, RemoteException
    {
        eo.W(s);
        V(s);
        if (messagereceivedcallback != null)
        {
            synchronized (zf)
            {
                zf.put(s, messagereceivedcallback);
            }
            ((ep)eM()).Z(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(String s, com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        f(d1);
        ((ep)eM()).Y(s);
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
            eo.W(s);
            dK();
            long l = zk.incrementAndGet();
            ((ep)eM()).a(s, s1, l);
            zo.put(Long.valueOf(l), d1);
            return;
        }
    }

    public void a(String s, boolean flag, com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        d(d1);
        ((ep)eM()).e(s, flag);
    }

    public void b(String s, String s1, com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        d(d1);
        ((ep)eM()).e(s, s1);
    }

    protected String bg()
    {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    protected String bh()
    {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    public Bundle dG()
    {
        if (zn != null)
        {
            Bundle bundle = zn;
            zn = null;
            return bundle;
        } else
        {
            return super.dG();
        }
    }

    public void dH()
        throws IllegalStateException, RemoteException
    {
        ((ep)eM()).dH();
    }

    public double dI()
        throws IllegalStateException
    {
        dK();
        return yC;
    }

    public void disconnect()
    {
        dJ();
        if (isConnected())
        {
            ((ep)eM()).disconnect();
        }
        super.disconnect();
        return;
        Object obj;
        obj;
        zb.b("Error while disconnecting the controller interface: %s", new Object[] {
            ((RemoteException) (obj)).getMessage()
        });
        super.disconnect();
        return;
        obj;
        super.disconnect();
        throw obj;
    }

    public void e(com.google.android.gms.common.api.a.d d1)
        throws IllegalStateException, RemoteException
    {
        f(d1);
        ((ep)eM()).dO();
    }

    public ApplicationMetadata getApplicationMetadata()
        throws IllegalStateException
    {
        dK();
        return zc;
    }

    public String getApplicationStatus()
        throws IllegalStateException
    {
        dK();
        return zh;
    }

    public boolean isMute()
        throws IllegalStateException
    {
        dK();
        return yD;
    }

    protected IInterface r(IBinder ibinder)
    {
        return x(ibinder);
    }

    public void v(boolean flag)
        throws IllegalStateException, RemoteException
    {
        ((ep)eM()).a(flag, yC, yD);
    }

    protected ep x(IBinder ibinder)
    {
        return ep.a.y(ibinder);
    }

}
