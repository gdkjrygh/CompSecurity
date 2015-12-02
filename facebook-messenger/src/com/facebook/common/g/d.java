// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.g;

import com.facebook.debug.log.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class d
{

    public d()
    {
    }

    public static Object a(Future future)
    {
        Object obj = future.get();
        return obj;
        Object obj1;
        obj1;
        Thread.currentThread().interrupt();
_L2:
        b.e(future.getClass(), "Exception while blocking for future result", ((Throwable) (obj1)));
        return null;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
