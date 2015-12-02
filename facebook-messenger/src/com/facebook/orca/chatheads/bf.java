// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.debug.log.b;
import com.google.common.d.a.h;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.facebook.orca.chatheads:
//            al

class bf
    implements h
{

    final al a;

    bf(al al1)
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
        if (!(throwable instanceof CancellationException) && b.b(6))
        {
            b.e(al.a, (new StringBuilder()).append("Exception hiding ChatThreadController: ").append(throwable).toString());
        }
    }

    public void a(Void void1)
    {
        a.j();
    }
}
