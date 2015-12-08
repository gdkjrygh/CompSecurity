// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.df.af;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public class o
{

    private static final String c = com/google/android/m4b/maps/cg/o.getSimpleName();
    af a;
    af b;
    private final Executor d;
    private boolean e;

    public o(Executor executor)
    {
        d = executor;
        e = false;
        a = null;
        b = null;
    }

    static boolean a(o o1)
    {
        return o1.e;
    }

    static af b(o o1)
    {
        return o1.b;
    }

    static String b()
    {
        return c;
    }

    static af c(o o1)
    {
        return o1.a;
    }

    static af d(o o1)
    {
        o1.b = null;
        return null;
    }

    static af e(o o1)
    {
        o1.a = null;
        return null;
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (e && (b != null || a != null))
        {
            break MISSING_BLOCK_LABEL_26;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        d.execute(new Runnable() {

            private o a;

            public final void run()
            {
label0:
                {
                    synchronized (a)
                    {
                        if (o.a(a) && (o.b(a) != null || o.c(a) != null))
                        {
                            break label0;
                        }
                    }
                    return;
                }
                java.util.ArrayList arraylist;
                arraylist = f.b(2);
                if (o.b(a) != null)
                {
                    arraylist.add(o.b(a));
                    o.d(a);
                }
                if (o.c(a) != null)
                {
                    arraylist.add(o.c(a));
                    o.e(a);
                }
                obj;
                JVM INSTR monitorexit ;
                if (ab.a(o.b(), 2))
                {
                    Log.v(o.b(), "onMapLoaded");
                }
                for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext();)
                {
                    af af1 = (af)((Iterator) (obj)).next();
                    try
                    {
                        af1.a();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw new RuntimeRemoteException(((RemoteException) (obj)));
                    }
                }

                break MISSING_BLOCK_LABEL_180;
                exception1;
                obj;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                a = o.this;
                super();
            }
        });
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        e = flag;
        this;
        JVM INSTR monitorexit ;
        a();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
