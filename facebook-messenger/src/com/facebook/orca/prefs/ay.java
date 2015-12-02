// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import com.facebook.fbservice.service.OperationResult;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.prefs:
//            av

class ay
    implements h
{

    final av a;

    ay(av av1)
    {
        a = av1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        av.b(a);
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        av.c(a);
    }
}
