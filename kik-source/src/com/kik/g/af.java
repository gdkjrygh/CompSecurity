// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.concurrent.ExecutorService;

// Referenced classes of package com.kik.g:
//            r, ag, ai, ah, 
//            p

final class af extends r
{

    final ExecutorService a;
    final p b;

    af(ExecutorService executorservice, p p)
    {
        a = executorservice;
        b = p;
        super();
    }

    public final void a(Object obj)
    {
        a.submit(new ag(this, obj));
    }

    public final void b()
    {
        a.submit(new ai(this));
    }

    public final void b(Throwable throwable)
    {
        a.submit(new ah(this, throwable));
    }
}
