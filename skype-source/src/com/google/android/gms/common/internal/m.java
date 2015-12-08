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
//            o, y, i, ValidateAccountRequest, 
//            u, GetServiceRequest, r

public abstract class m
    implements com.google.android.gms.common.api.a.b, n.a
{
    private abstract class a extends c
    {

        public final int a;
        public final Bundle b;
        final m c;

        protected abstract void a(ConnectionResult connectionresult);

        protected final void a(Object obj)
        {
            Object obj1 = null;
            if ((Boolean)obj != null) goto _L2; else goto _L1
_L1:
            m.a(c, 1);
_L4:
            return;
_L2:
            switch (a)
            {
            default:
                m.a(c, 1);
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
                    m.a(c, 1);
                    a(new ConnectionResult(8, null));
                    return;
                }
                break;

            case 10: // '\n'
                m.a(c, 1);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected abstract boolean a();

        protected a(int i1, Bundle bundle)
        {
            c = m.this;
            super(Boolean.valueOf(true));
            a = i1;
            b = bundle;
        }
    }

    final class b extends Handler
    {

        final m a;

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
                m.a(a).a(message);
                m.h();
                return;
            }
            if (message.what == 4)
            {
                m.a(a, 4);
                if (com.google.android.gms.common.internal.m.b(a) != null)
                {
                    com.google.android.gms.common.internal.m.b(a).onConnectionSuspended(message.arg2);
                }
                int i1 = message.arg2;
                m.g();
                m.a(a, 4, 1, null);
                return;
            }
            if (message.what == 2 && !a.e())
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
            synchronized (m.c(d))
            {
                m.c(d).remove(this);
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

        public final void a(int i1, Bundle bundle)
        {
            y.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
            m m1 = a;
            int j1 = b;
            m1.b.sendMessage(m1.b.obtainMessage(5, j1, -1, m1. new i(i1, bundle)));
            a = null;
        }

        public final void a(int i1, IBinder ibinder, Bundle bundle)
        {
            y.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
            a.a(i1, ibinder, bundle, b);
            a = null;
        }

        public d(m m1, int i1)
        {
            a = m1;
            b = i1;
        }
    }

    public final class e
        implements ServiceConnection
    {

        final m a;
        private final int b;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            y.a(ibinder, "Expecting a valid IBinder");
            m.a(a, u.a.a(ibinder));
            componentname = a;
            int i1 = b;
            ((m) (componentname)).b.sendMessage(((m) (componentname)).b.obtainMessage(6, i1, -1, componentname. new h()));
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            a.b.sendMessage(a.b.obtainMessage(4, b, 1));
        }

        public e(int i1)
        {
            a = m.this;
            super();
            b = i1;
        }
    }

    protected final class f
        implements com.google.android.gms.common.api.c.e
    {

        final m a;

        public final void a(ConnectionResult connectionresult)
        {
            if (connectionresult.b())
            {
                a.a(null, m.d(a));
            } else
            if (m.e(a) != null)
            {
                m.e(a).onConnectionFailed(connectionresult);
                return;
            }
        }

        public final void b(ConnectionResult connectionresult)
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

        protected final void a(ConnectionResult connectionresult)
        {
            if (m.e(f) != null)
            {
                m.e(f).onConnectionFailed(connectionresult);
            }
            m.h();
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
            if (!f.b().equals(s1))
            {
                Log.e("GmsClient", (new StringBuilder("service descriptor mismatch: ")).append(f.b()).append(" vs. ").append(s1).toString());
            } else
            {
                IInterface iinterface = f.a(e);
                if (iinterface != null && m.a(f, 2, 3, iinterface))
                {
                    if (com.google.android.gms.common.internal.m.b(f) != null)
                    {
                        com.google.android.gms.common.internal.m.b(f).onConnected(null);
                    }
                    return true;
                }
            }
            return false;
        }

        public g(int i1, IBinder ibinder, Bundle bundle)
        {
            f = m.this;
            super(i1, bundle);
            e = ibinder;
        }
    }

    protected final class h extends a
    {

        final m e;

        protected final void a(ConnectionResult connectionresult)
        {
            m.a(e).a(connectionresult);
            m.h();
        }

        protected final boolean a()
        {
            m.a(e).a(ConnectionResult.a);
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

        protected final void a(ConnectionResult connectionresult)
        {
            m.a(e).b(connectionresult);
            m.h();
        }

        protected final boolean a()
        {
            m.a(e).b(ConnectionResult.a);
            return true;
        }

        public i(int i1, Bundle bundle)
        {
            e = m.this;
            super(i1, bundle);
        }
    }


    public static final String d[] = {
        "service_esmobile", "service_googleme"
    };
    private final Context a;
    final Handler b;
    protected AtomicInteger c;
    private final com.google.android.gms.common.internal.i e;
    private final Looper f;
    private final o g;
    private final com.google.android.gms.common.b h;
    private final Object i;
    private u j;
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

    protected m(Context context, Looper looper, int i1, com.google.android.gms.common.internal.i j1, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c1)
    {
        this(context, looper, com.google.android.gms.common.internal.o.a(context), com.google.android.gms.common.b.a(), i1, j1, (com.google.android.gms.common.api.c.b)y.a(b1), (com.google.android.gms.common.api.c.c)y.a(c1));
    }

    private m(Context context, Looper looper, o o1, com.google.android.gms.common.b b1, int i1, com.google.android.gms.common.internal.i j1, com.google.android.gms.common.api.c.b b2, 
            com.google.android.gms.common.api.c.c c1)
    {
        i = new Object();
        m = new ArrayList();
        o = 1;
        c = new AtomicInteger(0);
        a = (Context)y.a(context, "Context must not be null");
        f = (Looper)y.a(looper, "Looper must not be null");
        g = (o)y.a(o1, "Supervisor must not be null");
        h = (com.google.android.gms.common.b)y.a(b1, "API availability must not be null");
        b = new b(looper);
        t = i1;
        e = (com.google.android.gms.common.internal.i)y.a(j1);
        q = j1.b();
        p = a(j1.e());
        r = b2;
        s = c1;
    }

    static com.google.android.gms.common.api.c.e a(m m1)
    {
        return m1.k;
    }

    static u a(m m1, u u1)
    {
        m1.j = u1;
        return u1;
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
        com.google.android.gms.common.internal.y.b(flag2);
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
            Log.e("GmsClient", (new StringBuilder("Calling connect() while still connected, missing disconnect() for ")).append(a()).toString());
            g.a(a(), n);
            c.incrementAndGet();
        }
        n = new e(c.get());
        if (!g.a(a(), n, e.h()))
        {
            Log.e("GmsClient", (new StringBuilder("unable to connect to service: ")).append(a()).toString());
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
        g.a(a(), n);
        n = null;
          goto _L1
    }

    static void a(m m1, int i1)
    {
        m1.a(i1, ((IInterface) (null)));
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

    static boolean a(m m1, int i1, int j1, IInterface iinterface)
    {
        return m1.a(i1, j1, iinterface);
    }

    static com.google.android.gms.common.api.c.b b(m m1)
    {
        return m1.r;
    }

    static ArrayList c(m m1)
    {
        return m1.m;
    }

    private void c()
    {
        b.sendMessage(b.obtainMessage(4, c.get(), 1));
    }

    static Set d(m m1)
    {
        return m1.p;
    }

    static com.google.android.gms.common.api.c.c e(m m1)
    {
        return m1.s;
    }

    protected static void g()
    {
    }

    protected static void h()
    {
    }

    protected abstract IInterface a(IBinder ibinder);

    protected abstract String a();

    protected void a(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        b.sendMessage(b.obtainMessage(1, j1, -1, new g(i1, ibinder, bundle)));
    }

    public final void a(com.google.android.gms.common.api.c.e e1)
    {
        k = (com.google.android.gms.common.api.c.e)y.a(e1, "Connection progress callbacks cannot be null.");
        a(2, ((IInterface) (null)));
    }

    public final void a(r r1)
    {
        r1 = new ValidateAccountRequest(r1, (Scope[])p.toArray(new Scope[p.size()]), a.getPackageName());
        try
        {
            j.a(new d(this, c.get()), r1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (r r1)
        {
            Log.w("GmsClient", "service died");
            c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (r r1)
        {
            Log.w("GmsClient", "Remote exception occurred", r1);
        }
    }

    public final void a(r r1, Set set)
    {
        GetServiceRequest getservicerequest;
        Bundle bundle = l();
        getservicerequest = new GetServiceRequest(t);
        getservicerequest.d = a.getPackageName();
        getservicerequest.g = bundle;
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        getservicerequest.f = (Scope[])set.toArray(new Scope[set.size()]);
        if (!f()) goto _L2; else goto _L1
_L1:
        if (q == null) goto _L4; else goto _L3
_L3:
        set = q;
_L5:
        getservicerequest.h = set;
        if (r1 == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        getservicerequest.e = r1.asBinder();
_L7:
        j.a(new d(this, c.get()), getservicerequest);
        return;
_L4:
        try
        {
            set = new Account("<<default account>>", "com.google");
        }
        // Misplaced declaration of an exception variable
        catch (r r1)
        {
            Log.w("GmsClient", "service died");
            c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (r r1)
        {
            Log.w("GmsClient", "Remote exception occurred", r1);
            return;
        }
          goto _L5
_L2:
        if (!o()) goto _L7; else goto _L6
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
            printwriter.append(b()).append("@").println(Integer.toHexString(System.identityHashCode(iinterface.asBinder())));
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

    protected abstract String b();

    public void d()
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

    public final boolean e()
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

    public boolean f()
    {
        return false;
    }

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

    public final Context k()
    {
        return a;
    }

    protected Bundle l()
    {
        return new Bundle();
    }

    protected final void m()
    {
        if (!e())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public final IInterface n()
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
        m();
        IInterface iinterface;
        boolean flag;
        if (l != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag, "Client is connected but service is null");
        iinterface = l;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    public boolean o()
    {
        return false;
    }

}
