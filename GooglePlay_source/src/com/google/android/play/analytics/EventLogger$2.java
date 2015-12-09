// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import android.os.HandlerThread;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.google.android.play.analytics:
//            EventLogger

static final class val.semaphore extends HandlerThread
{

    final Semaphore val$semaphore;

    protected final void onLooperPrepared()
    {
        val$semaphore.release();
    }

    (String s, Semaphore semaphore1)
    {
        val$semaphore = semaphore1;
        super(s, 10);
    }
}
