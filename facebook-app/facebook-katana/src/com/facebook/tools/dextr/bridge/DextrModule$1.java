// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

final class 
    implements ThreadFactory
{

    public final Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setName("DexTr-Upload");
        Process.setThreadPriority(10);
        return runnable;
    }

    ()
    {
    }
}
