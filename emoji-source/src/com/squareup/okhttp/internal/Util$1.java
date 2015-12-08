// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.squareup.okhttp.internal:
//            Util

static final class val.name
    implements ThreadFactory
{

    final String val$name;

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable, val$name);
        runnable.setDaemon(true);
        return runnable;
    }

    (String s)
    {
        val$name = s;
        super();
    }
}
