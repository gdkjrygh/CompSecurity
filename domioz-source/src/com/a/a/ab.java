// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.util.concurrent.Callable;

// Referenced classes of package com.a.a:
//            z

final class ab
    implements Callable
{

    final z a;

    ab(z z1)
    {
        a = z1;
        super();
    }

    public final Object call()
    {
        if (!a.c())
        {
            z.b(a);
        }
        return null;
    }
}
