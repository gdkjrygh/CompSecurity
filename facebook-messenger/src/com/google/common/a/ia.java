// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.a:
//            ib, bb, hy

final class ia extends ib
{

    final Function a;

    ia(hy hy, Function function)
    {
        super(hy);
        a = (Function)Preconditions.checkNotNull(function);
    }

    private Object a(Object obj)
    {
        Preconditions.checkNotNull(obj);
        try
        {
            obj = a.apply(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new bb(((Throwable) (obj)));
        }
        return obj;
    }

    public Object get(Object obj)
    {
        Object obj1 = a(obj);
        Preconditions.checkNotNull(obj1, (new StringBuilder()).append(a).append(" returned null for key ").append(obj).append(".").toString());
        a(obj, obj1);
        return obj1;
    }
}
