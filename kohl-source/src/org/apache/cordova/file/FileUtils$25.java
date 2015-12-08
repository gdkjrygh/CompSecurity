// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import org.apache.cordova.CallbackContext;

// Referenced classes of package org.apache.cordova.file:
//            FileUtils, EncodingException, FileExistsException, NoModificationAllowedException, 
//            InvalidModificationException, TypeMismatchException

class val.callbackContext
    implements Runnable
{

    final FileUtils this$0;
    final CallbackContext val$callbackContext;
    final eOp val$f;

    public void run()
    {
        try
        {
            val$f.run();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            if (exception instanceof EncodingException)
            {
                val$callbackContext.error(FileUtils.ENCODING_ERR);
                return;
            }
            if (exception instanceof FileNotFoundException)
            {
                val$callbackContext.error(FileUtils.NOT_FOUND_ERR);
                return;
            }
            if (exception instanceof FileExistsException)
            {
                val$callbackContext.error(FileUtils.PATH_EXISTS_ERR);
                return;
            }
            if (exception instanceof NoModificationAllowedException)
            {
                val$callbackContext.error(FileUtils.NO_MODIFICATION_ALLOWED_ERR);
                return;
            }
            if (exception instanceof InvalidModificationException)
            {
                val$callbackContext.error(FileUtils.INVALID_MODIFICATION_ERR);
                return;
            }
            if (exception instanceof MalformedURLException)
            {
                val$callbackContext.error(FileUtils.ENCODING_ERR);
                return;
            }
            if (exception instanceof IOException)
            {
                val$callbackContext.error(FileUtils.INVALID_MODIFICATION_ERR);
                return;
            }
            if (exception instanceof EncodingException)
            {
                val$callbackContext.error(FileUtils.ENCODING_ERR);
                return;
            }
            if (exception instanceof TypeMismatchException)
            {
                val$callbackContext.error(FileUtils.TYPE_MISMATCH_ERR);
                return;
            } else
            {
                val$callbackContext.error(FileUtils.UNKNOWN_ERR);
                return;
            }
        }
    }

    eOp()
    {
        this$0 = final_fileutils;
        val$f = eop;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
