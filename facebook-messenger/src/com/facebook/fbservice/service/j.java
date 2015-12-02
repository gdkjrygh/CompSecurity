// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;


// Referenced classes of package com.facebook.fbservice.service:
//            g, h, m, OperationResult

class j
    implements g
{

    final m a;
    final h b;

    j(h h1, m m)
    {
        b = h1;
        a = m;
        super();
    }

    public void a(OperationResult operationresult)
    {
        h.a(b, a, operationresult);
    }
}
