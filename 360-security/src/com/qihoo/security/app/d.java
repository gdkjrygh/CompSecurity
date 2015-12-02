// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public final class d
{
    public static interface a
    {

        public abstract IInterface a(IBinder ibinder);
    }

    private static final class b
        implements ServiceConnection, android.os.IBinder.DeathRecipient, InvocationHandler
    {

        Class a;
        IInterface b;
        IInterface c;
        boolean d;
        Intent e;
        Context f;
        Method g;
        a h;

        public void binderDied()
        {
            this;
            JVM INSTR monitorenter ;
            Exception exception;
            try
            {
                c.asBinder().unlinkToDeath(this, 0);
                c = null;
                if (d)
                {
                    f.unbindService(this);
                    f.bindService(e, this, 1);
                }
            }
            catch (Exception exception1) { }
            this;
            JVM INSTR monitorexit ;
            return;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Object invoke(Object obj, Method method, Object aobj[])
            throws Throwable
        {
            this;
            JVM INSTR monitorenter ;
            if (c == null)
            {
                break MISSING_BLOCK_LABEL_23;
            }
            obj = method.invoke(c, aobj);
            this;
            JVM INSTR monitorexit ;
            return obj;
            throw new RemoteException();
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            int i = 0;
            this;
            JVM INSTR monitorenter ;
            if (h == null) goto _L2; else goto _L1
_L1:
            c = h.a(ibinder);
            ibinder.linkToDeath(this, 0);
_L6:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            componentname = a.getDeclaredClasses();
            if (g != null) goto _L4; else goto _L3
_L3:
            int j = componentname.length;
_L7:
            if (i >= j) goto _L4; else goto _L5
_L5:
            Class class1 = componentname[i];
            if (!class1.getSimpleName().equals("Stub"))
            {
                break MISSING_BLOCK_LABEL_161;
            }
            g = class1.getDeclaredMethod("asInterface", new Class[] {
                android/os/IBinder
            });
            g.setAccessible(true);
_L4:
            if (g != null)
            {
                c = (IInterface)g.invoke(null, new Object[] {
                    ibinder
                });
                ibinder.linkToDeath(this, 0);
            }
              goto _L6
            componentname;
            binderDied();
              goto _L6
            componentname;
            this;
            JVM INSTR monitorexit ;
            throw componentname;
            i++;
              goto _L7
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
        }

        public String toString()
        {
            String s2 = a.getCanonicalName();
            String s;
            String s1;
            if (d)
            {
                s = "true";
            } else
            {
                s = "false";
            }
            if (c != null)
            {
                s1 = "true";
            } else
            {
                s1 = "false";
            }
            return String.format("%s[proactive=%s,connected=%s]", new Object[] {
                s2, s, s1
            });
        }

        private b()
        {
        }

    }


    private static d a;
    private final Map b = new HashMap();
    private final Context c;

    private d(Context context)
    {
        c = context.getApplicationContext();
    }

    public static d a(Context context)
    {
        com/qihoo/security/app/d;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new d(context.getApplicationContext());
        }
        com/qihoo/security/app/d;
        JVM INSTR monitorexit ;
        return a;
        context;
        com/qihoo/security/app/d;
        JVM INSTR monitorexit ;
        throw context;
    }

    public IInterface a(Class class1, Intent intent, boolean flag, a a1)
    {
        b b1 = new b();
        b1.d = flag;
        b1.e = new Intent(intent);
        b1.f = c;
        b1.a = class1;
        b1.h = a1;
        intent = (IInterface)Proxy.newProxyInstance(com/qihoo/security/app/d.getClassLoader(), new Class[] {
            class1
        }, b1);
        b1.b = intent;
        try
        {
            c.bindService(b1.e, b1, 1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1) { }
        synchronized (b)
        {
            b.put(class1, b1);
        }
        return intent;
        class1;
        a1;
        JVM INSTR monitorexit ;
        throw class1;
    }
}
