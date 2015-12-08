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

public abstract class bsc
    implements bqr, bsn
{

    private final bry a;
    private final bso b;
    private final Object c;
    private bta d;
    private bqz e;
    public final Context f;
    public final Looper g;
    final Handler h;
    protected AtomicInteger i;
    private IInterface j;
    private final ArrayList k;
    private bsh l;
    private int m;
    private final Set n;
    private final bqw o;
    private final bqx p;
    private final int q;

    public bsc(Context context, Looper looper, int i1, bry bry1, bqw bqw1, bqx bqx1)
    {
        this(context, looper, bso.a(context), bqi.a(), i1, bry1, (bqw)btl.a(bqw1), (bqx)btl.a(bqx1));
    }

    private bsc(Context context, Looper looper, bso bso1, bqi bqi1, int i1, bry bry1, bqw bqw1, 
            bqx bqx1)
    {
        c = new Object();
        k = new ArrayList();
        m = 1;
        i = new AtomicInteger(0);
        f = (Context)btl.a(context, "Context must not be null");
        g = (Looper)btl.a(looper, "Looper must not be null");
        b = (bso)btl.a(bso1, "Supervisor must not be null");
        btl.a(bqi1, "API availability must not be null");
        h = new bse(this, looper);
        q = i1;
        a = (bry)btl.a(bry1);
        n = a(bry1.b);
        o = bqw1;
        p = bqx1;
    }

    static bqz a(bsc bsc1)
    {
        return bsc1.e;
    }

    static bta a(bsc bsc1, bta bta1)
    {
        bsc1.d = bta1;
        return bta1;
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
        btl.b(flag2);
        obj = c;
        obj;
        JVM INSTR monitorenter ;
        m = i1;
        j = iinterface;
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
        if (l != null)
        {
            Log.e("GmsClient", (new StringBuilder("Calling connect() while still connected, missing disconnect() for ")).append(a()).toString());
            b.a(a(), l);
            i.incrementAndGet();
        }
        l = new bsh(this, i.get());
        if (!b.a(a(), l, a.e))
        {
            Log.e("GmsClient", (new StringBuilder("unable to connect to service: ")).append(a()).toString());
            h.sendMessage(h.obtainMessage(3, i.get(), 9));
        }
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L2:
        if (l == null) goto _L1; else goto _L4
_L4:
        b.a(a(), l);
        l = null;
          goto _L1
    }

    static void a(bsc bsc1, int i1)
    {
        bsc1.a(i1, ((IInterface) (null)));
    }

    private boolean a(int i1, int j1, IInterface iinterface)
    {
label0:
        {
            synchronized (c)
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

    static boolean a(bsc bsc1, int i1, int j1, IInterface iinterface)
    {
        return bsc1.a(i1, j1, iinterface);
    }

    static bqw b(bsc bsc1)
    {
        return bsc1.o;
    }

    static ArrayList c(bsc bsc1)
    {
        return bsc1.k;
    }

    static Set d(bsc bsc1)
    {
        return bsc1.n;
    }

    static bqx e(bsc bsc1)
    {
        return bsc1.p;
    }

    protected static void m()
    {
    }

    public abstract IInterface a(IBinder ibinder);

    public abstract String a();

    public final void a(int i1)
    {
        h.sendMessage(h.obtainMessage(4, i.get(), i1));
    }

    public void a(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        h.sendMessage(h.obtainMessage(1, j1, -1, new bsj(this, i1, ibinder, bundle)));
    }

    public final void a(bqz bqz1)
    {
        e = (bqz)btl.a(bqz1, "Connection progress callbacks cannot be null.");
        a(2, ((IInterface) (null)));
    }

    public final void a(bsu bsu1)
    {
        bsu1 = new ValidateAccountRequest(bsu1, (Scope[])n.toArray(new Scope[n.size()]), f.getPackageName());
        try
        {
            d.a(new bsg(this, i.get()), bsu1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bsu bsu1)
        {
            Log.w("GmsClient", "service died");
            a(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bsu bsu1)
        {
            Log.w("GmsClient", "Remote exception occurred", bsu1);
        }
    }

    public final void a(bsu bsu1, Set set)
    {
        GetServiceRequest getservicerequest;
        try
        {
            Bundle bundle = e();
            getservicerequest = new GetServiceRequest(q);
            getservicerequest.d = f.getPackageName();
            getservicerequest.g = bundle;
        }
        // Misplaced declaration of an exception variable
        catch (bsu bsu1)
        {
            Log.w("GmsClient", "service died");
            a(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bsu bsu1)
        {
            Log.w("GmsClient", "Remote exception occurred", bsu1);
            return;
        }
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        getservicerequest.f = (Scope[])set.toArray(new Scope[set.size()]);
        if (!l())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        getservicerequest.h = new Account("<<default account>>", "com.google");
        if (bsu1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        getservicerequest.e = bsu1.asBinder();
        d.a(new bsg(this, i.get()), getservicerequest);
        return;
    }

    public void a(ConnectionResult connectionresult)
    {
    }

    public final void a(String s, PrintWriter printwriter)
    {
        IInterface iinterface;
        int i1;
        synchronized (c)
        {
            i1 = m;
            iinterface = j;
        }
        printwriter.append(s).append("mConnectState=");
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
        s;
        obj;
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

    public abstract String b();

    public void c()
    {
        i.incrementAndGet();
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
        ((bsf)k.get(i1)).d();
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

    public Bundle e()
    {
        return new Bundle();
    }

    public final boolean k()
    {
        Object obj = c;
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

    public boolean l()
    {
        return false;
    }

    public Bundle l_()
    {
        return null;
    }

    public final void n()
    {
        int i1 = bqi.a(f);
        if (i1 != 0)
        {
            a(1, ((IInterface) (null)));
            e = new bsi(this);
            h.sendMessage(h.obtainMessage(3, i.get(), i1));
            return;
        } else
        {
            a(new bsi(this));
            return;
        }
    }

    public final boolean o()
    {
        Object obj = c;
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

    public final IInterface p()
    {
        Object obj = c;
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
        if (!k())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
        IInterface iinterface;
        boolean flag;
        if (j != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag, "Client is connected but service is null");
        iinterface = j;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

}
