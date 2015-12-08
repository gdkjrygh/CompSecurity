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
//            ag, af, fy, gu, 
//            ay, gs

public final class ae
    implements ag
{

    private final Object mH = new Object();
    private final WeakHashMap mI = new WeakHashMap();
    private final ArrayList mJ = new ArrayList();

    public ae()
    {
    }

    public af a(Context context, ay ay, fy fy1, View view, gs gs)
    {
label0:
        {
            synchronized (mH)
            {
                if (!c(fy1))
                {
                    break label0;
                }
                context = (af)mI.get(fy1);
            }
            return context;
        }
        context = new af(context, ay, fy1, view, gs);
        context.a(this);
        mI.put(fy1, context);
        mJ.add(context);
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public af a(ay ay, fy fy1)
    {
        return a(fy1.se.getContext(), ay, fy1, ((View) (fy1.se)), fy1.se.dG());
    }

    public void a(af af1)
    {
        synchronized (mH)
        {
            if (!af1.aM())
            {
                mJ.remove(af1);
            }
        }
        return;
        af1;
        obj;
        JVM INSTR monitorexit ;
        throw af1;
    }

    public boolean c(fy fy1)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        fy1 = (af)mI.get(fy1);
        if (fy1 == null) goto _L2; else goto _L1
_L1:
        if (!fy1.aM()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        fy1;
        obj;
        JVM INSTR monitorexit ;
        throw fy1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void d(fy fy1)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        fy1 = (af)mI.get(fy1);
        if (fy1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        fy1.aK();
        obj;
        JVM INSTR monitorexit ;
        return;
        fy1;
        obj;
        JVM INSTR monitorexit ;
        throw fy1;
    }

    public void pause()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mJ.iterator(); iterator.hasNext(); ((af)iterator.next()).pause()) { }
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
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mJ.iterator(); iterator.hasNext(); ((af)iterator.next()).resume()) { }
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
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mJ.iterator(); iterator.hasNext(); ((af)iterator.next()).stop()) { }
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
