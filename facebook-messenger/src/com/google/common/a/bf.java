// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import com.google.common.base.Throwables;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.a:
//            bc, bb, hy, cn

final class bf extends bc
    implements Serializable
{

    bf(hy hy, Function function)
    {
        super(hy, function);
    }

    cn b(int i)
    {
        return super.a(i);
    }

    public Object get(Object obj)
    {
        Object obj1;
        try
        {
            obj1 = a(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = ((ExecutionException) (obj)).getCause();
            Throwables.propagateIfInstanceOf(((Throwable) (obj)), com/google/common/a/bb);
            throw new bb(((Throwable) (obj)));
        }
        if (obj1 == null)
        {
            throw new NullPointerException((new StringBuilder()).append(a).append(" returned null for key ").append(obj).append(".").toString());
        } else
        {
            return obj1;
        }
    }
}
