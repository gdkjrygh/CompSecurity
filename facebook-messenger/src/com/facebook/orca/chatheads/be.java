// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.debug.log.b;
import com.google.common.d.a.h;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.facebook.orca.chatheads:
//            al

class be
    implements h
{

    final al a;

    be(al al1)
    {
        a = al1;
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
            b.e(al.a, (new StringBuilder()).append("collapse failed on hiding thread controller: ").append(throwable).toString());
        }
    }

    public void a(Void void1)
    {
        if (a.e())
        {
            return;
        } else
        {
            al.N(a);
            return;
        }
    }
}
