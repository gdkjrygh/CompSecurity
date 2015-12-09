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
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.e;
import com.google.android.gms.internal.iu;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            u, ap, v, t, 
//            m, h, p, q, 
//            zzae, o, ah, n, 
//            zzi, ab

public abstract class k
    implements h, u
{

    public static final String c[] = {
        "service_esmobile", "service_googleme"
    };
    final Handler a;
    boolean b;
    private final Context d;
    private final com.google.android.gms.common.internal.h e;
    private final Looper f;
    private final v g;
    private final Object h;
    private ah i;
    private boolean j;
    private r k;
    private IInterface l;
    private final ArrayList m;
    private p n;
    private int o;
    private final List p;
    private final Account q;
    private final t r;
    private final int s;

    protected k(Context context, Looper looper, int i1, n n1, o o1)
    {
        h = new Object();
        j = false;
        m = new ArrayList();
        o = 1;
        b = false;
        d = (Context)ap.a(context);
        f = (Looper)ap.a(looper, "Looper must not be null");
        g = v.a(context);
        r = new t(looper, this);
        a = new com.google.android.gms.common.internal.m(this, looper);
        s = i1;
        q = null;
        p = null;
        e = (new m(context)).b();
        a((n)ap.a(n1));
        a((o)ap.a(o1));
    }

    protected k(Context context, Looper looper, int i1, n n1, o o1, com.google.android.gms.common.internal.h h1)
    {
        this(context, looper, v.a(context), i1, h1, n1, o1);
    }

    private k(Context context, Looper looper, v v1, int i1, com.google.android.gms.common.internal.h h1)
    {
        h = new Object();
        j = false;
        m = new ArrayList();
        o = 1;
        b = false;
        d = (Context)ap.a(context, "Context must not be null");
        f = (Looper)ap.a(looper, "Looper must not be null");
        g = (v)ap.a(v1, "Supervisor must not be null");
        r = new t(looper, this);
        a = new com.google.android.gms.common.internal.m(this, looper);
        s = i1;
        e = (com.google.android.gms.common.internal.h)ap.a(h1);
        q = h1.b();
        p = a(h1.d());
    }

    private k(Context context, Looper looper, v v1, int i1, com.google.android.gms.common.internal.h h1, n n1, o o1)
    {
        this(context, looper, v1, i1, h1);
        a((n)ap.a(n1));
        a((o)ap.a(o1));
    }

    static ah a(k k1, ah ah1)
    {
        k1.i = ah1;
        return ah1;
    }

    static t a(k k1)
    {
        return k1.r;
    }

    private static List a(List list)
    {
        if (list == null);
        return list;
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
        synchronized (h)
        {
            o = i1;
            l = iinterface;
        }
        return;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    private void a(n n1)
    {
        r.a(n1);
    }

    private void a(o o1)
    {
        r.a(o1);
    }

    static void a(k k1, int i1)
    {
        k1.a(i1, ((IInterface) (null)));
    }

    private boolean a(int i1, int j1, IInterface iinterface)
    {
label0:
        {
            synchronized (h)
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

    static boolean a(k k1, int i1, int j1, IInterface iinterface)
    {
        return k1.a(i1, j1, iinterface);
    }

    static ArrayList b(k k1)
    {
        return k1.m;
    }

    static boolean c(k k1)
    {
        return k1.j;
    }

    static r d(k k1)
    {
        return k1.k;
    }

    static Context e(k k1)
    {
        return k1.d;
    }

    static p f(k k1)
    {
        return k1.n;
    }

    static v g(k k1)
    {
        return k1.g;
    }

    static p h(k k1)
    {
        k1.n = null;
        return null;
    }

    private void m()
    {
        a.sendMessage(a.obtainMessage(4, Integer.valueOf(1)));
    }

    protected abstract IInterface a(IBinder ibinder);

    public final void a()
    {
        b = true;
        a(2, ((IInterface) (null)));
        int i1 = com.google.android.gms.common.e.a(d);
        if (i1 != 0)
        {
            a(1, ((IInterface) (null)));
            a.sendMessage(a.obtainMessage(3, Integer.valueOf(i1)));
        } else
        {
            if (n != null)
            {
                Log.e("GmsClient", (new StringBuilder("Calling connect() while still connected, missing disconnect() for ")).append(e()).toString());
                g.a(e(), n);
            }
            n = new p(this);
            if (!g.a(e(), n, e.f()))
            {
                Log.e("GmsClient", (new StringBuilder("unable to connect to service: ")).append(e()).toString());
                a.sendMessage(a.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle)
    {
        a.sendMessage(a.obtainMessage(1, new q(this, i1, ibinder, bundle)));
    }

    public final void a(r r1)
    {
        k = (r)ap.a(r1, "Must provide a non-null ConnectionStatusReportCallbacks");
        j = true;
    }

    public final void a(ab ab)
    {
        com.google.android.gms.common.api.Scope ascope[];
        if (p == null)
        {
            ascope = null;
        } else
        {
            ascope = iu.a(p);
        }
        ab = new zzae(ab, ascope, d.getPackageName());
        try
        {
            i.a(new com.google.android.gms.common.internal.o(this), ab);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ab ab)
        {
            Log.w("GmsClient", "service died");
            m();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ab ab)
        {
            Log.w("GmsClient", "Remote exception occurred", ab);
        }
    }

    public final void a(com.google.android.gms.common.internal.n n1)
    {
        synchronized (m)
        {
            m.add(n1);
        }
        a.sendMessage(a.obtainMessage(2, n1));
        return;
        n1;
        arraylist;
        JVM INSTR monitorexit ;
        throw n1;
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        IInterface iinterface;
        int i1;
        printwriter.append(s1).println("GmsClient:");
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        printwriter.append(s2).append("mStartServiceAction=").println(e());
        synchronized (h)
        {
            i1 = o;
            iinterface = l;
        }
        printwriter.append(s2).append("mConnectState=");
        i1;
        JVM INSTR tableswitch 1 4: default 116
    //                   1 179
    //                   2 149
    //                   3 159
    //                   4 169;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_179;
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
        printwriter;
        s1;
        JVM INSTR monitorexit ;
        throw printwriter;
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

    public void b()
    {
        b = false;
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
        ((com.google.android.gms.common.internal.n)m.get(i1)).d();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        m.clear();
        arraylist;
        JVM INSTR monitorexit ;
        a(1, ((IInterface) (null)));
        if (n != null)
        {
            g.a(e(), n);
            n = null;
        }
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean c()
    {
        Object obj = h;
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

    public final void d()
    {
        try
        {
            Bundle bundle = j();
            zzi zzi1 = new zzi(s);
            zzi1.d = d.getPackageName();
            zzi1.g = bundle;
            if (p != null)
            {
                zzi1.f = iu.a(p);
            }
            i.a(new com.google.android.gms.common.internal.o(this), zzi1);
            return;
        }
        catch (DeadObjectException deadobjectexception)
        {
            Log.w("GmsClient", "service died");
            m();
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("GmsClient", "Remote exception occurred", remoteexception);
        }
    }

    protected abstract String e();

    protected abstract String f();

    public final boolean f_()
    {
        return b;
    }

    protected final String g()
    {
        return e.f();
    }

    public final boolean h()
    {
        Object obj = h;
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

    public final Context i()
    {
        return d;
    }

    protected Bundle j()
    {
        return new Bundle();
    }

    protected final void k()
    {
        if (!c())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public final IInterface l()
    {
        Object obj = h;
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
        k();
        IInterface iinterface;
        boolean flag;
        if (l != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.a(flag, "Client is connected but service is null");
        iinterface = l;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

}
