// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            ag, af, fz, gv, 
//            ay, gt

public final class ae
    implements ag
{

    private final Object mw = new Object();
    private final WeakHashMap mx = new WeakHashMap();
    private final ArrayList my = new ArrayList();

    public ae()
    {
    }

    public af a(Context context, ay ay, fz fz1, View view, gt gt)
    {
label0:
        {
            synchronized (mw)
            {
                if (!c(fz1))
                {
                    break label0;
                }
                context = (af)mx.get(fz1);
            }
            return context;
        }
        context = new af(context, ay, fz1, view, gt);
        context.a(this);
        mx.put(fz1, context);
        my.add(context);
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public af a(ay ay, fz fz1)
    {
        return a(fz1.rN.getContext(), ay, fz1, ((View) (fz1.rN)), fz1.rN.dx());
    }

    public void a(af af1)
    {
        synchronized (mw)
        {
            if (!af1.aH())
            {
                my.remove(af1);
            }
        }
        return;
        af1;
        obj;
        JVM INSTR monitorexit ;
        throw af1;
    }

    public boolean c(fz fz1)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        fz1 = (af)mx.get(fz1);
        if (fz1 == null) goto _L2; else goto _L1
_L1:
        if (!fz1.aH()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        fz1;
        obj;
        JVM INSTR monitorexit ;
        throw fz1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void d(fz fz1)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        fz1 = (af)mx.get(fz1);
        if (fz1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        fz1.aF();
        obj;
        JVM INSTR monitorexit ;
        return;
        fz1;
        obj;
        JVM INSTR monitorexit ;
        throw fz1;
    }

    public void pause()
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = my.iterator(); iterator.hasNext(); ((af)iterator.next()).pause()) { }
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
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = my.iterator(); iterator.hasNext(); ((af)iterator.next()).resume()) { }
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
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = my.iterator(); iterator.hasNext(); ((af)iterator.next()).stop()) { }
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
