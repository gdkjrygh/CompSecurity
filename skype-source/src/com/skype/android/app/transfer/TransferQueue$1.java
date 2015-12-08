// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import com.skype.Transfer;
import java.io.File;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferQueue, TransferUtil

final class val.transfer
    implements Runnable
{

    final TransferQueue this$0;
    final Transfer val$transfer;

    public final void run()
    {
        if (TransferQueue.access$000(TransferQueue.this).isIncoming(val$transfer))
        {
            val$transfer.accept((new StringBuilder()).append(TransferQueue.access$000(TransferQueue.this).getDownloadsDirectory()).append(File.separator).append(TransferQueue.access$000(TransferQueue.this).consolidateFileName(val$transfer)).toString());
        } else
        {
            val$transfer.resume();
        }
        TransferQueue.access$100().info((new StringBuilder("transfer started for ")).append(val$transfer.getFilenameProp()).toString());
    }

    ()
    {
        this$0 = final_transferqueue;
        val$transfer = Transfer.this;
        super();
    }
}
