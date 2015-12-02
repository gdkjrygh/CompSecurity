// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.process.c;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.fbservice.service:
//            DefaultBlueService, OperationType, r, LocalQueueSet

public class p
{

    private static final Class a = com/facebook/fbservice/service/p;
    private final Context b;
    private final c c;
    private final Map d = ik.c();
    private final ConcurrentMap e = ik.c();
    private final ConcurrentMap f = ik.c();
    private final ConcurrentMap g = ik.c();

    public p(Context context, c c1)
    {
        b = context;
        c = c1;
    }

    public Class a(c c1)
    {
        c1 = c1.b();
        if (c1 == null)
        {
            c1 = com/facebook/fbservice/service/DefaultBlueService;
        } else
        {
            Class class1 = (Class)g.get(c1);
            c1 = class1;
            if (class1 == null)
            {
                if (c.d() || c.a())
                {
                    return com/facebook/fbservice/service/DefaultBlueService;
                } else
                {
                    return null;
                }
            }
        }
        return c1;
    }

    public Class a(OperationType operationtype)
    {
        r r1 = (r)d.get(operationtype.c());
        if (r1 == null)
        {
            return null;
        }
        if (operationtype.b())
        {
            boolean flag;
            if (r1.b != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            return r1.b;
        } else
        {
            return r1.a;
        }
    }

    public Class a(Class class1)
    {
label0:
        {
            class1 = (Class)e.get(class1);
            if (class1 == com/facebook/fbservice/service/LocalQueueSet)
            {
                Class class2 = a(c);
                class1 = class2;
                if (class2 == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("No service registered for process ").append(c).toString());
                }
            } else
            {
                if (class1 == null)
                {
                    break label0;
                }
                class1 = (Class)f.get(class1);
                if (class1 == null)
                {
                    break label0;
                }
            }
            return class1;
        }
        return com/facebook/fbservice/service/DefaultBlueService;
    }

    public void a(c c1, Class class1)
    {
        Preconditions.checkNotNull(c1);
        Preconditions.checkNotNull(class1);
        if ((Class)g.put(c1.b(), class1) != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Tried to register ").append(c1).append(" multiple times").toString());
        } else
        {
            return;
        }
    }

    public void a(OperationType operationtype, Class class1)
    {
        d.put(operationtype.c(), new r(class1, null));
    }

    public void a(OperationType operationtype, Class class1, Class class2)
    {
        d.put(operationtype.c(), new r(class1, class2, null));
    }

    public void a(Class class1, Class class2)
    {
        Preconditions.checkNotNull(class1);
        Preconditions.checkNotNull(class2);
        if ((Class)e.putIfAbsent(class1, class2) != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Tried to register ").append(class1).append(" multiple times").toString());
        } else
        {
            return;
        }
    }

    public Class b(OperationType operationtype)
    {
        operationtype = a(operationtype);
        if (operationtype == null)
        {
            return null;
        } else
        {
            return (Class)e.get(operationtype);
        }
    }

    public void b(Class class1, Class class2)
    {
        Preconditions.checkNotNull(class1);
        Preconditions.checkNotNull(class2);
        if ((Class)f.put(class1, class2) != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Tried to register ").append(class1).append(" multiple times").toString());
        } else
        {
            return;
        }
    }

    public Intent c(OperationType operationtype)
    {
        operationtype = a(operationtype);
        if (operationtype == null)
        {
            return null;
        } else
        {
            operationtype = a(operationtype);
            return new Intent(b, operationtype);
        }
    }

    public Class d(OperationType operationtype)
    {
        operationtype = a(operationtype);
        if (operationtype == null)
        {
            return null;
        } else
        {
            return a(operationtype);
        }
    }

}
