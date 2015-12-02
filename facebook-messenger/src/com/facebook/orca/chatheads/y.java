// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.debug.log.b;
import com.google.common.d.a.h;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.facebook.orca.chatheads:
//            v, ab

class y
    implements h
{

    final v a;

    y(v v1)
    {
        a = v1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((Void)obj);
    }

    public void a(Throwable throwable)
    {
        if (!(throwable instanceof CancellationException))
        {
            b.e(v.c(), (new StringBuilder()).append("handleTimeout onFailure: ").append(throwable).toString());
        }
    }

    public void a(Void void1)
    {
        if (com.facebook.orca.chatheads.v.b(a) != null)
        {
            com.facebook.orca.chatheads.v.b(a).a();
        }
    }
}
