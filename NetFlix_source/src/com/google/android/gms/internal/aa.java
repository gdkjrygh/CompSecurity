// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            ac, ab, ak, dh

public final class aa
    implements ac
{

    private final Object li = new Object();
    private WeakHashMap lj;
    private ArrayList lk;

    public aa()
    {
        lj = new WeakHashMap();
        lk = new ArrayList();
    }

    public ab a(ak ak, dh dh)
    {
label0:
        {
            synchronized (li)
            {
                if (!c(dh))
                {
                    break label0;
                }
                ak = (ab)lj.get(dh);
            }
            return ak;
        }
        ak = new ab(ak, dh);
        ak.a(this);
        lj.put(dh, ak);
        lk.add(ak);
        obj;
        JVM INSTR monitorexit ;
        return ak;
        ak;
        obj;
        JVM INSTR monitorexit ;
        throw ak;
    }

    public void a(ab ab1)
    {
        synchronized (li)
        {
            if (!ab1.at())
            {
                lk.remove(ab1);
            }
        }
        return;
        ab1;
        obj;
        JVM INSTR monitorexit ;
        throw ab1;
    }

    public boolean c(dh dh)
    {
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
        dh = (ab)lj.get(dh);
        if (dh == null) goto _L2; else goto _L1
_L1:
        if (!dh.at()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        dh;
        obj;
        JVM INSTR monitorexit ;
        throw dh;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void d(dh dh)
    {
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
        dh = (ab)lj.get(dh);
        if (dh == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        dh.ar();
        obj;
        JVM INSTR monitorexit ;
        return;
        dh;
        obj;
        JVM INSTR monitorexit ;
        throw dh;
    }
}
