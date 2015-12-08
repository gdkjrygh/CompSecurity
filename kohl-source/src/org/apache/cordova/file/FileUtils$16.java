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
    final String val$fname;

    public void run()
        throws JSONException, IOException
    {
        org.json.JSONObject jsonobject = FileUtils.access$600(FileUtils.this, val$fname);
        val$callbackContext.success(jsonobject);
    }

    eOp()
    {
        this$0 = final_fileutils;
        val$fname = s;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
