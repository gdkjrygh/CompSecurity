// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import android.content.Context;
import javax.inject.Singleton;

// Referenced classes of package com.facebook.inject:
//            d, i, n, av, 
//            aq, ThreadLocalScoped, j

class k extends d
{

    final i a;

    private k(i j)
    {
        a = j;
        super();
    }

    k(i j, j j1)
    {
        this(j);
    }

    public Context a()
    {
        Context context = i.a(a).getContext();
        if (context == null)
        {
            throw new RuntimeException();
        }
        if (context != context.getApplicationContext())
        {
            av av1 = av.a();
            if (av1.c(javax/inject/Singleton))
            {
                throw new aq("Should not call getContext in singleton creation. Can lead to memory leaks.");
            }
            if (av1.c(com/facebook/inject/ThreadLocalScoped))
            {
                throw new aq("Should not call getContext in thread local creation. Can lead to memory leaks.");
            }
        }
        return context;
    }

    public Object b()
    {
        return a();
    }
}
