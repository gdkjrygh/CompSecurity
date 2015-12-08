// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
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
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            o, z, i, ValidateAccountRequest, 
//            u, GetServiceRequest, r

public abstract class m
    implements com.google.android.gms.common.api.a.c, n.a
{
    private abstract class a extends c
    {

        public final int a;
        public final Bundle b;
        final m c;

        protected abstract void a(ConnectionResult connectionresult);

        protected void a(Boolean boolean1)
        {
            Object obj = null;
            if (boolean1 != null) goto _L2; else goto _L1
_L1:
            m.zza(c, 1, null);
_L4:
            return;
_L2:
            switch (a)
            {
            default:
                m.zza(c, 1, null);
                boolean1 = obj;
                if (b != null)
                {
                    boolean1 = (PendingIntent)b.getParcelable("pendingIntent");
                }
                a(new ConnectionResult(a, boolean1));
                return;

            case 0: // '\0'
                if (!a())
                {
                    m.zza(c, 1, null);
                    a(new ConnectionResult(8, null));
                    return;
                }
                break;

            case 10: // '\n'
                m.zza(c, 1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected void a(Object obj)
        {
            a((Boolean)obj);
        }

        protected abstract boolean a();

        protected void b()
        {
        }

        protected a(int j, Bundle bundle)
        {
            c = m.this;
            super(Boolean.valueOf(true));
            a = j;
            b = bundle;
        }
    }

    final class b extends Handler
    {

        final m a;

        private void a(Message message)
        {
            message = (c)message.obj;
            message.b();
            message.d();
        }

        private boolean b(Message message)
        {
            return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
        }

        public void handleMessage(Message message)
        {
            if (a.zzadE.get() != message.arg1)
            {
                if (b(message))
                {
                    a(message);
                }
                return;
            }
            if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.isConnecting())
            {
                a(message);
                return;
            }
            if (message.what == 3)
            {
                message = new ConnectionResult(message.arg2, null);
                m.zza(a).a(message);
                a.onConnectionFailed(message);
                return;
            }
            if (message.what == 4)
            {
                m.zza(a, 4, null);
                if (m.zzb(a) != null)
                {
                    m.zzb(a).onConnectionSuspended(message.arg2);
                }
                a.onConnectionSuspended(message.arg2);
                m.zza(a, 4, 1, null);
                return;
            }
            if (message.what == 2 && !a.isConnected())
            {
                a(message);
                return;
            }
            if (b(message))
            {
                ((c)message.obj).c();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public b(Looper looper)
        {
            a = m.this;
            super(looper);
        }
    }

    protected abstract class c
    {

        private Object a;
        private boolean b;
        final m d;

        protected abstract void a(Object obj);

        protected abstract void b();

        public void c()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = a;
            if (b)
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
                    b();
                    throw obj1;
                }
            } else
            {
                b();
            }
            this;
            JVM INSTR monitorenter ;
            b = true;
            this;
            JVM INSTR monitorexit ;
            d();
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

        public void d()
        {
            e();
            synchronized (m.zzc(d))
            {
                m.zzc(d).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void e()
        {
            this;
            JVM INSTR monitorenter ;
            a = null;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public c(Object obj)
        {
            d = m.this;
            super();
            a = obj;
            b = false;
        }
    }

    public static final class d extends t.a
    {

        private m a;
        private final int b;

        private void a()
        {
            a = null;
        }

        public void a(int j, Bundle bundle)
        {
            z.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
            a.zza(j, bundle, b);
            a();
        }

        public void a(int j, IBinder ibinder, Bundle bundle)
        {
            z.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
            a.zza(j, ibinder, bundle, b);
            a();
        }

        public d(m m1, int j)
        {
            a = m1;
            b = j;
        }
    }

    public final class e
        implements ServiceConnection
    {

        final m a;
        private final int b;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            z.a(ibinder, "Expecting a valid IBinder");
            m.zza(a, u.a.a(ibinder));
            a.zzbA(b);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            a.mHandler.sendMessage(a.mHandler.obtainMessage(4, b, 1));
        }

        public e(int j)
        {
            a = m.this;
            super();
            b = j;
        }
    }

    protected class f
        implements com.google.android.gms.common.api.c.e
    {

        final m a;

        public void a(ConnectionResult connectionresult)
        {
            if (connectionresult.b())
            {
                a.zza(null, m.zzd(a));
            } else
            if (m.zze(a) != null)
            {
                m.zze(a).onConnectionFailed(connectionresult);
                return;
            }
        }

        public void b(ConnectionResult connectionresult)
        {
            throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
        }

        public f()
        {
            a = m.this;
            super();
        }
    }

    protected final class g extends a
    {

        public final IBinder e;
        final m f;

        protected void a(ConnectionResult connectionresult)
        {
            if (m.zze(f) != null)
            {
                m.zze(f).onConnectionFailed(connectionresult);
            }
            f.onConnectionFailed(connectionresult);
        }

        protected boolean a()
        {
            String s;
            try
            {
                s = e.getInterfaceDescriptor();
            }
            catch (RemoteException remoteexception)
            {
                Log.w("GmsClient", "service probably died");
                return false;
            }
            if (!f.zzfB().equals(s))
            {
                Log.e("GmsClient", (new StringBuilder()).append("service descriptor mismatch: ").append(f.zzfB()).append(" vs. ").append(s).toString());
            } else
            {
                IInterface iinterface = f.zzV(e);
                if (iinterface != null && m.zza(f, 2, 3, iinterface))
                {
                    Bundle bundle = f.zzmw();
                    if (m.zzb(f) != null)
                    {
                        m.zzb(f).onConnected(bundle);
                    }
                    return true;
                }
            }
            return false;
        }

        public g(int j, IBinder ibinder, Bundle bundle)
        {
            f = m.this;
            super(j, bundle);
            e = ibinder;
        }
    }

    protected final class h extends a
    {

        final m e;

        protected void a(ConnectionResult connectionresult)
        {
            m.zza(e).a(connectionresult);
            e.onConnectionFailed(connectionresult);
        }

        protected boolean a()
        {
            m.zza(e).a(ConnectionResult.a);
            return true;
        }

        public h()
        {
            e = m.this;
            super(0, null);
        }
    }

    protected final class i extends a
    {

        final m e;

        protected void a(ConnectionResult connectionresult)
        {
            m.zza(e).b(connectionresult);
            e.onConnectionFailed(connectionresult);
        }

        protected boolean a()
        {
            m.zza(e).b(ConnectionResult.a);
            return true;
        }

        public i(int j, Bundle bundle)
        {
            e = m.this;
            super(j, bundle);
        }
    }


    public static final String zzadF[] = {
        "service_esmobile", "service_googleme"
    };
    private final Context mContext;
    final Handler mHandler;
    private final Account zzOY;
    private final Looper zzYV;
    private final com.google.android.gms.common.internal.i zzZH;
    private final com.google.android.gms.common.b zzZi;
    private final Set zzZp;
    private int zzadA;
    private final com.google.android.gms.common.api.c.b zzadB;
    private final com.google.android.gms.common.api.c.c zzadC;
    private final int zzadD;
    protected AtomicInteger zzadE;
    private final o zzadu;
    private u zzadv;
    private com.google.android.gms.common.api.c.e zzadw;
    private IInterface zzadx;
    private final ArrayList zzady;
    private e zzadz;
    private final Object zzpc;

    protected m(Context context, Looper looper, int j, com.google.android.gms.common.internal.i k, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c1)
    {
        this(context, looper, o.a(context), com.google.android.gms.common.b.a(), j, k, (com.google.android.gms.common.api.c.b)z.a(b1), (com.google.android.gms.common.api.c.c)z.a(c1));
    }

    protected m(Context context, Looper looper, o o1, com.google.android.gms.common.b b1, int j, com.google.android.gms.common.internal.i k, com.google.android.gms.common.api.c.b b2, 
            com.google.android.gms.common.api.c.c c1)
    {
        zzpc = new Object();
        zzady = new ArrayList();
        zzadA = 1;
        zzadE = new AtomicInteger(0);
        mContext = (Context)z.a(context, "Context must not be null");
        zzYV = (Looper)z.a(looper, "Looper must not be null");
        zzadu = (o)z.a(o1, "Supervisor must not be null");
        zzZi = (com.google.android.gms.common.b)z.a(b1, "API availability must not be null");
        mHandler = new b(looper);
        zzadD = j;
        zzZH = (com.google.android.gms.common.internal.i)z.a(k);
        zzOY = k.a();
        zzZp = zzb(k.d());
        zzadB = b2;
        zzadC = c1;
    }

    static com.google.android.gms.common.api.c.e zza(m m1)
    {
        return m1.zzadw;
    }

    static u zza(m m1, u u1)
    {
        m1.zzadv = u1;
        return u1;
    }

    static void zza(m m1, int j, IInterface iinterface)
    {
        m1.zzb(j, iinterface);
    }

    private boolean zza(int j, int k, IInterface iinterface)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzadA == j)
                {
                    break label0;
                }
            }
            return false;
        }
        zzb(k, iinterface);
        obj;
        JVM INSTR monitorexit ;
        return true;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static boolean zza(m m1, int j, int k, IInterface iinterface)
    {
        return m1.zza(j, k, iinterface);
    }

    static com.google.android.gms.common.api.c.b zzb(m m1)
    {
        return m1.zzadB;
    }

    private Set zzb(Set set)
    {
        Set set1 = zza(set);
        if (set1 == null)
        {
            return set1;
        }
        for (Iterator iterator = set1.iterator(); iterator.hasNext();)
        {
            if (!set.contains((Scope)iterator.next()))
            {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }

        return set1;
    }

    private void zzb(int j, IInterface iinterface)
    {
        boolean flag2 = true;
        Object obj;
        boolean flag;
        boolean flag1;
        if (j == 3)
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
        com.google.android.gms.common.internal.z.b(flag2);
        obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzadA = j;
        zzadx = iinterface;
        zzc(j, iinterface);
        j;
        JVM INSTR tableswitch 1 3: default 109
    //                   1 102
    //                   2 83
    //                   3 95;
           goto _L1 _L2 _L3 _L4
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        zzov();
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L4:
        zzou();
          goto _L1
_L2:
        zzow();
          goto _L1
    }

    static ArrayList zzc(m m1)
    {
        return m1.zzady;
    }

    static Set zzd(m m1)
    {
        return m1.zzZp;
    }

    static com.google.android.gms.common.api.c.c zze(m m1)
    {
        return m1.zzadC;
    }

    private void zzov()
    {
        if (zzadz != null)
        {
            Log.e("GmsClient", (new StringBuilder()).append("Calling connect() while still connected, missing disconnect() for ").append(zzfA()).toString());
            zzadu.b(zzfA(), zzadz, zzot());
            zzadE.incrementAndGet();
        }
        zzadz = new e(zzadE.get());
        if (!zzadu.a(zzfA(), zzadz, zzot()))
        {
            Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(zzfA()).toString());
            mHandler.sendMessage(mHandler.obtainMessage(3, zzadE.get(), 9));
        }
    }

    private void zzow()
    {
        if (zzadz != null)
        {
            zzadu.b(zzfA(), zzadz, zzot());
            zzadz = null;
        }
    }

    public void disconnect()
    {
        zzadE.incrementAndGet();
        ArrayList arraylist = zzady;
        arraylist;
        JVM INSTR monitorenter ;
        int k = zzady.size();
        int j = 0;
_L2:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        ((c)zzady.get(j)).e();
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        zzady.clear();
        arraylist;
        JVM INSTR monitorexit ;
        zzb(1, null);
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int j;
        synchronized (zzpc)
        {
            j = zzadA;
            as = zzadx;
        }
        printwriter.append(s).append("mConnectState=");
        j;
        JVM INSTR tableswitch 1 4: default 64
    //                   1 127
    //                   2 97
    //                   3 107
    //                   4 117;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_127;
_L1:
        printwriter.print("UNKNOWN");
_L6:
        printwriter.append(" mService=");
        if (as == null)
        {
            printwriter.println("null");
            return;
        } else
        {
            printwriter.append(zzfB()).append("@").println(Integer.toHexString(System.identityHashCode(as.asBinder())));
            return;
        }
        s;
        filedescriptor;
        JVM INSTR monitorexit ;
        throw s;
_L3:
        printwriter.print("CONNECTING");
          goto _L6
_L4:
        printwriter.print("CONNECTED");
          goto _L6
_L5:
        printwriter.print("DISCONNECTING");
          goto _L6
        printwriter.print("DISCONNECTED");
          goto _L6
    }

    public final Context getContext()
    {
        return mContext;
    }

    public final Looper getLooper()
    {
        return zzYV;
    }

    public boolean isConnected()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzadA == 3)
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
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzadA == 2)
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

    protected void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    protected void onConnectionSuspended(int j)
    {
    }

    protected abstract IInterface zzV(IBinder ibinder);

    protected Set zza(Set set)
    {
        return set;
    }

    protected void zza(int j, Bundle bundle, int k)
    {
        mHandler.sendMessage(mHandler.obtainMessage(5, k, -1, new i(j, bundle)));
    }

    protected void zza(int j, IBinder ibinder, Bundle bundle, int k)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, k, -1, new g(j, ibinder, bundle)));
    }

    public void zza(com.google.android.gms.common.api.c.e e1)
    {
        zzadw = (com.google.android.gms.common.api.c.e)z.a(e1, "Connection progress callbacks cannot be null.");
        zzb(2, null);
    }

    public void zza(r r)
    {
        Bundle bundle = zzoB();
        r = new ValidateAccountRequest(r, (Scope[])zzZp.toArray(new Scope[zzZp.size()]), mContext.getPackageName(), bundle);
        try
        {
            zzadv.a(new d(this, zzadE.get()), r);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (r r)
        {
            Log.w("GmsClient", "service died");
            zzbz(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (r r)
        {
            Log.w("GmsClient", "Remote exception occurred", r);
        }
    }

    public void zza(r r, Set set)
    {
        Object obj;
        try
        {
            obj = zzli();
            obj = (new GetServiceRequest(zzadD)).a(mContext.getPackageName()).a(((Bundle) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (r r)
        {
            Log.w("GmsClient", "service died");
            zzbz(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (r r)
        {
            Log.w("GmsClient", "Remote exception occurred", r);
            return;
        }
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        ((GetServiceRequest) (obj)).a(set);
        if (!zzlm()) goto _L2; else goto _L1
_L1:
        ((GetServiceRequest) (obj)).a(zzog()).a(r);
_L4:
        zzadv.a(new d(this, zzadE.get()), ((GetServiceRequest) (obj)));
        return;
_L2:
        if (zzoC())
        {
            ((GetServiceRequest) (obj)).a(zzOY);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void zzbA(int j)
    {
        mHandler.sendMessage(mHandler.obtainMessage(6, j, -1, new h()));
    }

    public void zzbz(int j)
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, zzadE.get(), j));
    }

    protected void zzc(int j, IInterface iinterface)
    {
    }

    protected abstract String zzfA();

    protected abstract String zzfB();

    protected Bundle zzli()
    {
        return new Bundle();
    }

    public boolean zzlm()
    {
        return false;
    }

    public Bundle zzmw()
    {
        return null;
    }

    public final IInterface zzoA()
        throws DeadObjectException
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzadA == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzoz();
        IInterface iinterface;
        boolean flag;
        if (zzadx != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.a(flag, "Client is connected but service is null");
        iinterface = zzadx;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    protected Bundle zzoB()
    {
        return null;
    }

    public boolean zzoC()
    {
        return false;
    }

    public final Account zzog()
    {
        if (zzOY != null)
        {
            return zzOY;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    protected final String zzot()
    {
        return zzZH.g();
    }

    protected void zzou()
    {
    }

    public void zzox()
    {
        int j = zzZi.a(mContext);
        if (j != 0)
        {
            zzb(1, null);
            zzadw = new f();
            mHandler.sendMessage(mHandler.obtainMessage(3, zzadE.get(), j));
            return;
        } else
        {
            zza(new f());
            return;
        }
    }

    protected final com.google.android.gms.common.internal.i zzoy()
    {
        return zzZH;
    }

    protected final void zzoz()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

}
