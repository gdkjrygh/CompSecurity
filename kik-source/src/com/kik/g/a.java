// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.concurrent.ExecutorService;

// Referenced classes of package com.kik.g:
//            k, b

public final class a extends k
{

    ExecutorService a;

    public a(Object obj, ExecutorService executorservice)
    {
        super(obj);
        a = executorservice;
    }

    static void a(a a1, Object obj)
    {
        a1.k.a(obj);
    }

    public final void a(Object obj)
    {
        a.execute(new b(this, obj));
    }
}
