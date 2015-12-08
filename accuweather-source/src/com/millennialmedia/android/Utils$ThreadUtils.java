// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.millennialmedia.android:
//            Utils

static class 
{

    private static final ExecutorService cachedThreadExecutor = Executors.newCachedThreadPool();

    static void execute(Runnable runnable)
    {
        cachedThreadExecutor.execute(runnable);
    }


    ()
    {
    }
}
