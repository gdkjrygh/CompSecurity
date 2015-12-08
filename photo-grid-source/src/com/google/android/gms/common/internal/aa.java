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
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            al, am, bl, ac, 
//            w, af, ad, ValidateAccountRequest, 
//            ae, az, GetServiceRequest, as, 
//            ag

public abstract class aa
    implements c, al
{

    public static final String zzafI[] = {
        "service_esmobile", "service_googleme"
    };
    private final Context a;
    final Handler b;
    protected AtomicInteger c;
    private final w d;
    private final Looper e;
    private final am f;
    private final b g;
    private final Object h;
    private az i;
    private o j;
    private IInterface k;
    private final ArrayList l;
    private af m;
    private int n;
    private final Set o;
    private final Account p;
    private final k q;
    private final l r;
    private final int s;

    protected aa(Context context, Looper looper, int i1, w w1, k k1, l l1)
    {
        this(context, looper, am.a(context), com.google.android.gms.common.b.a(), i1, w1, (k)bl.a(k1), (l)bl.a(l1));
    }

    private aa(Context context, Looper looper, am am1, b b1, int i1, w w1, k k1, 
            l l1)
    {
        h = new Object();
        l = new ArrayList();
        n = 1;
        c = new AtomicInteger(0);
        a = (Context)bl.a(context, "Context must not be null");
        e = (Looper)bl.a(looper, "Looper must not be null");
        f = (am)bl.a(am1, "Supervisor must not be null");
        g = (b)bl.a(b1, "API availability must not be null");
        b = new ac(this, looper);
        s = i1;
        d = (w)bl.a(w1);
        p = w1.a();
        o = a(w1.d());
        q = k1;
        r = l1;
    }

    static o a(aa aa1)
    {
        return aa1.j;
    }

    static az a(aa aa1, az az1)
    {
        aa1.i = az1;
        return az1;
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
        com.google.android.gms.common.internal.bl.b(flag2);
        obj = h;
        obj;
        JVM INSTR monitorenter ;
        n = i1;
        k = iinterface;
        i1;
        JVM INSTR tableswitch 1 3: default 266
    //                   1 236
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
            Log.e("GmsClient", (new StringBuilder("Calling connect() while still connected, missing disconnect() for ")).append(a()).toString());
            f.a(a(), m);
            c.incrementAndGet();
        }
        m = new af(this, c.get());
        if (!f.a(a(), m, d.g()))
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
        if (m == null) goto _L1; else goto _L4
_L4:
        f.a(a(), m);
        m = null;
          goto _L1
    }

    static void a(aa aa1, int i1)
    {
        aa1.a(i1, ((IInterface) (null)));
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

    static boolean a(aa aa1, int i1, int j1, IInterface iinterface)
    {
        return aa1.a(i1, j1, iinterface);
    }

    static k b(aa aa1)
    {
        return aa1.q;
    }

    static ArrayList c(aa aa1)
    {
        return aa1.l;
    }

    protected static void c()
    {
    }

    static Set d(aa aa1)
    {
        return aa1.o;
    }

    static l e(aa aa1)
    {
        return aa1.r;
    }

    protected static void g_()
    {
    }

    protected abstract IInterface a(IBinder ibinder);

    protected abstract String a();

    protected abstract String b();

    public void disconnect()
    {
        c.incrementAndGet();
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
        ((ad)l.get(i1)).d();
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

    public void dump(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as1[])
    {
        int i1;
        synchronized (h)
        {
            i1 = n;
            as1 = k;
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
        if (as1 == null)
        {
            printwriter.println("null");
            return;
        } else
        {
            printwriter.append(b()).append("@").println(Integer.toHexString(System.identityHashCode(as1.asBinder())));
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

    protected Bundle e()
    {
        return new Bundle();
    }

    public final Context getContext()
    {
        return a;
    }

    public final Looper getLooper()
    {
        return e;
    }

    public boolean isConnected()
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

    public boolean isConnecting()
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

    public void zza(o o1)
    {
        j = (o)bl.a(o1, "Connection progress callbacks cannot be null.");
        a(2, ((IInterface) (null)));
    }

    public void zza(as as1)
    {
        as1 = new ValidateAccountRequest(as1, (Scope[])o.toArray(new Scope[o.size()]), a.getPackageName());
        try
        {
            i.a(new ae(this, c.get()), as1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (as as1)
        {
            Log.w("GmsClient", "service died");
            zzbE(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (as as1)
        {
            Log.w("GmsClient", "Remote exception occurred", as1);
        }
    }

    public void zza(as as1, Set set)
    {
        GetServiceRequest getservicerequest;
        try
        {
            Bundle bundle = e();
            getservicerequest = new GetServiceRequest(s);
            getservicerequest.d = a.getPackageName();
            getservicerequest.g = bundle;
        }
        // Misplaced declaration of an exception variable
        catch (as as1)
        {
            Log.w("GmsClient", "service died");
            zzbE(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (as as1)
        {
            Log.w("GmsClient", "Remote exception occurred", as1);
            return;
        }
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        getservicerequest.f = (Scope[])set.toArray(new Scope[set.size()]);
        if (!zzlN()) goto _L2; else goto _L1
_L1:
        getservicerequest.h = zzoI();
        if (as1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        getservicerequest.e = as1.asBinder();
_L4:
        i.a(new ae(this, c.get()), getservicerequest);
        return;
_L2:
        if (zzpe())
        {
            getservicerequest.h = p;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void zzbE(int i1)
    {
        b.sendMessage(b.obtainMessage(4, c.get(), i1));
    }

    public boolean zzlN()
    {
        return false;
    }

    public Bundle zzmS()
    {
        return null;
    }

    public IBinder zznz()
    {
        if (i == null)
        {
            return null;
        } else
        {
            return i.asBinder();
        }
    }

    public final Account zzoI()
    {
        if (p != null)
        {
            return p;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    public void zzoZ()
    {
        int i1 = com.google.android.gms.common.b.a(a);
        if (i1 != 0)
        {
            a(1, ((IInterface) (null)));
            j = new ag(this);
            b.sendMessage(b.obtainMessage(3, c.get(), i1));
            return;
        } else
        {
            zza(new ag(this));
            return;
        }
    }

    public final IInterface zzpc()
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
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
        IInterface iinterface;
        boolean flag;
        if (k != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag, "Client is connected but service is null");
        iinterface = k;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    public boolean zzpe()
    {
        return false;
    }

}
