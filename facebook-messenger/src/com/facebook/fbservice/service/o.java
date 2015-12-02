// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.annotations.AuthQueue;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.fbservice.service:
//            h, p

public class o
{

    private static final Class a = com/facebook/fbservice/service/o;
    private static final l b = new l();
    private final Context c;
    private final p d;
    private final Set e = kl.a();
    private boolean f;

    public o(Context context, p p1)
    {
        c = context;
        d = p1;
    }

    private boolean c(h h1)
    {
        return h1.a() == com/facebook/auth/annotations/AuthQueue;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        f = true;
        com.facebook.debug.log.b.c(a, "Draining all BlueService instances with started queues");
        obj = kl.a();
        Class class1;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((Set) (obj)).add(d.a(class1)))
        {
            class1 = ((h)iterator.next()).a();
        }

        break MISSING_BLOCK_LABEL_74;
        obj;
        throw obj;
        Object obj1;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); c.startService(((Intent) (obj1))))
        {
            obj1 = (Class)((Iterator) (obj)).next();
            com.facebook.debug.log.b.c(a, "Draining service %s", new Object[] {
                ((Class) (obj1)).getSimpleName()
            });
            obj1 = new Intent(c, ((Class) (obj1)));
            ((Intent) (obj1)).setAction("Orca.DRAIN");
        }

        this;
        JVM INSTR monitorexit ;
    }

    public void a(h h1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c(h1);
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e.add(h1);
        notifyAll();
        if (true) goto _L1; else goto _L3
_L3:
        h1;
        throw h1;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        f = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(h h1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c(h1);
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!e.remove(h1))
        {
            com.facebook.debug.log.b.a(b, a, "Unknown queue [%s]", new Object[] {
                h1.a()
            });
        }
        notifyAll();
        if (true) goto _L1; else goto _L3
_L3:
        h1;
        throw h1;
    }

    public boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        Preconditions.checkState(f);
_L1:
        if (e.isEmpty())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        com.facebook.debug.log.b.b(a, "Waiting for %d queues to stop", new Object[] {
            Integer.valueOf(e.size())
        });
        try
        {
            wait();
        }
        catch (InterruptedException interruptedexception) { }
          goto _L1
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
