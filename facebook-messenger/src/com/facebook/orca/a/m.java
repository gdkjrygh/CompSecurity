// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.a;

import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.debug.log.b;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.a:
//            k

class m
    implements h
{

    final k a;

    m(k k1)
    {
        a = k1;
        super();
    }

    public void a(QuickExperimentInfo quickexperimentinfo)
    {
        b.b(k.c(), "onSuccess");
        k.a(a, quickexperimentinfo);
    }

    public volatile void a(Object obj)
    {
        a((QuickExperimentInfo)obj);
    }

    public void a(Throwable throwable)
    {
        b.d(k.c(), "failed to get experiment info, using defaults");
    }
}
