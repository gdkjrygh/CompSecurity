// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.util.concurrent:
//            r

final class q extends r
{

    private final Throwable a;

    q(Throwable throwable)
    {
        a = throwable;
    }

    public final Object get()
    {
        throw new ExecutionException(a);
    }
}
