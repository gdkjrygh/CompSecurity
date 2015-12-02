// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import com.facebook.fbservice.service.OperationResult;

// Referenced classes of package com.facebook.fbservice.ops:
//            u, r

class v
    implements Runnable
{

    final OperationResult a;
    final u b;

    v(u u1, OperationResult operationresult)
    {
        b = u1;
        a = operationresult;
        super();
    }

    public void run()
    {
        if (!b.a.e())
        {
            r.a(b.a, a);
        }
    }
}
