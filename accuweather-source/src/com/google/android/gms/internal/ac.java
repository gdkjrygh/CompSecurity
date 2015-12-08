// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            ae, ad, am, eg

public final class ac
    implements ae
{

    private final Object lq = new Object();
    private WeakHashMap lr;
    private ArrayList ls;

    public ac()
    {
        lr = new WeakHashMap();
        ls = new ArrayList();
    }

    public ad a(am am, eg eg)
    {
label0:
        {
            synchronized (lq)
            {
                if (!c(eg))
                {
                    break label0;
                }
                am = (ad)lr.get(eg);
            }
            return am;
        }
        am = new ad(am, eg);
        am.a(this);
        lr.put(eg, am);
        ls.add(am);
        obj;
        JVM INSTR monitorexit ;
        return am;
        am;
        obj;
        JVM INSTR monitorexit ;
        throw am;
    }

    public void a(ad ad1)
    {
        synchronized (lq)
        {
            if (!ad1.au())
            {
                ls.remove(ad1);
            }
        }
        return;
        ad1;
        obj;
        JVM INSTR monitorexit ;
        throw ad1;
    }

    public boolean c(eg eg)
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        eg = (ad)lr.get(eg);
        if (eg == null) goto _L2; else goto _L1
_L1:
        if (!eg.au()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        eg;
        obj;
        JVM INSTR monitorexit ;
        throw eg;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void d(eg eg)
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        eg = (ad)lr.get(eg);
        if (eg == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        eg.as();
        obj;
        JVM INSTR monitorexit ;
        return;
        eg;
        obj;
        JVM INSTR monitorexit ;
        throw eg;
    }

    public void pause()
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = ls.iterator(); iterator.hasNext(); ((ad)iterator.next()).pause()) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public void resume()
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = ls.iterator(); iterator.hasNext(); ((ad)iterator.next()).resume()) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public void stop()
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = ls.iterator(); iterator.hasNext(); ((ad)iterator.next()).stop()) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }
}
