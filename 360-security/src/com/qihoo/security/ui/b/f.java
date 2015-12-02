// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.b;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

public class f extends d.a
{
    private class a
        implements android.os.IBinder.DeathRecipient
    {

        int a;
        IBinder b;
        final f c;

        public void binderDied()
        {
            b.unlinkToDeath(this, 0);
            synchronized (f.a(c))
            {
                f.a(c).remove(a);
            }
            return;
            exception;
            sparsearray;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private a()
        {
            c = f.this;
            super();
        }

    }


    private static f a;
    private final Context b;
    private final SparseArray c = new SparseArray();

    private f(Context context)
    {
        b = context.getApplicationContext();
    }

    static SparseArray a(f f1)
    {
        return f1.c;
    }

    public static f a(Context context)
    {
        com/qihoo/security/ui/b/f;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new f(context);
        }
        context = a;
        com/qihoo/security/ui/b/f;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public void a(IBinder ibinder, int i)
        throws RemoteException
    {
        SparseArray sparsearray = c;
        sparsearray;
        JVM INSTR monitorenter ;
        if ((a)c.get(i) == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        Log.w("UiBarrierManager", (new StringBuilder()).append(i).append(" already acquired").toString());
_L2:
        return;
        a a1 = new a();
        a1.a = i;
        a1.b = ibinder;
        ibinder.linkToDeath(a1, 0);
        c.put(i, a1);
        if (true) goto _L2; else goto _L1
_L1:
        ibinder;
        sparsearray;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public boolean a(int i)
        throws RemoteException
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        SparseArray sparsearray = c;
        sparsearray;
        JVM INSTR monitorenter ;
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        Exception exception;
        if (c.size() <= 0)
        {
            flag = false;
        }
        sparsearray;
        JVM INSTR monitorexit ;
        return flag;
        if (c.get(i) != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        sparsearray;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(IBinder ibinder, int i)
        throws RemoteException
    {
        ibinder = c;
        ibinder;
        JVM INSTR monitorenter ;
        a a1 = (a)c.get(i);
        if (a1 != null) goto _L2; else goto _L1
_L1:
        ibinder;
        JVM INSTR monitorexit ;
        return;
_L2:
        a1.b.unlinkToDeath(a1, 0);
        c.remove(i);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        ibinder;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
