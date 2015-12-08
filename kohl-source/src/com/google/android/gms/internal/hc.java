// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            hn, hd, he, hj

public abstract class hc
    implements com.google.android.gms.common.api.Api.a, hd.b
{
    final class a extends Handler
    {

        final hc Gf;

        public void handleMessage(Message message)
        {
            if (message.what == 1 && !Gf.isConnecting())
            {
                message = (b)message.obj;
                message.fp();
                message.unregister();
                return;
            }
            if (message.what == 3)
            {
                hc.a(Gf).a(new ConnectionResult(((Integer)message.obj).intValue(), null));
                return;
            }
            if (message.what == 4)
            {
                hc.a(Gf, 1);
                hc.a(Gf, null);
                hc.a(Gf).ao(((Integer)message.obj).intValue());
                return;
            }
            if (message.what == 2 && !Gf.isConnected())
            {
                message = (b)message.obj;
                message.fp();
                message.unregister();
                return;
            }
            if (message.what == 2 || message.what == 1)
            {
                ((b)message.obj).fq();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public a(Looper looper)
        {
            Gf = hc.this;
            super(looper);
        }
    }

    protected abstract class b
    {

        final hc Gf;
        private boolean Gg;
        private Object mListener;

        protected abstract void d(Object obj);

        protected abstract void fp();

        public void fq()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = mListener;
            if (Gg)
            {
                Log.w("GmsClient", (new StringBuilder()).append("Callback proxy ").append(this).append(" being reused. This is not safe.").toString());
            }
            this;
            JVM INSTR monitorexit ;
            Object obj1;
            if (obj != null)
            {
                try
                {
                    d(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    fp();
                    throw obj1;
                }
            } else
            {
                fp();
            }
            this;
            JVM INSTR monitorenter ;
            Gg = true;
            this;
            JVM INSTR monitorexit ;
            unregister();
            return;
            obj1;
            this;
            JVM INSTR monitorexit ;
            throw obj1;
            obj1;
            this;
            JVM INSTR monitorexit ;
            throw obj1;
        }

        public void fr()
        {
            this;
            JVM INSTR monitorenter ;
            mListener = null;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void unregister()
        {
            fr();
            synchronized (hc.b(Gf))
            {
                hc.b(Gf).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public b(Object obj)
        {
            Gf = hc.this;
            super();
            mListener = obj;
            Gg = false;
        }
    }

    public static final class c
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    {

        private final com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks Gh;

        public boolean equals(Object obj)
        {
            if (obj instanceof c)
            {
                return Gh.equals(((c)obj).Gh);
            } else
            {
                return Gh.equals(obj);
            }
        }

        public void onConnected(Bundle bundle)
        {
            Gh.onConnected(bundle);
        }

        public void onConnectionSuspended(int i)
        {
            Gh.onDisconnected();
        }

        public c(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
        {
            Gh = connectioncallbacks;
        }
    }

    public abstract class d extends b
    {

        private final DataHolder DD;
        final hc Gf;

        protected abstract void a(Object obj, DataHolder dataholder);

        protected final void d(Object obj)
        {
            a(obj, DD);
        }

        protected void fp()
        {
            if (DD != null)
            {
                DD.close();
            }
        }

        public volatile void fq()
        {
            super.fq();
        }

        public volatile void fr()
        {
            super.fr();
        }

        public volatile void unregister()
        {
            super.unregister();
        }

        public d(Object obj, DataHolder dataholder)
        {
            Gf = hc.this;
            super(obj);
            DD = dataholder;
        }
    }

    public static final class e extends hi.a
    {

        private hc Gi;

        public void b(int i, IBinder ibinder, Bundle bundle)
        {
            hn.b("onPostInitComplete can be called only once per call to getServiceFromBroker", Gi);
            Gi.a(i, ibinder, bundle);
            Gi = null;
        }

        public e(hc hc1)
        {
            Gi = hc1;
        }
    }

    final class f
        implements ServiceConnection
    {

        final hc Gf;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            Gf.I(ibinder);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            Gf.mHandler.sendMessage(Gf.mHandler.obtainMessage(4, Integer.valueOf(1)));
        }

        f()
        {
            Gf = hc.this;
            super();
        }
    }

    public static final class g
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        private final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener Gj;

        public boolean equals(Object obj)
        {
            if (obj instanceof g)
            {
                return Gj.equals(((g)obj).Gj);
            } else
            {
                return Gj.equals(obj);
            }
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            Gj.onConnectionFailed(connectionresult);
        }

        public g(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            Gj = onconnectionfailedlistener;
        }
    }

    protected final class h extends b
    {

        final hc Gf;
        public final Bundle Gk;
        public final IBinder Gl;
        public final int statusCode;

        protected void b(Boolean boolean1)
        {
            if (boolean1 == null)
            {
                hc.a(Gf, 1);
                return;
            }
            switch (statusCode)
            {
            default:
                if (Gk != null)
                {
                    boolean1 = (PendingIntent)Gk.getParcelable("pendingIntent");
                } else
                {
                    boolean1 = null;
                }
                if (hc.d(Gf) != null)
                {
                    he.B(hc.e(Gf)).b(Gf.bp(), hc.d(Gf));
                    hc.a(Gf, null);
                }
                hc.a(Gf, 1);
                hc.a(Gf, null);
                hc.a(Gf).a(new ConnectionResult(statusCode, boolean1));
                return;

            case 0: // '\0'
                try
                {
                    boolean1 = Gl.getInterfaceDescriptor();
                    if (Gf.bq().equals(boolean1))
                    {
                        hc.a(Gf, Gf.x(Gl));
                        if (hc.c(Gf) != null)
                        {
                            hc.a(Gf, 3);
                            hc.a(Gf).ck();
                            return;
                        }
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Boolean boolean1) { }
                he.B(hc.e(Gf)).b(Gf.bp(), hc.d(Gf));
                hc.a(Gf, null);
                hc.a(Gf, 1);
                hc.a(Gf, null);
                hc.a(Gf).a(new ConnectionResult(8, null));
                return;

            case 10: // '\n'
                hc.a(Gf, 1);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
        }

        protected void d(Object obj)
        {
            b((Boolean)obj);
        }

        protected void fp()
        {
        }

        public h(int i, IBinder ibinder, Bundle bundle)
        {
            Gf = hc.this;
            super(Boolean.valueOf(true));
            statusCode = i;
            Gl = ibinder;
            Gk = bundle;
        }
    }


    public static final String Ge[] = {
        "service_esmobile", "service_googleme"
    };
    private final Looper DC;
    private final hd DP;
    private IInterface FY;
    private final ArrayList FZ;
    private f Ga;
    private volatile int Gb;
    private final String Gc[];
    boolean Gd;
    private final Context mContext;
    final Handler mHandler;

    protected transient hc(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        FZ = new ArrayList();
        Gb = 1;
        Gd = false;
        mContext = (Context)hn.f(context);
        DC = (Looper)hn.b(looper, "Looper must not be null");
        DP = new hd(context, looper, this);
        mHandler = new a(looper);
        b(as);
        Gc = as;
        registerConnectionCallbacks((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)hn.f(connectioncallbacks));
        registerConnectionFailedListener((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)hn.f(onconnectionfailedlistener));
    }

    protected transient hc(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        this(context, context.getMainLooper(), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (new c(connectioncallbacks))), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (new g(onconnectionfailedlistener))), as);
    }

    static IInterface a(hc hc1, IInterface iinterface)
    {
        hc1.FY = iinterface;
        return iinterface;
    }

    static f a(hc hc1, f f1)
    {
        hc1.Ga = f1;
        return f1;
    }

    static hd a(hc hc1)
    {
        return hc1.DP;
    }

    static void a(hc hc1, int i)
    {
        hc1.am(i);
    }

    private void am(int i)
    {
        int j = Gb;
        Gb = i;
        if (j != i)
        {
            if (i == 3)
            {
                onConnected();
            } else
            if (j == 3 && i == 1)
            {
                onDisconnected();
                return;
            }
        }
    }

    static ArrayList b(hc hc1)
    {
        return hc1.FZ;
    }

    static IInterface c(hc hc1)
    {
        return hc1.FY;
    }

    static f d(hc hc1)
    {
        return hc1.Ga;
    }

    static Context e(hc hc1)
    {
        return hc1.mContext;
    }

    protected final void I(IBinder ibinder)
    {
        try
        {
            a(hj.a.L(ibinder), new e(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "service died");
        }
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, new h(i, ibinder, bundle)));
    }

    public final void a(b b1)
    {
        synchronized (FZ)
        {
            FZ.add(b1);
        }
        mHandler.sendMessage(mHandler.obtainMessage(2, b1));
        return;
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    protected abstract void a(hj hj, e e1)
        throws RemoteException;

    public void an(int i)
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, Integer.valueOf(i)));
    }

    protected transient void b(String as[])
    {
    }

    protected abstract String bp();

    protected abstract String bq();

    protected final void ci()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public void connect()
    {
        Gd = true;
        am(2);
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i != 0)
        {
            am(1);
            mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(i)));
        } else
        {
            if (Ga != null)
            {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
                FY = null;
                he.B(mContext).b(bp(), Ga);
            }
            Ga = new f();
            if (!he.B(mContext).a(bp(), Ga))
            {
                Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(bp()).toString());
                mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
    }

    public void disconnect()
    {
        Gd = false;
        ArrayList arraylist = FZ;
        arraylist;
        JVM INSTR monitorenter ;
        int j = FZ.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)FZ.get(i)).fr();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        FZ.clear();
        arraylist;
        JVM INSTR monitorexit ;
        am(1);
        FY = null;
        if (Ga != null)
        {
            he.B(mContext).b(bp(), Ga);
            Ga = null;
        }
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean eJ()
    {
        return Gd;
    }

    public Bundle ea()
    {
        return null;
    }

    public final String[] fn()
    {
        return Gc;
    }

    public final IInterface fo()
    {
        ci();
        return FY;
    }

    public final Context getContext()
    {
        return mContext;
    }

    public final Looper getLooper()
    {
        return DC;
    }

    public boolean isConnected()
    {
        return Gb == 3;
    }

    public boolean isConnecting()
    {
        return Gb == 2;
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return DP.isConnectionCallbacksRegistered(new c(connectioncallbacks));
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return DP.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    protected void onConnected()
    {
    }

    protected void onDisconnected()
    {
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        DP.registerConnectionCallbacks(new c(connectioncallbacks));
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        DP.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        DP.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        DP.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        DP.unregisterConnectionCallbacks(new c(connectioncallbacks));
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        DP.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    protected abstract IInterface x(IBinder ibinder);

}
