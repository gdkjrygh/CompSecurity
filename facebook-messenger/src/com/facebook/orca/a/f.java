// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.a;

import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.debug.log.b;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.a:
//            d, g

class f
    implements h
{

    final d a;

    f(d d1)
    {
        a = d1;
        super();
    }

    public void a(QuickExperimentInfo quickexperimentinfo)
    {
        b.b(d.d(), "onSuccess");
        d.a(a, quickexperimentinfo);
        d.a(a, g.INITIALIZED);
    }

    public volatile void a(Object obj)
    {
        a((QuickExperimentInfo)obj);
    }

    public void a(Throwable throwable)
    {
        String s = (new StringBuilder()).append("failed to get experiment info. Using fallback of ").append(d.e()).toString();
        d.a(a, g.UNINITIALIZED);
        b.d(d.d(), s);
        d.a(a).a(d.d().getSimpleName(), s, throwable);
    }
}
