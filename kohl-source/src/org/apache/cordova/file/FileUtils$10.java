// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

// Referenced classes of package org.apache.cordova.file:
//            FileUtils, NoModificationAllowedException

class val.callbackContext
    implements eOp
{

    final FileUtils this$0;
    final CallbackContext val$callbackContext;
    final String val$fname;
    final int val$offset;

    public void run()
        throws FileNotFoundException, IOException, NoModificationAllowedException
    {
        long l = FileUtils.access$000(FileUtils.this, val$fname, val$offset);
        val$callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.Status.OK, l));
    }

    nAllowedException()
    {
        this$0 = final_fileutils;
        val$fname = s;
        val$offset = i;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
