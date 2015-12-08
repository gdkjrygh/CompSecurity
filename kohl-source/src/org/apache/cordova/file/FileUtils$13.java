// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import java.io.IOException;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova.file:
//            FileUtils, DirectoryManager

class val.fstype
    implements eOp
{

    final FileUtils this$0;
    final CallbackContext val$callbackContext;
    final int val$fstype;
    final long val$size;

    public void run()
        throws IOException, JSONException
    {
        if (val$size != 0L && val$size > DirectoryManager.getFreeDiskSpace(true) * 1024L)
        {
            val$callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.Status.ERROR, FileUtils.QUOTA_EXCEEDED_ERR));
            return;
        } else
        {
            org.json.JSONObject jsonobject = FileUtils.access$300(FileUtils.this, val$fstype);
            val$callbackContext.success(jsonobject);
            return;
        }
    }

    s()
    {
        this$0 = final_fileutils;
        val$size = l;
        val$callbackContext = callbackcontext;
        val$fstype = I.this;
        super();
    }
}
