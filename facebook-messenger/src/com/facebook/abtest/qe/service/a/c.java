// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service.a;

import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.google.common.d.a.a;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.abtest.qe.service.a:
//            a, b

class c extends a
    implements h
{

    private c()
    {
    }

    c(com.facebook.abtest.qe.service.a.b b1)
    {
        this();
    }

    public void a(OperationResult operationresult)
    {
        b.b(com.facebook.abtest.qe.service.a.a.d(), "Finished sucessfully");
        a_(new com.facebook.backgroundtasks.b(true));
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        b.b(com.facebook.abtest.qe.service.a.a.d(), (new StringBuilder()).append("Finished with failure: ").append(throwable.toString()).toString());
        a_(new com.facebook.backgroundtasks.b(false));
    }
}
