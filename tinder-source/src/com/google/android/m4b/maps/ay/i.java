// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.aj.e;
import com.google.android.m4b.maps.y.j;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            ab, c

public abstract class i
{
    static final class a extends FutureTask
    {

        public final Object get()
        {
            com.google.android.m4b.maps.ay.c.e();
            return super.get();
        }

        public final Object get(long l, TimeUnit timeunit)
        {
            com.google.android.m4b.maps.ay.c.e();
            return super.get(l, timeunit);
        }

        public a(Callable callable)
        {
            super(callable);
        }
    }

    public abstract class b
        implements Callable
    {

        private i a;

        public abstract Object a(IInterface iinterface);

        public Object call()
        {
            IInterface iinterface;
            synchronized (i.a(a))
            {
                iinterface = i.b(a);
            }
            if (iinterface != null)
            {
                return a(iinterface);
            } else
            {
                throw new RemoteException("Service was closed in the middle of the execution.");
            }
            exception;
            serviceconnection;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public b()
        {
            a = i.this;
            super();
        }
    }


    private static final String a = com/google/android/m4b/maps/ay/i.getSimpleName();
    private final Context b;
    private final Executor c;
    private final Queue d = new LinkedList();
    private String e;
    private String f;
    private final ServiceConnection g = new ServiceConnection() {

        private i a;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            ServiceConnection serviceconnection = i.a(a);
            serviceconnection;
            JVM INSTR monitorenter ;
            if (ab.a(i.d(), 3))
            {
                String s2 = i.d();
                componentname = String.valueOf(componentname);
                Log.d(s2, (new StringBuilder(String.valueOf(componentname).length() + 22)).append("Connected to service: ").append(componentname).toString());
            }
            i.a(a, (IInterface)j.a(a.a(ibinder)));
            i.a(a, 3);
            for (; i.c(a).size() > 0; i.d(a).execute((Runnable)i.c(a).poll())) { }
            break MISSING_BLOCK_LABEL_146;
            componentname;
            serviceconnection;
            JVM INSTR monitorexit ;
            throw componentname;
            serviceconnection;
            JVM INSTR monitorexit ;
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            synchronized (i.a(a))
            {
                if (ab.a(i.d(), 3))
                {
                    String s2 = i.d();
                    componentname = String.valueOf(componentname);
                    Log.d(s2, (new StringBuilder(String.valueOf(componentname).length() + 27)).append("Disconnected from service: ").append(componentname).toString());
                }
                i.a(a, null);
                i.a(a, 2);
            }
            return;
            componentname;
            serviceconnection;
            JVM INSTR monitorexit ;
            throw componentname;
        }

            
            {
                a = i.this;
                super();
            }
    };
    private IInterface h;
    private int i;

    public i(Context context, String s, String s1, Executor executor)
    {
        i = 1;
        b = (Context)j.a(context, "processContext");
        e = (String)j.a(s, "servicePackageName");
        f = (String)j.a(s1, "serviceClassName");
        c = (Executor)j.a(executor, "executor");
    }

    static int a(i k, int l)
    {
        k.i = l;
        return l;
    }

    static ServiceConnection a(i k)
    {
        return k.g;
    }

    static IInterface a(i k, IInterface iinterface)
    {
        k.h = iinterface;
        return iinterface;
    }

    private boolean a()
    {
        Intent intent;
        boolean flag;
        flag = true;
        intent = (new Intent()).setClassName(e, f);
        ServiceConnection serviceconnection = g;
        serviceconnection;
        JVM INSTR monitorenter ;
        Exception exception;
        if (i != 1)
        {
            flag = false;
        }
        j.b(flag, "Binding has already been attempted");
        i = 2;
        flag = b.bindService(intent, g, 1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (ab.a(a, 6))
        {
            Log.e(a, String.format("Service \"%s\" in application \"%s\" cannot be found or bound to.", new Object[] {
                f, e
            }));
        }
        i = 4;
        serviceconnection;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        serviceconnection;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static IInterface b(i k)
    {
        return k.h;
    }

    static Queue c(i k)
    {
        return k.d;
    }

    static String d()
    {
        return a;
    }

    static Executor d(i k)
    {
        return k.c;
    }

    public abstract IInterface a(IBinder ibinder);

    public Future a(b b1)
    {
        b1 = new a((Callable)j.a(b1));
        ServiceConnection serviceconnection = g;
        serviceconnection;
        JVM INSTR monitorenter ;
        i;
        JVM INSTR tableswitch 1 4: default 221
    //                   1 175
    //                   2 206
    //                   3 97
    //                   4 111;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        int k = i;
        throw new IllegalStateException((new StringBuilder(26)).append("Unknown state: ").append(k).toString());
        b1;
        serviceconnection;
        JVM INSTR monitorexit ;
        throw b1;
_L4:
        c.execute(b1);
        serviceconnection;
        JVM INSTR monitorexit ;
        return b1;
_L5:
        if (!ab.a(a, 3)) goto _L7; else goto _L6
_L6:
        String s;
        s = a;
        b1 = String.valueOf(f);
        if (b1.length() == 0) goto _L9; else goto _L8
_L8:
        b1 = "Request ignored after failure to bind to the service ".concat(b1);
_L10:
        Log.d(s, b1);
_L7:
        b1 = com.google.android.m4b.maps.aj.e.a(null);
        serviceconnection;
        JVM INSTR monitorexit ;
        return b1;
_L9:
        b1 = new String("Request ignored after failure to bind to the service ");
          goto _L10
_L2:
        if (!a()) goto _L12; else goto _L11
_L11:
        d.add(b1);
        serviceconnection;
        JVM INSTR monitorexit ;
        return b1;
_L12:
        b1 = com.google.android.m4b.maps.aj.e.a(null);
        serviceconnection;
        JVM INSTR monitorexit ;
        return b1;
_L3:
        d.add(b1);
        serviceconnection;
        JVM INSTR monitorexit ;
        return b1;
    }

    public final void c()
    {
label0:
        {
            synchronized (g)
            {
                if (i == 3)
                {
                    break label0;
                }
                if (ab.a(a, 6))
                {
                    Log.e(a, "Attempt to unbind a service that is not bound.");
                }
            }
            return;
        }
        i = 1;
        b.unbindService(g);
        serviceconnection;
        JVM INSTR monitorexit ;
        return;
        exception;
        serviceconnection;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
