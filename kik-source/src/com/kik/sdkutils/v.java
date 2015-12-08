// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import com.kik.g.r;

// Referenced classes of package com.kik.sdkutils:
//            s

final class v
    implements Runnable
{

    final Throwable a;
    final s b;

    v(s s1, Throwable throwable)
    {
        b = s1;
        a = throwable;
        super();
    }

    public final void run()
    {
        b.b.b(a);
    }
}
