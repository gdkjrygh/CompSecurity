// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package a.a:
//            hf

public final class hg
    implements hf
{

    private final hf a;
    private final Comparator b;

    public hg(hf hf1, Comparator comparator)
    {
        a = hf1;
        b = comparator;
    }

    public final Object a(Object obj)
    {
        return a.a(obj);
    }

    public final Collection a()
    {
        return a.a();
    }

    public final boolean a(Object obj, Object obj1)
    {
        hf hf1 = a;
        hf1;
        JVM INSTR monitorenter ;
        Iterator iterator = a.a().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj2 = iterator.next();
        if (b.compare(obj, obj2) != 0) goto _L4; else goto _L3
_L3:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        a.b(obj2);
        hf1;
        JVM INSTR monitorexit ;
        return a.a(obj, obj1);
        obj;
        throw obj;
_L2:
        obj2 = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void b(Object obj)
    {
        a.b(obj);
    }
}
