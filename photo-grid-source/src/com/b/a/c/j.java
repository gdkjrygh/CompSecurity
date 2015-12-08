// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.f;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.b.a.c:
//            h

final class j
    implements Callable
{

    final h a;

    j(h h1)
    {
        a = h1;
        super();
    }

    public final Object call()
    {
        h.a(a).createNewFile();
        f.d();
        return null;
    }
}
