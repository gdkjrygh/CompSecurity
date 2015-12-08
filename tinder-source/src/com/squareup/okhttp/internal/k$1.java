// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.squareup.okhttp.internal:
//            k

static final class b
    implements ThreadFactory
{

    final String a;
    final boolean b;

    public final Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable, a);
        runnable.setDaemon(b);
        return runnable;
    }

    y(String s, boolean flag)
    {
        a = s;
        b = flag;
        super();
    }
}
