// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import com.facebook.fbservice.service.OperationResult;

// Referenced classes of package com.facebook.fbservice.ops:
//            r

class w
    implements Runnable
{

    final OperationResult a;
    final r b;

    w(r r1, OperationResult operationresult)
    {
        b = r1;
        a = operationresult;
        super();
    }

    public void run()
    {
        if (!b.e())
        {
            r.c(b, a);
        }
    }
}
