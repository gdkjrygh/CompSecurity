// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import com.kik.g.p;

// Referenced classes of package com.kik.sdkutils:
//            e

final class g
    implements Runnable
{

    final Throwable a;
    final e b;

    g(e e1, Throwable throwable)
    {
        b = e1;
        a = throwable;
        super();
    }

    public final void run()
    {
        b.b.a(a);
    }
}
