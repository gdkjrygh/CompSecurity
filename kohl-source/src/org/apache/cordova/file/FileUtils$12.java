// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import org.apache.cordova.CallbackContext;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova.file:
//            FileUtils

class val.callbackContext
    implements Runnable
{

    final FileUtils this$0;
    final CallbackContext val$callbackContext;

    public void run()
    {
        try
        {
            val$callbackContext.success(FileUtils.access$200(FileUtils.this));
            return;
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
    }

    ()
    {
        this$0 = final_fileutils;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
