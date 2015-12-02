// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import com.facebook.fbservice.service.OperationResult;

// Referenced classes of package com.facebook.fbservice.ops:
//            d, c

class e
    implements Runnable
{

    final OperationResult a;
    final d b;

    e(d d1, OperationResult operationresult)
    {
        b = d1;
        a = operationresult;
        super();
    }

    public void run()
    {
        if (!c.a(b.a))
        {
            c.a(b.a, a);
        }
    }
}
