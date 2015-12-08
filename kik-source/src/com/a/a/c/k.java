// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.a.a.c:
//            g

final class k
    implements Callable
{

    final g a;

    k(g g1)
    {
        a = g1;
        super();
    }

    public final Object call()
    {
        return Boolean.valueOf(g.a(a).exists());
    }
}
