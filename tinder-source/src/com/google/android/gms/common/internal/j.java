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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            l, u, g, ValidateAccountRequest, 
//            r, GetServiceRequest, o

public abstract class j
    implements com.google.android.gms.common.api.a.b, k.a
{
    private abstract class a extends c
    {

        public final int a;
        public final Bundle b;
        final j c;

        protected abstract void a(ConnectionResult connectionresult);

        protected final void a(Object obj)
        {
            Object obj1 = null;
            if ((Boolean)obj != null) goto _L2; else goto _L1
_L1:
            j.a(c, 1);
_L4:
            return;
_L2:
            switch (a)
            {
            default:
                j.a(c, 1);
                obj = obj1;
                if (b != null)
                {
                    obj = (PendingIntent)b.getParcelable("pendingIntent");
                }
                a(new ConnectionResult(a, ((PendingIntent) (obj))));
                return;

            case 0: // '\0'
                if (!a())
                {
                    j.a(c, 1);
                    a(new ConnectionResult(8, null));
                    return;
                }
                break;

            case 10: // '\n'
                j.a(c, 1);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected abstract boolean a();

        protected a(int i1, Bundle bundle)
        {
            c = j.this;
            super(Boolean.valueOf(true));
            a = i1;
            b = bundle;
        }
    }

    final class b extends Handler
    {

        final j a;

        private static void a(Message message)
        {
            ((c)message.obj).c();
        }

        private static boolean b(Message message)
        {
            return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
        }

        public final void handleMessage(Message message)
        {
            if (a.c.get() != message.arg1)
            {
                if (b(message))
                {
                    a(message);
                }
                return;
            }
            if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.j())
            {
                a(message);
                return;
            }
            if (message.what == 3)
            {
                message = new ConnectionResult(message.arg2, null);
                j.a(a).a(message);
                j.g_();
                return;
            }
            if (message.what == 4)
            {
                j.a(a, 4);
                if (com.google.android.gms.common.internal.j.b(a) != null)
                {
                    com.google.android.gms.common.internal.j.b(a).a(message.arg2);
                }
                int i1 = message.arg2;
                j.g();
                j.a(a, 4, 1, null);
                return;
            }
            if (message.what == 2 && !a.b())
            {
                a(message);
                return;
            }
            if (b(message))
            {
                ((c)message.obj).b();
                return;
            } else
            {
                Log.wtf("GmsClient", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
                return;
            }
        }

        public b(Looper looper)
        {
            a = j.this;
            super(looper);
        }
    }

    protected abstract class c
    {

        private Object a;
        private boolean b;
        final j d;

        protected abstract void a(Object obj);

        public final void b()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = a;
            if (b)
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
                    a(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    throw obj1;
                }
            }
            this;
            JVM INSTR monitorenter ;
            b = true;
            this;
            JVM INSTR monitorexit ;
            c();
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

        public final void c()
        {
            d();
            synchronized (j.c(d))
            {
                j.c(d).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void d()
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
            d = j.this;
            super();
            a = obj;
            b = false;
        }
    }

    public static final class d extends q.a
    {

        private j a;
        private final int b;

        public final void a(int i1, Bundle bundle)
        {
            u.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
            j j1 = a;
            int k1 = b;
            j1.b.sendMessage(j1.b.obtainMessage(5, k1, -1, j1. new i(i1, bundle)));
            a = null;
        }

        public final void a(int i1, IBinder ibinder, Bundle bundle)
        {
            u.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
            a.a(i1, ibinder, bundle, b);
            a = null;
        }

        public d(j j1, int i1)
        {
            a = j1;
            b = i1;
        }
    }

    public final class e
        implements ServiceConnection
    {

        final j a;
        private final int b;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            u.a(ibinder, "Expecting a valid IBinder");
            j.a(a, com.google.android.gms.common.internal.r.a.a(ibinder));
            componentname = a;
            int i1 = b;
            ((j) (componentname)).b.sendMessage(((j) (componentname)).b.obtainMessage(6, i1, -1, componentname. new h()));
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            a.b.sendMessage(a.b.obtainMessage(4, b, 1));
        }

        public e(int i1)
        {
            a = j.this;
            super();
            b = i1;
        }
    }

    protected final class f
        implements com.google.android.gms.common.api.c.e
    {

        final j a;

        public final void a(ConnectionResult connectionresult)
        {
            if (connectionresult.b())
            {
                a.a(null, j.d(a));
            } else
            if (j.e(a) != null)
            {
                j.e(a).a(connectionresult);
                return;
            }
        }

        public final void b(ConnectionResult connectionresult)
        {
            throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
        }

        public f()
        {
            a = j.this;
            super();
        }
    }

    protected final class g extends a
    {

        public final IBinder e;
        final j f;

        protected final void a(ConnectionResult connectionresult)
        {
            if (j.e(f) != null)
            {
                j.e(f).a(connectionresult);
            }
            j.g_();
        }

        protected final boolean a()
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
            if (!f.f().equals(s1))
            {
                Log.e("GmsClient", (new StringBuilder("service descriptor mismatch: ")).append(f.f()).append(" vs. ").append(s1).toString());
            } else
            {
                IInterface iinterface = f.a(e);
                if (iinterface != null && j.a(f, 2, 3, iinterface))
                {
                    if (com.google.android.gms.common.internal.j.b(f) != null)
                    {
                        com.google.android.gms.common.internal.j.b(f).a(null);
                    }
                    return true;
                }
            }
            return false;
        }

        public g(int i1, IBinder ibinder, Bundle bundle)
        {
            f = j.this;
            super(i1, bundle);
            e = ibinder;
        }
    }

    protected final class h extends a
    {

        final j e;

        protected final void a(ConnectionResult connectionresult)
        {
            j.a(e).a(connectionresult);
            j.g_();
        }

        protected final boolean a()
        {
            j.a(e).a(ConnectionResult.a);
            return true;
        }

        public h()
        {
            e = j.this;
            super(0, null);
        }
    }

    protected final class i extends a
    {

        final j e;

        protected final void a(ConnectionResult connectionresult)
        {
            j.a(e).b(connectionresult);
            j.g_();
        }

        protected final boolean a()
        {
            j.a(e).b(ConnectionResult.a);
            return true;
        }

        public i(int i1, Bundle bundle)
        {
            e = j.this;
            super(i1, bundle);
        }
    }


    public static final String d[] = {
        "service_esmobile", "service_googleme"
    };
    public final Context a;
    final Handler b;
    protected AtomicInteger c;
    private final com.google.android.gms.common.internal.g e;
    private final Looper f;
    private final l g;
    private final com.google.android.gms.common.b h;
    private final Object i;
    private r j;
    private com.google.android.gms.common.api.c.e k;
    private IInterface l;
    private final ArrayList m;
    private e n;
    private int o;
    private final Set p;
    private final Account q;
    private final com.google.android.gms.common.api.c.b r;
    private final com.google.android.gms.common.api.c.c s;
    private final int t;

    public j(Context context, Looper looper, int i1, com.google.android.gms.common.internal.g g1, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c1)
    {
        this(context, looper, com.google.android.gms.common.internal.l.a(context), com.google.android.gms.common.b.a(), i1, g1, (com.google.android.gms.common.api.c.b)u.a(b1), (com.google.android.gms.common.api.c.c)u.a(c1));
    }

    private j(Context context, Looper looper, l l1, com.google.android.gms.common.b b1, int i1, com.google.android.gms.common.internal.g g1, com.google.android.gms.common.api.c.b b2, 
            com.google.android.gms.common.api.c.c c1)
    {
        i = new Object();
        m = new ArrayList();
        o = 1;
        c = new AtomicInteger(0);
        a = (Context)u.a(context, "Context must not be null");
        f = (Looper)u.a(looper, "Looper must not be null");
        g = (l)u.a(l1, "Supervisor must not be null");
        h = (com.google.android.gms.common.b)u.a(b1, "API availability must not be null");
        b = new b(looper);
        t = i1;
        e = (com.google.android.gms.common.internal.g)u.a(g1);
        q = g1.a;
        p = a(g1.c);
        r = b2;
        s = c1;
    }

    static com.google.android.gms.common.api.c.e a(j j1)
    {
        return j1.k;
    }

    static r a(j j1, r r1)
    {
        j1.j = r1;
        return r1;
    }

    private static Set a(Set set)
    {
        if (set != null)
        {
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) 
            {
                if (!set.contains((Scope)iterator.next()))
                {
                    throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
                }
            }
        }
        return set;
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
        com.google.android.gms.common.internal.u.b(flag2);
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        o = i1;
        l = iinterface;
        i1;
        JVM INSTR tableswitch 1 3: default 267
    //                   1 237
    //                   2 79
    //                   3 76;
           goto _L1 _L2 _L3 _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (n != null)
        {
            Log.e("GmsClient", (new StringBuilder("Calling connect() while still connected, missing disconnect() for ")).append(e()).toString());
            g.a(e(), n);
            c.incrementAndGet();
        }
        n = new e(c.get());
        if (!g.a(e(), n, e.f))
        {
            Log.e("GmsClient", (new StringBuilder("unable to connect to service: ")).append(e()).toString());
            b.sendMessage(b.obtainMessage(3, c.get(), 9));
        }
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L2:
        if (n == null) goto _L1; else goto _L4
_L4:
        g.a(e(), n);
        n = null;
          goto _L1
    }

    static void a(j j1, int i1)
    {
        j1.a(i1, ((IInterface) (null)));
    }

    private boolean a(int i1, int j1, IInterface iinterface)
    {
label0:
        {
            synchronized (i)
            {
                if (o == i1)
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

    static boolean a(j j1, int i1, int k1, IInterface iinterface)
    {
        return j1.a(i1, k1, iinterface);
    }

    static com.google.android.gms.common.api.c.b b(j j1)
    {
        return j1.r;
    }

    static ArrayList c(j j1)
    {
        return j1.m;
    }

    static Set d(j j1)
    {
        return j1.p;
    }

    static com.google.android.gms.common.api.c.c e(j j1)
    {
        return j1.s;
    }

    protected static void g()
    {
    }

    protected static void g_()
    {
    }

    private void o()
    {
        b.sendMessage(b.obtainMessage(4, c.get(), 1));
    }

    public abstract IInterface a(IBinder ibinder);

    public void a()
    {
        c.incrementAndGet();
        ArrayList arraylist = m;
        arraylist;
        JVM INSTR monitorenter ;
        int j1 = m.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((c)m.get(i1)).d();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        m.clear();
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

    public void a(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        b.sendMessage(b.obtainMessage(1, j1, -1, new g(i1, ibinder, bundle)));
    }

    public final void a(com.google.android.gms.common.api.c.e e1)
    {
        k = (com.google.android.gms.common.api.c.e)u.a(e1, "Connection progress callbacks cannot be null.");
        a(2, ((IInterface) (null)));
    }

    public final void a(o o1)
    {
        o1 = new ValidateAccountRequest(o1, (Scope[])p.toArray(new Scope[p.size()]), a.getPackageName());
        try
        {
            j.a(new d(this, c.get()), o1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            Log.w("GmsClient", "service died");
            o();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            Log.w("GmsClient", "Remote exception occurred", o1);
        }
    }

    public final void a(o o1, Set set)
    {
        GetServiceRequest getservicerequest;
        Bundle bundle = k();
        getservicerequest = new GetServiceRequest(t);
        getservicerequest.d = a.getPackageName();
        getservicerequest.g = bundle;
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        getservicerequest.f = (Scope[])set.toArray(new Scope[set.size()]);
        if (!c()) goto _L2; else goto _L1
_L1:
        if (q == null) goto _L4; else goto _L3
_L3:
        set = q;
_L5:
        getservicerequest.h = set;
        if (o1 == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        getservicerequest.e = o1.asBinder();
_L7:
        j.a(new d(this, c.get()), getservicerequest);
        return;
_L4:
        try
        {
            set = new Account("<<default account>>", "com.google");
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            Log.w("GmsClient", "service died");
            o();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            Log.w("GmsClient", "Remote exception occurred", o1);
            return;
        }
          goto _L5
_L2:
        if (!n()) goto _L7; else goto _L6
_L6:
        getservicerequest.h = q;
          goto _L7
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        IInterface iinterface;
        int i1;
        synchronized (i)
        {
            i1 = o;
            iinterface = l;
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
        if (iinterface == null)
        {
            printwriter.println("null");
            return;
        } else
        {
            printwriter.append(f()).append("@").println(Integer.toHexString(System.identityHashCode(iinterface.asBinder())));
            return;
        }
        s1;
        obj;
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

    public final boolean b()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (o == 3)
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

    public boolean c()
    {
        return false;
    }

    public final IBinder d()
    {
        if (j == null)
        {
            return null;
        } else
        {
            return j.asBinder();
        }
    }

    public abstract String e();

    public abstract String f();

    public final void i()
    {
        int i1 = com.google.android.gms.common.b.a(a);
        if (i1 != 0)
        {
            a(1, ((IInterface) (null)));
            k = new f();
            b.sendMessage(b.obtainMessage(3, c.get(), i1));
            return;
        } else
        {
            a(new f());
            return;
        }
    }

    public final boolean j()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (o == 2)
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

    public Bundle k()
    {
        return new Bundle();
    }

    public final void l()
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
        throws DeadObjectException
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (o == 4)
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
        if (l != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag, "Client is connected but service is null");
        iinterface = l;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    public boolean n()
    {
        return false;
    }

}
