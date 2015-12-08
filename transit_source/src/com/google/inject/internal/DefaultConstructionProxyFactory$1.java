// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.InjectionPoint;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.google.inject.internal:
//            ConstructionProxy, DefaultConstructionProxyFactory

class val.constructor
    implements ConstructionProxy
{

    final DefaultConstructionProxyFactory this$0;
    final Constructor val$constructor;

    public Constructor getConstructor()
    {
        return val$constructor;
    }

    public InjectionPoint getInjectionPoint()
    {
        return DefaultConstructionProxyFactory.access$000(DefaultConstructionProxyFactory.this);
    }

    public transient Object newInstance(Object aobj[])
        throws InvocationTargetException
    {
        try
        {
            aobj = ((Object []) (val$constructor.newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new AssertionError(((Object) (aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new AssertionError(((Object) (aobj)));
        }
        return ((Object) (aobj));
    }

    ()
    {
        this$0 = final_defaultconstructionproxyfactory;
        val$constructor = Constructor.this;
        super();
    }
}
