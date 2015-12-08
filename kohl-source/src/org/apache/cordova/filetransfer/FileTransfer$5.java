// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.filetransfer;

import java.io.File;
import java.net.HttpURLConnection;
import org.apache.cordova.PluginResult;

// Referenced classes of package org.apache.cordova.filetransfer:
//            FileTransfer

class questContext
    implements Runnable
{

    final FileTransfer this$0;
    final questContext val$context;

    public void run()
    {
        questContext questcontext = val$context;
        questcontext;
        JVM INSTR monitorenter ;
        File file = val$context.targetFile;
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        file.delete();
        org.json.JSONObject jsonobject = FileTransfer.access$700(FileTransfer.ABORTED_ERR, val$context.source, val$context.target, null, Integer.valueOf(-1), null);
        val$context.sendPluginResult(new PluginResult(org.apache.cordova.atus.ERROR, jsonobject));
        val$context.aborted = true;
        if (val$context.connection != null)
        {
            val$context.connection.disconnect();
        }
        questcontext;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
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
