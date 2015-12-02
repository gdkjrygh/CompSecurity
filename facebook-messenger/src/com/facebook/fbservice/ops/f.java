// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import com.facebook.fbservice.service.OperationResult;

// Referenced classes of package com.facebook.fbservice.ops:
//            c

class f
    implements Runnable
{

    final OperationResult a;
    final c b;

    f(c c1, OperationResult operationresult)
    {
        b = c1;
        a = operationresult;
        super();
    }

    public void run()
    {
        if (!c.a(b))
        {
            c.c(b, a);
        }
    }
}
