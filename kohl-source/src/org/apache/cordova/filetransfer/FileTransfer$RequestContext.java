// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.filetransfer;

import java.io.File;
import java.net.HttpURLConnection;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

// Referenced classes of package org.apache.cordova.filetransfer:
//            FileTransfer

private static final class callbackContext
{

    boolean aborted;
    CallbackContext callbackContext;
    HttpURLConnection connection;
    String source;
    String target;
    File targetFile;

    void sendPluginResult(PluginResult pluginresult)
    {
        this;
        JVM INSTR monitorenter ;
        if (!aborted)
        {
            callbackContext.sendPluginResult(pluginresult);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        pluginresult;
        this;
        JVM INSTR monitorexit ;
        throw pluginresult;
    }

    A(String s, String s1, CallbackContext callbackcontext)
    {
        source = s;
        target = s1;
        callbackContext = callbackcontext;
    }
}
