// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.aa;

// Referenced classes of package com.facebook.fbservice.ops:
//            c, e

class d extends aa
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        if (!c.c(a))
        {
            c.a(a, new e(this, operationresult));
        }
    }

    public void b(OperationResult operationresult)
    {
        c.b(a, operationresult);
    }
}
