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
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            dm, df, dj

public abstract class de
    implements GooglePlayServicesClient
{
    final class a extends Handler
    {

        final de kP;

        public void handleMessage(Message message)
        {
            if (message.what == 1 && !kP.isConnecting())
            {
                message = (b)message.obj;
                message.aF();
                message.unregister();
                return;
            }
            synchronized (de.a(kP))
            {
                kP.kM = false;
            }
            if (message.what == 3)
            {
                kP.a(new ConnectionResult(((Integer)message.obj).intValue(), null));
                return;
            }
            break MISSING_BLOCK_LABEL_94;
            message;
            obj;
            JVM INSTR monitorexit ;
            throw message;
            if (message.what == 4)
            {
                synchronized (de.b(kP))
                {
                    if (kP.kL && kP.isConnected() && de.b(kP).contains(message.obj))
                    {
                        ((com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks)message.obj).onConnected(kP.ba());
                    }
                }
                return;
            }
            break MISSING_BLOCK_LABEL_176;
            message;
            arraylist;
            JVM INSTR monitorexit ;
            throw message;
            if (message.what == 2 && !kP.isConnected())
            {
                message = (b)message.obj;
                message.aF();
                message.unregister();
                return;
            }
            if (message.what == 2 || message.what == 1)
            {
                ((b)message.obj).be();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public a(Looper looper)
        {
            kP = de.this;
            super(looper);
        }
    }

    protected abstract class b
    {

        final de kP;
        private boolean kQ;
        private Object mListener;

        protected abstract void a(Object obj);

        protected abstract void aF();

        public void be()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = mListener;
            if (kQ)
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
                    aF();
                    throw obj1;
                }
            } else
            {
                aF();
            }
            this;
            JVM INSTR monitorenter ;
            kQ = true;
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

        public void bf()
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
            bf();
            synchronized (de.c(kP))
            {
                de.c(kP).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public b(Object obj)
        {
            kP = de.this;
            super();
            mListener = obj;
            kQ = false;
        }
    }

    public abstract class c extends b
    {

        private final com.google.android.gms.common.data.d jf;
        final de kP;

        protected final void a(Object obj)
        {
            a(obj, jf);
        }

        protected abstract void a(Object obj, com.google.android.gms.common.data.d d1);

        protected void aF()
        {
            if (jf != null)
            {
                jf.close();
            }
        }

        public volatile void be()
        {
            super.be();
        }

        public volatile void bf()
        {
            super.bf();
        }

        public volatile void unregister()
        {
            super.unregister();
        }

        public c(Object obj, com.google.android.gms.common.data.d d1)
        {
            kP = de.this;
            super(obj);
            jf = d1;
        }
    }

    public static final class d extends di.a
    {

        private de kR;

        public void b(int i, IBinder ibinder, Bundle bundle)
        {
            dm.a("onPostInitComplete can be called only once per call to getServiceFromBroker", kR);
            kR.a(i, ibinder, bundle);
            kR = null;
        }

        public d(de de1)
        {
            kR = de1;
        }
    }

    final class e
        implements ServiceConnection
    {

        final de kP;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            kP.u(ibinder);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            de.a(kP, null);
            kP.bb();
        }

        e()
        {
            kP = de.this;
            super();
        }
    }

    protected final class f extends b
    {

        final de kP;
        public final Bundle kS;
        public final IBinder kT;
        public final int statusCode;

        protected void a(Boolean boolean1)
        {
            if (boolean1 == null)
            {
                return;
            }
            switch (statusCode)
            {
            default:
                if (kS != null)
                {
                    boolean1 = (PendingIntent)kS.getParcelable("pendingIntent");
                } else
                {
                    boolean1 = null;
                }
                if (de.e(kP) != null)
                {
                    df.s(de.f(kP)).b(kP.ag(), de.e(kP));
                    de.a(kP, null);
                }
                de.a(kP, null);
                kP.a(new ConnectionResult(statusCode, boolean1));
                return;

            case 0: // '\0'
                try
                {
                    boolean1 = kT.getInterfaceDescriptor();
                    if (kP.ah().equals(boolean1))
                    {
                        de.a(kP, kP.p(kT));
                        if (de.d(kP) != null)
                        {
                            kP.aZ();
                            return;
                        }
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Boolean boolean1) { }
                df.s(de.f(kP)).b(kP.ag(), de.e(kP));
                de.a(kP, null);
                de.a(kP, null);
                kP.a(new ConnectionResult(8, null));
                return;

            case 10: // '\n'
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
        }

        protected volatile void a(Object obj)
        {
            a((Boolean)obj);
        }

        protected void aF()
        {
        }

        public f(int i, IBinder ibinder, Bundle bundle)
        {
            kP = de.this;
            super(Boolean.valueOf(true));
            statusCode = i;
            kT = ibinder;
            kS = bundle;
        }
    }


    public static final String kO[] = {
        "service_esmobile", "service_googleme"
    };
    private final String is[];
    private IInterface kD;
    private ArrayList kE;
    final ArrayList kF = new ArrayList();
    private boolean kG;
    private ArrayList kH;
    private boolean kI;
    private final ArrayList kJ = new ArrayList();
    private e kK;
    boolean kL;
    boolean kM;
    private final Object kN = new Object();
    private final Context mContext;
    final Handler mHandler;

    protected transient de(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        kG = false;
        kI = false;
        kL = false;
        kM = false;
        mContext = (Context)dm.e(context);
        kE = new ArrayList();
        kE.add(dm.e(connectioncallbacks));
        kH = new ArrayList();
        kH.add(dm.e(onconnectionfailedlistener));
        mHandler = new a(context.getMainLooper());
        a(as);
        is = as;
    }

    static IInterface a(de de1, IInterface iinterface)
    {
        de1.kD = iinterface;
        return iinterface;
    }

    static e a(de de1, e e1)
    {
        de1.kK = e1;
        return e1;
    }

    static Object a(de de1)
    {
        return de1.kN;
    }

    static ArrayList b(de de1)
    {
        return de1.kE;
    }

    static ArrayList c(de de1)
    {
        return de1.kJ;
    }

    static IInterface d(de de1)
    {
        return de1.kD;
    }

    static e e(de de1)
    {
        return de1.kK;
    }

    static Context f(de de1)
    {
        return de1.mContext;
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, new f(i, ibinder, bundle)));
    }

    protected void a(ConnectionResult connectionresult)
    {
        mHandler.removeMessages(4);
        ArrayList arraylist = kH;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        int j;
        kI = true;
        arraylist1 = kH;
        j = arraylist1.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (kL)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        arraylist;
        JVM INSTR monitorexit ;
        return;
        if (kH.contains(arraylist1.get(i)))
        {
            ((com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)arraylist1.get(i)).onConnectionFailed(connectionresult);
        }
        break MISSING_BLOCK_LABEL_98;
        kI = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        connectionresult;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectionresult;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(b b1)
    {
        synchronized (kJ)
        {
            kJ.add(b1);
        }
        mHandler.sendMessage(mHandler.obtainMessage(2, b1));
        return;
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    protected abstract void a(dj dj, d d1)
        throws RemoteException;

    protected transient void a(String as[])
    {
    }

    public final String[] aY()
    {
        return is;
    }

    protected void aZ()
    {
        boolean flag1 = true;
        ArrayList arraylist = kE;
        arraylist;
        JVM INSTR monitorenter ;
        Bundle bundle;
        Exception exception;
        ArrayList arraylist1;
        int i;
        int j;
        boolean flag;
        if (!kG)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.k(flag);
        mHandler.removeMessages(4);
        kG = true;
        if (kF.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        dm.k(flag);
        bundle = ba();
        arraylist1 = kE;
        j = arraylist1.size();
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (kL && isConnected())
        {
            break MISSING_BLOCK_LABEL_112;
        }
        kF.clear();
        kG = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        kF.size();
        if (!kF.contains(arraylist1.get(i)))
        {
            ((com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks)arraylist1.get(i)).onConnected(bundle);
        }
        break MISSING_BLOCK_LABEL_171;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected abstract String ag();

    protected abstract String ah();

    protected Bundle ba()
    {
        return null;
    }

    protected final void bb()
    {
        mHandler.removeMessages(4);
        ArrayList arraylist = kE;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        int j;
        kG = true;
        arraylist1 = kE;
        j = arraylist1.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (kL)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        kG = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        if (kE.contains(arraylist1.get(i)))
        {
            ((com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks)arraylist1.get(i)).onDisconnected();
        }
        break MISSING_BLOCK_LABEL_90;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final void bc()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    protected final IInterface bd()
    {
        bc();
        return kD;
    }

    public void connect()
    {
        kL = true;
        synchronized (kN)
        {
            kM = true;
        }
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i != 0)
        {
            mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(i)));
        } else
        {
            if (kK != null)
            {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
                kD = null;
                df.s(mContext).b(ag(), kK);
            }
            kK = new e();
            if (!df.s(mContext).a(ag(), kK))
            {
                Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(ag()).toString());
                mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void disconnect()
    {
        kL = false;
        synchronized (kN)
        {
            kM = false;
        }
        obj = kJ;
        obj;
        JVM INSTR monitorenter ;
        int j = kJ.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)kJ.get(i)).bf();
        i++;
        if (true) goto _L2; else goto _L1
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        kJ.clear();
        obj;
        JVM INSTR monitorexit ;
        kD = null;
        if (kK != null)
        {
            df.s(mContext).b(ag(), kK);
            kK = null;
        }
        return;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final Context getContext()
    {
        return mContext;
    }

    public boolean isConnected()
    {
        return kD != null;
    }

    public boolean isConnecting()
    {
        boolean flag;
        synchronized (kN)
        {
            flag = kM;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        dm.e(connectioncallbacks);
        boolean flag;
        synchronized (kE)
        {
            flag = kE.contains(connectioncallbacks);
        }
        return flag;
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        dm.e(onconnectionfailedlistener);
        boolean flag;
        synchronized (kH)
        {
            flag = kH.contains(onconnectionfailedlistener);
        }
        return flag;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    protected abstract IInterface p(IBinder ibinder);

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        dm.e(connectioncallbacks);
        ArrayList arraylist = kE;
        arraylist;
        JVM INSTR monitorenter ;
        if (!kE.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Log.w("GmsClient", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(4, connectioncallbacks));
        }
        return;
        if (kG)
        {
            kE = new ArrayList(kE);
        }
        kE.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        dm.e(onconnectionfailedlistener);
        ArrayList arraylist = kH;
        arraylist;
        JVM INSTR monitorenter ;
        if (!kH.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        Log.w("GmsClient", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        if (kI)
        {
            kH = new ArrayList(kH);
        }
        kH.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    protected final void u(IBinder ibinder)
    {
        try
        {
            a(dj.a.w(ibinder), new d(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "service died");
        }
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        dm.e(connectioncallbacks);
        ArrayList arraylist = kE;
        arraylist;
        JVM INSTR monitorenter ;
        if (kE == null) goto _L2; else goto _L1
_L1:
        if (kG)
        {
            kE = new ArrayList(kE);
        }
        if (kE.remove(connectioncallbacks)) goto _L4; else goto _L3
_L3:
        Log.w("GmsClient", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(connectioncallbacks).append(" not found").toString());
_L2:
        return;
_L4:
        if (kG && !kF.contains(connectioncallbacks))
        {
            kF.add(connectioncallbacks);
        }
        if (true) goto _L2; else goto _L5
_L5:
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        dm.e(onconnectionfailedlistener);
        synchronized (kH)
        {
            if (kH != null)
            {
                if (kI)
                {
                    kH = new ArrayList(kH);
                }
                if (!kH.remove(onconnectionfailedlistener))
                {
                    Log.w("GmsClient", (new StringBuilder()).append("unregisterConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" not found").toString());
                }
            }
        }
        return;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

}
