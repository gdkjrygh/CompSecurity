// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.util.concurrent.ThreadFactory;

class LowPriorityThreadFactory
    implements ThreadFactory
{

    LowPriorityThreadFactory()
    {
    }

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setPriority(1);
        return runnable;
    }
}
