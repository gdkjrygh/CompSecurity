// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.IntentFilter;
import android.os.Handler;
import com.facebook.c.b;
import com.facebook.c.k;
import com.google.common.a.ik;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.base.broadcast:
//            l, b, e, h

public class g
    implements l
{

    final com.facebook.base.broadcast.b a;
    private final k b;
    private final IntentFilter c;
    private final Handler d;
    private boolean e;

    public g(com.facebook.base.broadcast.b b1, Map map, IntentFilter intentfilter, Handler handler)
    {
        a = b1;
        super();
        e = false;
        Object obj = map;
        if (handler != null)
        {
            obj = map;
            if (!b1.b())
            {
                obj = ik.a();
                java.util.Map.Entry entry;
                for (map = map.entrySet().iterator(); map.hasNext(); ((Map) (obj)).put(entry.getKey(), new e((b)entry.getValue(), handler, null)))
                {
                    entry = (java.util.Map.Entry)map.next();
                }

            }
        }
        b = new h(this, ((Map) (obj)), b1);
        c = intentfilter;
        d = handler;
    }

    public boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e) goto _L2; else goto _L1
_L1:
        com.facebook.debug.log.b.e(a.getClass().getSimpleName(), "Called registerBroadcastReceiver twice.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        IntentFilter intentfilter = c;
        Object obj;
        obj = intentfilter;
        if (intentfilter != null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = new IntentFilter();
        for (Iterator iterator = b.b().iterator(); iterator.hasNext(); ((IntentFilter) (obj)).addAction((String)iterator.next())) { }
        break MISSING_BLOCK_LABEL_89;
        obj;
        throw obj;
        a.a(b, ((IntentFilter) (obj)), d);
        e = true;
          goto _L3
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            a.a(b);
            e = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
