// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.debug.log.b;
import com.google.common.d.a.h;
import java.util.List;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.facebook.orca.chatheads:
//            al, bs

class ay
    implements h
{

    final al a;

    ay(al al1)
    {
        a = al1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((List)obj);
    }

    public void a(Throwable throwable)
    {
        if (!(throwable instanceof CancellationException))
        {
            b.e(al.a, (new StringBuilder()).append("hidden future in onDismissedAll failed: ").append(throwable).toString());
        }
    }

    public void a(List list)
    {
        if (!al.l(a) && al.C(a) != null)
        {
            al.C(a).c();
        }
    }
}
