// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.connectsdk.core:
//            Util

static final class Factory
    implements ThreadFactory
{

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setName("2nd Screen BG");
        return runnable;
    }

    Factory()
    {
    }
}
