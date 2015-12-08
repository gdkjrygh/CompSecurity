// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.d;
import com.google.common.base.t;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap, ComputationException, MapMaker

final class nit> extends ComputingConcurrentHashMap
    implements Serializable
{

    private static final long serialVersionUID = 0L;

    public final Object get(Object obj)
    {
        Object obj1;
        try
        {
            obj1 = getOrCompute(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = ((ExecutionException) (obj)).getCause();
            t.a(((Throwable) (obj)), com/google/common/collect/ComputationException);
            throw new ComputationException(((Throwable) (obj)));
        }
        if (obj1 == null)
        {
            throw new NullPointerException((new StringBuilder()).append(computingFunction).append(" returned null for key ").append(obj).append(".").toString());
        } else
        {
            return obj1;
        }
    }

    (MapMaker mapmaker, d d)
    {
        super(mapmaker, d);
    }
}
