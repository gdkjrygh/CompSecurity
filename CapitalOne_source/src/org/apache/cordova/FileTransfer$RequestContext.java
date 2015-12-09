// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.PluginResult;

// Referenced classes of package org.apache.cordova:
//            FileTransfer

private static final class callbackContext
{

    boolean aborted;
    CallbackContext callbackContext;
    InputStream currentInputStream;
    OutputStream currentOutputStream;
    String source;
    String target;

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

    (String s, String s1, CallbackContext callbackcontext)
    {
        source = s;
        target = s1;
        callbackContext = callbackcontext;
    }
}
