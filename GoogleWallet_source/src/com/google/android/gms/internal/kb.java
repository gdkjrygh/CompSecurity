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
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            kn, kc, kd, kj

public abstract class kb
    implements com.google.android.gms.common.api.Api.a, kc.b
{
    final class a extends Handler
    {

        final kb VT;

        public final void handleMessage(Message message)
        {
            if (message.what == 1 && !VT.isConnecting())
            {
                message = (b)message.obj;
                message.iQ();
                message.unregister();
                return;
            }
            if (message.what == 3)
            {
                kb.a(VT).b(new ConnectionResult(((Integer)message.obj).intValue(), null));
                return;
            }
            if (message.what == 4)
            {
                kb.a(VT, 4, null);
                kb.a(VT).dh(((Integer)message.obj).intValue());
                kb.a(VT, 4, 1, null);
                return;
            }
            if (message.what == 2 && !VT.isConnected())
            {
                message = (b)message.obj;
                message.iQ();
                message.unregister();
                return;
            }
            if (message.what == 2 || message.what == 1)
            {
                ((b)message.obj).iR();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public a(Looper looper)
        {
            VT = kb.this;
            super(looper);
        }
    }

    public abstract class b
    {

        final kb VT;
        private boolean VU;
        private Object mListener;

        protected abstract void i(Object obj);

        protected abstract void iQ();

        public final void iR()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = mListener;
            if (VU)
            {
                Log.w("GmsClient", (new StringBuilder("Callback proxy ")).append(this).append(" being reused. This is not safe.").toString());
            }
            this;
            JVM INSTR monitorexit ;
            Object obj1;
            if (obj != null)
            {
                try
                {
                    i(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    iQ();
                    throw obj1;
                }
            } else
            {
                iQ();
            }
            this;
            JVM INSTR monitorenter ;
            VU = true;
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

        public final void iS()
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

        public final void unregister()
        {
            iS();
            synchronized (kb.b(VT))
            {
                kb.b(VT).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public b(Object obj)
        {
            VT = kb.this;
            super();
            mListener = obj;
            VU = false;
        }
    }

    public static final class e extends ki.a
    {

        private kb VW;

        public final void b(int i, IBinder ibinder, Bundle bundle)
        {
            kn.b("onPostInitComplete can be called only once per call to getServiceFromBroker", VW);
            VW.a(i, ibinder, bundle);
            VW = null;
        }

        public e(kb kb1)
        {
            VW = kb1;
        }
    }

    public final class f
        implements ServiceConnection
    {

        final kb VT;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            VT.aX(ibinder);
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            VT.mHandler.sendMessage(VT.mHandler.obtainMessage(4, Integer.valueOf(1)));
        }

        public f()
        {
            VT = kb.this;
            super();
        }
    }

    public final class h extends b
    {

        final kb VT;
        public final Bundle VY;
        public final IBinder VZ;
        public final int statusCode;

        private void b(Boolean boolean1)
        {
            if (boolean1 == null)
            {
                kb.a(VT, 1, null);
                return;
            }
            statusCode;
            JVM INSTR lookupswitch 2: default 44
        //                       0: 142
        //                       10: 269;
               goto _L1 _L2 _L3
_L1:
            if (VY != null)
            {
                boolean1 = (PendingIntent)VY.getParcelable("pendingIntent");
            } else
            {
                boolean1 = null;
            }
            if (kb.c(VT) != null)
            {
                kd.L(kb.d(VT)).b(VT.bK(), kb.c(VT));
                kb.a(VT, null);
            }
            kb.a(VT, 1, null);
            kb.a(VT).b(new ConnectionResult(statusCode, boolean1));
            return;
_L2:
            boolean1 = VZ.getInterfaceDescriptor();
            if (!VT.bL().equals(boolean1)) goto _L5; else goto _L4
_L4:
            boolean1 = VT.p(VZ);
            if (boolean1 != null)
            {
                try
                {
                    kb.a(VT, 3, boolean1);
                    kb.a(VT).dT();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Boolean boolean1) { }
            }
_L5:
            kd.L(kb.d(VT)).b(VT.bK(), kb.c(VT));
            kb.a(VT, null);
            kb.a(VT, 1, null);
            kb.a(VT).b(new ConnectionResult(8, null));
            return;
_L3:
            kb.a(VT, 1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }

        protected final void i(Object obj)
        {
            b((Boolean)obj);
        }

        protected final void iQ()
        {
        }

        public h(int j, IBinder ibinder, Bundle bundle)
        {
            VT = kb.this;
            super(Boolean.valueOf(true));
            statusCode = j;
            VZ = ibinder;
            VY = bundle;
        }
    }


    public static final String GOOGLE_PLUS_REQUIRED_FEATURES[] = {
        "service_esmobile", "service_googleme"
    };
    private final Looper JL;
    private final kc SE;
    private IInterface VN;
    private final ArrayList VO = new ArrayList();
    private f VP;
    private int VQ;
    private final String VR[];
    boolean VS;
    private final Context mContext;
    final Handler mHandler;
    private final Object mK = new Object();

    protected transient kb(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        VQ = 1;
        VS = false;
        mContext = (Context)kn.k(context);
        JL = (Looper)kn.b(looper, "Looper must not be null");
        SE = new kc(context, looper, this);
        mHandler = new a(looper);
        VR = as;
        registerConnectionCallbacks((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)kn.k(connectioncallbacks));
        registerConnectionFailedListener$40dd7b8f((com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)kn.k(onconnectionfailedlistener));
    }

    static f a(kb kb1, f f1)
    {
        kb1.VP = f1;
        return f1;
    }

    static kc a(kb kb1)
    {
        return kb1.SE;
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
        kn.L(flag2);
        synchronized (mK)
        {
            VQ = i;
            VN = iinterface;
        }
        return;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static void a(kb kb1, int i, IInterface iinterface)
    {
        kb1.a(i, iinterface);
    }

    private boolean a(int i, int j, IInterface iinterface)
    {
label0:
        {
            synchronized (mK)
            {
                if (VQ == i)
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

    static boolean a(kb kb1, int i, int j, IInterface iinterface)
    {
        return kb1.a(i, j, iinterface);
    }

    static ArrayList b(kb kb1)
    {
        return kb1.VO;
    }

    static f c(kb kb1)
    {
        return kb1.VP;
    }

    static Context d(kb kb1)
    {
        return kb1.mContext;
    }

    private void dg(int i)
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, Integer.valueOf(i)));
    }

    private void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        SE.registerConnectionCallbacks(connectioncallbacks);
    }

    private void registerConnectionFailedListener$40dd7b8f(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        SE.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, new h(i, ibinder, bundle)));
    }

    public final void a(b b1)
    {
        synchronized (VO)
        {
            VO.add(b1);
        }
        mHandler.sendMessage(mHandler.obtainMessage(2, b1));
        return;
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    protected abstract void a(kj kj, e e1)
        throws RemoteException;

    protected final void aX(IBinder ibinder)
    {
        try
        {
            a(kj.a.ba(ibinder), new e(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "service died");
            dg(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "Remote exception occurred", ibinder);
        }
    }

    protected abstract String bK();

    protected abstract String bL();

    public final void connect()
    {
        VS = true;
        a(2, ((IInterface) (null)));
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i != 0)
        {
            a(1, ((IInterface) (null)));
            mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(i)));
        } else
        {
            if (VP != null)
            {
                Log.e("GmsClient", (new StringBuilder("Calling connect() while still connected, missing disconnect() for ")).append(bK()).toString());
                kd.L(mContext).b(bK(), VP);
            }
            VP = new f();
            if (!kd.L(mContext).a(bK(), VP))
            {
                Log.e("GmsClient", (new StringBuilder("unable to connect to service: ")).append(bK()).toString());
                mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
    }

    protected final void dR()
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
        VS = false;
        ArrayList arraylist = VO;
        arraylist;
        JVM INSTR monitorenter ;
        int j = VO.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)VO.get(i)).iS();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        VO.clear();
        arraylist;
        JVM INSTR monitorexit ;
        a(1, ((IInterface) (null)));
        if (VP != null)
        {
            kd.L(mContext).b(bK(), VP);
            VP = null;
        }
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Context getContext()
    {
        return mContext;
    }

    public final Bundle ht()
    {
        return null;
    }

    public final IInterface iP()
        throws DeadObjectException
    {
        Object obj = mK;
        obj;
        JVM INSTR monitorenter ;
        if (VQ == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        dR();
        IInterface iinterface;
        boolean flag;
        if (VN != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.a(flag, "Client is connected but service is null");
        iinterface = VN;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    public final boolean ij()
    {
        return VS;
    }

    public final boolean isConnected()
    {
        Object obj = mK;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (VQ == 3)
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

    public final boolean isConnecting()
    {
        Object obj = mK;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (VQ == 2)
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

    protected abstract IInterface p(IBinder ibinder);

}
