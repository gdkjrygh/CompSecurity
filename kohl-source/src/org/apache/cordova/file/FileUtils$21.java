// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import java.io.IOException;
import org.apache.cordova.CallbackContext;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova.file:
//            FileUtils, NoModificationAllowedException, InvalidModificationException, EncodingException, 
//            FileExistsException

class val.callbackContext
    implements eOp
{

    final FileUtils this$0;
    final CallbackContext val$callbackContext;
    final String val$fname;
    final String val$newName;
    final String val$newParent;

    public void run()
        throws JSONException, NoModificationAllowedException, IOException, InvalidModificationException, EncodingException, FileExistsException
    {
        org.json.JSONObject jsonobject = FileUtils.access$1000(FileUtils.this, val$fname, val$newParent, val$newName, true);
        val$callbackContext.success(jsonobject);
    }

    eption()
    {
        this$0 = final_fileutils;
        val$fname = s;
        val$newParent = s1;
        val$newName = s2;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
