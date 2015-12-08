// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

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
import com.google.android.m4b.maps.h.o;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.j:
//            n, x, g, aa, 
//            t, i, q

public abstract class l
    implements com.google.android.m4b.maps.h.b.a, m.a
{
    abstract class a extends c
    {

        private int a;
        private Bundle b;
        private l c;

        protected abstract void a(com.google.android.m4b.maps.g.a a1);

        protected final void a(Object obj)
        {
            Object obj1 = null;
            if ((Boolean)obj != null) goto _L2; else goto _L1
_L1:
            l.a(c, 1);
_L4:
            return;
_L2:
            switch (a)
            {
            default:
                l.a(c, 1);
                obj = obj1;
                if (b != null)
                {
                    obj = (PendingIntent)b.getParcelable("pendingIntent");
                }
                a(new com.google.android.m4b.maps.g.a(a, ((PendingIntent) (obj))));
                return;

            case 0: // '\0'
                if (!a())
                {
                    l.a(c, 1);
                    a(new com.google.android.m4b.maps.g.a(8, null));
                    return;
                }
                break;

            case 10: // '\n'
                l.a(c, 1);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected abstract boolean a();

        protected a(int i1, Bundle bundle)
        {
            c = l.this;
            super(Boolean.valueOf(true));
            a = i1;
            b = bundle;
        }
    }

    final class b extends Handler
    {

        private l a;

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
            if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.i())
            {
                a(message);
                return;
            }
            if (message.what == 3)
            {
                message = new com.google.android.m4b.maps.g.a(message.arg2, null);
                l.a(a).a(message);
                l.h();
                return;
            }
            if (message.what == 4)
            {
                l.a(a, 4);
                if (l.b(a) != null)
                {
                    l.b(a).a(message.arg2);
                }
                int i1 = message.arg2;
                l.g();
                l.a(a, 4, 1, null);
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
            a = l.this;
            super(looper);
        }
    }

    public abstract class c
    {

        private Object a;
        private boolean b;
        private l c;

        protected abstract void a(Object obj);

        public final void b()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = a;
            if (b)
            {
                String s1 = String.valueOf(this);
                Log.w("GmsClient", (new StringBuilder(String.valueOf(s1).length() + 47)).append("Callback proxy ").append(s1).append(" being reused. This is not safe.").toString());
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
            synchronized (l.c(c))
            {
                l.c(c).remove(this);
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
            c = l.this;
            super();
            a = obj;
            b = false;
        }
    }

    public static final class d extends s.a
    {

        private l a;
        private final int b;

        public final void a(int i1, Bundle bundle)
        {
            x.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
            l l1 = a;
            int j1 = b;
            l1.b.sendMessage(l1.b.obtainMessage(5, j1, -1, l1. new i(i1, bundle)));
            a = null;
        }

        public final void a(int i1, IBinder ibinder, Bundle bundle)
        {
            x.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
            l l1 = a;
            int j1 = b;
            l1.b.sendMessage(l1.b.obtainMessage(1, j1, -1, l1. new g(i1, ibinder, bundle)));
            a = null;
        }

        public d(l l1, int i1)
        {
            a = l1;
            b = i1;
        }
    }

    public final class e
        implements ServiceConnection
    {

        private final int a;
        private l b;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            x.a(ibinder, "Expecting a valid IBinder");
            l.a(b, t.a.a(ibinder));
            componentname = b;
            int i1 = a;
            ((l) (componentname)).b.sendMessage(((l) (componentname)).b.obtainMessage(6, i1, -1, componentname. new h()));
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            b.b.sendMessage(b.b.obtainMessage(4, a, 1));
        }

        public e(int i1)
        {
            b = l.this;
            super();
            a = i1;
        }
    }

    public final class f
        implements com.google.android.m4b.maps.h.d.c
    {

        private l a;

        public final void a(com.google.android.m4b.maps.g.a a1)
        {
            if (a1.b())
            {
                a.a(null, l.d(a));
            } else
            if (l.e(a) != null)
            {
                l.e(a).a(a1);
                return;
            }
        }

        public final void b(com.google.android.m4b.maps.g.a a1)
        {
            throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
        }

        public f()
        {
            a = l.this;
            super();
        }
    }

    public final class g extends a
    {

        private IBinder a;
        private l b;

        protected final void a(com.google.android.m4b.maps.g.a a1)
        {
            if (l.e(b) != null)
            {
                l.e(b).a(a1);
            }
            l.h();
        }

        protected final boolean a()
        {
            String s1;
            try
            {
                s1 = a.getInterfaceDescriptor();
            }
            catch (RemoteException remoteexception)
            {
                Log.w("GmsClient", "service probably died");
                return false;
            }
            if (!b.b().equals(s1))
            {
                String s2 = b.b();
                Log.e("GmsClient", (new StringBuilder(String.valueOf(s2).length() + 34 + String.valueOf(s1).length())).append("service descriptor mismatch: ").append(s2).append(" vs. ").append(s1).toString());
            } else
            {
                IInterface iinterface = b.a(a);
                if (iinterface != null && l.a(b, 2, 3, iinterface))
                {
                    if (l.b(b) != null)
                    {
                        l.b(b).a(null);
                    }
                    com.google.android.m4b.maps.g.g.b(l.f(b));
                    return true;
                }
            }
            return false;
        }

        public g(int i1, IBinder ibinder, Bundle bundle)
        {
            b = l.this;
            super(i1, bundle);
            a = ibinder;
        }
    }

    public final class h extends a
    {

        private l a;

        protected final void a(com.google.android.m4b.maps.g.a a1)
        {
            l.a(a).a(a1);
            l.h();
        }

        protected final boolean a()
        {
            l.a(a).a(com.google.android.m4b.maps.g.a.a);
            return true;
        }

        public h()
        {
            a = l.this;
            super(0, null);
        }
    }

    public final class i extends a
    {

        private l a;

        protected final void a(com.google.android.m4b.maps.g.a a1)
        {
            l.a(a).b(a1);
            l.h();
        }

        protected final boolean a()
        {
            l.a(a).b(com.google.android.m4b.maps.g.a.a);
            return true;
        }

        public i(int i1, Bundle bundle)
        {
            a = l.this;
            super(i1, bundle);
        }
    }


    private static String s[] = {
        "service_esmobile", "service_googleme"
    };
    public final Context a;
    final Handler b;
    protected AtomicInteger c;
    private final com.google.android.m4b.maps.j.g d;
    private final Looper e;
    private final n f;
    private final Object g;
    private t h;
    private com.google.android.m4b.maps.h.d.c i;
    private IInterface j;
    private final ArrayList k;
    private e l;
    private int m;
    private final Set n;
    private final Account o;
    private com.google.android.m4b.maps.h.d.b p;
    private com.google.android.m4b.maps.h.d.d q;
    private final int r;

    public l(Context context, Looper looper, int i1, com.google.android.m4b.maps.h.d.b b1, com.google.android.m4b.maps.h.d.d d1, com.google.android.m4b.maps.j.g g1)
    {
        this(context, looper, com.google.android.m4b.maps.j.n.a(context), i1, g1, b1, d1);
    }

    public l(Context context, Looper looper, com.google.android.m4b.maps.h.d.b b1, com.google.android.m4b.maps.h.d.d d1)
    {
        g = new Object();
        k = new ArrayList();
        m = 1;
        c = new AtomicInteger(0);
        a = (Context)x.a(context);
        e = (Looper)x.a(looper, "Looper must not be null");
        f = com.google.android.m4b.maps.j.n.a(context);
        b = new b(looper);
        r = 40;
        o = null;
        n = Collections.emptySet();
        d = (new com.google.android.m4b.maps.h.d.a(context)).a();
        p = (com.google.android.m4b.maps.h.d.b)x.a(b1);
        q = (com.google.android.m4b.maps.h.d.d)x.a(d1);
    }

    private l(Context context, Looper looper, n n1, int i1, com.google.android.m4b.maps.j.g g1)
    {
        g = new Object();
        k = new ArrayList();
        m = 1;
        c = new AtomicInteger(0);
        a = (Context)x.a(context, "Context must not be null");
        e = (Looper)x.a(looper, "Looper must not be null");
        f = (n)x.a(n1, "Supervisor must not be null");
        b = new b(looper);
        r = i1;
        d = (com.google.android.m4b.maps.j.g)x.a(g1);
        o = g1.a;
        n = a(g1.c);
    }

    private l(Context context, Looper looper, n n1, int i1, com.google.android.m4b.maps.j.g g1, com.google.android.m4b.maps.h.d.b b1, com.google.android.m4b.maps.h.d.d d1)
    {
        this(context, looper, n1, i1, g1);
        p = (com.google.android.m4b.maps.h.d.b)x.a(b1);
        q = (com.google.android.m4b.maps.h.d.d)x.a(d1);
    }

    static com.google.android.m4b.maps.h.d.c a(l l1)
    {
        return l1.i;
    }

    static t a(l l1, t t1)
    {
        l1.h = t1;
        return t1;
    }

    private static Set a(Set set)
    {
        if (set != null)
        {
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) 
            {
                if (!set.contains((o)iterator.next()))
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
        if (flag == flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new IllegalArgumentException();
        }
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        m = i1;
        j = iinterface;
        i1;
        JVM INSTR tableswitch 1 3: default 327
    //                   1 297
    //                   2 107
    //                   3 104;
           goto _L1 _L2 _L3 _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (l == null) goto _L5; else goto _L4
_L4:
        iinterface = String.valueOf(a());
        if (iinterface.length() == 0) goto _L7; else goto _L6
_L6:
        iinterface = "Calling connect() while still connected, missing disconnect() for ".concat(iinterface);
_L11:
        Log.e("GmsClient", iinterface);
        f.a(a(), l);
        c.incrementAndGet();
_L5:
        l = new e(c.get());
        if (f.a(a(), l, c())) goto _L1; else goto _L8
_L8:
        iinterface = String.valueOf(a());
        if (iinterface.length() == 0) goto _L10; else goto _L9
_L9:
        iinterface = "unable to connect to service: ".concat(iinterface);
_L12:
        Log.e("GmsClient", iinterface);
        b.sendMessage(b.obtainMessage(3, c.get(), 9));
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L7:
        iinterface = new String("Calling connect() while still connected, missing disconnect() for ");
          goto _L11
_L10:
        iinterface = new String("unable to connect to service: ");
          goto _L12
_L2:
        if (l == null) goto _L1; else goto _L13
_L13:
        f.a(a(), l);
        l = null;
          goto _L1
    }

    static void a(l l1, int i1)
    {
        l1.a(i1, ((IInterface) (null)));
    }

    private boolean a(int i1, int j1, IInterface iinterface)
    {
label0:
        {
            synchronized (g)
            {
                if (m == i1)
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

    static boolean a(l l1, int i1, int j1, IInterface iinterface)
    {
        return l1.a(i1, j1, iinterface);
    }

    static com.google.android.m4b.maps.h.d.b b(l l1)
    {
        return l1.p;
    }

    static ArrayList c(l l1)
    {
        return l1.k;
    }

    static Set d(l l1)
    {
        return l1.n;
    }

    static com.google.android.m4b.maps.h.d.d e(l l1)
    {
        return l1.q;
    }

    static Context f(l l1)
    {
        return l1.a;
    }

    protected static void g()
    {
    }

    protected static void h()
    {
    }

    private void n()
    {
        b.sendMessage(b.obtainMessage(4, c.get(), 1));
    }

    public abstract IInterface a(IBinder ibinder);

    public abstract String a();

    public final void a(com.google.android.m4b.maps.h.d.c c1)
    {
        i = (com.google.android.m4b.maps.h.d.c)x.a(c1, "Connection progress callbacks cannot be null.");
        a(2, ((IInterface) (null)));
    }

    public final void a(q q1)
    {
        q1 = new aa(q1, (o[])n.toArray(new o[n.size()]), a.getPackageName());
        try
        {
            h.a(new d(this, c.get()), q1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (q q1)
        {
            Log.w("GmsClient", "service died");
            n();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (q q1)
        {
            Log.w("GmsClient", "Remote exception occurred", q1);
        }
    }

    public final void a(q q1, Set set)
    {
        com.google.android.m4b.maps.j.i i1;
        Bundle bundle = j();
        i1 = new com.google.android.m4b.maps.j.i(r);
        i1.d = a.getPackageName();
        i1.g = bundle;
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        i1.f = (o[])set.toArray(new o[set.size()]);
        if (!f()) goto _L2; else goto _L1
_L1:
        if (o == null) goto _L4; else goto _L3
_L3:
        set = o;
_L5:
        i1.h = set;
        if (q1 == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        i1.e = q1.asBinder();
_L7:
        h.a(new d(this, c.get()), i1);
        return;
_L4:
        try
        {
            set = new Account("<<default account>>", "com.google");
        }
        // Misplaced declaration of an exception variable
        catch (q q1)
        {
            Log.w("GmsClient", "service died");
            n();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (q q1)
        {
            Log.w("GmsClient", "Remote exception occurred", q1);
            return;
        }
          goto _L5
_L2:
        if (!m()) goto _L7; else goto _L6
_L6:
        i1.h = o;
          goto _L7
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        IInterface iinterface;
        int i1;
        synchronized (g)
        {
            i1 = m;
            iinterface = j;
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

    public abstract String b();

    public String c()
    {
        return d.f;
    }

    public void d()
    {
        c.incrementAndGet();
        ArrayList arraylist = k;
        arraylist;
        JVM INSTR monitorenter ;
        int j1 = k.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((c)k.get(i1)).d();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        k.clear();
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
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (m == 3)
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

    public final boolean i()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (m == 2)
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

    public Bundle j()
    {
        return new Bundle();
    }

    public final void k()
    {
        if (!e())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public final IInterface l()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (m == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        k();
        IInterface iinterface;
        boolean flag;
        if (j != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x.a(flag, "Client is connected but service is null");
        iinterface = j;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    public boolean m()
    {
        return false;
    }

}
