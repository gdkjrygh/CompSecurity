// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import javax.inject.a;

// Referenced classes of package com.facebook.inject:
//            aq, u

class w
    implements a
{

    final Constructor a;
    final u b;

    w(u u, Constructor constructor)
    {
        b = u;
        a = constructor;
        super();
    }

    public Object b()
    {
        Object obj;
        try
        {
            obj = a.newInstance((Object[])null);
        }
        catch (InstantiationException instantiationexception)
        {
            throw new aq(instantiationexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new aq(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new aq(invocationtargetexception);
        }
        return obj;
    }
}
