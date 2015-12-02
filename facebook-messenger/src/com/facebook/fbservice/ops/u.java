// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.aa;

// Referenced classes of package com.facebook.fbservice.ops:
//            r, v

class u extends aa
{

    final r a;

    u(r r1)
    {
        a = r1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        if (!r.h(a))
        {
            r.a(a, new v(this, operationresult));
        }
    }

    public void b(OperationResult operationresult)
    {
        r.b(a, operationresult);
    }
}
