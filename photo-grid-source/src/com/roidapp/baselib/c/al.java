// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package com.roidapp.baselib.c:
//            ag, ak

final class al
    implements ag
{

    public al()
    {
    }

    public final void a(Runnable runnable, ak ak1)
    {
        throw new RejectedExecutionException((new StringBuilder("Task ")).append(runnable.toString()).append(" rejected from ").append(ak1.toString()).toString());
    }
}
