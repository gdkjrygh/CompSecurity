// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.libraries.bind.async:
//            AsyncUtil

static final class _cls9
    implements Executor
{

    public final void execute(Runnable runnable)
    {
        runnable.run();
    }

    _cls9()
    {
    }
}
