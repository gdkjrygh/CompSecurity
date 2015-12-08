// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import java.net.MalformedURLException;
import org.apache.cordova.CallbackContext;

// Referenced classes of package org.apache.cordova.file:
//            FileUtils, NoModificationAllowedException, InvalidModificationException

class val.callbackContext
    implements eOp
{

    final FileUtils this$0;
    final CallbackContext val$callbackContext;
    final String val$fname;

    public void run()
        throws NoModificationAllowedException, InvalidModificationException, MalformedURLException
    {
        if (FileUtils.access$800(FileUtils.this, val$fname))
        {
            val$callbackContext.success();
            return;
        } else
        {
            val$callbackContext.error(FileUtils.NO_MODIFICATION_ALLOWED_ERR);
            return;
        }
    }

    cationException()
    {
        this$0 = final_fileutils;
        val$fname = s;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
