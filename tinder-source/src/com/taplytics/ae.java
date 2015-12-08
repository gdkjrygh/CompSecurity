// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Referenced classes of package com.taplytics:
//            af, gs, z

final class ae
    implements Runnable
{

    final z a;

    ae(z z)
    {
        a = z;
        super();
    }

    public final void run()
    {
        Class class1 = Class.forName("com.localytics.android.Localytics");
        Class class2 = Class.forName("com.localytics.android.AnalyticsListener");
        Method method = class1.getMethod("addAnalyticsListener", new Class[] {
            class2
        });
        ClassLoader classloader = class2.getClassLoader();
        af af1 = new af(this);
        method.invoke(class1, new Object[] {
            Proxy.newProxyInstance(classloader, new Class[] {
                class2
            }, af1)
        });
_L1:
        return;
        Exception exception;
        exception;
        if (gs.b())
        {
            gs.a((new StringBuilder("Problem setting up localyics tracking: ")).append(exception.getMessage()).toString());
            return;
        }
          goto _L1
    }
}
