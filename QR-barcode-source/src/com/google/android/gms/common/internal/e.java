// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

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

// Referenced classes of package com.google.android.gms.common.internal:
//            o, f, g, l

public abstract class com.google.android.gms.common.internal.e
    implements com.google.android.gms.common.api.Api.a, f.b
{
    final class a extends Handler
    {

        final com.google.android.gms.common.internal.e LF;

        public void handleMessage(Message message)
        {
            if (message.what == 1 && !LF.isConnecting())
            {
                message = (b)message.obj;
                message.gT();
                message.unregister();
                return;
            }
            if (message.what == 3)
            {
                com.google.android.gms.common.internal.e.a(LF).b(new ConnectionResult(((Integer)message.obj).intValue(), null));
                return;
            }
            if (message.what == 4)
            {
                com.google.android.gms.common.internal.e.a(LF, 1);
                com.google.android.gms.common.internal.e.a(LF, null);
                com.google.android.gms.common.internal.e.a(LF).aB(((Integer)message.obj).intValue());
                return;
            }
            if (message.what == 2 && !LF.isConnected())
            {
                message = (b)message.obj;
                message.gT();
                message.unregister();
                return;
            }
            if (message.what == 2 || message.what == 1)
            {
                ((b)message.obj).gU();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public a(Looper looper)
        {
            LF = com.google.android.gms.common.internal.e.this;
            super(looper);
        }
    }

    protected abstract class b
    {

        final com.google.android.gms.common.internal.e LF;
        private boolean LG;
        private Object mListener;

        protected abstract void g(Object obj);

        protected abstract void gT();

        public void gU()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = mListener;
            if (LG)
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
                    g(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    gT();
                    throw obj1;
                }
            } else
            {
                gT();
            }
            this;
            JVM INSTR monitorenter ;
            LG = true;
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

        public void gV()
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
            gV();
            synchronized (com.google.android.gms.common.internal.e.b(LF))
            {
                com.google.android.gms.common.internal.e.b(LF).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public b(Object obj)
        {
            LF = com.google.android.gms.common.internal.e.this;
            super();
            mListener = obj;
            LG = false;
        }
    }

    public static final class c
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    {

        private final com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks LH;

        public boolean equals(Object obj)
        {
            if (obj instanceof c)
            {
                return LH.equals(((c)obj).LH);
            } else
            {
                return LH.equals(obj);
            }
        }

        public void onConnected(Bundle bundle)
        {
            LH.onConnected(bundle);
        }

        public void onConnectionSuspended(int i)
        {
            LH.onDisconnected();
        }

        public c(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
        {
            LH = connectioncallbacks;
        }
    }

    public abstract class d extends b
    {

        private final DataHolder II;
        final com.google.android.gms.common.internal.e LF;

        protected abstract void a(Object obj, DataHolder dataholder);

        protected final void g(Object obj)
        {
            a(obj, II);
        }

        protected void gT()
        {
            if (II != null)
            {
                II.close();
            }
        }

        public volatile void gU()
        {
            super.gU();
        }

        public volatile void gV()
        {
            super.gV();
        }

        public volatile void unregister()
        {
            super.unregister();
        }

        public d(Object obj, DataHolder dataholder)
        {
            LF = com.google.android.gms.common.internal.e.this;
            super(obj);
            II = dataholder;
        }
    }

    public static final class e extends k.a
    {

        private com.google.android.gms.common.internal.e LI;

        public void b(int i, IBinder ibinder, Bundle bundle)
        {
            o.b("onPostInitComplete can be called only once per call to getServiceFromBroker", LI);
            LI.a(i, ibinder, bundle);
            LI = null;
        }

        public e(com.google.android.gms.common.internal.e e1)
        {
            LI = e1;
        }
    }

    final class f
        implements ServiceConnection
    {

        final com.google.android.gms.common.internal.e LF;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            LF.N(ibinder);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            LF.mHandler.sendMessage(LF.mHandler.obtainMessage(4, Integer.valueOf(1)));
        }

        f()
        {
            LF = com.google.android.gms.common.internal.e.this;
            super();
        }
    }

    public static final class g
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        private final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener LJ;

        public boolean equals(Object obj)
        {
            if (obj instanceof g)
            {
                return LJ.equals(((g)obj).LJ);
            } else
            {
                return LJ.equals(obj);
            }
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            LJ.onConnectionFailed(connectionresult);
        }

        public g(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            LJ = onconnectionfailedlistener;
        }
    }

    protected final class h extends b
    {

        final com.google.android.gms.common.internal.e LF;
        public final Bundle LK;
        public final IBinder LL;
        public final int statusCode;

        protected void b(Boolean boolean1)
        {
            if (boolean1 == null)
            {
                com.google.android.gms.common.internal.e.a(LF, 1);
                return;
            }
            switch (statusCode)
            {
            default:
                if (LK != null)
                {
                    boolean1 = (PendingIntent)LK.getParcelable("pendingIntent");
                } else
                {
                    boolean1 = null;
                }
                if (com.google.android.gms.common.internal.e.d(LF) != null)
                {
                    com.google.android.gms.common.internal.g.J(com.google.android.gms.common.internal.e.e(LF)).b(LF.getStartServiceAction(), com.google.android.gms.common.internal.e.d(LF));
                    com.google.android.gms.common.internal.e.a(LF, null);
                }
                com.google.android.gms.common.internal.e.a(LF, 1);
                com.google.android.gms.common.internal.e.a(LF, null);
                com.google.android.gms.common.internal.e.a(LF).b(new ConnectionResult(statusCode, boolean1));
                return;

            case 0: // '\0'
                try
                {
                    boolean1 = LL.getInterfaceDescriptor();
                    if (LF.getServiceDescriptor().equals(boolean1))
                    {
                        com.google.android.gms.common.internal.e.a(LF, LF.j(LL));
                        if (com.google.android.gms.common.internal.e.c(LF) != null)
                        {
                            com.google.android.gms.common.internal.e.a(LF, 3);
                            com.google.android.gms.common.internal.e.a(LF).dL();
                            return;
                        }
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Boolean boolean1) { }
                com.google.android.gms.common.internal.g.J(com.google.android.gms.common.internal.e.e(LF)).b(LF.getStartServiceAction(), com.google.android.gms.common.internal.e.d(LF));
                com.google.android.gms.common.internal.e.a(LF, null);
                com.google.android.gms.common.internal.e.a(LF, 1);
                com.google.android.gms.common.internal.e.a(LF, null);
                com.google.android.gms.common.internal.e.a(LF).b(new ConnectionResult(8, null));
                return;

            case 10: // '\n'
                com.google.android.gms.common.internal.e.a(LF, 1);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
        }

        protected void g(Object obj)
        {
            b((Boolean)obj);
        }

        protected void gT()
        {
        }

        public h(int i, IBinder ibinder, Bundle bundle)
        {
            LF = com.google.android.gms.common.internal.e.this;
            super(Boolean.valueOf(true));
            statusCode = i;
            LL = ibinder;
            LK = bundle;
        }
    }


    public static final String LE[] = {
        "service_esmobile", "service_googleme"
    };
    private final String Ds[];
    private final Looper IH;
    private final com.google.android.gms.common.internal.f IX;
    private final ArrayList LA;
    private f LB;
    private volatile int LC;
    boolean LD;
    private IInterface Lz;
    private final Context mContext;
    final Handler mHandler;

    protected transient com.google.android.gms.common.internal.e(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        LA = new ArrayList();
        LC = 1;
        LD = false;
        mContext = (Context)o.i(context);
        IH = (Looper)o.b(looper, "Looper must not be null");
        IX = new com.google.android.gms.common.internal.f(context, looper, this);
        mHandler = new a(looper);
        c(as);
        Ds = as;
        registerConnectionCallbacks((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)o.i(connectioncallbacks));
        registerConnectionFailedListener((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)o.i(onconnectionfailedlistener));
    }

    protected transient com.google.android.gms.common.internal.e(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        this(context, context.getMainLooper(), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (new c(connectioncallbacks))), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (new g(onconnectionfailedlistener))), as);
    }

    static IInterface a(com.google.android.gms.common.internal.e e1, IInterface iinterface)
    {
        e1.Lz = iinterface;
        return iinterface;
    }

    static f a(com.google.android.gms.common.internal.e e1, f f1)
    {
        e1.LB = f1;
        return f1;
    }

    static com.google.android.gms.common.internal.f a(com.google.android.gms.common.internal.e e1)
    {
        return e1.IX;
    }

    static void a(com.google.android.gms.common.internal.e e1, int i)
    {
        e1.az(i);
    }

    private void az(int i)
    {
        int k = LC;
        LC = i;
        if (k != i)
        {
            if (i == 3)
            {
                onConnected();
            } else
            if (k == 3 && i == 1)
            {
                onDisconnected();
                return;
            }
        }
    }

    static ArrayList b(com.google.android.gms.common.internal.e e1)
    {
        return e1.LA;
    }

    static IInterface c(com.google.android.gms.common.internal.e e1)
    {
        return e1.Lz;
    }

    static f d(com.google.android.gms.common.internal.e e1)
    {
        return e1.LB;
    }

    static Context e(com.google.android.gms.common.internal.e e1)
    {
        return e1.mContext;
    }

    protected final void N(IBinder ibinder)
    {
        try
        {
            a(l.a.Q(ibinder), new e(this));
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
        synchronized (LA)
        {
            LA.add(b1);
        }
        mHandler.sendMessage(mHandler.obtainMessage(2, b1));
        return;
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    protected abstract void a(l l, e e1)
        throws RemoteException;

    public void aA(int i)
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, Integer.valueOf(i)));
    }

    protected transient void c(String as[])
    {
    }

    public void connect()
    {
        LD = true;
        az(2);
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i != 0)
        {
            az(1);
            mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(i)));
        } else
        {
            if (LB != null)
            {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
                Lz = null;
                com.google.android.gms.common.internal.g.J(mContext).b(getStartServiceAction(), LB);
            }
            LB = new f();
            if (!com.google.android.gms.common.internal.g.J(mContext).a(getStartServiceAction(), LB))
            {
                Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(getStartServiceAction()).toString());
                mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
    }

    protected final void dJ()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public void disconnect()
    {
        LD = false;
        ArrayList arraylist = LA;
        arraylist;
        JVM INSTR monitorenter ;
        int k = LA.size();
        int i = 0;
_L2:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)LA.get(i)).gV();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        LA.clear();
        arraylist;
        JVM INSTR monitorexit ;
        az(1);
        Lz = null;
        if (LB != null)
        {
            com.google.android.gms.common.internal.g.J(mContext).b(getStartServiceAction(), LB);
            LB = null;
        }
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bundle fC()
    {
        return null;
    }

    public final String[] gR()
    {
        return Ds;
    }

    public final IInterface gS()
    {
        dJ();
        return Lz;
    }

    public final Context getContext()
    {
        return mContext;
    }

    public final Looper getLooper()
    {
        return IH;
    }

    protected abstract String getServiceDescriptor();

    protected abstract String getStartServiceAction();

    public boolean gq()
    {
        return LD;
    }

    public boolean isConnected()
    {
        return LC == 3;
    }

    public boolean isConnecting()
    {
        return LC == 2;
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return IX.isConnectionCallbacksRegistered(new c(connectioncallbacks));
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return IX.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    protected abstract IInterface j(IBinder ibinder);

    protected void onConnected()
    {
    }

    protected void onDisconnected()
    {
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        IX.registerConnectionCallbacks(new c(connectioncallbacks));
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        IX.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        IX.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        IX.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        IX.unregisterConnectionCallbacks(new c(connectioncallbacks));
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        IX.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

}
