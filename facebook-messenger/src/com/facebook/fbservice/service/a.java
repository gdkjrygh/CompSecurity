// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.analytics.av;
import com.facebook.auth.viewercontext.e;
import com.facebook.base.a.g;
import com.facebook.base.d.b;
import com.facebook.common.e.h;
import com.facebook.common.process.d;
import com.facebook.common.time.c;
import com.facebook.common.w.m;
import com.facebook.inject.t;
import com.google.common.a.fi;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.facebook.fbservice.service:
//            h, c, o, p, 
//            LocalQueueSet, e, n, ac, 
//            b, OperationType, z

public class a extends b
{

    private static final Class a = com/facebook/fbservice/service/a;
    private com.facebook.fbservice.service.b b;
    private o c;
    private p d;
    private e e;
    private h f;
    private com.facebook.prefs.shared.d g;
    private av h;
    private d i;
    private final Map j = ik.a();
    private final AtomicLong k = new AtomicLong(System.currentTimeMillis());

    public a()
    {
    }

    private RemoteException a(String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            return new RemoteException(s);
        } else
        {
            return new RemoteException();
        }
    }

    private com.facebook.fbservice.service.h a(Class class1, javax.inject.a a1, javax.inject.a a2)
    {
        return new com.facebook.fbservice.service.h(class1, a1, a2, new com.facebook.fbservice.service.c((new StringBuilder()).append("BlueServiceQueue - ").append(class1).toString()), c, e, f, g, h, com.facebook.common.time.c.b());
    }

    private String a(OperationType operationtype, Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        if (c.c())
        {
            throw new RemoteException();
        }
        break MISSING_BLOCK_LABEL_25;
        operationtype;
        this;
        JVM INSTR monitorexit ;
        throw operationtype;
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        bundle.setClassLoader(getClassLoader());
        com.facebook.base.a.g.a(this);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        Object obj1;
        if (d.b(operationtype) != com/facebook/fbservice/service/LocalQueueSet)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        String s = bundle.getString("calling_process_name");
        obj1 = i.b();
        if (!Objects.equal(((com.facebook.common.process.c) (obj1)).b(), s))
        {
            s = m.a("startOperation(%s, %s) called in process %s; expected process %s", new Object[] {
                operationtype, bundle, i.b(), s
            });
            com.facebook.debug.log.b.b(a, s);
            throw a(s);
        }
        break MISSING_BLOCK_LABEL_243;
        Object obj;
        obj;
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Error occurred in startOperation(").append(operationtype).append(", ").append(bundle).append(")").toString(), ((Throwable) (obj)));
        operationtype = (new StringBuilder()).append("Error occurred in startOperation(").append(operationtype).append(", ").append(bundle).append("), exception: ").append(com.facebook.common.w.c.a(((Throwable) (obj)))).toString();
        f.a("BlueService", operationtype);
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            throw a(((String) (operationtype)));
        }
        break MISSING_BLOCK_LABEL_543;
        obj = d.a(((com.facebook.common.process.c) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        if (obj != getClass())
        {
            throw a(m.a("startOperation(%s, %s) called in service %s; expected service %s", new Object[] {
                operationtype, bundle, getClass(), obj
            }));
        }
        Class class1 = d.a(operationtype);
        if (class1 != null)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        obj = m.a("startOperation(%s, %s) called but no queue registered for type %s", new Object[] {
            operationtype, bundle, operationtype
        });
        com.facebook.debug.log.b.b(a, ((String) (obj)));
        throw a(((String) (obj)));
        obj = d.a(class1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        if (getClass() != obj)
        {
            obj = m.a("startOperation(%s, %s) called in service %s; expected service %s", new Object[] {
                operationtype, bundle, getClass(), obj
            });
            com.facebook.debug.log.b.b(a, ((String) (obj)));
            throw a(((String) (obj)));
        }
        obj1 = (com.facebook.fbservice.service.h)j.get(class1);
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = t.a(this);
        obj1 = ((t) (obj)).b(com/facebook/fbservice/service/e, class1);
        if (!((t) (obj)).d(com.google.inject.a.a(com/facebook/fbservice/service/n, class1)))
        {
            break MISSING_BLOCK_LABEL_533;
        }
        obj = ((t) (obj)).d(com/facebook/fbservice/service/n, class1);
_L3:
        obj = a(class1, ((javax.inject.a) (obj1)), ((javax.inject.a) (obj)));
        ((com.facebook.fbservice.service.h) (obj)).b();
        j.put(class1, obj);
_L2:
        obj1 = Long.toString(k.getAndIncrement());
        ((com.facebook.fbservice.service.h) (obj)).a(new ac(((String) (obj1)), operationtype, bundle));
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj1));
        obj = com.google.inject.b.a.a(fi.d());
          goto _L3
        throw obj;
    }

    static String a(a a1, OperationType operationtype, Bundle bundle)
    {
        return a1.a(operationtype, bundle);
    }

    static boolean a(a a1, String s, z z)
    {
        return a1.a(s, z);
    }

    private boolean a(String s, z z)
    {
        this;
        JVM INSTR monitorenter ;
        com.facebook.fbservice.service.h h1;
        Iterator iterator = j.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_71;
            }
            h1 = (com.facebook.fbservice.service.h)iterator.next();
        } while (!h1.a(s));
_L1:
        this;
        JVM INSTR monitorexit ;
        return h1 != null && h1.a(s, z);
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        h1 = null;
          goto _L1
    }

    public IBinder onBind(Intent intent)
    {
        return b;
    }

    public void onCreate()
    {
        super.onCreate();
        com.facebook.debug.log.b.c(a, "onCreate");
        t t1 = a();
        b = new com.facebook.fbservice.service.b(this);
        c = (o)t1.a(com/facebook/fbservice/service/o);
        d = (p)t1.a(com/facebook/fbservice/service/p);
        e = (e)t1.a(com/facebook/auth/viewercontext/e);
        f = (h)t1.a(com/facebook/common/e/h);
        g = (com.facebook.prefs.shared.d)t1.a(com/facebook/prefs/shared/d);
        h = (av)t1.a(com/facebook/analytics/av);
        i = (d)t1.a(com/facebook/common/process/d);
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.facebook.debug.log.b.c(a, "onDestroy");
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = j.values().iterator(); iterator.hasNext(); ((com.facebook.fbservice.service.h)iterator.next()).c()) { }
        break MISSING_BLOCK_LABEL_59;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        j.clear();
        this;
        JVM INSTR monitorexit ;
    }

    public void onRebind(Intent intent)
    {
        super.onRebind(intent);
    }

    public int onStartCommand(Intent intent, int l, int i1)
    {
        if (intent == null)
        {
            return 2;
        }
        this;
        JVM INSTR monitorenter ;
        intent = intent.getAction();
        if (!"Orca.START".equals(intent)) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return 2;
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
_L2:
        if (!"Orca.STOP".equals(intent)) goto _L4; else goto _L3
_L3:
        stopSelf(i1);
          goto _L1
_L4:
        if (!"Orca.DRAIN".equals(intent)) goto _L1; else goto _L5
_L5:
        for (intent = j.values().iterator(); intent.hasNext(); ((com.facebook.fbservice.service.h)intent.next()).c()) { }
        j.clear();
          goto _L1
    }

    public boolean onUnbind(Intent intent)
    {
        super.onUnbind(intent);
        return true;
    }

}
