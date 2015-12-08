// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import a.a.a.a.a;
import a.a.a.a.d;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.b.a.b:
//            a, c

final class b extends com.b.a.b.a
{

    private final d a = new c(this);
    private final ExecutorService b;

    public b(a a1, ExecutorService executorservice)
    {
        b = executorservice;
        a1.a(a);
    }

    static ExecutorService a(b b1)
    {
        return b1.b;
    }
}
