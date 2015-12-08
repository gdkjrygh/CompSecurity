// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class anr
{

    private static final anq b = new ans();
    private final Map a = new HashMap();

    public anr()
    {
    }

    public final anp a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        anq anq2;
        b.a(obj, "Argument must not be null");
        anq2 = (anq)a.get(obj.getClass());
        anq anq1 = anq2;
        if (anq2 != null) goto _L2; else goto _L1
_L1:
        Iterator iterator = a.values().iterator();
_L3:
        anq1 = anq2;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        anq1 = (anq)iterator.next();
        if (!anq1.a().isAssignableFrom(obj.getClass())) goto _L3; else goto _L2
_L2:
        anq2 = anq1;
        if (anq1 != null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        anq2 = b;
        obj = anq2.a(obj);
        this;
        JVM INSTR monitorexit ;
        return ((anp) (obj));
        obj;
        throw obj;
    }

    public final void a(anq anq1)
    {
        this;
        JVM INSTR monitorenter ;
        a.put(anq1.a(), anq1);
        this;
        JVM INSTR monitorexit ;
        return;
        anq1;
        throw anq1;
    }

}
