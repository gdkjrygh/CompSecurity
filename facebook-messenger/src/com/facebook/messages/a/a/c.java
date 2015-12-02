// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.a.a;

import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.messages.a.a:
//            a

class c
    implements h
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public void a(QuickExperimentInfo quickexperimentinfo)
    {
        a.a(quickexperimentinfo);
    }

    public volatile void a(Object obj)
    {
        a((QuickExperimentInfo)obj);
    }

    public void a(Throwable throwable)
    {
    }
}
