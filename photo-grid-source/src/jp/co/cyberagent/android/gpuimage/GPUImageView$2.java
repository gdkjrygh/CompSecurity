// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import java.util.concurrent.Semaphore;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageView

class val.waiter
    implements Runnable
{

    final GPUImageView this$0;
    final Semaphore val$waiter;

    public void run()
    {
        val$waiter.release();
    }

    ()
    {
        this$0 = final_gpuimageview;
        val$waiter = Semaphore.this;
        super();
    }
}
