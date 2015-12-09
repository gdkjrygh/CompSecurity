// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.google.a.b:
//            ae, f

class l
    implements ae
{

    final Constructor a;
    final f b;

    l(f f, Constructor constructor)
    {
        b = f;
        a = constructor;
        super();
    }

    public Object a()
    {
        Object obj;
        try
        {
            obj = a.newInstance(null);
        }
        catch (InstantiationException instantiationexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Failed to invoke ").append(a).append(" with no args").toString(), instantiationexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Failed to invoke ").append(a).append(" with no args").toString(), invocationtargetexception.getTargetException());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new AssertionError(illegalaccessexception);
        }
        return obj;
    }
}
