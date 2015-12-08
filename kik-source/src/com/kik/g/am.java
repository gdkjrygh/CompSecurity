// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.concurrent.TimeoutException;

// Referenced classes of package com.kik.g:
//            p

final class am
    implements Runnable
{

    final p a;

    am(p p1)
    {
        a = p1;
        super();
    }

    public final void run()
    {
        a.a(new TimeoutException());
    }
}
