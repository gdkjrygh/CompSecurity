// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Referenced classes of package com.nuance.a.a.a.b.a:
//            i, k

final class j
    implements InvocationHandler
{

    private i a;

    j(i l)
    {
        a = l;
        super();
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
    {
        if (!method.getName().equals("onServiceConnected")) goto _L2; else goto _L1
_L1:
        if (i.a(a) != null)
        {
            i.a(a).a();
        }
_L4:
        return null;
_L2:
        if (method.getName().equals("onServiceDisconnected") && i.a(a) != null)
        {
            i.a(a).b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
