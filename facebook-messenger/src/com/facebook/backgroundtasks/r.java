// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundtasks;

import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.google.common.d.a.a;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.backgroundtasks:
//            b

public class r extends a
    implements h
{

    private final Class a;

    public r(Class class1)
    {
        a = class1;
    }

    public void a(OperationResult operationresult)
    {
        b.b(a, "Finished successfully");
        a_(new com.facebook.backgroundtasks.b(true));
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        b.b(a, "Finished with failure");
        a_(new com.facebook.backgroundtasks.b(false));
    }
}
