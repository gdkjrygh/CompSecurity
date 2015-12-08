// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.d;
import com.google.common.base.p;

// Referenced classes of package com.google.common.collect:
//            ComputationException, MapMaker

final class computingFunction extends computingFunction
{

    private static final long serialVersionUID = 0L;
    final d computingFunction;

    private Object a(Object obj)
    {
        p.a(obj);
        try
        {
            obj = computingFunction.apply(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ComputationException(((Throwable) (obj)));
        }
        return obj;
    }

    public final Object get(Object obj)
    {
        Object obj1 = a(obj);
        d d1 = computingFunction;
        if (obj1 == null)
        {
            throw new NullPointerException(p.a("%s returned null for key %s.", new Object[] {
                d1, obj
            }));
        } else
        {
            notifyRemoval(obj, obj1);
            return obj1;
        }
    }

    (MapMaker mapmaker, d d1)
    {
        super(mapmaker);
        computingFunction = (d)p.a(d1);
    }
}
