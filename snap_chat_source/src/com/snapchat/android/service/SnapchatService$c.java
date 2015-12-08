// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.service;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.snapchat.android.service:
//            SnapchatService

static final class <init>
    implements ThreadFactory
{

    public final Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setName((new StringBuilder("Worker:")).append(System.currentTimeMillis() % 0x186a0L).toString());
        runnable.setPriority(1);
        return runnable;
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
