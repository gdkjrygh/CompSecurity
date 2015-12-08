// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
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
//            jx, jm, jn, jt

public abstract class jl
    implements com.google.android.gms.common.api.Api.a, jm.b
{
    final class a extends Handler
    {

        final jl MQ;

        public void handleMessage(Message message)
        {
            if (message.what == 1 && !MQ.isConnecting())
            {
                message = (b)message.obj;
                message.hx();
                message.unregister();
                return;
            }
            if (message.what == 3)
            {
                jl.a(MQ).b(new ConnectionResult(((Integer)message.obj).intValue(), null));
                return;
            }
            if (message.what == 4)
            {
                jl.a(MQ, 4, null);
                jl.a(MQ).aE(((Integer)message.obj).intValue());
                jl.a(MQ, 4, 1, null);
                return;
            }
            if (message.what == 2 && !MQ.isConnected())
            {
                message = (b)message.obj;
                message.hx();
                message.unregister();
                return;
            }
            if (message.what == 2 || message.what == 1)
            {
                ((b)message.obj).hy();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public a(Looper looper)
        {
            MQ = jl.this;
            super(looper);
        }
    }

    protected abstract class b
    {

        final jl MQ;
        private boolean MR;
        private Object mListener;

        protected abstract void g(Object obj);

        protected abstract void hx();

        public void hy()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = mListener;
            if (MR)
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
                    hx();
                    throw obj1;
                }
            } else
            {
                hx();
            }
            this;
            JVM INSTR monitorenter ;
            MR = true;
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

        public void hz()
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
            hz();
            synchronized (jl.b(MQ))
            {
                jl.b(MQ).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public b(Object obj)
        {
            MQ = jl.this;
            super();
            mListener = obj;
            MR = false;
        }
    }

    public static final class c
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    {

        private final com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks MS;

        public boolean equals(Object obj)
        {
            if (obj instanceof c)
            {
                return MS.equals(((c)obj).MS);
            } else
            {
                return MS.equals(obj);
            }
        }

        public void onConnected(Bundle bundle)
        {
            MS.onConnected(bundle);
        }

        public void onConnectionSuspended(int i)
        {
            MS.onDisconnected();
        }

        public c(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
        {
            MS = connectioncallbacks;
        }
    }

    public abstract class d extends b
    {

        private final DataHolder JG;
        final jl MQ;

        protected abstract void b(Object obj, DataHolder dataholder);

        protected final void g(Object obj)
        {
            b(obj, JG);
        }

        protected void hx()
        {
            if (JG != null)
            {
                JG.close();
            }
        }

        public volatile void hy()
        {
            super.hy();
        }

        public volatile void hz()
        {
            super.hz();
        }

        public volatile void unregister()
        {
            super.unregister();
        }

        public d(Object obj, DataHolder dataholder)
        {
            MQ = jl.this;
            super(obj);
            JG = dataholder;
        }
    }

    public static final class e extends js.a
    {

        private jl MT;

        public void b(int i, IBinder ibinder, Bundle bundle)
        {
            jx.b("onPostInitComplete can be called only once per call to getServiceFromBroker", MT);
            MT.a(i, ibinder, bundle);
            MT = null;
        }

        public e(jl jl1)
        {
            MT = jl1;
        }
    }

    public final class f
        implements ServiceConnection
    {

        final jl MQ;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            MQ.N(ibinder);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            MQ.mHandler.sendMessage(MQ.mHandler.obtainMessage(4, Integer.valueOf(1)));
        }

        public f()
        {
            MQ = jl.this;
            super();
        }
    }

    public static final class g
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        private final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener MU;

        public boolean equals(Object obj)
        {
            if (obj instanceof g)
            {
                return MU.equals(((g)obj).MU);
            } else
            {
                return MU.equals(obj);
            }
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            MU.onConnectionFailed(connectionresult);
        }

        public g(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            MU = onconnectionfailedlistener;
        }
    }

    protected final class h extends b
    {

        final jl MQ;
        public final Bundle MV;
        public final IBinder MW;
        public final int statusCode;

        protected void b(Boolean boolean1)
        {
            if (boolean1 == null)
            {
                jl.a(MQ, 1, null);
                return;
            }
            statusCode;
            JVM INSTR lookupswitch 2: default 44
        //                       0: 142
        //                       10: 269;
               goto _L1 _L2 _L3
_L1:
            if (MV != null)
            {
                boolean1 = (PendingIntent)MV.getParcelable("pendingIntent");
            } else
            {
                boolean1 = null;
            }
            if (jl.c(MQ) != null)
            {
                jn.J(jl.d(MQ)).b(MQ.bK(), jl.c(MQ));
                jl.a(MQ, null);
            }
            jl.a(MQ, 1, null);
            jl.a(MQ).b(new ConnectionResult(statusCode, boolean1));
            return;
_L2:
            boolean1 = MW.getInterfaceDescriptor();
            if (!MQ.bL().equals(boolean1)) goto _L5; else goto _L4
_L4:
            boolean1 = MQ.l(MW);
            if (boolean1 != null)
            {
                try
                {
                    jl.a(MQ, 3, boolean1);
                    jl.a(MQ).dU();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Boolean boolean1) { }
            }
_L5:
            jn.J(jl.d(MQ)).b(MQ.bK(), jl.c(MQ));
            jl.a(MQ, null);
            jl.a(MQ, 1, null);
            jl.a(MQ).b(new ConnectionResult(8, null));
            return;
_L3:
            jl.a(MQ, 1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }

        protected void g(Object obj)
        {
            b((Boolean)obj);
        }

        protected void hx()
        {
        }

        public h(int i, IBinder ibinder, Bundle bundle)
        {
            MQ = jl.this;
            super(Boolean.valueOf(true));
            statusCode = i;
            MW = ibinder;
            MV = bundle;
        }
    }


    public static final String MP[] = {
        "service_esmobile", "service_googleme"
    };
    private final Looper JF;
    private final jm JS;
    private IInterface MJ;
    private final ArrayList MK;
    private f ML;
    private int MM;
    private final String MN[];
    boolean MO;
    private final Context mContext;
    private final Object mH;
    final Handler mHandler;

    protected transient jl(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        mH = new Object();
        MK = new ArrayList();
        MM = 1;
        MO = false;
        mContext = (Context)jx.i(context);
        JF = (Looper)jx.b(looper, "Looper must not be null");
        JS = new jm(context, looper, this);
        mHandler = new a(looper);
        c(as);
        MN = as;
        registerConnectionCallbacks((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)jx.i(connectioncallbacks));
        registerConnectionFailedListener((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)jx.i(onconnectionfailedlistener));
    }

    protected transient jl(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        this(context, context.getMainLooper(), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (new c(connectioncallbacks))), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (new g(onconnectionfailedlistener))), as);
    }

    static f a(jl jl1, f f1)
    {
        jl1.ML = f1;
        return f1;
    }

    static jm a(jl jl1)
    {
        return jl1.JS;
    }

    private void a(int i, IInterface iinterface)
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        if (i == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (iinterface != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            flag2 = false;
        }
        jx.L(flag2);
        synchronized (mH)
        {
            MM = i;
            MJ = iinterface;
        }
        return;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static void a(jl jl1, int i, IInterface iinterface)
    {
        jl1.a(i, iinterface);
    }

    private boolean a(int i, int j, IInterface iinterface)
    {
label0:
        {
            synchronized (mH)
            {
                if (MM == i)
                {
                    break label0;
                }
            }
            return false;
        }
        a(j, iinterface);
        obj;
        JVM INSTR monitorexit ;
        return true;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static boolean a(jl jl1, int i, int j, IInterface iinterface)
    {
        return jl1.a(i, j, iinterface);
    }

    static ArrayList b(jl jl1)
    {
        return jl1.MK;
    }

    static f c(jl jl1)
    {
        return jl1.ML;
    }

    static Context d(jl jl1)
    {
        return jl1.mContext;
    }

    protected final void N(IBinder ibinder)
    {
        try
        {
            a(jt.a.Q(ibinder), new e(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "service died");
            aD(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "Remote exception occurred", ibinder);
        }
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, new h(i, ibinder, bundle)));
    }

    public final void a(b b1)
    {
        synchronized (MK)
        {
            MK.add(b1);
        }
        mHandler.sendMessage(mHandler.obtainMessage(2, b1));
        return;
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    protected abstract void a(jt jt, e e1)
        throws RemoteException;

    public void aD(int i)
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, Integer.valueOf(i)));
    }

    protected abstract String bK();

    protected abstract String bL();

    protected transient void c(String as[])
    {
    }

    public void connect()
    {
        MO = true;
        a(2, ((IInterface) (null)));
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i != 0)
        {
            a(1, ((IInterface) (null)));
            mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(i)));
        } else
        {
            if (ML != null)
            {
                Log.e("GmsClient", (new StringBuilder()).append("Calling connect() while still connected, missing disconnect() for ").append(bK()).toString());
                jn.J(mContext).b(bK(), ML);
            }
            ML = new f();
            if (!jn.J(mContext).a(bK(), ML))
            {
                Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(bK()).toString());
                mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
    }

    protected final void dS()
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
        MO = false;
        ArrayList arraylist = MK;
        arraylist;
        JVM INSTR monitorenter ;
        int j = MK.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)MK.get(i)).hz();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        MK.clear();
        arraylist;
        JVM INSTR monitorexit ;
        a(1, ((IInterface) (null)));
        if (ML != null)
        {
            jn.J(mContext).b(bK(), ML);
            ML = null;
        }
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bundle fX()
    {
        return null;
    }

    public boolean gN()
    {
        return MO;
    }

    public final Context getContext()
    {
        return mContext;
    }

    public final Looper getLooper()
    {
        return JF;
    }

    public final String[] hv()
    {
        return MN;
    }

    public final IInterface hw()
        throws DeadObjectException
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (MM == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        dS();
        IInterface iinterface;
        boolean flag;
        if (MJ != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Client is connected but service is null");
        iinterface = MJ;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    public boolean isConnected()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (MM == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnecting()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (MM == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return JS.isConnectionCallbacksRegistered(new c(connectioncallbacks));
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return JS.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    protected abstract IInterface l(IBinder ibinder);

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        JS.registerConnectionCallbacks(new c(connectioncallbacks));
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        JS.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        JS.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        JS.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        JS.unregisterConnectionCallbacks(new c(connectioncallbacks));
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        JS.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

}
