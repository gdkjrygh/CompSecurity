// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.android.concurrent.ListenableCompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil

final class  extends ListenableCompletableFuture
{

    final MediaDocumentDownloadUtil this$0;
    final CountDownLatch val$freeToProceed;
    final Future val$task[];

    public final boolean cancel(boolean flag)
    {
        Exception exception;
        try
        {
            val$freeToProceed.await();
            val$task[0].cancel(flag);
        }
        catch (InterruptedException interruptedexception)
        {
            return super.cancel(flag);
        }
        finally
        {
            super.cancel(flag);
        }
        return super.cancel(flag);
        throw exception;
    }

    ()
    {
        this$0 = final_mediadocumentdownloadutil;
        val$freeToProceed = countdownlatch;
        val$task = _5B_Ljava.util.concurrent.Future_3B_.this;
        super();
    }
}
