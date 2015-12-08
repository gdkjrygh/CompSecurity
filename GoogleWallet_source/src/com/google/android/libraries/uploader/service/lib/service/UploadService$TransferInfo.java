// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;

import android.net.Uri;
import com.google.common.base.Preconditions;
import com.google.uploader.client.HttpResponse;
import com.google.uploader.client.Transfer;
import com.google.uploader.client.TransferException;

// Referenced classes of package com.google.android.libraries.uploader.service.lib.service:
//            UploadService

static final class uri
{

    private TransferException exception;
    private HttpResponse response;
    private long totalBytes;
    private Transfer transfer;
    private String uploadSessionId;
    private Uri uri;

    public final void completeTransfer(HttpResponse httpresponse)
    {
        boolean flag;
        if (exception == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        response = httpresponse;
    }

    public final void completeTransfer(TransferException transferexception)
    {
        boolean flag;
        if (response == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        exception = transferexception;
    }

    public final HttpResponse getHttpResponse()
    {
        return response;
    }

    public final double getPercentDone()
    {
        return (double)transfer.getBytesUploaded() / (double)totalBytes;
    }

    public final String getSessionId()
    {
        return uploadSessionId;
    }

    public final Transfer getTransfer()
    {
        return transfer;
    }

    public final TransferException getTransferException()
    {
        return exception;
    }

    public (long l, Transfer transfer1, String s, Uri uri1)
    {
        totalBytes = l;
        transfer = (Transfer)Preconditions.checkNotNull(transfer1);
        uploadSessionId = (String)Preconditions.checkNotNull(s);
        uri = (Uri)Preconditions.checkNotNull(uri1);
    }
}
