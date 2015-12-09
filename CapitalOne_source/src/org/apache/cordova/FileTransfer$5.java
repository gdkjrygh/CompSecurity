// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;


// Referenced classes of package org.apache.cordova:
//            FileTransfer

class questContext
    implements Runnable
{

    final FileTransfer this$0;
    final questContext val$context;

    public void run()
    {
        synchronized (val$context)
        {
            FileTransfer.access$300(val$context.currentInputStream);
            FileTransfer.access$300(val$context.currentOutputStream);
        }
        return;
        exception;
        questcontext;
        JVM INSTR monitorexit ;
        throw exception;
    }

    questContext()
    {
        this$0 = final_filetransfer;
        val$context = questContext.this;
        super();
    }
}
