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

// Referenced classes of package com.qihoo.security.app:
//            d

private static final class <init>
    implements ServiceConnection, android.os.der.DeathRecipient, InvocationHandler
{

    Class a;
    IInterface b;
    IInterface c;
    boolean d;
    Intent e;
    Context f;
    Method g;
    c h;

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

    private me()
    {
    }

    me(me me)
    {
        this();
    }
}
