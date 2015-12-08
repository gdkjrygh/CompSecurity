// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import java.io.IOException;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova.file:
//            FileUtils, FileExistsException, TypeMismatchException, EncodingException

class val.callbackContext
    implements eOp
{

    final FileUtils this$0;
    final JSONArray val$args;
    final CallbackContext val$callbackContext;
    final String val$dirname;
    final String val$path;

    public void run()
        throws FileExistsException, IOException, TypeMismatchException, EncodingException, JSONException
    {
        org.json.JSONObject jsonobject = FileUtils.access$700(FileUtils.this, val$dirname, val$path, val$args.optJSONObject(2), false);
        val$callbackContext.success(jsonobject);
    }

    tion()
    {
        this$0 = final_fileutils;
        val$dirname = s;
        val$path = s1;
        val$args = jsonarray;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
