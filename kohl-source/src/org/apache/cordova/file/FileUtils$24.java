// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import org.apache.cordova.CallbackContext;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova.file:
//            FileUtils

class val.callbackContext
    implements eOp
{

    final FileUtils this$0;
    final CallbackContext val$callbackContext;
    final String val$localURLstr;

    public void run()
        throws FileNotFoundException, JSONException, MalformedURLException
    {
        String s = filesystemPathForURL(val$localURLstr);
        val$callbackContext.success(s);
    }

    eOp()
    {
        this$0 = final_fileutils;
        val$localURLstr = s;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
