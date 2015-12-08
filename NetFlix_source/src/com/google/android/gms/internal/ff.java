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
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            fq, fg, fh, fm

public abstract class ff
    implements GooglePlayServicesClient, com.google.android.gms.common.api.Api.a, fg.b
{
    final class a extends Handler
    {

        final ff Dh;

        public void handleMessage(Message message)
        {
            if (message.what == 1 && !Dh.isConnecting())
            {
                message = (b)message.obj;
                message.dx();
                message.unregister();
                return;
            }
            if (message.what == 3)
            {
                ff.a(Dh).a(new ConnectionResult(((Integer)message.obj).intValue(), null));
                return;
            }
            if (message.what == 4)
            {
                ff.a(Dh, 1);
                ff.a(Dh, null);
                ff.a(Dh).O(((Integer)message.obj).intValue());
                return;
            }
            if (message.what == 2 && !Dh.isConnected())
            {
                message = (b)message.obj;
                message.dx();
                message.unregister();
                return;
            }
            if (message.what == 2 || message.what == 1)
            {
                ((b)message.obj).eN();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public a(Looper looper)
        {
            Dh = ff.this;
            super(looper);
        }
    }

    protected abstract class b
    {

        final ff Dh;
        private boolean Di;
        private Object mListener;

        protected abstract void a(Object obj);

        protected abstract void dx();

        public void eN()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = mListener;
            if (Di)
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
                    a(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    dx();
                    throw obj1;
                }
            } else
            {
                dx();
            }
            this;
            JVM INSTR monitorenter ;
            Di = true;
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

        public void eO()
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
            eO();
            synchronized (ff.b(Dh))
            {
                ff.b(Dh).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public b(Object obj)
        {
            Dh = ff.this;
            super();
            mListener = obj;
            Di = false;
        }
    }

    public static final class c
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    {

        private final com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks Dj;

        public boolean equals(Object obj)
        {
            if (obj instanceof c)
            {
                return Dj.equals(((c)obj).Dj);
            } else
            {
                return Dj.equals(obj);
            }
        }

        public void onConnected(Bundle bundle)
        {
            Dj.onConnected(bundle);
        }

        public void onConnectionSuspended(int i)
        {
            Dj.onDisconnected();
        }

        public c(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
        {
            Dj = connectioncallbacks;
        }
    }

    public abstract class d extends b
    {

        private final DataHolder BB;
        final ff Dh;

        protected final void a(Object obj)
        {
            a(obj, BB);
        }

        protected abstract void a(Object obj, DataHolder dataholder);

        protected void dx()
        {
            if (BB != null)
            {
                BB.close();
            }
        }

        public volatile void eN()
        {
            super.eN();
        }

        public volatile void eO()
        {
            super.eO();
        }

        public volatile void unregister()
        {
            super.unregister();
        }

        public d(Object obj, DataHolder dataholder)
        {
            Dh = ff.this;
            super(obj);
            BB = dataholder;
        }
    }

    public static final class e extends fl.a
    {

        private ff Dk;

        public void b(int i, IBinder ibinder, Bundle bundle)
        {
            fq.b("onPostInitComplete can be called only once per call to getServiceFromBroker", Dk);
            Dk.a(i, ibinder, bundle);
            Dk = null;
        }

        public e(ff ff1)
        {
            Dk = ff1;
        }
    }

    final class f
        implements ServiceConnection
    {

        final ff Dh;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            Dh.z(ibinder);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            Dh.mHandler.sendMessage(Dh.mHandler.obtainMessage(4, Integer.valueOf(1)));
        }

        f()
        {
            Dh = ff.this;
            super();
        }
    }

    public static final class g
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        private final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener Dl;

        public boolean equals(Object obj)
        {
            if (obj instanceof g)
            {
                return Dl.equals(((g)obj).Dl);
            } else
            {
                return Dl.equals(obj);
            }
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            Dl.onConnectionFailed(connectionresult);
        }

        public g(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            Dl = onconnectionfailedlistener;
        }
    }

    protected final class h extends b
    {

        final ff Dh;
        public final Bundle Dm;
        public final IBinder Dn;
        public final int statusCode;

        protected void a(Object obj)
        {
            b((Boolean)obj);
        }

        protected void b(Boolean boolean1)
        {
            if (boolean1 == null)
            {
                ff.a(Dh, 1);
                return;
            }
            switch (statusCode)
            {
            default:
                if (Dm != null)
                {
                    boolean1 = (PendingIntent)Dm.getParcelable("pendingIntent");
                } else
                {
                    boolean1 = null;
                }
                if (ff.d(Dh) != null)
                {
                    fh.x(ff.e(Dh)).b(Dh.bg(), ff.d(Dh));
                    ff.a(Dh, null);
                }
                ff.a(Dh, 1);
                ff.a(Dh, null);
                ff.a(Dh).a(new ConnectionResult(statusCode, boolean1));
                return;

            case 0: // '\0'
                try
                {
                    boolean1 = Dn.getInterfaceDescriptor();
                    if (Dh.bh().equals(boolean1))
                    {
                        ff.a(Dh, Dh.r(Dn));
                        if (ff.c(Dh) != null)
                        {
                            ff.a(Dh, 3);
                            ff.a(Dh).bV();
                            return;
                        }
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Boolean boolean1) { }
                fh.x(ff.e(Dh)).b(Dh.bg(), ff.d(Dh));
                ff.a(Dh, null);
                ff.a(Dh, 1);
                ff.a(Dh, null);
                ff.a(Dh).a(new ConnectionResult(8, null));
                return;

            case 10: // '\n'
                ff.a(Dh, 1);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
        }

        protected void dx()
        {
        }

        public h(int i, IBinder ibinder, Bundle bundle)
        {
            Dh = ff.this;
            super(Boolean.valueOf(true));
            statusCode = i;
            Dn = ibinder;
            Dm = bundle;
        }
    }


    public static final String Dg[] = {
        "service_esmobile", "service_googleme"
    };
    private final Looper AS;
    private final fg Bc;
    private IInterface Da;
    private final ArrayList Db;
    private f Dc;
    private volatile int Dd;
    private final String De[];
    boolean Df;
    private final Context mContext;
    final Handler mHandler;

    protected transient ff(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        Db = new ArrayList();
        Dd = 1;
        Df = false;
        mContext = (Context)fq.f(context);
        AS = (Looper)fq.b(looper, "Looper must not be null");
        Bc = new fg(context, looper, this);
        mHandler = new a(looper);
        b(as);
        De = as;
        registerConnectionCallbacks((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)fq.f(connectioncallbacks));
        registerConnectionFailedListener((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)fq.f(onconnectionfailedlistener));
    }

    protected transient ff(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        this(context, context.getMainLooper(), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (new c(connectioncallbacks))), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (new g(onconnectionfailedlistener))), as);
    }

    private void M(int i)
    {
        int j = Dd;
        Dd = i;
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

    static IInterface a(ff ff1, IInterface iinterface)
    {
        ff1.Da = iinterface;
        return iinterface;
    }

    static f a(ff ff1, f f1)
    {
        ff1.Dc = f1;
        return f1;
    }

    static fg a(ff ff1)
    {
        return ff1.Bc;
    }

    static void a(ff ff1, int i)
    {
        ff1.M(i);
    }

    static ArrayList b(ff ff1)
    {
        return ff1.Db;
    }

    static IInterface c(ff ff1)
    {
        return ff1.Da;
    }

    static f d(ff ff1)
    {
        return ff1.Dc;
    }

    static Context e(ff ff1)
    {
        return ff1.mContext;
    }

    public void N(int i)
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, Integer.valueOf(i)));
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, new h(i, ibinder, bundle)));
    }

    public final void a(b b1)
    {
        synchronized (Db)
        {
            Db.add(b1);
        }
        mHandler.sendMessage(mHandler.obtainMessage(2, b1));
        return;
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    protected abstract void a(fm fm, e e1)
        throws RemoteException;

    protected transient void b(String as[])
    {
    }

    protected final void bT()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    protected abstract String bg();

    protected abstract String bh();

    public void connect()
    {
        Df = true;
        M(2);
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i != 0)
        {
            M(1);
            mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(i)));
        } else
        {
            if (Dc != null)
            {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
                Da = null;
                fh.x(mContext).b(bg(), Dc);
            }
            Dc = new f();
            if (!fh.x(mContext).a(bg(), Dc))
            {
                Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(bg()).toString());
                mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
    }

    public Bundle dG()
    {
        return null;
    }

    public void disconnect()
    {
        Df = false;
        ArrayList arraylist = Db;
        arraylist;
        JVM INSTR monitorenter ;
        int j = Db.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)Db.get(i)).eO();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        Db.clear();
        arraylist;
        JVM INSTR monitorexit ;
        M(1);
        Da = null;
        if (Dc != null)
        {
            fh.x(mContext).b(bg(), Dc);
            Dc = null;
        }
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String[] eL()
    {
        return De;
    }

    protected final IInterface eM()
    {
        bT();
        return Da;
    }

    public boolean em()
    {
        return Df;
    }

    public final Context getContext()
    {
        return mContext;
    }

    public final Looper getLooper()
    {
        return AS;
    }

    public boolean isConnected()
    {
        return Dd == 3;
    }

    public boolean isConnecting()
    {
        return Dd == 2;
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return Bc.isConnectionCallbacksRegistered(new c(connectioncallbacks));
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return Bc.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    protected void onConnected()
    {
    }

    protected void onDisconnected()
    {
    }

    protected abstract IInterface r(IBinder ibinder);

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        Bc.registerConnectionCallbacks(new c(connectioncallbacks));
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        Bc.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        Bc.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        Bc.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        Bc.unregisterConnectionCallbacks(new c(connectioncallbacks));
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        Bc.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    protected final void z(IBinder ibinder)
    {
        try
        {
            a(fm.a.C(ibinder), new e(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "service died");
        }
    }

}
