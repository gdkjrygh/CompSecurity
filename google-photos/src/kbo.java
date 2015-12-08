// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.ValidateAccountRequest;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class kbo
    implements jyl, kbz
{

    public static final String j[] = {
        "service_esmobile", "service_googleme"
    };
    private final kax a;
    private final kca b;
    private final Object c;
    private kcm d;
    private jyr e;
    public final Context f;
    public final Looper g;
    final Handler h;
    public AtomicInteger i;
    private IInterface k;
    private final ArrayList l;
    private kbt m;
    private int n;
    private final Set o;
    private final Account p;
    private final jyq q;
    private final jys r;
    private final int s;

    public kbo(Context context, Looper looper, int i1, kax kax1, jyq jyq1, jys jys1)
    {
        this(context, looper, kca.a(context), jxz.a(), i1, kax1, (jyq)b.d(jyq1), (jys)b.d(jys1));
    }

    private kbo(Context context, Looper looper, kca kca1, jxz jxz1, int i1, kax kax1, jyq jyq1, 
            jys jys1)
    {
        c = new Object();
        l = new ArrayList();
        n = 1;
        i = new AtomicInteger(0);
        f = (Context)b.f(context, "Context must not be null");
        g = (Looper)b.f(looper, "Looper must not be null");
        b = (kca)b.f(kca1, "Supervisor must not be null");
        b.f(jxz1, "API availability must not be null");
        h = new kbq(this, looper);
        s = i1;
        a = (kax)b.d(kax1);
        p = kax1.a;
        o = a(kax1.c);
        q = jyq1;
        r = jys1;
    }

    private Set a(Set set)
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

    static jyr a(kbo kbo1)
    {
        return kbo1.e;
    }

    static kcm a(kbo kbo1, kcm kcm1)
    {
        kbo1.d = kcm1;
        return kcm1;
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
        b.b(flag2);
        obj = c;
        obj;
        JVM INSTR monitorenter ;
        n = i1;
        k = iinterface;
        i1;
        JVM INSTR tableswitch 1 3: default 271
    //                   1 237
    //                   2 79
    //                   3 76;
           goto _L1 _L2 _L3 _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (m != null)
        {
            Log.e("GmsClient", (new StringBuilder("Calling connect() while still connected, missing disconnect() for ")).append(c()).toString());
            b.b(c(), m, f());
            i.incrementAndGet();
        }
        m = new kbt(this, i.get());
        if (!b.a(c(), m, f()))
        {
            Log.e("GmsClient", (new StringBuilder("unable to connect to service: ")).append(c()).toString());
            h.sendMessage(h.obtainMessage(3, i.get(), 9));
        }
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L2:
        if (m == null) goto _L1; else goto _L4
_L4:
        b.b(c(), m, f());
        m = null;
          goto _L1
    }

    static void a(kbo kbo1, int i1, IInterface iinterface)
    {
        kbo1.a(i1, ((IInterface) (null)));
    }

    private boolean a(int i1, int j1, IInterface iinterface)
    {
label0:
        {
            synchronized (c)
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

    static boolean a(kbo kbo1, int i1, int j1, IInterface iinterface)
    {
        return kbo1.a(i1, j1, iinterface);
    }

    static jyq b(kbo kbo1)
    {
        return kbo1.q;
    }

    static ArrayList c(kbo kbo1)
    {
        return kbo1.l;
    }

    static Set d(kbo kbo1)
    {
        return kbo1.o;
    }

    static jys e(kbo kbo1)
    {
        return kbo1.r;
    }

    private String f()
    {
        return a.f;
    }

    protected static void l()
    {
    }

    public abstract IInterface a(IBinder ibinder);

    public void a()
    {
        i.incrementAndGet();
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
        ((kbr)l.get(i1)).d();
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

    public final void a(int i1)
    {
        h.sendMessage(h.obtainMessage(4, i.get(), i1));
    }

    public void a(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        h.sendMessage(h.obtainMessage(1, j1, -1, new kbv(this, i1, ibinder, bundle)));
    }

    public void a(ConnectionResult connectionresult)
    {
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        IInterface iinterface;
        int i1;
        synchronized (c)
        {
            i1 = n;
            iinterface = k;
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
            printwriter.append(d()).append("@").println(Integer.toHexString(System.identityHashCode(iinterface.asBinder())));
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

    public final void a(jyr jyr1)
    {
        e = (jyr)b.f(jyr1, "Connection progress callbacks cannot be null.");
        a(2, ((IInterface) (null)));
    }

    public final void a(kay kay1)
    {
        kay1 = new ValidateAccountRequest(kay1, (Scope[])o.toArray(new Scope[o.size()]), f.getPackageName(), null);
        try
        {
            d.a(new kbs(this, i.get()), kay1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kay kay1)
        {
            Log.w("GmsClient", "service died");
            a(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kay kay1)
        {
            Log.w("GmsClient", "Remote exception occurred", kay1);
        }
    }

    public final void a(kay kay1, Set set)
    {
        GetServiceRequest getservicerequest;
        Bundle bundle = e();
        getservicerequest = new GetServiceRequest(s);
        getservicerequest.d = f.getPackageName();
        getservicerequest.g = bundle;
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        getservicerequest.f = (Scope[])set.toArray(new Scope[set.size()]);
        if (!k()) goto _L2; else goto _L1
_L1:
        if (p == null) goto _L4; else goto _L3
_L3:
        set = p;
_L5:
        getservicerequest.h = set;
        if (kay1 == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        getservicerequest.e = kay1.asBinder();
_L7:
        d.a(new kbs(this, i.get()), getservicerequest);
        return;
_L4:
        try
        {
            set = new Account("<<default account>>", "com.google");
        }
        // Misplaced declaration of an exception variable
        catch (kay kay1)
        {
            Log.w("GmsClient", "service died");
            a(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kay kay1)
        {
            Log.w("GmsClient", "Remote exception occurred", kay1);
            return;
        }
          goto _L5
_L2:
        if (!p()) goto _L7; else goto _L6
_L6:
        getservicerequest.h = p;
          goto _L7
    }

    public Bundle b()
    {
        return null;
    }

    public abstract String c();

    public abstract String d();

    public Bundle e()
    {
        return new Bundle();
    }

    public final boolean j()
    {
        Object obj = c;
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

    public boolean k()
    {
        return false;
    }

    public final boolean m()
    {
        Object obj = c;
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

    public final void n()
    {
        if (!j())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public final IInterface o()
    {
        Object obj = c;
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
        n();
        IInterface iinterface;
        boolean flag;
        if (k != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Client is connected but service is null");
        iinterface = k;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    public boolean p()
    {
        return false;
    }

}
