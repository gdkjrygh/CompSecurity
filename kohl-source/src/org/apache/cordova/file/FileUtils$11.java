// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import java.io.IOException;
import org.apache.cordova.CallbackContext;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova.file:
//            FileUtils

class val.callbackContext
    implements eOp
{

    final FileUtils this$0;
    final CallbackContext val$callbackContext;

    public void run()
        throws IOException, JSONException
    {
        val$callbackContext.success(FileUtils.access$100(FileUtils.this));
    }

    eOp()
    {
        this$0 = final_fileutils;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
