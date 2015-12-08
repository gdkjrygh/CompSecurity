// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.xj;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            e, q, p, i

final class o extends e
{

    private final xj a;
    private final ExecutorService b;

    public o(xj xj1, ExecutorService executorservice)
    {
        a = xj1;
        b = executorservice;
    }

    static m a(o o1)
    {
        return o1.a.d();
    }

    public final void a(String s, String s1, i i)
    {
        b.submit(new q(this, s, s1, i));
    }

    public final void a(String s, List list, i i)
    {
        b.submit(new p(this, list, s, i));
    }
}
