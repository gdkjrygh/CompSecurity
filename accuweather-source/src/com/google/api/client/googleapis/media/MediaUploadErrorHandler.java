// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.media;

import com.google.api.client.http.HttpIOExceptionHandler;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.api.client.googleapis.media:
//            MediaHttpUploader

class MediaUploadErrorHandler
    implements HttpUnsuccessfulResponseHandler, HttpIOExceptionHandler
{

    static final Logger LOGGER = Logger.getLogger(com/google/api/client/googleapis/media/MediaUploadErrorHandler.getName());
    private final HttpIOExceptionHandler originalIOExceptionHandler;
    private final HttpUnsuccessfulResponseHandler originalUnsuccessfulHandler;
    private final MediaHttpUploader uploader;

    public MediaUploadErrorHandler(MediaHttpUploader mediahttpuploader, HttpRequest httprequest)
    {
        uploader = (MediaHttpUploader)Preconditions.checkNotNull(mediahttpuploader);
        originalIOExceptionHandler = httprequest.getIOExceptionHandler();
        originalUnsuccessfulHandler = httprequest.getUnsuccessfulResponseHandler();
        httprequest.setIOExceptionHandler(this);
        httprequest.setUnsuccessfulResponseHandler(this);
    }

    public boolean handleIOException(HttpRequest httprequest, boolean flag)
        throws IOException
    {
        if (originalIOExceptionHandler != null && originalIOExceptionHandler.handleIOException(httprequest, flag))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            try
            {
                uploader.serverErrorCallback();
            }
            // Misplaced declaration of an exception variable
            catch (HttpRequest httprequest)
            {
                LOGGER.log(Level.WARNING, "exception thrown while calling server callback", httprequest);
                return flag;
            }
        }
        return flag;
    }

    public boolean handleResponse(HttpRequest httprequest, HttpResponse httpresponse, boolean flag)
        throws IOException
    {
        boolean flag1;
        if (originalUnsuccessfulHandler != null && originalUnsuccessfulHandler.handleResponse(httprequest, httpresponse, flag))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && flag && httpresponse.getStatusCode() / 100 == 5)
        {
            try
            {
                uploader.serverErrorCallback();
            }
            // Misplaced declaration of an exception variable
            catch (HttpRequest httprequest)
            {
                LOGGER.log(Level.WARNING, "exception thrown while calling server callback", httprequest);
                return flag1;
            }
        }
        return flag1;
    }

}
