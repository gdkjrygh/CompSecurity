// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.concurrent.Callable;

// Referenced classes of package com.kik.g:
//            r, p, s

final class aa extends r
{

    final p a;
    final Callable b;

    aa(p p1, Callable callable)
    {
        a = p1;
        b = callable;
        super();
    }

    public final void a(Object obj)
    {
        a.a(obj);
    }

    public final void a(Throwable throwable)
    {
        try
        {
            s.b((p)b.call(), a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            a.a(throwable);
        }
    }
}
