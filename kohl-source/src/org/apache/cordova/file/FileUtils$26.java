// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

// Referenced classes of package org.apache.cordova.file:
//            FileUtils

class val.callbackContext
    implements adFileCallback
{

    final FileUtils this$0;
    final CallbackContext val$callbackContext;
    final String val$encoding;
    final int val$resultType;

    public void handleData(InputStream inputstream, String s)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = new byte[8192];
_L7:
        int i = inputstream.read(abyte0, 0, 8192);
        if (i > 0) goto _L2; else goto _L1
_L1:
        val$resultType;
        JVM INSTR lookupswitch 3: default 243
    //                   1: 184
    //                   6: 206
    //                   7: 224;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_224;
_L3:
        inputstream = Base64.encode(bytearrayoutputstream.toByteArray(), 2);
        inputstream = (new StringBuilder()).append("data:").append(s).append(";base64,").append(new String(inputstream, "US-ASCII")).toString();
        inputstream = new PluginResult(org.apache.cordova.Status.OK, inputstream);
_L8:
        val$callbackContext.sendPluginResult(inputstream);
        return;
_L2:
        try
        {
            bytearrayoutputstream.write(abyte0, 0, i);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.d("FileUtils", inputstream.getLocalizedMessage());
            val$callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.Status.IO_EXCEPTION, FileUtils.NOT_READABLE_ERR));
            return;
        }
          goto _L7
_L4:
        inputstream = new PluginResult(org.apache.cordova.Status.OK, bytearrayoutputstream.toString(val$encoding));
          goto _L8
_L5:
        inputstream = new PluginResult(org.apache.cordova.Status.OK, bytearrayoutputstream.toByteArray());
          goto _L8
        inputstream = new PluginResult(org.apache.cordova.Status.OK, bytearrayoutputstream.toByteArray(), true);
          goto _L8
    }

    s()
    {
        this$0 = final_fileutils;
        val$resultType = i;
        val$encoding = s;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
