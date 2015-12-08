// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzu, zzk, zze, ValidateAccountRequest, 
//            zzp, GetServiceRequest, IAccountAccessor

public abstract class zzi
    implements com.google.android.gms.common.api.Api.Client, zzj.zza
{

    public static final String c[] = {
        "service_esmobile", "service_googleme"
    };
    final Handler a;
    protected AtomicInteger b;
    private final Context d;
    private final com.google.android.gms.common.internal.zze e;
    private final Looper f;
    private final zzk g;
    private final Object h;
    private zzp i;
    private com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks j;
    private IInterface k;
    private final ArrayList l;
    private zze m;
    private int n;
    private final Set o;
    private final Account p;
    private com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks q;
    private com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r;
    private final int s;

    protected zzi(Context context, Looper looper, int i1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        h = new Object();
        l = new ArrayList();
        n = 1;
        b = new AtomicInteger(0);
        d = (Context)zzu.a(context);
        f = (Looper)zzu.a(looper, "Looper must not be null");
        g = zzk.a(context);
        a = new zzb(looper);
        s = i1;
        p = null;
        o = Collections.emptySet();
        e = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).a();
        q = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)zzu.a(connectioncallbacks);
        r = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)zzu.a(onconnectionfailedlistener);
    }

    protected zzi(Context context, Looper looper, int i1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze1)
    {
        this(context, looper, zzk.a(context), i1, zze1, connectioncallbacks, onconnectionfailedlistener);
    }

    protected zzi(Context context, Looper looper, zzk zzk1, int i1, zze zze1)
    {
        h = new Object();
        l = new ArrayList();
        n = 1;
        b = new AtomicInteger(0);
        d = (Context)zzu.a(context, "Context must not be null");
        f = (Looper)zzu.a(looper, "Looper must not be null");
        g = (zzk)zzu.a(zzk1, "Supervisor must not be null");
        a = new zzb(looper);
        s = i1;
        e = (zze)zzu.a(zze1);
        p = zze1.b();
        o = b(zze1.e());
    }

    protected zzi(Context context, Looper looper, zzk zzk1, int i1, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        this(context, looper, zzk1, i1, zze1);
        q = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)zzu.a(connectioncallbacks);
        r = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)zzu.a(onconnectionfailedlistener);
    }

    static com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks a(zzi zzi1)
    {
        return zzi1.j;
    }

    static zzp a(zzi zzi1, zzp zzp1)
    {
        zzi1.i = zzp1;
        return zzp1;
    }

    private void a(int i1, IInterface iinterface)
    {
        boolean flag2 = true;
        Object obj;
        boolean flag;
        boolean flag1;
        if (i1 == 3)
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
        zzu.b(flag2);
        obj = h;
        obj;
        JVM INSTR monitorenter ;
        n = i1;
        k = iinterface;
        i1;
        JVM INSTR tableswitch 1 3: default 105
    //                   1 98
    //                   2 79
    //                   3 91;
           goto _L1 _L2 _L3 _L4
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        p();
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L4:
        h_();
          goto _L1
_L2:
        q();
          goto _L1
    }

    static void a(zzi zzi1, int i1, IInterface iinterface)
    {
        zzi1.a(i1, iinterface);
    }

    private boolean a(int i1, int j1, IInterface iinterface)
    {
label0:
        {
            synchronized (h)
            {
                if (n == i1)
                {
                    break label0;
                }
            }
            return false;
        }
        a(j1, iinterface);
        obj;
        JVM INSTR monitorexit ;
        return true;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static boolean a(zzi zzi1, int i1, int j1, IInterface iinterface)
    {
        return zzi1.a(i1, j1, iinterface);
    }

    static com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks b(zzi zzi1)
    {
        return zzi1.q;
    }

    private Set b(Set set)
    {
        Set set1 = a(set);
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

    private void b(com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks connectionprogressreportcallbacks)
    {
        j = (com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks)zzu.a(connectionprogressreportcallbacks, "Connection progress callbacks cannot be null.");
    }

    static ArrayList c(zzi zzi1)
    {
        return zzi1.l;
    }

    static Set d(zzi zzi1)
    {
        return zzi1.o;
    }

    static com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener e(zzi zzi1)
    {
        return zzi1.r;
    }

    static Context f(zzi zzi1)
    {
        return zzi1.d;
    }

    private void p()
    {
        if (m != null)
        {
            Log.e("GmsClient", (new StringBuilder()).append("Calling connect() while still connected, missing disconnect() for ").append(d()).toString());
            g.b(d(), m, f());
            b.incrementAndGet();
        }
        m = new zze(b.get());
        if (!g.a(d(), m, f()))
        {
            Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(d()).toString());
            a.sendMessage(a.obtainMessage(3, b.get(), 9));
        }
    }

    private void q()
    {
        if (m != null)
        {
            g.b(d(), m, f());
            m = null;
        }
    }

    protected abstract IInterface a(IBinder ibinder);

    protected Set a(Set set)
    {
        return set;
    }

    public void a()
    {
        b.incrementAndGet();
        ArrayList arraylist = l;
        arraylist;
        JVM INSTR monitorenter ;
        int j1 = l.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((zzc)l.get(i1)).e();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        l.clear();
        arraylist;
        JVM INSTR monitorexit ;
        a(1, ((IInterface) (null)));
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(int i1)
    {
    }

    protected void a(int i1, Bundle bundle, int j1)
    {
        a.sendMessage(a.obtainMessage(5, j1, -1, new zzi(i1, bundle)));
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        a.sendMessage(a.obtainMessage(1, j1, -1, new zzg(i1, ibinder, bundle)));
    }

    protected void a(ConnectionResult connectionresult)
    {
    }

    public void a(com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks connectionprogressreportcallbacks)
    {
        b(connectionprogressreportcallbacks);
        a(2, ((IInterface) (null)));
    }

    public void a(IAccountAccessor iaccountaccessor)
    {
        Bundle bundle = n();
        iaccountaccessor = new ValidateAccountRequest(iaccountaccessor, (Scope[])o.toArray(new Scope[o.size()]), d.getPackageName(), bundle);
        try
        {
            i.a(new zzd(b.get()), iaccountaccessor);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("GmsClient", "service died");
            b(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("GmsClient", "Remote exception occurred", iaccountaccessor);
        }
    }

    public void a(IAccountAccessor iaccountaccessor, Set set)
    {
        Object obj;
        try
        {
            obj = k();
            obj = (new GetServiceRequest(s)).a(d.getPackageName()).a(((Bundle) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("GmsClient", "service died");
            b(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("GmsClient", "Remote exception occurred", iaccountaccessor);
            return;
        }
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        ((GetServiceRequest) (obj)).a(set);
        if (!c()) goto _L2; else goto _L1
_L1:
        ((GetServiceRequest) (obj)).a(j()).a(iaccountaccessor);
_L4:
        i.a(new zzd(b.get()), ((GetServiceRequest) (obj)));
        return;
_L2:
        if (o())
        {
            ((GetServiceRequest) (obj)).a(p);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int i1;
        synchronized (h)
        {
            i1 = n;
            as = k;
        }
        printwriter.append(s1).append("mConnectState=");
        i1;
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
            printwriter.append(e()).append("@").println(Integer.toHexString(System.identityHashCode(as.asBinder())));
            return;
        }
        s1;
        filedescriptor;
        JVM INSTR monitorexit ;
        throw s1;
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

    public void b(int i1)
    {
        a.sendMessage(a.obtainMessage(4, b.get(), i1));
    }

    public boolean b()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (n == 3)
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

    protected void c(int i1)
    {
        a.sendMessage(a.obtainMessage(6, i1, -1, new zzh()));
    }

    public boolean c()
    {
        return false;
    }

    protected abstract String d();

    protected abstract String e();

    public Bundle e_()
    {
        return null;
    }

    protected String f()
    {
        return e.h();
    }

    public boolean h()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (n == 2)
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

    protected void h_()
    {
    }

    public final Context i()
    {
        return d;
    }

    public final Account j()
    {
        if (p != null)
        {
            return p;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    protected Bundle k()
    {
        return new Bundle();
    }

    protected final void l()
    {
        if (!b())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public final IInterface m()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (n == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        l();
        IInterface iinterface;
        boolean flag;
        if (k != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.a(flag, "Client is connected but service is null");
        iinterface = k;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    protected Bundle n()
    {
        return null;
    }

    public boolean o()
    {
        return false;
    }


    private class zzb extends Handler
    {

        final com.google.android.gms.common.internal.zzi a;

        private void a(Message message)
        {
            message = (zzc)message.obj;
            message.b();
            message.d();
        }

        private boolean b(Message message)
        {
            return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
        }

        public void handleMessage(Message message)
        {
            if (a.b.get() != message.arg1)
            {
                if (b(message))
                {
                    a(message);
                }
                return;
            }
            if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.h())
            {
                a(message);
                return;
            }
            if (message.what == 3)
            {
                message = new ConnectionResult(message.arg2, null);
                com.google.android.gms.common.internal.zzi.a(a).a(message);
                a.a(message);
                return;
            }
            if (message.what == 4)
            {
                com.google.android.gms.common.internal.zzi.a(a, 4, null);
                if (com.google.android.gms.common.internal.zzi.b(a) != null)
                {
                    com.google.android.gms.common.internal.zzi.b(a).onConnectionSuspended(message.arg2);
                }
                a.a(message.arg2);
                com.google.android.gms.common.internal.zzi.a(a, 4, 1, null);
                return;
            }
            if (message.what == 2 && !a.b())
            {
                a(message);
                return;
            }
            if (b(message))
            {
                ((zzc)message.obj).c();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public zzb(Looper looper)
        {
            a = zzi.this;
            super(looper);
        }
    }


    private class zze
        implements ServiceConnection
    {

        final com.google.android.gms.common.internal.zzi a;
        private final int b;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            zzu.a(ibinder, "Expecting a valid IBinder");
            com.google.android.gms.common.internal.zzi.a(a, zzp.zza.a(ibinder));
            a.c(b);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            a.a.sendMessage(a.a.obtainMessage(4, b, 1));
        }

        public zze(int i1)
        {
            a = zzi.this;
            super();
            b = i1;
        }
    }


    private class zzc
    {

        private Object a;
        private boolean b;
        final com.google.android.gms.common.internal.zzi d;

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
            synchronized (com.google.android.gms.common.internal.zzi.c(d))
            {
                com.google.android.gms.common.internal.zzi.c(d).remove(this);
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

        public zzc(Object obj)
        {
            d = zzi.this;
            super();
            a = obj;
            b = false;
        }
    }


    private class zzi extends zza
    {
        private class zza extends zzc
        {

            public final int a;
            public final Bundle b;
            final com.google.android.gms.common.internal.zzi c;

            protected abstract void a(ConnectionResult connectionresult);

            protected void a(Boolean boolean1)
            {
                Object obj = null;
                if (boolean1 != null) goto _L2; else goto _L1
_L1:
                com.google.android.gms.common.internal.zzi.a(c, 1, null);
_L4:
                return;
_L2:
                switch (a)
                {
                default:
                    com.google.android.gms.common.internal.zzi.a(c, 1, null);
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
                        com.google.android.gms.common.internal.zzi.a(c, 1, null);
                        a(new ConnectionResult(8, null));
                        return;
                    }
                    break;

                case 10: // '\n'
                    com.google.android.gms.common.internal.zzi.a(c, 1, null);
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

            protected zza(int i1, Bundle bundle)
            {
                c = com.google.android.gms.common.internal.zzi.this;
                super(Boolean.valueOf(true));
                a = i1;
                b = bundle;
            }
        }


        final com.google.android.gms.common.internal.zzi e;

        protected void a(ConnectionResult connectionresult)
        {
            com.google.android.gms.common.internal.zzi.a(e).b(connectionresult);
            e.a(connectionresult);
        }

        protected boolean a()
        {
            com.google.android.gms.common.internal.zzi.a(e).b(ConnectionResult.a);
            return true;
        }

        public zzi(int i1, Bundle bundle)
        {
            e = com.google.android.gms.common.internal.zzi.this;
            super(i1, bundle);
        }
    }


    private class zzg extends zza
    {

        public final IBinder e;
        final com.google.android.gms.common.internal.zzi f;

        protected void a(ConnectionResult connectionresult)
        {
            if (com.google.android.gms.common.internal.zzi.e(f) != null)
            {
                com.google.android.gms.common.internal.zzi.e(f).onConnectionFailed(connectionresult);
            }
            f.a(connectionresult);
        }

        protected boolean a()
        {
            String s1;
            try
            {
                s1 = e.getInterfaceDescriptor();
            }
            catch (RemoteException remoteexception)
            {
                Log.w("GmsClient", "service probably died");
                return false;
            }
            if (!f.e().equals(s1))
            {
                Log.e("GmsClient", (new StringBuilder()).append("service descriptor mismatch: ").append(f.e()).append(" vs. ").append(s1).toString());
            } else
            {
                IInterface iinterface = f.a(e);
                if (iinterface != null && com.google.android.gms.common.internal.zzi.a(f, 2, 3, iinterface))
                {
                    Bundle bundle = f.e_();
                    if (com.google.android.gms.common.internal.zzi.b(f) != null)
                    {
                        com.google.android.gms.common.internal.zzi.b(f).onConnected(bundle);
                    }
                    GooglePlayServicesUtil.c(com.google.android.gms.common.internal.zzi.f(f));
                    return true;
                }
            }
            return false;
        }

        public zzg(int i1, IBinder ibinder, Bundle bundle)
        {
            f = com.google.android.gms.common.internal.zzi.this;
            super(i1, bundle);
            e = ibinder;
        }
    }


    private class zzd extends zzo.zza
    {

        private com.google.android.gms.common.internal.zzi a;
        private final int b;

        private void a()
        {
            a = null;
        }

        public void a(int i1, Bundle bundle)
        {
            zzu.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
            a.a(i1, bundle, b);
            a();
        }

        public void a(int i1, IBinder ibinder, Bundle bundle)
        {
            zzu.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
            a.a(i1, ibinder, bundle, b);
            a();
        }

        public zzd(int i1)
        {
            a = com.google.android.gms.common.internal.zzi.this;
            b = i1;
        }
    }


    private class zzh extends zza
    {

        final com.google.android.gms.common.internal.zzi e;

        protected void a(ConnectionResult connectionresult)
        {
            com.google.android.gms.common.internal.zzi.a(e).a(connectionresult);
            e.a(connectionresult);
        }

        protected boolean a()
        {
            com.google.android.gms.common.internal.zzi.a(e).a(ConnectionResult.a);
            return true;
        }

        public zzh()
        {
            e = com.google.android.gms.common.internal.zzi.this;
            super(0, null);
        }
    }

}
