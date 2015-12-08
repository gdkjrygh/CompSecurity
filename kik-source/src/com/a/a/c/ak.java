// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.a.a.c:
//            x, ar

final class ak
    implements Callable
{

    final long a;
    final String b;
    final x c;

    ak(x x1, long l, String s)
    {
        c = x1;
        a = l;
        b = s;
        super();
    }

    public final Object call()
    {
        if (!x.a(c).get())
        {
            x.b(c).a(a, b);
        }
        return null;
    }
}
