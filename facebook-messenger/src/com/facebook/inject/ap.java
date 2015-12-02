// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import javax.inject.a;

// Referenced classes of package com.facebook.inject:
//            ao, al

public class ap
    implements a
{

    private final com.google.inject.a a;
    private final a b;

    public ap(com.google.inject.a a1, a a2)
    {
        a = a1;
        b = a2;
    }

    public Object b()
    {
        com.facebook.inject.al.a(ao.INSTANCE_GET, a);
        e e1;
        Object obj;
        Exception exception;
        if (com.facebook.debug.log.b.b(2))
        {
            e1 = e.a((new StringBuilder()).append("Provider.get ").append(a).toString());
        } else
        {
            e1 = null;
        }
        obj = b.b();
        if (e1 != null)
        {
            e1.a(10L);
        }
        com.facebook.inject.al.a();
        return obj;
        exception;
        if (e1 != null)
        {
            e1.a(10L);
        }
        com.facebook.inject.al.a();
        throw exception;
    }
}
