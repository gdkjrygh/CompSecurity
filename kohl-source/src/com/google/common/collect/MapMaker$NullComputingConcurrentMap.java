// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            MapMaker, ComputationException, MapEvictionListener

static final class computingFunction extends computingFunction
    implements computingFunction
{

    private static final long serialVersionUID = 0L;
    final Function computingFunction;

    private Object compute(Object obj)
    {
        Preconditions.checkNotNull(obj);
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

    public Object apply(Object obj)
    {
        Object obj1 = compute(obj);
        Preconditions.checkNotNull(obj1, (new StringBuilder()).append(computingFunction).append(" returned null for key ").append(obj).append(".").toString());
        evictionListener.onEviction(obj, obj1);
        return obj1;
    }

    public ConcurrentMap asMap()
    {
        return this;
    }

    (MapMaker mapmaker, Function function)
    {
        super(mapmaker);
        computingFunction = (Function)Preconditions.checkNotNull(function);
    }
}
