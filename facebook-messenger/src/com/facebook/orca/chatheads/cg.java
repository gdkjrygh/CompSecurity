// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.debug.log.b;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.chatheads:
//            cf

class cg
    implements h
{

    final cf a;

    cg(cf cf1)
    {
        a = cf1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((Void)obj);
    }

    public void a(Throwable throwable)
    {
        if (!(throwable instanceof Throwable))
        {
            b.e(cf.g(), (new StringBuilder()).append("Failure undarkenBackground: ").append(throwable).toString());
        }
    }

    public void a(Void void1)
    {
        a.c(false);
    }
}
